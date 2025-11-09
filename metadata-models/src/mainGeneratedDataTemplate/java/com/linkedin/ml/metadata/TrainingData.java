
package com.linkedin.ml.metadata;

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
 * Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/TrainingData.pdl.")
public class TrainingData
    extends RecordTemplate
{

    private final static TrainingData.Fields _fields = new TrainingData.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Ideally, the MLModel card would contain as much information about the training data as the evaluation data. However, there might be cases where it is not feasible to provide this level of detailed information about the training data. For example, the data may be proprietary, or require a non-disclosure agreement. In these cases, we advocate for basic details about the distributions over groups in the data, as well as any other details that could inform stakeholders on the kinds of biases the model may have encoded.*/@Aspect.name=\"mlModelTrainingData\"record TrainingData{/**Details on the dataset(s) used for training the MLModel*/trainingData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}", SchemaFormatType.PDL));
    private BaseDataArray _trainingDataField = null;
    private TrainingData.ChangeListener __changeListener = new TrainingData.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_TrainingData = SCHEMA.getField("trainingData");

    public TrainingData() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public TrainingData(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TrainingData.Fields fields() {
        return _fields;
    }

    public static TrainingData.ProjectionMask createMask() {
        return new TrainingData.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for trainingData
     * 
     * @see TrainingData.Fields#trainingData
     */
    public boolean hasTrainingData() {
        if (_trainingDataField!= null) {
            return true;
        }
        return super._map.containsKey("trainingData");
    }

    /**
     * Remover for trainingData
     * 
     * @see TrainingData.Fields#trainingData
     */
    public void removeTrainingData() {
        super._map.remove("trainingData");
    }

    /**
     * Getter for trainingData
     * 
     * @see TrainingData.Fields#trainingData
     */
    @Nullable
    public BaseDataArray getTrainingData(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getTrainingData();
            case DEFAULT:
            case NULL:
                if (_trainingDataField!= null) {
                    return _trainingDataField;
                } else {
                    Object __rawValue = super._map.get("trainingData");
                    _trainingDataField = ((__rawValue == null)?null:new BaseDataArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _trainingDataField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for trainingData
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TrainingData.Fields#trainingData
     */
    @Nonnull
    public BaseDataArray getTrainingData() {
        if (_trainingDataField!= null) {
            return _trainingDataField;
        } else {
            Object __rawValue = super._map.get("trainingData");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("trainingData");
            }
            _trainingDataField = ((__rawValue == null)?null:new BaseDataArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _trainingDataField;
        }
    }

    /**
     * Setter for trainingData
     * 
     * @see TrainingData.Fields#trainingData
     */
    public TrainingData setTrainingData(
        @Nullable
        BaseDataArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTrainingData(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field trainingData of com.linkedin.ml.metadata.TrainingData");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "trainingData", value.data());
                    _trainingDataField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTrainingData();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "trainingData", value.data());
                    _trainingDataField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "trainingData", value.data());
                    _trainingDataField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for trainingData
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TrainingData.Fields#trainingData
     */
    public TrainingData setTrainingData(
        @Nonnull
        BaseDataArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field trainingData of com.linkedin.ml.metadata.TrainingData to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "trainingData", value.data());
            _trainingDataField = value;
        }
        return this;
    }

    @Override
    public TrainingData clone()
        throws CloneNotSupportedException
    {
        TrainingData __clone = ((TrainingData) super.clone());
        __clone.__changeListener = new TrainingData.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TrainingData copy()
        throws CloneNotSupportedException
    {
        TrainingData __copy = ((TrainingData) super.copy());
        __copy._trainingDataField = null;
        __copy.__changeListener = new TrainingData.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TrainingData __objectRef;

        private ChangeListener(TrainingData reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "trainingData":
                    __objectRef._trainingDataField = null;
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
         * Details on the dataset(s) used for training the MLModel
         * 
         */
        public com.linkedin.ml.metadata.BaseDataArray.Fields trainingData() {
            return new com.linkedin.ml.metadata.BaseDataArray.Fields(getPathComponents(), "trainingData");
        }

        /**
         * Details on the dataset(s) used for training the MLModel
         * 
         */
        public PathSpec trainingData(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "trainingData");
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

        private com.linkedin.ml.metadata.BaseDataArray.ProjectionMask _trainingDataMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Details on the dataset(s) used for training the MLModel
         * 
         */
        public TrainingData.ProjectionMask withTrainingData(Function<com.linkedin.ml.metadata.BaseDataArray.ProjectionMask, com.linkedin.ml.metadata.BaseDataArray.ProjectionMask> nestedMask) {
            _trainingDataMask = nestedMask.apply(((_trainingDataMask == null)?BaseDataArray.createMask():_trainingDataMask));
            getDataMap().put("trainingData", _trainingDataMask.getDataMap());
            return this;
        }

        /**
         * Details on the dataset(s) used for training the MLModel
         * 
         */
        public TrainingData.ProjectionMask withTrainingData() {
            _trainingDataMask = null;
            getDataMap().put("trainingData", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Details on the dataset(s) used for training the MLModel
         * 
         */
        public TrainingData.ProjectionMask withTrainingData(Function<com.linkedin.ml.metadata.BaseDataArray.ProjectionMask, com.linkedin.ml.metadata.BaseDataArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _trainingDataMask = nestedMask.apply(((_trainingDataMask == null)?BaseDataArray.createMask():_trainingDataMask));
            getDataMap().put("trainingData", _trainingDataMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("trainingData").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("trainingData").put("$count", count);
            }
            return this;
        }

        /**
         * Details on the dataset(s) used for training the MLModel
         * 
         */
        public TrainingData.ProjectionMask withTrainingData(Integer start, Integer count) {
            _trainingDataMask = null;
            getDataMap().put("trainingData", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("trainingData").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("trainingData").put("$count", count);
            }
            return this;
        }

    }

}
