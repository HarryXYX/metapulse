
package com.linkedin.operations;

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
 * Results of a query for operations data.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/operations/OperationsQueryResult.pdl.")
public class OperationsQueryResult
    extends RecordTemplate
{

    private final static OperationsQueryResult.Fields _fields = new OperationsQueryResult.Fields();
    private final static RecordDataSchema SCHEMA = ((RecordDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.operations/**Results of a query for operations data.*/record OperationsQueryResult{/** Raw buckets */buckets:optional array[/**Operations data for a given resource, rolled up into a bucket.*/record OperationsAggregation{/** Bucket start time in milliseconds */bucket:long/** Bucket duration */duration:{namespace com.linkedin.common/**Enum to define the length of a bucket when doing aggregations*/enum WindowDuration{YEAR,MONTH,WEEK,DAY,HOUR}}/** Resource associated with these usage stats */resource:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/** Aggregations associated with this bucket */aggregations:/**Aggregation results for operations query*/record OperationsAggregationsResult{/** Total number of operations in the bucket */totalOperations:optional int/** Total number of inserts in the bucket */totalInserts:optional int/** Total number of updates in the bucket */totalUpdates:optional int/** Total number of deletes in the bucket */totalDeletes:optional int/** Total number of creates in the bucket */totalCreates:optional int/** Total number of alters in the bucket */totalAlters:optional int/** Total number of drops in the bucket */totalDrops:optional int/** Total number of custom types in the bucket */totalCustoms:optional int/** A map from each custom operation type to the total count for that type*/customOperationsMap:optional map[string,int]}}]/**Aggregated metrics. All fields are optional here, since they will be populated\nonly if the underlying buckets contain the data required to generate that aggregation.*/aggregations:OperationsAggregationsResult}", SchemaFormatType.PDL));
    private OperationsAggregationArray _bucketsField = null;
    private OperationsAggregationsResult _aggregationsField = null;
    private OperationsQueryResult.ChangeListener __changeListener = new OperationsQueryResult.ChangeListener(this);
    private final static RecordDataSchema.Field FIELD_Buckets = SCHEMA.getField("buckets");
    private final static RecordDataSchema.Field FIELD_Aggregations = SCHEMA.getField("aggregations");

    public OperationsQueryResult() {
        super(new DataMap(3, 0.75F), SCHEMA, 3);
        addChangeListener(__changeListener);
    }

    public OperationsQueryResult(DataMap data) {
        super(data, SCHEMA);
        addChangeListener(__changeListener);
    }

    public static OperationsQueryResult.Fields fields() {
        return _fields;
    }

    public static OperationsQueryResult.ProjectionMask createMask() {
        return new OperationsQueryResult.ProjectionMask();
    }

    public static RecordDataSchema dataSchema() {
        return SCHEMA;
    }

    /**
     * Existence checker for buckets
     * 
     * @see OperationsQueryResult.Fields#buckets
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
     * @see OperationsQueryResult.Fields#buckets
     */
    public void removeBuckets() {
        super._map.remove("buckets");
    }

    /**
     * Getter for buckets
     * 
     * @see OperationsQueryResult.Fields#buckets
     */
    @Nullable
    public OperationsAggregationArray getBuckets(GetMode mode) {
        return getBuckets();
    }

    /**
     * Getter for buckets
     * 
     * @return
     *     Optional field. Always check for null.
     * @see OperationsQueryResult.Fields#buckets
     */
    @Nullable
    public OperationsAggregationArray getBuckets() {
        if (_bucketsField!= null) {
            return _bucketsField;
        } else {
            Object __rawValue = super._map.get("buckets");
            _bucketsField = ((__rawValue == null)?null:new OperationsAggregationArray(DataTemplateUtil.castOrThrow(__rawValue, DataList.class)));
            return _bucketsField;
        }
    }

    /**
     * Setter for buckets
     * 
     * @see OperationsQueryResult.Fields#buckets
     */
    public OperationsQueryResult setBuckets(
        @Nullable
        OperationsAggregationArray value, SetMode mode) {
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
     * @see OperationsQueryResult.Fields#buckets
     */
    public OperationsQueryResult setBuckets(
        @Nonnull
        OperationsAggregationArray value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field buckets of com.linkedin.operations.OperationsQueryResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "buckets", value.data());
            _bucketsField = value;
        }
        return this;
    }

    /**
     * Existence checker for aggregations
     * 
     * @see OperationsQueryResult.Fields#aggregations
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
     * @see OperationsQueryResult.Fields#aggregations
     */
    public void removeAggregations() {
        super._map.remove("aggregations");
    }

    /**
     * Getter for aggregations
     * 
     * @see OperationsQueryResult.Fields#aggregations
     */
    @Nullable
    public OperationsAggregationsResult getAggregations(GetMode mode) {
        switch (mode) {
            case STRICT:
                return getAggregations();
            case DEFAULT:
            case NULL:
                if (_aggregationsField!= null) {
                    return _aggregationsField;
                } else {
                    Object __rawValue = super._map.get("aggregations");
                    _aggregationsField = ((__rawValue == null)?null:new OperationsAggregationsResult(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
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
     * @see OperationsQueryResult.Fields#aggregations
     */
    @Nonnull
    public OperationsAggregationsResult getAggregations() {
        if (_aggregationsField!= null) {
            return _aggregationsField;
        } else {
            Object __rawValue = super._map.get("aggregations");
            if (__rawValue == null) {
                throw new RequiredFieldNotPresentException("aggregations");
            }
            _aggregationsField = ((__rawValue == null)?null:new OperationsAggregationsResult(DataTemplateUtil.castOrThrow(__rawValue, DataMap.class)));
            return _aggregationsField;
        }
    }

    /**
     * Setter for aggregations
     * 
     * @see OperationsQueryResult.Fields#aggregations
     */
    public OperationsQueryResult setAggregations(
        @Nullable
        OperationsAggregationsResult value, SetMode mode) {
        switch (mode) {
            case DISALLOW_NULL:
                return setAggregations(value);
            case REMOVE_OPTIONAL_IF_NULL:
                if (value == null) {
                    throw new IllegalArgumentException("Cannot remove mandatory field aggregations of com.linkedin.operations.OperationsQueryResult");
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
     * @see OperationsQueryResult.Fields#aggregations
     */
    public OperationsQueryResult setAggregations(
        @Nonnull
        OperationsAggregationsResult value) {
        if (value == null) {
            throw new NullPointerException("Cannot set field aggregations of com.linkedin.operations.OperationsQueryResult to null");
        } else {
            CheckedUtil.putWithoutChecking(super._map, "aggregations", value.data());
            _aggregationsField = value;
        }
        return this;
    }

    @Override
    public OperationsQueryResult clone()
        throws CloneNotSupportedException
    {
        OperationsQueryResult __clone = ((OperationsQueryResult) super.clone());
        __clone.__changeListener = new OperationsQueryResult.ChangeListener(__clone);
        __clone.addChangeListener(__clone.__changeListener);
        return __clone;
    }

    @Override
    public OperationsQueryResult copy()
        throws CloneNotSupportedException
    {
        OperationsQueryResult __copy = ((OperationsQueryResult) super.copy());
        __copy._bucketsField = null;
        __copy._aggregationsField = null;
        __copy.__changeListener = new OperationsQueryResult.ChangeListener(__copy);
        __copy.addChangeListener(__copy.__changeListener);
        return __copy;
    }

    private static class ChangeListener
        implements com.linkedin.data.collections.CheckedMap.ChangeListener<String, Object>
    {

        private final OperationsQueryResult __objectRef;

        private ChangeListener(OperationsQueryResult reference) {
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
        public com.linkedin.operations.OperationsAggregationArray.Fields buckets() {
            return new com.linkedin.operations.OperationsAggregationArray.Fields(getPathComponents(), "buckets");
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
        public com.linkedin.operations.OperationsAggregationsResult.Fields aggregations() {
            return new com.linkedin.operations.OperationsAggregationsResult.Fields(getPathComponents(), "aggregations");
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.operations.OperationsAggregationArray.ProjectionMask _bucketsMask;
        private com.linkedin.operations.OperationsAggregationsResult.ProjectionMask _aggregationsMask;

        ProjectionMask() {
            super(3);
        }

        /**
         *  Raw buckets 
         * 
         */
        public OperationsQueryResult.ProjectionMask withBuckets(Function<com.linkedin.operations.OperationsAggregationArray.ProjectionMask, com.linkedin.operations.OperationsAggregationArray.ProjectionMask> nestedMask) {
            _bucketsMask = nestedMask.apply(((_bucketsMask == null)?OperationsAggregationArray.createMask():_bucketsMask));
            getDataMap().put("buckets", _bucketsMask.getDataMap());
            return this;
        }

        /**
         *  Raw buckets 
         * 
         */
        public OperationsQueryResult.ProjectionMask withBuckets() {
            _bucketsMask = null;
            getDataMap().put("buckets", MaskMap.POSITIVE_MASK);
            return this;
        }

        /**
         *  Raw buckets 
         * 
         */
        public OperationsQueryResult.ProjectionMask withBuckets(Function<com.linkedin.operations.OperationsAggregationArray.ProjectionMask, com.linkedin.operations.OperationsAggregationArray.ProjectionMask> nestedMask, Integer start, Integer count) {
            _bucketsMask = nestedMask.apply(((_bucketsMask == null)?OperationsAggregationArray.createMask():_bucketsMask));
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
        public OperationsQueryResult.ProjectionMask withBuckets(Integer start, Integer count) {
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
        public OperationsQueryResult.ProjectionMask withAggregations(Function<com.linkedin.operations.OperationsAggregationsResult.ProjectionMask, com.linkedin.operations.OperationsAggregationsResult.ProjectionMask> nestedMask) {
            _aggregationsMask = nestedMask.apply(((_aggregationsMask == null)?OperationsAggregationsResult.createMask():_aggregationsMask));
            getDataMap().put("aggregations", _aggregationsMask.getDataMap());
            return this;
        }

        /**
         * Aggregated metrics. All fields are optional here, since they will be populated
         * only if the underlying buckets contain the data required to generate that aggregation.
         * 
         */
        public OperationsQueryResult.ProjectionMask withAggregations() {
            _aggregationsMask = null;
            getDataMap().put("aggregations", MaskMap.POSITIVE_MASK);
            return this;
        }

    }

}
