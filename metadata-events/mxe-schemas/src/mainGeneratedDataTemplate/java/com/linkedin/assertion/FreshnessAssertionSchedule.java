
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
 * Attributes defining a single Freshness schedule.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/FreshnessAssertionSchedule.pdl.")
public class FreshnessAssertionSchedule
    extends RecordTemplate
{

    private final static FreshnessAssertionSchedule.Fields _fields = new FreshnessAssertionSchedule.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes defining a single Freshness schedule.*/record FreshnessAssertionSchedule{/**The type of a Freshness Assertion Schedule.\n\nOnce we support data-time-relative schedules (e.g. schedules relative to time partitions),\nwe will add those schedule types here.*/type:enum FreshnessAssertionScheduleType{/**A highly configurable recurring schedule which describes the times of events described\nby a CRON schedule, with the evaluation schedule assuming to be matching the cron schedule.\n\nIn a CRON schedule type, we compute the look-back window to be the time between the last scheduled event\nand the current event (evaluation time). This means that the evaluation schedule must match exactly\nthe schedule defined inside the cron schedule.\n\nFor example, a CRON schedule defined as \"0 8 * * *\" would represent a schedule of \"every day by 8am\". Assuming\nthat the assertion evaluation schedule is defined to match this, the freshness assertion would be evaluated in the following way:\n\n    1. Compute the \"last scheduled occurrence\" of the event using the CRON schedule. For example, yesterday at 8am.\n    2. Compute the bounds of a time window between the \"last scheduled occurrence\" (yesterday at 8am) until the \"current occurrence\" (today at 8am)\n    3. Verify that the target event has occurred within the CRON-interval window.\n    4. If the target event has occurred within the time window, then assertion passes.\n    5. If the target event has not occurred within the time window, then the assertion fails.\n*/CRON/**A fixed interval which is used to compute a look-back window for use when evaluating the assertion relative\nto the Evaluation Time of the Assertion.\n\nTo compute the valid look-back window, we subtract the fixed interval from the evaluation time. Then, we verify\nthat the target event has occurred within that window.\n\nFor example, a fixed interval of \"24h\" would represent a schedule of \"in the last 24 hours\".\nThe 24 hour interval is relative to the evaluation time of the assertion. For example if we schedule the assertion\nto be evaluated each hour, we'd compute the result as follows:\n\n    1. Subtract the fixed interval from the current time (Evaluation time) to compute the bounds of a fixed look-back window.\n    2. Verify that the target event has occurred within the look-back window.\n    3. If the target event has occurred within the time window, then assertion passes.\n    4. If the target event has not occurred within the time window, then the assertion fails.\n*/FIXED_INTERVAL/**A stateful check that takes the last time this check ran to determine the look-back window.\n\nTo compute the valid look-back- window, we start at the time the monitor last evaluated this assertion,\nand we end at the point in time the check is currently running.\n\nFor example, let's say a Freshness assertion is of type SINCE_THE_LAST_CHECK, and the monitor is configured to\nrun every day at 12:00am. Let's assume this assertion was last evaluated yesterday at 12:04am. We'd compute\nthe result as follows:\n\n    1. Get the timestamp for the last run of the monitor on this assertion.\n    2. look_back_window_start_time = latest_monitor_run.timestampMillis [ie. 12:04a yesterday]\n    3. look_back_window_end_time = nowMillis [ie. 12:02a today]\n    4. If the target event has occurred within the window [ie. 12:04a yday to 12:02a today],\n       then the assertion passes.\n    5. If the target event has not occurred within the window, then the assertion fails.\n*/SINCE_THE_LAST_CHECK}/**A cron schedule. This field is required when type is CRON.*/cron:optional/**Attributes defining a CRON-formatted schedule used for defining a freshness assertion.*/record FreshnessCronSchedule{/**A cron-formatted execution interval, as a cron string, e.g. 1 * * * **/cron:string/**Timezone in which the cron interval applies, e.g. America/Los Angeles*/timezone:string/**An optional offset in milliseconds to SUBTRACT from the timestamp generated by the cron schedule\nto generate the lower bounds of the \"freshness window\", or the window of time in which an event must have occurred in order for the Freshness check\nto be considering passing.\n\nIf left empty, the start of the SLA window will be the _end_ of the previously evaluated Freshness window.*/windowStartOffsetMs:optional long}/**A fixed interval schedule. This field is required when type is FIXED_INTERVAL.*/fixedInterval:optional/**Attributes defining a relative fixed interval SLA schedule.*/record FixedIntervalSchedule includes{namespace com.linkedin.timeseries/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}}{}}", SchemaFormatType.PDL));
    private FreshnessAssertionScheduleType _typeField = null;
    private FreshnessCronSchedule _cronField = null;
    private FixedIntervalSchedule _fixedIntervalField = null;
    private FreshnessAssertionSchedule.ChangeListener __changeListener = new FreshnessAssertionSchedule.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Cron = SCHEMA.getField("cron");
    private final static RecordDataSchema.Field FIELD_FixedInterval = SCHEMA.getField("fixedInterval");

    public FreshnessAssertionSchedule() {
        super(new DataMap(4, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public FreshnessAssertionSchedule(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FreshnessAssertionSchedule.Fields fields() {
        return _fields;
    }

    public static FreshnessAssertionSchedule.ProjectionMask createMask() {
        return new FreshnessAssertionSchedule.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see FreshnessAssertionSchedule.Fields#type
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
     * @see FreshnessAssertionSchedule.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see FreshnessAssertionSchedule.Fields#type
     */
    @Nullable
    public FreshnessAssertionScheduleType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FreshnessAssertionScheduleType.class, FreshnessAssertionScheduleType.$UNKNOWN);
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
     * @see FreshnessAssertionSchedule.Fields#type
     */
    @Nonnull
    public FreshnessAssertionScheduleType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FreshnessAssertionScheduleType.class, FreshnessAssertionScheduleType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see FreshnessAssertionSchedule.Fields#type
     */
    public FreshnessAssertionSchedule setType(
        @Nullable
        FreshnessAssertionScheduleType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.FreshnessAssertionSchedule");
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
     * @see FreshnessAssertionSchedule.Fields#type
     */
    public FreshnessAssertionSchedule setType(
        @Nonnull
        FreshnessAssertionScheduleType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.FreshnessAssertionSchedule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for cron
     * 
     * @see FreshnessAssertionSchedule.Fields#cron
     */
    public boolean hasCron() {
        if (_cronField!= null) {
            return true;
        }
        return super._map.containsKey("cron");
    }

    /**
     * Remover for cron
     * 
     * @see FreshnessAssertionSchedule.Fields#cron
     */
    public void removeCron() {
        super._map.remove("cron");
    }

    /**
     * Getter for cron
     * 
     * @see FreshnessAssertionSchedule.Fields#cron
     */
    @Nullable
    public FreshnessCronSchedule getCron(GetMode mode) {
        return getCron();
    }

    /**
     * Getter for cron
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FreshnessAssertionSchedule.Fields#cron
     */
    @Nullable
    public FreshnessCronSchedule getCron() {
        if (_cronField!= null) {
            return _cronField;
        } else {
            Object __rawValue = super._map.get("cron");
            _cronField = ((__rawValue == null)?null:new FreshnessCronSchedule(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _cronField;
        }
    }

    /**
     * Setter for cron
     * 
     * @see FreshnessAssertionSchedule.Fields#cron
     */
    public FreshnessAssertionSchedule setCron(
        @Nullable
        FreshnessCronSchedule value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setCron(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeCron();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "cron", value.data());
                    _cronField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "cron", value.data());
                    _cronField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for cron
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FreshnessAssertionSchedule.Fields#cron
     */
    public FreshnessAssertionSchedule setCron(
        @Nonnull
        FreshnessCronSchedule value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field cron of com.linkedin.assertion.FreshnessAssertionSchedule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "cron", value.data());
            _cronField = value;
        }
        return this;
    }

    /**
     * Existence checker for fixedInterval
     * 
     * @see FreshnessAssertionSchedule.Fields#fixedInterval
     */
    public boolean hasFixedInterval() {
        if (_fixedIntervalField!= null) {
            return true;
        }
        return super._map.containsKey("fixedInterval");
    }

    /**
     * Remover for fixedInterval
     * 
     * @see FreshnessAssertionSchedule.Fields#fixedInterval
     */
    public void removeFixedInterval() {
        super._map.remove("fixedInterval");
    }

    /**
     * Getter for fixedInterval
     * 
     * @see FreshnessAssertionSchedule.Fields#fixedInterval
     */
    @Nullable
    public FixedIntervalSchedule getFixedInterval(GetMode mode) {
        return getFixedInterval();
    }

    /**
     * Getter for fixedInterval
     * 
     * @return
     *     Optional field. Always check for null.
     * @see FreshnessAssertionSchedule.Fields#fixedInterval
     */
    @Nullable
    public FixedIntervalSchedule getFixedInterval() {
        if (_fixedIntervalField!= null) {
            return _fixedIntervalField;
        } else {
            Object __rawValue = super._map.get("fixedInterval");
            _fixedIntervalField = ((__rawValue == null)?null:new FixedIntervalSchedule(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _fixedIntervalField;
        }
    }

    /**
     * Setter for fixedInterval
     * 
     * @see FreshnessAssertionSchedule.Fields#fixedInterval
     */
    public FreshnessAssertionSchedule setFixedInterval(
        @Nullable
        FixedIntervalSchedule value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setFixedInterval(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeFixedInterval();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "fixedInterval", value.data());
                    _fixedIntervalField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "fixedInterval", value.data());
                    _fixedIntervalField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for fixedInterval
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FreshnessAssertionSchedule.Fields#fixedInterval
     */
    public FreshnessAssertionSchedule setFixedInterval(
        @Nonnull
        FixedIntervalSchedule value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field fixedInterval of com.linkedin.assertion.FreshnessAssertionSchedule to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "fixedInterval", value.data());
            _fixedIntervalField = value;
        }
        return this;
    }

    @Override
    public FreshnessAssertionSchedule clone()
        throws CloneNotSupportedException
    {
        FreshnessAssertionSchedule __clone = ((FreshnessAssertionSchedule) super.clone());
        __clone.__changeListener = new FreshnessAssertionSchedule.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FreshnessAssertionSchedule copy()
        throws CloneNotSupportedException
    {
        FreshnessAssertionSchedule __copy = ((FreshnessAssertionSchedule) super.copy());
        __copy._cronField = null;
        __copy._typeField = null;
        __copy._fixedIntervalField = null;
        __copy.__changeListener = new FreshnessAssertionSchedule.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FreshnessAssertionSchedule __objectRef;

        private ChangeListener(FreshnessAssertionSchedule reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "cron":
                    __objectRef._cronField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "fixedInterval":
                    __objectRef._fixedIntervalField = null;
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
         * The type of a Freshness Assertion Schedule.
         * 
         * Once we support data-time-relative schedules (e.g. schedules relative to time partitions),
         * we will add those schedule types here.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * A cron schedule. This field is required when type is CRON.
         * 
         */
        public com.linkedin.assertion.FreshnessCronSchedule.Fields cron() {
            return new com.linkedin.assertion.FreshnessCronSchedule.Fields(getPathComponents(), "cron");
        }

        /**
         * A fixed interval schedule. This field is required when type is FIXED_INTERVAL.
         * 
         */
        public com.linkedin.assertion.FixedIntervalSchedule.Fields fixedInterval() {
            return new com.linkedin.assertion.FixedIntervalSchedule.Fields(getPathComponents(), "fixedInterval");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.assertion.FreshnessCronSchedule.ProjectionMask _cronMask;
        private com.linkedin.assertion.FixedIntervalSchedule.ProjectionMask _fixedIntervalMask;

        ProjectionMask() {
            super(4);
        }

        /**
         * The type of a Freshness Assertion Schedule.
         * 
         * Once we support data-time-relative schedules (e.g. schedules relative to time partitions),
         * we will add those schedule types here.
         * 
         */
        public FreshnessAssertionSchedule.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A cron schedule. This field is required when type is CRON.
         * 
         */
        public FreshnessAssertionSchedule.ProjectionMask withCron(Function<com.linkedin.assertion.FreshnessCronSchedule.ProjectionMask, com.linkedin.assertion.FreshnessCronSchedule.ProjectionMask> nestedMask) {
            _cronMask = nestedMask.apply(((_cronMask == null)?FreshnessCronSchedule.createMask():_cronMask));
            getDataMap().put("cron", _cronMask.getDataMap());
            return this;
        }

        /**
         * A cron schedule. This field is required when type is CRON.
         * 
         */
        public FreshnessAssertionSchedule.ProjectionMask withCron() {
            _cronMask = null;
            getDataMap().put("cron", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A fixed interval schedule. This field is required when type is FIXED_INTERVAL.
         * 
         */
        public FreshnessAssertionSchedule.ProjectionMask withFixedInterval(Function<com.linkedin.assertion.FixedIntervalSchedule.ProjectionMask, com.linkedin.assertion.FixedIntervalSchedule.ProjectionMask> nestedMask) {
            _fixedIntervalMask = nestedMask.apply(((_fixedIntervalMask == null)?FixedIntervalSchedule.createMask():_fixedIntervalMask));
            getDataMap().put("fixedInterval", _fixedIntervalMask.getDataMap());
            return this;
        }

        /**
         * A fixed interval schedule. This field is required when type is FIXED_INTERVAL.
         * 
         */
        public FreshnessAssertionSchedule.ProjectionMask withFixedInterval() {
            _fixedIntervalMask = null;
            getDataMap().put("fixedInterval", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
