
package com.linkedin.metadata.search;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/search/AggregationMetadata.pdl.")
public class FilterValueArray
    extends WrappingArrayTemplate<FilterValue>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.search,record FilterValue{value:string,entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}facetCount:long,filtered:optional boolean}}]", SchemaFormatType.PDL));

    public FilterValueArray() {
        this(new DataList());
    }

    public FilterValueArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public FilterValueArray(Collection<FilterValue> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public FilterValueArray(DataList data) {
        super(data, SCHEMA, FilterValue.class);
    }

    public FilterValueArray(FilterValue first, FilterValue... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static FilterValueArray.ProjectionMask createMask() {
        return new FilterValueArray.ProjectionMask();
    }

    @Override
    public FilterValueArray clone()
        throws CloneNotSupportedException
    {
        FilterValueArray __clone = ((FilterValueArray) super.clone());
        return __clone;
    }

    @Override
    public FilterValueArray copy()
        throws CloneNotSupportedException
    {
        FilterValueArray __copy = ((FilterValueArray) super.copy());
        return __copy;
    }

    @Override
    protected FilterValue coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new FilterValue(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.search.FilterValue.Fields items() {
            return new com.linkedin.metadata.search.FilterValue.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.search.FilterValue.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public FilterValueArray.ProjectionMask withItems(Function<com.linkedin.metadata.search.FilterValue.ProjectionMask, com.linkedin.metadata.search.FilterValue.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?FilterValue.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
