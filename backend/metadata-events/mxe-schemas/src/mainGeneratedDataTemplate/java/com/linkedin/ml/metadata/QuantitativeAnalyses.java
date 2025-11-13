
package com.linkedin.ml.metadata;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
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
 * Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ml/metadata/QuantitativeAnalyses.pdl.")
public class QuantitativeAnalyses
    extends RecordTemplate
{

    private final static QuantitativeAnalyses.Fields _fields = new QuantitativeAnalyses.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ml.metadata/**Quantitative analyses should be disaggregated, that is, broken down by the chosen factors. Quantitative analyses should provide the results of evaluating the MLModel according to the chosen metrics, providing confidence interval values when possible.*/@Aspect.name=\"mlModelQuantitativeAnalyses\"record QuantitativeAnalyses{/**Link to a dashboard with results showing how the MLModel performed with respect to each factor*/unitaryResults:optional/**A union of all supported metadata aspects for ResultsType*/typeref ResultsType=union[string]/**Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?*/intersectionalResults:optional ResultsType}", SchemaFormatType.PDL));
    private ResultsType _unitaryResultsField = null;
    private ResultsType _intersectionalResultsField = null;
    private QuantitativeAnalyses.ChangeListener __changeListener = new QuantitativeAnalyses.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_UnitaryResults = SCHEMA.getField("unitaryResults");
    private final static RecordDataSchema.Field FIELD_IntersectionalResults = SCHEMA.getField("intersectionalResults");

    public QuantitativeAnalyses() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public QuantitativeAnalyses(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static QuantitativeAnalyses.Fields fields() {
        return _fields;
    }

    public static QuantitativeAnalyses.ProjectionMask createMask() {
        return new QuantitativeAnalyses.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for unitaryResults
     * 
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    public boolean hasUnitaryResults() {
        if (_unitaryResultsField!= null) {
            return true;
        }
        return super._map.containsKey("unitaryResults");
    }

    /**
     * Remover for unitaryResults
     * 
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    public void removeUnitaryResults() {
        super._map.remove("unitaryResults");
    }

    /**
     * Getter for unitaryResults
     * 
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    @Nullable
    public ResultsType getUnitaryResults(GetMode mode) {
        return getUnitaryResults();
    }

    /**
     * Getter for unitaryResults
     * 
     * @return
     *     Optional field. Always check for null.
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    @Nullable
    public ResultsType getUnitaryResults() {
        if (_unitaryResultsField!= null) {
            return _unitaryResultsField;
        } else {
            Object __rawValue = super._map.get("unitaryResults");
            _unitaryResultsField = ((__rawValue == null)?null:new ResultsType(__rawValue));
            return _unitaryResultsField;
        }
    }

    /**
     * Setter for unitaryResults
     * 
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    public QuantitativeAnalyses setUnitaryResults(
        @Nullable
        ResultsType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUnitaryResults(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUnitaryResults();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "unitaryResults", value.data());
                    _unitaryResultsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "unitaryResults", value.data());
                    _unitaryResultsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for unitaryResults
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QuantitativeAnalyses.Fields#unitaryResults
     */
    public QuantitativeAnalyses setUnitaryResults(
        @Nonnull
        ResultsType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field unitaryResults of com.linkedin.ml.metadata.QuantitativeAnalyses to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "unitaryResults", value.data());
            _unitaryResultsField = value;
        }
        return this;
    }

    /**
     * Existence checker for intersectionalResults
     * 
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    public boolean hasIntersectionalResults() {
        if (_intersectionalResultsField!= null) {
            return true;
        }
        return super._map.containsKey("intersectionalResults");
    }

    /**
     * Remover for intersectionalResults
     * 
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    public void removeIntersectionalResults() {
        super._map.remove("intersectionalResults");
    }

    /**
     * Getter for intersectionalResults
     * 
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    @Nullable
    public ResultsType getIntersectionalResults(GetMode mode) {
        return getIntersectionalResults();
    }

    /**
     * Getter for intersectionalResults
     * 
     * @return
     *     Optional field. Always check for null.
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    @Nullable
    public ResultsType getIntersectionalResults() {
        if (_intersectionalResultsField!= null) {
            return _intersectionalResultsField;
        } else {
            Object __rawValue = super._map.get("intersectionalResults");
            _intersectionalResultsField = ((__rawValue == null)?null:new ResultsType(__rawValue));
            return _intersectionalResultsField;
        }
    }

    /**
     * Setter for intersectionalResults
     * 
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    public QuantitativeAnalyses setIntersectionalResults(
        @Nullable
        ResultsType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIntersectionalResults(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIntersectionalResults();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "intersectionalResults", value.data());
                    _intersectionalResultsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "intersectionalResults", value.data());
                    _intersectionalResultsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for intersectionalResults
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see QuantitativeAnalyses.Fields#intersectionalResults
     */
    public QuantitativeAnalyses setIntersectionalResults(
        @Nonnull
        ResultsType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field intersectionalResults of com.linkedin.ml.metadata.QuantitativeAnalyses to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "intersectionalResults", value.data());
            _intersectionalResultsField = value;
        }
        return this;
    }

    @Override
    public QuantitativeAnalyses clone()
        throws CloneNotSupportedException
    {
        QuantitativeAnalyses __clone = ((QuantitativeAnalyses) super.clone());
        __clone.__changeListener = new QuantitativeAnalyses.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public QuantitativeAnalyses copy()
        throws CloneNotSupportedException
    {
        QuantitativeAnalyses __copy = ((QuantitativeAnalyses) super.copy());
        __copy._unitaryResultsField = null;
        __copy._intersectionalResultsField = null;
        __copy.__changeListener = new QuantitativeAnalyses.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final QuantitativeAnalyses __objectRef;

        private ChangeListener(QuantitativeAnalyses reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "unitaryResults":
                    __objectRef._unitaryResultsField = null;
                    break;
                case "intersectionalResults":
                    __objectRef._intersectionalResultsField = null;
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
         * Link to a dashboard with results showing how the MLModel performed with respect to each factor
         * 
         */
        public com.linkedin.ml.metadata.ResultsType.Fields unitaryResults() {
            return new com.linkedin.ml.metadata.ResultsType.Fields(getPathComponents(), "unitaryResults");
        }

        /**
         * Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?
         * 
         */
        public com.linkedin.ml.metadata.ResultsType.Fields intersectionalResults() {
            return new com.linkedin.ml.metadata.ResultsType.Fields(getPathComponents(), "intersectionalResults");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.ml.metadata.ResultsType.ProjectionMask _unitaryResultsMask;
        private com.linkedin.ml.metadata.ResultsType.ProjectionMask _intersectionalResultsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Link to a dashboard with results showing how the MLModel performed with respect to each factor
         * 
         */
        public QuantitativeAnalyses.ProjectionMask withUnitaryResults(Function<com.linkedin.ml.metadata.ResultsType.ProjectionMask, com.linkedin.ml.metadata.ResultsType.ProjectionMask> nestedMask) {
            _unitaryResultsMask = nestedMask.apply(((_unitaryResultsMask == null)?ResultsType.createMask():_unitaryResultsMask));
            getDataMap().put("unitaryResults", _unitaryResultsMask.getDataMap());
            return this;
        }

        /**
         * Link to a dashboard with results showing how the MLModel performed with respect to each factor
         * 
         */
        public QuantitativeAnalyses.ProjectionMask withUnitaryResults() {
            _unitaryResultsMask = null;
            getDataMap().put("unitaryResults", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?
         * 
         */
        public QuantitativeAnalyses.ProjectionMask withIntersectionalResults(Function<com.linkedin.ml.metadata.ResultsType.ProjectionMask, com.linkedin.ml.metadata.ResultsType.ProjectionMask> nestedMask) {
            _intersectionalResultsMask = nestedMask.apply(((_intersectionalResultsMask == null)?ResultsType.createMask():_intersectionalResultsMask));
            getDataMap().put("intersectionalResults", _intersectionalResultsMask.getDataMap());
            return this;
        }

        /**
         * Link to a dashboard with results showing how the MLModel performed with respect to the intersection of evaluated factors?
         * 
         */
        public QuantitativeAnalyses.ProjectionMask withIntersectionalResults() {
            _intersectionalResultsMask = null;
            getDataMap().put("intersectionalResults", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
