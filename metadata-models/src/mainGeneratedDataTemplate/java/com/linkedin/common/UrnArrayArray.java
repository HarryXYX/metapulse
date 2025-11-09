
package com.linkedin.common;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingArrayTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/metadata/graph/LineageRelationship.pdl.")
public class UrnArrayArray
    extends WrappingArrayTemplate<UrnArray>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]]", SchemaFormatType.PDL));

    public UrnArrayArray() {
        this(new DataList());
    }

    public UrnArrayArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public UrnArrayArray(Collection<UrnArray> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public UrnArrayArray(DataList data) {
        super(data, SCHEMA, UrnArray.class);
    }

    public UrnArrayArray(UrnArray first, UrnArray... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public UrnArrayArray clone()
        throws CloneNotSupportedException
    {
        UrnArrayArray __clone = ((UrnArrayArray) super.clone());
        return __clone;
    }

    @Override
    public UrnArrayArray copy()
        throws CloneNotSupportedException
    {
        UrnArrayArray __copy = ((UrnArrayArray) super.copy());
        return __copy;
    }

    @Override
    protected UrnArray coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(object, DataList.class)));
    }

}
