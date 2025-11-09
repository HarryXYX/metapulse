
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/SearchResultMetadata.pdl.")
public class AggregationMetadataArray
    extends WrappingArrayTemplate<AggregationMetadata>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.search,record AggregationMetadata{/**The name of the aggregation, e.g, platform, origin*/name:string/**Name of the filter to be displayed in the UI*/displayName:optional string/**Entity associated with this facet*/entity:optional{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**List of aggregations showing the number of documents falling into each bucket. e.g, for platform aggregation, the bucket can be hive, kafka, etc*/aggregations:map[string,long]filterValues:array[record FilterValue{value:string,entity:optional com.linkedin.common.Urn,facetCount:long,filtered:optional boolean}]}}]", SchemaFormatType.PDL));

    public AggregationMetadataArray() {
        this(new DataList());
    }

    public AggregationMetadataArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public AggregationMetadataArray(Collection<AggregationMetadata> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public AggregationMetadataArray(DataList data) {
        super(data, SCHEMA, AggregationMetadata.class);
    }

    public AggregationMetadataArray(AggregationMetadata first, AggregationMetadata... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static AggregationMetadataArray.ProjectionMask createMask() {
        return new AggregationMetadataArray.ProjectionMask();
    }

    @Override
    public AggregationMetadataArray clone()
        throws CloneNotSupportedException
    {
        AggregationMetadataArray __clone = ((AggregationMetadataArray) super.clone());
        return __clone;
    }

    @Override
    public AggregationMetadataArray copy()
        throws CloneNotSupportedException
    {
        AggregationMetadataArray __copy = ((AggregationMetadataArray) super.copy());
        return __copy;
    }

    @Override
    protected AggregationMetadata coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new AggregationMetadata(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.search.AggregationMetadata.Fields items() {
            return new com.linkedin.metadata.search.AggregationMetadata.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.search.AggregationMetadata.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public AggregationMetadataArray.ProjectionMask withItems(Function<com.linkedin.metadata.search.AggregationMetadata.ProjectionMask, com.linkedin.metadata.search.AggregationMetadata.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?AggregationMetadata.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
