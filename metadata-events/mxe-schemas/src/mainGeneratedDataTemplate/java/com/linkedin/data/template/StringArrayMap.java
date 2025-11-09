
package com.linkedin.data.template;

import java.util.Map;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.MapDataSchema;
import com.linkedin.data.schema.SchemaFormatType;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/structured/StructuredPropertyDefinition.pdl.")
public class StringArrayMap
    extends WrappingMapTemplate<StringArray>
{

    private final static MapDataSchema SCHEMA = ((MapDataSchema) DataTemplateUtil.parseSchema("map[string,array[string]]", SchemaFormatType.PDL));

    public StringArrayMap() {
        this(new DataMap());
    }

    public StringArrayMap(int initialCapacity) {
        this(new DataMap(initialCapacity));
    }

    public StringArrayMap(int initialCapacity, float loadFactor) {
        this(new DataMap(initialCapacity, loadFactor));
    }

    public StringArrayMap(Map<String, StringArray> m) {
        this(newDataMapOfSize(m.size()));
        putAll(m);
    }

    public StringArrayMap(DataMap data) {
        super(data, SCHEMA, StringArray.class);
    }

    public static MapDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public StringArrayMap clone()
        throws CloneNotSupportedException
    {
        StringArrayMap __clone = ((StringArrayMap) super.clone());
        return __clone;
    }

    @Override
    public StringArrayMap copy()
        throws CloneNotSupportedException
    {
        StringArrayMap __copy = ((StringArrayMap) super.copy());
        return __copy;
    }

    @Override
    protected StringArray coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        if (object == null) {
            return null;
        }
        return ((object == null)?null:new StringArray(DataTemplateUtil.castOrThrow(object, DataList.class)));
    }

}
