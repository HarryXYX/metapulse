
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Tag aspect used for applying tags to an entity
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/GlobalTags.pdl.")
public class GlobalTags
    extends RecordTemplate
{

    private final static GlobalTags.Fields _fields = new GlobalTags.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Tag aspect used for applying tags to an entity*/@Aspect.name=\"globalTags\"record GlobalTags{/**Tags associated with a given entity*/@Relationship.`/*/tag`={\"entityTypes\":[\"tag\"],\"name\":\"TaggedWith\"}@Searchable.`/*/tag`={\"addToFilters\":true,\"boostScore\":0.5,\"fieldName\":\"tags\",\"fieldType\":\"URN\",\"filterNameOverride\":\"Tagged With\",\"hasValuesFieldName\":\"hasTags\",\"queryByDefault\":true,\"searchTier\":2}tags:array[/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}]}", SchemaFormatType.PDL));
    private TagAssociationArray _tagsField = null;
    private GlobalTags.ChangeListener __changeListener = new GlobalTags.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Tags = SCHEMA.getField("tags");

    public GlobalTags() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public GlobalTags(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GlobalTags.Fields fields() {
        return _fields;
    }

    public static GlobalTags.ProjectionMask createMask() {
        return new GlobalTags.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for tags
     * 
     * @see GlobalTags.Fields#tags
     */
    public boolean hasTags() {
        if (_tagsField!= null) {
            return true;
        }
        return super._map.containsKey("tags");
    }

    /**
     * Remover for tags
     * 
     * @see GlobalTags.Fields#tags
     */
    public void removeTags() {
        super._map.remove("tags");
    }

    /**
     * Getter for tags
     * 
     * @see GlobalTags.Fields#tags
     */
    @Nullable
    public TagAssociationArray getTags(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTags();
            case DEFAULT:
            case NULL:
                if (_tagsField!= null) {
                    return _tagsField;
                } else {
                    Object __rawValue = super._map.get("tags");
                    _tagsField = ((__rawValue == null)?null:new TagAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _tagsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for tags
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GlobalTags.Fields#tags
     */
    @Nonnull
    public TagAssociationArray getTags() {
        if (_tagsField!= null) {
            return _tagsField;
        } else {
            Object __rawValue = super._map.get("tags");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("tags");
            }
            _tagsField = ((__rawValue == null)?null:new TagAssociationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _tagsField;
        }
    }

    /**
     * Setter for tags
     * 
     * @see GlobalTags.Fields#tags
     */
    public GlobalTags setTags(
        @Nullable
        TagAssociationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTags(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field tags of com.linkedin.common.GlobalTags");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
                    _tagsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTags();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
                    _tagsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
                    _tagsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for tags
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GlobalTags.Fields#tags
     */
    public GlobalTags setTags(
        @Nonnull
        TagAssociationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field tags of com.linkedin.common.GlobalTags to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "tags", value.data());
            _tagsField = value;
        }
        return this;
    }

    @Override
    public GlobalTags clone()
        throws CloneNotSupportedException
    {
        GlobalTags __clone = ((GlobalTags) super.clone());
        __clone.__changeListener = new GlobalTags.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GlobalTags copy()
        throws CloneNotSupportedException
    {
        GlobalTags __copy = ((GlobalTags) super.copy());
        __copy._tagsField = null;
        __copy.__changeListener = new GlobalTags.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GlobalTags __objectRef;

        private ChangeListener(GlobalTags reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "tags":
                    __objectRef._tagsField = null;
                    break;
            }
        }

    }

    public static class Fields
        extends PathSpec
    {


        public Fields(List<String> path, String name) {
            super(path, name);
        }

        public Fields() {
            super();
        }

        /**
         * Tags associated with a given entity
         * 
         */
        public com.linkedin.common.TagAssociationArray.Fields tags() {
            return new com.linkedin.common.TagAssociationArray.Fields(getPathComponents(), "tags");
        }

        /**
         * Tags associated with a given entity
         * 
         */
        public PathSpec tags(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "tags");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.TagAssociationArray.ProjectionMask _tagsMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Tags associated with a given entity
         * 
         */
        public GlobalTags.ProjectionMask withTags(Function<com.linkedin.common.TagAssociationArray.ProjectionMask, com.linkedin.common.TagAssociationArray.ProjectionMask> nestedMask) {
            _tagsMask = nestedMask.apply(((_tagsMask == null)?TagAssociationArray.createMask():_tagsMask));
            getDataMap().put("tags", _tagsMask.getDataMap());
            return this;
        }

        /**
         * Tags associated with a given entity
         * 
         */
        public GlobalTags.ProjectionMask withTags() {
            _tagsMask = null;
            getDataMap().put("tags", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Tags associated with a given entity
         * 
         */
        public GlobalTags.ProjectionMask withTags(Function<com.linkedin.common.TagAssociationArray.ProjectionMask, com.linkedin.common.TagAssociationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _tagsMask = nestedMask.apply(((_tagsMask == null)?TagAssociationArray.createMask():_tagsMask));
            getDataMap().put("tags", _tagsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("tags").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("tags").put("$count", count);
            }
            return this;
        }

        /**
         * Tags associated with a given entity
         * 
         */
        public GlobalTags.ProjectionMask withTags(Integer start, Integer count) {
            _tagsMask = null;
            getDataMap().put("tags", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("tags").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("tags").put("$count", count);
            }
            return this;
        }

    }

}
