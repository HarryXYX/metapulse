
package com.linkedin.ml.metadata;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.VersionTag;
import com.linkedin.common.url.UrlCoercer;
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
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with an ML Model Deployment
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelDeploymentProperties.pdl.")
public class MLModelDeploymentProperties
    extends RecordTemplate
{

    private final static MLModelDeploymentProperties.Fields _fields = new MLModelDeploymentProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with an ML Model Deployment*/@Aspect.name=\"mlModelDeploymentProperties\"record MLModelDeploymentProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**Documentation of the MLModelDeployment*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\"}description:optional string/**Date when the MLModelDeployment was developed*/createdAt:optional{namespace com.linkedin.common/**Number of milliseconds since midnight, January 1, 1970 UTC. It must be a positive number*/typeref Time=long}/**Version of the MLModelDeployment*/version:optional{namespace com.linkedin.common/**A resource-defined string representing the resource state for the purpose of concurrency control*/record VersionTag{versionTag:optional string,metadataAttribution:optional/**Information about who, why, and how this metadata was applied*/record MetadataAttribution{/**When this metadata was updated.*/time:Time/**The entity (e.g. a member URN) responsible for applying the assocated metadata. This can\neither be a user (in case of UI edits) or the datahub system for automation.*/actor:@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string/**The DataHub source responsible for applying the associated metadata. This will only be filled out\nwhen a DataHub source is responsible. This includes the specific metadata test urn, the automation urn.*/source:optional Urn/**The details associated with why this metadata was applied. For example, this could include\nthe actual regex rule, sql statement, ingestion pipeline ID, etc.*/sourceDetail:map[string,string]={}}}}/**Status of the deployment*/@Searchable.fieldName=\"deploymentStatus\"status:optional/**Model endpoint statuses*/enum DeploymentStatus{/**Deployments out of service.*/OUT_OF_SERVICE/**Deployments being created.*/CREATING/**Deployments being updated.*/UPDATING/**Deployments being reverted to a previous version.*/ROLLING_BACK/**Deployments that are active.*/IN_SERVICE/**Deployments being deleted.*/DELETING/**Deployments with an error state.*/FAILED/**Deployments with unknown/unmappable state.*/UNKNOWN}}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.url.Url _externalUrlField = null;
    private String _descriptionField = null;
    private Long _createdAtField = null;
    private VersionTag _versionField = null;
    private DeploymentStatus _statusField = null;
    private MLModelDeploymentProperties.ChangeListener __changeListener = new MLModelDeploymentProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_CreatedAt = SCHEMA.getField("createdAt");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_Status = SCHEMA.getField("status");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public MLModelDeploymentProperties() {
        super(new DataMap(8, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public MLModelDeploymentProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLModelDeploymentProperties.Fields fields() {
        return _fields;
    }

    public static MLModelDeploymentProperties.ProjectionMask createMask() {
        return new MLModelDeploymentProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    public boolean hasCustomProperties() {
        if (_customPropertiesField!= null) {
            return true;
        }
        return super._map.containsKey("customProperties");
    }

    /**
     * Remover for customProperties
     * 
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    @Nullable
    public StringMap getCustomProperties(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getCustomProperties();
            case NULL:
                if (_customPropertiesField!= null) {
                    return _customPropertiesField;
                } else {
                    Object __rawValue = super._map.get("customProperties");
                    _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _customPropertiesField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for customProperties
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    @Nonnull
    public StringMap getCustomProperties() {
        if (_customPropertiesField!= null) {
            return _customPropertiesField;
        } else {
            Object __rawValue = super._map.get("customProperties");
            if (__rawValue == null) {
                return DEFAULT_CustomProperties;
            }
            _customPropertiesField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _customPropertiesField;
        }
    }

    /**
     * Setter for customProperties
     * 
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    public MLModelDeploymentProperties setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.ml.metadata.MLModelDeploymentProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCustomProperties();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
                    _customPropertiesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for customProperties
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#customProperties
     */
    public MLModelDeploymentProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.ml.metadata.MLModelDeploymentProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    public boolean hasExternalUrl() {
        if (_externalUrlField!= null) {
            return true;
        }
        return super._map.containsKey("externalUrl");
    }

    /**
     * Remover for externalUrl
     * 
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl(GetMode mode) {
        return getExternalUrl();
    }

    /**
     * Getter for externalUrl
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    @Nullable
    public com.linkedin.common.url.Url getExternalUrl() {
        if (_externalUrlField!= null) {
            return _externalUrlField;
        } else {
            Object __rawValue = super._map.get("externalUrl");
            _externalUrlField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.url.Url.class);
            return _externalUrlField;
        }
    }

    /**
     * Setter for externalUrl
     * 
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    public MLModelDeploymentProperties setExternalUrl(
        @Nullable
        com.linkedin.common.url.Url value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExternalUrl(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExternalUrl();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _externalUrlField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
                    _externalUrlField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for externalUrl
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#externalUrl
     */
    public MLModelDeploymentProperties setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.ml.metadata.MLModelDeploymentProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see MLModelDeploymentProperties.Fields#description
     */
    public boolean hasDescription() {
        if (_descriptionField!= null) {
            return true;
        }
        return super._map.containsKey("description");
    }

    /**
     * Remover for description
     * 
     * @see MLModelDeploymentProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see MLModelDeploymentProperties.Fields#description
     */
    @Nullable
    public String getDescription(GetMode mode) {
        return getDescription();
    }

    /**
     * Getter for description
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDeploymentProperties.Fields#description
     */
    @Nullable
    public String getDescription() {
        if (_descriptionField!= null) {
            return _descriptionField;
        } else {
            Object __rawValue = super._map.get("description");
            _descriptionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _descriptionField;
        }
    }

    /**
     * Setter for description
     * 
     * @see MLModelDeploymentProperties.Fields#description
     */
    public MLModelDeploymentProperties setDescription(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDescription(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDescription();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "description", value);
                    _descriptionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for description
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#description
     */
    public MLModelDeploymentProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.ml.metadata.MLModelDeploymentProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for createdAt
     * 
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public boolean hasCreatedAt() {
        if (_createdAtField!= null) {
            return true;
        }
        return super._map.containsKey("createdAt");
    }

    /**
     * Remover for createdAt
     * 
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public void removeCreatedAt() {
        super._map.remove("createdAt");
    }

    /**
     * Getter for createdAt
     * 
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    @Nullable
    public Long getCreatedAt(GetMode mode) {
        return getCreatedAt();
    }

    /**
     * Getter for createdAt
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    @Nullable
    public Long getCreatedAt() {
        if (_createdAtField!= null) {
            return _createdAtField;
        } else {
            Object __rawValue = super._map.get("createdAt");
            _createdAtField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _createdAtField;
        }
    }

    /**
     * Setter for createdAt
     * 
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public MLModelDeploymentProperties setCreatedAt(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCreatedAt(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCreatedAt();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
                    _createdAtField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
                    _createdAtField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public MLModelDeploymentProperties setCreatedAt(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field createdAt of com.linkedin.ml.metadata.MLModelDeploymentProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
            _createdAtField = value;
        }
        return this;
    }

    /**
     * Setter for createdAt
     * 
     * @see MLModelDeploymentProperties.Fields#createdAt
     */
    public MLModelDeploymentProperties setCreatedAt(long value) {
        CheckedUtil.putWithoutChecking(super._map, "createdAt", DataTemplateUtil.coerceLongInput(value));
        _createdAtField = value;
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see MLModelDeploymentProperties.Fields#version
     */
    public boolean hasVersion() {
        if (_versionField!= null) {
            return true;
        }
        return super._map.containsKey("version");
    }

    /**
     * Remover for version
     * 
     * @see MLModelDeploymentProperties.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see MLModelDeploymentProperties.Fields#version
     */
    @Nullable
    public VersionTag getVersion(GetMode mode) {
        return getVersion();
    }

    /**
     * Getter for version
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDeploymentProperties.Fields#version
     */
    @Nullable
    public VersionTag getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            _versionField = ((__rawValue == null)?null:new VersionTag(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see MLModelDeploymentProperties.Fields#version
     */
    public MLModelDeploymentProperties setVersion(
        @Nullable
        VersionTag value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value.data());
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", value.data());
                    _versionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#version
     */
    public MLModelDeploymentProperties setVersion(
        @Nonnull
        VersionTag value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.ml.metadata.MLModelDeploymentProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", value.data());
            _versionField = value;
        }
        return this;
    }

    /**
     * Existence checker for status
     * 
     * @see MLModelDeploymentProperties.Fields#status
     */
    public boolean hasStatus() {
        if (_statusField!= null) {
            return true;
        }
        return super._map.containsKey("status");
    }

    /**
     * Remover for status
     * 
     * @see MLModelDeploymentProperties.Fields#status
     */
    public void removeStatus() {
        super._map.remove("status");
    }

    /**
     * Getter for status
     * 
     * @see MLModelDeploymentProperties.Fields#status
     */
    @Nullable
    public DeploymentStatus getStatus(GetMode mode) {
        return getStatus();
    }

    /**
     * Getter for status
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelDeploymentProperties.Fields#status
     */
    @Nullable
    public DeploymentStatus getStatus() {
        if (_statusField!= null) {
            return _statusField;
        } else {
            Object __rawValue = super._map.get("status");
            _statusField = DataTemplateUtil.coerceEnumOutput(__rawValue, DeploymentStatus.class, DeploymentStatus.$UNKNOWN);
            return _statusField;
        }
    }

    /**
     * Setter for status
     * 
     * @see MLModelDeploymentProperties.Fields#status
     */
    public MLModelDeploymentProperties setStatus(
        @Nullable
        DeploymentStatus value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStatus(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStatus();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "status", value.name());
                    _statusField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "status", value.name());
                    _statusField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for status
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelDeploymentProperties.Fields#status
     */
    public MLModelDeploymentProperties setStatus(
        @Nonnull
        DeploymentStatus value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field status of com.linkedin.ml.metadata.MLModelDeploymentProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "status", value.name());
            _statusField = value;
        }
        return this;
    }

    @Override
    public MLModelDeploymentProperties clone()
        throws CloneNotSupportedException
    {
        MLModelDeploymentProperties __clone = ((MLModelDeploymentProperties) super.clone());
        __clone.__changeListener = new MLModelDeploymentProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLModelDeploymentProperties copy()
        throws CloneNotSupportedException
    {
        MLModelDeploymentProperties __copy = ((MLModelDeploymentProperties) super.copy());
        __copy._externalUrlField = null;
        __copy._createdAtField = null;
        __copy._customPropertiesField = null;
        __copy._descriptionField = null;
        __copy._versionField = null;
        __copy._statusField = null;
        __copy.__changeListener = new MLModelDeploymentProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLModelDeploymentProperties __objectRef;

        private ChangeListener(MLModelDeploymentProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "externalUrl":
                    __objectRef._externalUrlField = null;
                    break;
                case "createdAt":
                    __objectRef._createdAtField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
                    break;
                case "status":
                    __objectRef._statusField = null;
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
         * Custom property bag.
         * 
         */
        public PathSpec customProperties() {
            return new PathSpec(getPathComponents(), "customProperties");
        }

        /**
         * URL where the reference exist
         * 
         */
        public PathSpec externalUrl() {
            return new PathSpec(getPathComponents(), "externalUrl");
        }

        /**
         * Documentation of the MLModelDeployment
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * Date when the MLModelDeployment was developed
         * 
         */
        public PathSpec createdAt() {
            return new PathSpec(getPathComponents(), "createdAt");
        }

        /**
         * Version of the MLModelDeployment
         * 
         */
        public com.linkedin.common.VersionTag.Fields version() {
            return new com.linkedin.common.VersionTag.Fields(getPathComponents(), "version");
        }

        /**
         * Status of the deployment
         * 
         */
        public PathSpec status() {
            return new PathSpec(getPathComponents(), "status");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.common.VersionTag.ProjectionMask _versionMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * Custom property bag.
         * 
         */
        public MLModelDeploymentProperties.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL where the reference exist
         * 
         */
        public MLModelDeploymentProperties.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Documentation of the MLModelDeployment
         * 
         */
        public MLModelDeploymentProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Date when the MLModelDeployment was developed
         * 
         */
        public MLModelDeploymentProperties.ProjectionMask withCreatedAt() {
            getDataMap().put("createdAt", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Version of the MLModelDeployment
         * 
         */
        public MLModelDeploymentProperties.ProjectionMask withVersion(Function<com.linkedin.common.VersionTag.ProjectionMask, com.linkedin.common.VersionTag.ProjectionMask> nestedMask) {
            _versionMask = nestedMask.apply(((_versionMask == null)?VersionTag.createMask():_versionMask));
            getDataMap().put("version", _versionMask.getDataMap());
            return this;
        }

        /**
         * Version of the MLModelDeployment
         * 
         */
        public MLModelDeploymentProperties.ProjectionMask withVersion() {
            _versionMask = null;
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Status of the deployment
         * 
         */
        public MLModelDeploymentProperties.ProjectionMask withStatus() {
            getDataMap().put("status", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
