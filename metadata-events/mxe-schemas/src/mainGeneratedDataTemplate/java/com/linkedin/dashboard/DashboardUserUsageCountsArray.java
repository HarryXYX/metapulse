
package com.linkedin.dashboard;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dashboard/DashboardUsageStatistics.pdl.")
public class DashboardUserUsageCountsArray
    extends WrappingArrayTemplate<DashboardUserUsageCounts>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dashboard/**Records a single user's usage counts for a given resource*/record DashboardUserUsageCounts{/**The unique id of the user.*/user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**The number of times the user has viewed the dashboard*/@TimeseriesField={}viewsCount:optional int/**The number of times the user has executed (refreshed) the dashboard*/@TimeseriesField={}executionsCount:optional int/**Normalized numeric metric representing user's dashboard usage -- the number of times the user executed or viewed the dashboard. */@TimeseriesField={}usageCount:optional int/**If user_email is set, we attempt to resolve the user's urn upon ingest*/@TimeseriesField={}userEmail:optional string}}]", SchemaFormatType.PDL));

    public DashboardUserUsageCountsArray() {
        this(new DataList());
    }

    public DashboardUserUsageCountsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DashboardUserUsageCountsArray(Collection<DashboardUserUsageCounts> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DashboardUserUsageCountsArray(DataList data) {
        super(data, SCHEMA, DashboardUserUsageCounts.class);
    }

    public DashboardUserUsageCountsArray(DashboardUserUsageCounts first, DashboardUserUsageCounts... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DashboardUserUsageCountsArray.ProjectionMask createMask() {
        return new DashboardUserUsageCountsArray.ProjectionMask();
    }

    @Override
    public DashboardUserUsageCountsArray clone()
        throws CloneNotSupportedException
    {
        DashboardUserUsageCountsArray __clone = ((DashboardUserUsageCountsArray) super.clone());
        return __clone;
    }

    @Override
    public DashboardUserUsageCountsArray copy()
        throws CloneNotSupportedException
    {
        DashboardUserUsageCountsArray __copy = ((DashboardUserUsageCountsArray) super.copy());
        return __copy;
    }

    @Override
    protected DashboardUserUsageCounts coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DashboardUserUsageCounts(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.dashboard.DashboardUserUsageCounts.Fields items() {
            return new com.linkedin.dashboard.DashboardUserUsageCounts.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.dashboard.DashboardUserUsageCounts.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DashboardUserUsageCountsArray.ProjectionMask withItems(Function<com.linkedin.dashboard.DashboardUserUsageCounts.ProjectionMask, com.linkedin.dashboard.DashboardUserUsageCounts.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DashboardUserUsageCounts.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
