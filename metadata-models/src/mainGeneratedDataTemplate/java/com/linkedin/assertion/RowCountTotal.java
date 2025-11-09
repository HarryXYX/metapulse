
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


/**
 * Attributes defining a ROW_COUNT_TOTAL volume assertion.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/RowCountTotal.pdl.")
public class RowCountTotal
    extends RecordTemplate
{

    private final static RowCountTotal.Fields _fields = new RowCountTotal.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes defining a ROW_COUNT_TOTAL volume assertion.*/record RowCountTotal{/**The operator you'd like to apply.\n\nNote that only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:/**A boolean operator that is applied on the input to an assertion, after an aggregation function has been applied.*/enum AssertionStdOperator{/**Value being asserted is between min_value and max_value.  Requires 'minValue' & 'maxValue' parameters.*/BETWEEN/**Value being asserted is less than a max value. Requires 'value' parameter.*/LESS_THAN/**Value being asserted is less than or equal to some value. Requires 'value' parameter.*/LESS_THAN_OR_EQUAL_TO/**Value being asserted is greater than some value. Requires 'value' parameter.*/GREATER_THAN/**Value being asserted is greater than or equal to some value. Requires 'value' parameter.*/GREATER_THAN_OR_EQUAL_TO/**Value being asserted is equal to value. Requires 'value' parameter.*/EQUAL_TO/**Value being asserted is not equal to value. Requires 'value' parameter.*/NOT_EQUAL_TO/**Value being asserted is null. Requires no parameters.*/NULL/**Value being asserted is not null. Requires no parameters.*/NOT_NULL/**Value being asserted contains value. Requires 'value' parameter.*/CONTAIN/**Value being asserted ends with value. Requires 'value' parameter.*/END_WITH/**Value being asserted starts with value. Requires 'value' parameter.*/START_WITH/**Value being asserted matches the regex value. Requires 'value' parameter.*/REGEX_MATCH/**Value being asserted is one of the array values. Requires 'value' parameter.*/IN/**Value being asserted is not in one of the array values. Requires 'value' parameter.*/NOT_IN/**Value being asserted is true. Requires no parameters.*/IS_TRUE/**Value being asserted is false. Requires no parameters.*/IS_FALSE/**Other*/_NATIVE_}/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:/**Parameters for AssertionStdOperators.*/record AssertionStdParameters{/**The value parameter of an assertion*/value:optional/**Single parameter for AssertionStdOperators.*/record AssertionStdParameter{/**The parameter value*/value:string/**The type of the parameter*/type:enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}}/**The maxValue parameter of an assertion*/maxValue:optional AssertionStdParameter/**The minValue parameter of an assertion*/minValue:optional AssertionStdParameter}}", SchemaFormatType.PDL));
    private AssertionStdOperator _operatorField = null;
    private AssertionStdParameters _parametersField = null;
    private RowCountTotal.ChangeListener __changeListener = new RowCountTotal.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Operator = SCHEMA.getField("operator");
    private final static RecordDataSchema.Field FIELD_Parameters = SCHEMA.getField("parameters");

    public RowCountTotal() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public RowCountTotal(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static RowCountTotal.Fields fields() {
        return _fields;
    }

    public static RowCountTotal.ProjectionMask createMask() {
        return new RowCountTotal.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for operator
     * 
     * @see RowCountTotal.Fields#operator
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
     * @see RowCountTotal.Fields#operator
     */
    public void removeOperator() {
        super._map.remove("operator");
    }

    /**
     * Getter for operator
     * 
     * @see RowCountTotal.Fields#operator
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
     * @see RowCountTotal.Fields#operator
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
     * @see RowCountTotal.Fields#operator
     */
    public RowCountTotal setOperator(
        @Nullable
        AssertionStdOperator value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOperator(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field operator of com.linkedin.assertion.RowCountTotal");
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
     * @see RowCountTotal.Fields#operator
     */
    public RowCountTotal setOperator(
        @Nonnull
        AssertionStdOperator value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field operator of com.linkedin.assertion.RowCountTotal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "operator", value.name());
            _operatorField = value;
        }
        return this;
    }

    /**
     * Existence checker for parameters
     * 
     * @see RowCountTotal.Fields#parameters
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
     * @see RowCountTotal.Fields#parameters
     */
    public void removeParameters() {
        super._map.remove("parameters");
    }

    /**
     * Getter for parameters
     * 
     * @see RowCountTotal.Fields#parameters
     */
    @Nullable
    public AssertionStdParameters getParameters(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getParameters();
            case DEFAULT:
            case NULL:
                if (_parametersField!= null) {
                    return _parametersField;
                } else {
                    Object __rawValue = super._map.get("parameters");
                    _parametersField = ((__rawValue == null)?null:new AssertionStdParameters(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _parametersField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for parameters
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see RowCountTotal.Fields#parameters
     */
    @Nonnull
    public AssertionStdParameters getParameters() {
        if (_parametersField!= null) {
            return _parametersField;
        } else {
            Object __rawValue = super._map.get("parameters");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("parameters");
            }
            _parametersField = ((__rawValue == null)?null:new AssertionStdParameters(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _parametersField;
        }
    }

    /**
     * Setter for parameters
     * 
     * @see RowCountTotal.Fields#parameters
     */
    public RowCountTotal setParameters(
        @Nullable
        AssertionStdParameters value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParameters(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field parameters of com.linkedin.assertion.RowCountTotal");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
                    _parametersField = value;
                }
                break;
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
     * @see RowCountTotal.Fields#parameters
     */
    public RowCountTotal setParameters(
        @Nonnull
        AssertionStdParameters value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parameters of com.linkedin.assertion.RowCountTotal to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
            _parametersField = value;
        }
        return this;
    }

    @Override
    public RowCountTotal clone()
        throws CloneNotSupportedException
    {
        RowCountTotal __clone = ((RowCountTotal) super.clone());
        __clone.__changeListener = new RowCountTotal.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public RowCountTotal copy()
        throws CloneNotSupportedException
    {
        RowCountTotal __copy = ((RowCountTotal) super.copy());
        __copy._parametersField = null;
        __copy._operatorField = null;
        __copy.__changeListener = new RowCountTotal.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final RowCountTotal __objectRef;

        private ChangeListener(RowCountTotal reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
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
         * The operator you'd like to apply.
         * 
         * Note that only numeric operators are valid inputs:
         * GREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,
         * BETWEEN.
         * 
         */
        public PathSpec operator() {
            return new PathSpec(getPathComponents(), "operator");
        }

        /**
         * The parameters you'd like to provide as input to the operator.
         * 
         * Note that only numeric parameter types are valid inputs: NUMBER.
         * 
         */
        public com.linkedin.assertion.AssertionStdParameters.Fields parameters() {
            return new com.linkedin.assertion.AssertionStdParameters.Fields(getPathComponents(), "parameters");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.assertion.AssertionStdParameters.ProjectionMask _parametersMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * The operator you'd like to apply.
         * 
         * Note that only numeric operators are valid inputs:
         * GREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,
         * BETWEEN.
         * 
         */
        public RowCountTotal.ProjectionMask withOperator() {
            getDataMap().put("operator", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The parameters you'd like to provide as input to the operator.
         * 
         * Note that only numeric parameter types are valid inputs: NUMBER.
         * 
         */
        public RowCountTotal.ProjectionMask withParameters(Function<com.linkedin.assertion.AssertionStdParameters.ProjectionMask, com.linkedin.assertion.AssertionStdParameters.ProjectionMask> nestedMask) {
            _parametersMask = nestedMask.apply(((_parametersMask == null)?AssertionStdParameters.createMask():_parametersMask));
            getDataMap().put("parameters", _parametersMask.getDataMap());
            return this;
        }

        /**
         * The parameters you'd like to provide as input to the operator.
         * 
         * Note that only numeric parameter types are valid inputs: NUMBER.
         * 
         */
        public RowCountTotal.ProjectionMask withParameters() {
            _parametersMask = null;
            getDataMap().put("parameters", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
