
package com.linkedin.metadata.run;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/run/IngestionRunSummaryList.pdl.")
public class IngestionRunSummaryArray
    extends WrappingArrayTemplate<IngestionRunSummary>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.run,record IngestionRunSummary{runId:string,timestamp:long,rows:long}}]", SchemaFormatType.PDL));

    public IngestionRunSummaryArray() {
        this(new DataList());
    }

    public IngestionRunSummaryArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public IngestionRunSummaryArray(Collection<IngestionRunSummary> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public IngestionRunSummaryArray(DataList data) {
        super(data, SCHEMA, IngestionRunSummary.class);
    }

    public IngestionRunSummaryArray(IngestionRunSummary first, IngestionRunSummary... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static IngestionRunSummaryArray.ProjectionMask createMask() {
        return new IngestionRunSummaryArray.ProjectionMask();
    }

    @Override
    public IngestionRunSummaryArray clone()
        throws CloneNotSupportedException
    {
        IngestionRunSummaryArray __clone = ((IngestionRunSummaryArray) super.clone());
        return __clone;
    }

    @Override
    public IngestionRunSummaryArray copy()
        throws CloneNotSupportedException
    {
        IngestionRunSummaryArray __copy = ((IngestionRunSummaryArray) super.copy());
        return __copy;
    }

    @Override
    protected IngestionRunSummary coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new IngestionRunSummary(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.run.IngestionRunSummary.Fields items() {
            return new com.linkedin.metadata.run.IngestionRunSummary.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.run.IngestionRunSummary.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public IngestionRunSummaryArray.ProjectionMask withItems(Function<com.linkedin.metadata.run.IngestionRunSummary.ProjectionMask, com.linkedin.metadata.run.IngestionRunSummary.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?IngestionRunSummary.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
