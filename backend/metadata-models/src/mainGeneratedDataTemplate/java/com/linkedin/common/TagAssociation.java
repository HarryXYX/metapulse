
package com.linkedin.common;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataMap;
import com.linkedin.data.collections.CheckedUtil;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.RecordDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.
 * propagation parameters.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/TagAssociation.pdl.")
public class TagAssociation
    extends RecordTemplate
{

    private final static TagAssociation.Fields _fields = new TagAssociation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Properties of an applied tag. For now, just an Urn. In the future we can extend this with other properties, e.g.\npropagation parameters.*/record TagAssociation{/**Urn of the applied tag*/tag:/**Globally defined tag*/@java.class=\"com.linkedin.common.urn.TagUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Globally defined tags\",\"entityType\":\"tag\",\"fields\":[{\"doc\":\"tag name\",\"maxLength\":200,\"name\":\"name\",\"type\":\"string\"}],\"maxLength\":220,\"name\":\"Tag\",\"namespace\":\"li\",\"owners\":[],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TagUrn=string/**Additional context about the association*/context:optional string/**Information about who, why, and how this metadata was applied*/@Searchable={\"/actor\":{\"fieldName\":\"tagAttributionActors\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/source\":{\"fieldName\":\"tagAttributionSources\",\"fieldType\":\"URN\",\"queryByDefault\":false},\"/time\":{\"fieldName\":\"tagAttributionDates\",\"fieldType\":\"DATETIME\",\"queryByDefault\":false}}attribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.TagUrn _tagField = null;
    private String _contextField = null;
    private MetadataAttribution _attributionField = null;
    private TagAssociation.ChangeListener __changeListener = new TagAssociation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Tag = SCHEMA.getField("tag");
    private final static RecordDataSchema.Field FIELD_Context = SCHEMA.getField("context");
    private final static RecordDataSchema.Field FIELD_Attribution = SCHEMA.getField("attribution");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.TagUrn.class);
    }

    public TagAssociation() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public TagAssociation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TagAssociation.Fields fields() {
        return _fields;
    }

    public static TagAssociation.ProjectionMask createMask() {
        return new TagAssociation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for tag
     * 
     * @see TagAssociation.Fields#tag
     */
    public boolean hasTag() {
        if (_tagField!= null) {
            return true;
        }
        return super._map.containsKey("tag");
    }

    /**
     * Remover for tag
     * 
     * @see TagAssociation.Fields#tag
     */
    public void removeTag() {
        super._map.remove("tag");
    }

    /**
     * Getter for tag
     * 
     * @see TagAssociation.Fields#tag
     */
    @Nullable
    public com.linkedin.common.urn.TagUrn getTag(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTag();
            case DEFAULT:
            case NULL:
                if (_tagField!= null) {
                    return _tagField;
                } else {
                    Object __rawValue = super._map.get("tag");
                    _tagField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.TagUrn.class);
                    return _tagField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for tag
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TagAssociation.Fields#tag
     */
    @Nonnull
    public com.linkedin.common.urn.TagUrn getTag() {
        if (_tagField!= null) {
            return _tagField;
        } else {
            Object __rawValue = super._map.get("tag");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("tag");
            }
            _tagField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.TagUrn.class);
            return _tagField;
        }
    }

    /**
     * Setter for tag
     * 
     * @see TagAssociation.Fields#tag
     */
    public TagAssociation setTag(
        @Nullable
        com.linkedin.common.urn.TagUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTag(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field tag of com.linkedin.common.TagAssociation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tag", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.TagUrn.class));
                    _tagField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTag();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "tag", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.TagUrn.class));
                    _tagField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "tag", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.TagUrn.class));
                    _tagField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for tag
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TagAssociation.Fields#tag
     */
    public TagAssociation setTag(
        @Nonnull
        com.linkedin.common.urn.TagUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field tag of com.linkedin.common.TagAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "tag", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.TagUrn.class));
            _tagField = value;
        }
        return this;
    }

    /**
     * Existence checker for context
     * 
     * @see TagAssociation.Fields#context
     */
    public boolean hasContext() {
        if (_contextField!= null) {
            return true;
        }
        return super._map.containsKey("context");
    }

    /**
     * Remover for context
     * 
     * @see TagAssociation.Fields#context
     */
    public void removeContext() {
        super._map.remove("context");
    }

    /**
     * Getter for context
     * 
     * @see TagAssociation.Fields#context
     */
    @Nullable
    public String getContext(GetMode mode) {
        return getContext();
    }

    /**
     * Getter for context
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TagAssociation.Fields#context
     */
    @Nullable
    public String getContext() {
        if (_contextField!= null) {
            return _contextField;
        } else {
            Object __rawValue = super._map.get("context");
            _contextField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _contextField;
        }
    }

    /**
     * Setter for context
     * 
     * @see TagAssociation.Fields#context
     */
    public TagAssociation setContext(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setContext(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeContext();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "context", value);
                    _contextField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "context", value);
                    _contextField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for context
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TagAssociation.Fields#context
     */
    public TagAssociation setContext(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field context of com.linkedin.common.TagAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "context", value);
            _contextField = value;
        }
        return this;
    }

    /**
     * Existence checker for attribution
     * 
     * @see TagAssociation.Fields#attribution
     */
    public boolean hasAttribution() {
        if (_attributionField!= null) {
            return true;
        }
        return super._map.containsKey("attribution");
    }

    /**
     * Remover for attribution
     * 
     * @see TagAssociation.Fields#attribution
     */
    public void removeAttribution() {
        super._map.remove("attribution");
    }

    /**
     * Getter for attribution
     * 
     * @see TagAssociation.Fields#attribution
     */
    @Nullable
    public MetadataAttribution getAttribution(GetMode mode) {
        return getAttribution();
    }

    /**
     * Getter for attribution
     * 
     * @return
     *     Optional field. Always check for null.
     * @see TagAssociation.Fields#attribution
     */
    @Nullable
    public MetadataAttribution getAttribution() {
        if (_attributionField!= null) {
            return _attributionField;
        } else {
            Object __rawValue = super._map.get("attribution");
            _attributionField = ((__rawValue == null)?null:new MetadataAttribution(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _attributionField;
        }
    }

    /**
     * Setter for attribution
     * 
     * @see TagAssociation.Fields#attribution
     */
    public TagAssociation setAttribution(
        @Nullable
        MetadataAttribution value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAttribution(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAttribution();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
                    _attributionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
                    _attributionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for attribution
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TagAssociation.Fields#attribution
     */
    public TagAssociation setAttribution(
        @Nonnull
        MetadataAttribution value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field attribution of com.linkedin.common.TagAssociation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "attribution", value.data());
            _attributionField = value;
        }
        return this;
    }

    @Override
    public TagAssociation clone()
        throws CloneNotSupportedException
    {
        TagAssociation __clone = ((TagAssociation) super.clone());
        __clone.__changeListener = new TagAssociation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TagAssociation copy()
        throws CloneNotSupportedException
    {
        TagAssociation __copy = ((TagAssociation) super.copy());
        __copy._contextField = null;
        __copy._attributionField = null;
        __copy._tagField = null;
        __copy.__changeListener = new TagAssociation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TagAssociation __objectRef;

        private ChangeListener(TagAssociation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "context":
                    __objectRef._contextField = null;
                    break;
                case "attribution":
                    __objectRef._attributionField = null;
                    break;
                case "tag":
                    __objectRef._tagField = null;
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
         * Urn of the applied tag
         * 
         */
        public PathSpec tag() {
            return new PathSpec(getPathComponents(), "tag");
        }

        /**
         * Additional context about the association
         * 
         */
        public PathSpec context() {
            return new PathSpec(getPathComponents(), "context");
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public com.linkedin.common.MetadataAttribution.Fields attribution() {
            return new com.linkedin.common.MetadataAttribution.Fields(getPathComponents(), "attribution");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.MetadataAttribution.ProjectionMask _attributionMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * Urn of the applied tag
         * 
         */
        public TagAssociation.ProjectionMask withTag() {
            getDataMap().put("tag", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional context about the association
         * 
         */
        public TagAssociation.ProjectionMask withContext() {
            getDataMap().put("context", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public TagAssociation.ProjectionMask withAttribution(Function<com.linkedin.common.MetadataAttribution.ProjectionMask, com.linkedin.common.MetadataAttribution.ProjectionMask> nestedMask) {
            _attributionMask = nestedMask.apply(((_attributionMask == null)?MetadataAttribution.createMask():_attributionMask));
            getDataMap().put("attribution", _attributionMask.getDataMap());
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         * 
         */
        public TagAssociation.ProjectionMask withAttribution() {
            _attributionMask = null;
            getDataMap().put("attribution", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
