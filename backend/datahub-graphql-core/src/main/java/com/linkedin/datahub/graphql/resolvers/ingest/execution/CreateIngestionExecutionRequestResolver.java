package com.linkedin.datahub.graphql.resolvers.ingest.execution;

import static com.linkedin.datahub.graphql.resolvers.ResolverUtils.*;
import static com.linkedin.datahub.graphql.resolvers.mutate.MutationUtils.*;
import static com.linkedin.metadata.Constants.*;

import com.google.common.collect.ImmutableSet;
import com.linkedin.common.urn.Urn;
import com.linkedin.common.urn.UrnUtils;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.exception.AuthorizationException;
import com.linkedin.datahub.graphql.exception.DataHubGraphQLErrorCode;
import com.linkedin.datahub.graphql.exception.DataHubGraphQLException;
import com.linkedin.datahub.graphql.generated.CreateIngestionExecutionRequestInput;
import com.linkedin.datahub.graphql.resolvers.ingest.IngestionAuthUtils;
import com.linkedin.entity.EntityResponse;
import com.linkedin.entity.EnvelopedAspect;
import com.linkedin.entity.client.EntityClient;
import com.linkedin.execution.ExecutionRequestInput;
import com.linkedin.execution.ExecutionRequestResult;
import com.linkedin.execution.ExecutionRequestSource;
import com.linkedin.ingestion.DataHubIngestionSourceInfo;
import com.linkedin.metadata.config.IngestionConfiguration;
import com.linkedin.metadata.key.ExecutionRequestKey;
import com.linkedin.metadata.service.ingestiondata.DataConnectionService;
import com.linkedin.metadata.service.ingestiondata.FullImportService;
import com.linkedin.metadata.service.ingestiondata.model.DataConnection;
import com.linkedin.metadata.utils.EntityKeyUtils;
import com.linkedin.metadata.utils.IngestionUtils;
import com.linkedin.mxe.MetadataChangeProposal;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import lombok.extern.slf4j.Slf4j;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Creates an on-demand ingestion execution request.
 *
 * For supported database sources (MySQL, PostgreSQL, etc.), this resolver will use the
 * FullImportService to directly import data into the master_data database instead of
 * creating an ExecutionRequest for the Python executor.
 */
