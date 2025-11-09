
package com.linkedin.schema;

import java.util.List;
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
 * Key to retrieve schema metadata.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/schema/SchemaMetadataKey.pdl.")
public class SchemaMetadataKey
    extends RecordTemplate
{

    private final static SchemaMetadataKey.Fields _fields = new SchemaMetadataKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.schema/**Key to retrieve schema metadata.*/record SchemaMetadataKey{/**Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking*/@validate.strlen={\"max\":500,\"min\":1}schemaName:string/**Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})*/platform:{namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data platforms available\",\"entityType\":\"dataPlatform\",\"fields\":[{\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"maxLength\":25,\"name\":\"platformName\",\"type\":\"string\"}],\"maxLength\":45,\"name\":\"DataPlatform\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataPlatformUrn=string}/**Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.*/version:long}", SchemaFormatType.PDL));
    private String _schemaNameField = null;
    private com.linkedin.common.urn.DataPlatformUrn _platformField = null;
    private Long _versionField = null;
    private SchemaMetadataKey.ChangeListener __changeListener = new SchemaMetadataKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_SchemaName = SCHEMA.getField("schemaName");
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataPlatformUrn.class);
    }

    public SchemaMetadataKey() {
        super(new DataMap(4, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public SchemaMetadataKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SchemaMetadataKey.Fields fields() {
        return _fields;
    }

    public static SchemaMetadataKey.ProjectionMask createMask() {
        return new SchemaMetadataKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for schemaName
     * 
     * @see SchemaMetadataKey.Fields#schemaName
     */
    public boolean hasSchemaName() {
        if (_schemaNameField!= null) {
            return true;
        }
        return super._map.containsKey("schemaName");
    }

    /**
     * Remover for schemaName
     * 
     * @see SchemaMetadataKey.Fields#schemaName
     */
    public void removeSchemaName() {
        super._map.remove("schemaName");
    }

    /**
     * Getter for schemaName
     * 
     * @see SchemaMetadataKey.Fields#schemaName
     */
    @Nullable
    public String getSchemaName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSchemaName();
            case DEFAULT:
            case NULL:
                if (_schemaNameField!= null) {
                    return _schemaNameField;
                } else {
                    Object __rawValue = super._map.get("schemaName");
                    _schemaNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _schemaNameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for schemaName
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadataKey.Fields#schemaName
     */
    @Nonnull
    public String getSchemaName() {
        if (_schemaNameField!= null) {
            return _schemaNameField;
        } else {
            Object __rawValue = super._map.get("schemaName");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("schemaName");
            }
            _schemaNameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _schemaNameField;
        }
    }

    /**
     * Setter for schemaName
     * 
     * @see SchemaMetadataKey.Fields#schemaName
     */
    public SchemaMetadataKey setSchemaName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchemaName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field schemaName of com.linkedin.schema.SchemaMetadataKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaName", value);
                    _schemaNameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchemaName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schemaName", value);
                    _schemaNameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schemaName", value);
                    _schemaNameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schemaName
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadataKey.Fields#schemaName
     */
    public SchemaMetadataKey setSchemaName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schemaName of com.linkedin.schema.SchemaMetadataKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schemaName", value);
            _schemaNameField = value;
        }
        return this;
    }

    /**
     * Existence checker for platform
     * 
     * @see SchemaMetadataKey.Fields#platform
     */
    public boolean hasPlatform() {
        if (_platformField!= null) {
            return true;
        }
        return super._map.containsKey("platform");
    }

    /**
     * Remover for platform
     * 
     * @see SchemaMetadataKey.Fields#platform
     */
    public void removePlatform() {
        super._map.remove("platform");
    }

    /**
     * Getter for platform
     * 
     * @see SchemaMetadataKey.Fields#platform
     */
    @Nullable
    public com.linkedin.common.urn.DataPlatformUrn getPlatform(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPlatform();
            case DEFAULT:
            case NULL:
                if (_platformField!= null) {
                    return _platformField;
                } else {
                    Object __rawValue = super._map.get("platform");
                    _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DataPlatformUrn.class);
                    return _platformField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for platform
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadataKey.Fields#platform
     */
    @Nonnull
    public com.linkedin.common.urn.DataPlatformUrn getPlatform() {
        if (_platformField!= null) {
            return _platformField;
        } else {
            Object __rawValue = super._map.get("platform");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("platform");
            }
            _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DataPlatformUrn.class);
            return _platformField;
        }
    }

    /**
     * Setter for platform
     * 
     * @see SchemaMetadataKey.Fields#platform
     */
    public SchemaMetadataKey setPlatform(
        @Nullable
        com.linkedin.common.urn.DataPlatformUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPlatform(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field platform of com.linkedin.schema.SchemaMetadataKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
                    _platformField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePlatform();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
                    _platformField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
                    _platformField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for platform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SchemaMetadataKey.Fields#platform
     */
    public SchemaMetadataKey setPlatform(
        @Nonnull
        com.linkedin.common.urn.DataPlatformUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field platform of com.linkedin.schema.SchemaMetadataKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DataPlatformUrn.class));
            _platformField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see SchemaMetadataKey.Fields#version
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
     * @see SchemaMetadataKey.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see SchemaMetadataKey.Fields#version
     */
    @Nullable
    public Long getVersion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVersion();
            case DEFAULT:
            case NULL:
                if (_versionField!= null) {
                    return _versionField;
                } else {
                    Object __rawValue = super._map.get("version");
                    _versionField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _versionField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for version
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SchemaMetadataKey.Fields#version
     */
    @Nonnull
    public Long getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("version");
            }
            _versionField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see SchemaMetadataKey.Fields#version
     */
    public SchemaMetadataKey setVersion(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field version of com.linkedin.schema.SchemaMetadataKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
                    _versionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
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
     * @see SchemaMetadataKey.Fields#version
     */
    public SchemaMetadataKey setVersion(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.schema.SchemaMetadataKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
            _versionField = value;
        }
        return this;
    }

    /**
     * Setter for version
     * 
     * @see SchemaMetadataKey.Fields#version
     */
    public SchemaMetadataKey setVersion(long value) {
        CheckedUtil.putWithoutChecking(super._map, "version", DataTemplateUtil.coerceLongInput(value));
        _versionField = value;
        return this;
    }

    @Override
    public SchemaMetadataKey clone()
        throws CloneNotSupportedException
    {
        SchemaMetadataKey __clone = ((SchemaMetadataKey) super.clone());
        __clone.__changeListener = new SchemaMetadataKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SchemaMetadataKey copy()
        throws CloneNotSupportedException
    {
        SchemaMetadataKey __copy = ((SchemaMetadataKey) super.copy());
        __copy._schemaNameField = null;
        __copy._versionField = null;
        __copy._platformField = null;
        __copy.__changeListener = new SchemaMetadataKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SchemaMetadataKey __objectRef;

        private ChangeListener(SchemaMetadataKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "schemaName":
                    __objectRef._schemaNameField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
                    break;
                case "platform":
                    __objectRef._platformField = null;
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
         * Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking
         * 
         */
        public PathSpec schemaName() {
            return new PathSpec(getPathComponents(), "schemaName");
        }

        /**
         * Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * Schema name e.g. PageViewEvent, identity.Profile, ams.account_management_tracking
         * 
         */
        public SchemaMetadataKey.ProjectionMask withSchemaName() {
            getDataMap().put("schemaName", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Standardized platform urn where schema is defined. The data platform Urn (urn:li:platform:{platform_name})
         * 
         */
        public SchemaMetadataKey.ProjectionMask withPlatform() {
            getDataMap().put("platform", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Every change to SchemaMetadata in the resource results in a new version. Version is server assigned. This version is differ from platform native schema version.
         * 
         */
        public SchemaMetadataKey.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
