package com.linkedin.datahub.graphql.resolvers.masterdata;

import static com.linkedin.datahub.graphql.resolvers.ResolverUtils.*;

import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.generated.CreateDataConnectionInput;
import com.linkedin.datahub.graphql.generated.DataConnection;
import com.linkedin.datahub.graphql.generated.DataConnectionStatus;
import com.linkedin.datahub.graphql.generated.DataConnectionType;
import com.linkedin.metadata.service.ingestiondata.DataConnectionService;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;

/**
 * Resolver for creating a data connection.
 */
@Slf4j
public class CreateDataConnectionResolver
    implements DataFetcher<CompletableFuture<DataConnection>> {

  private final DataConnectionService dataConnectionService;

  public CreateDataConnectionResolver(DataConnectionService dataConnectionService) {
    this.dataConnectionService = dataConnectionService;
  }

  @Override
  public CompletableFuture<DataConnection> get(final DataFetchingEnvironment environment) {

    final QueryContext context = environment.getContext();
    final CreateDataConnectionInput input =
        bindArgument(environment.getArgument("input"), CreateDataConnectionInput.class);

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          try {
            // Build entity from input
            com.linkedin.metadata.service.ingestiondata.model.DataConnection entity =
                com.linkedin.metadata.service.ingestiondata.model.DataConnection.builder()
                    .ingestionSourceUrn(input.getIngestionSourceUrn())
                    .connectionName(input.getConnectionName())
                    .connectionType(input.getConnectionType().name())
                    .host(input.getHost())
                    .port(input.getPort())
                    .databaseName(input.getDatabaseName())
                    .username(input.getUsername())
                    .passwordEncrypted(dataConnectionService.encryptPassword(input.getPassword()))
                    .useSsl(input.getUseSsl() != null ? input.getUseSsl() : false)
                    .sslMode(input.getSslMode())
                    .status(
                        com.linkedin.metadata.service.ingestiondata.model.DataConnection.Status
                            .ACTIVE
                            .name())
                    .createdBy(context.getActorUrn())
                    .build();

            // Create connection
            com.linkedin.metadata.service.ingestiondata.model.DataConnection created =
                dataConnectionService.createConnection(entity);

            log.info(
                "Created data connection: id={}, name={}",
                created.getId(),
                created.getConnectionName());

            return mapToGraphQL(created);
          } catch (Exception e) {
            log.error("Failed to create data connection", e);
            throw new RuntimeException("Failed to create data connection: " + e.getMessage(), e);
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
