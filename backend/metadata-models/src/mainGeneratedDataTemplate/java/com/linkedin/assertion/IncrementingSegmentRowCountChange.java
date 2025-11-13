
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
 * Attributes defining an INCREMENTING_SEGMENT_ROW_COUNT_CHANGE volume assertion.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/IncrementingSegmentRowCountChange.pdl.")
public class IncrementingSegmentRowCountChange
    extends RecordTemplate
{

    private final static IncrementingSegmentRowCountChange.Fields _fields = new IncrementingSegmentRowCountChange.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes defining an INCREMENTING_SEGMENT_ROW_COUNT_CHANGE volume assertion.*/record IncrementingSegmentRowCountChange{/**A specification of how the 'segment' can be derived using a column and an optional transformer function.*/segment:/**Core attributes required to identify an incrementing segment in a table. This type is mainly useful\nfor tables that constantly increase with new rows being added on a particular cadence (e.g. fact or event tables)\n\nAn incrementing segment represents a logical chunk of data which is INSERTED\ninto a dataset on a regular interval, along with the presence of a constantly-incrementing column\nvalue such as an event time, date partition, or last modified column.\n\nAn incrementing segment is principally identified by 2 key attributes combined:\n\n 1. A field or column that represents the incrementing value. New rows that are inserted will be identified using this column.\n    Note that the value of this column may not by itself represent the \"bucket\" or the \"segment\" in which the row falls.\n\n 2. [Optional] An transformer function that may be applied to the selected column value in order\n    to obtain the final \"segment identifier\" or \"bucket identifier\". Rows that have the same value after applying the transformation\n    will be grouped into the same segment, using which the final value (e.g. row count) will be determined.*/record IncrementingSegmentSpec{/**The field to use to generate segments. It must be constantly incrementing as new rows are inserted.*/field:{namespace com.linkedin.schema/**Lightweight spec used for referencing a particular schema field.\n*/record SchemaFieldSpec{/**The field path*/path:string/**The DataHub standard schema field type.*/type:string/**The native field type*/nativeType:string}}/**Optional transformer function to apply to the field in order to obtain the final segment or bucket identifier.\nIf not provided, then no operator will be applied to the field. (identity function)*/transformer:optional/**The definition of the transformer function  that should be applied to a given field / column value in a dataset\nin order to determine the segment or bucket that it belongs to, which in turn is used to evaluate\nvolume assertions.*/record IncrementingSegmentFieldTransformer{/**A 'standard' transformer type. Note that not all source systems will support all operators.*/type:enum IncrementingSegmentFieldTransformerType{/**Rounds a timestamp (in seconds) down to the start of the month.*/TIMESTAMP_MS_TO_MINUTE/**Rounds a timestamp (in milliseconds) down to the nearest hour.*/TIMESTAMP_MS_TO_HOUR/**Rounds a timestamp (in milliseconds) down to the start of the day.*/TIMESTAMP_MS_TO_DATE/**Rounds a timestamp (in milliseconds) down to the start of the month*/TIMESTAMP_MS_TO_MONTH/**Rounds a timestamp (in milliseconds) down to the start of the year*/TIMESTAMP_MS_TO_YEAR/**Rounds a numeric value down to the nearest integer.*/FLOOR/**Rounds a numeric value up to the nearest integer.*/CEILING/**A backdoor to provide a native operator type specific to a given source system like\nSnowflake, Redshift, BQ, etc.*/NATIVE}/**The 'native' transformer type, useful as a back door if a custom operator is required.\nThis field is required if the type is NATIVE.*/nativeType:optional string}}/**The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.*/type:/**An enum to represent a type of change in an assertion value, metric, or measurement.*/enum AssertionValueChangeType{/**A change that is defined in absolute terms.*/ABSOLUTE/**A change that is defined in relative terms using percentage change\nfrom the original value.*/PERCENTAGE}/**The operator you'd like to apply to the row count value\n\nNote that only numeric operators are valid inputs:\nGREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,\nBETWEEN.*/operator:/**A boolean operator that is applied on the input to an assertion, after an aggregation function has been applied.*/enum AssertionStdOperator{/**Value being asserted is between min_value and max_value.  Requires 'minValue' & 'maxValue' parameters.*/BETWEEN/**Value being asserted is less than a max value. Requires 'value' parameter.*/LESS_THAN/**Value being asserted is less than or equal to some value. Requires 'value' parameter.*/LESS_THAN_OR_EQUAL_TO/**Value being asserted is greater than some value. Requires 'value' parameter.*/GREATER_THAN/**Value being asserted is greater than or equal to some value. Requires 'value' parameter.*/GREATER_THAN_OR_EQUAL_TO/**Value being asserted is equal to value. Requires 'value' parameter.*/EQUAL_TO/**Value being asserted is not equal to value. Requires 'value' parameter.*/NOT_EQUAL_TO/**Value being asserted is null. Requires no parameters.*/NULL/**Value being asserted is not null. Requires no parameters.*/NOT_NULL/**Value being asserted contains value. Requires 'value' parameter.*/CONTAIN/**Value being asserted ends with value. Requires 'value' parameter.*/END_WITH/**Value being asserted starts with value. Requires 'value' parameter.*/START_WITH/**Value being asserted matches the regex value. Requires 'value' parameter.*/REGEX_MATCH/**Value being asserted is one of the array values. Requires 'value' parameter.*/IN/**Value being asserted is not in one of the array values. Requires 'value' parameter.*/NOT_IN/**Value being asserted is true. Requires no parameters.*/IS_TRUE/**Value being asserted is false. Requires no parameters.*/IS_FALSE/**Other*/_NATIVE_}/**The parameters you'd like to provide as input to the operator.\n\nNote that only numeric parameter types are valid inputs: NUMBER.*/parameters:/**Parameters for AssertionStdOperators.*/record AssertionStdParameters{/**The value parameter of an assertion*/value:optional/**Single parameter for AssertionStdOperators.*/record AssertionStdParameter{/**The parameter value*/value:string/**The type of the parameter*/type:enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}}/**The maxValue parameter of an assertion*/maxValue:optional AssertionStdParameter/**The minValue parameter of an assertion*/minValue:optional AssertionStdParameter}}", SchemaFormatType.PDL));
    private IncrementingSegmentSpec _segmentField = null;
    private AssertionValueChangeType _typeField = null;
    private AssertionStdOperator _operatorField = null;
    private AssertionStdParameters _parametersField = null;
    private IncrementingSegmentRowCountChange.ChangeListener __changeListener = new IncrementingSegmentRowCountChange.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Segment = SCHEMA.getField("segment");
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Operator = SCHEMA.getField("operator");
    private final static RecordDataSchema.Field FIELD_Parameters = SCHEMA.getField("parameters");

    public IncrementingSegmentRowCountChange() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public IncrementingSegmentRowCountChange(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static IncrementingSegmentRowCountChange.Fields fields() {
        return _fields;
    }

    public static IncrementingSegmentRowCountChange.ProjectionMask createMask() {
        return new IncrementingSegmentRowCountChange.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for segment
     * 
     * @see IncrementingSegmentRowCountChange.Fields#segment
     */
    public boolean hasSegment() {
        if (_segmentField!= null) {
            return true;
        }
        return super._map.containsKey("segment");
    }

    /**
     * Remover for segment
     * 
     * @see IncrementingSegmentRowCountChange.Fields#segment
     */
    public void removeSegment() {
        super._map.remove("segment");
    }

    /**
     * Getter for segment
     * 
     * @see IncrementingSegmentRowCountChange.Fields#segment
     */
    @Nullable
    public IncrementingSegmentSpec getSegment(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSegment();
            case DEFAULT:
            case NULL:
                if (_segmentField!= null) {
                    return _segmentField;
                } else {
                    Object __rawValue = super._map.get("segment");
                    _segmentField = ((__rawValue == null)?null:new IncrementingSegmentSpec(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _segmentField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for segment
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see IncrementingSegmentRowCountChange.Fields#segment
     */
    @Nonnull
    public IncrementingSegmentSpec getSegment() {
        if (_segmentField!= null) {
            return _segmentField;
        } else {
            Object __rawValue = super._map.get("segment");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("segment");
            }
            _segmentField = ((__rawValue == null)?null:new IncrementingSegmentSpec(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _segmentField;
        }
    }

    /**
     * Setter for segment
     * 
     * @see IncrementingSegmentRowCountChange.Fields#segment
     */
    public IncrementingSegmentRowCountChange setSegment(
        @Nullable
        IncrementingSegmentSpec value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSegment(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field segment of com.linkedin.assertion.IncrementingSegmentRowCountChange");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "segment", value.data());
                    _segmentField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSegment();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "segment", value.data());
                    _segmentField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "segment", value.data());
                    _segmentField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for segment
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see IncrementingSegmentRowCountChange.Fields#segment
     */
    public IncrementingSegmentRowCountChange setSegment(
        @Nonnull
        IncrementingSegmentSpec value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field segment of com.linkedin.assertion.IncrementingSegmentRowCountChange to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "segment", value.data());
            _segmentField = value;
        }
        return this;
    }

    /**
     * Existence checker for type
     * 
     * @see IncrementingSegmentRowCountChange.Fields#type
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
     * @see IncrementingSegmentRowCountChange.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see IncrementingSegmentRowCountChange.Fields#type
     */
    @Nullable
    public AssertionValueChangeType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionValueChangeType.class, AssertionValueChangeType.$UNKNOWN);
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
     * @see IncrementingSegmentRowCountChange.Fields#type
     */
    @Nonnull
    public AssertionValueChangeType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, AssertionValueChangeType.class, AssertionValueChangeType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see IncrementingSegmentRowCountChange.Fields#type
     */
    public IncrementingSegmentRowCountChange setType(
        @Nullable
        AssertionValueChangeType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.IncrementingSegmentRowCountChange");
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
     * @see IncrementingSegmentRowCountChange.Fields#type
     */
    public IncrementingSegmentRowCountChange setType(
        @Nonnull
        AssertionValueChangeType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.IncrementingSegmentRowCountChange to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for operator
     * 
     * @see IncrementingSegmentRowCountChange.Fields#operator
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
     * @see IncrementingSegmentRowCountChange.Fields#operator
     */
    public void removeOperator() {
        super._map.remove("operator");
    }

    /**
     * Getter for operator
     * 
     * @see IncrementingSegmentRowCountChange.Fields#operator
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
     * @see IncrementingSegmentRowCountChange.Fields#operator
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
     * @see IncrementingSegmentRowCountChange.Fields#operator
     */
    public IncrementingSegmentRowCountChange setOperator(
        @Nullable
        AssertionStdOperator value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setOperator(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field operator of com.linkedin.assertion.IncrementingSegmentRowCountChange");
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
     * @see IncrementingSegmentRowCountChange.Fields#operator
     */
    public IncrementingSegmentRowCountChange setOperator(
        @Nonnull
        AssertionStdOperator value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field operator of com.linkedin.assertion.IncrementingSegmentRowCountChange to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "operator", value.name());
            _operatorField = value;
        }
        return this;
    }

    /**
     * Existence checker for parameters
     * 
     * @see IncrementingSegmentRowCountChange.Fields#parameters
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
     * @see IncrementingSegmentRowCountChange.Fields#parameters
     */
    public void removeParameters() {
        super._map.remove("parameters");
    }

    /**
     * Getter for parameters
     * 
     * @see IncrementingSegmentRowCountChange.Fields#parameters
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
     * @see IncrementingSegmentRowCountChange.Fields#parameters
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
     * @see IncrementingSegmentRowCountChange.Fields#parameters
     */
    public IncrementingSegmentRowCountChange setParameters(
        @Nullable
        AssertionStdParameters value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setParameters(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field parameters of com.linkedin.assertion.IncrementingSegmentRowCountChange");
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
     * @see IncrementingSegmentRowCountChange.Fields#parameters
     */
    public IncrementingSegmentRowCountChange setParameters(
        @Nonnull
        AssertionStdParameters value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field parameters of com.linkedin.assertion.IncrementingSegmentRowCountChange to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "parameters", value.data());
            _parametersField = value;
        }
        return this;
    }

    @Override
    public IncrementingSegmentRowCountChange clone()
        throws CloneNotSupportedException
    {
        IncrementingSegmentRowCountChange __clone = ((IncrementingSegmentRowCountChange) super.clone());
        __clone.__changeListener = new IncrementingSegmentRowCountChange.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public IncrementingSegmentRowCountChange copy()
        throws CloneNotSupportedException
    {
        IncrementingSegmentRowCountChange __copy = ((IncrementingSegmentRowCountChange) super.copy());
        __copy._segmentField = null;
        __copy._typeField = null;
        __copy._parametersField = null;
        __copy._operatorField = null;
        __copy.__changeListener = new IncrementingSegmentRowCountChange.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final IncrementingSegmentRowCountChange __objectRef;

        private ChangeListener(IncrementingSegmentRowCountChange reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "segment":
                    __objectRef._segmentField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
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
         * A specification of how the 'segment' can be derived using a column and an optional transformer function.
         * 
         */
        public com.linkedin.assertion.IncrementingSegmentSpec.Fields segment() {
            return new com.linkedin.assertion.IncrementingSegmentSpec.Fields(getPathComponents(), "segment");
        }

        /**
         * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The operator you'd like to apply to the row count value
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

        private com.linkedin.assertion.IncrementingSegmentSpec.ProjectionMask _segmentMask;
        private com.linkedin.assertion.AssertionStdParameters.ProjectionMask _parametersMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * A specification of how the 'segment' can be derived using a column and an optional transformer function.
         * 
         */
        public IncrementingSegmentRowCountChange.ProjectionMask withSegment(Function<com.linkedin.assertion.IncrementingSegmentSpec.ProjectionMask, com.linkedin.assertion.IncrementingSegmentSpec.ProjectionMask> nestedMask) {
            _segmentMask = nestedMask.apply(((_segmentMask == null)?IncrementingSegmentSpec.createMask():_segmentMask));
            getDataMap().put("segment", _segmentMask.getDataMap());
            return this;
        }

        /**
         * A specification of how the 'segment' can be derived using a column and an optional transformer function.
         * 
         */
        public IncrementingSegmentRowCountChange.ProjectionMask withSegment() {
            _segmentMask = null;
            getDataMap().put("segment", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
         * 
         */
        public IncrementingSegmentRowCountChange.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The operator you'd like to apply to the row count value
         * 
         * Note that only numeric operators are valid inputs:
         * GREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,
         * BETWEEN.
         * 
         */
        public IncrementingSegmentRowCountChange.ProjectionMask withOperator() {
            getDataMap().put("operator", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The parameters you'd like to provide as input to the operator.
         * 
         * Note that only numeric parameter types are valid inputs: NUMBER.
         * 
         */
        public IncrementingSegmentRowCountChange.ProjectionMask withParameters(Function<com.linkedin.assertion.AssertionStdParameters.ProjectionMask, com.linkedin.assertion.AssertionStdParameters.ProjectionMask> nestedMask) {
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
        public IncrementingSegmentRowCountChange.ProjectionMask withParameters() {
            _parametersMask = null;
            getDataMap().put("parameters", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
