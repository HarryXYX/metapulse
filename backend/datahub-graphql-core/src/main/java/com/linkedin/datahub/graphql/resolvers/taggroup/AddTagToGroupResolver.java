package com.linkedin.datahub.graphql.resolvers.taggroup;

import com.linkedin.common.urn.Urn;
import com.linkedin.common.urn.UrnUtils;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.authorization.AuthorizationUtils;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.exception.AuthorizationException;
import com.linkedin.datahub.graphql.resolvers.mutate.MutationUtils;
import com.linkedin.entity.client.EntityClient;
import com.linkedin.metadata.Constants;
import com.linkedin.tag.TagGroupAssociation;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;

/** Resolver for adding a Tag to a TagGroup. */
@Slf4j
public class AddTagToGroupResolver implements DataFetcher<CompletableFuture<Boolean>> {

  private final EntityClient _entityClient;

  public AddTagToGroupResolver(final EntityClient entityClient) {
    _entityClient = entityClient;
  }

  @Override
  public CompletableFuture<Boolean> get(final DataFetchingEnvironment environment)
      throws Exception {
    final QueryContext context = environment.getContext();
    final String tagUrnStr = environment.getArgument("tagUrn");
    final String tagGroupUrnStr = environment.getArgument("tagGroupUrn");

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          if (!AuthorizationUtils.canManageTags(context)) {
            throw new AuthorizationException(
                "Unauthorized to perform this action. Please contact your DataHub administrator.");
          }

          try {
            final Urn tagUrn = UrnUtils.getUrn(tagUrnStr);
            final Urn tagGroupUrn = UrnUtils.getUrn(tagGroupUrnStr);

            // Validate that the entities exist
            if (!_entityClient.exists(context.getOperationContext(), tagUrn)) {
              throw new IllegalArgumentException(
                  String.format("Tag with urn %s does not exist", tagUrnStr));
            }

            if (!_entityClient.exists(context.getOperationContext(), tagGroupUrn)) {
              throw new IllegalArgumentException(
                  String.format("TagGroup with urn %s does not exist", tagGroupUrnStr));
            }

            // Validate entity types
            if (!tagUrn.getEntityType().equals(Constants.TAG_ENTITY_NAME)) {
              throw new IllegalArgumentException(
                  String.format("%s is not a valid Tag urn", tagUrnStr));
            }

            if (!tagGroupUrn.getEntityType().equals("tagGroup")) {
              throw new IllegalArgumentException(
                  String.format("%s is not a valid TagGroup urn", tagGroupUrnStr));
            }

            // Create TagGroupAssociation aspect
            TagGroupAssociation association = new TagGroupAssociation();
            association.setTagGroup(tagGroupUrn);

            // Update the Tag entity with the tagGroupAssociation aspect
            // Use MutationUtils to set UI source, which enables synchronous Graph index update
            _entityClient.ingestProposal(
                context.getOperationContext(),
                MutationUtils.buildMetadataChangeProposalWithUrn(
                    tagUrn, "tagGroupAssociation", association),
                false);

            log.info("Successfully added Tag {} to TagGroup {}", tagUrnStr, tagGroupUrnStr);
            return true;

          } catch (Exception e) {
            log.error(
                "Failed to add Tag {} to TagGroup {}: {}",
                tagUrnStr,
                tagGroupUrnStr,
                e.getMessage());
            throw new RuntimeException(
                String.format("Failed to add Tag %s to TagGroup %s", tagUrnStr, tagGroupUrnStr), e);
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }
}
