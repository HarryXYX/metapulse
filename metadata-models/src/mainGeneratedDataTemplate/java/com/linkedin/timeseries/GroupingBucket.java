
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
 * Defines the group by bucket definitions for time series requests.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/timeseries/GroupingBucket.pdl.")
public class GroupingBucket
    extends RecordTemplate
{

    private final static GroupingBucket.Fields _fields = new GroupingBucket.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.timeseries/**Defines the group by bucket definitions for time series requests.*/record GroupingBucket{/**Type of the grouping bucket.*/type:/**Defines a grouping bucket type.*/enum GroupingBucketType{DATE_GROUPING_BUCKET,STRING_GROUPING_BUCKET}/**Key that specifies the column name to be used as the timestamp field for bucketing.*/key:string/**Bucket size (like a day/hour etc) for the date grouping buckets.*/timeWindowSize:optional/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}/**Optional specified time zone to take into account when grouping by date*/timeZone:optional string}", SchemaFormatType.PDL));
    private GroupingBucketType _typeField = null;
    private String _keyField = null;
    private TimeWindowSize _timeWindowSizeField = null;
    private String _timeZoneField = null;
    private GroupingBucket.ChangeListener __changeListener = new GroupingBucket.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Type = SCHEMA.getField("type");
    private final static RecordDataSchema.Field FIELD_Key = SCHEMA.getField("key");
    private final static RecordDataSchema.Field FIELD_TimeWindowSize = SCHEMA.getField("timeWindowSize");
    private final static RecordDataSchema.Field FIELD_TimeZone = SCHEMA.getField("timeZone");

    public GroupingBucket() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public GroupingBucket(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static GroupingBucket.Fields fields() {
        return _fields;
    }

    public static GroupingBucket.ProjectionMask createMask() {
        return new GroupingBucket.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for type
     * 
     * @see GroupingBucket.Fields#type
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
     * @see GroupingBucket.Fields#type
     */
    public void removeType() {
        super._map.remove("type");
    }

    /**
     * Getter for type
     * 
     * @see GroupingBucket.Fields#type
     */
    @Nullable
    public GroupingBucketType getType(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getType();
            case DEFAULT:
            case NULL:
                if (_typeField!= null) {
                    return _typeField;
                } else {
                    Object __rawValue = super._map.get("type");
                    _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, GroupingBucketType.class, GroupingBucketType.$UNKNOWN);
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
     * @see GroupingBucket.Fields#type
     */
    @Nonnull
    public GroupingBucketType getType() {
        if (_typeField!= null) {
            return _typeField;
        } else {
            Object __rawValue = super._map.get("type");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("type");
            }
            _typeField = DataTemplateUtil.coerceEnumOutput(__rawValue, GroupingBucketType.class, GroupingBucketType.$UNKNOWN);
            return _typeField;
        }
    }

    /**
     * Setter for type
     * 
     * @see GroupingBucket.Fields#type
     */
    public GroupingBucket setType(
        @Nullable
        GroupingBucketType value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setType(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field type of com.linkedin.timeseries.GroupingBucket");
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
     * @see GroupingBucket.Fields#type
     */
    public GroupingBucket setType(
        @Nonnull
        GroupingBucketType value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field type of com.linkedin.timeseries.GroupingBucket to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "type", value.name());
            _typeField = value;
        }
        return this;
    }

    /**
     * Existence checker for key
     * 
     * @see GroupingBucket.Fields#key
     */
    public boolean hasKey() {
        if (_keyField!= null) {
            return true;
        }
        return super._map.containsKey("key");
    }

    /**
     * Remover for key
     * 
     * @see GroupingBucket.Fields#key
     */
    public void removeKey() {
        super._map.remove("key");
    }

    /**
     * Getter for key
     * 
     * @see GroupingBucket.Fields#key
     */
    @Nullable
    public String getKey(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getKey();
            case DEFAULT:
            case NULL:
                if (_keyField!= null) {
                    return _keyField;
                } else {
                    Object __rawValue = super._map.get("key");
                    _keyField = DataTemplateUtil.coerceStringOutput(__rawValue);
                    return _keyField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for key
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see GroupingBucket.Fields#key
     */
    @Nonnull
    public String getKey() {
        if (_keyField!= null) {
            return _keyField;
        } else {
            Object __rawValue = super._map.get("key");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("key");
            }
            _keyField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _keyField;
        }
    }

    /**
     * Setter for key
     * 
     * @see GroupingBucket.Fields#key
     */
    public GroupingBucket setKey(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setKey(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field key of com.linkedin.timeseries.GroupingBucket");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "key", value);
                    _keyField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeKey();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "key", value);
                    _keyField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "key", value);
                    _keyField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for key
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GroupingBucket.Fields#key
     */
    public GroupingBucket setKey(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field key of com.linkedin.timeseries.GroupingBucket to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "key", value);
            _keyField = value;
        }
        return this;
    }

    /**
     * Existence checker for timeWindowSize
     * 
     * @see GroupingBucket.Fields#timeWindowSize
     */
    public boolean hasTimeWindowSize() {
        if (_timeWindowSizeField!= null) {
            return true;
        }
        return super._map.containsKey("timeWindowSize");
    }

    /**
     * Remover for timeWindowSize
     * 
     * @see GroupingBucket.Fields#timeWindowSize
     */
    public void removeTimeWindowSize() {
        super._map.remove("timeWindowSize");
    }

    /**
     * Getter for timeWindowSize
     * 
     * @see GroupingBucket.Fields#timeWindowSize
     */
    @Nullable
    public TimeWindowSize getTimeWindowSize(GetMode mode) {
        return getTimeWindowSize();
    }

    /**
     * Getter for timeWindowSize
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GroupingBucket.Fields#timeWindowSize
     */
    @Nullable
    public TimeWindowSize getTimeWindowSize() {
        if (_timeWindowSizeField!= null) {
            return _timeWindowSizeField;
        } else {
            Object __rawValue = super._map.get("timeWindowSize");
            _timeWindowSizeField = ((__rawValue == null)?null:new TimeWindowSize(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _timeWindowSizeField;
        }
    }

    /**
     * Setter for timeWindowSize
     * 
     * @see GroupingBucket.Fields#timeWindowSize
     */
    public GroupingBucket setTimeWindowSize(
        @Nullable
        TimeWindowSize value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimeWindowSize(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTimeWindowSize();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timeWindowSize", value.data());
                    _timeWindowSizeField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "timeWindowSize", value.data());
                    _timeWindowSizeField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for timeWindowSize
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GroupingBucket.Fields#timeWindowSize
     */
    public GroupingBucket setTimeWindowSize(
        @Nonnull
        TimeWindowSize value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timeWindowSize of com.linkedin.timeseries.GroupingBucket to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timeWindowSize", value.data());
            _timeWindowSizeField = value;
        }
        return this;
    }

    /**
     * Existence checker for timeZone
     * 
     * @see GroupingBucket.Fields#timeZone
     */
    public boolean hasTimeZone() {
        if (_timeZoneField!= null) {
            return true;
        }
        return super._map.containsKey("timeZone");
    }

    /**
     * Remover for timeZone
     * 
     * @see GroupingBucket.Fields#timeZone
     */
    public void removeTimeZone() {
        super._map.remove("timeZone");
    }

    /**
     * Getter for timeZone
     * 
     * @see GroupingBucket.Fields#timeZone
     */
    @Nullable
    public String getTimeZone(GetMode mode) {
        return getTimeZone();
    }

    /**
     * Getter for timeZone
     * 
     * @return
     *     Optional field. Always check for null.
     * @see GroupingBucket.Fields#timeZone
     */
    @Nullable
    public String getTimeZone() {
        if (_timeZoneField!= null) {
            return _timeZoneField;
        } else {
            Object __rawValue = super._map.get("timeZone");
            _timeZoneField = DataTemplateUtil.coerceStringOutput(__rawValue);
            return _timeZoneField;
        }
    }

    /**
     * Setter for timeZone
     * 
     * @see GroupingBucket.Fields#timeZone
     */
    public GroupingBucket setTimeZone(
        @Nullable
        String value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setTimeZone(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeTimeZone();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "timeZone", value);
                    _timeZoneField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "timeZone", value);
                    _timeZoneField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for timeZone
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see GroupingBucket.Fields#timeZone
     */
    public GroupingBucket setTimeZone(
        @Nonnull
        String value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field timeZone of com.linkedin.timeseries.GroupingBucket to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "timeZone", value);
            _timeZoneField = value;
        }
        return this;
    }

    @Override
    public GroupingBucket clone()
        throws CloneNotSupportedException
    {
        GroupingBucket __clone = ((GroupingBucket) super.clone());
        __clone.__changeListener = new GroupingBucket.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public GroupingBucket copy()
        throws CloneNotSupportedException
    {
        GroupingBucket __copy = ((GroupingBucket) super.copy());
        __copy._timeZoneField = null;
        __copy._typeField = null;
        __copy._keyField = null;
        __copy._timeWindowSizeField = null;
        __copy.__changeListener = new GroupingBucket.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final GroupingBucket __objectRef;

        private ChangeListener(GroupingBucket reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "timeZone":
                    __objectRef._timeZoneField = null;
                    break;
                case "type":
                    __objectRef._typeField = null;
                    break;
                case "key":
                    __objectRef._keyField = null;
                    break;
                case "timeWindowSize":
                    __objectRef._timeWindowSizeField = null;
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
         * Type of the grouping bucket.
         * 
         */
        public PathSpec type() {
            return new PathSpec(getPathComponents(), "type");
        }

        /**
         * Key that specifies the column name to be used as the timestamp field for bucketing.
         * 
         */
        public PathSpec key() {
            return new PathSpec(getPathComponents(), "key");
        }

        /**
         * Bucket size (like a day/hour etc) for the date grouping buckets.
         * 
         */
        public com.linkedin.timeseries.TimeWindowSize.Fields timeWindowSize() {
            return new com.linkedin.timeseries.TimeWindowSize.Fields(getPathComponents(), "timeWindowSize");
        }

        /**
         * Optional specified time zone to take into account when grouping by date
         * 
         */
        public PathSpec timeZone() {
            return new PathSpec(getPathComponents(), "timeZone");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.timeseries.TimeWindowSize.ProjectionMask _timeWindowSizeMask;

        ProjectionMask() {
            super(6);
        }

        /**
         * Type of the grouping bucket.
         * 
         */
        public GroupingBucket.ProjectionMask withType() {
            getDataMap().put("type", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Key that specifies the column name to be used as the timestamp field for bucketing.
         * 
         */
        public GroupingBucket.ProjectionMask withKey() {
            getDataMap().put("key", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Bucket size (like a day/hour etc) for the date grouping buckets.
         * 
         */
        public GroupingBucket.ProjectionMask withTimeWindowSize(Function<com.linkedin.timeseries.TimeWindowSize.ProjectionMask, com.linkedin.timeseries.TimeWindowSize.ProjectionMask> nestedMask) {
            _timeWindowSizeMask = nestedMask.apply(((_timeWindowSizeMask == null)?TimeWindowSize.createMask():_timeWindowSizeMask));
            getDataMap().put("timeWindowSize", _timeWindowSizeMask.getDataMap());
            return this;
        }

        /**
         * Bucket size (like a day/hour etc) for the date grouping buckets.
         * 
         */
        public GroupingBucket.ProjectionMask withTimeWindowSize() {
            _timeWindowSizeMask = null;
            getDataMap().put("timeWindowSize", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         * Optional specified time zone to take into account when grouping by date
         * 
         */
        public GroupingBucket.ProjectionMask withTimeZone() {
            getDataMap().put("timeZone", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
