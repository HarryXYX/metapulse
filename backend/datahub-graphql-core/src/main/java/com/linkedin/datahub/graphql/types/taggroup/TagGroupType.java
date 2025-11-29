package com.linkedin.datahub.graphql.types.taggroup;

import static com.linkedin.metadata.Constants.*;

import com.google.common.collect.ImmutableSet;
import com.linkedin.common.urn.Urn;
import com.linkedin.common.urn.UrnUtils;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.generated.AutoCompleteResults;
import com.linkedin.datahub.graphql.generated.Entity;
import com.linkedin.datahub.graphql.generated.EntityType;
import com.linkedin.datahub.graphql.generated.FacetFilterInput;
import com.linkedin.datahub.graphql.generated.SearchResults;
import com.linkedin.datahub.graphql.generated.TagGroup;
import com.linkedin.datahub.graphql.resolvers.ResolverUtils;
import com.linkedin.datahub.graphql.types.SearchableEntityType;
import com.linkedin.datahub.graphql.types.mappers.AutoCompleteResultsMapper;
import com.linkedin.datahub.graphql.types.mappers.UrnSearchResultsMapper;
import com.linkedin.datahub.graphql.types.taggroup.mappers.TagGroupMapper;
import com.linkedin.entity.EntityResponse;
import com.linkedin.entity.client.EntityClient;
import com.linkedin.metadata.query.AutoCompleteResult;
import com.linkedin.metadata.query.filter.Filter;
import com.linkedin.metadata.search.SearchResult;
import graphql.execution.DataFetcherResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class TagGroupType implements SearchableEntityType<TagGroup, String> {

  private static final Set<String> FACET_FIELDS = Collections.emptySet();
  private static final Set<String> ASPECTS_TO_FETCH =
      ImmutableSet.of(
          TAG_GROUP_KEY_ASPECT_NAME, TAG_GROUP_PROPERTIES_ASPECT_NAME, OWNERSHIP_ASPECT_NAME);

  private final EntityClient _entityClient;

  public TagGroupType(final EntityClient entityClient) {
    _entityClient = entityClient;
  }

  @Override
  public Class<TagGroup> objectClass() {
    return TagGroup.class;
  }

  @Override
  public EntityType type() {
    return EntityType.TAG_GROUP;
  }

  @Override
  public Function<Entity, String> getKeyProvider() {
    return Entity::getUrn;
  }

  @Override
  public List<DataFetcherResult<TagGroup>> batchLoad(
      final List<String> urns, final QueryContext context) {

    final List<Urn> tagGroupUrns = urns.stream().map(UrnUtils::getUrn).collect(Collectors.toList());

    try {
      final Map<Urn, EntityResponse> tagGroupMap =
          _entityClient.batchGetV2(
              context.getOperationContext(),
              TAG_GROUP_ENTITY_NAME,
              new HashSet<>(tagGroupUrns),
              ASPECTS_TO_FETCH);

      final List<EntityResponse> gmsResults = new ArrayList<>(urns.size());
      for (Urn urn : tagGroupUrns) {
        gmsResults.add(tagGroupMap.getOrDefault(urn, null));
      }
      return gmsResults.stream()
          .map(
              gmsTagGroup ->
                  gmsTagGroup == null
                      ? null
                      : DataFetcherResult.<TagGroup>newResult()
                          .data(TagGroupMapper.map(context, gmsTagGroup))
                          .build())
          .collect(Collectors.toList());
    } catch (Exception e) {
      throw new RuntimeException("Failed to batch load TagGroups", e);
    }
  }

  @Override
  public SearchResults search(
      @Nonnull String query,
      @Nullable List<FacetFilterInput> filters,
      int start,
      @Nullable Integer count,
      @Nonnull QueryContext context)
      throws Exception {
    final Map<String, String> facetFilters = ResolverUtils.buildFacetFilters(filters, FACET_FIELDS);
    final SearchResult searchResult =
        _entityClient.search(
            context.getOperationContext().withSearchFlags(flags -> flags.setFulltext(true)),
            TAG_GROUP_ENTITY_NAME,
            query,
            facetFilters,
            start,
            count);
    return UrnSearchResultsMapper.map(context, searchResult);
  }

  @Override
  public AutoCompleteResults autoComplete(
      @Nonnull String query,
      @Nullable String field,
      @Nullable Filter filters,
      @Nullable Integer limit,
      @Nonnull QueryContext context)
      throws Exception {
    final AutoCompleteResult result =
        _entityClient.autoComplete(
            context.getOperationContext(), TAG_GROUP_ENTITY_NAME, query, filters, limit);
    return AutoCompleteResultsMapper.map(context, result);
  }
}
