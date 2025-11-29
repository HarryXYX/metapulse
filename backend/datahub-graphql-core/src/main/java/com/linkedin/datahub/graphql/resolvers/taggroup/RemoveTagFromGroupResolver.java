package com.linkedin.datahub.graphql.resolvers.taggroup;

import static com.linkedin.metadata.Constants.APP_SOURCE;
import static com.linkedin.metadata.Constants.UI_SOURCE;
import static com.linkedin.metadata.utils.SystemMetadataUtils.createDefaultSystemMetadata;

import com.linkedin.common.urn.Urn;
import com.linkedin.common.urn.UrnUtils;
import com.linkedin.data.template.StringMap;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.authorization.AuthorizationUtils;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.exception.AuthorizationException;
import com.linkedin.entity.client.EntityClient;
import com.linkedin.events.metadata.ChangeType;
import com.linkedin.metadata.Constants;
import com.linkedin.mxe.MetadataChangeProposal;
import com.linkedin.mxe.SystemMetadata;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.concurrent.CompletableFuture;
import lombok.extern.slf4j.Slf4j;

/** Resolver for removing a Tag from a TagGroup. */
@Slf4j
public class RemoveTagFromGroupResolver implements DataFetcher<CompletableFuture<Boolean>> {

  private final EntityClient _entityClient;

  public RemoveTagFromGroupResolver(final EntityClient entityClient) {
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

            // Validate entity types
            if (!tagUrn.getEntityType().equals(Constants.TAG_ENTITY_NAME)) {
              throw new IllegalArgumentException(
                  String.format("%s is not a valid Tag urn", tagUrnStr));
            }

            if (!tagGroupUrn.getEntityType().equals("tagGroup")) {
              throw new IllegalArgumentException(
                  String.format("%s is not a valid TagGroup urn", tagGroupUrnStr));
            }

            // Remove the tagGroupAssociation aspect by deleting it
            MetadataChangeProposal proposal = new MetadataChangeProposal();
            proposal.setEntityUrn(tagUrn);
            proposal.setEntityType(Constants.TAG_ENTITY_NAME);
            proposal.setAspectName("tagGroupAssociation");
            proposal.setChangeType(ChangeType.DELETE);

            // Set UI source for synchronous Graph index update
            SystemMetadata systemMetadata = createDefaultSystemMetadata();
            StringMap properties = new StringMap();
            properties.put(APP_SOURCE, UI_SOURCE);
            systemMetadata.setProperties(properties);
            proposal.setSystemMetadata(systemMetadata);

            _entityClient.ingestProposal(context.getOperationContext(), proposal, false);

            log.info("Successfully removed Tag {} from TagGroup {}", tagUrnStr, tagGroupUrnStr);
            return true;

          } catch (Exception e) {
            log.error(
                "Failed to remove Tag {} from TagGroup {}: {}",
                tagUrnStr,
                tagGroupUrnStr,
                e.getMessage());
            throw new RuntimeException(
                String.format(
                    "Failed to remove Tag %s from TagGroup %s", tagUrnStr, tagGroupUrnStr),
                e);
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }
}