@Slf4j
public class CreateIngestionExecutionRequestResolver
    implements DataFetcher<CompletableFuture<String>> {

  private static final String RUN_INGEST_TASK_NAME = "RUN_INGEST";
  private static final String MANUAL_EXECUTION_SOURCE_NAME = "MANUAL_INGESTION_SOURCE";
  private static final String RECIPE_ARG_NAME = "recipe";
  private static final String VERSION_ARG_NAME = "version";
  private static final String DEBUG_MODE_ARG_NAME = "debug_mode";

  /** Supported database source types for direct import */
  private static final Set<String> SUPPORTED_DB_SOURCES = Set.of("mysql", "postgres", "postgresql");

  private final EntityClient _entityClient;
  private final IngestionConfiguration _ingestionConfiguration;
  private final DataConnectionService _dataConnectionService;
  private final FullImportService _fullImportService;

  public CreateIngestionExecutionRequestResolver(
      final EntityClient entityClient, final IngestionConfiguration ingestionConfiguration) {
    this(entityClient, ingestionConfiguration, null, null);
  }

  public CreateIngestionExecutionRequestResolver(
      final EntityClient entityClient,
      final IngestionConfiguration ingestionConfiguration,
      @Nullable final DataConnectionService dataConnectionService,
      @Nullable final FullImportService fullImportService) {
    _entityClient = entityClient;
    _ingestionConfiguration = ingestionConfiguration;
    _dataConnectionService = dataConnectionService;
    _fullImportService = fullImportService;
  }

  @Override
  public CompletableFuture<String> get(final DataFetchingEnvironment environment) throws Exception {
    final QueryContext context = environment.getContext();

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          if (IngestionAuthUtils.canManageIngestion(context)) {

            final CreateIngestionExecutionRequestInput input =
                bindArgument(
                    environment.getArgument("input"), CreateIngestionExecutionRequestInput.class);

            try {
              // Fetch the original ingestion source
              final Urn ingestionSourceUrn = Urn.createFromString(input.getIngestionSourceUrn());
              final Map<Urn, EntityResponse> response =
                  _entityClient.batchGetV2(
                      context.getOperationContext(),
                      INGESTION_SOURCE_ENTITY_NAME,
                      ImmutableSet.of(ingestionSourceUrn),
                      ImmutableSet.of(INGESTION_INFO_ASPECT_NAME));

              if (!response.containsKey(ingestionSourceUrn)) {
                throw new DataHubGraphQLException(
                    String.format(
                        "Failed to find ingestion source with urn %s",
                        ingestionSourceUrn.toString()),
                    DataHubGraphQLErrorCode.BAD_REQUEST);
              }

              final EnvelopedAspect envelopedInfo =
                  response.get(ingestionSourceUrn).getAspects().get(INGESTION_INFO_ASPECT_NAME);
              final DataHubIngestionSourceInfo ingestionSourceInfo =
                  new DataHubIngestionSourceInfo(envelopedInfo.getValue().data());

              if (!ingestionSourceInfo.getConfig().hasRecipe()) {
                throw new DataHubGraphQLException(
                    String.format(
                        "Failed to find valid ingestion source with urn %s. Missing recipe",
                        ingestionSourceUrn.toString()),
                    DataHubGraphQLErrorCode.BAD_REQUEST);
              }

              String recipe = ingestionSourceInfo.getConfig().getRecipe();

              // Check if this is a supported database source for direct import
              if (_fullImportService != null && _dataConnectionService != null) {
                String sourceType = getSourceType(recipe);
                if (sourceType != null && SUPPORTED_DB_SOURCES.contains(sourceType.toLowerCase())) {
                  log.info("Using FullImportService for source type: {}, urn: {}", sourceType, ingestionSourceUrn);
                  return executeDirectImport(context, ingestionSourceUrn.toString(), recipe);
                }
              }

              // Fall back to original behavior - create ExecutionRequest
              log.info("Creating ExecutionRequest for ingestion source: {}", ingestionSourceUrn);
              return createExecutionRequest(context, ingestionSourceUrn, ingestionSourceInfo, recipe);

            } catch (Exception e) {
              throw new RuntimeException(
                  String.format("Failed to create new ingestion execution request %s", input), e);
            }
          }
          throw new AuthorizationException(
              "Unauthorized to perform this action. Please contact your DataHub administrator.");
        },
        this.getClass().getSimpleName(),
        "get");
  }

  /**
   * Execute direct import using FullImportService for supported database sources.
   * Creates an ExecutionRequest with result status so the frontend can track progress.
   */
  private String executeDirectImport(
      QueryContext context, String ingestionSourceUrn, String recipe) {

    log.info("Executing direct import for ingestion source: {}", ingestionSourceUrn);

    long startTimeMs = System.currentTimeMillis();

    // Parse recipe to extract connection info
    JSONObject recipeJson = new JSONObject(recipe);
    JSONObject source = recipeJson.getJSONObject("source");
    String sourceType = source.getString("type");
    JSONObject config = source.getJSONObject("config");

    // Extract connection details
    String hostPort = config.optString("host_port", "");
    String[] hostParts = hostPort.split(":");
    String host = hostParts.length > 0 ? hostParts[0] : "";
    int port = hostParts.length > 1 ? Integer.parseInt(hostParts[1]) : getDefaultPort(sourceType);
    String database = config.optString("database", "");
    String username = config.optString("username", "");
    String password = config.optString("password", "");

    log.info("Connection details - type: {}, host: {}, port: {}, database: {}",
        sourceType, host, port, database);

    // Find or create DataConnection
    Optional<DataConnection> existingConnection =
        _dataConnectionService.getConnectionByIngestionSourceUrn(ingestionSourceUrn);

    DataConnection connection;
    if (existingConnection.isPresent()) {
      connection = existingConnection.get();
      log.info("Using existing DataConnection: id={}", connection.getId());
    } else {
      // Create new connection
      connection = DataConnection.builder()
          .ingestionSourceUrn(ingestionSourceUrn)
          .connectionName("Auto-" + database)
          .connectionType(sourceType.toLowerCase())
          .host(host)
          .port(port)
          .databaseName(database)
          .username(username)
          .passwordEncrypted(password) // Note: should encrypt in production
          .useSsl(config.optBoolean("use_ssl", false))
          .status(DataConnection.Status.ACTIVE.name())
          .createdBy(context.getActorUrn())
          .build();
      connection = _dataConnectionService.createConnection(connection);
      log.info("Created new DataConnection: id={}", connection.getId());
    }

    // Execute full import
    FullImportService.ImportResult importResult =
        _fullImportService.fullImport(context.getOperationContext(), connection.getId(), null);

    long durationMs = System.currentTimeMillis() - startTimeMs;

    log.info("Import completed: success={}, message={}, tables={}/{}, duration={}ms",
        importResult.isSuccess(), importResult.getMessage(),
        importResult.getSuccessTables(), importResult.getTotalTables(), durationMs);

    // Create ExecutionRequest with result for frontend tracking
    try {
      return createExecutionRequestWithResult(
          context,
          ingestionSourceUrn,
          recipe,
          importResult,
          startTimeMs,
          durationMs);
    } catch (Exception e) {
      log.error("Failed to create ExecutionRequest record", e);
      // Still return success if import succeeded, just log the error
      if (importResult.isSuccess()) {
        return String.format("urn:li:directImport:%s-%d", connection.getId(), startTimeMs);
      }
      throw new RuntimeException("Import failed: " + importResult.getMessage(), e);
    }
  }

  /**
   * Create an ExecutionRequest with both Input and Result aspects for frontend tracking.
   */
  private String createExecutionRequestWithResult(
      QueryContext context,
      String ingestionSourceUrn,
      String recipe,
      FullImportService.ImportResult importResult,
      long startTimeMs,
      long durationMs) throws Exception {

    // Create ExecutionRequest key
    final ExecutionRequestKey key = new ExecutionRequestKey();
    final UUID uuid = UUID.randomUUID();
    key.setId(uuid.toString());
    final Urn executionRequestUrn =
        EntityKeyUtils.convertEntityKeyToUrn(key, EXECUTION_REQUEST_ENTITY_NAME);
    final Urn sourceUrn = Urn.createFromString(ingestionSourceUrn);

    // Create ExecutionRequestInput
    final ExecutionRequestInput execInput = new ExecutionRequestInput();
    execInput.setTask(RUN_INGEST_TASK_NAME);
    execInput.setSource(
        new ExecutionRequestSource()
            .setType("DIRECT_IMPORT")
            .setIngestionSource(sourceUrn));
    execInput.setRequestedAt(startTimeMs);
    execInput.setActorUrn(UrnUtils.getUrn(context.getActorUrn()));

    Map<String, String> arguments = new HashMap<>();
    arguments.put(RECIPE_ARG_NAME, recipe);
    execInput.setArgs(new StringMap(arguments));

    // Ingest ExecutionRequestInput
    final MetadataChangeProposal inputProposal =
        buildMetadataChangeProposalWithKey(
            key,
            EXECUTION_REQUEST_ENTITY_NAME,
            EXECUTION_REQUEST_INPUT_ASPECT_NAME,
            execInput);
    _entityClient.ingestProposal(context.getOperationContext(), inputProposal, false);

    // Create ExecutionRequestResult
    final ExecutionRequestResult execResult = new ExecutionRequestResult();
    execResult.setStatus(importResult.isSuccess() ? "SUCCESS" : "FAILURE");
    execResult.setStartTimeMs(startTimeMs);
    execResult.setDurationMs(durationMs);

    String report = String.format(
        "Direct Import Result:\n" +
        "- Total Tables: %d\n" +
        "- Success: %d\n" +
        "- Failed: %d\n" +
        "- Message: %s",
        importResult.getTotalTables(),
        importResult.getSuccessTables(),
        importResult.getFailedTables(),
        importResult.getMessage());
    execResult.setReport(report);

    // Ingest ExecutionRequestResult
    final MetadataChangeProposal resultProposal =
        buildMetadataChangeProposalWithKey(
            key,
            EXECUTION_REQUEST_ENTITY_NAME,
            EXECUTION_REQUEST_RESULT_ASPECT_NAME,
            execResult);
    _entityClient.ingestProposal(context.getOperationContext(), resultProposal, false);

    log.info("Created ExecutionRequest: urn={}, status={}",
        executionRequestUrn, execResult.getStatus());

    return executionRequestUrn.toString();
  }

  /**
   * Create ExecutionRequest for sources that don't support direct import.
   */
  private String createExecutionRequest(
      QueryContext context,
      Urn ingestionSourceUrn,
      DataHubIngestionSourceInfo ingestionSourceInfo,
      String recipe) throws Exception {

    final ExecutionRequestKey key = new ExecutionRequestKey();
    final UUID uuid = UUID.randomUUID();
    final String uuidStr = uuid.toString();
    key.setId(uuidStr);
    final Urn executionRequestUrn =
        EntityKeyUtils.convertEntityKeyToUrn(key, EXECUTION_REQUEST_ENTITY_NAME);

    // Build the arguments map.
    final ExecutionRequestInput execInput = new ExecutionRequestInput();
    execInput.setTask(RUN_INGEST_TASK_NAME); // Set the RUN_INGEST task
    execInput.setSource(
        new ExecutionRequestSource()
            .setType(MANUAL_EXECUTION_SOURCE_NAME)
            .setIngestionSource(ingestionSourceUrn));
    execInput.setExecutorId(
        ingestionSourceInfo.getConfig().getExecutorId(), SetMode.IGNORE_NULL);
    execInput.setRequestedAt(System.currentTimeMillis());
    execInput.setActorUrn(UrnUtils.getUrn(context.getActorUrn()));

    Map<String, String> arguments = new HashMap<>();
    String recipeWithRunId = injectRunId(recipe, executionRequestUrn.toString());
    recipeWithRunId = IngestionUtils.injectPipelineName(recipeWithRunId, ingestionSourceUrn.toString());
    arguments.put(RECIPE_ARG_NAME, recipeWithRunId);
    arguments.put(
        VERSION_ARG_NAME,
        ingestionSourceInfo.getConfig().hasVersion()
            ? ingestionSourceInfo.getConfig().getVersion()
            : _ingestionConfiguration.getDefaultCliVersion());
    if (ingestionSourceInfo.getConfig().hasVersion()) {
      arguments.put(VERSION_ARG_NAME, ingestionSourceInfo.getConfig().getVersion());
    }
    String debugMode = "false";
    if (ingestionSourceInfo.getConfig().hasDebugMode()) {
      debugMode = ingestionSourceInfo.getConfig().isDebugMode() ? "true" : "false";
    }
    if (ingestionSourceInfo.getConfig().hasExtraArgs()) {
      arguments.putAll(ingestionSourceInfo.getConfig().getExtraArgs());
    }
    arguments.put(DEBUG_MODE_ARG_NAME, debugMode);
    execInput.setArgs(new StringMap(arguments));

    final MetadataChangeProposal proposal =
        buildMetadataChangeProposalWithKey(
            key,
            EXECUTION_REQUEST_ENTITY_NAME,
            EXECUTION_REQUEST_INPUT_ASPECT_NAME,
            execInput);
    return _entityClient.ingestProposal(context.getOperationContext(), proposal, false);
  }

  /**
   * Extract source type from recipe JSON.
   */
  private String getSourceType(String recipe) {
    try {
      JSONObject obj = new JSONObject(recipe);
      if (obj.has("source") && obj.getJSONObject("source").has("type")) {
        return obj.getJSONObject("source").getString("type");
      }
    } catch (JSONException e) {
      log.warn("Failed to parse recipe to get source type", e);
    }
    return null;
  }

  /**
   * Get default port for database type.
   */
  private int getDefaultPort(String sourceType) {
    switch (sourceType.toLowerCase()) {
      case "mysql":
        return 3306;
      case "postgres":
      case "postgresql":
        return 5432;
      case "oracle":
        return 1521;
      case "sqlserver":
      case "mssql":
        return 1433;
      default:
        return 3306;
    }
  }

  /**
   * Injects an override run id into a recipe for tracking purposes. Any existing run id will be
   * overwritten.
   *
   * <p>TODO: Determine if this should be handled in the executor itself.
   *
   * @param runId the run id to place into the recipe
   * @return a modified recipe JSON string
   */
  private String injectRunId(final String originalJson, final String runId) {
    try {
      JSONObject obj = new JSONObject(originalJson);
      obj.put("run_id", runId);
      return obj.toString();
    } catch (JSONException e) {
      // This should ideally never be hit.
      throw new IllegalArgumentException(
          "Failed to create execution request: Invalid recipe json provided.");
    }
  }
}
