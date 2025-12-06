package com.linkedin.datahub.graphql.resolvers.masterdata;

import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.generated.ExternalColumnInfo;
import com.linkedin.datahub.graphql.generated.ExternalTableInfo;
import com.linkedin.metadata.service.ingestiondata.DataConnectionService;
import com.linkedin.metadata.service.ingestiondata.model.ColumnInfo;
import com.linkedin.metadata.service.ingestiondata.model.DataConnection;
import com.linkedin.metadata.service.ingestiondata.model.TableInfo;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

/**
 * Resolver for getting tables from a data connection.
 */
@Slf4j
public class GetDataConnectionTablesResolver
    implements DataFetcher<CompletableFuture<List<ExternalTableInfo>>> {

  private final DataConnectionService dataConnectionService;

  public GetDataConnectionTablesResolver(DataConnectionService dataConnectionService) {
    this.dataConnectionService = dataConnectionService;
  }

  @Override
  public CompletableFuture<List<ExternalTableInfo>> get(final DataFetchingEnvironment environment) {

    final QueryContext context = environment.getContext();
    final Long connectionId = environment.getArgument("connectionId");

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          try {
            Optional<DataConnection> connectionOpt =
                dataConnectionService.getConnection(connectionId);
            if (connectionOpt.isEmpty()) {
              throw new RuntimeException("Connection not found: " + connectionId);
            }

            DataConnection connection = connectionOpt.get();
            List<TableInfo> tables = dataConnectionService.getTables(connection);

            return tables.stream().map(this::mapToGraphQL).collect(Collectors.toList());

          } catch (Exception e) {
            log.error("Failed to get tables for connection: {}", connectionId, e);
            throw new RuntimeException("Failed to get tables: " + e.getMessage(), e);
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }

  private ExternalTableInfo mapToGraphQL(TableInfo entity) {
    ExternalTableInfo result = new ExternalTableInfo();
    result.setTableName(entity.getTableName());
    result.setSchemaName(entity.getSchemaName());
    result.setDatabaseName(entity.getDatabaseName());
    result.setTableType(entity.getTableType());
    result.setComment(entity.getComment());
    result.setEstimatedRowCount(entity.getEstimatedRowCount());

    if (entity.getPrimaryKeys() != null) {
      result.setPrimaryKeys(new ArrayList<>(entity.getPrimaryKeys()));
    }

    if (entity.getColumns() != null) {
      result.setColumns(
          entity.getColumns().stream()
              .map(this::mapColumnToGraphQL)
              .collect(Collectors.toList()));
    }

    return result;
  }

  private ExternalColumnInfo mapColumnToGraphQL(ColumnInfo entity) {
    ExternalColumnInfo result = new ExternalColumnInfo();
    result.setName(entity.getName());
    result.setDataType(entity.getDataType());
    result.setLength(entity.getLength());
    result.setPrecision(entity.getPrecision());
    result.setScale(entity.getScale());
    result.setNullable(entity.getNullable());
    result.setDefaultValue(entity.getDefaultValue());
    result.setComment(entity.getComment());
    result.setPrimaryKey(entity.getPrimaryKey());
    result.setAutoIncrement(entity.getAutoIncrement());
    return result;
  }
}
