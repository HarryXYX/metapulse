package com.linkedin.datahub.graphql.resolvers.taggroup;

import static com.linkedin.datahub.graphql.resolvers.ResolverUtils.*;
import static com.linkedin.datahub.graphql.resolvers.mutate.MutationUtils.*;
import static com.linkedin.metadata.Constants.*;

import com.linkedin.data.template.SetMode;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.authorization.AuthorizationUtils;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.exception.AuthorizationException;
import com.linkedin.datahub.graphql.generated.CreateTagGroupInput;
import com.linkedin.datahub.graphql.generated.OwnerEntityType;
import com.linkedin.datahub.graphql.resolvers.mutate.util.OwnerUtils;
import com.linkedin.entity.client.EntityClient;
import com.linkedin.metadata.entity.EntityService;
import com.linkedin.metadata.key.TagGroupKey;
import com.linkedin.metadata.utils.EntityKeyUtils;
import com.linkedin.mxe.MetadataChangeProposal;
import com.linkedin.taggroup.TagGroupProperties;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/** Resolver used for creating a new TagGroup on DataHub. Requires the MANAGE_TAGS privilege. */
@Slf4j
@RequiredArgsConstructor
public class CreateTagGroupResolver implements DataFetcher<CompletableFuture<String>> {

  private final EntityClient _entityClient;
  private final EntityService _entityService;

  @Override
  public CompletableFuture<String> get(DataFetchingEnvironment environment) throws Exception {

    final QueryContext context = environment.getContext();
    final CreateTagGroupInput input =
        bindArgument(environment.getArgument("input"), CreateTagGroupInput.class);

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          if (!AuthorizationUtils.canManageTags(context)) {
            throw new AuthorizationException(
                "Unauthorized to perform this action. Please contact your DataHub administrator.");
          }

          try {
            // Create the TagGroup Key
            final TagGroupKey key = new TagGroupKey();

            // Generate a unique ID for the TagGroup based on name or UUID
            final String id =
                input.getName().toLowerCase().replaceAll("\\s+", "-") + "-" + UUID.randomUUID().toString().substring(0, 8);
            key.setName(id);

            if (_entityClient.exists(
                context.getOperationContext(),
                EntityKeyUtils.convertEntityKeyToUrn(key, TAG_GROUP_ENTITY_NAME))) {
              throw new IllegalArgumentException("This TagGroup already exists!");
            }

            // Create the MCP
            final MetadataChangeProposal proposal =
                buildMetadataChangeProposalWithKey(
                    key,
                    TAG_GROUP_ENTITY_NAME,
                    "tagGroupProperties",
                    mapTagGroupProperties(input));
            String tagGroupUrn =
                _entityClient.ingestProposal(context.getOperationContext(), proposal, false);

            OwnerUtils.addCreatorAsOwner(
                context, tagGroupUrn, OwnerEntityType.CORP_USER, _entityService);

            log.info("Successfully created TagGroup with urn: {}", tagGroupUrn);
            return tagGroupUrn;
          } catch (Exception e) {
            log.error("Failed to create TagGroup with name: {}: {}", input.getName(), e.getMessage());
            throw new RuntimeException(
                String.format("Failed to create TagGroup with name: %s", input.getName()), e);
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }

  private TagGroupProperties mapTagGroupProperties(final CreateTagGroupInput input) {
    final TagGroupProperties result = new TagGroupProperties();
    result.setName(input.getName());
    result.setDescription(input.getDescription(), SetMode.IGNORE_NULL);
    result.setColorHex(input.getColorHex(), SetMode.IGNORE_NULL);
    return result;
  }
}
