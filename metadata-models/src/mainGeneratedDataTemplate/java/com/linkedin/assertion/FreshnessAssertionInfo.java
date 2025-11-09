
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
 * Attributes defining a Freshness Assertion.
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/FreshnessAssertionInfo.pdl.")
public class FreshnessAssertionInfo
    extends RecordTemplate
{

    private final static FreshnessAssertionInfo.Fields _fields = new FreshnessAssertionInfo.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**Attributes defining a Freshness Assertion.\n*/record FreshnessAssertionInfo{/**The type of the freshness assertion being monitored.*/@Searchable={}type:enum FreshnessAssertionType{/**An Freshness based on Operations performed on a particular Dataset (insert, update, delete, etc) and sourced from an audit log, as\nopposed to based on the highest watermark in a timestamp column (e.g. a query). Only valid when entity is of type \"dataset\".*/DATASET_CHANGE/**An Freshness based on a successful execution of a Data Job.*/DATA_JOB_RUN}/**The entity targeted by this Freshness check.*/@Relationship={\"entityTypes\":[\"dataset\",\"dataJob\"],\"name\":\"Asserts\"}@Searchable.fieldType=\"URN\"entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Produce FAILURE Assertion Result if the asset is not updated on the cadence and within the time range described by the schedule.*/@Searchable.`/type`.fieldName=\"scheduleType\"schedule:/**Attributes defining a single Freshness schedule.*/record FreshnessAssertionSchedule{/**The type of a Freshness Assertion Schedule.\n\nOnce we support data-time-relative schedules (e.g. schedules relative to time partitions),\nwe will add those schedule types here.*/type:enum FreshnessAssertionScheduleType{/**A highly configurable recurring schedule which describes the times of events described\nby a CRON schedule, with the evaluation schedule assuming to be matching the cron schedule.\n\nIn a CRON schedule type, we compute the look-back window to be the time between the last scheduled event\nand the current event (evaluation time). This means that the evaluation schedule must match exactly\nthe schedule defined inside the cron schedule.\n\nFor example, a CRON schedule defined as \"0 8 * * *\" would represent a schedule of \"every day by 8am\". Assuming\nthat the assertion evaluation schedule is defined to match this, the freshness assertion would be evaluated in the following way:\n\n    1. Compute the \"last scheduled occurrence\" of the event using the CRON schedule. For example, yesterday at 8am.\n    2. Compute the bounds of a time window between the \"last scheduled occurrence\" (yesterday at 8am) until the \"current occurrence\" (today at 8am)\n    3. Verify that the target event has occurred within the CRON-interval window.\n    4. If the target event has occurred within the time window, then assertion passes.\n    5. If the target event has not occurred within the time window, then the assertion fails.\n*/CRON/**A fixed interval which is used to compute a look-back window for use when evaluating the assertion relative\nto the Evaluation Time of the Assertion.\n\nTo compute the valid look-back window, we subtract the fixed interval from the evaluation time. Then, we verify\nthat the target event has occurred within that window.\n\nFor example, a fixed interval of \"24h\" would represent a schedule of \"in the last 24 hours\".\nThe 24 hour interval is relative to the evaluation time of the assertion. For example if we schedule the assertion\nto be evaluated each hour, we'd compute the result as follows:\n\n    1. Subtract the fixed interval from the current time (Evaluation time) to compute the bounds of a fixed look-back window.\n    2. Verify that the target event has occurred within the look-back window.\n    3. If the target event has occurred within the time window, then assertion passes.\n    4. If the target event has not occurred within the time window, then the assertion fails.\n*/FIXED_INTERVAL/**A stateful check that takes the last time this check ran to determine the look-back window.\n\nTo compute the valid look-back- window, we start at the time the monitor last evaluated this assertion,\nand we end at the point in time the check is currently running.\n\nFor example, let's say a Freshness assertion is of type SINCE_THE_LAST_CHECK, and the monitor is configured to\nrun every day at 12:00am. Let's assume this assertion was last evaluated yesterday at 12:04am. We'd compute\nthe result as follows:\n\n    1. Get the timestamp for the last run of the monitor on this assertion.\n    2. look_back_window_start_time = latest_monitor_run.timestampMillis [ie. 12:04a yesterday]\n    3. look_back_window_end_time = nowMillis [ie. 12:02a today]\n    4. If the target event has occurred within the window [ie. 12:04a yday to 12:02a today],\n       then the assertion passes.\n    5. If the target event has not occurred within the window, then the assertion fails.\n*/SINCE_THE_LAST_CHECK}/**A cron schedule. This field is required when type is CRON.*/cron:optional/**Attributes defining a CRON-formatted schedule used for defining a freshness assertion.*/record FreshnessCronSchedule{/**A cron-formatted execution interval, as a cron string, e.g. 1 * * * **/cron:string/**Timezone in which the cron interval applies, e.g. America/Los Angeles*/timezone:string/**An optional offset in milliseconds to SUBTRACT from the timestamp generated by the cron schedule\nto generate the lower bounds of the \"freshness window\", or the window of time in which an event must have occurred in order for the Freshness check\nto be considering passing.\n\nIf left empty, the start of the SLA window will be the _end_ of the previously evaluated Freshness window.*/windowStartOffsetMs:optional long}/**A fixed interval schedule. This field is required when type is FIXED_INTERVAL.*/fixedInterval:optional/**Attributes defining a relative fixed interval SLA schedule.*/record FixedIntervalSchedule includes{namespace com.linkedin.timeseries/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}}{}}/**A definition of the specific filters that should be applied, when performing monitoring.\nIf not provided, there is no filter, and the full table is under consideration.*/filter:optional{namespace com.linkedin.dataset/**A definition of filters that should be used when\nquerying an external Dataset or Table.\n\nNote that this models should NOT be used for working with\nsearch / filter on DataHub Platform itself.*/record DatasetFilter{/**How the partition will be represented in this model.\n\nIn the future, we'll likely add support for more structured\npredicates.*/type:enum DatasetFilterType{/**The partition is represented as a an opaque, raw SQL\nclause.*/SQL}/**The raw where clause string which will be used for monitoring.\nRequired if the type is SQL.*/sql:optional string}}}", SchemaFormatType.PDL));
    private FreshnessAssertionType _typeField = null;
    private com.linkedin.common.urn.Urn _entityField = null;
    private FreshnessAssertionSchedule _scheduleField = null;
    private DatasetFilter _filterField = null;
    private FreshnessAssertionInfo.ChangeListener __changeListener = new FreshnessAssertionInfo.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Entity = SCHEMA.getField("entity");
    private final static RecordDataSchema.Field FIELD_Schedule = SCHEMA.getField("schedule");
    private final static RecordDataSchema.Field FIELD_Filter = SCHEMA.getField("filter");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public FreshnessAssertionInfo() {
        super(new DataMap(6, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public FreshnessAssertionInfo(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static FreshnessAssertionInfo.Fields fields() {
        return _fields;
    }

    public static FreshnessAssertionInfo.ProjectionMask createMask() {
        return new FreshnessAssertionInfo.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see FreshnessAssertionInfo.Fields#type
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
     * @see FreshnessAssertionInfo.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see FreshnessAssertionInfo.Fields#type
     */
    @Nullable
    public FreshnessAssertionType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FreshnessAssertionType.class, FreshnessAssertionType.$UNKNOWN);
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
     * @see FreshnessAssertionInfo.Fields#type
     */
    @Nonnull
    public FreshnessAssertionType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, FreshnessAssertionType.class, FreshnessAssertionType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see FreshnessAssertionInfo.Fields#type
     */
    public FreshnessAssertionInfo setType(
        @Nullable
        FreshnessAssertionType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.assertion.FreshnessAssertionInfo");
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
     * @see FreshnessAssertionInfo.Fields#type
     */
    public FreshnessAssertionInfo setType(
        @Nonnull
        FreshnessAssertionType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.assertion.FreshnessAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for entity
     * 
     * @see FreshnessAssertionInfo.Fields#entity
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
     * @see FreshnessAssertionInfo.Fields#entity
     */
    public void removeEntity() {
        super._map.remove("entity");
    }

    /**
     * Getter for entity
     * 
     * @see FreshnessAssertionInfo.Fields#entity
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
     * @see FreshnessAssertionInfo.Fields#entity
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
     * @see FreshnessAssertionInfo.Fields#entity
     */
    public FreshnessAssertionInfo setEntity(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setEntity(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field entity of com.linkedin.assertion.FreshnessAssertionInfo");
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
     * @see FreshnessAssertionInfo.Fields#entity
     */
    public FreshnessAssertionInfo setEntity(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field entity of com.linkedin.assertion.FreshnessAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "entity", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _entityField = value;
        }
        return this;
    }

    /**
     * Existence checker for schedule
     * 
     * @see FreshnessAssertionInfo.Fields#schedule
     */
    public boolean hasSchedule() {
        if (_scheduleField!= null) {
            return true;
        }
        return super._map.containsKey("schedule");
    }

    /**
     * Remover for schedule
     * 
     * @see FreshnessAssertionInfo.Fields#schedule
     */
    public void removeSchedule() {
        super._map.remove("schedule");
    }

    /**
     * Getter for schedule
     * 
     * @see FreshnessAssertionInfo.Fields#schedule
     */
    @Nullable
    public FreshnessAssertionSchedule getSchedule(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getSchedule();
            case DEFAULT:
            case NULL:
                if (_scheduleField!= null) {
                    return _scheduleField;
                } else {
                    Object __rawValue = super._map.get("schedule");
                    _scheduleField = ((__rawValue == null)?null:new FreshnessAssertionSchedule(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _scheduleField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for schedule
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see FreshnessAssertionInfo.Fields#schedule
     */
    @Nonnull
    public FreshnessAssertionSchedule getSchedule() {
        if (_scheduleField!= null) {
            return _scheduleField;
        } else {
            Object __rawValue = super._map.get("schedule");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("schedule");
            }
            _scheduleField = ((__rawValue == null)?null:new FreshnessAssertionSchedule(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _scheduleField;
        }
    }

    /**
     * Setter for schedule
     * 
     * @see FreshnessAssertionInfo.Fields#schedule
     */
    public FreshnessAssertionInfo setSchedule(
        @Nullable
        FreshnessAssertionSchedule value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setSchedule(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field schedule of com.linkedin.assertion.FreshnessAssertionInfo");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schedule", value.data());
                    _scheduleField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeSchedule();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "schedule", value.data());
                    _scheduleField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "schedule", value.data());
                    _scheduleField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for schedule
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see FreshnessAssertionInfo.Fields#schedule
     */
    public FreshnessAssertionInfo setSchedule(
        @Nonnull
        FreshnessAssertionSchedule value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field schedule of com.linkedin.assertion.FreshnessAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "schedule", value.data());
            _scheduleField = value;
        }
        return this;
    }

    /**
     * Existence checker for filter
     * 
     * @see FreshnessAssertionInfo.Fields#filter
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
     * @see FreshnessAssertionInfo.Fields#filter
     */
    public void removeFilter() {
        super._map.remove("filter");
    }

    /**
     * Getter for filter
     * 
     * @see FreshnessAssertionInfo.Fields#filter
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
     * @see FreshnessAssertionInfo.Fields#filter
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
     * @see FreshnessAssertionInfo.Fields#filter
     */
    public FreshnessAssertionInfo setFilter(
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
     * @see FreshnessAssertionInfo.Fields#filter
     */
    public FreshnessAssertionInfo setFilter(
        @Nonnull
        DatasetFilter value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field filter of com.linkedin.assertion.FreshnessAssertionInfo to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "filter", value.data());
            _filterField = value;
        }
        return this;
    }

    @Override
    public FreshnessAssertionInfo clone()
        throws CloneNotSupportedException
    {
        FreshnessAssertionInfo __clone = ((FreshnessAssertionInfo) super.clone());
        __clone.__changeListener = new FreshnessAssertionInfo.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public FreshnessAssertionInfo copy()
        throws CloneNotSupportedException
    {
        FreshnessAssertionInfo __copy = ((FreshnessAssertionInfo) super.copy());
        __copy._filterField = null;
        __copy._scheduleField = null;
        __copy._typeField = null;
        __copy._entityField = null;
        __copy.__changeListener = new FreshnessAssertionInfo.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final FreshnessAssertionInfo __objectRef;

        private ChangeListener(FreshnessAssertionInfo reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "filter":
                    __objectRef._filterField = null;
                    break;
                case "schedule":
                    __objectRef._scheduleField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "entity":
                    __objectRef._entityField = null;
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
         * The type of the freshness assertion being monitored.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * The entity targeted by this Freshness check.
         * 
         */
        public PathSpec entity() {
            return new PathSpec(getPathComponents(), "entity");
        }

        /**
         * Produce FAILURE Assertion Result if the asset is not updated on the cadence and within the time range described by the schedule.
         * 
         */
        public com.linkedin.assertion.FreshnessAssertionSchedule.Fields schedule() {
            return new com.linkedin.assertion.FreshnessAssertionSchedule.Fields(getPathComponents(), "schedule");
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

        private com.linkedin.assertion.FreshnessAssertionSchedule.ProjectionMask _scheduleMask;
        private com.linkedin.dataset.DatasetFilter.ProjectionMask _filterMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * The type of the freshness assertion being monitored.
         * 
         */
        public FreshnessAssertionInfo.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * The entity targeted by this Freshness check.
         * 
         */
        public FreshnessAssertionInfo.ProjectionMask withEntity() {
            getDataMap().put("entity", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the asset is not updated on the cadence and within the time range described by the schedule.
         * 
         */
        public FreshnessAssertionInfo.ProjectionMask withSchedule(Function<com.linkedin.assertion.FreshnessAssertionSchedule.ProjectionMask, com.linkedin.assertion.FreshnessAssertionSchedule.ProjectionMask> nestedMask) {
            _scheduleMask = nestedMask.apply(((_scheduleMask == null)?FreshnessAssertionSchedule.createMask():_scheduleMask));
            getDataMap().put("schedule", _scheduleMask.getDataMap());
            return this;
        }

        /**
         * Produce FAILURE Assertion Result if the asset is not updated on the cadence and within the time range described by the schedule.
         * 
         */
        public FreshnessAssertionInfo.ProjectionMask withSchedule() {
            _scheduleMask = null;
            getDataMap().put("schedule", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * A definition of the specific filters that should be applied, when performing monitoring.
         * If not provided, there is no filter, and the full table is under consideration.
         * 
         */
        public FreshnessAssertionInfo.ProjectionMask withFilter(Function<com.linkedin.dataset.DatasetFilter.ProjectionMask, com.linkedin.dataset.DatasetFilter.ProjectionMask> nestedMask) {
            _filterMask = nestedMask.apply(((_filterMask == null)?DatasetFilter.createMask():_filterMask));
            getDataMap().put("filter", _filterMask.getDataMap());
            return this;
        }

        /**
         * A definition of the specific filters that should be applied, when performing monitoring.
         * If not provided, there is no filter, and the full table is under consideration.
         * 
         */
        public FreshnessAssertionInfo.ProjectionMask withFilter() {
            _filterMask = null;
            getDataMap().put("filter", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
