
package com.datahub.common;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.MaskMap;
import com.linkedin.data.schema.PathSpec;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/datahub/common/DummySnapshot.pdl.")
public class DummyAspectArray
    extends WrappingArrayTemplate<DummyAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]]", SchemaFormatType.PDL));

    public DummyAspectArray() {
        this(new DataList());
    }

    public DummyAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public DummyAspectArray(Collection<DummyAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public DummyAspectArray(DataList data) {
        super(data, SCHEMA, DummyAspect.class);
    }

    public DummyAspectArray(DummyAspect first, DummyAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static DummyAspectArray.ProjectionMask createMask() {
        return new DummyAspectArray.ProjectionMask();
    }

    @Override
    public DummyAspectArray clone()
        throws CloneNotSupportedException
    {
        DummyAspectArray __clone = ((DummyAspectArray) super.clone());
        return __clone;
    }

    @Override
    public DummyAspectArray copy()
        throws CloneNotSupportedException
    {
        DummyAspectArray __copy = ((DummyAspectArray) super.copy());
        return __copy;
    }

    @Override
    protected DummyAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new DummyAspect(object));
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

        public com.datahub.common.DummyAspect.Fields items() {
            return new com.datahub.common.DummyAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.datahub.common.DummyAspect.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public DummyAspectArray.ProjectionMask withItems(Function<com.datahub.common.DummyAspect.ProjectionMask, com.datahub.common.DummyAspect.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?DummyAspect.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
