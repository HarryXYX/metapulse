
package com.linkedin.structured;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/structured/StructuredPropertyValueAssignment.pdl.")
public class PrimitivePropertyValueArray
    extends WrappingArrayTemplate<PrimitivePropertyValue>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[string,double]]", SchemaFormatType.PDL));

    public PrimitivePropertyValueArray() {
        this(new DataList());
    }

    public PrimitivePropertyValueArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public PrimitivePropertyValueArray(Collection<PrimitivePropertyValue> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public PrimitivePropertyValueArray(DataList data) {
        super(data, SCHEMA, PrimitivePropertyValue.class);
    }

    public PrimitivePropertyValueArray(PrimitivePropertyValue first, PrimitivePropertyValue... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static PrimitivePropertyValueArray.ProjectionMask createMask() {
        return new PrimitivePropertyValueArray.ProjectionMask();
    }

    @Override
    public PrimitivePropertyValueArray clone()
        throws CloneNotSupportedException
    {
        PrimitivePropertyValueArray __clone = ((PrimitivePropertyValueArray) super.clone());
        return __clone;
    }

    @Override
    public PrimitivePropertyValueArray copy()
        throws CloneNotSupportedException
    {
        PrimitivePropertyValueArray __copy = ((PrimitivePropertyValueArray) super.copy());
        return __copy;
    }

    @Override
    protected PrimitivePropertyValue coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new PrimitivePropertyValue(object));
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

        public com.linkedin.structured.PrimitivePropertyValue.Fields items() {
            return new com.linkedin.structured.PrimitivePropertyValue.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.structured.PrimitivePropertyValue.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public PrimitivePropertyValueArray.ProjectionMask withItems(Function<com.linkedin.structured.PrimitivePropertyValue.ProjectionMask, com.linkedin.structured.PrimitivePropertyValue.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?PrimitivePropertyValue.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
