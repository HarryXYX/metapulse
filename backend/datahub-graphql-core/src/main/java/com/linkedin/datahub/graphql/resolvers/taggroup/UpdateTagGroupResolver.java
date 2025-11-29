package com.linkedin.datahub.graphql.resolvers.taggroup;

import static com.linkedin.datahub.graphql.resolvers.ResolverUtils.*;
import static com.linkedin.metadata.Constants.*;

import com.linkedin.common.urn.Urn;
import com.linkedin.common.urn.UrnUtils;
import com.linkedin.data.template.SetMode;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.authorization.AuthorizationUtils;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.exception.AuthorizationException;
import com.linkedin.datahub.graphql.generated.TagGroup;
import com.linkedin.datahub.graphql.generated.TagGroupProperties;
import com.linkedin.datahub.graphql.generated.TagGroupUpdateInput;
import com.linkedin.entity.client.EntityClient;
import com.linkedin.metadata.entity.AspectUtils;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.concurrent.CompletableFuture;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/** Resolver used for updating an existing TagGroup. Requires the MANAGE_TAGS privilege. */
@Slf4j
@RequiredArgsConstructor
public class UpdateTagGroupResolver implements DataFetcher<CompletableFuture<TagGroup>> {

  private final EntityClient _entityClient;

  @Override
  public CompletableFuture<TagGroup> get(DataFetchingEnvironment environment) throws Exception {

    final QueryContext context = environment.getContext();
    final String urnStr = environment.getArgument("urn");
    final TagGroupUpdateInput input =
        bindArgument(environment.getArgument("input"), TagGroupUpdateInput.class);

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

            // Build updated properties
            com.linkedin.taggroup.TagGroupProperties properties =
                new com.linkedin.taggroup.TagGroupProperties();
            if (input.getName() != null) {
              properties.setName(input.getName());
            }
            properties.setDescription(input.getDescription(), SetMode.IGNORE_NULL);
            properties.setColorHex(input.getColorHex(), SetMode.IGNORE_NULL);

            // Update the TagGroup
            _entityClient.ingestProposal(
                context.getOperationContext(),
                AspectUtils.buildMetadataChangeProposal(urn, "tagGroupProperties", properties),
                false);

            log.info("Successfully updated TagGroup with urn: {}", urnStr);

            // Return updated TagGroup
            TagGroup result = new TagGroup();
            result.setUrn(urnStr);
            TagGroupProperties resultProps = new TagGroupProperties();
            resultProps.setName(input.getName());
            resultProps.setDescription(input.getDescription());
            resultProps.setColorHex(input.getColorHex());
            result.setProperties(resultProps);
            return result;

          } catch (Exception e) {
            log.error("Failed to update TagGroup {}: {}", urnStr, e.getMessage());
            throw new RuntimeException(
                String.format("Failed to update TagGroup %s", urnStr), e);
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }
}
