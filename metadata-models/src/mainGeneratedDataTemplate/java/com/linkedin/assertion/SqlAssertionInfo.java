
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
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.GetMode;
import com.linkedin.data.template.RecordTemplate;
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * Attributes defining a SQL Assertion
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/SqlAssertionInfo.pdl.")
public class SqlAssertionInfo
    extends RecordTemplate
{

    private final static SqlAssertionInfo.Fields _fields = new SqlAssertionInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes defining a SQL Assertion*/record SqlAssertionInfo{/**The type of the SQL assertion being monitored.*/@Searchable={}type:enum SqlAssertionType{/**A SQL Metric Assertion, e.g. one based on a numeric value returned by an arbitrary SQL query.*/METRIC/**A SQL assertion that is evaluated against the CHANGE in a metric assertion\nover time.*/METRIC_CHANGE}/**The entity targeted by this SQL check.*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"Asserts\"}@Searchable.fieldType=\"URN\"entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The SQL statement to be executed when evaluating the assertion (or computing the metric).\nThis should be a valid and complete statement, executable by itself.\n\nUsually this should be a SELECT query statement.*/statement:string/**The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.\nThis value is required if the type is METRIC_CHANGE.*/changeType:optional/**An enum to represent a type of change in an assertion value, metric, or measurement.*/enum AssertionValueChangeType{/**A change that is defined in absolute terms.*/ABSOLUTE/**A change that is defined in relative terms using percentage change\nfrom the original value.*/PERCENTAGE}/**The operator you'd like to apply to the result of the SQL query.\n\nNote that at this time, only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:/**A boolean operator that is applied on the input to an assertion, after an aggregation function has been applied.*/enum AssertionStdOperator{/**Value being asserted is between min_value and max_value.  Requires 'minValue' & 'maxValue' parameters.*/BETWEEN/**Value being asserted is less than a max value. Requires 'value' parameter.*/LESS_THAN/**Value being asserted is less than or equal to some value. Requires 'value' parameter.*/LESS_THAN_OR_EQUAL_TO/**Value being asserted is greater than some value. Requires 'value' parameter.*/GREATER_THAN/**Value being asserted is greater than or equal to some value. Requires 'value' parameter.*/GREATER_THAN_OR_EQUAL_TO/**Value being asserted is equal to value. Requires 'value' parameter.*/EQUAL_TO/**Value being asserted is not equal to value. Requires 'value' parameter.*/NOT_EQUAL_TO/**Value being asserted is null. Requires no parameters.*/NULL/**Value being asserted is not null. Requires no parameters.*/NOT_NULL/**Value being asserted contains value. Requires 'value' parameter.*/CONTAIN/**Value being asserted ends with value. Requires 'value' parameter.*/END_WITH/**Value being asserted starts with value. Requires 'value' parameter.*/START_WITH/**Value being asserted matches the regex value. Requires 'value' parameter.*/REGEX_MATCH/**Value being asserted is one of the array values. Requires 'value' parameter.*/IN/**Value being asserted is not in one of the array values. Requires 'value' parameter.*/NOT_IN/**Value being asserted is true. Requires no parameters.*/IS_TRUE/**Value being asserted is false. Requires no parameters.*/IS_FALSE/**Other*/_NATIVE_}/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:/**Parameters for AssertionStdOperators.*/record AssertionStdParameters{/**The value parameter of an assertion*/value:optional/**Single parameter for AssertionStdOperators.*/record AssertionStdParameter{/**The parameter value*/value:string/**The type of the parameter*/type:enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}}/**The maxValue parameter of an assertion*/maxValue:optional AssertionStdParameter/**The minValue parameter of an assertion*/minValue:optional AssertionStdParameter}}", SchemaFormatType.PDL));
    private SqlAssertionType _typeField = null;
    private com.linkedin.common.urn.Urn _entityField = null;
    private String _statementField = null;
    private AssertionValueChangeType _changeTypeField = null;
    private AssertionStdOperator _operatorField = null;
    private AssertionStdParameters _parametersField = null;
    private SqlAssertionInfo.ChangeListener __changeListener = new SqlAssertionInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Statement = SCHEMA.getField("statement");
    private final static RecordDataSchema.Field FIELD_ChangeType = SCHEMA.getField("changeType");
    private final static RecordDataSchema.Field FIELD_Operator = SCHEMA.getField("operator");
    private final static RecordDataSchema.Field FIELD_Parameters = SCHEMA.getField("parameters");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public SqlAssertionInfo() {
        super(new DataMap(8, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public SqlAssertionInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static SqlAssertionInfo.Fields fields() {
        return _fields;
    }

    public static SqlAssertionInfo.ProjectionMask createMask() {
        return new SqlAssertionInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see SqlAssertionInfo.Fields#type
     */
    public boolean hasType() {
        if (_typeField!= null) {
            return true;
        }
        return super._map.containsKey("type");
    }

    /**
     * Remover for type
     * 
     * @see SqlAssertionInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see SqlAssertionInfo.Fields#type
     */
    @Nullable
    public SqlAssertionType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, SqlAssertionType.class, SqlAssertionType.$UNKNOWN);
                    return _typeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for type
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SqlAssertionInfo.Fields#type
     */
    @Nonnull
    public SqlAssertionType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, SqlAssertionType.class, SqlAssertionType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see SqlAssertionInfo.Fields#type
     */
    public SqlAssertionInfo setType(
        @Nullable
        SqlAssertionType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.SqlAssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "type", value.name());
                    _typeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for type
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SqlAssertionInfo.Fields#type
     */
    public SqlAssertionInfo setType(
        @Nonnull
        SqlAssertionType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.SqlAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see SqlAssertionInfo.Fields#entity
     */
    public boolean hasEntity() {
        if (_entityField!= null) {
            return true;
        }
        return super._map.containsKey("entity");
    }

    /**
     * Remover for entity
     * 
     * @see SqlAssertionInfo.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see SqlAssertionInfo.Fields#entity
     */
    @Nullable
    public com.linkedin.common.urn.Urn getEntity(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getEntity();
            case DEFAULT:
            case NULL:
                if (_entityField!= null) {
                    return _entityField;
                } else {
                    Object __rawValue = super._map.get("entity");
                    _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _entityField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for entity
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SqlAssertionInfo.Fields#entity
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getEntity() {
        if (_entityField!= null) {
            return _entityField;
        } else {
            Object __rawValue = super._map.get("entity");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("entity");
            }
            _entityField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _entityField;
        }
    }

    /**
     * Setter for entity
     * 
     * @see SqlAssertionInfo.Fields#entity
     */
    public SqlAssertionInfo setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.assertion.SqlAssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeEntity();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _entityField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for entity
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SqlAssertionInfo.Fields#entity
     */
    public SqlAssertionInfo setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.assertion.SqlAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for statement
     * 
     * @see SqlAssertionInfo.Fields#statement
     */
    public boolean hasStatement() {
        if (_statementField!= null) {
            return true;
        }
        return super._map.containsKey("statement");
    }

    /**
     * Remover for statement
     * 
     * @see SqlAssertionInfo.Fields#statement
     */
    public void removeStatement() {
        super._map.remove("statement");
    }

    /**
     * Getter for statement
     * 
     * @see SqlAssertionInfo.Fields#statement
     */
    @Nullable
    public String getStatement(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStatement();
            case DEFAULT:
            case NULL:
                if (_statementField!= null) {
                    return _statementField;
                } else {
                    Object __rawValue = super._map.get("statement");
                    _statementField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _statementField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for statement
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see SqlAssertionInfo.Fields#statement
     */
    @Nonnull
    public String getStatement() {
        if (_statementField!= null) {
            return _statementField;
        } else {
            Object __rawValue = super._map.get("statement");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("statement");
            }
            _statementField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _statementField;
        }
    }

    /**
     * Setter for statement
     * 
     * @see SqlAssertionInfo.Fields#statement
     */
    public SqlAssertionInfo setStatement(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStatement(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field statement of com.linkedin.assertion.SqlAssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "statement", value);
                    _statementField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStatement();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "statement", value);
                    _statementField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "statement", value);
                    _statementField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for statement
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SqlAssertionInfo.Fields#statement
     */
    public SqlAssertionInfo setStatement(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field statement of com.linkedin.assertion.SqlAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "statement", value);
            _statementField = value;
        }
        return this;
    }

    /**
     * Existence checker for changeType
     * 
     * @see SqlAssertionInfo.Fields#changeType
     */
    public boolean hasChangeType() {
        if (_changeTypeField!= null) {
            return true;
        }
        return super._map.containsKey("changeType");
    }

    /**
     * Remover for changeType
     * 
     * @see SqlAssertionInfo.Fields#changeType
     */
    public void removeChangeType() {
        super._map.remove("changeType");
    }

    /**
     * Getter for changeType
     * 
     * @see SqlAssertionInfo.Fields#changeType
     */
    @Nullable
    public AssertionValueChangeType getChangeType(GetMode mode) {
        return getChangeType();
    }

    /**
     * Getter for changeType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see SqlAssertionInfo.Fields#changeType
     */
    @Nullable
    public AssertionValueChangeType getChangeType() {
        if (_changeTypeField!= null) {
            return _changeTypeField;
        } else {
            Object __rawValue = super._map.get("changeType");
            _changeTypeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionValueChangeType.class, AssertionValueChangeType.$UNKNOWN);
            return _changeTypeField;
        }
    }

    /**
     * Setter for changeType
     * 
     * @see SqlAssertionInfo.Fields#changeType
     */
    public SqlAssertionInfo setChangeType(
        @Nullable
        AssertionValueChangeType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setChangeType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeChangeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "changeType", value.name());
                    _changeTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "changeType", value.name());
                    _changeTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for changeType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see SqlAssertionInfo.Fields#changeType
     */
    public SqlAssertionInfo setChangeType(
        @Nonnull
        AssertionValueChangeType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field changeType of com.linkedin.assertion.SqlAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "changeType", value.name());
            _changeTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for operator
     * 
     * @see SqlAssertionInfo.Fields#operator
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
     * @see SqlAssertionInfo.Fields#operator
     */
    public void removeOperator() {
        super._map.remove("operator");
    }

    /**
     * Getter for operator
     * 
     * @see SqlAssertionInfo.Fields#operator
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
     * @see SqlAssertionInfo.Fields#operator
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
     * @see SqlAssertionInfo.Fields#operator
     */
    public SqlAssertionInfo setOperator(
        @Nullable
        AssertionStdOperator value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOperator(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field operator of com.linkedin.assertion.SqlAssertionInfo");
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
     * @see SqlAssertionInfo.Fields#operator
     */
    public SqlAssertionInfo setOperator(
        @Nonnull
        AssertionStdOperator value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field operator of com.linkedin.assertion.SqlAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "operator", value.name());
            _operatorField = value;
        }
        return this;
    }

    /**
     * Existence checker for parameters
     * 
     * @see SqlAssertionInfo.Fields#parameters
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
     * @see SqlAssertionInfo.Fields#parameters
     */
    public void removeParameters() {
        super._map.remove("parameters");
    }

    /**
     * Getter for parameters
     * 
     * @see SqlAssertionInfo.Fields#parameters
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
     * @see SqlAssertionInfo.Fields#parameters
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
     * @see SqlAssertionInfo.Fields#parameters
     */
    public SqlAssertionInfo setParameters(
        @Nullable
        AssertionStdParameters value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParameters(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field parameters of com.linkedin.assertion.SqlAssertionInfo");
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
     * @see SqlAssertionInfo.Fields#parameters
     */
    public SqlAssertionInfo setParameters(
        @Nonnull
        AssertionStdParameters value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parameters of com.linkedin.assertion.SqlAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
            _parametersField = value;
        }
        return this;
    }

    @Override
    public SqlAssertionInfo clone()
        throws CloneNotSupportedException
    {
        SqlAssertionInfo __clone = ((SqlAssertionInfo) super.clone());
        __clone.__changeListener = new SqlAssertionInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public SqlAssertionInfo copy()
        throws CloneNotSupportedException
    {
        SqlAssertionInfo __copy = ((SqlAssertionInfo) super.copy());
        __copy._changeTypeField = null;
        __copy._statementField = null;
        __copy._typeField = null;
        __copy._parametersField = null;
        __copy._entityField = null;
        __copy._operatorField = null;
        __copy.__changeListener = new SqlAssertionInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final SqlAssertionInfo __objectRef;

        private ChangeListener(SqlAssertionInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "changeType":
                    __objectRef._changeTypeField = null;
                    break;
                case "statement":
                    __objectRef._statementField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "parameters":
                    __objectRef._parametersField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
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
         * The type of the SQL assertion being monitored.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The entity targeted by this SQL check.
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * The SQL statement to be executed when evaluating the assertion (or computing the metric).
         * This should be a valid and complete statement, executable by itself.
         * 
         * Usually this should be a SELECT query statement.
         * 
         */
        public PathSpec statement() {
            return new PathSpec(getPathComponents(), "statement");
        }

        /**
         * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
         * This value is required if the type is METRIC_CHANGE.
         * 
         */
        public PathSpec changeType() {
            return new PathSpec(getPathComponents(), "changeType");
        }

        /**
         * The operator you'd like to apply to the result of the SQL query.
         * 
         * Note that at this time, only numeric operators are valid inputs:
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
            super(8);
        }

        /**
         * The type of the SQL assertion being monitored.
         * 
         */
        public SqlAssertionInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The entity targeted by this SQL check.
         * 
         */
        public SqlAssertionInfo.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The SQL statement to be executed when evaluating the assertion (or computing the metric).
         * This should be a valid and complete statement, executable by itself.
         * 
         * Usually this should be a SELECT query statement.
         * 
         */
        public SqlAssertionInfo.ProjectionMask withStatement() {
            getDataMap().put("statement", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
         * This value is required if the type is METRIC_CHANGE.
         * 
         */
        public SqlAssertionInfo.ProjectionMask withChangeType() {
            getDataMap().put("changeType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The operator you'd like to apply to the result of the SQL query.
         * 
         * Note that at this time, only numeric operators are valid inputs:
         * GREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,
         * BETWEEN.
         * 
         */
        public SqlAssertionInfo.ProjectionMask withOperator() {
            getDataMap().put("operator", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The parameters you'd like to provide as input to the operator.
         * 
         * Note that only numeric parameter types are valid inputs: NUMBER.
         * 
         */
        public SqlAssertionInfo.ProjectionMask withParameters(Function<com.linkedin.assertion.AssertionStdParameters.ProjectionMask, com.linkedin.assertion.AssertionStdParameters.ProjectionMask> nestedMask) {
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
        public SqlAssertionInfo.ProjectionMask withParameters() {
            _parametersMask = null;
            getDataMap().put("parameters", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
