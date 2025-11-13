
package com.linkedin.assertion;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.UrnArray;
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
import com.linkedin.data.template.StringMap;


/**
 * Attributes that are applicable to single-Dataset Assertions
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/DatasetAssertionInfo.pdl.")
public class DatasetAssertionInfo
    extends RecordTemplate
{

    private final static DatasetAssertionInfo.Fields _fields = new DatasetAssertionInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes that are applicable to single-Dataset Assertions\n*/record DatasetAssertionInfo{/**The dataset targeted by this assertion.*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"Asserts\"}dataset:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Scope of the Assertion. What part of the dataset does this assertion apply to?\n*/@Searchable={}scope:enum DatasetAssertionScope{/**This assertion applies to dataset column(s)*/DATASET_COLUMN/**This assertion applies to entire rows of the dataset*/DATASET_ROWS/**This assertion applies to the storage size of the dataset*/DATASET_STORAGE_SIZE/**This assertion applies to the schema of the dataset*/DATASET_SCHEMA/**The scope of the assertion is unknown*/UNKNOWN}/**One or more dataset schema fields that are targeted by this assertion.\n\nThis field is expected to be provided if the assertion scope is DATASET_COLUMN.*/@Relationship.`/*`={\"entityTypes\":[\"schemaField\"],\"name\":\"Asserts\"}@Searchable.`/*`.fieldType=\"URN\"fields:optional array[com.linkedin.common.Urn]/**Standardized assertion operator\nThis field is left blank if there is no selected aggregation or metric for a particular column.*/@Searchable={}aggregation:optional/**The function that is applied to the aggregation input (schema, rows, column values) before evaluating an operator.*/enum AssertionStdAggregation{/**Assertion is applied on number of rows.*/ROW_COUNT/**Assertion is applied on all columns.*/COLUMNS/**Assertion is applied on number of columns.*/COLUMN_COUNT/**Assertion is applied on individual column value. (No aggregation)*/IDENTITY/**Assertion is applied on column mean*/MEAN/**Assertion is applied on column median*/MEDIAN/**Assertion is applied on number of distinct values in column*/UNIQUE_COUNT/**Assertion is applied on proportion of distinct values in column*/UNIQUE_PROPORTION/**Assertion is applied on proportion of distinct values in column\n\nDeprecated! Use UNIQUE_PROPORTION instead.*/UNIQUE_PROPOTION/**Assertion is applied on number of null values in column*/NULL_COUNT/**Assertion is applied on proportion of null values in column*/NULL_PROPORTION/**Assertion is applied on column std deviation*/STDDEV/**Assertion is applied on column min*/MIN/**Assertion is applied on column std deviation*/MAX/**Assertion is applied on column sum*/SUM/**Other*/_NATIVE_}/**Standardized assertion operator*/operator:/**A boolean operator that is applied on the input to an assertion, after an aggregation function has been applied.*/enum AssertionStdOperator{/**Value being asserted is between min_value and max_value.  Requires 'minValue' & 'maxValue' parameters.*/BETWEEN/**Value being asserted is less than a max value. Requires 'value' parameter.*/LESS_THAN/**Value being asserted is less than or equal to some value. Requires 'value' parameter.*/LESS_THAN_OR_EQUAL_TO/**Value being asserted is greater than some value. Requires 'value' parameter.*/GREATER_THAN/**Value being asserted is greater than or equal to some value. Requires 'value' parameter.*/GREATER_THAN_OR_EQUAL_TO/**Value being asserted is equal to value. Requires 'value' parameter.*/EQUAL_TO/**Value being asserted is not equal to value. Requires 'value' parameter.*/NOT_EQUAL_TO/**Value being asserted is null. Requires no parameters.*/NULL/**Value being asserted is not null. Requires no parameters.*/NOT_NULL/**Value being asserted contains value. Requires 'value' parameter.*/CONTAIN/**Value being asserted ends with value. Requires 'value' parameter.*/END_WITH/**Value being asserted starts with value. Requires 'value' parameter.*/START_WITH/**Value being asserted matches the regex value. Requires 'value' parameter.*/REGEX_MATCH/**Value being asserted is one of the array values. Requires 'value' parameter.*/IN/**Value being asserted is not in one of the array values. Requires 'value' parameter.*/NOT_IN/**Value being asserted is true. Requires no parameters.*/IS_TRUE/**Value being asserted is false. Requires no parameters.*/IS_FALSE/**Other*/_NATIVE_}/**Standard parameters required for the assertion. e.g. min_value, max_value, value, columns*/parameters:optional/**Parameters for AssertionStdOperators.*/record AssertionStdParameters{/**The value parameter of an assertion*/value:optional/**Single parameter for AssertionStdOperators.*/record AssertionStdParameter{/**The parameter value*/value:string/**The type of the parameter*/type:enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}}/**The maxValue parameter of an assertion*/maxValue:optional AssertionStdParameter/**The minValue parameter of an assertion*/minValue:optional AssertionStdParameter}/**Native assertion type*/nativeType:optional string/**Native parameters required for the assertion.*/nativeParameters:optional map[string,string]logic:optional string}", SchemaFormatType.PDL));
    private com.linkedin.common.urn.Urn _datasetField = null;
    private DatasetAssertionScope _scopeField = null;
    private UrnArray _fieldsField = null;
    private AssertionStdAggregation _aggregationField = null;
    private AssertionStdOperator _operatorField = null;
    private AssertionStdParameters _parametersField = null;
    private String _nativeTypeField = null;
    private StringMap _nativeParametersField = null;
    private String _logicField = null;
    private DatasetAssertionInfo.ChangeListener __changeListener = new DatasetAssertionInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Dataset = SCHEMA.getField("dataset");
    private final static RecordDataSchema.Field FIELD_Scope = SCHEMA.getField("scope");
    private final static RecordDataSchema.Field FIELD_Fields = SCHEMA.getField("fields");
    private final static RecordDataSchema.Field FIELD_Aggregation = SCHEMA.getField("aggregation");
    private final static RecordDataSchema.Field FIELD_Operator = SCHEMA.getField("operator");
    private final static RecordDataSchema.Field FIELD_Parameters = SCHEMA.getField("parameters");
    private final static RecordDataSchema.Field FIELD_NativeType = SCHEMA.getField("nativeType");
    private final static RecordDataSchema.Field FIELD_NativeParameters = SCHEMA.getField("nativeParameters");
    private final static RecordDataSchema.Field FIELD_Logic = SCHEMA.getField("logic");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public DatasetAssertionInfo() {
        super(new DataMap(12, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public DatasetAssertionInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static DatasetAssertionInfo.Fields fields() {
        return _fields;
    }

    public static DatasetAssertionInfo.ProjectionMask createMask() {
        return new DatasetAssertionInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for dataset
     * 
     * @see DatasetAssertionInfo.Fields#dataset
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
     * @see DatasetAssertionInfo.Fields#dataset
     */
    public void removeDataset() {
        super._map.remove("dataset");
    }

    /**
     * Getter for dataset
     * 
     * @see DatasetAssertionInfo.Fields#dataset
     */
    @Nullable
    public com.linkedin.common.urn.Urn getDataset(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDataset();
            case DEFAULT:
            case NULL:
                if (_datasetField!= null) {
                    return _datasetField;
                } else {
                    Object __rawValue = super._map.get("dataset");
                    _datasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
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
     * @see DatasetAssertionInfo.Fields#dataset
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getDataset() {
        if (_datasetField!= null) {
            return _datasetField;
        } else {
            Object __rawValue = super._map.get("dataset");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("dataset");
            }
            _datasetField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _datasetField;
        }
    }

    /**
     * Setter for dataset
     * 
     * @see DatasetAssertionInfo.Fields#dataset
     */
    public DatasetAssertionInfo setDataset(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDataset(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field dataset of com.linkedin.assertion.DatasetAssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _datasetField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDataset();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _datasetField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
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
     * @see DatasetAssertionInfo.Fields#dataset
     */
    public DatasetAssertionInfo setDataset(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field dataset of com.linkedin.assertion.DatasetAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "dataset", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _datasetField = value;
        }
        return this;
    }

    /**
     * Existence checker for scope
     * 
     * @see DatasetAssertionInfo.Fields#scope
     */
    public boolean hasScope() {
        if (_scopeField!= null) {
            return true;
        }
        return super._map.containsKey("scope");
    }

    /**
     * Remover for scope
     * 
     * @see DatasetAssertionInfo.Fields#scope
     */
    public void removeScope() {
        super._map.remove("scope");
    }

    /**
     * Getter for scope
     * 
     * @see DatasetAssertionInfo.Fields#scope
     */
    @Nullable
    public DatasetAssertionScope getScope(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getScope();
            case DEFAULT:
            case NULL:
                if (_scopeField!= null) {
                    return _scopeField;
                } else {
                    Object __rawValue = super._map.get("scope");
                    _scopeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DatasetAssertionScope.class, DatasetAssertionScope.$UNKNOWN);
                    return _scopeField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for scope
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see DatasetAssertionInfo.Fields#scope
     */
    @Nonnull
    public DatasetAssertionScope getScope() {
        if (_scopeField!= null) {
            return _scopeField;
        } else {
            Object __rawValue = super._map.get("scope");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("scope");
            }
            _scopeField = DataTemplateUtil.coerceEnumOutput(__rawValue, DatasetAssertionScope.class, DatasetAssertionScope.$UNKNOWN);
            return _scopeField;
        }
    }

    /**
     * Setter for scope
     * 
     * @see DatasetAssertionInfo.Fields#scope
     */
    public DatasetAssertionInfo setScope(
        @Nullable
        DatasetAssertionScope value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setScope(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field scope of com.linkedin.assertion.DatasetAssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "scope", value.name());
                    _scopeField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeScope();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "scope", value.name());
                    _scopeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "scope", value.name());
                    _scopeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for scope
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetAssertionInfo.Fields#scope
     */
    public DatasetAssertionInfo setScope(
        @Nonnull
        DatasetAssertionScope value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field scope of com.linkedin.assertion.DatasetAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "scope", value.name());
            _scopeField = value;
        }
        return this;
    }

    /**
     * Existence checker for fields
     * 
     * @see DatasetAssertionInfo.Fields#fields
     */
    public boolean hasFields() {
        if (_fieldsField!= null) {
            return true;
        }
        return super._map.containsKey("fields");
    }

    /**
     * Remover for fields
     * 
     * @see DatasetAssertionInfo.Fields#fields
     */
    public void removeFields() {
        super._map.remove("fields");
    }

    /**
     * Getter for fields
     * 
     * @see DatasetAssertionInfo.Fields#fields
     */
    @Nullable
    public UrnArray getFields(GetMode mode) {
        return getFields();
    }

    /**
     * Getter for fields
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetAssertionInfo.Fields#fields
     */
    @Nullable
    public UrnArray getFields() {
        if (_fieldsField!= null) {
            return _fieldsField;
        } else {
            Object __rawValue = super._map.get("fields");
            _fieldsField = ((__rawValue == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _fieldsField;
        }
    }

    /**
     * Setter for fields
     * 
     * @see DatasetAssertionInfo.Fields#fields
     */
    public DatasetAssertionInfo setFields(
        @Nullable
        UrnArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFields(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFields();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
                    _fieldsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
                    _fieldsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fields
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetAssertionInfo.Fields#fields
     */
    public DatasetAssertionInfo setFields(
        @Nonnull
        UrnArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fields of com.linkedin.assertion.DatasetAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fields", value.data());
            _fieldsField = value;
        }
        return this;
    }

    /**
     * Existence checker for aggregation
     * 
     * @see DatasetAssertionInfo.Fields#aggregation
     */
    public boolean hasAggregation() {
        if (_aggregationField!= null) {
            return true;
        }
        return super._map.containsKey("aggregation");
    }

    /**
     * Remover for aggregation
     * 
     * @see DatasetAssertionInfo.Fields#aggregation
     */
    public void removeAggregation() {
        super._map.remove("aggregation");
    }

    /**
     * Getter for aggregation
     * 
     * @see DatasetAssertionInfo.Fields#aggregation
     */
    @Nullable
    public AssertionStdAggregation getAggregation(GetMode mode) {
        return getAggregation();
    }

    /**
     * Getter for aggregation
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetAssertionInfo.Fields#aggregation
     */
    @Nullable
    public AssertionStdAggregation getAggregation() {
        if (_aggregationField!= null) {
            return _aggregationField;
        } else {
            Object __rawValue = super._map.get("aggregation");
            _aggregationField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionStdAggregation.class, AssertionStdAggregation.$UNKNOWN);
            return _aggregationField;
        }
    }

    /**
     * Setter for aggregation
     * 
     * @see DatasetAssertionInfo.Fields#aggregation
     */
    public DatasetAssertionInfo setAggregation(
        @Nullable
        AssertionStdAggregation value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAggregation(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAggregation();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregation", value.name());
                    _aggregationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aggregation", value.name());
                    _aggregationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aggregation
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetAssertionInfo.Fields#aggregation
     */
    public DatasetAssertionInfo setAggregation(
        @Nonnull
        AssertionStdAggregation value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aggregation of com.linkedin.assertion.DatasetAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aggregation", value.name());
            _aggregationField = value;
        }
        return this;
    }

    /**
     * Existence checker for operator
     * 
     * @see DatasetAssertionInfo.Fields#operator
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
     * @see DatasetAssertionInfo.Fields#operator
     */
    public void removeOperator() {
        super._map.remove("operator");
    }

    /**
     * Getter for operator
     * 
     * @see DatasetAssertionInfo.Fields#operator
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
     * @see DatasetAssertionInfo.Fields#operator
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
     * @see DatasetAssertionInfo.Fields#operator
     */
    public DatasetAssertionInfo setOperator(
        @Nullable
        AssertionStdOperator value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOperator(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field operator of com.linkedin.assertion.DatasetAssertionInfo");
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
     * @see DatasetAssertionInfo.Fields#operator
     */
    public DatasetAssertionInfo setOperator(
        @Nonnull
        AssertionStdOperator value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field operator of com.linkedin.assertion.DatasetAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "operator", value.name());
            _operatorField = value;
        }
        return this;
    }

    /**
     * Existence checker for parameters
     * 
     * @see DatasetAssertionInfo.Fields#parameters
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
     * @see DatasetAssertionInfo.Fields#parameters
     */
    public void removeParameters() {
        super._map.remove("parameters");
    }

    /**
     * Getter for parameters
     * 
     * @see DatasetAssertionInfo.Fields#parameters
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
     * @see DatasetAssertionInfo.Fields#parameters
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
     * @see DatasetAssertionInfo.Fields#parameters
     */
    public DatasetAssertionInfo setParameters(
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
     * @see DatasetAssertionInfo.Fields#parameters
     */
    public DatasetAssertionInfo setParameters(
        @Nonnull
        AssertionStdParameters value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parameters of com.linkedin.assertion.DatasetAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
            _parametersField = value;
        }
        return this;
    }

    /**
     * Existence checker for nativeType
     * 
     * @see DatasetAssertionInfo.Fields#nativeType
     */
    public boolean hasNativeType() {
        if (_nativeTypeField!= null) {
            return true;
        }
        return super._map.containsKey("nativeType");
    }

    /**
     * Remover for nativeType
     * 
     * @see DatasetAssertionInfo.Fields#nativeType
     */
    public void removeNativeType() {
        super._map.remove("nativeType");
    }

    /**
     * Getter for nativeType
     * 
     * @see DatasetAssertionInfo.Fields#nativeType
     */
    @Nullable
    public String getNativeType(GetMode mode) {
        return getNativeType();
    }

    /**
     * Getter for nativeType
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetAssertionInfo.Fields#nativeType
     */
    @Nullable
    public String getNativeType() {
        if (_nativeTypeField!= null) {
            return _nativeTypeField;
        } else {
            Object __rawValue = super._map.get("nativeType");
            _nativeTypeField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _nativeTypeField;
        }
    }

    /**
     * Setter for nativeType
     * 
     * @see DatasetAssertionInfo.Fields#nativeType
     */
    public DatasetAssertionInfo setNativeType(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNativeType(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNativeType();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeType", value);
                    _nativeTypeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nativeType", value);
                    _nativeTypeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nativeType
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetAssertionInfo.Fields#nativeType
     */
    public DatasetAssertionInfo setNativeType(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nativeType of com.linkedin.assertion.DatasetAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nativeType", value);
            _nativeTypeField = value;
        }
        return this;
    }

    /**
     * Existence checker for nativeParameters
     * 
     * @see DatasetAssertionInfo.Fields#nativeParameters
     */
    public boolean hasNativeParameters() {
        if (_nativeParametersField!= null) {
            return true;
        }
        return super._map.containsKey("nativeParameters");
    }

    /**
     * Remover for nativeParameters
     * 
     * @see DatasetAssertionInfo.Fields#nativeParameters
     */
    public void removeNativeParameters() {
        super._map.remove("nativeParameters");
    }

    /**
     * Getter for nativeParameters
     * 
     * @see DatasetAssertionInfo.Fields#nativeParameters
     */
    @Nullable
    public StringMap getNativeParameters(GetMode mode) {
        return getNativeParameters();
    }

    /**
     * Getter for nativeParameters
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetAssertionInfo.Fields#nativeParameters
     */
    @Nullable
    public StringMap getNativeParameters() {
        if (_nativeParametersField!= null) {
            return _nativeParametersField;
        } else {
            Object __rawValue = super._map.get("nativeParameters");
            _nativeParametersField = ((__rawValue == null)?null:new StringMap(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _nativeParametersField;
        }
    }

    /**
     * Setter for nativeParameters
     * 
     * @see DatasetAssertionInfo.Fields#nativeParameters
     */
    public DatasetAssertionInfo setNativeParameters(
        @Nullable
        StringMap value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setNativeParameters(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeNativeParameters();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "nativeParameters", value.data());
                    _nativeParametersField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "nativeParameters", value.data());
                    _nativeParametersField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for nativeParameters
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetAssertionInfo.Fields#nativeParameters
     */
    public DatasetAssertionInfo setNativeParameters(
        @Nonnull
        StringMap value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field nativeParameters of com.linkedin.assertion.DatasetAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "nativeParameters", value.data());
            _nativeParametersField = value;
        }
        return this;
    }

    /**
     * Existence checker for logic
     * 
     * @see DatasetAssertionInfo.Fields#logic
     */
    public boolean hasLogic() {
        if (_logicField!= null) {
            return true;
        }
        return super._map.containsKey("logic");
    }

    /**
     * Remover for logic
     * 
     * @see DatasetAssertionInfo.Fields#logic
     */
    public void removeLogic() {
        super._map.remove("logic");
    }

    /**
     * Getter for logic
     * 
     * @see DatasetAssertionInfo.Fields#logic
     */
    @Nullable
    public String getLogic(GetMode mode) {
        return getLogic();
    }

    /**
     * Getter for logic
     * 
     * @return
     *     Optional field. Always check for null.
     * @see DatasetAssertionInfo.Fields#logic
     */
    @Nullable
    public String getLogic() {
        if (_logicField!= null) {
            return _logicField;
        } else {
            Object __rawValue = super._map.get("logic");
            _logicField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _logicField;
        }
    }

    /**
     * Setter for logic
     * 
     * @see DatasetAssertionInfo.Fields#logic
     */
    public DatasetAssertionInfo setLogic(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLogic(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLogic();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "logic", value);
                    _logicField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "logic", value);
                    _logicField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for logic
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see DatasetAssertionInfo.Fields#logic
     */
    public DatasetAssertionInfo setLogic(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field logic of com.linkedin.assertion.DatasetAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "logic", value);
            _logicField = value;
        }
        return this;
    }

    @Override
    public DatasetAssertionInfo clone()
        throws CloneNotSupportedException
    {
        DatasetAssertionInfo __clone = ((DatasetAssertionInfo) super.clone());
        __clone.__changeListener = new DatasetAssertionInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public DatasetAssertionInfo copy()
        throws CloneNotSupportedException
    {
        DatasetAssertionInfo __copy = ((DatasetAssertionInfo) super.copy());
        __copy._nativeParametersField = null;
        __copy._scopeField = null;
        __copy._nativeTypeField = null;
        __copy._aggregationField = null;
        __copy._logicField = null;
        __copy._fieldsField = null;
        __copy._datasetField = null;
        __copy._parametersField = null;
        __copy._operatorField = null;
        __copy.__changeListener = new DatasetAssertionInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final DatasetAssertionInfo __objectRef;

        private ChangeListener(DatasetAssertionInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "nativeParameters":
                    __objectRef._nativeParametersField = null;
                    break;
                case "scope":
                    __objectRef._scopeField = null;
                    break;
                case "nativeType":
                    __objectRef._nativeTypeField = null;
                    break;
                case "aggregation":
                    __objectRef._aggregationField = null;
                    break;
                case "logic":
                    __objectRef._logicField = null;
                    break;
                case "fields":
                    __objectRef._fieldsField = null;
                    break;
                case "dataset":
                    __objectRef._datasetField = null;
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
         * The dataset targeted by this assertion.
         * 
         */
        public PathSpec dataset() {
            return new PathSpec(getPathComponents(), "dataset");
        }

        /**
         * Scope of the Assertion. What part of the dataset does this assertion apply to?
         * 
         * 
         */
        public PathSpec scope() {
            return new PathSpec(getPathComponents(), "scope");
        }

        /**
         * One or more dataset schema fields that are targeted by this assertion.
         * 
         * This field is expected to be provided if the assertion scope is DATASET_COLUMN.
         * 
         */
        public PathSpec fields() {
            return new PathSpec(getPathComponents(), "fields");
        }

        /**
         * One or more dataset schema fields that are targeted by this assertion.
         * 
         * This field is expected to be provided if the assertion scope is DATASET_COLUMN.
         * 
         */
        public PathSpec fields(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "fields");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Standardized assertion operator
         * This field is left blank if there is no selected aggregation or metric for a particular column.
         * 
         */
        public PathSpec aggregation() {
            return new PathSpec(getPathComponents(), "aggregation");
        }

        /**
         * Standardized assertion operator
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
         * Native assertion type
         * 
         */
        public PathSpec nativeType() {
            return new PathSpec(getPathComponents(), "nativeType");
        }

        /**
         * Native parameters required for the assertion.
         * 
         */
        public PathSpec nativeParameters() {
            return new PathSpec(getPathComponents(), "nativeParameters");
        }

        public PathSpec logic() {
            return new PathSpec(getPathComponents(), "logic");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.assertion.AssertionStdParameters.ProjectionMask _parametersMask;

        ProjectionMask() {
            super(12);
        }

        /**
         * The dataset targeted by this assertion.
         * 
         */
        public DatasetAssertionInfo.ProjectionMask withDataset() {
            getDataMap().put("dataset", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Scope of the Assertion. What part of the dataset does this assertion apply to?
         * 
         * 
         */
        public DatasetAssertionInfo.ProjectionMask withScope() {
            getDataMap().put("scope", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * One or more dataset schema fields that are targeted by this assertion.
         * 
         * This field is expected to be provided if the assertion scope is DATASET_COLUMN.
         * 
         */
        public DatasetAssertionInfo.ProjectionMask withFields() {
            getDataMap().put("fields", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * One or more dataset schema fields that are targeted by this assertion.
         * 
         * This field is expected to be provided if the assertion scope is DATASET_COLUMN.
         * 
         */
        public DatasetAssertionInfo.ProjectionMask withFields(Integer start, Integer count) {
            getDataMap().put("fields", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("fields").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("fields").put("$count", count);
            }
            return this;
        }

        /**
         * Standardized assertion operator
         * This field is left blank if there is no selected aggregation or metric for a particular column.
         * 
         */
        public DatasetAssertionInfo.ProjectionMask withAggregation() {
            getDataMap().put("aggregation", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Standardized assertion operator
         * 
         */
        public DatasetAssertionInfo.ProjectionMask withOperator() {
            getDataMap().put("operator", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Standard parameters required for the assertion. e.g. min_value, max_value, value, columns
         * 
         */
        public DatasetAssertionInfo.ProjectionMask withParameters(Function<com.linkedin.assertion.AssertionStdParameters.ProjectionMask, com.linkedin.assertion.AssertionStdParameters.ProjectionMask> nestedMask) {
            _parametersMask = nestedMask.apply(((_parametersMask == null)?AssertionStdParameters.createMask():_parametersMask));
            getDataMap().put("parameters", _parametersMask.getDataMap());
            return this;
        }

        /**
         * Standard parameters required for the assertion. e.g. min_value, max_value, value, columns
         * 
         */
        public DatasetAssertionInfo.ProjectionMask withParameters() {
            _parametersMask = null;
            getDataMap().put("parameters", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Native assertion type
         * 
         */
        public DatasetAssertionInfo.ProjectionMask withNativeType() {
            getDataMap().put("nativeType", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Native parameters required for the assertion.
         * 
         */
        public DatasetAssertionInfo.ProjectionMask withNativeParameters() {
            getDataMap().put("nativeParameters", MaskMap.POSITIVE_MASK);
            return this;
        }

        public DatasetAssertionInfo.ProjectionMask withLogic() {
            getDataMap().put("logic", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
