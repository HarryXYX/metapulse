
package com.linkedin.assertion;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.schema.SchemaFieldSpec;


/**
 * Attributes defining a field metric assertion, which asserts an expectation against
 * a common metric derived from the set of field / column values, for example:
 * max, min, median, null count, null percentage, unique count, unique percentage, and more.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/FieldMetricAssertion.pdl.")
public class FieldMetricAssertion
    extends RecordTemplate
{

    private final static FieldMetricAssertion.Fields _fields = new FieldMetricAssertion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes defining a field metric assertion, which asserts an expectation against\na common metric derived from the set of field / column values, for example:\nmax, min, median, null count, null percentage, unique count, unique percentage, and more.*/record FieldMetricAssertion{/**The field under evaluation*/@Searchable.`/path`.fieldName=\"fieldPath\"field:{namespace com.linkedin.schema/**Lightweight spec used for referencing a particular schema field.\n*/record SchemaFieldSpec{/**The field path*/path:string/**The DataHub standard schema field type.*/type:string/**The native field type*/nativeType:string}}/**The specific metric to assert against. This is the value that\nwill be obtained by applying a standard operation, such as an aggregation,\nto the selected field.*/metric:/**A standard metric that can be derived from the set of values\nfor a specific field / column of a dataset / table.*/enum FieldMetricType{/**The number of unique values found in the column value set*/UNIQUE_COUNT/**The percentage of unique values to total rows for the dataset*/UNIQUE_PERCENTAGE/**The number of null values found in the column value set*/NULL_COUNT/**The percentage of null values to total rows for the dataset*/NULL_PERCENTAGE/**The minimum value in the column set (applies to numeric columns)*/MIN/**The maximum value in the column set (applies to numeric columns)*/MAX/**The mean length found in the column set (applies to numeric columns)*/MEAN/**The median length found in the column set (applies to numeric columns)*/MEDIAN/**The stddev length found in the column set (applies to numeric columns)*/STDDEV/**The number of negative values found in the value set (applies to numeric columns)*/NEGATIVE_COUNT/**The percentage of negative values to total rows for the dataset (applies to numeric columns)*/NEGATIVE_PERCENTAGE/**The number of zero values found in the value set (applies to numeric columns)*/ZERO_COUNT/**The percentage of zero values to total rows for the dataset (applies to numeric columns)*/ZERO_PERCENTAGE/**The minimum length found in the column set (applies to string columns)*/MIN_LENGTH/**The maximum length found in the column set (applies to string columns)*/MAX_LENGTH/**The number of empty string values found in the value set (applies to string columns).\nNote: This is a completely different metric different from NULL_COUNT!*/EMPTY_COUNT/**The percentage of empty string values to total rows for the dataset (applies to string columns)\nNote: This is a completely different metric different from NULL_PERCENTAGE!*/EMPTY_PERCENTAGE}/**The predicate to evaluate against the metric for the field / column.\nDepending on the operator, parameters may be required in order to successfully\nevaluate the assertion against the metric value.*/operator:/**A boolean operator that is applied on the input to an assertion, after an aggregation function has been applied.*/enum AssertionStdOperator{/**Value being asserted is between min_value and max_value.  Requires 'minValue' & 'maxValue' parameters.*/BETWEEN/**Value being asserted is less than a max value. Requires 'value' parameter.*/LESS_THAN/**Value being asserted is less than or equal to some value. Requires 'value' parameter.*/LESS_THAN_OR_EQUAL_TO/**Value being asserted is greater than some value. Requires 'value' parameter.*/GREATER_THAN/**Value being asserted is greater than or equal to some value. Requires 'value' parameter.*/GREATER_THAN_OR_EQUAL_TO/**Value being asserted is equal to value. Requires 'value' parameter.*/EQUAL_TO/**Value being asserted is not equal to value. Requires 'value' parameter.*/NOT_EQUAL_TO/**Value being asserted is null. Requires no parameters.*/NULL/**Value being asserted is not null. Requires no parameters.*/NOT_NULL/**Value being asserted contains value. Requires 'value' parameter.*/CONTAIN/**Value being asserted ends with value. Requires 'value' parameter.*/END_WITH/**Value being asserted starts with value. Requires 'value' parameter.*/START_WITH/**Value being asserted matches the regex value. Requires 'value' parameter.*/REGEX_MATCH/**Value being asserted is one of the array values. Requires 'value' parameter.*/IN/**Value being asserted is not in one of the array values. Requires 'value' parameter.*/NOT_IN/**Value being asserted is true. Requires no parameters.*/IS_TRUE/**Value being asserted is false. Requires no parameters.*/IS_FALSE/**Other*/_NATIVE_}/**Standard parameters required for the assertion. e.g. min_value, max_value, value, columns*/parameters:optional/**Parameters for AssertionStdOperators.*/record AssertionStdParameters{/**The value parameter of an assertion*/value:optional/**Single parameter for AssertionStdOperators.*/record AssertionStdParameter{/**The parameter value*/value:string/**The type of the parameter*/type:enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}}/**The maxValue parameter of an assertion*/maxValue:optional AssertionStdParameter/**The minValue parameter of an assertion*/minValue:optional AssertionStdParameter}}", SchemaFormatType.PDL));
    private SchemaFieldSpec _fieldField = null;
    private FieldMetricType _metricField = null;
    private AssertionStdOperator _operatorField = null;
    private AssertionStdParameters _parametersField = null;
    private FieldMetricAssertion.ChangeListener __changeListener = new FieldMetricAssertion.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Field = SCHEMA.getField("field");
    private final static RecordDataSchema.Field FIELD_Metric = SCHEMA.getField("metric");
    private final static RecordDataSchema.Field FIELD_Operator = SCHEMA.getField("operator");
    private final static RecordDataSchema.Field FIELD_Parameters = SCHEMA.getField("parameters");

    public FieldMetricAssertion() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public FieldMetricAssertion(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FieldMetricAssertion.Fields fields() {
        return _fields;
    }

    public static FieldMetricAssertion.ProjectionMask createMask() {
        return new FieldMetricAssertion.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for field
     * 
     * @see FieldMetricAssertion.Fields#field
     */
    public boolean hasField() {
        if (_fieldField!= null) {
            return true;
        }
        return super._map.containsKey("field");
    }

    /**
     * Remover for field
     * 
     * @see FieldMetricAssertion.Fields#field
     */
    public void removeField() {
        super._map.remove("field");
    }

    /**
     * Getter for field
     * 
     * @see FieldMetricAssertion.Fields#field
     */
    @Nullable
    public SchemaFieldSpec getField(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getField();
            case DEFAULT:
            case NULL:
                if (_fieldField!= null) {
                    return _fieldField;
                } else {
                    Object __rawValue = super._map.get("field");
                    _fieldField = ((__rawValue == null)?null:new SchemaFieldSpec(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _fieldField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for field
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FieldMetricAssertion.Fields#field
     */
    @Nonnull
    public SchemaFieldSpec getField() {
        if (_fieldField!= null) {
            return _fieldField;
        } else {
            Object __rawValue = super._map.get("field");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("field");
            }
            _fieldField = ((__rawValue == null)?null:new SchemaFieldSpec(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _fieldField;
        }
    }

    /**
     * Setter for field
     * 
     * @see FieldMetricAssertion.Fields#field
     */
    public FieldMetricAssertion setField(
        @Nullable
        SchemaFieldSpec value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setField(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field field of com.linkedin.assertion.FieldMetricAssertion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "field", value.data());
                    _fieldField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeField();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "field", value.data());
                    _fieldField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "field", value.data());
                    _fieldField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for field
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldMetricAssertion.Fields#field
     */
    public FieldMetricAssertion setField(
        @Nonnull
        SchemaFieldSpec value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field field of com.linkedin.assertion.FieldMetricAssertion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "field", value.data());
            _fieldField = value;
        }
        return this;
    }

    /**
     * Existence checker for metric
     * 
     * @see FieldMetricAssertion.Fields#metric
     */
    public boolean hasMetric() {
        if (_metricField!= null) {
            return true;
        }
        return super._map.containsKey("metric");
    }

    /**
     * Remover for metric
     * 
     * @see FieldMetricAssertion.Fields#metric
     */
    public void removeMetric() {
        super._map.remove("metric");
    }

    /**
     * Getter for metric
     * 
     * @see FieldMetricAssertion.Fields#metric
     */
    @Nullable
    public FieldMetricType getMetric(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMetric();
            case DEFAULT:
            case NULL:
                if (_metricField!= null) {
                    return _metricField;
                } else {
                    Object __rawValue = super._map.get("metric");
                    _metricField = DataTemplateUtil.coerceEnumOutput(__rawValue, FieldMetricType.class, FieldMetricType.$UNKNOWN);
                    return _metricField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for metric
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FieldMetricAssertion.Fields#metric
     */
    @Nonnull
    public FieldMetricType getMetric() {
        if (_metricField!= null) {
            return _metricField;
        } else {
            Object __rawValue = super._map.get("metric");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("metric");
            }
            _metricField = DataTemplateUtil.coerceEnumOutput(__rawValue, FieldMetricType.class, FieldMetricType.$UNKNOWN);
            return _metricField;
        }
    }

    /**
     * Setter for metric
     * 
     * @see FieldMetricAssertion.Fields#metric
     */
    public FieldMetricAssertion setMetric(
        @Nullable
        FieldMetricType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMetric(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field metric of com.linkedin.assertion.FieldMetricAssertion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metric", value.name());
                    _metricField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMetric();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metric", value.name());
                    _metricField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "metric", value.name());
                    _metricField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for metric
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldMetricAssertion.Fields#metric
     */
    public FieldMetricAssertion setMetric(
        @Nonnull
        FieldMetricType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field metric of com.linkedin.assertion.FieldMetricAssertion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "metric", value.name());
            _metricField = value;
        }
        return this;
    }

    /**
     * Existence checker for operator
     * 
     * @see FieldMetricAssertion.Fields#operator
     */
    public boolean hasOperator() {
        if (_operatorField!= null) {
            return true;
        }
        return super._map.containsKey("operator");
    }

    /**
     * Remover for operator
     * 
     * @see FieldMetricAssertion.Fields#operator
     */
    public void removeOperator() {
        super._map.remove("operator");
    }

    /**
     * Getter for operator
     * 
     * @see FieldMetricAssertion.Fields#operator
     */
    @Nullable
    public AssertionStdOperator getOperator(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getOperator();
            case DEFAULT:
            case NULL:
                if (_operatorField!= null) {
                    return _operatorField;
                } else {
                    Object __rawValue = super._map.get("operator");
                    _operatorField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionStdOperator.class, AssertionStdOperator.$UNKNOWN);
                    return _operatorField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for operator
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FieldMetricAssertion.Fields#operator
     */
    @Nonnull
    public AssertionStdOperator getOperator() {
        if (_operatorField!= null) {
            return _operatorField;
        } else {
            Object __rawValue = super._map.get("operator");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("operator");
            }
            _operatorField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionStdOperator.class, AssertionStdOperator.$UNKNOWN);
            return _operatorField;
        }
    }

    /**
     * Setter for operator
     * 
     * @see FieldMetricAssertion.Fields#operator
     */
    public FieldMetricAssertion setOperator(
        @Nullable
        AssertionStdOperator value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOperator(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field operator of com.linkedin.assertion.FieldMetricAssertion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "operator", value.name());
                    _operatorField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeOperator();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "operator", value.name());
                    _operatorField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "operator", value.name());
                    _operatorField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for operator
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldMetricAssertion.Fields#operator
     */
    public FieldMetricAssertion setOperator(
        @Nonnull
        AssertionStdOperator value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field operator of com.linkedin.assertion.FieldMetricAssertion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "operator", value.name());
            _operatorField = value;
        }
        return this;
    }

    /**
     * Existence checker for parameters
     * 
     * @see FieldMetricAssertion.Fields#parameters
     */
    public boolean hasParameters() {
        if (_parametersField!= null) {
            return true;
        }
        return super._map.containsKey("parameters");
    }

    /**
     * Remover for parameters
     * 
     * @see FieldMetricAssertion.Fields#parameters
     */
    public void removeParameters() {
        super._map.remove("parameters");
    }

    /**
     * Getter for parameters
     * 
     * @see FieldMetricAssertion.Fields#parameters
     */
    @Nullable
    public AssertionStdParameters getParameters(GetMode mode) {
        return getParameters();
    }

    /**
     * Getter for parameters
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FieldMetricAssertion.Fields#parameters
     */
    @Nullable
    public AssertionStdParameters getParameters() {
        if (_parametersField!= null) {
            return _parametersField;
        } else {
            Object __rawValue = super._map.get("parameters");
            _parametersField = ((__rawValue == null)?null:new AssertionStdParameters(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _parametersField;
        }
    }

    /**
     * Setter for parameters
     * 
     * @see FieldMetricAssertion.Fields#parameters
     */
    public FieldMetricAssertion setParameters(
        @Nullable
        AssertionStdParameters value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParameters(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeParameters();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
                    _parametersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
                    _parametersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for parameters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldMetricAssertion.Fields#parameters
     */
    public FieldMetricAssertion setParameters(
        @Nonnull
        AssertionStdParameters value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parameters of com.linkedin.assertion.FieldMetricAssertion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
            _parametersField = value;
        }
        return this;
    }

    @Override
    public FieldMetricAssertion clone()
        throws CloneNotSupportedException
    {
        FieldMetricAssertion __clone = ((FieldMetricAssertion) super.clone());
        __clone.__changeListener = new FieldMetricAssertion.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FieldMetricAssertion copy()
        throws CloneNotSupportedException
    {
        FieldMetricAssertion __copy = ((FieldMetricAssertion) super.copy());
        __copy._fieldField = null;
        __copy._metricField = null;
        __copy._parametersField = null;
        __copy._operatorField = null;
        __copy.__changeListener = new FieldMetricAssertion.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FieldMetricAssertion __objectRef;

        private ChangeListener(FieldMetricAssertion reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "field":
                    __objectRef._fieldField = null;
                    break;
                case "metric":
                    __objectRef._metricField = null;
                    break;
                case "parameters":
                    __objectRef._parametersField = null;
                    break;
                case "operator":
                    __objectRef._operatorField = null;
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
         * The field under evaluation
         * 
         */
        public com.linkedin.schema.SchemaFieldSpec.Fields field() {
            return new com.linkedin.schema.SchemaFieldSpec.Fields(getPathComponents(), "field");
        }

        /**
         * The specific metric to assert against. This is the value that
         * will be obtained by applying a standard operation, such as an aggregation,
         * to the selected field.
         * 
         */
        public PathSpec metric() {
            return new PathSpec(getPathComponents(), "metric");
        }

        /**
         * The predicate to evaluate against the metric for the field / column.
         * Depending on the operator, parameters may be required in order to successfully
         * evaluate the assertion against the metric value.
         * 
         */
        public PathSpec operator() {
            return new PathSpec(getPathComponents(), "operator");
        }

        /**
         * Standard parameters required for the assertion. e.g. min_value, max_value, value, columns
         * 
         */
        public com.linkedin.assertion.AssertionStdParameters.Fields parameters() {
            return new com.linkedin.assertion.AssertionStdParameters.Fields(getPathComponents(), "parameters");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.schema.SchemaFieldSpec.ProjectionMask _fieldMask;
        private com.linkedin.assertion.AssertionStdParameters.ProjectionMask _parametersMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * The field under evaluation
         * 
         */
        public FieldMetricAssertion.ProjectionMask withField(Function<com.linkedin.schema.SchemaFieldSpec.ProjectionMask, com.linkedin.schema.SchemaFieldSpec.ProjectionMask> nestedMask) {
            _fieldMask = nestedMask.apply(((_fieldMask == null)?SchemaFieldSpec.createMask():_fieldMask));
            getDataMap().put("field", _fieldMask.getDataMap());
            return this;
        }

        /**
         * The field under evaluation
         * 
         */
        public FieldMetricAssertion.ProjectionMask withField() {
            _fieldMask = null;
            getDataMap().put("field", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The specific metric to assert against. This is the value that
         * will be obtained by applying a standard operation, such as an aggregation,
         * to the selected field.
         * 
         */
        public FieldMetricAssertion.ProjectionMask withMetric() {
            getDataMap().put("metric", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The predicate to evaluate against the metric for the field / column.
         * Depending on the operator, parameters may be required in order to successfully
         * evaluate the assertion against the metric value.
         * 
         */
        public FieldMetricAssertion.ProjectionMask withOperator() {
            getDataMap().put("operator", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Standard parameters required for the assertion. e.g. min_value, max_value, value, columns
         * 
         */
        public FieldMetricAssertion.ProjectionMask withParameters(Function<com.linkedin.assertion.AssertionStdParameters.ProjectionMask, com.linkedin.assertion.AssertionStdParameters.ProjectionMask> nestedMask) {
            _parametersMask = nestedMask.apply(((_parametersMask == null)?AssertionStdParameters.createMask():_parametersMask));
            getDataMap().put("parameters", _parametersMask.getDataMap());
            return this;
        }

        /**
         * Standard parameters required for the assertion. e.g. min_value, max_value, value, columns
         * 
         */
        public FieldMetricAssertion.ProjectionMask withParameters() {
            _parametersMask = null;
            getDataMap().put("parameters", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
