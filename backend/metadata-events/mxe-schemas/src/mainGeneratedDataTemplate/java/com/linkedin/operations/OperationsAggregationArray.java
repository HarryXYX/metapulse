
package com.linkedin.operations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/operations/OperationsQueryResult.pdl.")
public class OperationsAggregationArray
    extends WrappingArrayTemplate<OperationsAggregation>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.operations/**Operations data for a given resource, rolled up into a bucket.*/record OperationsAggregation{/** Bucket start time in milliseconds */bucket:long/** Bucket duration */duration:{namespace com.linkedin.common/**Enum to define the length of a bucket when doing aggregations*/enum WindowDuration{YEAR,MONTH,WEEK,DAY,HOUR}}/** Resource associated with these usage stats */resource:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/** Aggregations associated with this bucket */aggregations:/**Aggregation results for operations query*/record OperationsAggregationsResult{/** Total number of operations in the bucket */totalOperations:optional int/** Total number of inserts in the bucket */totalInserts:optional int/** Total number of updates in the bucket */totalUpdates:optional int/** Total number of deletes in the bucket */totalDeletes:optional int/** Total number of creates in the bucket */totalCreates:optional int/** Total number of alters in the bucket */totalAlters:optional int/** Total number of drops in the bucket */totalDrops:optional int/** Total number of custom types in the bucket */totalCustoms:optional int/** A map from each custom operation type to the total count for that type*/customOperationsMap:optional map[string,int]}}}]", SchemaFormatType.PDL));

    public OperationsAggregationArray() {
        this(new DataList());
    }

    public OperationsAggregationArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public OperationsAggregationArray(Collection<OperationsAggregation> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public OperationsAggregationArray(DataList data) {
        super(data, SCHEMA, OperationsAggregation.class);
    }

    public OperationsAggregationArray(OperationsAggregation first, OperationsAggregation... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static OperationsAggregationArray.ProjectionMask createMask() {
        return new OperationsAggregationArray.ProjectionMask();
    }

    @Override
    public OperationsAggregationArray clone()
        throws CloneNotSupportedException
    {
        OperationsAggregationArray __clone = ((OperationsAggregationArray) super.clone());
        return __clone;
    }

    @Override
    public OperationsAggregationArray copy()
        throws CloneNotSupportedException
    {
        OperationsAggregationArray __copy = ((OperationsAggregationArray) super.copy());
        return __copy;
    }

    @Override
    protected OperationsAggregation coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new OperationsAggregation(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.operations.OperationsAggregation.Fields items() {
            return new com.linkedin.operations.OperationsAggregation.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.operations.OperationsAggregation.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public OperationsAggregationArray.ProjectionMask withItems(Function<com.linkedin.operations.OperationsAggregation.ProjectionMask, com.linkedin.operations.OperationsAggregation.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?OperationsAggregation.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
