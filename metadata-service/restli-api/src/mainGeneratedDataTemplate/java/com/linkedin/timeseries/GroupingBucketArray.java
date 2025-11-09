
package com.linkedin.timeseries;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-service/restli-api/src/main/pegasus/com/linkedin/analytics/GetTimeseriesAggregatedStatsResponse.pdl.")
public class GroupingBucketArray
    extends WrappingArrayTemplate<GroupingBucket>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.timeseries/**Defines the group by bucket definitions for time series requests.*/record GroupingBucket{/**Type of the grouping bucket.*/type:/**Defines a grouping bucket type.*/enum GroupingBucketType{DATE_GROUPING_BUCKET,STRING_GROUPING_BUCKET}/**Key that specifies the column name to be used as the timestamp field for bucketing.*/key:string/**Bucket size (like a day/hour etc) for the date grouping buckets.*/timeWindowSize:optional/**Defines the size of a time window.*/record TimeWindowSize{/**Interval unit such as minute/hour/day etc.*/unit:enum CalendarInterval{SECOND,MINUTE,HOUR,DAY,WEEK,MONTH,QUARTER,YEAR}/**How many units. Defaults to 1.*/multiple:int=1}/**Optional specified time zone to take into account when grouping by date*/timeZone:optional string}}]", SchemaFormatType.PDL));

    public GroupingBucketArray() {
        this(new DataList());
    }

    public GroupingBucketArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public GroupingBucketArray(Collection<GroupingBucket> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public GroupingBucketArray(DataList data) {
        super(data, SCHEMA, GroupingBucket.class);
    }

    public GroupingBucketArray(GroupingBucket first, GroupingBucket... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static GroupingBucketArray.ProjectionMask createMask() {
        return new GroupingBucketArray.ProjectionMask();
    }

    @Override
    public GroupingBucketArray clone()
        throws CloneNotSupportedException
    {
        GroupingBucketArray __clone = ((GroupingBucketArray) super.clone());
        return __clone;
    }

    @Override
    public GroupingBucketArray copy()
        throws CloneNotSupportedException
    {
        GroupingBucketArray __copy = ((GroupingBucketArray) super.copy());
        return __copy;
    }

    @Override
    protected GroupingBucket coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new GroupingBucket(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.timeseries.GroupingBucket.Fields items() {
            return new com.linkedin.timeseries.GroupingBucket.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.timeseries.GroupingBucket.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public GroupingBucketArray.ProjectionMask withItems(Function<com.linkedin.timeseries.GroupingBucket.ProjectionMask, com.linkedin.timeseries.GroupingBucket.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?GroupingBucket.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

        public GroupingBucketArray.ProjectionMask withItems(MaskMap nestedMask) {
            getDataMap().put("$*", nestedMask.getDataMap());
            return this;
        }

    }

}
