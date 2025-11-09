
package com.linkedin.versionset;

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
import com.linkedin.data.template.StringMap;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/versionset/VersionSetProperties.pdl.")
public class VersionSetProperties
    extends RecordTemplate
{

    private final static VersionSetProperties.Fields _fields = new VersionSetProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.versionset@Aspect.name=\"versionSetProperties\"record VersionSetProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**The latest versioned entity linked to in this version set*/@Searchable.queryByDefault=\"false\"latest:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**What versioning scheme is being utilized for the versioned entities sort criterion. Static once set*/versioningScheme:enum VersioningScheme{/**String sorted lexicographically.*/LEXICOGRAPHIC_STRING/**String managed by DataHub. Currently, an 8 character alphabetical string.*/ALPHANUMERIC_GENERATED_BY_DATAHUB}}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private com.linkedin.common.urn.Urn _latestField = null;
    private VersioningScheme _versioningSchemeField = null;
    private VersionSetProperties.ChangeListener __changeListener = new VersionSetProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_Latest = SCHEMA.getField("latest");
    private final static RecordDataSchema.Field FIELD_VersioningScheme = SCHEMA.getField("versioningScheme");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public VersionSetProperties() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public VersionSetProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static VersionSetProperties.Fields fields() {
        return _fields;
    }

    public static VersionSetProperties.ProjectionMask createMask() {
        return new VersionSetProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see VersionSetProperties.Fields#customProperties
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
     * @see VersionSetProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see VersionSetProperties.Fields#customProperties
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
     * @see VersionSetProperties.Fields#customProperties
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
     * @see VersionSetProperties.Fields#customProperties
     */
    public VersionSetProperties setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.versionset.VersionSetProperties");
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
     * @see VersionSetProperties.Fields#customProperties
     */
    public VersionSetProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.versionset.VersionSetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for latest
     * 
     * @see VersionSetProperties.Fields#latest
     */
    public boolean hasLatest() {
        if (_latestField!= null) {
            return true;
        }
        return super._map.containsKey("latest");
    }

    /**
     * Remover for latest
     * 
     * @see VersionSetProperties.Fields#latest
     */
    public void removeLatest() {
        super._map.remove("latest");
    }

    /**
     * Getter for latest
     * 
     * @see VersionSetProperties.Fields#latest
     */
    @Nullable
    public com.linkedin.common.urn.Urn getLatest(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLatest();
            case DEFAULT:
            case NULL:
                if (_latestField!= null) {
                    return _latestField;
                } else {
                    Object __rawValue = super._map.get("latest");
                    _latestField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _latestField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for latest
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see VersionSetProperties.Fields#latest
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getLatest() {
        if (_latestField!= null) {
            return _latestField;
        } else {
            Object __rawValue = super._map.get("latest");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("latest");
            }
            _latestField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _latestField;
        }
    }

    /**
     * Setter for latest
     * 
     * @see VersionSetProperties.Fields#latest
     */
    public VersionSetProperties setLatest(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLatest(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field latest of com.linkedin.versionset.VersionSetProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "latest", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _latestField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLatest();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "latest", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _latestField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "latest", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _latestField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for latest
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionSetProperties.Fields#latest
     */
    public VersionSetProperties setLatest(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field latest of com.linkedin.versionset.VersionSetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "latest", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _latestField = value;
        }
        return this;
    }

    /**
     * Existence checker for versioningScheme
     * 
     * @see VersionSetProperties.Fields#versioningScheme
     */
    public boolean hasVersioningScheme() {
        if (_versioningSchemeField!= null) {
            return true;
        }
        return super._map.containsKey("versioningScheme");
    }

    /**
     * Remover for versioningScheme
     * 
     * @see VersionSetProperties.Fields#versioningScheme
     */
    public void removeVersioningScheme() {
        super._map.remove("versioningScheme");
    }

    /**
     * Getter for versioningScheme
     * 
     * @see VersionSetProperties.Fields#versioningScheme
     */
    @Nullable
    public VersioningScheme getVersioningScheme(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getVersioningScheme();
            case DEFAULT:
            case NULL:
                if (_versioningSchemeField!= null) {
                    return _versioningSchemeField;
                } else {
                    Object __rawValue = super._map.get("versioningScheme");
                    _versioningSchemeField = DataTemplateUtil.coerceEnumOutput(__rawValue, VersioningScheme.class, VersioningScheme.$UNKNOWN);
                    return _versioningSchemeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for versioningScheme
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see VersionSetProperties.Fields#versioningScheme
     */
    @Nonnull
    public VersioningScheme getVersioningScheme() {
        if (_versioningSchemeField!= null) {
            return _versioningSchemeField;
        } else {
            Object __rawValue = super._map.get("versioningScheme");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("versioningScheme");
            }
            _versioningSchemeField = DataTemplateUtil.coerceEnumOutput(__rawValue, VersioningScheme.class, VersioningScheme.$UNKNOWN);
            return _versioningSchemeField;
        }
    }

    /**
     * Setter for versioningScheme
     * 
     * @see VersionSetProperties.Fields#versioningScheme
     */
    public VersionSetProperties setVersioningScheme(
        @Nullable
        VersioningScheme value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setVersioningScheme(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field versioningScheme of com.linkedin.versionset.VersionSetProperties");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "versioningScheme", value.name());
                    _versioningSchemeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeVersioningScheme();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "versioningScheme", value.name());
                    _versioningSchemeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "versioningScheme", value.name());
                    _versioningSchemeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for versioningScheme
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VersionSetProperties.Fields#versioningScheme
     */
    public VersionSetProperties setVersioningScheme(
        @Nonnull
        VersioningScheme value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field versioningScheme of com.linkedin.versionset.VersionSetProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "versioningScheme", value.name());
            _versioningSchemeField = value;
        }
        return this;
    }

    @Override
    public VersionSetProperties clone()
        throws CloneNotSupportedException
    {
        VersionSetProperties __clone = ((VersionSetProperties) super.clone());
        __clone.__changeListener = new VersionSetProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public VersionSetProperties copy()
        throws CloneNotSupportedException
    {
        VersionSetProperties __copy = ((VersionSetProperties) super.copy());
        __copy._customPropertiesField = null;
        __copy._versioningSchemeField = null;
        __copy._latestField = null;
        __copy.__changeListener = new VersionSetProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final VersionSetProperties __objectRef;

        private ChangeListener(VersionSetProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "versioningScheme":
                    __objectRef._versioningSchemeField = null;
                    break;
                case "latest":
                    __objectRef._latestField = null;
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
         * The latest versioned entity linked to in this version set
         * 
         */
        public PathSpec latest() {
            return new PathSpec(getPathComponents(), "latest");
        }

        /**
         * What versioning scheme is being utilized for the versioned entities sort criterion. Static once set
         * 
         */
        public PathSpec versioningScheme() {
            return new PathSpec(getPathComponents(), "versioningScheme");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(4);
        }

        /**
         * Custom property bag.
         * 
         */
        public VersionSetProperties.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The latest versioned entity linked to in this version set
         * 
         */
        public VersionSetProperties.ProjectionMask withLatest() {
            getDataMap().put("latest", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * What versioning scheme is being utilized for the versioned entities sort criterion. Static once set
         * 
         */
        public VersionSetProperties.ProjectionMask withVersioningScheme() {
            getDataMap().put("versioningScheme", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
