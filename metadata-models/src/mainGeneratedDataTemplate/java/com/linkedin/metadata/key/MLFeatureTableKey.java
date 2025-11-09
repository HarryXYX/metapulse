
package com.linkedin.metadata.key;

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
 * Key for an MLFeatureTable
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/key/MLFeatureTableKey.pdl.")
public class MLFeatureTableKey
    extends RecordTemplate
{

    private final static MLFeatureTableKey.Fields _fields = new MLFeatureTableKey.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.key/**Key for an MLFeatureTable*/@Aspect.name=\"mlFeatureTableKey\"record MLFeatureTableKey{/**Data platform urn associated with the feature table*/@Relationship={\"entityTypes\":[\"dataPlatform\"],\"name\":\"SourcePlatform\"}platform:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Name of the feature table*/@Searchable={\"boostScore\":8.0,\"enableAutocomplete\":true,\"fieldNameAliases\":[\"_entityName\"],\"fieldType\":\"WORD_GRAM\",\"searchLabel\":\"entityName\",\"searchTier\":1}name:string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _platformField = null;
    private String _nameField = null;
    private MLFeatureTableKey.ChangeListener __changeListener = new MLFeatureTableKey.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Platform = SCHEMA.getField("platform");
    private final static RecordDataSchema.Field FIELD_Name = SCHEMA.getField("name");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public MLFeatureTableKey() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public MLFeatureTableKey(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLFeatureTableKey.Fields fields() {
        return _fields;
    }

    public static MLFeatureTableKey.ProjectionMask createMask() {
        return new MLFeatureTableKey.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for platform
     * 
     * @see MLFeatureTableKey.Fields#platform
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
     * @see MLFeatureTableKey.Fields#platform
     */
    public void removePlatform() {
        super._map.remove("platform");
    }

    /**
     * Getter for platform
     * 
     * @see MLFeatureTableKey.Fields#platform
     */
    @Nullable
    public com.linkedin.common.urn.Urn getPlatform(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getPlatform();
            case DEFAULT:
            case NULL:
                if (_platformField!= null) {
                    return _platformField;
                } else {
                    Object __rawValue = super._map.get("platform");
                    _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
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
     * @see MLFeatureTableKey.Fields#platform
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getPlatform() {
        if (_platformField!= null) {
            return _platformField;
        } else {
            Object __rawValue = super._map.get("platform");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("platform");
            }
            _platformField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _platformField;
        }
    }

    /**
     * Setter for platform
     * 
     * @see MLFeatureTableKey.Fields#platform
     */
    public MLFeatureTableKey setPlatform(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPlatform(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field platform of com.linkedin.metadata.key.MLFeatureTableKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _platformField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePlatform();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _platformField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
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
     * @see MLFeatureTableKey.Fields#platform
     */
    public MLFeatureTableKey setPlatform(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field platform of com.linkedin.metadata.key.MLFeatureTableKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "platform", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _platformField = value;
        }
        return this;
    }

    /**
     * Existence checker for name
     * 
     * @see MLFeatureTableKey.Fields#name
     */
    public boolean hasName() {
        if (_nameField!= null) {
            return true;
        }
        return super._map.containsKey("name");
    }

    /**
     * Remover for name
     * 
     * @see MLFeatureTableKey.Fields#name
     */
    public void removeName() {
        super._map.remove("name");
    }

    /**
     * Getter for name
     * 
     * @see MLFeatureTableKey.Fields#name
     */
    @Nullable
    public String getName(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getName();
            case DEFAULT:
            case NULL:
                if (_nameField!= null) {
                    return _nameField;
                } else {
                    Object __rawValue = super._map.get("name");
                    _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _nameField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for name
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see MLFeatureTableKey.Fields#name
     */
    @Nonnull
    public String getName() {
        if (_nameField!= null) {
            return _nameField;
        } else {
            Object __rawValue = super._map.get("name");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("name");
            }
            _nameField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nameField;
        }
    }

    /**
     * Setter for name
     * 
     * @see MLFeatureTableKey.Fields#name
     */
    public MLFeatureTableKey setName(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setName(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field name of com.linkedin.metadata.key.MLFeatureTableKey");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeName();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "name", value);
                    _nameField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for name
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureTableKey.Fields#name
     */
    public MLFeatureTableKey setName(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field name of com.linkedin.metadata.key.MLFeatureTableKey to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "name", value);
            _nameField = value;
        }
        return this;
    }

    @Override
    public MLFeatureTableKey clone()
        throws CloneNotSupportedException
    {
        MLFeatureTableKey __clone = ((MLFeatureTableKey) super.clone());
        __clone.__changeListener = new MLFeatureTableKey.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLFeatureTableKey copy()
        throws CloneNotSupportedException
    {
        MLFeatureTableKey __copy = ((MLFeatureTableKey) super.copy());
        __copy._nameField = null;
        __copy._platformField = null;
        __copy.__changeListener = new MLFeatureTableKey.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLFeatureTableKey __objectRef;

        private ChangeListener(MLFeatureTableKey reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "name":
                    __objectRef._nameField = null;
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
         * Data platform urn associated with the feature table
         * 
         */
        public PathSpec platform() {
            return new PathSpec(getPathComponents(), "platform");
        }

        /**
         * Name of the feature table
         * 
         */
        public PathSpec name() {
            return new PathSpec(getPathComponents(), "name");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Data platform urn associated with the feature table
         * 
         */
        public MLFeatureTableKey.ProjectionMask withPlatform() {
            getDataMap().put("platform", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Name of the feature table
         * 
         */
        public MLFeatureTableKey.ProjectionMask withName() {
            getDataMap().put("name", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
