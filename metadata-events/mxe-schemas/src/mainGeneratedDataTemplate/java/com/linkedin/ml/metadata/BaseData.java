
package com.linkedin.ml.metadata;

import java.util.List;
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * BaseData record
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/BaseData.pdl.")
public class BaseData
    extends RecordTemplate
{

    private final static BaseData.Fields _fields = new BaseData.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.DatasetUrn _datasetField = null;
    private String _motivationField = null;
    private StringArray _preProcessingField = null;
    private BaseData.ChangeListener __changeListener = new BaseData.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Dataset = SCHEMA.getField("dataset");
    private final static RecordDataSchema.Field FIELD_Motivation = SCHEMA.getField("motivation");
    private final static RecordDataSchema.Field FIELD_PreProcessing = SCHEMA.getField("preProcessing");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DatasetUrn.class);
    }

    public BaseData() {
        super(new DataMap(4, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public BaseData(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static BaseData.Fields fields() {
        return _fields;
    }

    public static BaseData.ProjectionMask createMask() {
        return new BaseData.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for dataset
     * 
     * @see BaseData.Fields#dataset
     */
    public boolean hasDataset() {
        if (_datasetField!= null) {
            return true;
        }
        return super._map.containsKey("dataset");
    }

    /**
     * Remover for dataset
     * 
     * @see BaseData.Fields#dataset
     */
    public void removeDataset() {
        super._map.remove("dataset");
    }

    /**
     * Getter for dataset
     * 
     * @see BaseData.Fields#dataset
     */
    @Nullable
    public com.linkedin.common.urn.DatasetUrn getDataset(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDataset();
            case DEFAULT:
            case NULL:
                if (_datasetField!= null) {
                    return _datasetField;
                } else {
                    Object __rawValue = super._map.get("dataset");
                    _datasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetUrn.class);
                    return _datasetField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for dataset
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see BaseData.Fields#dataset
     */
    @Nonnull
    public com.linkedin.common.urn.DatasetUrn getDataset() {
        if (_datasetField!= null) {
            return _datasetField;
        } else {
            Object __rawValue = super._map.get("dataset");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("dataset");
            }
            _datasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.DatasetUrn.class);
            return _datasetField;
        }
    }

    /**
     * Setter for dataset
     * 
     * @see BaseData.Fields#dataset
     */
    public BaseData setDataset(
        @Nullable
        com.linkedin.common.urn.DatasetUrn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDataset(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field dataset of com.linkedin.ml.metadata.BaseData");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _datasetField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDataset();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _datasetField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
                    _datasetField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for dataset
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BaseData.Fields#dataset
     */
    public BaseData setDataset(
        @Nonnull
        com.linkedin.common.urn.DatasetUrn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dataset of com.linkedin.ml.metadata.BaseData to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.DatasetUrn.class));
            _datasetField = value;
        }
        return this;
    }

    /**
     * Existence checker for motivation
     * 
     * @see BaseData.Fields#motivation
     */
    public boolean hasMotivation() {
        if (_motivationField!= null) {
            return true;
        }
        return super._map.containsKey("motivation");
    }

    /**
     * Remover for motivation
     * 
     * @see BaseData.Fields#motivation
     */
    public void removeMotivation() {
        super._map.remove("motivation");
    }

    /**
     * Getter for motivation
     * 
     * @see BaseData.Fields#motivation
     */
    @Nullable
    public String getMotivation(GetMode mode) {
        return getMotivation();
    }

    /**
     * Getter for motivation
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BaseData.Fields#motivation
     */
    @Nullable
    public String getMotivation() {
        if (_motivationField!= null) {
            return _motivationField;
        } else {
            Object __rawValue = super._map.get("motivation");
            _motivationField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _motivationField;
        }
    }

    /**
     * Setter for motivation
     * 
     * @see BaseData.Fields#motivation
     */
    public BaseData setMotivation(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMotivation(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMotivation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "motivation", value);
                    _motivationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "motivation", value);
                    _motivationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for motivation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BaseData.Fields#motivation
     */
    public BaseData setMotivation(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field motivation of com.linkedin.ml.metadata.BaseData to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "motivation", value);
            _motivationField = value;
        }
        return this;
    }

    /**
     * Existence checker for preProcessing
     * 
     * @see BaseData.Fields#preProcessing
     */
    public boolean hasPreProcessing() {
        if (_preProcessingField!= null) {
            return true;
        }
        return super._map.containsKey("preProcessing");
    }

    /**
     * Remover for preProcessing
     * 
     * @see BaseData.Fields#preProcessing
     */
    public void removePreProcessing() {
        super._map.remove("preProcessing");
    }

    /**
     * Getter for preProcessing
     * 
     * @see BaseData.Fields#preProcessing
     */
    @Nullable
    public StringArray getPreProcessing(GetMode mode) {
        return getPreProcessing();
    }

    /**
     * Getter for preProcessing
     * 
     * @return
     *     Optional field. Always check for null.
     * @see BaseData.Fields#preProcessing
     */
    @Nullable
    public StringArray getPreProcessing() {
        if (_preProcessingField!= null) {
            return _preProcessingField;
        } else {
            Object __rawValue = super._map.get("preProcessing");
            _preProcessingField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _preProcessingField;
        }
    }

    /**
     * Setter for preProcessing
     * 
     * @see BaseData.Fields#preProcessing
     */
    public BaseData setPreProcessing(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPreProcessing(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePreProcessing();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "preProcessing", value.data());
                    _preProcessingField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "preProcessing", value.data());
                    _preProcessingField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for preProcessing
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see BaseData.Fields#preProcessing
     */
    public BaseData setPreProcessing(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field preProcessing of com.linkedin.ml.metadata.BaseData to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "preProcessing", value.data());
            _preProcessingField = value;
        }
        return this;
    }

    @Override
    public BaseData clone()
        throws CloneNotSupportedException
    {
        BaseData __clone = ((BaseData) super.clone());
        __clone.__changeListener = new BaseData.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public BaseData copy()
        throws CloneNotSupportedException
    {
        BaseData __copy = ((BaseData) super.copy());
        __copy._preProcessingField = null;
        __copy._motivationField = null;
        __copy._datasetField = null;
        __copy.__changeListener = new BaseData.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final BaseData __objectRef;

        private ChangeListener(BaseData reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "preProcessing":
                    __objectRef._preProcessingField = null;
                    break;
                case "motivation":
                    __objectRef._motivationField = null;
                    break;
                case "dataset":
                    __objectRef._datasetField = null;
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
         * What dataset were used in the MLModel?
         * 
         */
        public PathSpec dataset() {
            return new PathSpec(getPathComponents(), "dataset");
        }

        /**
         * Why was this dataset chosen?
         * 
         */
        public PathSpec motivation() {
            return new PathSpec(getPathComponents(), "motivation");
        }

        /**
         * How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?
         * 
         */
        public PathSpec preProcessing() {
            return new PathSpec(getPathComponents(), "preProcessing");
        }

        /**
         * How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?
         * 
         */
        public PathSpec preProcessing(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "preProcessing");
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
            super(4);
        }

        /**
         * What dataset were used in the MLModel?
         * 
         */
        public BaseData.ProjectionMask withDataset() {
            getDataMap().put("dataset", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Why was this dataset chosen?
         * 
         */
        public BaseData.ProjectionMask withMotivation() {
            getDataMap().put("motivation", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?
         * 
         */
        public BaseData.ProjectionMask withPreProcessing() {
            getDataMap().put("preProcessing", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?
         * 
         */
        public BaseData.ProjectionMask withPreProcessing(Integer start, Integer count) {
            getDataMap().put("preProcessing", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("preProcessing").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("preProcessing").put("$count", count);
            }
            return this;
        }

    }

}
