
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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;


/**
 * A resource-defined string representing the resource state for the purpose of concurrency control
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/VersionTag.pdl.")
public class VersionTag
    extends RecordTemplate
{

    private final static VersionTag.Fields _fields = new VersionTag.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}", SchemaFormatType.PDL));
    private String _versionTagField = null;
    private MetadataAttribution _metadataAttributionField = null;
    private VersionTag.ChangeListener __changeListener = new VersionTag.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_VersionTag = SCHEMA.getField("versionTag");
    private final static RecordDataSchema.Field FIELD_MetadataAttribution = SCHEMA.getField("metadataAttribution");

    public VersionTag() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public VersionTag(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static VersionTag.Fields fields() {
        return _fields;
    }

    public static VersionTag.ProjectionMask createMask() {
        return new VersionTag.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for versionTag
     * 
     * @see VersionTag.Fields#versionTag
     */
    public boolean hasVersionTag() {
        if (_versionTagField!= null) {
            return true;
        }
        return super._map.containsKey("versionTag");
    }

    /**
     * Remover for versionTag
     * 
     * @see VersionTag.Fields#versionTag
     */
    public void removeVersionTag() {
        super._map.remove("versionTag");
    }

    /**
     * Getter for versionTag
     * 
     * @see VersionTag.Fields#versionTag
     */
    @Nullable
    public String getVersionTag(GetMode mode) {
        return getVersionTag();
    }

    /**
     * Getter for versionTag
     * 
     * @return
     *     Optional field. Always check for null.
     * @see VersionTag.Fields#versionTag
     */
    @Nullable
    public String getVersionTag() {
        if (_versionTagField!= null) {
            return _versionTagField;
        } else {
            Object __rawValue = super._map.get("versionTag");
            _versionTagField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _versionTagField;
        }
    }

    /**
     * Setter for versionTag
     * 
     * @see VersionTag.Fields#versionTag
     */
    public VersionTag setVersionTag(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersionTag(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersionTag();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "versionTag", value);
                    _versionTagField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "versionTag", value);
                    _versionTagField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for versionTag
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionTag.Fields#versionTag
     */
    public VersionTag setVersionTag(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field versionTag of com.linkedin.common.VersionTag to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "versionTag", value);
            _versionTagField = value;
        }
        return this;
    }

    /**
     * Existence checker for metadataAttribution
     * 
     * @see VersionTag.Fields#metadataAttribution
     */
    public boolean hasMetadataAttribution() {
        if (_metadataAttributionField!= null) {
            return true;
        }
        return super._map.containsKey("metadataAttribution");
    }

    /**
     * Remover for metadataAttribution
     * 
     * @see VersionTag.Fields#metadataAttribution
     */
    public void removeMetadataAttribution() {
        super._map.remove("metadataAttribution");
    }

    /**
     * Getter for metadataAttribution
     * 
     * @see VersionTag.Fields#metadataAttribution
     */
    @Nullable
    public MetadataAttribution getMetadataAttribution(GetMode mode) {
        return getMetadataAttribution();
    }

    /**
     * Getter for metadataAttribution
     * 
     * @return
     *     Optional field. Always check for null.
     * @see VersionTag.Fields#metadataAttribution
     */
    @Nullable
    public MetadataAttribution getMetadataAttribution() {
        if (_metadataAttributionField!= null) {
            return _metadataAttributionField;
        } else {
            Object __rawValue = super._map.get("metadataAttribution");
            _metadataAttributionField = ((__rawValue == null)?null:new MetadataAttribution(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _metadataAttributionField;
        }
    }

    /**
     * Setter for metadataAttribution
     * 
     * @see VersionTag.Fields#metadataAttribution
     */
    public VersionTag setMetadataAttribution(
        @Nullable
        MetadataAttribution value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMetadataAttribution(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMetadataAttribution();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metadataAttribution", value.data());
                    _metadataAttributionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "metadataAttribution", value.data());
                    _metadataAttributionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for metadataAttribution
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionTag.Fields#metadataAttribution
     */
    public VersionTag setMetadataAttribution(
        @Nonnull
        MetadataAttribution value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field metadataAttribution of com.linkedin.common.VersionTag to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "metadataAttribution", value.data());
            _metadataAttributionField = value;
        }
        return this;
    }

    @Override
    public VersionTag clone()
        throws CloneNotSupportedException
    {
        VersionTag __clone = ((VersionTag) super.clone());
        __clone.__changeListener = new VersionTag.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public VersionTag copy()
        throws CloneNotSupportedException
    {
        VersionTag __copy = ((VersionTag) super.copy());
        __copy._metadataAttributionField = null;
        __copy._versionTagField = null;
        __copy.__changeListener = new VersionTag.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final VersionTag __objectRef;

        private ChangeListener(VersionTag reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "metadataAttribution":
                    __objectRef._metadataAttributionField = null;
                    break;
                case "versionTag":
                    __objectRef._versionTagField = null;
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

        public PathSpec versionTag() {
            return new PathSpec(getPathComponents(), "versionTag");
        }

        public com.linkedin.common.MetadataAttribution.Fields metadataAttribution() {
            return new com.linkedin.common.MetadataAttribution.Fields(getPathComponents(), "metadataAttribution");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.MetadataAttribution.ProjectionMask _metadataAttributionMask;

        ProjectionMask() {
            super(3);
        }

        public VersionTag.ProjectionMask withVersionTag() {
            getDataMap().put("versionTag", MaskMap.POSITIVE_MASK);
            return this;
        }

        public VersionTag.ProjectionMask withMetadataAttribution(Function<com.linkedin.common.MetadataAttribution.ProjectionMask, com.linkedin.common.MetadataAttribution.ProjectionMask> nestedMask) {
            _metadataAttributionMask = nestedMask.apply(((_metadataAttributionMask == null)?MetadataAttribution.createMask():_metadataAttributionMask));
            getDataMap().put("metadataAttribution", _metadataAttributionMask.getDataMap());
            return this;
        }

        public VersionTag.ProjectionMask withMetadataAttribution() {
            _metadataAttributionMask = null;
            getDataMap().put("metadataAttribution", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
