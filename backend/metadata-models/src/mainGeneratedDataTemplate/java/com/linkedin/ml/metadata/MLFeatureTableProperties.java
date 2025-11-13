
package com.linkedin.ml.metadata;

import java.util.List;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
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
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringMap;


/**
 * Properties associated with a MLFeatureTable
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/MLFeatureTableProperties.pdl.")
public class MLFeatureTableProperties
    extends RecordTemplate
{

    private final static MLFeatureTableProperties.Fields _fields = new MLFeatureTableProperties.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Properties associated with a MLFeatureTable*/@Aspect.name=\"mlFeatureTableProperties\"record MLFeatureTableProperties includes{namespace com.linkedin.common/**Misc. properties about an entity.*/record CustomProperties{/**Custom property bag.*/@Searchable.`/*`={\"fieldType\":\"TEXT\",\"queryByDefault\":true}customProperties:map[string,string]={}}}{/**Documentation of the MLFeatureTable*/@Searchable={\"fieldType\":\"TEXT\",\"hasValuesFieldName\":\"hasDescription\"}description:optional string/**List of features contained in the feature table*/@Relationship.`/*`={\"entityTypes\":[\"mlFeature\"],\"name\":\"Contains\"}@Searchable.`/*`={\"fieldName\":\"features\",\"fieldType\":\"URN\"}mlFeatures:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**List of primary keys in the feature table (if multiple, assumed to act as a composite key)*/@Relationship.`/*`={\"entityTypes\":[\"mlPrimaryKey\"],\"name\":\"KeyedBy\"}@Searchable.`/*`={\"fieldName\":\"primaryKeys\",\"fieldType\":\"URN\"}mlPrimaryKeys:optional array[com.linkedin.common.Urn]}", SchemaFormatType.PDL));
    private StringMap _customPropertiesField = null;
    private String _descriptionField = null;
    private UrnArray _mlFeaturesField = null;
    private UrnArray _mlPrimaryKeysField = null;
    private MLFeatureTableProperties.ChangeListener __changeListener = new MLFeatureTableProperties.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_CustomProperties = SCHEMA.getField("customProperties");
    private final static StringMap DEFAULT_CustomProperties;
    private final static RecordDataSchema.Field FIELD_Description = SCHEMA.getField("description");
    private final static RecordDataSchema.Field FIELD_MlFeatures = SCHEMA.getField("mlFeatures");
    private final static RecordDataSchema.Field FIELD_MlPrimaryKeys = SCHEMA.getField("mlPrimaryKeys");

    static {
        DEFAULT_CustomProperties = ((FIELD_CustomProperties.getDefault() == null)?null:new StringMap(DataTemplateUtil.castOrThrow(FIELD_CustomProperties.getDefault(), DataMap.class)));
    }

    public MLFeatureTableProperties() {
        super(new DataMap(6, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public MLFeatureTableProperties(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLFeatureTableProperties.Fields fields() {
        return _fields;
    }

    public static MLFeatureTableProperties.ProjectionMask createMask() {
        return new MLFeatureTableProperties.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for customProperties
     * 
     * @see MLFeatureTableProperties.Fields#customProperties
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
     * @see MLFeatureTableProperties.Fields#customProperties
     */
    public void removeCustomProperties() {
        super._map.remove("customProperties");
    }

    /**
     * Getter for customProperties
     * 
     * @see MLFeatureTableProperties.Fields#customProperties
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
     * @see MLFeatureTableProperties.Fields#customProperties
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
     * @see MLFeatureTableProperties.Fields#customProperties
     */
    public MLFeatureTableProperties setCustomProperties(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCustomProperties(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field customProperties of com.linkedin.ml.metadata.MLFeatureTableProperties");
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
     * @see MLFeatureTableProperties.Fields#customProperties
     */
    public MLFeatureTableProperties setCustomProperties(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field customProperties of com.linkedin.ml.metadata.MLFeatureTableProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "customProperties", value.data());
            _customPropertiesField = value;
        }
        return this;
    }

    /**
     * Existence checker for description
     * 
     * @see MLFeatureTableProperties.Fields#description
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
     * @see MLFeatureTableProperties.Fields#description
     */
    public void removeDescription() {
        super._map.remove("description");
    }

    /**
     * Getter for description
     * 
     * @see MLFeatureTableProperties.Fields#description
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
     * @see MLFeatureTableProperties.Fields#description
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
     * @see MLFeatureTableProperties.Fields#description
     */
    public MLFeatureTableProperties setDescription(
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
     * @see MLFeatureTableProperties.Fields#description
     */
    public MLFeatureTableProperties setDescription(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field description of com.linkedin.ml.metadata.MLFeatureTableProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "description", value);
            _descriptionField = value;
        }
        return this;
    }

    /**
     * Existence checker for mlFeatures
     * 
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    public boolean hasMlFeatures() {
        if (_mlFeaturesField!= null) {
            return true;
        }
        return super._map.containsKey("mlFeatures");
    }

    /**
     * Remover for mlFeatures
     * 
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    public void removeMlFeatures() {
        super._map.remove("mlFeatures");
    }

    /**
     * Getter for mlFeatures
     * 
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    @Nullable
    public UrnArray getMlFeatures(GetMode mode) {
        return getMlFeatures();
    }

    /**
     * Getter for mlFeatures
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    @Nullable
    public UrnArray getMlFeatures() {
        if (_mlFeaturesField!= null) {
            return _mlFeaturesField;
        } else {
            Object __rawValue = super._map.get("mlFeatures");
            _mlFeaturesField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _mlFeaturesField;
        }
    }

    /**
     * Setter for mlFeatures
     * 
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    public MLFeatureTableProperties setMlFeatures(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMlFeatures(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMlFeatures();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "mlFeatures", value.data());
                    _mlFeaturesField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "mlFeatures", value.data());
                    _mlFeaturesField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for mlFeatures
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureTableProperties.Fields#mlFeatures
     */
    public MLFeatureTableProperties setMlFeatures(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field mlFeatures of com.linkedin.ml.metadata.MLFeatureTableProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "mlFeatures", value.data());
            _mlFeaturesField = value;
        }
        return this;
    }

    /**
     * Existence checker for mlPrimaryKeys
     * 
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    public boolean hasMlPrimaryKeys() {
        if (_mlPrimaryKeysField!= null) {
            return true;
        }
        return super._map.containsKey("mlPrimaryKeys");
    }

    /**
     * Remover for mlPrimaryKeys
     * 
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    public void removeMlPrimaryKeys() {
        super._map.remove("mlPrimaryKeys");
    }

    /**
     * Getter for mlPrimaryKeys
     * 
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    @Nullable
    public UrnArray getMlPrimaryKeys(GetMode mode) {
        return getMlPrimaryKeys();
    }

    /**
     * Getter for mlPrimaryKeys
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    @Nullable
    public UrnArray getMlPrimaryKeys() {
        if (_mlPrimaryKeysField!= null) {
            return _mlPrimaryKeysField;
        } else {
            Object __rawValue = super._map.get("mlPrimaryKeys");
            _mlPrimaryKeysField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _mlPrimaryKeysField;
        }
    }

    /**
     * Setter for mlPrimaryKeys
     * 
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    public MLFeatureTableProperties setMlPrimaryKeys(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMlPrimaryKeys(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMlPrimaryKeys();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "mlPrimaryKeys", value.data());
                    _mlPrimaryKeysField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "mlPrimaryKeys", value.data());
                    _mlPrimaryKeysField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for mlPrimaryKeys
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLFeatureTableProperties.Fields#mlPrimaryKeys
     */
    public MLFeatureTableProperties setMlPrimaryKeys(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field mlPrimaryKeys of com.linkedin.ml.metadata.MLFeatureTableProperties to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "mlPrimaryKeys", value.data());
            _mlPrimaryKeysField = value;
        }
        return this;
    }

    @Override
    public MLFeatureTableProperties clone()
        throws CloneNotSupportedException
    {
        MLFeatureTableProperties __clone = ((MLFeatureTableProperties) super.clone());
        __clone.__changeListener = new MLFeatureTableProperties.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLFeatureTableProperties copy()
        throws CloneNotSupportedException
    {
        MLFeatureTableProperties __copy = ((MLFeatureTableProperties) super.copy());
        __copy._customPropertiesField = null;
        __copy._mlFeaturesField = null;
        __copy._descriptionField = null;
        __copy._mlPrimaryKeysField = null;
        __copy.__changeListener = new MLFeatureTableProperties.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLFeatureTableProperties __objectRef;

        private ChangeListener(MLFeatureTableProperties reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "customProperties":
                    __objectRef._customPropertiesField = null;
                    break;
                case "mlFeatures":
                    __objectRef._mlFeaturesField = null;
                    break;
                case "description":
                    __objectRef._descriptionField = null;
                    break;
                case "mlPrimaryKeys":
                    __objectRef._mlPrimaryKeysField = null;
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
         * Documentation of the MLFeatureTable
         * 
         */
        public PathSpec description() {
            return new PathSpec(getPathComponents(), "description");
        }

        /**
         * List of features contained in the feature table
         * 
         */
        public PathSpec mlFeatures() {
            return new PathSpec(getPathComponents(), "mlFeatures");
        }

        /**
         * List of features contained in the feature table
         * 
         */
        public PathSpec mlFeatures(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "mlFeatures");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * List of primary keys in the feature table (if multiple, assumed to act as a composite key)
         * 
         */
        public PathSpec mlPrimaryKeys() {
            return new PathSpec(getPathComponents(), "mlPrimaryKeys");
        }

        /**
         * List of primary keys in the feature table (if multiple, assumed to act as a composite key)
         * 
         */
        public PathSpec mlPrimaryKeys(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "mlPrimaryKeys");
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


        ProjectionMask() {
            super(6);
        }

        /**
         * Custom property bag.
         * 
         */
        public MLFeatureTableProperties.ProjectionMask withCustomProperties() {
            getDataMap().put("customProperties", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Documentation of the MLFeatureTable
         * 
         */
        public MLFeatureTableProperties.ProjectionMask withDescription() {
            getDataMap().put("description", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of features contained in the feature table
         * 
         */
        public MLFeatureTableProperties.ProjectionMask withMlFeatures() {
            getDataMap().put("mlFeatures", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of features contained in the feature table
         * 
         */
        public MLFeatureTableProperties.ProjectionMask withMlFeatures(Integer start, Integer count) {
            getDataMap().put("mlFeatures", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("mlFeatures").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("mlFeatures").put("$count", count);
            }
            return this;
        }

        /**
         * List of primary keys in the feature table (if multiple, assumed to act as a composite key)
         * 
         */
        public MLFeatureTableProperties.ProjectionMask withMlPrimaryKeys() {
            getDataMap().put("mlPrimaryKeys", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * List of primary keys in the feature table (if multiple, assumed to act as a composite key)
         * 
         */
        public MLFeatureTableProperties.ProjectionMask withMlPrimaryKeys(Integer start, Integer count) {
            getDataMap().put("mlPrimaryKeys", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("mlPrimaryKeys").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("mlPrimaryKeys").put("$count", count);
            }
            return this;
        }

    }

}
