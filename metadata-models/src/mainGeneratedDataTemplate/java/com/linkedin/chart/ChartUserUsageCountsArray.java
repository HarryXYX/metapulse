
package com.linkedin.chart;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/chart/ChartUsageStatistics.pdl.")
public class ChartUserUsageCountsArray
    extends WrappingArrayTemplate<ChartUserUsageCounts>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.chart/**Records a single user's usage counts for a given resource*/record ChartUserUsageCounts{/**The unique id of the user.*/user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The number of times the user has viewed the chart*/@TimeseriesField={}viewsCount:optional int}}]", SchemaFormatType.PDL));

    public ChartUserUsageCountsArray() {
        this(new DataList());
    }

    public ChartUserUsageCountsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public ChartUserUsageCountsArray(Collection<ChartUserUsageCounts> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public ChartUserUsageCountsArray(DataList data) {
        super(data, SCHEMA, ChartUserUsageCounts.class);
    }

    public ChartUserUsageCountsArray(ChartUserUsageCounts first, ChartUserUsageCounts... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static ChartUserUsageCountsArray.ProjectionMask createMask() {
        return new ChartUserUsageCountsArray.ProjectionMask();
    }

    @Override
    public ChartUserUsageCountsArray clone()
        throws CloneNotSupportedException
    {
        ChartUserUsageCountsArray __clone = ((ChartUserUsageCountsArray) super.clone());
        return __clone;
    }

    @Override
    public ChartUserUsageCountsArray copy()
        throws CloneNotSupportedException
    {
        ChartUserUsageCountsArray __copy = ((ChartUserUsageCountsArray) super.copy());
        return __copy;
    }

    @Override
    protected ChartUserUsageCounts coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new ChartUserUsageCounts(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.chart.ChartUserUsageCounts.Fields items() {
            return new com.linkedin.chart.ChartUserUsageCounts.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.chart.ChartUserUsageCounts.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public ChartUserUsageCountsArray.ProjectionMask withItems(Function<com.linkedin.chart.ChartUserUsageCounts.ProjectionMask, com.linkedin.chart.ChartUserUsageCounts.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?ChartUserUsageCounts.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
