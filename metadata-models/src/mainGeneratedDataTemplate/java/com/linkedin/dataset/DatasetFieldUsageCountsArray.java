
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/DatasetUsageStatistics.pdl.")
public class DatasetFieldUsageCountsArray
    extends WrappingArrayTemplate<DatasetFieldUsageCounts>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset/**Records field-level usage counts for a given dataset*/record DatasetFieldUsageCounts{/**The name of the field.*/fieldPath:string/**Number of times the field has been used.*/@TimeseriesField={}count:int}}]", SchemaFormatType.PDL));

    public DatasetFieldUsageCountsArray() {
        this(new DataList());
    }

    public DatasetFieldUsageCountsArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DatasetFieldUsageCountsArray(Collection<DatasetFieldUsageCounts> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DatasetFieldUsageCountsArray(DataList data) {
        super(data, SCHEMA, DatasetFieldUsageCounts.class);
    }

    public DatasetFieldUsageCountsArray(DatasetFieldUsageCounts first, DatasetFieldUsageCounts... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DatasetFieldUsageCountsArray.ProjectionMask createMask() {
        return new DatasetFieldUsageCountsArray.ProjectionMask();
    }

    @Override
    public DatasetFieldUsageCountsArray clone()
        throws CloneNotSupportedException
    {
        DatasetFieldUsageCountsArray __clone = ((DatasetFieldUsageCountsArray) super.clone());
        return __clone;
    }

    @Override
    public DatasetFieldUsageCountsArray copy()
        throws CloneNotSupportedException
    {
        DatasetFieldUsageCountsArray __copy = ((DatasetFieldUsageCountsArray) super.copy());
        return __copy;
    }

    @Override
    protected DatasetFieldUsageCounts coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DatasetFieldUsageCounts(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.dataset.DatasetFieldUsageCounts.Fields items() {
            return new com.linkedin.dataset.DatasetFieldUsageCounts.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.dataset.DatasetFieldUsageCounts.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DatasetFieldUsageCountsArray.ProjectionMask withItems(Function<com.linkedin.dataset.DatasetFieldUsageCounts.ProjectionMask, com.linkedin.dataset.DatasetFieldUsageCounts.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DatasetFieldUsageCounts.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
