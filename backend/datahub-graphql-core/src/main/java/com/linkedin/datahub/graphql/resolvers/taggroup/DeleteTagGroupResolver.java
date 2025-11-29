package com.linkedin.datahub.graphql.resolvers.taggroup;

import static com.linkedin.metadata.Constants.*;

import com.linkedin.common.urn.Urn;
import com.linkedin.common.urn.UrnUtils;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.authorization.AuthorizationUtils;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.exception.AuthorizationException;
import com.linkedin.entity.client.EntityClient;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.concurrent.CompletableFuture;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/** Resolver used for deleting a TagGroup. Requires the MANAGE_TAGS privilege. */
@Slf4j
@RequiredArgsConstructor
public class DeleteTagGroupResolver implements DataFetcher<CompletableFuture<Boolean>> {

  private final EntityClient _entityClient;

  @Override
  public CompletableFuture<Boolean> get(DataFetchingEnvironment environment) throws Exception {

    final QueryContext context = environment.getContext();
    final String urnStr = environment.getArgument("urn");

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          if (!AuthorizationUtils.canManageTags(context)) {
            throw new AuthorizationException(
                "Unauthorized to perform this action. Please contact your DataHub administrator.");
          }

          try {
            final Urn urn = UrnUtils.getUrn(urnStr);

            // Validate entity type
            if (!urn.getEntityType().equals(TAG_GROUP_ENTITY_NAME)) {
              throw new IllegalArgumentException(
                  String.format("%s is not a valid TagGroup urn", urnStr));
            }

            // Check if TagGroup exists
            if (!_entityClient.exists(context.getOperationContext(), urn)) {
              throw new IllegalArgumentException(
                  String.format("TagGroup with urn %s does not exist", urnStr));
            }

            // Delete the TagGroup entity
            _entityClient.deleteEntity(context.getOperationContext(), urn);

            // Also delete references to this TagGroup
            _entityClient.deleteEntityReferences(context.getOperationContext(), urn);

            log.info("Successfully deleted TagGroup with urn: {}", urnStr);
            return true;

          } catch (Exception e) {
            log.error("Failed to delete TagGroup {}: {}", urnStr, e.getMessage());
            throw new RuntimeException(String.format("Failed to delete TagGroup %s", urnStr), e);
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }
}
