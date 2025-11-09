
package com.linkedin.data.template;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/timeseries/GenericTable.pdl.")
public class StringArrayArray
    extends WrappingArrayTemplate<StringArray>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[array[string]]", SchemaFormatType.PDL));

    public StringArrayArray() {
        this(new DataList());
    }

    public StringArrayArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public StringArrayArray(Collection<StringArray> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public StringArrayArray(DataList data) {
        super(data, SCHEMA, StringArray.class);
    }

    public StringArrayArray(StringArray first, StringArray... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public StringArrayArray clone()
        throws CloneNotSupportedException
    {
        StringArrayArray __clone = ((StringArrayArray) super.clone());
        return __clone;
    }

    @Override
    public StringArrayArray copy()
        throws CloneNotSupportedException
    {
        StringArrayArray __copy = ((StringArrayArray) super.copy());
        return __copy;
    }

    @Override
    protected StringArray coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return ((object == null)?null:new StringArray(DataTemplateUtil.castOrThrow(object, DataList.class)));
    }

}
