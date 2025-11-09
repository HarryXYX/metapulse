
package com.linkedin.datajob;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Information about a Data processing job
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/datajob/VersionInfo.pdl.")
public class VersionInfo
    extends RecordTemplate
{

    private final static VersionInfo.Fields _fields = new VersionInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datajob/**Information about a Data processing job*/@Aspect.name=\"versionInfo\"record VersionInfo includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{namespace com.linkedin.common/**A reference to an external platform.*/record ExternalReference{/**URL where the reference exist*/@Searchable.fieldType=\"KEYWORD\"externalUrl:optional@java={\"class\":\"com.linkedin.common.url.Url\",\"coercerClass\":\"com.linkedin.common.url.UrlCoercer\"}typeref Url=string}}{/**The version which can indentify a job version like a commit hash or md5 hash*/version:string/**The type of the version like git hash or md5 hash*/versionType:string}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.url.Url _externalUrlField = null;
    private String _versionField = null;
    private String _versionTypeField = null;
    private VersionInfo.ChangeListener __changeListener = new VersionInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_ExternalUrl = SCHEMA.getField("externalUrl");
    private final static RecordDataSchema.Field FIELD_Version = SCHEMA.getField("version");
    private final static RecordDataSchema.Field FIELD_VersionType = SCHEMA.getField("versionType");

    static {
        Custom.initializeCustomClass(com.linkedin.common.url.Url.class);
        Custom.initializeCoercerClass(UrlCoercer.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public VersionInfo() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public VersionInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static VersionInfo.Fields fields() {
        return _fields;
    }

    public static VersionInfo.ProjectionMask createMask() {
        return new VersionInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see VersionInfo.Fields#customProperties
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
     * @see VersionInfo.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see VersionInfo.Fields#customProperties
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
     * @see VersionInfo.Fields#customProperties
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
     * @see VersionInfo.Fields#customProperties
     */
    public VersionInfo setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.datajob.VersionInfo");
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
     * @see VersionInfo.Fields#customProperties
     */
    public VersionInfo setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.datajob.VersionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for externalUrl
     * 
     * @see VersionInfo.Fields#externalUrl
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
     * @see VersionInfo.Fields#externalUrl
     */
    public void removeExternalUrl() {
        super._map.remove("externalUrl");
    }

    /**
     * Getter for externalUrl
     * 
     * @see VersionInfo.Fields#externalUrl
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
     * @see VersionInfo.Fields#externalUrl
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
     * @see VersionInfo.Fields#externalUrl
     */
    public VersionInfo setExternalUrl(
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
     * @see VersionInfo.Fields#externalUrl
     */
    public VersionInfo setExternalUrl(
        @Nonnull
        com.linkedin.common.url.Url value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field externalUrl of com.linkedin.datajob.VersionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "externalUrl", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.url.Url.class));
            _externalUrlField = value;
        }
        return this;
    }

    /**
     * Existence checker for version
     * 
     * @see VersionInfo.Fields#version
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
     * @see VersionInfo.Fields#version
     */
    public void removeVersion() {
        super._map.remove("version");
    }

    /**
     * Getter for version
     * 
     * @see VersionInfo.Fields#version
     */
    @Nullable
    public String getVersion(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVersion();
            case DEFAULT:
            case NULL:
                if (_versionField!= null) {
                    return _versionField;
                } else {
                    Object __rawValue = super._map.get("version");
                    _versionField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see VersionInfo.Fields#version
     */
    @Nonnull
    public String getVersion() {
        if (_versionField!= null) {
            return _versionField;
        } else {
            Object __rawValue = super._map.get("version");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("version");
            }
            _versionField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _versionField;
        }
    }

    /**
     * Setter for version
     * 
     * @see VersionInfo.Fields#version
     */
    public VersionInfo setVersion(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersion(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field version of com.linkedin.datajob.VersionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
                    _versionField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
                    _versionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "version", value);
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
     * @see VersionInfo.Fields#version
     */
    public VersionInfo setVersion(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field version of com.linkedin.datajob.VersionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "version", value);
            _versionField = value;
        }
        return this;
    }

    /**
     * Existence checker for versionType
     * 
     * @see VersionInfo.Fields#versionType
     */
    public boolean hasVersionType() {
        if (_versionTypeField!= null) {
            return true;
        }
        return super._map.containsKey("versionType");
    }

    /**
     * Remover for versionType
     * 
     * @see VersionInfo.Fields#versionType
     */
    public void removeVersionType() {
        super._map.remove("versionType");
    }

    /**
     * Getter for versionType
     * 
     * @see VersionInfo.Fields#versionType
     */
    @Nullable
    public String getVersionType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVersionType();
            case DEFAULT:
            case NULL:
                if (_versionTypeField!= null) {
                    return _versionTypeField;
                } else {
                    Object __rawValue = super._map.get("versionType");
                    _versionTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _versionTypeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for versionType
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see VersionInfo.Fields#versionType
     */
    @Nonnull
    public String getVersionType() {
        if (_versionTypeField!= null) {
            return _versionTypeField;
        } else {
            Object __rawValue = super._map.get("versionType");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("versionType");
            }
            _versionTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _versionTypeField;
        }
    }

    /**
     * Setter for versionType
     * 
     * @see VersionInfo.Fields#versionType
     */
    public VersionInfo setVersionType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersionType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field versionType of com.linkedin.datajob.VersionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "versionType", value);
                    _versionTypeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersionType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "versionType", value);
                    _versionTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "versionType", value);
                    _versionTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for versionType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionInfo.Fields#versionType
     */
    public VersionInfo setVersionType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field versionType of com.linkedin.datajob.VersionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "versionType", value);
            _versionTypeField = value;
        }
        return this;
    }

    @Override
    public VersionInfo clone()
        throws CloneNotSupportedException
    {
        VersionInfo __clone = ((VersionInfo) super.clone());
        __clone.__changeListener = new VersionInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public VersionInfo copy()
        throws CloneNotSupportedException
    {
        VersionInfo __copy = ((VersionInfo) super.copy());
        __copy._versionTypeField = null;
        __copy._externalUrlField = null;
        __copy._customPropertiesField = null;
        __copy._versionField = null;
        __copy.__changeListener = new VersionInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final VersionInfo __objectRef;

        private ChangeListener(VersionInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "versionType":
                    __objectRef._versionTypeField = null;
                    break;
                case "externalUrl":
                    __objectRef._externalUrlField = null;
                    break;
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "version":
                    __objectRef._versionField = null;
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
         * The version which can indentify a job version like a commit hash or md5 hash
         * 
         */
        public PathSpec version() {
            return new PathSpec(getPathComponents(), "version");
        }

        /**
         * The type of the version like git hash or md5 hash
         * 
         */
        public PathSpec versionType() {
            return new PathSpec(getPathComponents(), "versionType");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(6);
        }

        /**
         * Custom property bag.
         * 
         */
        public VersionInfo.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * URL where the reference exist
         * 
         */
        public VersionInfo.ProjectionMask withExternalUrl() {
            getDataMap().put("externalUrl", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The version which can indentify a job version like a commit hash or md5 hash
         * 
         */
        public VersionInfo.ProjectionMask withVersion() {
            getDataMap().put("version", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the version like git hash or md5 hash
         * 
         */
        public VersionInfo.ProjectionMask withVersionType() {
            getDataMap().put("versionType", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
