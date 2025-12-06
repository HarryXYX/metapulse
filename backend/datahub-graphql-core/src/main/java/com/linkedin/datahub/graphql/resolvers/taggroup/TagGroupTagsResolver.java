package com.linkedin.datahub.graphql.resolvers.taggroup;

import static com.linkedin.datahub.graphql.authorization.AuthorizationUtils.canView;

import com.linkedin.common.EntityRelationship;
import com.linkedin.common.EntityRelationships;
import com.linkedin.common.urn.Urn;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.concurrency.GraphQLConcurrencyUtils;
import com.linkedin.datahub.graphql.generated.EntityRelationshipsResult;
import com.linkedin.datahub.graphql.generated.RelationshipDirection;
import com.linkedin.datahub.graphql.generated.TagGroup;
import com.linkedin.datahub.graphql.types.common.mappers.AuditStampMapper;
import com.linkedin.datahub.graphql.types.common.mappers.UrnToEntityMapper;
import com.linkedin.metadata.graph.GraphClient;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;

/**
 * Resolver for the tags field of TagGroup entity. Returns all Tags that belong to this TagGroup.
 */
@Slf4j
public class TagGroupTagsResolver
    implements DataFetcher<CompletableFuture<EntityRelationshipsResult>> {

  private final GraphClient _graphClient;

  public TagGroupTagsResolver(final GraphClient graphClient) {
    _graphClient = graphClient;
  }

  @Override
  public CompletableFuture<EntityRelationshipsResult> get(final DataFetchingEnvironment environment)
      throws Exception {
    final QueryContext context = environment.getContext();
    final TagGroup tagGroup = environment.getSource();
    final String tagGroupUrn = tagGroup.getUrn();

    return GraphQLConcurrencyUtils.supplyAsync(
        () -> {
          try {
            final Urn urn = Urn.createFromString(tagGroupUrn);

            log.info("Querying BelongsToGroup relationships for TagGroup: {}", tagGroupUrn);

            // Query incoming "BelongsToGroup" relationships (Tags that belong to this TagGroup)
            final EntityRelationships entityRelationships =
                _graphClient.getRelatedEntities(
                    tagGroupUrn,
                    Collections.singleton("BelongsToGroup"),
                    com.linkedin.metadata.query.filter.RelationshipDirection.INCOMING,
                    0,
                    1000,
                    context.getActorUrn());

            log.info(
                "Found {} relationships for TagGroup {}: total={}, count={}",
                entityRelationships.getRelationships().size(),
                tagGroupUrn,
                entityRelationships.getTotal(),
                entityRelationships.getCount());

            // Map to GraphQL result
            return mapEntityRelationships(context, entityRelationships);

          } catch (Exception e) {
            log.error("Failed to resolve tags for TagGroup {}: {}", tagGroupUrn, e.getMessage(), e);
            throw new RuntimeException(
                String.format("Failed to resolve tags for TagGroup %s", tagGroupUrn), e);
          }
        },
        this.getClass().getSimpleName(),
        "get");
  }

  private EntityRelationshipsResult mapEntityRelationships(
      final QueryContext context, final EntityRelationships entityRelationships) {
    final EntityRelationshipsResult result = new EntityRelationshipsResult();

    // Filter to only viewable entities
    List<EntityRelationship> viewable =
        entityRelationships.getRelationships().stream()
            .filter(rel -> canView(context.getOperationContext(), rel.getEntity()))
            .collect(Collectors.toList());

    result.setStart(entityRelationships.getStart());
    result.setCount(viewable.size());
    result.setTotal(
        entityRelationships.getTotal() - (entityRelationships.getCount() - viewable.size()));
    result.setRelationships(
        viewable.stream()
            .map(entityRelationship -> mapEntityRelationship(context, entityRelationship))
            .collect(Collectors.toList()));

    return result;
  }

  private com.linkedin.datahub.graphql.generated.EntityRelationship mapEntityRelationship(
      final QueryContext context, final EntityRelationship entityRelationship) {
    final com.linkedin.datahub.graphql.generated.EntityRelationship result =
        new com.linkedin.datahub.graphql.generated.EntityRelationship();
    final Urn urn = entityRelationship.getEntity();
    result.setType(entityRelationship.getType());
    // Direction is known from context - we queried INCOMING relationships
    result.setDirection(RelationshipDirection.INCOMING);
    result.setEntity(UrnToEntityMapper.map(context, urn));
    if (entityRelationship.getCreated() != null) {
      result.setCreated(AuditStampMapper.map(context, entityRelationship.getCreated()));
    }
    return result;
  }
}
