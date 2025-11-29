package com.linkedin.datahub.graphql.types.taggroup.mappers;

import static com.linkedin.metadata.Constants.*;

import com.linkedin.common.Ownership;
import com.linkedin.common.urn.Urn;
import com.linkedin.data.DataMap;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.datahub.graphql.QueryContext;
import com.linkedin.datahub.graphql.generated.EntityType;
import com.linkedin.datahub.graphql.generated.TagGroup;
import com.linkedin.datahub.graphql.types.common.mappers.OwnershipMapper;
import com.linkedin.datahub.graphql.types.common.mappers.util.MappingHelper;
import com.linkedin.datahub.graphql.types.mappers.ModelMapper;
import com.linkedin.entity.EntityResponse;
import com.linkedin.entity.EnvelopedAspectMap;
import com.linkedin.metadata.key.TagGroupKey;
import com.linkedin.taggroup.TagGroupProperties;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Maps Pegasus {@link RecordTemplate} objects to objects conforming to the GQL schema.
 *
 * <p>To be replaced by auto-generated mappers implementations
 */
public class TagGroupMapper implements ModelMapper<EntityResponse, TagGroup> {

  public static final TagGroupMapper INSTANCE = new TagGroupMapper();

  public static TagGroup map(
      @Nullable final QueryContext context, @Nonnull final EntityResponse entityResponse) {
    return INSTANCE.apply(context, entityResponse);
  }

  @Override
  public TagGroup apply(
      @Nullable final QueryContext context, @Nonnull final EntityResponse entityResponse) {
    final TagGroup result = new TagGroup();
    Urn entityUrn = entityResponse.getUrn();
    result.setUrn(entityResponse.getUrn().toString());
    result.setType(EntityType.TAG_GROUP);

    EnvelopedAspectMap aspectMap = entityResponse.getAspects();
    MappingHelper<TagGroup> mappingHelper = new MappingHelper<>(aspectMap, result);
    mappingHelper.mapToResult(TAG_GROUP_KEY_ASPECT_NAME, TagGroupMapper::mapTagGroupKey);
    mappingHelper.mapToResult(
        TAG_GROUP_PROPERTIES_ASPECT_NAME, TagGroupMapper::mapTagGroupProperties);
    mappingHelper.mapToResult(
        OWNERSHIP_ASPECT_NAME,
        (tagGroup, dataMap) ->
            tagGroup.setOwnership(
                OwnershipMapper.map(context, new Ownership(dataMap), entityUrn)));

    return mappingHelper.getResult();
  }

  private static void mapTagGroupKey(@Nonnull TagGroup tagGroup, @Nonnull DataMap dataMap) {
    TagGroupKey tagGroupKey = new TagGroupKey(dataMap);
    // The key name can be used as a fallback identifier
  }

  private static void mapTagGroupProperties(@Nonnull TagGroup tagGroup, @Nonnull DataMap dataMap) {
    final TagGroupProperties properties = new TagGroupProperties(dataMap);
    final com.linkedin.datahub.graphql.generated.TagGroupProperties graphQlProperties =
        new com.linkedin.datahub.graphql.generated.TagGroupProperties.Builder()
            .setName(properties.getName(GetMode.DEFAULT))
            .setDescription(properties.getDescription(GetMode.DEFAULT))
            .setColorHex(properties.getColorHex(GetMode.DEFAULT))
            .build();
    tagGroup.setProperties(graphQlProperties);
  }
}
