package com.linkedin.datahub.graphql.resolvers.taggroup;

import com.linkedin.common.urn.Urn;
import com.linkedin.common.urn.UrnUtils;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.authorization.AuthorizationUtils;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.exception.AuthorizationException;
import com.linkedin.entity.client.EntityClient;
import com.linkedin.metadata.Constants;
import com.linkedin.metadata.entity.AspectUtils;
import com.linkedin.tag.TagGroupAssociation;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

/**
 * Resolver for batch adding Tags to a TagGroup.
 */
@Slf4j
public class BatchAddTagsToGroupResolver implements DataFetcher<CompletableFuture<Boolean>> {

  private final EntityClient _entityClient;

  public BatchAddTagsToGroupResolver(final EntityClient entityClient) {
    _entityClient = entityClient;
  }

  @Override
  public CompletableFuture<Boolean> get(final DataFetchingEnvironment environment)
      throws Exception {
    final QueryContext context = environment.getContext();
    final List<String> tagUrnStrs = environment.getArgument("tagUrns");
    final String tagGroupUrnStr = environment.getArgument("tagGroupUrn");

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          if (!AuthorizationUtils.canManageTags(context)) {
            throw new AuthorizationException(
                "Unauthorized to perform this action. Please contact your DataHub administrator.");
          }

          try {
            final Urn tagGroupUrn = UrnUtils.getUrn(tagGroupUrnStr);
            final List<Urn> tagUrns =
                tagUrnStrs.stream().map(UrnUtils::getUrn).collect(Collectors.toList());

            // Validate TagGroup exists
            if (!_entityClient.exists(context.getOperationContext(), tagGroupUrn)) {
              throw new IllegalArgumentException(
                  String.format("TagGroup with urn %s does not exist", tagGroupUrnStr));
            }

            // Validate TagGroup entity type
            if (!tagGroupUrn.getEntityType().equals("tagGroup")) {
              throw new IllegalArgumentException(
                  String.format("%s is not a valid TagGroup urn", tagGroupUrnStr));
            }

            // Validate and add each Tag
            for (Urn tagUrn : tagUrns) {
              // Validate that the Tag exists
              if (!_entityClient.exists(context.getOperationContext(), tagUrn)) {
                log.warn("Tag with urn {} does not exist, skipping", tagUrn);
                continue;
              }

              // Validate entity type
              if (!tagUrn.getEntityType().equals(Constants.TAG_ENTITY_NAME)) {
                log.warn("{} is not a valid Tag urn, skipping", tagUrn);
                continue;
              }

              // Create TagGroupAssociation aspect
              TagGroupAssociation association = new TagGroupAssociation();
              association.setTagGroup(tagGroupUrn);

              // Update the Tag entity with the tagGroupAssociation aspect
              _entityClient.ingestProposal(
                  context.getOperationContext(),
                  AspectUtils.buildMetadataChangeProposal(
                      tagUrn, "tagGroupAssociation", association),
                  false);
            }

            log.info(
                "Successfully added {} Tags to TagGroup {}", tagUrns.size(), tagGroupUrnStr);
            return true;

          } catch (Exception e) {
            log.error(
                "Failed to batch add Tags to TagGroup {}: {}", tagGroupUrnStr, e.getMessage());
            throw new RuntimeException(
                String.format("Failed to batch add Tags to TagGroup %s", tagGroupUrnStr), e);
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }
}
