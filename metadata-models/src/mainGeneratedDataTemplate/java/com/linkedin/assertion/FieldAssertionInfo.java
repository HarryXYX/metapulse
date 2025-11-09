
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
import com.linkedin.dataset.DatasetFilter;


/**
 * Attributes defining a Field Assertion.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/FieldAssertionInfo.pdl.")
public class FieldAssertionInfo
    extends RecordTemplate
{

    private final static FieldAssertionInfo.Fields _fields = new FieldAssertionInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes defining a Field Assertion.\n*/record FieldAssertionInfo{/**The type of the field assertion being monitored.*/@Searchable={}type:enum FieldAssertionType{/**An assertion used to validate the values contained with a field / column given a set of rows.*/FIELD_VALUES/**An assertion used to validate the value of a common field / column metric (e.g. aggregation) such as null count + percentage,\nmin, max, median, and more.*/FIELD_METRIC}/**The entity targeted by this Field check.*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"Asserts\"}@Searchable.fieldType=\"URN\"entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The definition of an assertion that validates individual values of a field / column for a set of rows.\nThis type of assertion verifies that each column value meets a particular requirement.*/fieldValuesAssertion:optional/**Attributes defining a field values assertion, which asserts that the values for a field / column\nof a dataset / table matches a set of expectations.\n\nIn other words, this type of assertion acts as a semantic constraint applied to fields for a specific column.\n\nTODO: We should display the \"failed row count\" to the user if the column fails the verification rules.\nTODO: Determine whether we need an \"operator\" that can be applied to the field.*/record FieldValuesAssertion{/**The field under evaluation*/@Searchable.`/path`.fieldName=\"fieldPath\"field:{namespace com.linkedin.schema/**Lightweight spec used for referencing a particular schema field.\n*/record SchemaFieldSpec{/**The field path*/path:string/**The DataHub standard schema field type.*/type:string/**The native field type*/nativeType:string}}/**An optional transform to apply to field values\nbefore evaluating the operator.\n\nIf none is applied, the field value will be compared as is.*/transform:optional/**Definition of a transform applied to the values of a column / field.\nNote that the applicability of a field transform ultimately depends on the native type\nof the field / column.\n\nModel has single field to permit extension.*/record FieldTransform{/**The type of the field transform, e.g. the transformation\nfunction / operator to apply.*/type:enum FieldTransformType{/**Obtain the length of a string field / column (applicable to string types)*/LENGTH}}/**The predicate to evaluate against a single value of the field.\nDepending on the operator, parameters may be required in order to successfully\nevaluate the assertion against the field value.*/operator:/**A boolean operator that is applied on the input to an assertion, after an aggregation function has been applied.*/enum AssertionStdOperator{/**Value being asserted is between min_value and max_value.  Requires 'minValue' & 'maxValue' parameters.*/BETWEEN/**Value being asserted is less than a max value. Requires 'value' parameter.*/LESS_THAN/**Value being asserted is less than or equal to some value. Requires 'value' parameter.*/LESS_THAN_OR_EQUAL_TO/**Value being asserted is greater than some value. Requires 'value' parameter.*/GREATER_THAN/**Value being asserted is greater than or equal to some value. Requires 'value' parameter.*/GREATER_THAN_OR_EQUAL_TO/**Value being asserted is equal to value. Requires 'value' parameter.*/EQUAL_TO/**Value being asserted is not equal to value. Requires 'value' parameter.*/NOT_EQUAL_TO/**Value being asserted is null. Requires no parameters.*/NULL/**Value being asserted is not null. Requires no parameters.*/NOT_NULL/**Value being asserted contains value. Requires 'value' parameter.*/CONTAIN/**Value being asserted ends with value. Requires 'value' parameter.*/END_WITH/**Value being asserted starts with value. Requires 'value' parameter.*/START_WITH/**Value being asserted matches the regex value. Requires 'value' parameter.*/REGEX_MATCH/**Value being asserted is one of the array values. Requires 'value' parameter.*/IN/**Value being asserted is not in one of the array values. Requires 'value' parameter.*/NOT_IN/**Value being asserted is true. Requires no parameters.*/IS_TRUE/**Value being asserted is false. Requires no parameters.*/IS_FALSE/**Other*/_NATIVE_}/**Standard parameters required for the assertion. e.g. min_value, max_value, value, columns*/parameters:optional/**Parameters for AssertionStdOperators.*/record AssertionStdParameters{/**The value parameter of an assertion*/value:optional/**Single parameter for AssertionStdOperators.*/record AssertionStdParameter{/**The parameter value*/value:string/**The type of the parameter*/type:enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}}/**The maxValue parameter of an assertion*/maxValue:optional AssertionStdParameter/**The minValue parameter of an assertion*/minValue:optional AssertionStdParameter}/**Additional customization about when the assertion\nshould be officially considered failing.*/failThreshold:record FieldValuesFailThreshold{/**The type of failure threshold. Either based on the number\nof column values (rows) that fail the expectations, or the percentage\nof the total rows under consideration.*/type:enum FieldValuesFailThresholdType{COUNT,PERCENTAGE}=\"COUNT\"/**By default this is 0, meaning that ALL column values (i.e. rows) must\nmeet the defined expectations.*/value:long=0}/**Whether to ignore or allow nulls when running the values assertion. (i.e.\nconsider only non-null values) using operators OTHER than the IS_NULL operator.\n\nDefaults to true, allowing null values.*/excludeNulls:boolean=true}/**The definition of an assertion that validates a common metric obtained about a field / column for a set of rows.\nThis type of assertion verifies that the value of a high-level metric obtained by aggregating over a column meets\nexpectations*/fieldMetricAssertion:optional/**Attributes defining a field metric assertion, which asserts an expectation against\na common metric derived from the set of field / column values, for example:\nmax, min, median, null count, null percentage, unique count, unique percentage, and more.*/record FieldMetricAssertion{/**The field under evaluation*/@Searchable.`/path`.fieldName=\"fieldPath\"field:com.linkedin.schema.SchemaFieldSpec/**The specific metric to assert against. This is the value that\nwill be obtained by applying a standard operation, such as an aggregation,\nto the selected field.*/metric:/**A standard metric that can be derived from the set of values\nfor a specific field / column of a dataset / table.*/enum FieldMetricType{/**The number of unique values found in the column value set*/UNIQUE_COUNT/**The percentage of unique values to total rows for the dataset*/UNIQUE_PERCENTAGE/**The number of null values found in the column value set*/NULL_COUNT/**The percentage of null values to total rows for the dataset*/NULL_PERCENTAGE/**The minimum value in the column set (applies to numeric columns)*/MIN/**The maximum value in the column set (applies to numeric columns)*/MAX/**The mean length found in the column set (applies to numeric columns)*/MEAN/**The median length found in the column set (applies to numeric columns)*/MEDIAN/**The stddev length found in the column set (applies to numeric columns)*/STDDEV/**The number of negative values found in the value set (applies to numeric columns)*/NEGATIVE_COUNT/**The percentage of negative values to total rows for the dataset (applies to numeric columns)*/NEGATIVE_PERCENTAGE/**The number of zero values found in the value set (applies to numeric columns)*/ZERO_COUNT/**The percentage of zero values to total rows for the dataset (applies to numeric columns)*/ZERO_PERCENTAGE/**The minimum length found in the column set (applies to string columns)*/MIN_LENGTH/**The maximum length found in the column set (applies to string columns)*/MAX_LENGTH/**The number of empty string values found in the value set (applies to string columns).\nNote: This is a completely different metric different from NULL_COUNT!*/EMPTY_COUNT/**The percentage of empty string values to total rows for the dataset (applies to string columns)\nNote: This is a completely different metric different from NULL_PERCENTAGE!*/EMPTY_PERCENTAGE}/**The predicate to evaluate against the metric for the field / column.\nDepending on the operator, parameters may be required in order to successfully\nevaluate the assertion against the metric value.*/operator:AssertionStdOperator/**Standard parameters required for the assertion. e.g. min_value, max_value, value, columns*/parameters:optional AssertionStdParameters}/**A definition of the specific filters that should be applied, when performing monitoring.\nIf not provided, there is no filter, and the full table is under consideration.\nIf using DataHub Dataset Profiles as the assertion source type, the value of this field will be ignored.*/filter:optional{namespace com.linkedin.dataset/**A definition of filters that should be used when\nquerying an external Dataset or Table.\n\nNote that this models should NOT be used for working with\nsearch / filter on DataHub Platform itself.*/record DatasetFilter{/**How the partition will be represented in this model.\n\nIn the future, we'll likely add support for more structured\npredicates.*/type:enum DatasetFilterType{/**The partition is represented as a an opaque, raw SQL\nclause.*/SQL}/**The raw where clause string which will be used for monitoring.\nRequired if the type is SQL.*/sql:optional string}}}", SchemaFormatType.PDL));
    private FieldAssertionType _typeField = null;
    private com.linkedin.common.urn.Urn _entityField = null;
    private FieldValuesAssertion _fieldValuesAssertionField = null;
    private FieldMetricAssertion _fieldMetricAssertionField = null;
    private DatasetFilter _filterField = null;
    private FieldAssertionInfo.ChangeListener __changeListener = new FieldAssertionInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_FieldValuesAssertion = SCHEMA.getField("fieldValuesAssertion");
    private final static RecordDataSchema.Field FIELD_FieldMetricAssertion = SCHEMA.getField("fieldMetricAssertion");
    private final static RecordDataSchema.Field FIELD_Filter = SCHEMA.getField("filter");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public FieldAssertionInfo() {
        super(new DataMap(7, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public FieldAssertionInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FieldAssertionInfo.Fields fields() {
        return _fields;
    }

    public static FieldAssertionInfo.ProjectionMask createMask() {
        return new FieldAssertionInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see FieldAssertionInfo.Fields#type
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
     * @see FieldAssertionInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see FieldAssertionInfo.Fields#type
     */
    @Nullable
    public FieldAssertionType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FieldAssertionType.class, FieldAssertionType.$UNKNOWN);
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
     * @see FieldAssertionInfo.Fields#type
     */
    @Nonnull
    public FieldAssertionType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FieldAssertionType.class, FieldAssertionType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see FieldAssertionInfo.Fields#type
     */
    public FieldAssertionInfo setType(
        @Nullable
        FieldAssertionType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.FieldAssertionInfo");
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
     * @see FieldAssertionInfo.Fields#type
     */
    public FieldAssertionInfo setType(
        @Nonnull
        FieldAssertionType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.FieldAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see FieldAssertionInfo.Fields#entity
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
     * @see FieldAssertionInfo.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see FieldAssertionInfo.Fields#entity
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
     * @see FieldAssertionInfo.Fields#entity
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
     * @see FieldAssertionInfo.Fields#entity
     */
    public FieldAssertionInfo setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.assertion.FieldAssertionInfo");
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
     * @see FieldAssertionInfo.Fields#entity
     */
    public FieldAssertionInfo setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.assertion.FieldAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for fieldValuesAssertion
     * 
     * @see FieldAssertionInfo.Fields#fieldValuesAssertion
     */
    public boolean hasFieldValuesAssertion() {
        if (_fieldValuesAssertionField!= null) {
            return true;
        }
        return super._map.containsKey("fieldValuesAssertion");
    }

    /**
     * Remover for fieldValuesAssertion
     * 
     * @see FieldAssertionInfo.Fields#fieldValuesAssertion
     */
    public void removeFieldValuesAssertion() {
        super._map.remove("fieldValuesAssertion");
    }

    /**
     * Getter for fieldValuesAssertion
     * 
     * @see FieldAssertionInfo.Fields#fieldValuesAssertion
     */
    @Nullable
    public FieldValuesAssertion getFieldValuesAssertion(GetMode mode) {
        return getFieldValuesAssertion();
    }

    /**
     * Getter for fieldValuesAssertion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FieldAssertionInfo.Fields#fieldValuesAssertion
     */
    @Nullable
    public FieldValuesAssertion getFieldValuesAssertion() {
        if (_fieldValuesAssertionField!= null) {
            return _fieldValuesAssertionField;
        } else {
            Object __rawValue = super._map.get("fieldValuesAssertion");
            _fieldValuesAssertionField = ((__rawValue == null)?null:new FieldValuesAssertion(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _fieldValuesAssertionField;
        }
    }

    /**
     * Setter for fieldValuesAssertion
     * 
     * @see FieldAssertionInfo.Fields#fieldValuesAssertion
     */
    public FieldAssertionInfo setFieldValuesAssertion(
        @Nullable
        FieldValuesAssertion value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldValuesAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldValuesAssertion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldValuesAssertion", value.data());
                    _fieldValuesAssertionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldValuesAssertion", value.data());
                    _fieldValuesAssertionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldValuesAssertion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldAssertionInfo.Fields#fieldValuesAssertion
     */
    public FieldAssertionInfo setFieldValuesAssertion(
        @Nonnull
        FieldValuesAssertion value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldValuesAssertion of com.linkedin.assertion.FieldAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldValuesAssertion", value.data());
            _fieldValuesAssertionField = value;
        }
        return this;
    }

    /**
     * Existence checker for fieldMetricAssertion
     * 
     * @see FieldAssertionInfo.Fields#fieldMetricAssertion
     */
    public boolean hasFieldMetricAssertion() {
        if (_fieldMetricAssertionField!= null) {
            return true;
        }
        return super._map.containsKey("fieldMetricAssertion");
    }

    /**
     * Remover for fieldMetricAssertion
     * 
     * @see FieldAssertionInfo.Fields#fieldMetricAssertion
     */
    public void removeFieldMetricAssertion() {
        super._map.remove("fieldMetricAssertion");
    }

    /**
     * Getter for fieldMetricAssertion
     * 
     * @see FieldAssertionInfo.Fields#fieldMetricAssertion
     */
    @Nullable
    public FieldMetricAssertion getFieldMetricAssertion(GetMode mode) {
        return getFieldMetricAssertion();
    }

    /**
     * Getter for fieldMetricAssertion
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FieldAssertionInfo.Fields#fieldMetricAssertion
     */
    @Nullable
    public FieldMetricAssertion getFieldMetricAssertion() {
        if (_fieldMetricAssertionField!= null) {
            return _fieldMetricAssertionField;
        } else {
            Object __rawValue = super._map.get("fieldMetricAssertion");
            _fieldMetricAssertionField = ((__rawValue == null)?null:new FieldMetricAssertion(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _fieldMetricAssertionField;
        }
    }

    /**
     * Setter for fieldMetricAssertion
     * 
     * @see FieldAssertionInfo.Fields#fieldMetricAssertion
     */
    public FieldAssertionInfo setFieldMetricAssertion(
        @Nullable
        FieldMetricAssertion value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFieldMetricAssertion(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFieldMetricAssertion();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fieldMetricAssertion", value.data());
                    _fieldMetricAssertionField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fieldMetricAssertion", value.data());
                    _fieldMetricAssertionField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fieldMetricAssertion
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldAssertionInfo.Fields#fieldMetricAssertion
     */
    public FieldAssertionInfo setFieldMetricAssertion(
        @Nonnull
        FieldMetricAssertion value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fieldMetricAssertion of com.linkedin.assertion.FieldAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fieldMetricAssertion", value.data());
            _fieldMetricAssertionField = value;
        }
        return this;
    }

    /**
     * Existence checker for filter
     * 
     * @see FieldAssertionInfo.Fields#filter
     */
    public boolean hasFilter() {
        if (_filterField!= null) {
            return true;
        }
        return super._map.containsKey("filter");
    }

    /**
     * Remover for filter
     * 
     * @see FieldAssertionInfo.Fields#filter
     */
    public void removeFilter() {
        super._map.remove("filter");
    }

    /**
     * Getter for filter
     * 
     * @see FieldAssertionInfo.Fields#filter
     */
    @Nullable
    public DatasetFilter getFilter(GetMode mode) {
        return getFilter();
    }

    /**
     * Getter for filter
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FieldAssertionInfo.Fields#filter
     */
    @Nullable
    public DatasetFilter getFilter() {
        if (_filterField!= null) {
            return _filterField;
        } else {
            Object __rawValue = super._map.get("filter");
            _filterField = ((__rawValue == null)?null:new DatasetFilter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _filterField;
        }
    }

    /**
     * Setter for filter
     * 
     * @see FieldAssertionInfo.Fields#filter
     */
    public FieldAssertionInfo setFilter(
        @Nullable
        DatasetFilter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFilter(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFilter();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
                    _filterField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for filter
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FieldAssertionInfo.Fields#filter
     */
    public FieldAssertionInfo setFilter(
        @Nonnull
        DatasetFilter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filter of com.linkedin.assertion.FieldAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
            _filterField = value;
        }
        return this;
    }

    @Override
    public FieldAssertionInfo clone()
        throws CloneNotSupportedException
    {
        FieldAssertionInfo __clone = ((FieldAssertionInfo) super.clone());
        __clone.__changeListener = new FieldAssertionInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FieldAssertionInfo copy()
        throws CloneNotSupportedException
    {
        FieldAssertionInfo __copy = ((FieldAssertionInfo) super.copy());
        __copy._fieldMetricAssertionField = null;
        __copy._filterField = null;
        __copy._typeField = null;
        __copy._entityField = null;
        __copy._fieldValuesAssertionField = null;
        __copy.__changeListener = new FieldAssertionInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FieldAssertionInfo __objectRef;

        private ChangeListener(FieldAssertionInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "fieldMetricAssertion":
                    __objectRef._fieldMetricAssertionField = null;
                    break;
                case "filter":
                    __objectRef._filterField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
                    break;
                case "fieldValuesAssertion":
                    __objectRef._fieldValuesAssertionField = null;
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
         * The type of the field assertion being monitored.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The entity targeted by this Field check.
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * The definition of an assertion that validates individual values of a field / column for a set of rows.
         * This type of assertion verifies that each column value meets a particular requirement.
         * 
         */
        public com.linkedin.assertion.FieldValuesAssertion.Fields fieldValuesAssertion() {
            return new com.linkedin.assertion.FieldValuesAssertion.Fields(getPathComponents(), "fieldValuesAssertion");
        }

        /**
         * The definition of an assertion that validates a common metric obtained about a field / column for a set of rows.
         * This type of assertion verifies that the value of a high-level metric obtained by aggregating over a column meets
         * expectations
         * 
         */
        public com.linkedin.assertion.FieldMetricAssertion.Fields fieldMetricAssertion() {
            return new com.linkedin.assertion.FieldMetricAssertion.Fields(getPathComponents(), "fieldMetricAssertion");
        }

        /**
         * A definition of the specific filters that should be applied, when performing monitoring.
         * If not provided, there is no filter, and the full table is under consideration.
         * If using DataHub Dataset Profiles as the assertion source type, the value of this field will be ignored.
         * 
         */
        public com.linkedin.dataset.DatasetFilter.Fields filter() {
            return new com.linkedin.dataset.DatasetFilter.Fields(getPathComponents(), "filter");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.assertion.FieldValuesAssertion.ProjectionMask _fieldValuesAssertionMask;
        private com.linkedin.assertion.FieldMetricAssertion.ProjectionMask _fieldMetricAssertionMask;
        private com.linkedin.dataset.DatasetFilter.ProjectionMask _filterMask;

        ProjectionMask() {
            super(7);
        }

        /**
         * The type of the field assertion being monitored.
         * 
         */
        public FieldAssertionInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The entity targeted by this Field check.
         * 
         */
        public FieldAssertionInfo.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The definition of an assertion that validates individual values of a field / column for a set of rows.
         * This type of assertion verifies that each column value meets a particular requirement.
         * 
         */
        public FieldAssertionInfo.ProjectionMask withFieldValuesAssertion(Function<com.linkedin.assertion.FieldValuesAssertion.ProjectionMask, com.linkedin.assertion.FieldValuesAssertion.ProjectionMask> nestedMask) {
            _fieldValuesAssertionMask = nestedMask.apply(((_fieldValuesAssertionMask == null)?FieldValuesAssertion.createMask():_fieldValuesAssertionMask));
            getDataMap().put("fieldValuesAssertion", _fieldValuesAssertionMask.getDataMap());
            return this;
        }

        /**
         * The definition of an assertion that validates individual values of a field / column for a set of rows.
         * This type of assertion verifies that each column value meets a particular requirement.
         * 
         */
        public FieldAssertionInfo.ProjectionMask withFieldValuesAssertion() {
            _fieldValuesAssertionMask = null;
            getDataMap().put("fieldValuesAssertion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The definition of an assertion that validates a common metric obtained about a field / column for a set of rows.
         * This type of assertion verifies that the value of a high-level metric obtained by aggregating over a column meets
         * expectations
         * 
         */
        public FieldAssertionInfo.ProjectionMask withFieldMetricAssertion(Function<com.linkedin.assertion.FieldMetricAssertion.ProjectionMask, com.linkedin.assertion.FieldMetricAssertion.ProjectionMask> nestedMask) {
            _fieldMetricAssertionMask = nestedMask.apply(((_fieldMetricAssertionMask == null)?FieldMetricAssertion.createMask():_fieldMetricAssertionMask));
            getDataMap().put("fieldMetricAssertion", _fieldMetricAssertionMask.getDataMap());
            return this;
        }

        /**
         * The definition of an assertion that validates a common metric obtained about a field / column for a set of rows.
         * This type of assertion verifies that the value of a high-level metric obtained by aggregating over a column meets
         * expectations
         * 
         */
        public FieldAssertionInfo.ProjectionMask withFieldMetricAssertion() {
            _fieldMetricAssertionMask = null;
            getDataMap().put("fieldMetricAssertion", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A definition of the specific filters that should be applied, when performing monitoring.
         * If not provided, there is no filter, and the full table is under consideration.
         * If using DataHub Dataset Profiles as the assertion source type, the value of this field will be ignored.
         * 
         */
        public FieldAssertionInfo.ProjectionMask withFilter(Function<com.linkedin.dataset.DatasetFilter.ProjectionMask, com.linkedin.dataset.DatasetFilter.ProjectionMask> nestedMask) {
            _filterMask = nestedMask.apply(((_filterMask == null)?DatasetFilter.createMask():_filterMask));
            getDataMap().put("filter", _filterMask.getDataMap());
            return this;
        }

        /**
         * A definition of the specific filters that should be applied, when performing monitoring.
         * If not provided, there is no filter, and the full table is under consideration.
         * If using DataHub Dataset Profiles as the assertion source type, the value of this field will be ignored.
         * 
         */
        public FieldAssertionInfo.ProjectionMask withFilter() {
            _filterMask = null;
            getDataMap().put("filter", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
