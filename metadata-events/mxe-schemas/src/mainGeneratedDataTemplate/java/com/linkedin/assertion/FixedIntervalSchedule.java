
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
import com.linkedin.data.template.RequiredFieldNotPresentException;
import com.linkedin.data.template.SetMode;
import com.linkedin.timeseries.CalendarInterval;


/**
 * Attributes defining a relative fixed interval SLA schedule.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/FixedIntervalSchedule.pdl.")
public class FixedIntervalSchedule
    extends RecordTemplate
{

    private final static FixedIntervalSchedule.Fields _fields = new FixedIntervalSchedule.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes defining a relative fixed interval SLA schedule.*/record FixedIntervalSchedule includes{namespace com.linkedin.timeseries/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}}{}", SchemaFormatType.PDL));
    private CalendarInterval _unitField = null;
    private Integer _multipleField = null;
    private FixedIntervalSchedule.ChangeListener __changeListener = new FixedIntervalSchedule.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Unit = SCHEMA.getField("unit");
    private final static RecordDataSchema.Field FIELD_Multiple = SCHEMA.getField("multiple");
    private final static Integer DEFAULT_Multiple;

    static {
        DEFAULT_Multiple = DataTemplateUtil.coerceIntOutput(FIELD_Multiple.getDefault());
    }

    public FixedIntervalSchedule() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public FixedIntervalSchedule(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FixedIntervalSchedule.Fields fields() {
        return _fields;
    }

    public static FixedIntervalSchedule.ProjectionMask createMask() {
        return new FixedIntervalSchedule.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for unit
     * 
     * @see FixedIntervalSchedule.Fields#unit
     */
    public boolean hasUnit() {
        if (_unitField!= null) {
            return true;
        }
        return super._map.containsKey("unit");
    }

    /**
     * Remover for unit
     * 
     * @see FixedIntervalSchedule.Fields#unit
     */
    public void removeUnit() {
        super._map.remove("unit");
    }

    /**
     * Getter for unit
     * 
     * @see FixedIntervalSchedule.Fields#unit
     */
    @Nullable
    public CalendarInterval getUnit(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getUnit();
            case DEFAULT:
            case NULL:
                if (_unitField!= null) {
                    return _unitField;
                } else {
                    Object __rawValue = super._map.get("unit");
                    _unitField = DataTemplateUtil.coerceEnumOutput(__rawValue, CalendarInterval.class, CalendarInterval.$UNKNOWN);
                    return _unitField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for unit
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FixedIntervalSchedule.Fields#unit
     */
    @Nonnull
    public CalendarInterval getUnit() {
        if (_unitField!= null) {
            return _unitField;
        } else {
            Object __rawValue = super._map.get("unit");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("unit");
            }
            _unitField = DataTemplateUtil.coerceEnumOutput(__rawValue, CalendarInterval.class, CalendarInterval.$UNKNOWN);
            return _unitField;
        }
    }

    /**
     * Setter for unit
     * 
     * @see FixedIntervalSchedule.Fields#unit
     */
    public FixedIntervalSchedule setUnit(
        @Nullable
        CalendarInterval value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUnit(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field unit of com.linkedin.assertion.FixedIntervalSchedule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "unit", value.name());
                    _unitField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeUnit();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "unit", value.name());
                    _unitField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "unit", value.name());
                    _unitField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for unit
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FixedIntervalSchedule.Fields#unit
     */
    public FixedIntervalSchedule setUnit(
        @Nonnull
        CalendarInterval value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field unit of com.linkedin.assertion.FixedIntervalSchedule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "unit", value.name());
            _unitField = value;
        }
        return this;
    }

    /**
     * Existence checker for multiple
     * 
     * @see FixedIntervalSchedule.Fields#multiple
     */
    public boolean hasMultiple() {
        if (_multipleField!= null) {
            return true;
        }
        return super._map.containsKey("multiple");
    }

    /**
     * Remover for multiple
     * 
     * @see FixedIntervalSchedule.Fields#multiple
     */
    public void removeMultiple() {
        super._map.remove("multiple");
    }

    /**
     * Getter for multiple
     * 
     * @see FixedIntervalSchedule.Fields#multiple
     */
    @Nullable
    public Integer getMultiple(GetMode mode) {
        switch (mode) {
            case STRICT:
            case DEFAULT:
                return getMultiple();
            case NULL:
                if (_multipleField!= null) {
                    return _multipleField;
                } else {
                    Object __rawValue = super._map.get("multiple");
                    _multipleField = DataTemplateUtil.coerceIntOutput(__rawValue);
                    return _multipleField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for multiple
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FixedIntervalSchedule.Fields#multiple
     */
    @Nonnull
    public Integer getMultiple() {
        if (_multipleField!= null) {
            return _multipleField;
        } else {
            Object __rawValue = super._map.get("multiple");
            if (__rawValue == null) {
                return DEFAULT_Multiple;
            }
            _multipleField = DataTemplateUtil.coerceIntOutput(__rawValue);
            return _multipleField;
        }
    }

    /**
     * Setter for multiple
     * 
     * @see FixedIntervalSchedule.Fields#multiple
     */
    public FixedIntervalSchedule setMultiple(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMultiple(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field multiple of com.linkedin.assertion.FixedIntervalSchedule");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "multiple", DataTemplateUtil.coerceIntInput(value));
                    _multipleField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMultiple();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "multiple", DataTemplateUtil.coerceIntInput(value));
                    _multipleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "multiple", DataTemplateUtil.coerceIntInput(value));
                    _multipleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for multiple
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FixedIntervalSchedule.Fields#multiple
     */
    public FixedIntervalSchedule setMultiple(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field multiple of com.linkedin.assertion.FixedIntervalSchedule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "multiple", DataTemplateUtil.coerceIntInput(value));
            _multipleField = value;
        }
        return this;
    }

    /**
     * Setter for multiple
     * 
     * @see FixedIntervalSchedule.Fields#multiple
     */
    public FixedIntervalSchedule setMultiple(int value) {
        CheckedUtil.putWithoutChecking(super._map, "multiple", DataTemplateUtil.coerceIntInput(value));
        _multipleField = value;
        return this;
    }

    @Override
    public FixedIntervalSchedule clone()
        throws CloneNotSupportedException
    {
        FixedIntervalSchedule __clone = ((FixedIntervalSchedule) super.clone());
        __clone.__changeListener = new FixedIntervalSchedule.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FixedIntervalSchedule copy()
        throws CloneNotSupportedException
    {
        FixedIntervalSchedule __copy = ((FixedIntervalSchedule) super.copy());
        __copy._unitField = null;
        __copy._multipleField = null;
        __copy.__changeListener = new FixedIntervalSchedule.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FixedIntervalSchedule __objectRef;

        private ChangeListener(FixedIntervalSchedule reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "unit":
                    __objectRef._unitField = null;
                    break;
                case "multiple":
                    __objectRef._multipleField = null;
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
         * Interval unit such as minute/hour/day etc.
         * 
         */
        public PathSpec unit() {
            return new PathSpec(getPathComponents(), "unit");
        }

        /**
         * How many units. Defaults to 1.
         * 
         */
        public PathSpec multiple() {
            return new PathSpec(getPathComponents(), "multiple");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {


        ProjectionMask() {
            super(3);
        }

        /**
         * Interval unit such as minute/hour/day etc.
         * 
         */
        public FixedIntervalSchedule.ProjectionMask withUnit() {
            getDataMap().put("unit", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * How many units. Defaults to 1.
         * 
         */
        public FixedIntervalSchedule.ProjectionMask withMultiple() {
            getDataMap().put("multiple", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
