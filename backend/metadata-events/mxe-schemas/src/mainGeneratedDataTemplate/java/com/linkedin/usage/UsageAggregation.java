
package com.linkedin.usage;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.common.WindowDuration;
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


/**
 * Usage data for a given resource, rolled up into a bucket.
 * 
 * @deprecated
 *     Use DatasetUsageStatistics, or other UsageStatistics records, instead
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageAggregation.pdl.")
@Deprecated
public class UsageAggregation
    extends RecordTemplate
{

    private final static UsageAggregation.Fields _fields = new UsageAggregation.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage/**Usage data for a given resource, rolled up into a bucket.*/@deprecated=\"Use DatasetUsageStatistics, or other UsageStatistics records, instead\"record UsageAggregation{/** Bucket start time in milliseconds */bucket:long/** Bucket duration */duration:{namespace com.linkedin.common/**Enum to define the length of a bucket when doing aggregations*/enum WindowDuration{YEAR,MONTH,WEEK,DAY,HOUR}}/** Resource associated with these usage stats */resource:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/** Metrics associated with this bucket */metrics:/**Metrics for usage data for a given resource and bucket. Not all fields\nmake sense for all buckets, so every field is optional.*/record UsageAggregationMetrics{/** Unique user count */uniqueUserCount:optional int/** Users within this bucket, with frequency counts */users:optional array[/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional com.linkedin.common.Urn,count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}]/** Total SQL query count */totalSqlQueries:optional int/** Frequent SQL queries; mostly makes sense for datasets in SQL databases */topSqlQueries:optional array[string]/** Field-level usage stats */fields:optional array[/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}]}}", SchemaFormatType.PDL));
    private Long _bucketField = null;
    private WindowDuration _durationField = null;
    private com.linkedin.common.urn.Urn _resourceField = null;
    private UsageAggregationMetrics _metricsField = null;
    private UsageAggregation.ChangeListener __changeListener = new UsageAggregation.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Bucket = SCHEMA.getField("bucket");
    private final static RecordDataSchema.Field FIELD_Duration = SCHEMA.getField("duration");
    private final static RecordDataSchema.Field FIELD_Resource = SCHEMA.getField("resource");
    private final static RecordDataSchema.Field FIELD_Metrics = SCHEMA.getField("metrics");

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.Urn.class);
    }

    public UsageAggregation() {
        super(new DataMap(6, 0.75F), SCHEMA, 2);
        addChangeListener(__changeListener);
    }

    public UsageAggregation(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UsageAggregation.Fields fields() {
        return _fields;
    }

    public static UsageAggregation.ProjectionMask createMask() {
        return new UsageAggregation.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for bucket
     * 
     * @see UsageAggregation.Fields#bucket
     */
    public boolean hasBucket() {
        if (_bucketField!= null) {
            return true;
        }
        return super._map.containsKey("bucket");
    }

    /**
     * Remover for bucket
     * 
     * @see UsageAggregation.Fields#bucket
     */
    public void removeBucket() {
        super._map.remove("bucket");
    }

    /**
     * Getter for bucket
     * 
     * @see UsageAggregation.Fields#bucket
     */
    @Nullable
    public Long getBucket(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getBucket();
            case DEFAULT:
            case NULL:
                if (_bucketField!= null) {
                    return _bucketField;
                } else {
                    Object __rawValue = super._map.get("bucket");
                    _bucketField = DataTemplateUtil.coerceLongOutput(__rawValue);
                    return _bucketField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for bucket
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UsageAggregation.Fields#bucket
     */
    @Nonnull
    public Long getBucket() {
        if (_bucketField!= null) {
            return _bucketField;
        } else {
            Object __rawValue = super._map.get("bucket");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("bucket");
            }
            _bucketField = DataTemplateUtil.coerceLongOutput(__rawValue);
            return _bucketField;
        }
    }

    /**
     * Setter for bucket
     * 
     * @see UsageAggregation.Fields#bucket
     */
    public UsageAggregation setBucket(
        @Nullable
        Long value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBucket(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field bucket of com.linkedin.usage.UsageAggregation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "bucket", DataTemplateUtil.coerceLongInput(value));
                    _bucketField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBucket();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "bucket", DataTemplateUtil.coerceLongInput(value));
                    _bucketField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "bucket", DataTemplateUtil.coerceLongInput(value));
                    _bucketField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for bucket
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregation.Fields#bucket
     */
    public UsageAggregation setBucket(
        @Nonnull
        Long value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field bucket of com.linkedin.usage.UsageAggregation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "bucket", DataTemplateUtil.coerceLongInput(value));
            _bucketField = value;
        }
        return this;
    }

    /**
     * Setter for bucket
     * 
     * @see UsageAggregation.Fields#bucket
     */
    public UsageAggregation setBucket(long value) {
        CheckedUtil.putWithoutChecking(super._map, "bucket", DataTemplateUtil.coerceLongInput(value));
        _bucketField = value;
        return this;
    }

    /**
     * Existence checker for duration
     * 
     * @see UsageAggregation.Fields#duration
     */
    public boolean hasDuration() {
        if (_durationField!= null) {
            return true;
        }
        return super._map.containsKey("duration");
    }

    /**
     * Remover for duration
     * 
     * @see UsageAggregation.Fields#duration
     */
    public void removeDuration() {
        super._map.remove("duration");
    }

    /**
     * Getter for duration
     * 
     * @see UsageAggregation.Fields#duration
     */
    @Nullable
    public WindowDuration getDuration(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getDuration();
            case DEFAULT:
            case NULL:
                if (_durationField!= null) {
                    return _durationField;
                } else {
                    Object __rawValue = super._map.get("duration");
                    _durationField = DataTemplateUtil.coerceEnumOutput(__rawValue, WindowDuration.class, WindowDuration.$UNKNOWN);
                    return _durationField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for duration
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UsageAggregation.Fields#duration
     */
    @Nonnull
    public WindowDuration getDuration() {
        if (_durationField!= null) {
            return _durationField;
        } else {
            Object __rawValue = super._map.get("duration");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("duration");
            }
            _durationField = DataTemplateUtil.coerceEnumOutput(__rawValue, WindowDuration.class, WindowDuration.$UNKNOWN);
            return _durationField;
        }
    }

    /**
     * Setter for duration
     * 
     * @see UsageAggregation.Fields#duration
     */
    public UsageAggregation setDuration(
        @Nullable
        WindowDuration value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setDuration(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field duration of com.linkedin.usage.UsageAggregation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "duration", value.name());
                    _durationField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeDuration();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "duration", value.name());
                    _durationField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "duration", value.name());
                    _durationField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for duration
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregation.Fields#duration
     */
    public UsageAggregation setDuration(
        @Nonnull
        WindowDuration value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field duration of com.linkedin.usage.UsageAggregation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "duration", value.name());
            _durationField = value;
        }
        return this;
    }

    /**
     * Existence checker for resource
     * 
     * @see UsageAggregation.Fields#resource
     */
    public boolean hasResource() {
        if (_resourceField!= null) {
            return true;
        }
        return super._map.containsKey("resource");
    }

    /**
     * Remover for resource
     * 
     * @see UsageAggregation.Fields#resource
     */
    public void removeResource() {
        super._map.remove("resource");
    }

    /**
     * Getter for resource
     * 
     * @see UsageAggregation.Fields#resource
     */
    @Nullable
    public com.linkedin.common.urn.Urn getResource(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getResource();
            case DEFAULT:
            case NULL:
                if (_resourceField!= null) {
                    return _resourceField;
                } else {
                    Object __rawValue = super._map.get("resource");
                    _resourceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
                    return _resourceField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for resource
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UsageAggregation.Fields#resource
     */
    @Nonnull
    public com.linkedin.common.urn.Urn getResource() {
        if (_resourceField!= null) {
            return _resourceField;
        } else {
            Object __rawValue = super._map.get("resource");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("resource");
            }
            _resourceField = DataTemplateUtil.coerceCustomOutput(__rawValue, com.linkedin.common.urn.Urn.class);
            return _resourceField;
        }
    }

    /**
     * Setter for resource
     * 
     * @see UsageAggregation.Fields#resource
     */
    public UsageAggregation setResource(
        @Nullable
        com.linkedin.common.urn.Urn value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setResource(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field resource of com.linkedin.usage.UsageAggregation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _resourceField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeResource();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "resource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _resourceField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "resource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
                    _resourceField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for resource
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregation.Fields#resource
     */
    public UsageAggregation setResource(
        @Nonnull
        com.linkedin.common.urn.Urn value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field resource of com.linkedin.usage.UsageAggregation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "resource", DataTemplateUtil.coerceCustomInput(value, com.linkedin.common.urn.Urn.class));
            _resourceField = value;
        }
        return this;
    }

    /**
     * Existence checker for metrics
     * 
     * @see UsageAggregation.Fields#metrics
     */
    public boolean hasMetrics() {
        if (_metricsField!= null) {
            return true;
        }
        return super._map.containsKey("metrics");
    }

    /**
     * Remover for metrics
     * 
     * @see UsageAggregation.Fields#metrics
     */
    public void removeMetrics() {
        super._map.remove("metrics");
    }

    /**
     * Getter for metrics
     * 
     * @see UsageAggregation.Fields#metrics
     */
    @Nullable
    public UsageAggregationMetrics getMetrics(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getMetrics();
            case DEFAULT:
            case NULL:
                if (_metricsField!= null) {
                    return _metricsField;
                } else {
                    Object __rawValue = super._map.get("metrics");
                    _metricsField = ((__rawValue == null)?null:new UsageAggregationMetrics(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _metricsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for metrics
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UsageAggregation.Fields#metrics
     */
    @Nonnull
    public UsageAggregationMetrics getMetrics() {
        if (_metricsField!= null) {
            return _metricsField;
        } else {
            Object __rawValue = super._map.get("metrics");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("metrics");
            }
            _metricsField = ((__rawValue == null)?null:new UsageAggregationMetrics(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _metricsField;
        }
    }

    /**
     * Setter for metrics
     * 
     * @see UsageAggregation.Fields#metrics
     */
    public UsageAggregation setMetrics(
        @Nullable
        UsageAggregationMetrics value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setMetrics(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field metrics of com.linkedin.usage.UsageAggregation");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metrics", value.data());
                    _metricsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeMetrics();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "metrics", value.data());
                    _metricsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "metrics", value.data());
                    _metricsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for metrics
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageAggregation.Fields#metrics
     */
    public UsageAggregation setMetrics(
        @Nonnull
        UsageAggregationMetrics value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field metrics of com.linkedin.usage.UsageAggregation to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "metrics", value.data());
            _metricsField = value;
        }
        return this;
    }

    @Override
    public UsageAggregation clone()
        throws CloneNotSupportedException
    {
        UsageAggregation __clone = ((UsageAggregation) super.clone());
        __clone.__changeListener = new UsageAggregation.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public UsageAggregation copy()
        throws CloneNotSupportedException
    {
        UsageAggregation __copy = ((UsageAggregation) super.copy());
        __copy._bucketField = null;
        __copy._durationField = null;
        __copy._resourceField = null;
        __copy._metricsField = null;
        __copy.__changeListener = new UsageAggregation.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final UsageAggregation __objectRef;

        private ChangeListener(UsageAggregation reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "bucket":
                    __objectRef._bucketField = null;
                    break;
                case "duration":
                    __objectRef._durationField = null;
                    break;
                case "resource":
                    __objectRef._resourceField = null;
                    break;
                case "metrics":
                    __objectRef._metricsField = null;
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
         *  Bucket start time in milliseconds 
         * 
         */
        public PathSpec bucket() {
            return new PathSpec(getPathComponents(), "bucket");
        }

        /**
         *  Bucket duration 
         * 
         */
        public PathSpec duration() {
            return new PathSpec(getPathComponents(), "duration");
        }

        /**
         *  Resource associated with these usage stats 
         * 
         */
        public PathSpec resource() {
            return new PathSpec(getPathComponents(), "resource");
        }

        /**
         *  Metrics associated with this bucket 
         * 
         */
        public com.linkedin.usage.UsageAggregationMetrics.Fields metrics() {
            return new com.linkedin.usage.UsageAggregationMetrics.Fields(getPathComponents(), "metrics");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.usage.UsageAggregationMetrics.ProjectionMask _metricsMask;

        ProjectionMask() {
            super(6);
        }

        /**
         *  Bucket start time in milliseconds 
         * 
         */
        public UsageAggregation.ProjectionMask withBucket() {
            getDataMap().put("bucket", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Bucket duration 
         * 
         */
        public UsageAggregation.ProjectionMask withDuration() {
            getDataMap().put("duration", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Resource associated with these usage stats 
         * 
         */
        public UsageAggregation.ProjectionMask withResource() {
            getDataMap().put("resource", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Metrics associated with this bucket 
         * 
         */
        public UsageAggregation.ProjectionMask withMetrics(Function<com.linkedin.usage.UsageAggregationMetrics.ProjectionMask, com.linkedin.usage.UsageAggregationMetrics.ProjectionMask> nestedMask) {
            _metricsMask = nestedMask.apply(((_metricsMask == null)?UsageAggregationMetrics.createMask():_metricsMask));
            getDataMap().put("metrics", _metricsMask.getDataMap());
            return this;
        }

        /**
         *  Metrics associated with this bucket 
         * 
         */
        public UsageAggregation.ProjectionMask withMetrics() {
            _metricsMask = null;
            getDataMap().put("metrics", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
