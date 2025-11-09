
package com.linkedin.dataset;

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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/DatasetFieldProfile.pdl.")
public class ValueFrequency
    extends RecordTemplate
{

    private final static ValueFrequency.Fields _fields = new ValueFrequency.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset,record ValueFrequency{value:string,frequency:long}", SchemaFormatType.PDL));
    private String _valueField = null;
    private Long _frequencyField = null;
    private ValueFrequency.ChangeListener __changeListener = new ValueFrequency.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Value = SCHEMA.getField("value");
    private final static RecordDataSchema.Field FIELD_Frequency = SCHEMA.getField("frequency");

    public ValueFrequency() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public ValueFrequency(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static ValueFrequency.Fields fields() {
        return _fields;
    }

    public static ValueFrequency.ProjectionMask createMask() {
        return new ValueFrequency.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for value
     * 
     * @see ValueFrequency.Fields#value
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
     * @see ValueFrequency.Fields#value
     */
    public void removeValue() {
        super._map.remove("value");
    }

    /**
     * Getter for value
     * 
     * @see ValueFrequency.Fields#value
     */
    @Nullable
    public String getValue(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getValue();
            case DEFAULT:
            case NULL:
                if (_valueField!= null) {
                    return _valueField;
                } else {
                    Object __rawValue = super._map.get("value");
                    _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
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
     * @see ValueFrequency.Fields#value
     */
    @Nonnull
    public String getValue() {
        if (_valueField!= null) {
            return _valueField;
        } else {
            Object __rawValue = super._map.get("value");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("value");
            }
            _valueField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _valueField;
        }
    }

    /**
     * Setter for value
     * 
     * @see ValueFrequency.Fields#value
     */
    public ValueFrequency setValue(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setValue(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field value of com.linkedin.dataset.ValueFrequency");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeValue();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
                    _valueField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "value", value);
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
     * @see ValueFrequency.Fields#value
     */
    public ValueFrequency setValue(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field value of com.linkedin.dataset.ValueFrequency to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "value", value);
            _valueField = value;
        }
        return this;
    }

    /**
     * Existence checker for frequency
     * 
     * @see ValueFrequency.Fields#frequency
     */
    public boolean hasFrequency() {
        if (_frequencyField!= null) {
            return true;
        }
        return super._map.containsKey("frequency");
    }

    /**
     * Remover for frequency
     * 
     * @see ValueFrequency.Fields#frequency
     */
    public void removeFrequency() {
        super._map.remove("frequency");
    }

    /**
     * Getter for frequency
     * 
     * @see ValueFrequency.Fields#frequency
     */
    @Nullable
    public Long getFrequency(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getFrequency();
            case DEFAULT:
            case NULL:
                if (_frequencyField!= null) {
                    return _frequencyField;
                } else {
                    Object __rawValue = super._map.get("frequency");
                    _frequencyField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _frequencyField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for frequency
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see ValueFrequency.Fields#frequency
     */
    @Nonnull
    public Long getFrequency() {
        if (_frequencyField!= null) {
            return _frequencyField;
        } else {
            Object __rawValue = super._map.get("frequency");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("frequency");
            }
            _frequencyField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _frequencyField;
        }
    }

    /**
     * Setter for frequency
     * 
     * @see ValueFrequency.Fields#frequency
     */
    public ValueFrequency setFrequency(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFrequency(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field frequency of com.linkedin.dataset.ValueFrequency");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "frequency", DataTemplateUtil.coerceLongInput(value));
                    _frequencyField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFrequency();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "frequency", DataTemplateUtil.coerceLongInput(value));
                    _frequencyField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "frequency", DataTemplateUtil.coerceLongInput(value));
                    _frequencyField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for frequency
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see ValueFrequency.Fields#frequency
     */
    public ValueFrequency setFrequency(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field frequency of com.linkedin.dataset.ValueFrequency to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "frequency", DataTemplateUtil.coerceLongInput(value));
            _frequencyField = value;
        }
        return this;
    }

    /**
     * Setter for frequency
     * 
     * @see ValueFrequency.Fields#frequency
     */
    public ValueFrequency setFrequency(long value) {
        CheckedUtil.putWithoutChecking(super._map, "frequency", DataTemplateUtil.coerceLongInput(value));
        _frequencyField = value;
        return this;
    }

    @Override
    public ValueFrequency clone()
        throws CloneNotSupportedException
    {
        ValueFrequency __clone = ((ValueFrequency) super.clone());
        __clone.__changeListener = new ValueFrequency.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public ValueFrequency copy()
        throws CloneNotSupportedException
    {
        ValueFrequency __copy = ((ValueFrequency) super.copy());
        __copy._valueField = null;
        __copy._frequencyField = null;
        __copy.__changeListener = new ValueFrequency.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final ValueFrequency __objectRef;

        private ChangeListener(ValueFrequency reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "value":
                    __objectRef._valueField = null;
                    break;
                case "frequency":
                    __objectRef._frequencyField = null;
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

        public PathSpec value() {
            return new PathSpec(getPathComponents(), "value");
        }

        public PathSpec frequency() {
            return new PathSpec(getPathComponents(), "frequency");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        public ValueFrequency.ProjectionMask withValue() {
            getDataMap().put("value", MaskMap.POSITIVE_MASK);
            return this;
        }

        public ValueFrequency.ProjectionMask withFrequency() {
            getDataMap().put("frequency", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
