
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
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.SetMode;
import com.linkedin.data.template.StringArray;


/**
 * Metrics to be featured for the MLModel.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/Metrics.pdl.")
public class Metrics
    extends RecordTemplate
{

    private final static Metrics.Fields _fields = new Metrics.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Metrics to be featured for the MLModel.*/@Aspect.name=\"mlModelMetrics\"record Metrics{/**Measures of MLModel performance*/performanceMeasures:optional array[string]/**Decision Thresholds used (if any)?*/decisionThreshold:optional array[string]}", SchemaFormatType.PDL));
    private StringArray _performanceMeasuresField = null;
    private StringArray _decisionThresholdField = null;
    private Metrics.ChangeListener __changeListener = new Metrics.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_PerformanceMeasures = SCHEMA.getField("performanceMeasures");
    private final static RecordDataSchema.Field FIELD_DecisionThreshold = SCHEMA.getField("decisionThreshold");

    public Metrics() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public Metrics(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static Metrics.Fields fields() {
        return _fields;
    }

    public static Metrics.ProjectionMask createMask() {
        return new Metrics.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for performanceMeasures
     * 
     * @see Metrics.Fields#performanceMeasures
     */
    public boolean hasPerformanceMeasures() {
        if (_performanceMeasuresField!= null) {
            return true;
        }
        return super._map.containsKey("performanceMeasures");
    }

    /**
     * Remover for performanceMeasures
     * 
     * @see Metrics.Fields#performanceMeasures
     */
    public void removePerformanceMeasures() {
        super._map.remove("performanceMeasures");
    }

    /**
     * Getter for performanceMeasures
     * 
     * @see Metrics.Fields#performanceMeasures
     */
    @Nullable
    public StringArray getPerformanceMeasures(GetMode mode) {
        return getPerformanceMeasures();
    }

    /**
     * Getter for performanceMeasures
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Metrics.Fields#performanceMeasures
     */
    @Nullable
    public StringArray getPerformanceMeasures() {
        if (_performanceMeasuresField!= null) {
            return _performanceMeasuresField;
        } else {
            Object __rawValue = super._map.get("performanceMeasures");
            _performanceMeasuresField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _performanceMeasuresField;
        }
    }

    /**
     * Setter for performanceMeasures
     * 
     * @see Metrics.Fields#performanceMeasures
     */
    public Metrics setPerformanceMeasures(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setPerformanceMeasures(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removePerformanceMeasures();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "performanceMeasures", value.data());
                    _performanceMeasuresField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "performanceMeasures", value.data());
                    _performanceMeasuresField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for performanceMeasures
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Metrics.Fields#performanceMeasures
     */
    public Metrics setPerformanceMeasures(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field performanceMeasures of com.linkedin.ml.metadata.Metrics to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "performanceMeasures", value.data());
            _performanceMeasuresField = value;
        }
        return this;
    }

    /**
     * Existence checker for decisionThreshold
     * 
     * @see Metrics.Fields#decisionThreshold
     */
    public boolean hasDecisionThreshold() {
        if (_decisionThresholdField!= null) {
            return true;
        }
        return super._map.containsKey("decisionThreshold");
    }

    /**
     * Remover for decisionThreshold
     * 
     * @see Metrics.Fields#decisionThreshold
     */
    public void removeDecisionThreshold() {
        super._map.remove("decisionThreshold");
    }

    /**
     * Getter for decisionThreshold
     * 
     * @see Metrics.Fields#decisionThreshold
     */
    @Nullable
    public StringArray getDecisionThreshold(GetMode mode) {
        return getDecisionThreshold();
    }

    /**
     * Getter for decisionThreshold
     * 
     * @return
     *     Optional field. Always check for null.
     * @see Metrics.Fields#decisionThreshold
     */
    @Nullable
    public StringArray getDecisionThreshold() {
        if (_decisionThresholdField!= null) {
            return _decisionThresholdField;
        } else {
            Object __rawValue = super._map.get("decisionThreshold");
            _decisionThresholdField = ((__rawValue == null)?null:new StringArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _decisionThresholdField;
        }
    }

    /**
     * Setter for decisionThreshold
     * 
     * @see Metrics.Fields#decisionThreshold
     */
    public Metrics setDecisionThreshold(
        @Nullable
        StringArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDecisionThreshold(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDecisionThreshold();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "decisionThreshold", value.data());
                    _decisionThresholdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "decisionThreshold", value.data());
                    _decisionThresholdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for decisionThreshold
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see Metrics.Fields#decisionThreshold
     */
    public Metrics setDecisionThreshold(
        @Nonnull
        StringArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field decisionThreshold of com.linkedin.ml.metadata.Metrics to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "decisionThreshold", value.data());
            _decisionThresholdField = value;
        }
        return this;
    }

    @Override
    public Metrics clone()
        throws CloneNotSupportedException
    {
        Metrics __clone = ((Metrics) super.clone());
        __clone.__changeListener = new Metrics.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public Metrics copy()
        throws CloneNotSupportedException
    {
        Metrics __copy = ((Metrics) super.copy());
        __copy._decisionThresholdField = null;
        __copy._performanceMeasuresField = null;
        __copy.__changeListener = new Metrics.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final Metrics __objectRef;

        private ChangeListener(Metrics reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "decisionThreshold":
                    __objectRef._decisionThresholdField = null;
                    break;
                case "performanceMeasures":
                    __objectRef._performanceMeasuresField = null;
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
         * Measures of MLModel performance
         * 
         */
        public PathSpec performanceMeasures() {
            return new PathSpec(getPathComponents(), "performanceMeasures");
        }

        /**
         * Measures of MLModel performance
         * 
         */
        public PathSpec performanceMeasures(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "performanceMeasures");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Decision Thresholds used (if any)?
         * 
         */
        public PathSpec decisionThreshold() {
            return new PathSpec(getPathComponents(), "decisionThreshold");
        }

        /**
         * Decision Thresholds used (if any)?
         * 
         */
        public PathSpec decisionThreshold(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "decisionThreshold");
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
            super(3);
        }

        /**
         * Measures of MLModel performance
         * 
         */
        public Metrics.ProjectionMask withPerformanceMeasures() {
            getDataMap().put("performanceMeasures", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Measures of MLModel performance
         * 
         */
        public Metrics.ProjectionMask withPerformanceMeasures(Integer start, Integer count) {
            getDataMap().put("performanceMeasures", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("performanceMeasures").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("performanceMeasures").put("$count", count);
            }
            return this;
        }

        /**
         * Decision Thresholds used (if any)?
         * 
         */
        public Metrics.ProjectionMask withDecisionThreshold() {
            getDataMap().put("decisionThreshold", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Decision Thresholds used (if any)?
         * 
         */
        public Metrics.ProjectionMask withDecisionThreshold(Integer start, Integer count) {
            getDataMap().put("decisionThreshold", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("decisionThreshold").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("decisionThreshold").put("$count", count);
            }
            return this;
        }

    }

}
