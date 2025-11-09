
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
 * Attributes defining a dataset Volume Assertion
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/VolumeAssertionInfo.pdl.")
public class VolumeAssertionInfo
    extends RecordTemplate
{

    private final static VolumeAssertionInfo.Fields _fields = new VolumeAssertionInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes defining a dataset Volume Assertion*/record VolumeAssertionInfo{/**The type of the volume assertion being monitored.*/@Searchable={}type:enum VolumeAssertionType{/**A volume assertion that is evaluated against the total row count of a dataset.*/ROW_COUNT_TOTAL/**A volume assertion that is evaluated against an incremental row count of a dataset,\nor a row count change.*/ROW_COUNT_CHANGE/**A volume assertion that checks the latest \"segment\" in a table based on an incrementing\ncolumn to check whether it's row count falls into a particular range.\n\nThis can be used to monitor the row count of an incrementing date-partition column segment.*/INCREMENTING_SEGMENT_ROW_COUNT_TOTAL/**A volume assertion that compares the row counts in neighboring \"segments\" or \"partitions\"\nof an incrementing column.\nThis can be used to track changes between subsequent date partition\nin a table, for example.*/INCREMENTING_SEGMENT_ROW_COUNT_CHANGE}/**The entity targeted by this Volume check.*/@Relationship={\"entityTypes\":[\"dataset\"],\"name\":\"Asserts\"}@Searchable.fieldType=\"URN\"entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Produce FAILURE Assertion Result if the row count of the asset does not meet specific requirements.\nRequired if type is 'ROW_COUNT_TOTAL'*/rowCountTotal:optional/**Attributes defining a ROW_COUNT_TOTAL volume assertion.*/record RowCountTotal{/**The operator you'd like to apply.\n\nNote that only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:/**A boolean operator that is applied on the input to an assertion, after an aggregation function has been applied.*/enum AssertionStdOperator{/**Value being asserted is between min_value and max_value.  Requires 'minValue' & 'maxValue' parameters.*/BETWEEN/**Value being asserted is less than a max value. Requires 'value' parameter.*/LESS_THAN/**Value being asserted is less than or equal to some value. Requires 'value' parameter.*/LESS_THAN_OR_EQUAL_TO/**Value being asserted is greater than some value. Requires 'value' parameter.*/GREATER_THAN/**Value being asserted is greater than or equal to some value. Requires 'value' parameter.*/GREATER_THAN_OR_EQUAL_TO/**Value being asserted is equal to value. Requires 'value' parameter.*/EQUAL_TO/**Value being asserted is not equal to value. Requires 'value' parameter.*/NOT_EQUAL_TO/**Value being asserted is null. Requires no parameters.*/NULL/**Value being asserted is not null. Requires no parameters.*/NOT_NULL/**Value being asserted contains value. Requires 'value' parameter.*/CONTAIN/**Value being asserted ends with value. Requires 'value' parameter.*/END_WITH/**Value being asserted starts with value. Requires 'value' parameter.*/START_WITH/**Value being asserted matches the regex value. Requires 'value' parameter.*/REGEX_MATCH/**Value being asserted is one of the array values. Requires 'value' parameter.*/IN/**Value being asserted is not in one of the array values. Requires 'value' parameter.*/NOT_IN/**Value being asserted is true. Requires no parameters.*/IS_TRUE/**Value being asserted is false. Requires no parameters.*/IS_FALSE/**Other*/_NATIVE_}/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:/**Parameters for AssertionStdOperators.*/record AssertionStdParameters{/**The value parameter of an assertion*/value:optional/**Single parameter for AssertionStdOperators.*/record AssertionStdParameter{/**The parameter value*/value:string/**The type of the parameter*/type:enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}}/**The maxValue parameter of an assertion*/maxValue:optional AssertionStdParameter/**The minValue parameter of an assertion*/minValue:optional AssertionStdParameter}}/**Produce FAILURE Assertion Result if the delta row count of the asset does not meet specific requirements\nwithin a given period of time.\nRequired if type is 'ROW_COUNT_CHANGE'*/rowCountChange:optional/**Attributes defining a ROW_COUNT_CHANGE volume assertion.*/record RowCountChange{/**The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.*/type:/**An enum to represent a type of change in an assertion value, metric, or measurement.*/enum AssertionValueChangeType{/**A change that is defined in absolute terms.*/ABSOLUTE/**A change that is defined in relative terms using percentage change\nfrom the original value.*/PERCENTAGE}/**The operator you'd like to apply.\n\nNote that only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:AssertionStdOperator/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:AssertionStdParameters}/**Produce FAILURE Assertion Result if the asset's latest incrementing segment row count total\ndoes not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_TOTAL'*/incrementingSegmentRowCountTotal:optional/**Attributes defining an INCREMENTING_SEGMENT_ROW_COUNT_TOTAL volume assertion.*/record IncrementingSegmentRowCountTotal{/**A specification of how the 'segment' can be derived using a column and an optional transformer function.*/segment:/**Core attributes required to identify an incrementing segment in a table. This type is mainly useful\nfor tables that constantly increase with new rows being added on a particular cadence (e.g. fact or event tables)\n\nAn incrementing segment represents a logical chunk of data which is INSERTED\ninto a dataset on a regular interval, along with the presence of a constantly-incrementing column\nvalue such as an event time, date partition, or last modified column.\n\nAn incrementing segment is principally identified by 2 key attributes combined:\n\n 1. A field or column that represents the incrementing value. New rows that are inserted will be identified using this column.\n    Note that the value of this column may not by itself represent the \"bucket\" or the \"segment\" in which the row falls.\n\n 2. [Optional] An transformer function that may be applied to the selected column value in order\n    to obtain the final \"segment identifier\" or \"bucket identifier\". Rows that have the same value after applying the transformation\n    will be grouped into the same segment, using which the final value (e.g. row count) will be determined.*/record IncrementingSegmentSpec{/**The field to use to generate segments. It must be constantly incrementing as new rows are inserted.*/field:{namespace com.linkedin.schema/**Lightweight spec used for referencing a particular schema field.\n*/record SchemaFieldSpec{/**The field path*/path:string/**The DataHub standard schema field type.*/type:string/**The native field type*/nativeType:string}}/**Optional transformer function to apply to the field in order to obtain the final segment or bucket identifier.\nIf not provided, then no operator will be applied to the field. (identity function)*/transformer:optional/**The definition of the transformer function  that should be applied to a given field / column value in a dataset\nin order to determine the segment or bucket that it belongs to, which in turn is used to evaluate\nvolume assertions.*/record IncrementingSegmentFieldTransformer{/**A 'standard' transformer type. Note that not all source systems will support all operators.*/type:enum IncrementingSegmentFieldTransformerType{/**Rounds a timestamp (in seconds) down to the start of the month.*/TIMESTAMP_MS_TO_MINUTE/**Rounds a timestamp (in milliseconds) down to the nearest hour.*/TIMESTAMP_MS_TO_HOUR/**Rounds a timestamp (in milliseconds) down to the start of the day.*/TIMESTAMP_MS_TO_DATE/**Rounds a timestamp (in milliseconds) down to the start of the month*/TIMESTAMP_MS_TO_MONTH/**Rounds a timestamp (in milliseconds) down to the start of the year*/TIMESTAMP_MS_TO_YEAR/**Rounds a numeric value down to the nearest integer.*/FLOOR/**Rounds a numeric value up to the nearest integer.*/CEILING/**A backdoor to provide a native operator type specific to a given source system like\nSnowflake, Redshift, BQ, etc.*/NATIVE}/**The 'native' transformer type, useful as a back door if a custom operator is required.\nThis field is required if the type is NATIVE.*/nativeType:optional string}}/**The operator you'd like to apply.\n\nNote that only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:AssertionStdOperator/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:AssertionStdParameters}/**Produce FAILURE Assertion Result if the asset's incrementing segment row count delta\ndoes not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_CHANGE'*/incrementingSegmentRowCountChange:optional/**Attributes defining an INCREMENTING_SEGMENT_ROW_COUNT_CHANGE volume assertion.*/record IncrementingSegmentRowCountChange{/**A specification of how the 'segment' can be derived using a column and an optional transformer function.*/segment:IncrementingSegmentSpec/**The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.*/type:AssertionValueChangeType/**The operator you'd like to apply to the row count value\n\nNote that only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:AssertionStdOperator/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:AssertionStdParameters}/**A definition of the specific filters that should be applied, when performing monitoring.\nIf not provided, there is no filter, and the full table is under consideration.*/filter:optional{namespace com.linkedin.dataset/**A definition of filters that should be used when\nquerying an external Dataset or Table.\n\nNote that this models should NOT be used for working with\nsearch / filter on DataHub Platform itself.*/record DatasetFilter{/**How the partition will be represented in this model.\n\nIn the future, we'll likely add support for more structured\npredicates.*/type:enum DatasetFilterType{/**The partition is represented as a an opaque, raw SQL\nclause.*/SQL}/**The raw where clause string which will be used for monitoring.\nRequired if the type is SQL.*/sql:optional string}}}", SchemaFormatType.PDL));
    private VolumeAssertionType _typeField = null;
    private com.linkedin.common.urn.Urn _entityField = null;
    private RowCountTotal _rowCountTotalField = null;
    private RowCountChange _rowCountChangeField = null;
    private IncrementingSegmentRowCountTotal _incrementingSegmentRowCountTotalField = null;
    private IncrementingSegmentRowCountChange _incrementingSegmentRowCountChangeField = null;
    private DatasetFilter _filterField = null;
    private VolumeAssertionInfo.ChangeListener __changeListener = new VolumeAssertionInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_RowCountTotal = SCHEMA.getField("rowCountTotal");
    private final static RecordDataSchema.Field FIELD_RowCountChange = SCHEMA.getField("rowCountChange");
    private final static RecordDataSchema.Field FIELD_IncrementingSegmentRowCountTotal = SCHEMA.getField("incrementingSegmentRowCountTotal");
    private final static RecordDataSchema.Field FIELD_IncrementingSegmentRowCountChange = SCHEMA.getField("incrementingSegmentRowCountChange");
    private final static RecordDataSchema.Field FIELD_Filter = SCHEMA.getField("filter");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public VolumeAssertionInfo() {
        super(new DataMap(10, 0.75F), SCHEMA, 7);
        addChangeListener(__changeListener);
    }

    public VolumeAssertionInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static VolumeAssertionInfo.Fields fields() {
        return _fields;
    }

    public static VolumeAssertionInfo.ProjectionMask createMask() {
        return new VolumeAssertionInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see VolumeAssertionInfo.Fields#type
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
     * @see VolumeAssertionInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see VolumeAssertionInfo.Fields#type
     */
    @Nullable
    public VolumeAssertionType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, VolumeAssertionType.class, VolumeAssertionType.$UNKNOWN);
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
     * @see VolumeAssertionInfo.Fields#type
     */
    @Nonnull
    public VolumeAssertionType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, VolumeAssertionType.class, VolumeAssertionType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see VolumeAssertionInfo.Fields#type
     */
    public VolumeAssertionInfo setType(
        @Nullable
        VolumeAssertionType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.VolumeAssertionInfo");
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
     * @see VolumeAssertionInfo.Fields#type
     */
    public VolumeAssertionInfo setType(
        @Nonnull
        VolumeAssertionType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.VolumeAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see VolumeAssertionInfo.Fields#entity
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
     * @see VolumeAssertionInfo.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see VolumeAssertionInfo.Fields#entity
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
     * @see VolumeAssertionInfo.Fields#entity
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
     * @see VolumeAssertionInfo.Fields#entity
     */
    public VolumeAssertionInfo setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.assertion.VolumeAssertionInfo");
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
     * @see VolumeAssertionInfo.Fields#entity
     */
    public VolumeAssertionInfo setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.assertion.VolumeAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for rowCountTotal
     * 
     * @see VolumeAssertionInfo.Fields#rowCountTotal
     */
    public boolean hasRowCountTotal() {
        if (_rowCountTotalField!= null) {
            return true;
        }
        return super._map.containsKey("rowCountTotal");
    }

    /**
     * Remover for rowCountTotal
     * 
     * @see VolumeAssertionInfo.Fields#rowCountTotal
     */
    public void removeRowCountTotal() {
        super._map.remove("rowCountTotal");
    }

    /**
     * Getter for rowCountTotal
     * 
     * @see VolumeAssertionInfo.Fields#rowCountTotal
     */
    @Nullable
    public RowCountTotal getRowCountTotal(GetMode mode) {
        return getRowCountTotal();
    }

    /**
     * Getter for rowCountTotal
     * 
     * @return
     *     Optional field. Always check for null.
     * @see VolumeAssertionInfo.Fields#rowCountTotal
     */
    @Nullable
    public RowCountTotal getRowCountTotal() {
        if (_rowCountTotalField!= null) {
            return _rowCountTotalField;
        } else {
            Object __rawValue = super._map.get("rowCountTotal");
            _rowCountTotalField = ((__rawValue == null)?null:new RowCountTotal(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _rowCountTotalField;
        }
    }

    /**
     * Setter for rowCountTotal
     * 
     * @see VolumeAssertionInfo.Fields#rowCountTotal
     */
    public VolumeAssertionInfo setRowCountTotal(
        @Nullable
        RowCountTotal value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRowCountTotal(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRowCountTotal();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rowCountTotal", value.data());
                    _rowCountTotalField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rowCountTotal", value.data());
                    _rowCountTotalField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rowCountTotal
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VolumeAssertionInfo.Fields#rowCountTotal
     */
    public VolumeAssertionInfo setRowCountTotal(
        @Nonnull
        RowCountTotal value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rowCountTotal of com.linkedin.assertion.VolumeAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rowCountTotal", value.data());
            _rowCountTotalField = value;
        }
        return this;
    }

    /**
     * Existence checker for rowCountChange
     * 
     * @see VolumeAssertionInfo.Fields#rowCountChange
     */
    public boolean hasRowCountChange() {
        if (_rowCountChangeField!= null) {
            return true;
        }
        return super._map.containsKey("rowCountChange");
    }

    /**
     * Remover for rowCountChange
     * 
     * @see VolumeAssertionInfo.Fields#rowCountChange
     */
    public void removeRowCountChange() {
        super._map.remove("rowCountChange");
    }

    /**
     * Getter for rowCountChange
     * 
     * @see VolumeAssertionInfo.Fields#rowCountChange
     */
    @Nullable
    public RowCountChange getRowCountChange(GetMode mode) {
        return getRowCountChange();
    }

    /**
     * Getter for rowCountChange
     * 
     * @return
     *     Optional field. Always check for null.
     * @see VolumeAssertionInfo.Fields#rowCountChange
     */
    @Nullable
    public RowCountChange getRowCountChange() {
        if (_rowCountChangeField!= null) {
            return _rowCountChangeField;
        } else {
            Object __rawValue = super._map.get("rowCountChange");
            _rowCountChangeField = ((__rawValue == null)?null:new RowCountChange(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _rowCountChangeField;
        }
    }

    /**
     * Setter for rowCountChange
     * 
     * @see VolumeAssertionInfo.Fields#rowCountChange
     */
    public VolumeAssertionInfo setRowCountChange(
        @Nullable
        RowCountChange value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setRowCountChange(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeRowCountChange();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "rowCountChange", value.data());
                    _rowCountChangeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "rowCountChange", value.data());
                    _rowCountChangeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for rowCountChange
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VolumeAssertionInfo.Fields#rowCountChange
     */
    public VolumeAssertionInfo setRowCountChange(
        @Nonnull
        RowCountChange value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field rowCountChange of com.linkedin.assertion.VolumeAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "rowCountChange", value.data());
            _rowCountChangeField = value;
        }
        return this;
    }

    /**
     * Existence checker for incrementingSegmentRowCountTotal
     * 
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountTotal
     */
    public boolean hasIncrementingSegmentRowCountTotal() {
        if (_incrementingSegmentRowCountTotalField!= null) {
            return true;
        }
        return super._map.containsKey("incrementingSegmentRowCountTotal");
    }

    /**
     * Remover for incrementingSegmentRowCountTotal
     * 
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountTotal
     */
    public void removeIncrementingSegmentRowCountTotal() {
        super._map.remove("incrementingSegmentRowCountTotal");
    }

    /**
     * Getter for incrementingSegmentRowCountTotal
     * 
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountTotal
     */
    @Nullable
    public IncrementingSegmentRowCountTotal getIncrementingSegmentRowCountTotal(GetMode mode) {
        return getIncrementingSegmentRowCountTotal();
    }

    /**
     * Getter for incrementingSegmentRowCountTotal
     * 
     * @return
     *     Optional field. Always check for null.
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountTotal
     */
    @Nullable
    public IncrementingSegmentRowCountTotal getIncrementingSegmentRowCountTotal() {
        if (_incrementingSegmentRowCountTotalField!= null) {
            return _incrementingSegmentRowCountTotalField;
        } else {
            Object __rawValue = super._map.get("incrementingSegmentRowCountTotal");
            _incrementingSegmentRowCountTotalField = ((__rawValue == null)?null:new IncrementingSegmentRowCountTotal(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _incrementingSegmentRowCountTotalField;
        }
    }

    /**
     * Setter for incrementingSegmentRowCountTotal
     * 
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountTotal
     */
    public VolumeAssertionInfo setIncrementingSegmentRowCountTotal(
        @Nullable
        IncrementingSegmentRowCountTotal value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIncrementingSegmentRowCountTotal(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIncrementingSegmentRowCountTotal();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "incrementingSegmentRowCountTotal", value.data());
                    _incrementingSegmentRowCountTotalField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "incrementingSegmentRowCountTotal", value.data());
                    _incrementingSegmentRowCountTotalField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for incrementingSegmentRowCountTotal
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountTotal
     */
    public VolumeAssertionInfo setIncrementingSegmentRowCountTotal(
        @Nonnull
        IncrementingSegmentRowCountTotal value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field incrementingSegmentRowCountTotal of com.linkedin.assertion.VolumeAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "incrementingSegmentRowCountTotal", value.data());
            _incrementingSegmentRowCountTotalField = value;
        }
        return this;
    }

    /**
     * Existence checker for incrementingSegmentRowCountChange
     * 
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountChange
     */
    public boolean hasIncrementingSegmentRowCountChange() {
        if (_incrementingSegmentRowCountChangeField!= null) {
            return true;
        }
        return super._map.containsKey("incrementingSegmentRowCountChange");
    }

    /**
     * Remover for incrementingSegmentRowCountChange
     * 
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountChange
     */
    public void removeIncrementingSegmentRowCountChange() {
        super._map.remove("incrementingSegmentRowCountChange");
    }

    /**
     * Getter for incrementingSegmentRowCountChange
     * 
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountChange
     */
    @Nullable
    public IncrementingSegmentRowCountChange getIncrementingSegmentRowCountChange(GetMode mode) {
        return getIncrementingSegmentRowCountChange();
    }

    /**
     * Getter for incrementingSegmentRowCountChange
     * 
     * @return
     *     Optional field. Always check for null.
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountChange
     */
    @Nullable
    public IncrementingSegmentRowCountChange getIncrementingSegmentRowCountChange() {
        if (_incrementingSegmentRowCountChangeField!= null) {
            return _incrementingSegmentRowCountChangeField;
        } else {
            Object __rawValue = super._map.get("incrementingSegmentRowCountChange");
            _incrementingSegmentRowCountChangeField = ((__rawValue == null)?null:new IncrementingSegmentRowCountChange(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _incrementingSegmentRowCountChangeField;
        }
    }

    /**
     * Setter for incrementingSegmentRowCountChange
     * 
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountChange
     */
    public VolumeAssertionInfo setIncrementingSegmentRowCountChange(
        @Nullable
        IncrementingSegmentRowCountChange value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setIncrementingSegmentRowCountChange(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeIncrementingSegmentRowCountChange();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "incrementingSegmentRowCountChange", value.data());
                    _incrementingSegmentRowCountChangeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "incrementingSegmentRowCountChange", value.data());
                    _incrementingSegmentRowCountChangeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for incrementingSegmentRowCountChange
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see VolumeAssertionInfo.Fields#incrementingSegmentRowCountChange
     */
    public VolumeAssertionInfo setIncrementingSegmentRowCountChange(
        @Nonnull
        IncrementingSegmentRowCountChange value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field incrementingSegmentRowCountChange of com.linkedin.assertion.VolumeAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "incrementingSegmentRowCountChange", value.data());
            _incrementingSegmentRowCountChangeField = value;
        }
        return this;
    }

    /**
     * Existence checker for filter
     * 
     * @see VolumeAssertionInfo.Fields#filter
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
     * @see VolumeAssertionInfo.Fields#filter
     */
    public void removeFilter() {
        super._map.remove("filter");
    }

    /**
     * Getter for filter
     * 
     * @see VolumeAssertionInfo.Fields#filter
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
     * @see VolumeAssertionInfo.Fields#filter
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
     * @see VolumeAssertionInfo.Fields#filter
     */
    public VolumeAssertionInfo setFilter(
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
     * @see VolumeAssertionInfo.Fields#filter
     */
    public VolumeAssertionInfo setFilter(
        @Nonnull
        DatasetFilter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filter of com.linkedin.assertion.VolumeAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
            _filterField = value;
        }
        return this;
    }

    @Override
    public VolumeAssertionInfo clone()
        throws CloneNotSupportedException
    {
        VolumeAssertionInfo __clone = ((VolumeAssertionInfo) super.clone());
        __clone.__changeListener = new VolumeAssertionInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public VolumeAssertionInfo copy()
        throws CloneNotSupportedException
    {
        VolumeAssertionInfo __copy = ((VolumeAssertionInfo) super.copy());
        __copy._filterField = null;
        __copy._incrementingSegmentRowCountTotalField = null;
        __copy._rowCountChangeField = null;
        __copy._typeField = null;
        __copy._entityField = null;
        __copy._rowCountTotalField = null;
        __copy._incrementingSegmentRowCountChangeField = null;
        __copy.__changeListener = new VolumeAssertionInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final VolumeAssertionInfo __objectRef;

        private ChangeListener(VolumeAssertionInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "filter":
                    __objectRef._filterField = null;
                    break;
                case "incrementingSegmentRowCountTotal":
                    __objectRef._incrementingSegmentRowCountTotalField = null;
                    break;
                case "rowCountChange":
                    __objectRef._rowCountChangeField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
                    break;
                case "rowCountTotal":
                    __objectRef._rowCountTotalField = null;
                    break;
                case "incrementingSegmentRowCountChange":
                    __objectRef._incrementingSegmentRowCountChangeField = null;
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
         * The type of the volume assertion being monitored.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The entity targeted by this Volume check.
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * Produce FAILURE Assertion Result if the row count of the asset does not meet specific requirements.
         * Required if type is 'ROW_COUNT_TOTAL'
         * 
         */
        public com.linkedin.assertion.RowCountTotal.Fields rowCountTotal() {
            return new com.linkedin.assertion.RowCountTotal.Fields(getPathComponents(), "rowCountTotal");
        }

        /**
         * Produce FAILURE Assertion Result if the delta row count of the asset does not meet specific requirements
         * within a given period of time.
         * Required if type is 'ROW_COUNT_CHANGE'
         * 
         */
        public com.linkedin.assertion.RowCountChange.Fields rowCountChange() {
            return new com.linkedin.assertion.RowCountChange.Fields(getPathComponents(), "rowCountChange");
        }

        /**
         * Produce FAILURE Assertion Result if the asset's latest incrementing segment row count total
         * does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_TOTAL'
         * 
         */
        public com.linkedin.assertion.IncrementingSegmentRowCountTotal.Fields incrementingSegmentRowCountTotal() {
            return new com.linkedin.assertion.IncrementingSegmentRowCountTotal.Fields(getPathComponents(), "incrementingSegmentRowCountTotal");
        }

        /**
         * Produce FAILURE Assertion Result if the asset's incrementing segment row count delta
         * does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_CHANGE'
         * 
         */
        public com.linkedin.assertion.IncrementingSegmentRowCountChange.Fields incrementingSegmentRowCountChange() {
            return new com.linkedin.assertion.IncrementingSegmentRowCountChange.Fields(getPathComponents(), "incrementingSegmentRowCountChange");
        }

        /**
         * A definition of the specific filters that should be applied, when performing monitoring.
         * If not provided, there is no filter, and the full table is under consideration.
         * 
         */
        public com.linkedin.dataset.DatasetFilter.Fields filter() {
            return new com.linkedin.dataset.DatasetFilter.Fields(getPathComponents(), "filter");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.assertion.RowCountTotal.ProjectionMask _rowCountTotalMask;
        private com.linkedin.assertion.RowCountChange.ProjectionMask _rowCountChangeMask;
        private com.linkedin.assertion.IncrementingSegmentRowCountTotal.ProjectionMask _incrementingSegmentRowCountTotalMask;
        private com.linkedin.assertion.IncrementingSegmentRowCountChange.ProjectionMask _incrementingSegmentRowCountChangeMask;
        private com.linkedin.dataset.DatasetFilter.ProjectionMask _filterMask;

        ProjectionMask() {
            super(10);
        }

        /**
         * The type of the volume assertion being monitored.
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The entity targeted by this Volume check.
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the row count of the asset does not meet specific requirements.
         * Required if type is 'ROW_COUNT_TOTAL'
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withRowCountTotal(Function<com.linkedin.assertion.RowCountTotal.ProjectionMask, com.linkedin.assertion.RowCountTotal.ProjectionMask> nestedMask) {
            _rowCountTotalMask = nestedMask.apply(((_rowCountTotalMask == null)?RowCountTotal.createMask():_rowCountTotalMask));
            getDataMap().put("rowCountTotal", _rowCountTotalMask.getDataMap());
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the row count of the asset does not meet specific requirements.
         * Required if type is 'ROW_COUNT_TOTAL'
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withRowCountTotal() {
            _rowCountTotalMask = null;
            getDataMap().put("rowCountTotal", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the delta row count of the asset does not meet specific requirements
         * within a given period of time.
         * Required if type is 'ROW_COUNT_CHANGE'
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withRowCountChange(Function<com.linkedin.assertion.RowCountChange.ProjectionMask, com.linkedin.assertion.RowCountChange.ProjectionMask> nestedMask) {
            _rowCountChangeMask = nestedMask.apply(((_rowCountChangeMask == null)?RowCountChange.createMask():_rowCountChangeMask));
            getDataMap().put("rowCountChange", _rowCountChangeMask.getDataMap());
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the delta row count of the asset does not meet specific requirements
         * within a given period of time.
         * Required if type is 'ROW_COUNT_CHANGE'
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withRowCountChange() {
            _rowCountChangeMask = null;
            getDataMap().put("rowCountChange", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the asset's latest incrementing segment row count total
         * does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_TOTAL'
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withIncrementingSegmentRowCountTotal(Function<com.linkedin.assertion.IncrementingSegmentRowCountTotal.ProjectionMask, com.linkedin.assertion.IncrementingSegmentRowCountTotal.ProjectionMask> nestedMask) {
            _incrementingSegmentRowCountTotalMask = nestedMask.apply(((_incrementingSegmentRowCountTotalMask == null)?IncrementingSegmentRowCountTotal.createMask():_incrementingSegmentRowCountTotalMask));
            getDataMap().put("incrementingSegmentRowCountTotal", _incrementingSegmentRowCountTotalMask.getDataMap());
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the asset's latest incrementing segment row count total
         * does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_TOTAL'
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withIncrementingSegmentRowCountTotal() {
            _incrementingSegmentRowCountTotalMask = null;
            getDataMap().put("incrementingSegmentRowCountTotal", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the asset's incrementing segment row count delta
         * does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_CHANGE'
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withIncrementingSegmentRowCountChange(Function<com.linkedin.assertion.IncrementingSegmentRowCountChange.ProjectionMask, com.linkedin.assertion.IncrementingSegmentRowCountChange.ProjectionMask> nestedMask) {
            _incrementingSegmentRowCountChangeMask = nestedMask.apply(((_incrementingSegmentRowCountChangeMask == null)?IncrementingSegmentRowCountChange.createMask():_incrementingSegmentRowCountChangeMask));
            getDataMap().put("incrementingSegmentRowCountChange", _incrementingSegmentRowCountChangeMask.getDataMap());
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the asset's incrementing segment row count delta
         * does not meet specific requirements. Required if type is 'INCREMENTING_SEGMENT_ROW_COUNT_CHANGE'
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withIncrementingSegmentRowCountChange() {
            _incrementingSegmentRowCountChangeMask = null;
            getDataMap().put("incrementingSegmentRowCountChange", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A definition of the specific filters that should be applied, when performing monitoring.
         * If not provided, there is no filter, and the full table is under consideration.
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withFilter(Function<com.linkedin.dataset.DatasetFilter.ProjectionMask, com.linkedin.dataset.DatasetFilter.ProjectionMask> nestedMask) {
            _filterMask = nestedMask.apply(((_filterMask == null)?DatasetFilter.createMask():_filterMask));
            getDataMap().put("filter", _filterMask.getDataMap());
            return this;
        }

        /**
         * A definition of the specific filters that should be applied, when performing monitoring.
         * If not provided, there is no filter, and the full table is under consideration.
         * 
         */
        public VolumeAssertionInfo.ProjectionMask withFilter() {
            _filterMask = null;
            getDataMap().put("filter", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
