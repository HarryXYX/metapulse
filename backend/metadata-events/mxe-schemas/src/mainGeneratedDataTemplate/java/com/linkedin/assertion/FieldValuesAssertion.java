
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
 * Attributes defining a field values assertion, which asserts that the values for a field / column
 * of a dataset / table matches a set of expectations.
 * 
 * In other words, this type of assertion acts as a semantic constraint applied to fields for a specific column.
 * 
 * TODO: We should display the "failed row count" to the user if the column fails the verification rules.
 * TODO: Determine whether we need an "operator" that can be applied to the field.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/FieldValuesAssertion.pdl.")
public class FieldValuesAssertion
    extends RecordTemplate
{

    private final static FieldValuesAssertion.Fields _fields = new FieldValuesAssertion.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes defining a field values assertion, which asserts that the values for a field / column\nof a dataset / table matches a set of expectations.\n\nIn other words, this type of assertion acts as a semantic constraint applied to fields for a specific column.\n\nTODO: We should display the \"failed row count\" to the user if the column fails the verification rules.\nTODO: Determine whether we need an \"operator\" that can be applied to the field.*/record FieldValuesAssertion{/**The field under evaluation*/@Searchable.`/path`.fieldName=\"fieldPath\"field:{namespace com.linkedin.schema/**Lightweight spec used for referencing a particular schema field.\n*/record SchemaFieldSpec{/**The field path*/path:string/**The DataHub standard schema field type.*/type:string/**The native field type*/nativeType:string}}/**An optional transform to apply to field values\nbefore evaluating the operator.\n\nIf none is applied, the field value will be compared as is.*/transform:optional/**Definition of a transform applied to the values of a column / field.\nNote that the applicability of a field transform ultimately depends on the native type\nof the field / column.\n\nModel has single field to permit extension.*/record FieldTransform{/**The type of the field transform, e.g. the transformation\nfunction / operator to apply.*/type:enum FieldTransformType{/**Obtain the length of a string field / column (applicable to string types)*/LENGTH}}/**The predicate to evaluate against a single value of the field.\nDepending on the operator, parameters may be required in order to successfully\nevaluate the assertion against the field value.*/operator:/**A boolean operator that is applied on the input to an assertion, after an aggregation function has been applied.*/enum AssertionStdOperator{/**Value being asserted is between min_value and max_value.  Requires 'minValue' & 'maxValue' parameters.*/BETWEEN/**Value being asserted is less than a max value. Requires 'value' parameter.*/LESS_THAN/**Value being asserted is less than or equal to some value. Requires 'value' parameter.*/LESS_THAN_OR_EQUAL_TO/**Value being asserted is greater than some value. Requires 'value' parameter.*/GREATER_THAN/**Value being asserted is greater than or equal to some value. Requires 'value' parameter.*/GREATER_THAN_OR_EQUAL_TO/**Value being asserted is equal to value. Requires 'value' parameter.*/EQUAL_TO/**Value being asserted is not equal to value. Requires 'value' parameter.*/NOT_EQUAL_TO/**Value being asserted is null. Requires no parameters.*/NULL/**Value being asserted is not null. Requires no parameters.*/NOT_NULL/**Value being asserted contains value. Requires 'value' parameter.*/CONTAIN/**Value being asserted ends with value. Requires 'value' parameter.*/END_WITH/**Value being asserted starts with value. Requires 'value' parameter.*/START_WITH/**Value being asserted matches the regex value. Requires 'value' parameter.*/REGEX_MATCH/**Value being asserted is one of the array values. Requires 'value' parameter.*/IN/**Value being asserted is not in one of the array values. Requires 'value' parameter.*/NOT_IN/**Value being asserted is true. Requires no parameters.*/IS_TRUE/**Value being asserted is false. Requires no parameters.*/IS_FALSE/**Other*/_NATIVE_}/**Standard parameters required for the assertion. e.g. min_value, max_value, value, columns*/parameters:optional/**Parameters for AssertionStdOperators.*/record AssertionStdParameters{/**The value parameter of an assertion*/value:optional/**Single parameter for AssertionStdOperators.*/record AssertionStdParameter{/**The parameter value*/value:string/**The type of the parameter*/type:enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}}/**The maxValue parameter of an assertion*/maxValue:optional AssertionStdParameter/**The minValue parameter of an assertion*/minValue:optional AssertionStdParameter}/**Additional customization about when the assertion\nshould be officially considered failing.*/failThreshold:record FieldValuesFailThreshold{/**The type of failure threshold. Either based on the number\nof column values (rows) that fail the expectations, or the percentage\nof the total rows under consideration.*/type:enum FieldValuesFailThresholdType{COUNT,PERCENTAGE}=\"COUNT\"/**By default this is 0, meaning that ALL column values (i.e. rows) must\nmeet the defined expectations.*/value:long=0}/**Whether to ignore or allow nulls when running the values assertion. (i.e.\nconsider only non-null values) using operators OTHER than the IS_NULL operator.\n\nDefaults to true, allowing null values.*/excludeNulls:boolean=true}", SchemaFormatType.PDL));
    private SchemaFieldSpec _fieldField = null;
    private FieldTransform _transformField = null;
    private AssertionStdOperator _operatorField = null;
    private AssertionStdParameters _parametersField = null;
    private FieldValuesFailThreshold _failThresholdField = null;
    private Boolean _excludeNullsField = null;
    private FieldValuesAssertion.ChangeListener __changeListener = new FieldValuesAssertion.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Field = SCHEMA.getField("field");
    private final static RecordDataSchema.Field FIELD_Transform = SCHEMA.getField("transform");
    private final static RecordDataSchema.Field FIELD_Operator = SCHEMA.getField("operator");
    private final static RecordDataSchema.Field FIELD_Parameters = SCHEMA.getField("parameters");
    private final static RecordDataSchema.Field FIELD_FailThreshold = SCHEMA.getField("failThreshold");
    private final static RecordDataSchema.Field FIELD_ExcludeNulls = SCHEMA.getField("excludeNulls");
    private final static Boolean DEFAULT_ExcludeNulls;

    static {
        DEFAULT_ExcludeNulls = DataTemplateUtil.coerceBooleanOutput(FIELD_ExcludeNulls.getDefault());
    }

    public FieldValuesAssertion() {
        super(new DataMap(8, 0.75F), SCHEMA, 6);
        addChangeListener(__changeListener);
    }

    public FieldValuesAssertion(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FieldValuesAssertion.Fields fields() {
        return _fields;
    }

    public static FieldValuesAssertion.ProjectionMask createMask() {
        return new FieldValuesAssertion.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for field
     * 
     * @see FieldValuesAssertion.Fields#field
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
     * @see FieldValuesAssertion.Fields#field
     */
    public void removeField() {
        super._map.remove("field");
    }

    /**
     * Getter for field
     * 
     * @see FieldValuesAssertion.Fields#field
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
     * @see FieldValuesAssertion.Fields#field
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
     * @see FieldValuesAssertion.Fields#field
     */
    public FieldValuesAssertion setField(
        @Nullable
        SchemaFieldSpec value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setField(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field field of com.linkedin.assertion.FieldValuesAssertion");
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
     * @see FieldValuesAssertion.Fields#field
     */
    public FieldValuesAssertion setField(
        @Nonnull
        SchemaFieldSpec value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field field of com.linkedin.assertion.FieldValuesAssertion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "field", value.data());
            _fieldField = value;
        }
        return this;
    }

    /**
     * Existence checker for transform
     * 
     * @see FieldValuesAssertion.Fields#transform
     */
    public boolean hasTransform() {
        if (_transformField!= null) {
            return true;
        }
        return super._map.containsKey("transform");
    }

    /**
     * Remover for transform
     * 
     * @see FieldValuesAssertion.Fields#transform
     */
    public void removeTransform() {
        super._map.remove("transform");
    }

    /**
     * Getter for transform
     * 
     * @see FieldValuesAssertion.Fields#transform
     */
    @Nullable
    public FieldTransform getTransform(GetMode mode) {
        return getTransform();
    }

    /**
     * Getter for transform
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FieldValuesAssertion.Fields#transform
     */
    @Nullable
    public FieldTransform getTransform() {
        if (_transformField!= null) {
            return _transformField;
        } else {
            Object __rawValue = super._map.get("transform");
            _transformField = ((__rawValue == null)?null:new FieldTransform(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _transformField;
        }
    }

    /**
     * Setter for transform
     * 
     * @see FieldValuesAssertion.Fields#transform
     */
    public FieldValuesAssertion setTransform(
        @Nullable
        FieldTransform value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTransform(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTransform();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "transform", value.data());
                    _transformField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "transform", value.data());
                    _transformField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for transform
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldValuesAssertion.Fields#transform
     */
    public FieldValuesAssertion setTransform(
        @Nonnull
        FieldTransform value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field transform of com.linkedin.assertion.FieldValuesAssertion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "transform", value.data());
            _transformField = value;
        }
        return this;
    }

    /**
     * Existence checker for operator
     * 
     * @see FieldValuesAssertion.Fields#operator
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
     * @see FieldValuesAssertion.Fields#operator
     */
    public void removeOperator() {
        super._map.remove("operator");
    }

    /**
     * Getter for operator
     * 
     * @see FieldValuesAssertion.Fields#operator
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
     * @see FieldValuesAssertion.Fields#operator
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
     * @see FieldValuesAssertion.Fields#operator
     */
    public FieldValuesAssertion setOperator(
        @Nullable
        AssertionStdOperator value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOperator(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field operator of com.linkedin.assertion.FieldValuesAssertion");
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
     * @see FieldValuesAssertion.Fields#operator
     */
    public FieldValuesAssertion setOperator(
        @Nonnull
        AssertionStdOperator value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field operator of com.linkedin.assertion.FieldValuesAssertion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "operator", value.name());
            _operatorField = value;
        }
        return this;
    }

    /**
     * Existence checker for parameters
     * 
     * @see FieldValuesAssertion.Fields#parameters
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
     * @see FieldValuesAssertion.Fields#parameters
     */
    public void removeParameters() {
        super._map.remove("parameters");
    }

    /**
     * Getter for parameters
     * 
     * @see FieldValuesAssertion.Fields#parameters
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
     * @see FieldValuesAssertion.Fields#parameters
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
     * @see FieldValuesAssertion.Fields#parameters
     */
    public FieldValuesAssertion setParameters(
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
     * @see FieldValuesAssertion.Fields#parameters
     */
    public FieldValuesAssertion setParameters(
        @Nonnull
        AssertionStdParameters value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parameters of com.linkedin.assertion.FieldValuesAssertion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
            _parametersField = value;
        }
        return this;
    }

    /**
     * Existence checker for failThreshold
     * 
     * @see FieldValuesAssertion.Fields#failThreshold
     */
    public boolean hasFailThreshold() {
        if (_failThresholdField!= null) {
            return true;
        }
        return super._map.containsKey("failThreshold");
    }

    /**
     * Remover for failThreshold
     * 
     * @see FieldValuesAssertion.Fields#failThreshold
     */
    public void removeFailThreshold() {
        super._map.remove("failThreshold");
    }

    /**
     * Getter for failThreshold
     * 
     * @see FieldValuesAssertion.Fields#failThreshold
     */
    @Nullable
    public FieldValuesFailThreshold getFailThreshold(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFailThreshold();
            case DEFAULT:
            case NULL:
                if (_failThresholdField!= null) {
                    return _failThresholdField;
                } else {
                    Object __rawValue = super._map.get("failThreshold");
                    _failThresholdField = ((__rawValue == null)?null:new FieldValuesFailThreshold(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _failThresholdField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for failThreshold
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FieldValuesAssertion.Fields#failThreshold
     */
    @Nonnull
    public FieldValuesFailThreshold getFailThreshold() {
        if (_failThresholdField!= null) {
            return _failThresholdField;
        } else {
            Object __rawValue = super._map.get("failThreshold");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("failThreshold");
            }
            _failThresholdField = ((__rawValue == null)?null:new FieldValuesFailThreshold(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _failThresholdField;
        }
    }

    /**
     * Setter for failThreshold
     * 
     * @see FieldValuesAssertion.Fields#failThreshold
     */
    public FieldValuesAssertion setFailThreshold(
        @Nullable
        FieldValuesFailThreshold value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFailThreshold(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field failThreshold of com.linkedin.assertion.FieldValuesAssertion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "failThreshold", value.data());
                    _failThresholdField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFailThreshold();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "failThreshold", value.data());
                    _failThresholdField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "failThreshold", value.data());
                    _failThresholdField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for failThreshold
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldValuesAssertion.Fields#failThreshold
     */
    public FieldValuesAssertion setFailThreshold(
        @Nonnull
        FieldValuesFailThreshold value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field failThreshold of com.linkedin.assertion.FieldValuesAssertion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "failThreshold", value.data());
            _failThresholdField = value;
        }
        return this;
    }

    /**
     * Existence checker for excludeNulls
     * 
     * @see FieldValuesAssertion.Fields#excludeNulls
     */
    public boolean hasExcludeNulls() {
        if (_excludeNullsField!= null) {
            return true;
        }
        return super._map.containsKey("excludeNulls");
    }

    /**
     * Remover for excludeNulls
     * 
     * @see FieldValuesAssertion.Fields#excludeNulls
     */
    public void removeExcludeNulls() {
        super._map.remove("excludeNulls");
    }

    /**
     * Getter for excludeNulls
     * 
     * @see FieldValuesAssertion.Fields#excludeNulls
     */
    @Nullable
    public Boolean isExcludeNulls(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return isExcludeNulls();
            case NULL:
                if (_excludeNullsField!= null) {
                    return _excludeNullsField;
                } else {
                    Object __rawValue = super._map.get("excludeNulls");
                    _excludeNullsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
                    return _excludeNullsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for excludeNulls
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FieldValuesAssertion.Fields#excludeNulls
     */
    @Nonnull
    public Boolean isExcludeNulls() {
        if (_excludeNullsField!= null) {
            return _excludeNullsField;
        } else {
            Object __rawValue = super._map.get("excludeNulls");
            if (__rawValue == null) {
                return DEFAULT_ExcludeNulls;
            }
            _excludeNullsField = DataTemplateUtil.coerceBooleanOutput(__rawValue);
            return _excludeNullsField;
        }
    }

    /**
     * Setter for excludeNulls
     * 
     * @see FieldValuesAssertion.Fields#excludeNulls
     */
    public FieldValuesAssertion setExcludeNulls(
        @Nullable
        Boolean value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setExcludeNulls(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field excludeNulls of com.linkedin.assertion.FieldValuesAssertion");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "excludeNulls", value);
                    _excludeNullsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeExcludeNulls();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "excludeNulls", value);
                    _excludeNullsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "excludeNulls", value);
                    _excludeNullsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for excludeNulls
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldValuesAssertion.Fields#excludeNulls
     */
    public FieldValuesAssertion setExcludeNulls(
        @Nonnull
        Boolean value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field excludeNulls of com.linkedin.assertion.FieldValuesAssertion to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "excludeNulls", value);
            _excludeNullsField = value;
        }
        return this;
    }

    /**
     * Setter for excludeNulls
     * 
     * @see FieldValuesAssertion.Fields#excludeNulls
     */
    public FieldValuesAssertion setExcludeNulls(boolean value) {
        CheckedUtil.putWithoutChecking(super._map, "excludeNulls", value);
        _excludeNullsField = value;
        return this;
    }

    @Override
    public FieldValuesAssertion clone()
        throws CloneNotSupportedException
    {
        FieldValuesAssertion __clone = ((FieldValuesAssertion) super.clone());
        __clone.__changeListener = new FieldValuesAssertion.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FieldValuesAssertion copy()
        throws CloneNotSupportedException
    {
        FieldValuesAssertion __copy = ((FieldValuesAssertion) super.copy());
        __copy._excludeNullsField = null;
        __copy._transformField = null;
        __copy._fieldField = null;
        __copy._failThresholdField = null;
        __copy._parametersField = null;
        __copy._operatorField = null;
        __copy.__changeListener = new FieldValuesAssertion.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FieldValuesAssertion __objectRef;

        private ChangeListener(FieldValuesAssertion reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "excludeNulls":
                    __objectRef._excludeNullsField = null;
                    break;
                case "transform":
                    __objectRef._transformField = null;
                    break;
                case "field":
                    __objectRef._fieldField = null;
                    break;
                case "failThreshold":
                    __objectRef._failThresholdField = null;
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
         * An optional transform to apply to field values
         * before evaluating the operator.
         * 
         * If none is applied, the field value will be compared as is.
         * 
         */
        public com.linkedin.assertion.FieldTransform.Fields transform() {
            return new com.linkedin.assertion.FieldTransform.Fields(getPathComponents(), "transform");
        }

        /**
         * The predicate to evaluate against a single value of the field.
         * Depending on the operator, parameters may be required in order to successfully
         * evaluate the assertion against the field value.
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

        /**
         * Additional customization about when the assertion
         * should be officially considered failing.
         * 
         */
        public com.linkedin.assertion.FieldValuesFailThreshold.Fields failThreshold() {
            return new com.linkedin.assertion.FieldValuesFailThreshold.Fields(getPathComponents(), "failThreshold");
        }

        /**
         * Whether to ignore or allow nulls when running the values assertion. (i.e.
         * consider only non-null values) using operators OTHER than the IS_NULL operator.
         * 
         * Defaults to true, allowing null values.
         * 
         */
        public PathSpec excludeNulls() {
            return new PathSpec(getPathComponents(), "excludeNulls");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.schema.SchemaFieldSpec.ProjectionMask _fieldMask;
        private com.linkedin.assertion.FieldTransform.ProjectionMask _transformMask;
        private com.linkedin.assertion.AssertionStdParameters.ProjectionMask _parametersMask;
        private com.linkedin.assertion.FieldValuesFailThreshold.ProjectionMask _failThresholdMask;

        ProjectionMask() {
            super(8);
        }

        /**
         * The field under evaluation
         * 
         */
        public FieldValuesAssertion.ProjectionMask withField(Function<com.linkedin.schema.SchemaFieldSpec.ProjectionMask, com.linkedin.schema.SchemaFieldSpec.ProjectionMask> nestedMask) {
            _fieldMask = nestedMask.apply(((_fieldMask == null)?SchemaFieldSpec.createMask():_fieldMask));
            getDataMap().put("field", _fieldMask.getDataMap());
            return this;
        }

        /**
         * The field under evaluation
         * 
         */
        public FieldValuesAssertion.ProjectionMask withField() {
            _fieldMask = null;
            getDataMap().put("field", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * An optional transform to apply to field values
         * before evaluating the operator.
         * 
         * If none is applied, the field value will be compared as is.
         * 
         */
        public FieldValuesAssertion.ProjectionMask withTransform(Function<com.linkedin.assertion.FieldTransform.ProjectionMask, com.linkedin.assertion.FieldTransform.ProjectionMask> nestedMask) {
            _transformMask = nestedMask.apply(((_transformMask == null)?FieldTransform.createMask():_transformMask));
            getDataMap().put("transform", _transformMask.getDataMap());
            return this;
        }

        /**
         * An optional transform to apply to field values
         * before evaluating the operator.
         * 
         * If none is applied, the field value will be compared as is.
         * 
         */
        public FieldValuesAssertion.ProjectionMask withTransform() {
            _transformMask = null;
            getDataMap().put("transform", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The predicate to evaluate against a single value of the field.
         * Depending on the operator, parameters may be required in order to successfully
         * evaluate the assertion against the field value.
         * 
         */
        public FieldValuesAssertion.ProjectionMask withOperator() {
            getDataMap().put("operator", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Standard parameters required for the assertion. e.g. min_value, max_value, value, columns
         * 
         */
        public FieldValuesAssertion.ProjectionMask withParameters(Function<com.linkedin.assertion.AssertionStdParameters.ProjectionMask, com.linkedin.assertion.AssertionStdParameters.ProjectionMask> nestedMask) {
            _parametersMask = nestedMask.apply(((_parametersMask == null)?AssertionStdParameters.createMask():_parametersMask));
            getDataMap().put("parameters", _parametersMask.getDataMap());
            return this;
        }

        /**
         * Standard parameters required for the assertion. e.g. min_value, max_value, value, columns
         * 
         */
        public FieldValuesAssertion.ProjectionMask withParameters() {
            _parametersMask = null;
            getDataMap().put("parameters", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Additional customization about when the assertion
         * should be officially considered failing.
         * 
         */
        public FieldValuesAssertion.ProjectionMask withFailThreshold(Function<com.linkedin.assertion.FieldValuesFailThreshold.ProjectionMask, com.linkedin.assertion.FieldValuesFailThreshold.ProjectionMask> nestedMask) {
            _failThresholdMask = nestedMask.apply(((_failThresholdMask == null)?FieldValuesFailThreshold.createMask():_failThresholdMask));
            getDataMap().put("failThreshold", _failThresholdMask.getDataMap());
            return this;
        }

        /**
         * Additional customization about when the assertion
         * should be officially considered failing.
         * 
         */
        public FieldValuesAssertion.ProjectionMask withFailThreshold() {
            _failThresholdMask = null;
            getDataMap().put("failThreshold", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Whether to ignore or allow nulls when running the values assertion. (i.e.
         * consider only non-null values) using operators OTHER than the IS_NULL operator.
         * 
         * Defaults to true, allowing null values.
         * 
         */
        public FieldValuesAssertion.ProjectionMask withExcludeNulls() {
            getDataMap().put("excludeNulls", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
