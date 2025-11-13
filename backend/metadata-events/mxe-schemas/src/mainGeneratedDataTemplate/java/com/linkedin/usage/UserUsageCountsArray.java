
package com.linkedin.usage;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/usage/UsageAggregationMetrics.pdl.")
public class UserUsageCountsArray
    extends WrappingArrayTemplate<UserUsageCounts>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.usage/** Records a single user's usage counts for a given resource */record UserUsageCounts{user:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}count:int/** If user_email is set, we attempt to resolve the user's urn upon ingest */userEmail:optional string}}]", SchemaFormatType.PDL));

    public UserUsageCountsArray() {
        this(new DataList());
    }

    public UserUsageCountsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public UserUsageCountsArray(Collection<UserUsageCounts> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public UserUsageCountsArray(DataList data) {
        super(data, SCHEMA, UserUsageCounts.class);
    }

    public UserUsageCountsArray(UserUsageCounts first, UserUsageCounts... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static UserUsageCountsArray.ProjectionMask createMask() {
        return new UserUsageCountsArray.ProjectionMask();
    }

    @Override
    public UserUsageCountsArray clone()
        throws CloneNotSupportedException
    {
        UserUsageCountsArray __clone = ((UserUsageCountsArray) super.clone());
        return __clone;
    }

    @Override
    public UserUsageCountsArray copy()
        throws CloneNotSupportedException
    {
        UserUsageCountsArray __copy = ((UserUsageCountsArray) super.copy());
        return __copy;
    }

    @Override
    protected UserUsageCounts coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new UserUsageCounts(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.usage.UserUsageCounts.Fields items() {
            return new com.linkedin.usage.UserUsageCounts.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.usage.UserUsageCounts.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public UserUsageCountsArray.ProjectionMask withItems(Function<com.linkedin.usage.UserUsageCounts.ProjectionMask, com.linkedin.usage.UserUsageCounts.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?UserUsageCounts.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
