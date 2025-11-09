
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
import com.linkedin.data.template.SetMode;


/**
 * Prompts which affect the performance of the MLModel
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/MLModelFactorPrompts.pdl.")
public class MLModelFactorPrompts
    extends RecordTemplate
{

    private final static MLModelFactorPrompts.Fields _fields = new MLModelFactorPrompts.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Prompts which affect the performance of the MLModel*/@Aspect.name=\"mlModelFactorPrompts\"record MLModelFactorPrompts{/**What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?*/relevantFactors:optional array[/**Factors affecting the performance of the MLModel.*/record MLModelFactors{/**Groups refers to distinct categories with similar characteristics that are present in the evaluation data instances.\nFor human-centric machine learning MLModels, groups are people who share one or multiple characteristics.*/groups:optional array[string]/**The performance of a MLModel can vary depending on what instruments were used to capture the input to the MLModel.\nFor example, a face detection model may perform differently depending on the camera's hardware and software,\nincluding lens, image stabilization, high dynamic range techniques, and background blurring for portrait mode.*/instrumentation:optional array[string]/**A further factor affecting MLModel performance is the environment in which it is deployed.*/environment:optional array[string]}]/**Which factors are being reported, and why were these chosen?*/evaluationFactors:optional array[MLModelFactors]}", SchemaFormatType.PDL));
    private MLModelFactorsArray _relevantFactorsField = null;
    private MLModelFactorsArray _evaluationFactorsField = null;
    private MLModelFactorPrompts.ChangeListener __changeListener = new MLModelFactorPrompts.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_RelevantFactors = SCHEMA.getField("relevantFactors");
    private final static RecordDataSchema.Field FIELD_EvaluationFactors = SCHEMA.getField("evaluationFactors");

    public MLModelFactorPrompts() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public MLModelFactorPrompts(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static MLModelFactorPrompts.Fields fields() {
        return _fields;
    }

    public static MLModelFactorPrompts.ProjectionMask createMask() {
        return new MLModelFactorPrompts.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for relevantFactors
     * 
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    public boolean hasRelevantFactors() {
        if (_relevantFactorsField!= null) {
            return true;
        }
        return super._map.containsKey("relevantFactors");
    }

    /**
     * Remover for relevantFactors
     * 
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    public void removeRelevantFactors() {
        super._map.remove("relevantFactors");
    }

    /**
     * Getter for relevantFactors
     * 
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    @Nullable
    public MLModelFactorsArray getRelevantFactors(GetMode mode) {
        return getRelevantFactors();
    }

    /**
     * Getter for relevantFactors
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    @Nullable
    public MLModelFactorsArray getRelevantFactors() {
        if (_relevantFactorsField!= null) {
            return _relevantFactorsField;
        } else {
            Object __rawValue = super._map.get("relevantFactors");
            _relevantFactorsField = ((__rawValue == null)?null:new MLModelFactorsArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _relevantFactorsField;
        }
    }

    /**
     * Setter for relevantFactors
     * 
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    public MLModelFactorPrompts setRelevantFactors(
        @Nullable
        MLModelFactorsArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRelevantFactors(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRelevantFactors();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "relevantFactors", value.data());
                    _relevantFactorsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "relevantFactors", value.data());
                    _relevantFactorsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for relevantFactors
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelFactorPrompts.Fields#relevantFactors
     */
    public MLModelFactorPrompts setRelevantFactors(
        @Nonnull
        MLModelFactorsArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field relevantFactors of com.linkedin.ml.metadata.MLModelFactorPrompts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "relevantFactors", value.data());
            _relevantFactorsField = value;
        }
        return this;
    }

    /**
     * Existence checker for evaluationFactors
     * 
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    public boolean hasEvaluationFactors() {
        if (_evaluationFactorsField!= null) {
            return true;
        }
        return super._map.containsKey("evaluationFactors");
    }

    /**
     * Remover for evaluationFactors
     * 
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    public void removeEvaluationFactors() {
        super._map.remove("evaluationFactors");
    }

    /**
     * Getter for evaluationFactors
     * 
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    @Nullable
    public MLModelFactorsArray getEvaluationFactors(GetMode mode) {
        return getEvaluationFactors();
    }

    /**
     * Getter for evaluationFactors
     * 
     * @return
     *     Optional field. Always check for null.
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    @Nullable
    public MLModelFactorsArray getEvaluationFactors() {
        if (_evaluationFactorsField!= null) {
            return _evaluationFactorsField;
        } else {
            Object __rawValue = super._map.get("evaluationFactors");
            _evaluationFactorsField = ((__rawValue == null)?null:new MLModelFactorsArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _evaluationFactorsField;
        }
    }

    /**
     * Setter for evaluationFactors
     * 
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    public MLModelFactorPrompts setEvaluationFactors(
        @Nullable
        MLModelFactorsArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEvaluationFactors(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEvaluationFactors();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "evaluationFactors", value.data());
                    _evaluationFactorsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "evaluationFactors", value.data());
                    _evaluationFactorsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for evaluationFactors
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see MLModelFactorPrompts.Fields#evaluationFactors
     */
    public MLModelFactorPrompts setEvaluationFactors(
        @Nonnull
        MLModelFactorsArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field evaluationFactors of com.linkedin.ml.metadata.MLModelFactorPrompts to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "evaluationFactors", value.data());
            _evaluationFactorsField = value;
        }
        return this;
    }

    @Override
    public MLModelFactorPrompts clone()
        throws CloneNotSupportedException
    {
        MLModelFactorPrompts __clone = ((MLModelFactorPrompts) super.clone());
        __clone.__changeListener = new MLModelFactorPrompts.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public MLModelFactorPrompts copy()
        throws CloneNotSupportedException
    {
        MLModelFactorPrompts __copy = ((MLModelFactorPrompts) super.copy());
        __copy._evaluationFactorsField = null;
        __copy._relevantFactorsField = null;
        __copy.__changeListener = new MLModelFactorPrompts.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final MLModelFactorPrompts __objectRef;

        private ChangeListener(MLModelFactorPrompts reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "evaluationFactors":
                    __objectRef._evaluationFactorsField = null;
                    break;
                case "relevantFactors":
                    __objectRef._relevantFactorsField = null;
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
         * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?
         * 
         */
        public com.linkedin.ml.metadata.MLModelFactorsArray.Fields relevantFactors() {
            return new com.linkedin.ml.metadata.MLModelFactorsArray.Fields(getPathComponents(), "relevantFactors");
        }

        /**
         * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?
         * 
         */
        public PathSpec relevantFactors(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "relevantFactors");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Which factors are being reported, and why were these chosen?
         * 
         */
        public com.linkedin.ml.metadata.MLModelFactorsArray.Fields evaluationFactors() {
            return new com.linkedin.ml.metadata.MLModelFactorsArray.Fields(getPathComponents(), "evaluationFactors");
        }

        /**
         * Which factors are being reported, and why were these chosen?
         * 
         */
        public PathSpec evaluationFactors(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "evaluationFactors");
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

        private com.linkedin.ml.metadata.MLModelFactorsArray.ProjectionMask _relevantFactorsMask;
        private com.linkedin.ml.metadata.MLModelFactorsArray.ProjectionMask _evaluationFactorsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?
         * 
         */
        public MLModelFactorPrompts.ProjectionMask withRelevantFactors(Function<com.linkedin.ml.metadata.MLModelFactorsArray.ProjectionMask, com.linkedin.ml.metadata.MLModelFactorsArray.ProjectionMask> nestedMask) {
            _relevantFactorsMask = nestedMask.apply(((_relevantFactorsMask == null)?MLModelFactorsArray.createMask():_relevantFactorsMask));
            getDataMap().put("relevantFactors", _relevantFactorsMask.getDataMap());
            return this;
        }

        /**
         * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?
         * 
         */
        public MLModelFactorPrompts.ProjectionMask withRelevantFactors() {
            _relevantFactorsMask = null;
            getDataMap().put("relevantFactors", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?
         * 
         */
        public MLModelFactorPrompts.ProjectionMask withRelevantFactors(Function<com.linkedin.ml.metadata.MLModelFactorsArray.ProjectionMask, com.linkedin.ml.metadata.MLModelFactorsArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _relevantFactorsMask = nestedMask.apply(((_relevantFactorsMask == null)?MLModelFactorsArray.createMask():_relevantFactorsMask));
            getDataMap().put("relevantFactors", _relevantFactorsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("relevantFactors").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("relevantFactors").put("$count", count);
            }
            return this;
        }

        /**
         * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined?
         * 
         */
        public MLModelFactorPrompts.ProjectionMask withRelevantFactors(Integer start, Integer count) {
            _relevantFactorsMask = null;
            getDataMap().put("relevantFactors", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("relevantFactors").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("relevantFactors").put("$count", count);
            }
            return this;
        }

        /**
         * Which factors are being reported, and why were these chosen?
         * 
         */
        public MLModelFactorPrompts.ProjectionMask withEvaluationFactors(Function<com.linkedin.ml.metadata.MLModelFactorsArray.ProjectionMask, com.linkedin.ml.metadata.MLModelFactorsArray.ProjectionMask> nestedMask) {
            _evaluationFactorsMask = nestedMask.apply(((_evaluationFactorsMask == null)?MLModelFactorsArray.createMask():_evaluationFactorsMask));
            getDataMap().put("evaluationFactors", _evaluationFactorsMask.getDataMap());
            return this;
        }

        /**
         * Which factors are being reported, and why were these chosen?
         * 
         */
        public MLModelFactorPrompts.ProjectionMask withEvaluationFactors() {
            _evaluationFactorsMask = null;
            getDataMap().put("evaluationFactors", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Which factors are being reported, and why were these chosen?
         * 
         */
        public MLModelFactorPrompts.ProjectionMask withEvaluationFactors(Function<com.linkedin.ml.metadata.MLModelFactorsArray.ProjectionMask, com.linkedin.ml.metadata.MLModelFactorsArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _evaluationFactorsMask = nestedMask.apply(((_evaluationFactorsMask == null)?MLModelFactorsArray.createMask():_evaluationFactorsMask));
            getDataMap().put("evaluationFactors", _evaluationFactorsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("evaluationFactors").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("evaluationFactors").put("$count", count);
            }
            return this;
        }

        /**
         * Which factors are being reported, and why were these chosen?
         * 
         */
        public MLModelFactorPrompts.ProjectionMask withEvaluationFactors(Integer start, Integer count) {
            _evaluationFactorsMask = null;
            getDataMap().put("evaluationFactors", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("evaluationFactors").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("evaluationFactors").put("$count", count);
            }
            return this;
        }

    }

}
