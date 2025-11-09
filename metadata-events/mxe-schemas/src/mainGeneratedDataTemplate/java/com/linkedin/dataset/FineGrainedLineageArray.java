
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datajob/DataJobInputOutput.pdl.")
public class FineGrainedLineageArray
    extends WrappingArrayTemplate<FineGrainedLineage>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.dataset/**A fine-grained lineage from upstream fields/datasets to downstream field(s)*/record FineGrainedLineage{/**The type of upstream entity*/upstreamType:/**The type of upstream entity in a fine-grained lineage*/enum FineGrainedLineageUpstreamType{/** Indicates that this lineage is originating from upstream field(s)*/FIELD_SET/** Indicates that this lineage is originating from upstream dataset(s)*/DATASET/** Indicates that there is no upstream lineage i.e. the downstream field is not a derived field*/NONE}/**Upstream entities in the lineage*/@Searchable.`/*`={\"fieldName\":\"fineGrainedUpstreams\",\"fieldType\":\"URN\",\"hasValuesFieldName\":\"hasFineGrainedUpstreams\",\"queryByDefault\":false}upstreams:optional array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]/**The type of downstream field(s)*/downstreamType:/**The type of downstream field(s) in a fine-grained lineage*/enum FineGrainedLineageDownstreamType{/** Indicates that the lineage is for a single, specific, downstream field*/FIELD/** Indicates that the lineage is for a set of downstream fields*/FIELD_SET}/**Downstream fields in the lineage*/downstreams:optional array[com.linkedin.common.Urn]/**The transform operation applied to the upstream entities to produce the downstream field(s)*/transformOperation:optional string/**The confidence in this lineage between 0 (low confidence) and 1 (high confidence)*/confidenceScore:float=1.0/**The query that was used to generate this lineage. \nPresent only if the lineage was generated from a detected query.*/query:optional com.linkedin.common.Urn}}]", SchemaFormatType.PDL));

    public FineGrainedLineageArray() {
        this(new DataList());
    }

    public FineGrainedLineageArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public FineGrainedLineageArray(Collection<FineGrainedLineage> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public FineGrainedLineageArray(DataList data) {
        super(data, SCHEMA, FineGrainedLineage.class);
    }

    public FineGrainedLineageArray(FineGrainedLineage first, FineGrainedLineage... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static FineGrainedLineageArray.ProjectionMask createMask() {
        return new FineGrainedLineageArray.ProjectionMask();
    }

    @Override
    public FineGrainedLineageArray clone()
        throws CloneNotSupportedException
    {
        FineGrainedLineageArray __clone = ((FineGrainedLineageArray) super.clone());
        return __clone;
    }

    @Override
    public FineGrainedLineageArray copy()
        throws CloneNotSupportedException
    {
        FineGrainedLineageArray __copy = ((FineGrainedLineageArray) super.copy());
        return __copy;
    }

    @Override
    protected FineGrainedLineage coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new FineGrainedLineage(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.dataset.FineGrainedLineage.Fields items() {
            return new com.linkedin.dataset.FineGrainedLineage.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.dataset.FineGrainedLineage.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public FineGrainedLineageArray.ProjectionMask withItems(Function<com.linkedin.dataset.FineGrainedLineage.ProjectionMask, com.linkedin.dataset.FineGrainedLineage.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?FineGrainedLineage.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
