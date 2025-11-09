
package com.linkedin.usage;

import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.linkedin.data.DataList;
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
 * Results of a query for usage data.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageQueryResult.pdl.")
public class UsageQueryResult
    extends RecordTemplate
{

    private final static UsageQueryResult.Fields _fields = new UsageQueryResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.usage/**Results of a query for usage data.*/record UsageQueryResult{/** Raw buckets */buckets:optional array[/**Usage data for a given resource, rolled up into a bucket.*/@deprecated=\"Use DatasetUsageStatistics, or other UsageStatistics records, instead\"record UsageAggregation{/** Bucket start time in milliseconds */bucket:long/** Bucket duration */duration:{namespace com.linkedin.common/**Enum to define the length of a bucket when doing aggregations*/enum WindowDuration{YEAR,MONTH,WEEK,DAY,HOUR}}/** Resource associated with these usage stats */resource:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/** Metrics associated with this bucket */metrics:/**Metrics for usage data for a given resource and bucket. Not all fields\nmake sense for all buckets, so every field is optional.*/record UsageAggregationMetrics{/** Unique user count */uniqueUserCount:optional int/** Users within this bucket, with frequency counts */users:optional array[/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional com.linkedin.common.Urn,count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}]/** Total SQL query count */totalSqlQueries:optional int/** Frequent SQL queries; mostly makes sense for datasets in SQL databases */topSqlQueries:optional array[string]/** Field-level usage stats */fields:optional array[/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}]}}]/**Aggregated metrics. All fields are optional here, since they will be populated\nonly if the underlying buckets contain the data required to generate that aggregation.*/aggregations:record UsageQueryResultAggregations{uniqueUserCount:optional int,totalSqlQueries:optional int,users:optional array[UserUsageCounts]fields:optional array[FieldUsageCounts]}}", SchemaFormatType.PDL));
    private UsageAggregationArray _bucketsField = null;
    private UsageQueryResultAggregations _aggregationsField = null;
    private UsageQueryResult.ChangeListener __changeListener = new UsageQueryResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Buckets = SCHEMA.getField("buckets");
    private final static RecordDataSchema.Field FIELD_Aggregations = SCHEMA.getField("aggregations");

    public UsageQueryResult() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public UsageQueryResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static UsageQueryResult.Fields fields() {
        return _fields;
    }

    public static UsageQueryResult.ProjectionMask createMask() {
        return new UsageQueryResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for buckets
     * 
     * @see UsageQueryResult.Fields#buckets
     */
    public boolean hasBuckets() {
        if (_bucketsField!= null) {
            return true;
        }
        return super._map.containsKey("buckets");
    }

    /**
     * Remover for buckets
     * 
     * @see UsageQueryResult.Fields#buckets
     */
    public void removeBuckets() {
        super._map.remove("buckets");
    }

    /**
     * Getter for buckets
     * 
     * @see UsageQueryResult.Fields#buckets
     */
    @Nullable
    public UsageAggregationArray getBuckets(GetMode mode) {
        return getBuckets();
    }

    /**
     * Getter for buckets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see UsageQueryResult.Fields#buckets
     */
    @Nullable
    public UsageAggregationArray getBuckets() {
        if (_bucketsField!= null) {
            return _bucketsField;
        } else {
            Object __rawValue = super._map.get("buckets");
            _bucketsField = ((__rawValue == null)?null:new UsageAggregationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _bucketsField;
        }
    }

    /**
     * Setter for buckets
     * 
     * @see UsageQueryResult.Fields#buckets
     */
    public UsageQueryResult setBuckets(
        @Nullable
        UsageAggregationArray value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setBuckets(value);
            case REMOVE_OPTIONAL_IF_NULL:
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeBuckets();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "buckets", value.data());
                    _bucketsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "buckets", value.data());
                    _bucketsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for buckets
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResult.Fields#buckets
     */
    public UsageQueryResult setBuckets(
        @Nonnull
        UsageAggregationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field buckets of com.linkedin.usage.UsageQueryResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "buckets", value.data());
            _bucketsField = value;
        }
        return this;
    }

    /**
     * Existence checker for aggregations
     * 
     * @see UsageQueryResult.Fields#aggregations
     */
    public boolean hasAggregations() {
        if (_aggregationsField!= null) {
            return true;
        }
        return super._map.containsKey("aggregations");
    }

    /**
     * Remover for aggregations
     * 
     * @see UsageQueryResult.Fields#aggregations
     */
    public void removeAggregations() {
        super._map.remove("aggregations");
    }

    /**
     * Getter for aggregations
     * 
     * @see UsageQueryResult.Fields#aggregations
     */
    @Nullable
    public UsageQueryResultAggregations getAggregations(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAggregations();
            case DEFAULT:
            case NULL:
                if (_aggregationsField!= null) {
                    return _aggregationsField;
                } else {
                    Object __rawValue = super._map.get("aggregations");
                    _aggregationsField = ((__rawValue == null)?null:new UsageQueryResultAggregations(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
                    return _aggregationsField;
                }
        }
        throw new IllegalStateException(("Unknown mode "+ mode));
    }

    /**
     * Getter for aggregations
     * 
     * @return
     *     Required field. Could be null for partial record.
     * @see UsageQueryResult.Fields#aggregations
     */
    @Nonnull
    public UsageQueryResultAggregations getAggregations() {
        if (_aggregationsField!= null) {
            return _aggregationsField;
        } else {
            Object __rawValue = super._map.get("aggregations");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aggregations");
            }
            _aggregationsField = ((__rawValue == null)?null:new UsageQueryResultAggregations(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _aggregationsField;
        }
    }

    /**
     * Setter for aggregations
     * 
     * @see UsageQueryResult.Fields#aggregations
     */
    public UsageQueryResult setAggregations(
        @Nullable
        UsageQueryResultAggregations value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAggregations(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aggregations of com.linkedin.usage.UsageQueryResult");
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
            case REMOVE_IF_NULL:
                if (value == null) {
                    removeAggregations();
                } else {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
            case IGNORE_NULL:
                if (value!= null) {
                    CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
                    _aggregationsField = value;
                }
                break;
        }
        return this;
    }

    /**
     * Setter for aggregations
     * 
     * @param value
     *     Must not be null. For more control, use setters with mode instead.
     * @see UsageQueryResult.Fields#aggregations
     */
    public UsageQueryResult setAggregations(
        @Nonnull
        UsageQueryResultAggregations value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aggregations of com.linkedin.usage.UsageQueryResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
            _aggregationsField = value;
        }
        return this;
    }

    @Override
    public UsageQueryResult clone()
        throws CloneNotSupportedException
    {
        UsageQueryResult __clone = ((UsageQueryResult) super.clone());
        __clone.__changeListener = new UsageQueryResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public UsageQueryResult copy()
        throws CloneNotSupportedException
    {
        UsageQueryResult __copy = ((UsageQueryResult) super.copy());
        __copy._bucketsField = null;
        __copy._aggregationsField = null;
        __copy.__changeListener = new UsageQueryResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final UsageQueryResult __objectRef;

        private ChangeListener(UsageQueryResult reference) {
            __objectRef = reference;
        }

        @Override
        public void onUnderlyingMapChanged(String key, Object value) {
            switch (key) {
                case "buckets":
                    __objectRef._bucketsField = null;
                    break;
                case "aggregations":
                    __objectRef._aggregationsField = null;
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
         *  Raw buckets 
         * 
         */
        public com.linkedin.usage.UsageAggregationArray.Fields buckets() {
            return new com.linkedin.usage.UsageAggregationArray.Fields(getPathComponents(), "buckets");
        }

        /**
         *  Raw buckets 
         * 
         */
        public PathSpec buckets(Integer start, Integer count) {
            PathSpec arrayPathSpec = new PathSpec(getPathComponents(), "buckets");
            if (start!= null) {
                arrayPathSpec.setAttribute("start", start);
            }
            if (count!= null) {
                arrayPathSpec.setAttribute("count", count);
            }
            return arrayPathSpec;
        }

        /**
         * Aggregated metrics. All fields are optional here, since they will be populated
         * only if the underlying buckets contain the data required to generate that aggregation.
         * 
         */
        public com.linkedin.usage.UsageQueryResultAggregations.Fields aggregations() {
            return new com.linkedin.usage.UsageQueryResultAggregations.Fields(getPathComponents(), "aggregations");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.usage.UsageAggregationArray.ProjectionMask _bucketsMask;
        private com.linkedin.usage.UsageQueryResultAggregations.ProjectionMask _aggregationsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         *  Raw buckets 
         * 
         */
        public UsageQueryResult.ProjectionMask withBuckets(Function<com.linkedin.usage.UsageAggregationArray.ProjectionMask, com.linkedin.usage.UsageAggregationArray.ProjectionMask> nestedMask) {
            _bucketsMask = nestedMask.apply(((_bucketsMask == null)?UsageAggregationArray.createMask():_bucketsMask));
            getDataMap().put("buckets", _bucketsMask.getDataMap());
            return this;
        }

        /**
         *  Raw buckets 
         * 
         */
        public UsageQueryResult.ProjectionMask withBuckets() {
            _bucketsMask = null;
            getDataMap().put("buckets", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Raw buckets 
         * 
         */
        public UsageQueryResult.ProjectionMask withBuckets(Function<com.linkedin.usage.UsageAggregationArray.ProjectionMask, com.linkedin.usage.UsageAggregationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _bucketsMask = nestedMask.apply(((_bucketsMask == null)?UsageAggregationArray.createMask():_bucketsMask));
            getDataMap().put("buckets", _bucketsMask.getDataMap());
            if (start!= null) {
                getDataMap().getDataMap("buckets").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("buckets").put("$count", count);
            }
            return this;
        }

        /**
         *  Raw buckets 
         * 
         */
        public UsageQueryResult.ProjectionMask withBuckets(Integer start, Integer count) {
            _bucketsMask = null;
            getDataMap().put("buckets", new DataMap(3));
            if (start!= null) {
                getDataMap().getDataMap("buckets").put("$start", start);
            }
            if (count!= null) {
                getDataMap().getDataMap("buckets").put("$count", count);
            }
            return this;
        }

        /**
         * Aggregated metrics. All fields are optional here, since they will be populated
         * only if the underlying buckets contain the data required to generate that aggregation.
         * 
         */
        public UsageQueryResult.ProjectionMask withAggregations(Function<com.linkedin.usage.UsageQueryResultAggregations.ProjectionMask, com.linkedin.usage.UsageQueryResultAggregations.ProjectionMask> nestedMask) {
            _aggregationsMask = nestedMask.apply(((_aggregationsMask == null)?UsageQueryResultAggregations.createMask():_aggregationsMask));
            getDataMap().put("aggregations", _aggregationsMask.getDataMap());
            return this;
        }

        /**
         * Aggregated metrics. All fields are optional here, since they will be populated
         * only if the underlying buckets contain the data required to generate that aggregation.
         * 
         */
        public UsageQueryResult.ProjectionMask withAggregations() {
            _aggregationsMask = null;
            getDataMap().put("aggregations", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
