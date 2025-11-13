
package com.linkedin.assertion;

import java.util.List;
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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/FieldValuesAssertion.pdl.")
public class FieldValuesFailThreshold
    extends RecordTemplate
{

    private final static FieldValuesFailThreshold.Fields _fields = new FieldValuesFailThreshold.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,record FieldValuesFailThreshold{/**The type of failure threshold. Either based on the number\nof column values (rows) that fail the expectations, or the percentage\nof the total rows under consideration.*/type:enum FieldValuesFailThresholdType{COUNT,PERCENTAGE}=\"COUNT\"/**By default this is 0, meaning that ALL column values (i.e. rows) must\nmeet the defined expectations.*/value:long=0}", SchemaFormatType.PDL));
    private FieldValuesFailThresholdType _typeField = null;
    private Long _valueField = null;
    private FieldValuesFailThreshold.ChangeListener __changeListener = new FieldValuesFailThreshold.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static FieldValuesFailThresholdType DEFAULT_Type;
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static Long DEFAULT_Value;

    static {
        DEFAULT_Type = DataTemplateUtil.coerceEnumOutput(FIELD_Type.getDefault(), FieldValuesFailThresholdType.class, FieldValuesFailThresholdType.$UNKNOWN);
        DEFAULT_Value = DataTemplateUtil.coerceLongOutput(FIELD_Value.getDefault());
    }

    public FieldValuesFailThreshold() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public FieldValuesFailThreshold(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FieldValuesFailThreshold.Fields fields() {
        return _fields;
    }

    public static FieldValuesFailThreshold.ProjectionMask createMask() {
        return new FieldValuesFailThreshold.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see FieldValuesFailThreshold.Fields#type
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
     * @see FieldValuesFailThreshold.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see FieldValuesFailThreshold.Fields#type
     */
    @Nullable
    public FieldValuesFailThresholdType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getType();
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FieldValuesFailThresholdType.class, FieldValuesFailThresholdType.$UNKNOWN);
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
     * @see FieldValuesFailThreshold.Fields#type
     */
    @Nonnull
    public FieldValuesFailThresholdType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                return DEFAULT_Type;
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FieldValuesFailThresholdType.class, FieldValuesFailThresholdType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see FieldValuesFailThreshold.Fields#type
     */
    public FieldValuesFailThreshold setType(
        @Nullable
        FieldValuesFailThresholdType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.FieldValuesFailThreshold");
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
     * @see FieldValuesFailThreshold.Fields#type
     */
    public FieldValuesFailThreshold setType(
        @Nonnull
        FieldValuesFailThresholdType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.FieldValuesFailThreshold to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for value
     * 
     * @see FieldValuesFailThreshold.Fields#value
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
     * @see FieldValuesFailThreshold.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see FieldValuesFailThreshold.Fields#value
     */
    @Nullable
    public Long getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getValue();
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _valueField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for value
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FieldValuesFailThreshold.Fields#value
     */
    @Nonnull
    public Long getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                return DEFAULT_Value;
            }
            _valueField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see FieldValuesFailThreshold.Fields#value
     */
    public FieldValuesFailThreshold setValue(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.assertion.FieldValuesFailThreshold");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", DataTemplateUtil.coerceLongInput(value));
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", DataTemplateUtil.coerceLongInput(value));
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", DataTemplateUtil.coerceLongInput(value));
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
     * @see FieldValuesFailThreshold.Fields#value
     */
    public FieldValuesFailThreshold setValue(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.assertion.FieldValuesFailThreshold to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", DataTemplateUtil.coerceLongInput(value));
            _valueField = value;
        }
        return this;
    }

    /**
     * Setter for value
     * 
     * @see FieldValuesFailThreshold.Fields#value
     */
    public FieldValuesFailThreshold setValue(long value) {
        CheckedUtil.putWithoutChecking(super._map, "value", DataTemplateUtil.coerceLongInput(value));
        _valueField = value;
        return this;
    }

    @Override
    public FieldValuesFailThreshold clone()
        throws CloneNotSupportedException
    {
        FieldValuesFailThreshold __clone = ((FieldValuesFailThreshold) super.clone());
        __clone.__changeListener = new FieldValuesFailThreshold.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FieldValuesFailThreshold copy()
        throws CloneNotSupportedException
    {
        FieldValuesFailThreshold __copy = ((FieldValuesFailThreshold) super.copy());
        __copy._typeField = null;
        __copy._valueField = null;
        __copy.__changeListener = new FieldValuesFailThreshold.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FieldValuesFailThreshold __objectRef;

        private ChangeListener(FieldValuesFailThreshold reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "type":
                    __objectRef._typeField = null;
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
         * The type of failure threshold. Either based on the number
         * of column values (rows) that fail the expectations, or the percentage
         * of the total rows under consideration.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * By default this is 0, meaning that ALL column values (i.e. rows) must
         * meet the defined expectations.
         * 
         */
        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * The type of failure threshold. Either based on the number
         * of column values (rows) that fail the expectations, or the percentage
         * of the total rows under consideration.
         * 
         */
        public FieldValuesFailThreshold.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * By default this is 0, meaning that ALL column values (i.e. rows) must
         * meet the defined expectations.
         * 
         */
        public FieldValuesFailThreshold.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
