
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
 * All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/EvaluationData.pdl.")
public class EvaluationData
    extends RecordTemplate
{

    private final static EvaluationData.Fields _fields = new EvaluationData.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**All referenced datasets would ideally point to any set of documents that provide visibility into the source and composition of the dataset.*/@Aspect.name=\"mlModelEvaluationData\"record EvaluationData{/**Details on the dataset(s) used for the quantitative analyses in the MLModel*/evaluationData:array[/**BaseData record*/record BaseData{/**What dataset were used in the MLModel?*/dataset:{namespace com.linkedin.common/**Standardized dataset identifier.*/@java.class=\"com.linkedin.common.urn.DatasetUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dataset identifier.\",\"entityType\":\"dataset\",\"fields\":[{\"doc\":\"Standardized platform urn where dataset is defined.\",\"name\":\"platform\",\"type\":\"com.linkedin.common.urn.DataPlatformUrn\"},{\"doc\":\"Dataset native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":210,\"name\":\"datasetName\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"Dataset\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DatasetUrn=string}/**Why was this dataset chosen?*/motivation:optional string/**How was the data preprocessed (e.g., tokenization of sentences, cropping of images, any filtering such as dropping images without faces)?*/preProcessing:optional array[string]}]}", SchemaFormatType.PDL));
    private BaseDataArray _evaluationDataField = null;
    private EvaluationData.ChangeListener __changeListener = new EvaluationData.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_EvaluationData = SCHEMA.getField("evaluationData");

    public EvaluationData() {
        super(new DataMap(2, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public EvaluationData(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static EvaluationData.Fields fields() {
        return _fields;
    }

    public static EvaluationData.ProjectionMask createMask() {
        return new EvaluationData.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for evaluationData
     * 
     * @see EvaluationData.Fields#evaluationData
     */
    public boolean hasEvaluationData() {
        if (_evaluationDataField!= null) {
            return true;
        }
        return super._map.containsKey("evaluationData");
    }

    /**
     * Remover for evaluationData
     * 
     * @see EvaluationData.Fields#evaluationData
     */
    public void removeEvaluationData() {
        super._map.remove("evaluationData");
    }

    /**
     * Getter for evaluationData
     * 
     * @see EvaluationData.Fields#evaluationData
     */
    @Nullable
    public BaseDataArray getEvaluationData(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEvaluationData();
            case DEFAULT:
            case NULL:
                if (_evaluationDataField!= null) {
                    return _evaluationDataField;
                } else {
                    Object __rawValue = super._map.get("evaluationData");
                    _evaluationDataField = ((__rawValue == null)?null:new BaseDataArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
                    return _evaluationDataField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for evaluationData
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see EvaluationData.Fields#evaluationData
     */
    @Nonnull
    public BaseDataArray getEvaluationData() {
        if (_evaluationDataField!= null) {
            return _evaluationDataField;
        } else {
            Object __rawValue = super._map.get("evaluationData");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("evaluationData");
            }
            _evaluationDataField = ((__rawValue == null)?null:new BaseDataArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _evaluationDataField;
        }
    }

    /**
     * Setter for evaluationData
     * 
     * @see EvaluationData.Fields#evaluationData
     */
    public EvaluationData setEvaluationData(
        @Nullable
        BaseDataArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEvaluationData(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field evaluationData of com.linkedin.ml.metadata.EvaluationData");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "evaluationData", value.data());
                    _evaluationDataField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEvaluationData();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "evaluationData", value.data());
                    _evaluationDataField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "evaluationData", value.data());
                    _evaluationDataField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for evaluationData
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see EvaluationData.Fields#evaluationData
     */
    public EvaluationData setEvaluationData(
        @Nonnull
        BaseDataArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field evaluationData of com.linkedin.ml.metadata.EvaluationData to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "evaluationData", value.data());
            _evaluationDataField = value;
        }
        return this;
    }

    @Override
    public EvaluationData clone()
        throws CloneNotSupportedException
    {
        EvaluationData __clone = ((EvaluationData) super.clone());
        __clone.__changeListener = new EvaluationData.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public EvaluationData copy()
        throws CloneNotSupportedException
    {
        EvaluationData __copy = ((EvaluationData) super.copy());
        __copy._evaluationDataField = null;
        __copy.__changeListener = new EvaluationData.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final EvaluationData __objectRef;

        private ChangeListener(EvaluationData reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "evaluationData":
                    __objectRef._evaluationDataField = null;
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
         * Details on the dataset(s) used for the quantitative analyses in the MLModel
         * 
         */
        public com.linkedin.ml.metadata.BaseDataArray.Fields evaluationData() {
            return new com.linkedin.ml.metadata.BaseDataArray.Fields(getPathComponents(), "evaluationData");
        }

        /**
         * Details on the dataset(s) used for the quantitative analyses in the MLModel
         * 
         */
        public PathSpec evaluationData(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "evaluationData");
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

        private com.linkedin.ml.metadata.BaseDataArray.ProjectionMask _evaluationDataMask;

        ProjectionMask() {
            super(2);
        }

        /**
         * Details on the dataset(s) used for the quantitative analyses in the MLModel
         * 
         */
        public EvaluationData.ProjectionMask withEvaluationData(Function<com.linkedin.ml.metadata.BaseDataArray.ProjectionMask, com.linkedin.ml.metadata.BaseDataArray.ProjectionMask> nestedMask) {
            _evaluationDataMask = nestedMask.apply(((_evaluationDataMask == null)?BaseDataArray.createMask():_evaluationDataMask));
            getDataMap().put("evaluationData", _evaluationDataMask.getDataMap());
            return this;
        }

        /**
         * Details on the dataset(s) used for the quantitative analyses in the MLModel
         * 
         */
        public EvaluationData.ProjectionMask withEvaluationData() {
            _evaluationDataMask = null;
            getDataMap().put("evaluationData", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Details on the dataset(s) used for the quantitative analyses in the MLModel
         * 
         */
        public EvaluationData.ProjectionMask withEvaluationData(Function<com.linkedin.ml.metadata.BaseDataArray.ProjectionMask, com.linkedin.ml.metadata.BaseDataArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _evaluationDataMask = nestedMask.apply(((_evaluationDataMask == null)?BaseDataArray.createMask():_evaluationDataMask));
            getDataMap().put("evaluationData", _evaluationDataMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("evaluationData").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("evaluationData").put("$count", count);
            }
            return this;
        }

        /**
         * Details on the dataset(s) used for the quantitative analyses in the MLModel
         * 
         */
        public EvaluationData.ProjectionMask withEvaluationData(Integer start, Integer count) {
            _evaluationDataMask = null;
            getDataMap().put("evaluationData", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("evaluationData").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("evaluationData").put("$count", count);
            }
            return this;
        }

    }

}
