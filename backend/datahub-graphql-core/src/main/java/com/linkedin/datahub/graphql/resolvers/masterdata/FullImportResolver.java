package com.linkedin.datahub.graphql.resolvers.masterdata;

import static com.linkedin.datahub.graphql.resolvers.ResolverUtils.*;

import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.generated.FullImportInput;
import com.linkedin.datahub.graphql.generated.FullImportResult;
import com.linkedin.datahub.graphql.generated.TableImportResult;
import com.linkedin.metadata.service.ingestiondata.FullImportService;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

/**
 * Resolver for executing full import from external database.
 */
@Slf4j
public class FullImportResolver implements DataFetcher<CompletableFuture<FullImportResult>> {

  private final FullImportService fullImportService;

  public FullImportResolver(FullImportService fullImportService) {
    this.fullImportService = fullImportService;
  }

  @Override
  public CompletableFuture<FullImportResult> get(final DataFetchingEnvironment environment) {

    final QueryContext context = environment.getContext();
    final FullImportInput input =
        bindArgument(environment.getArgument("input"), FullImportInput.class);

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          try {
            log.info(
                "Starting full import for connection: {}, tables: {}",
                input.getConnectionId(),
                input.getTableNames());

            FullImportService.ImportResult result =
                fullImportService.fullImport(input.getConnectionId(), input.getTableNames());

            return mapToGraphQL(result);

          } catch (Exception e) {
            log.error("Failed to execute full import", e);
            FullImportResult errorResult = new FullImportResult();
            errorResult.setConnectionId(input.getConnectionId());
            errorResult.setSuccess(false);
            errorResult.setMessage("Import failed: " + e.getMessage());
            errorResult.setTotalTables(0);
            errorResult.setSuccessTables(0);
            errorResult.setFailedTables(0);
            errorResult.setTableResults(List.of());
            return errorResult;
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }

  private FullImportResult mapToGraphQL(FullImportService.ImportResult result) {
    FullImportResult graphqlResult = new FullImportResult();
    graphqlResult.setConnectionId(result.getConnectionId());
    graphqlResult.setSuccess(result.isSuccess());
    graphqlResult.setMessage(result.getMessage());
    graphqlResult.setTotalTables(result.getTotalTables());
    graphqlResult.setSuccessTables(result.getSuccessTables());
    graphqlResult.setFailedTables(result.getFailedTables());

    List<TableImportResult> tableResults =
        result.getTableResults().stream()
            .map(this::mapTableResultToGraphQL)
            .collect(Collectors.toList());
    graphqlResult.setTableResults(tableResults);

    return graphqlResult;
  }

  private TableImportResult mapTableResultToGraphQL(FullImportService.TableImportResult result) {
    TableImportResult graphqlResult = new TableImportResult();
    graphqlResult.setSourceTable(result.getSourceTable());
    graphqlResult.setMirrorTable(result.getMirrorTable());
    graphqlResult.setSuccess(result.isSuccess());
    graphqlResult.setMessage(result.getMessage());
    graphqlResult.setRowCount(result.getRowCount());
    return graphqlResult;
  }
}
