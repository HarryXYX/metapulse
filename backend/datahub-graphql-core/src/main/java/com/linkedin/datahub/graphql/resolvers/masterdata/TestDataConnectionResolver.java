package com.linkedin.datahub.graphql.resolvers.masterdata;

import static com.linkedin.datahub.graphql.resolvers.ResolverUtils.*;

import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.generated.TestConnectionResult;
import com.linkedin.datahub.graphql.generated.TestDataConnectionInput;
import com.linkedin.metadata.service.ingestiondata.DataConnectionService;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;

/**
 * Resolver for testing a data connection.
 */
@Slf4j
public class TestDataConnectionResolver
    implements DataFetcher<CompletableFuture<TestConnectionResult>> {

  private final DataConnectionService dataConnectionService;

  public TestDataConnectionResolver(DataConnectionService dataConnectionService) {
    this.dataConnectionService = dataConnectionService;
  }

  @Override
  public CompletableFuture<TestConnectionResult> get(final DataFetchingEnvironment environment) {

    final QueryContext context = environment.getContext();
    final TestDataConnectionInput input =
        bindArgument(environment.getArgument("input"), TestDataConnectionInput.class);

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          try {
            DataConnectionService.TestConnectionResult result;

            if (input.getConnectionId() != null) {
              // Test existing connection
              result = dataConnectionService.testConnection(input.getConnectionId());
            } else {
              // Test unsaved connection
              com.linkedin.metadata.service.ingestiondata.model.DataConnection tempConnection =
                  com.linkedin.metadata.service.ingestiondata.model.DataConnection.builder()
                      .connectionType(input.getConnectionType().name())
                      .host(input.getHost())
                      .port(input.getPort())
                      .databaseName(input.getDatabaseName())
                      .username(input.getUsername())
                      .passwordEncrypted(input.getPassword())
                      .useSsl(input.getUseSsl() != null ? input.getUseSsl() : false)
                      .build();

              result = dataConnectionService.testConnection(tempConnection);
            }

            TestConnectionResult graphqlResult = new TestConnectionResult();
            graphqlResult.setSuccess(result.isSuccess());
            graphqlResult.setMessage(result.getMessage());
            return graphqlResult;

          } catch (Exception e) {
            log.error("Failed to test data connection", e);
            TestConnectionResult graphqlResult = new TestConnectionResult();
            graphqlResult.setSuccess(false);
            graphqlResult.setMessage("Test failed: " + e.getMessage());
            return graphqlResult;
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }
}
