
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/run/AspectRowSummaryList.pdl.")
public class AspectRowSummaryArray
    extends WrappingArrayTemplate<AspectRowSummary>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.run,record AspectRowSummary{runId:string,aspectName:string,urn:string,timestamp:long,metadata:string,version:long,keyAspect:boolean,aspect:optional{namespace com.linkedin.entity/**Placeholder PDL record to store the aspect in the response. By using this place-holder, metadata-service can return\nany type of aspect without having to define a single union class*/record Aspect{}}telemetryTraceId:optional string}}]", SchemaFormatType.PDL));

    public AspectRowSummaryArray() {
        this(new DataList());
    }

    public AspectRowSummaryArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public AspectRowSummaryArray(Collection<AspectRowSummary> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public AspectRowSummaryArray(DataList data) {
        super(data, SCHEMA, AspectRowSummary.class);
    }

    public AspectRowSummaryArray(AspectRowSummary first, AspectRowSummary... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static AspectRowSummaryArray.ProjectionMask createMask() {
        return new AspectRowSummaryArray.ProjectionMask();
    }

    @Override
    public AspectRowSummaryArray clone()
        throws CloneNotSupportedException
    {
        AspectRowSummaryArray __clone = ((AspectRowSummaryArray) super.clone());
        return __clone;
    }

    @Override
    public AspectRowSummaryArray copy()
        throws CloneNotSupportedException
    {
        AspectRowSummaryArray __copy = ((AspectRowSummaryArray) super.copy());
        return __copy;
    }

    @Override
    protected AspectRowSummary coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new AspectRowSummary(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.run.AspectRowSummary.Fields items() {
            return new com.linkedin.metadata.run.AspectRowSummary.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.run.AspectRowSummary.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public AspectRowSummaryArray.ProjectionMask withItems(Function<com.linkedin.metadata.run.AspectRowSummary.ProjectionMask, com.linkedin.metadata.run.AspectRowSummary.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?AspectRowSummary.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
