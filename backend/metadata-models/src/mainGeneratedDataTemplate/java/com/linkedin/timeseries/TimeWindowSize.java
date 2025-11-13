
package com.linkedin.timeseries;

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
 * Defines the size of a time window.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/timeseries/TimeWindowSize.pdl.")
public class TimeWindowSize
    extends RecordTemplate
{

    private final static TimeWindowSize.Fields _fields = new TimeWindowSize.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}", SchemaFormatType.PDL));
    private CalendarInterval _unitField = null;
    private Integer _multipleField = null;
    private TimeWindowSize.ChangeListener __changeListener = new TimeWindowSize.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Unit = SCHEMA.getField("unit");
    private final static RecordDataSchema.Field FIELD_Multiple = SCHEMA.getField("multiple");
    private final static Integer DEFAULT_Multiple;

    static {
        DEFAULT_Multiple = DataTemplateUtil.coerceIntOutput(FIELD_Multiple.getDefault());
    }

    public TimeWindowSize() {
        super(new DataMap(3, 0.75F), SCHEMA);
        addChangeListener(__changeListener);
    }

    public TimeWindowSize(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TimeWindowSize.Fields fields() {
        return _fields;
    }

    public static TimeWindowSize.ProjectionMask createMask() {
        return new TimeWindowSize.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for unit
     * 
     * @see TimeWindowSize.Fields#unit
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
     * @see TimeWindowSize.Fields#unit
     */
    public void removeUnit() {
        super._map.remove("unit");
    }

    /**
     * Getter for unit
     * 
     * @see TimeWindowSize.Fields#unit
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
     * @see TimeWindowSize.Fields#unit
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
     * @see TimeWindowSize.Fields#unit
     */
    public TimeWindowSize setUnit(
        @Nullable
        CalendarInterval value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setUnit(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field unit of com.linkedin.timeseries.TimeWindowSize");
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
     * @see TimeWindowSize.Fields#unit
     */
    public TimeWindowSize setUnit(
        @Nonnull
        CalendarInterval value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field unit of com.linkedin.timeseries.TimeWindowSize to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "unit", value.name());
            _unitField = value;
        }
        return this;
    }

    /**
     * Existence checker for multiple
     * 
     * @see TimeWindowSize.Fields#multiple
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
     * @see TimeWindowSize.Fields#multiple
     */
    public void removeMultiple() {
        super._map.remove("multiple");
    }

    /**
     * Getter for multiple
     * 
     * @see TimeWindowSize.Fields#multiple
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
     * @see TimeWindowSize.Fields#multiple
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
     * @see TimeWindowSize.Fields#multiple
     */
    public TimeWindowSize setMultiple(
        @Nullable
        Integer value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMultiple(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field multiple of com.linkedin.timeseries.TimeWindowSize");
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
     * @see TimeWindowSize.Fields#multiple
     */
    public TimeWindowSize setMultiple(
        @Nonnull
        Integer value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field multiple of com.linkedin.timeseries.TimeWindowSize to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "multiple", DataTemplateUtil.coerceIntInput(value));
            _multipleField = value;
        }
        return this;
    }

    /**
     * Setter for multiple
     * 
     * @see TimeWindowSize.Fields#multiple
     */
    public TimeWindowSize setMultiple(int value) {
        CheckedUtil.putWithoutChecking(super._map, "multiple", DataTemplateUtil.coerceIntInput(value));
        _multipleField = value;
        return this;
    }

    @Override
    public TimeWindowSize clone()
        throws CloneNotSupportedException
    {
        TimeWindowSize __clone = ((TimeWindowSize) super.clone());
        __clone.__changeListener = new TimeWindowSize.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TimeWindowSize copy()
        throws CloneNotSupportedException
    {
        TimeWindowSize __copy = ((TimeWindowSize) super.copy());
        __copy._unitField = null;
        __copy._multipleField = null;
        __copy.__changeListener = new TimeWindowSize.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TimeWindowSize __objectRef;

        private ChangeListener(TimeWindowSize reference) {
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
        public TimeWindowSize.ProjectionMask withUnit() {
            getDataMap().put("unit", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * How many units. Defaults to 1.
         * 
         */
        public TimeWindowSize.ProjectionMask withMultiple() {
            getDataMap().put("multiple", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
