
package com.linkedin.dataset;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/DatasetUsageStatistics.pdl.")
public class DatasetUserUsageCountsArray
    extends WrappingArrayTemplate<DatasetUserUsageCounts>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset/**Records a single user's usage counts for a given resource*/record DatasetUserUsageCounts{/**The unique id of the user.*/user:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**Number of times the dataset has been used by the user.*/@TimeseriesField={}count:int/**If user_email is set, we attempt to resolve the user's urn upon ingest*/@TimeseriesField={}userEmail:optional string}}]", SchemaFormatType.PDL));

    public DatasetUserUsageCountsArray() {
        this(new DataList());
    }

    public DatasetUserUsageCountsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DatasetUserUsageCountsArray(Collection<DatasetUserUsageCounts> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DatasetUserUsageCountsArray(DataList data) {
        super(data, SCHEMA, DatasetUserUsageCounts.class);
    }

    public DatasetUserUsageCountsArray(DatasetUserUsageCounts first, DatasetUserUsageCounts... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DatasetUserUsageCountsArray.ProjectionMask createMask() {
        return new DatasetUserUsageCountsArray.ProjectionMask();
    }

    @Override
    public DatasetUserUsageCountsArray clone()
        throws CloneNotSupportedException
    {
        DatasetUserUsageCountsArray __clone = ((DatasetUserUsageCountsArray) super.clone());
        return __clone;
    }

    @Override
    public DatasetUserUsageCountsArray copy()
        throws CloneNotSupportedException
    {
        DatasetUserUsageCountsArray __copy = ((DatasetUserUsageCountsArray) super.copy());
        return __copy;
    }

    @Override
    protected DatasetUserUsageCounts coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DatasetUserUsageCounts(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.dataset.DatasetUserUsageCounts.Fields items() {
            return new com.linkedin.dataset.DatasetUserUsageCounts.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.dataset.DatasetUserUsageCounts.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DatasetUserUsageCountsArray.ProjectionMask withItems(Function<com.linkedin.dataset.DatasetUserUsageCounts.ProjectionMask, com.linkedin.dataset.DatasetUserUsageCounts.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DatasetUserUsageCounts.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
