
package com.linkedin.structured;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/structured/StructuredPropertyDefinition.pdl.")
public class PropertyValueArray
    extends WrappingArrayTemplate<PropertyValue>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.structured,record PropertyValue{value:/**Represents a stored primitive property value\n*/typeref PrimitivePropertyValue=union[string,double]/**Optional description of the property value*/description:optional string}}]", SchemaFormatType.PDL));

    public PropertyValueArray() {
        this(new DataList());
    }

    public PropertyValueArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public PropertyValueArray(Collection<PropertyValue> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public PropertyValueArray(DataList data) {
        super(data, SCHEMA, PropertyValue.class);
    }

    public PropertyValueArray(PropertyValue first, PropertyValue... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static PropertyValueArray.ProjectionMask createMask() {
        return new PropertyValueArray.ProjectionMask();
    }

    @Override
    public PropertyValueArray clone()
        throws CloneNotSupportedException
    {
        PropertyValueArray __clone = ((PropertyValueArray) super.clone());
        return __clone;
    }

    @Override
    public PropertyValueArray copy()
        throws CloneNotSupportedException
    {
        PropertyValueArray __copy = ((PropertyValueArray) super.copy());
        return __copy;
    }

    @Override
    protected PropertyValue coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new PropertyValue(DataTemplateUtil.castOrThrow(object, DataMap.class)));
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

        public com.linkedin.structured.PropertyValue.Fields items() {
            return new com.linkedin.structured.PropertyValue.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.structured.PropertyValue.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public PropertyValueArray.ProjectionMask withItems(Function<com.linkedin.structured.PropertyValue.ProjectionMask, com.linkedin.structured.PropertyValue.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?PropertyValue.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
