
package com.linkedin.metadata.aspect;

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

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/snapshot/SchemaFieldSnapshot.pdl.")
public class SchemaFieldAspectArray
    extends WrappingArrayTemplate<SchemaFieldAspect>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[union[{namespace com.linkedin.metadata.key/**Key for a SchemaField*/@Aspect.name=\"schemaFieldKey\"record SchemaFieldKey{/**Parent associated with the schema field*/@Searchable.fieldType=\"URN\"parent:{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}/**fieldPath identifying the schema field*/@Searchable.fieldType=\"KEYWORD\"fieldPath:string}}]]", SchemaFormatType.PDL));

    public SchemaFieldAspectArray() {
        this(new DataList());
    }

    public SchemaFieldAspectArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public SchemaFieldAspectArray(Collection<SchemaFieldAspect> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public SchemaFieldAspectArray(DataList data) {
        super(data, SCHEMA, SchemaFieldAspect.class);
    }

    public SchemaFieldAspectArray(SchemaFieldAspect first, SchemaFieldAspect... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    public static SchemaFieldAspectArray.ProjectionMask createMask() {
        return new SchemaFieldAspectArray.ProjectionMask();
    }

    @Override
    public SchemaFieldAspectArray clone()
        throws CloneNotSupportedException
    {
        SchemaFieldAspectArray __clone = ((SchemaFieldAspectArray) super.clone());
        return __clone;
    }

    @Override
    public SchemaFieldAspectArray copy()
        throws CloneNotSupportedException
    {
        SchemaFieldAspectArray __copy = ((SchemaFieldAspectArray) super.copy());
        return __copy;
    }

    @Override
    protected SchemaFieldAspect coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new SchemaFieldAspect(object));
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

        public com.linkedin.metadata.aspect.SchemaFieldAspect.Fields items() {
            return new com.linkedin.metadata.aspect.SchemaFieldAspect.Fields(getPathComponents(), PathSpec.WILDCARD);
        }

    }

    public static class ProjectionMask
        extends MaskMap
    {

        private com.linkedin.metadata.aspect.SchemaFieldAspect.ProjectionMask _itemsMask;

        ProjectionMask() {
            super(4);
        }

        public SchemaFieldAspectArray.ProjectionMask withItems(Function<com.linkedin.metadata.aspect.SchemaFieldAspect.ProjectionMask, com.linkedin.metadata.aspect.SchemaFieldAspect.ProjectionMask> nestedMask) {
            _itemsMask = nestedMask.apply(((_itemsMask == null)?SchemaFieldAspect.createMask():_itemsMask));
            getDataMap().put("$*", _itemsMask.getDataMap());
            return this;
        }

    }

}
