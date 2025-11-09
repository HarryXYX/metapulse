
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
import com.linkedin.data.template.SetMode;


/**
 * Parameters for AssertionStdOperators.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/AssertionStdParameters.pdl.")
public class AssertionStdParameters
    extends RecordTemplate
{

    private final static AssertionStdParameters.Fields _fields = new AssertionStdParameters.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Parameters for AssertionStdOperators.*/record AssertionStdParameters{/**The value parameter of an assertion*/value:optional/**Single parameter for AssertionStdOperators.*/record AssertionStdParameter{/**The parameter value*/value:string/**The type of the parameter*/type:enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}}/**The maxValue parameter of an assertion*/maxValue:optional AssertionStdParameter/**The minValue parameter of an assertion*/minValue:optional AssertionStdParameter}", SchemaFormatType.PDL));
    private AssertionStdParameter _valueField = null;
    private AssertionStdParameter _maxValueField = null;
    private AssertionStdParameter _minValueField = null;
    private AssertionStdParameters.ChangeListener __changeListener = new AssertionStdParameters.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_MaxValue = SCHEMA.getField("maxValue");
    private final static RecordDataSchema.Field FIELD_MinValue = SCHEMA.getField("minValue");

    public AssertionStdParameters() {
        super(new DataMap(4, 0.75F), SCHEMA, 4);
        addChangeListener(__changeListener);
    }

    public AssertionStdParameters(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static AssertionStdParameters.Fields fields() {
        return _fields;
    }

    public static AssertionStdParameters.ProjectionMask createMask() {
        return new AssertionStdParameters.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for value
     * 
     * @see AssertionStdParameters.Fields#value
     */
    public boolean hasValue() {
        if (_valueField!= null) {
            return true;
        }
        return super._map.containsKey("value");
    }

    /**
     * Remover for value
     * 
     * @see AssertionStdParameters.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see AssertionStdParameters.Fields#value
     */
    @Nullable
    public AssertionStdParameter getValue(GetMode mode) {
        return getValue();
    }

    /**
     * Getter for value
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionStdParameters.Fields#value
     */
    @Nullable
    public AssertionStdParameter getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            _valueField = ((__rawValue == null)?null:new AssertionStdParameter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see AssertionStdParameters.Fields#value
     */
    public AssertionStdParameters setValue(
        @Nullable
        AssertionStdParameter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.data());
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value.data());
                    _valueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for value
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionStdParameters.Fields#value
     */
    public AssertionStdParameters setValue(
        @Nonnull
        AssertionStdParameter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.assertion.AssertionStdParameters to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value.data());
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for maxValue
     * 
     * @see AssertionStdParameters.Fields#maxValue
     */
    public boolean hasMaxValue() {
        if (_maxValueField!= null) {
            return true;
        }
        return super._map.containsKey("maxValue");
    }

    /**
     * Remover for maxValue
     * 
     * @see AssertionStdParameters.Fields#maxValue
     */
    public void removeMaxValue() {
        super._map.remove("maxValue");
    }

    /**
     * Getter for maxValue
     * 
     * @see AssertionStdParameters.Fields#maxValue
     */
    @Nullable
    public AssertionStdParameter getMaxValue(GetMode mode) {
        return getMaxValue();
    }

    /**
     * Getter for maxValue
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionStdParameters.Fields#maxValue
     */
    @Nullable
    public AssertionStdParameter getMaxValue() {
        if (_maxValueField!= null) {
            return _maxValueField;
        } else {
            Object __rawValue = super._map.get("maxValue");
            _maxValueField = ((__rawValue == null)?null:new AssertionStdParameter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _maxValueField;
        }
    }

    /**
     * Setter for maxValue
     * 
     * @see AssertionStdParameters.Fields#maxValue
     */
    public AssertionStdParameters setMaxValue(
        @Nullable
        AssertionStdParameter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMaxValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMaxValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "maxValue", value.data());
                    _maxValueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "maxValue", value.data());
                    _maxValueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for maxValue
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionStdParameters.Fields#maxValue
     */
    public AssertionStdParameters setMaxValue(
        @Nonnull
        AssertionStdParameter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field maxValue of com.linkedin.assertion.AssertionStdParameters to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "maxValue", value.data());
            _maxValueField = value;
        }
        return this;
    }

    /**
     * Existence checker for minValue
     * 
     * @see AssertionStdParameters.Fields#minValue
     */
    public boolean hasMinValue() {
        if (_minValueField!= null) {
            return true;
        }
        return super._map.containsKey("minValue");
    }

    /**
     * Remover for minValue
     * 
     * @see AssertionStdParameters.Fields#minValue
     */
    public void removeMinValue() {
        super._map.remove("minValue");
    }

    /**
     * Getter for minValue
     * 
     * @see AssertionStdParameters.Fields#minValue
     */
    @Nullable
    public AssertionStdParameter getMinValue(GetMode mode) {
        return getMinValue();
    }

    /**
     * Getter for minValue
     * 
     * @return
     *     Optional field. Always check for null.
     * @see AssertionStdParameters.Fields#minValue
     */
    @Nullable
    public AssertionStdParameter getMinValue() {
        if (_minValueField!= null) {
            return _minValueField;
        } else {
            Object __rawValue = super._map.get("minValue");
            _minValueField = ((__rawValue == null)?null:new AssertionStdParameter(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _minValueField;
        }
    }

    /**
     * Setter for minValue
     * 
     * @see AssertionStdParameters.Fields#minValue
     */
    public AssertionStdParameters setMinValue(
        @Nullable
        AssertionStdParameter value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMinValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMinValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "minValue", value.data());
                    _minValueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "minValue", value.data());
                    _minValueField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for minValue
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see AssertionStdParameters.Fields#minValue
     */
    public AssertionStdParameters setMinValue(
        @Nonnull
        AssertionStdParameter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field minValue of com.linkedin.assertion.AssertionStdParameters to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "minValue", value.data());
            _minValueField = value;
        }
        return this;
    }

    @Override
    public AssertionStdParameters clone()
        throws CloneNotSupportedException
    {
        AssertionStdParameters __clone = ((AssertionStdParameters) super.clone());
        __clone.__changeListener = new AssertionStdParameters.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public AssertionStdParameters copy()
        throws CloneNotSupportedException
    {
        AssertionStdParameters __copy = ((AssertionStdParameters) super.copy());
        __copy._minValueField = null;
        __copy._maxValueField = null;
        __copy._valueField = null;
        __copy.__changeListener = new AssertionStdParameters.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final AssertionStdParameters __objectRef;

        private ChangeListener(AssertionStdParameters reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "minValue":
                    __objectRef._minValueField = null;
                    break;
                case "maxValue":
                    __objectRef._maxValueField = null;
                    break;
                case "value":
                    __objectRef._valueField = null;
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
         * The value parameter of an assertion
         * 
         */
        public com.linkedin.assertion.AssertionStdParameter.Fields value() {
            return new com.linkedin.assertion.AssertionStdParameter.Fields(getPathComponents(), "value");
        }

        /**
         * The maxValue parameter of an assertion
         * 
         */
        public com.linkedin.assertion.AssertionStdParameter.Fields maxValue() {
            return new com.linkedin.assertion.AssertionStdParameter.Fields(getPathComponents(), "maxValue");
        }

        /**
         * The minValue parameter of an assertion
         * 
         */
        public com.linkedin.assertion.AssertionStdParameter.Fields minValue() {
            return new com.linkedin.assertion.AssertionStdParameter.Fields(getPathComponents(), "minValue");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.assertion.AssertionStdParameter.ProjectionMask _valueMask;
        private com.linkedin.assertion.AssertionStdParameter.ProjectionMask _maxValueMask;
        private com.linkedin.assertion.AssertionStdParameter.ProjectionMask _minValueMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * The value parameter of an assertion
         * 
         */
        public AssertionStdParameters.ProjectionMask withValue(Function<com.linkedin.assertion.AssertionStdParameter.ProjectionMask, com.linkedin.assertion.AssertionStdParameter.ProjectionMask> nestedMask) {
            _valueMask = nestedMask.apply(((_valueMask == null)?AssertionStdParameter.createMask():_valueMask));
            getDataMap().put("value", _valueMask.getDataMap());
            return this;
        }

        /**
         * The value parameter of an assertion
         * 
         */
        public AssertionStdParameters.ProjectionMask withValue() {
            _valueMask = null;
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The maxValue parameter of an assertion
         * 
         */
        public AssertionStdParameters.ProjectionMask withMaxValue(Function<com.linkedin.assertion.AssertionStdParameter.ProjectionMask, com.linkedin.assertion.AssertionStdParameter.ProjectionMask> nestedMask) {
            _maxValueMask = nestedMask.apply(((_maxValueMask == null)?AssertionStdParameter.createMask():_maxValueMask));
            getDataMap().put("maxValue", _maxValueMask.getDataMap());
            return this;
        }

        /**
         * The maxValue parameter of an assertion
         * 
         */
        public AssertionStdParameters.ProjectionMask withMaxValue() {
            _maxValueMask = null;
            getDataMap().put("maxValue", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The minValue parameter of an assertion
         * 
         */
        public AssertionStdParameters.ProjectionMask withMinValue(Function<com.linkedin.assertion.AssertionStdParameter.ProjectionMask, com.linkedin.assertion.AssertionStdParameter.ProjectionMask> nestedMask) {
            _minValueMask = nestedMask.apply(((_minValueMask == null)?AssertionStdParameter.createMask():_minValueMask));
            getDataMap().put("minValue", _minValueMask.getDataMap());
            return this;
        }

        /**
         * The minValue parameter of an assertion
         * 
         */
        public AssertionStdParameters.ProjectionMask withMinValue() {
            _minValueMask = null;
            getDataMap().put("minValue", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
