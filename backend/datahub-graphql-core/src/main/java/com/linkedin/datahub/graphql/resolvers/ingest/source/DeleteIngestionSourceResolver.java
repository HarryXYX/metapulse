package com.linkedin.datahub.graphql.resolvers.ingest.source;

import com.linkedin.common.urn.Urn;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.exception.AuthorizationException;
import com.linkedin.datahub.graphql.resolvers.ingest.IngestionAuthUtils;
import com.linkedin.entity.client.EntityClient;
import com.linkedin.metadata.service.ingestiondata.DataConnectionService;
import com.linkedin.metadata.service.ingestiondata.model.DataConnection;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import lombok.extern.slf4j.Slf4j;

/**
 * Resolver responsible for hard deleting a particular DataHub Ingestion Source. Requires
 * MANAGE_INGESTION privilege.
 *
 * This resolver also cleans up associated data:
 * - Deletes the corresponding data_connection record
 */
@Slf4j
public class DeleteIngestionSourceResolver implements DataFetcher<CompletableFuture<String>> {

  private final EntityClient _entityClient;
  @Nullable
  private final DataConnectionService _dataConnectionService;

  public DeleteIngestionSourceResolver(final EntityClient entityClient) {
    this(entityClient, null);
  }

  public DeleteIngestionSourceResolver(
      final EntityClient entityClient,
      @Nullable final DataConnectionService dataConnectionService) {
    _entityClient = entityClient;
    _dataConnectionService = dataConnectionService;
  }

  @Override
  public CompletableFuture<String> get(final DataFetchingEnvironment environment) throws Exception {
    final QueryContext context = environment.getContext();
    if (IngestionAuthUtils.canManageIngestion(context)) {
      final String ingestionSourceUrn = environment.getArgument("urn");
      final Urn urn = Urn.createFromString(ingestionSourceUrn);
      return GraphQLConcurrencyUtils.supplyAsync(
          () -> {
            try {
              // 1. Delete associated data_connection record if service is available
              if (_dataConnectionService != null) {
                try {
                  Optional<DataConnection> connection =
                      _dataConnectionService.getConnectionByIngestionSourceUrn(ingestionSourceUrn);
                  if (connection.isPresent()) {
                    Long connectionId = connection.get().getId();
                    log.info("Deleting data_connection record: id={}, urn={}",
                        connectionId, ingestionSourceUrn);
                    _dataConnectionService.deleteConnection(connectionId);
                    log.info("Successfully deleted data_connection record: id={}", connectionId);
                  } else {
                    log.info("No data_connection record found for urn: {}", ingestionSourceUrn);
                  }
                } catch (Exception e) {
                  log.warn("Failed to delete data_connection for urn {}: {}",
                      ingestionSourceUrn, e.getMessage());
                  // Continue with IngestionSource deletion even if data_connection deletion fails
                }
              }

              // 2. Delete the IngestionSource entity
              _entityClient.deleteEntity(context.getOperationContext(), urn);
              log.info("Successfully deleted IngestionSource: {}", ingestionSourceUrn);

              return ingestionSourceUrn;
            } catch (Exception e) {
              throw new RuntimeException(
                  String.format(
                      "Failed to perform delete against ingestion source with urn %s",
                      ingestionSourceUrn),
                  e);
            }
          },
          this.getClass().getSimpleName(),
          "get");
    }
    throw new AuthorizationException(
        "Unauthorized to perform this action. Please contact your DataHub administrator.");
  }
}
