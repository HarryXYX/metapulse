
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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/run/DeleteReferencesResponse.pdl.")
public class RelatedAspectArray
    extends WrappingArrayTemplate<RelatedAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.metadata.run/**Metadata about how an aspect is related to some urn*/record RelatedAspect{/** Urn of the entity that is referenced by the aspect.*/entity:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}aspect:string,relationship:string}}]", SchemaFormatType.PDL));

    public RelatedAspectArray() {
        this(new DataList());
    }

    public RelatedAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public RelatedAspectArray(Collection<RelatedAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public RelatedAspectArray(DataList data) {
        super(data, SCHEMA, RelatedAspect.class);
    }

    public RelatedAspectArray(RelatedAspect first, RelatedAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static RelatedAspectArray.ProjectionMask createMask() {
        return new RelatedAspectArray.ProjectionMask();
    }

    @Override
    public RelatedAspectArray clone()
        throws CloneNotSupportedException
    {
        RelatedAspectArray __clone = ((RelatedAspectArray) super.clone());
        return __clone;
    }

    @Override
    public RelatedAspectArray copy()
        throws CloneNotSupportedException
    {
        RelatedAspectArray __copy = ((RelatedAspectArray) super.copy());
        return __copy;
    }

    @Override
    protected RelatedAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new RelatedAspect(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.metadata.run.RelatedAspect.Fields items() {
            return new com.linkedin.metadata.run.RelatedAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.run.RelatedAspect.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public RelatedAspectArray.ProjectionMask withItems(Function<com.linkedin.metadata.run.RelatedAspect.ProjectionMask, com.linkedin.metadata.run.RelatedAspect.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?RelatedAspect.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
