
package com.linkedin.timeseries;

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
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/timeseries/TimeWindow.pdl.")
public class TimeWindow
    extends RecordTemplate
{

    private final static TimeWindow.Fields _fields = new TimeWindow.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries,record TimeWindow{/**Start time as epoch at UTC.*/startTimeMillis:long/**The length of the window.*/length:/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}}", SchemaFormatType.PDL));
    private Long _startTimeMillisField = null;
    private TimeWindowSize _lengthField = null;
    private TimeWindow.ChangeListener __changeListener = new TimeWindow.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_StartTimeMillis = SCHEMA.getField("startTimeMillis");
    private final static RecordDataSchema.Field FIELD_Length = SCHEMA.getField("length");

    public TimeWindow() {
        super(new DataMap(3, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public TimeWindow(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static TimeWindow.Fields fields() {
        return _fields;
    }

    public static TimeWindow.ProjectionMask createMask() {
        return new TimeWindow.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for startTimeMillis
     * 
     * @see TimeWindow.Fields#startTimeMillis
     */
    public boolean hasStartTimeMillis() {
        if (_startTimeMillisField!= null) {
            return true;
        }
        return super._map.containsKey("startTimeMillis");
    }

    /**
     * Remover for startTimeMillis
     * 
     * @see TimeWindow.Fields#startTimeMillis
     */
    public void removeStartTimeMillis() {
        super._map.remove("startTimeMillis");
    }

    /**
     * Getter for startTimeMillis
     * 
     * @see TimeWindow.Fields#startTimeMillis
     */
    @Nullable
    public Long getStartTimeMillis(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getStartTimeMillis();
            case DEFAULT:
            case NULL:
                if (_startTimeMillisField!= null) {
                    return _startTimeMillisField;
                } else {
                    Object __rawValue = super._map.get("startTimeMillis");
                    _startTimeMillisField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _startTimeMillisField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for startTimeMillis
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeWindow.Fields#startTimeMillis
     */
    @Nonnull
    public Long getStartTimeMillis() {
        if (_startTimeMillisField!= null) {
            return _startTimeMillisField;
        } else {
            Object __rawValue = super._map.get("startTimeMillis");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("startTimeMillis");
            }
            _startTimeMillisField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _startTimeMillisField;
        }
    }

    /**
     * Setter for startTimeMillis
     * 
     * @see TimeWindow.Fields#startTimeMillis
     */
    public TimeWindow setStartTimeMillis(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setStartTimeMillis(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field startTimeMillis of com.linkedin.timeseries.TimeWindow");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _startTimeMillisField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeStartTimeMillis();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _startTimeMillisField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
                    _startTimeMillisField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for startTimeMillis
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeWindow.Fields#startTimeMillis
     */
    public TimeWindow setStartTimeMillis(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field startTimeMillis of com.linkedin.timeseries.TimeWindow to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
            _startTimeMillisField = value;
        }
        return this;
    }

    /**
     * Setter for startTimeMillis
     * 
     * @see TimeWindow.Fields#startTimeMillis
     */
    public TimeWindow setStartTimeMillis(long value) {
        CheckedUtil.putWithoutChecking(super._map, "startTimeMillis", DataTemplateUtil.coerceLongInput(value));
        _startTimeMillisField = value;
        return this;
    }

    /**
     * Existence checker for length
     * 
     * @see TimeWindow.Fields#length
     */
    public boolean hasLength() {
        if (_lengthField!= null) {
            return true;
        }
        return super._map.containsKey("length");
    }

    /**
     * Remover for length
     * 
     * @see TimeWindow.Fields#length
     */
    public void removeLength() {
        super._map.remove("length");
    }

    /**
     * Getter for length
     * 
     * @see TimeWindow.Fields#length
     */
    @Nullable
    public TimeWindowSize getLength(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getLength();
            case DEFAULT:
            case NULL:
                if (_lengthField!= null) {
                    return _lengthField;
                } else {
                    Object __rawValue = super._map.get("length");
                    _lengthField = ((__rawValue == null)?null:new TimeWindowSize(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _lengthField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for length
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see TimeWindow.Fields#length
     */
    @Nonnull
    public TimeWindowSize getLength() {
        if (_lengthField!= null) {
            return _lengthField;
        } else {
            Object __rawValue = super._map.get("length");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("length");
            }
            _lengthField = ((__rawValue == null)?null:new TimeWindowSize(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _lengthField;
        }
    }

    /**
     * Setter for length
     * 
     * @see TimeWindow.Fields#length
     */
    public TimeWindow setLength(
        @Nullable
        TimeWindowSize value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setLength(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field length of com.linkedin.timeseries.TimeWindow");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "length", value.data());
                    _lengthField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeLength();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "length", value.data());
                    _lengthField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "length", value.data());
                    _lengthField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for length
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see TimeWindow.Fields#length
     */
    public TimeWindow setLength(
        @Nonnull
        TimeWindowSize value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field length of com.linkedin.timeseries.TimeWindow to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "length", value.data());
            _lengthField = value;
        }
        return this;
    }

    @Override
    public TimeWindow clone()
        throws CloneNotSupportedException
    {
        TimeWindow __clone = ((TimeWindow) super.clone());
        __clone.__changeListener = new TimeWindow.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public TimeWindow copy()
        throws CloneNotSupportedException
    {
        TimeWindow __copy = ((TimeWindow) super.copy());
        __copy._startTimeMillisField = null;
        __copy._lengthField = null;
        __copy.__changeListener = new TimeWindow.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final TimeWindow __objectRef;

        private ChangeListener(TimeWindow reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "startTimeMillis":
                    __objectRef._startTimeMillisField = null;
                    break;
                case "length":
                    __objectRef._lengthField = null;
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
         * Start time as epoch at UTC.
         * 
         */
        public PathSpec startTimeMillis() {
            return new PathSpec(getPathComponents(), "startTimeMillis");
        }

        /**
         * The length of the window.
         * 
         */
        public com.linkedin.timeseries.TimeWindowSize.Fields length() {
            return new com.linkedin.timeseries.TimeWindowSize.Fields(getPathComponents(), "length");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.timeseries.TimeWindowSize.ProjectionMask _lengthMask;

        ProjectionMask() {
            super(3);
        }

        /**
         * Start time as epoch at UTC.
         * 
         */
        public TimeWindow.ProjectionMask withStartTimeMillis() {
            getDataMap().put("startTimeMillis", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The length of the window.
         * 
         */
        public TimeWindow.ProjectionMask withLength(Function<com.linkedin.timeseries.TimeWindowSize.ProjectionMask, com.linkedin.timeseries.TimeWindowSize.ProjectionMask> nestedMask) {
            _lengthMask = nestedMask.apply(((_lengthMask == null)?TimeWindowSize.createMask():_lengthMask));
            getDataMap().put("length", _lengthMask.getDataMap());
            return this;
        }

        /**
         * The length of the window.
         * 
         */
        public TimeWindow.ProjectionMask withLength() {
            _lengthMask = null;
            getDataMap().put("length", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
