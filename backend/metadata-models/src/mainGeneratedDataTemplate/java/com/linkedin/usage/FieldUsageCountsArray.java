
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/usage/UsageAggregationMetrics.pdl.")
public class FieldUsageCountsArray
    extends WrappingArrayTemplate<FieldUsageCounts>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.usage/** Records field-level usage counts for a given resource */record FieldUsageCounts{fieldName:string,count:int}}]", SchemaFormatType.PDL));

    public FieldUsageCountsArray() {
        this(new DataList());
    }

    public FieldUsageCountsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public FieldUsageCountsArray(Collection<FieldUsageCounts> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public FieldUsageCountsArray(DataList data) {
        super(data, SCHEMA, FieldUsageCounts.class);
    }

    public FieldUsageCountsArray(FieldUsageCounts first, FieldUsageCounts... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static FieldUsageCountsArray.ProjectionMask createMask() {
        return new FieldUsageCountsArray.ProjectionMask();
    }

    @Override
    public FieldUsageCountsArray clone()
        throws CloneNotSupportedException
    {
        FieldUsageCountsArray __clone = ((FieldUsageCountsArray) super.clone());
        return __clone;
    }

    @Override
    public FieldUsageCountsArray copy()
        throws CloneNotSupportedException
    {
        FieldUsageCountsArray __copy = ((FieldUsageCountsArray) super.copy());
        return __copy;
    }

    @Override
    protected FieldUsageCounts coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new FieldUsageCounts(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.usage.FieldUsageCounts.Fields items() {
            return new com.linkedin.usage.FieldUsageCounts.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.usage.FieldUsageCounts.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public FieldUsageCountsArray.ProjectionMask withItems(Function<com.linkedin.usage.FieldUsageCounts.ProjectionMask, com.linkedin.usage.FieldUsageCounts.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?FieldUsageCounts.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
