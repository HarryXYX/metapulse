package com.linkedin.datahub.graphql.resolvers.masterdata;

import static com.linkedin.datahub.graphql.resolvers.ResolverUtils.*;

import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.generated.DataConnection;
import com.linkedin.datahub.graphql.generated.DataConnectionStatus;
import com.linkedin.datahub.graphql.generated.DataConnectionType;
import com.linkedin.datahub.graphql.generated.ListDataConnectionsInput;
import com.linkedin.datahub.graphql.generated.ListDataConnectionsResult;
import com.linkedin.metadata.service.ingestiondata.DataConnectionService;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

/**
 * Resolver for listing data connections.
 */
@Slf4j
public class ListDataConnectionsResolver
    implements DataFetcher<CompletableFuture<ListDataConnectionsResult>> {

  private static final Integer DEFAULT_START = 0;
  private static final Integer DEFAULT_COUNT = 20;

  private final DataConnectionService dataConnectionService;

  public ListDataConnectionsResolver(DataConnectionService dataConnectionService) {
    this.dataConnectionService = dataConnectionService;
  }

  @Override
  public CompletableFuture<ListDataConnectionsResult> get(
      final DataFetchingEnvironment environment) {

    final QueryContext context = environment.getContext();
    final ListDataConnectionsInput input =
        bindArgument(environment.getArgument("input"), ListDataConnectionsInput.class);

    final Integer start = input.getStart() == null ? DEFAULT_START : input.getStart();
    final Integer count = input.getCount() == null ? DEFAULT_COUNT : input.getCount();

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          try {
            List<com.linkedin.metadata.service.ingestiondata.model.DataConnection> connections =
                dataConnectionService.getAllConnections();

            // Filter by status if specified
            if (input.getStatus() != null) {
              String statusFilter = input.getStatus().name();
              connections =
                  connections.stream()
                      .filter(c -> statusFilter.equals(c.getStatus()))
                      .collect(Collectors.toList());
            }

            // Filter by query if specified
            if (input.getQuery() != null && !input.getQuery().isEmpty()) {
              String query = input.getQuery().toLowerCase();
              connections =
                  connections.stream()
                      .filter(
                          c ->
                              c.getConnectionName().toLowerCase().contains(query)
                                  || c.getHost().toLowerCase().contains(query)
                                  || c.getDatabaseName().toLowerCase().contains(query))
                      .collect(Collectors.toList());
            }

            int total = connections.size();

            // Apply pagination
            List<com.linkedin.metadata.service.ingestiondata.model.DataConnection> paged =
                connections.stream().skip(start).limit(count).collect(Collectors.toList());

            // Map to GraphQL types
            List<DataConnection> graphqlConnections =
                paged.stream().map(this::mapToGraphQL).collect(Collectors.toList());

            ListDataConnectionsResult result = new ListDataConnectionsResult();
            result.setStart(start);
            result.setCount(graphqlConnections.size());
            result.setTotal(total);
            result.setConnections(graphqlConnections);

            return result;
          } catch (Exception e) {
            log.error("Failed to list data connections", e);
            throw new RuntimeException("Failed to list data connections: " + e.getMessage(), e);
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }

  private DataConnection mapToGraphQL(
      com.linkedin.metadata.service.ingestiondata.model.DataConnection entity) {
    DataConnection result = new DataConnection();
    result.setId(entity.getId());
    result.setIngestionSourceUrn(entity.getIngestionSourceUrn());
    result.setConnectionName(entity.getConnectionName());
    result.setConnectionType(DataConnectionType.valueOf(entity.getConnectionType().toUpperCase()));
    result.setHost(entity.getHost());
    result.setPort(entity.getPort());
    result.setDatabaseName(entity.getDatabaseName());
    result.setUsername(entity.getUsername());
    result.setUseSsl(entity.getUseSsl());
    result.setSslMode(entity.getSslMode());
    result.setStatus(
        entity.getStatus() != null
            ? DataConnectionStatus.valueOf(entity.getStatus())
            : DataConnectionStatus.ACTIVE);
    if (entity.getLastTestAt() != null) {
      result.setLastTestAt(entity.getLastTestAt().getTime());
    }
    result.setLastTestResult(entity.getLastTestResult());
    result.setLastTestMessage(entity.getLastTestMessage());
    if (entity.getCreatedAt() != null) {
      result.setCreatedAt(entity.getCreatedAt().getTime());
    }
    result.setCreatedBy(entity.getCreatedBy());
    return result;
  }
}
