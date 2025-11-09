
package com.linkedin.common;

import java.util.Map;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.DataMap;
import com.linkedin.data.schema.MapDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.data.template.WrappingMapTemplate;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/Ownership.pdl.")
public class UrnArrayMap
    extends WrappingMapTemplate<UrnArray>
{

    private final static MapDataSchema SCHEMA = ((MapDataSchema) DataTemplateUtil.parseSchema("map[string,array[{namespace com.linkedin.common@java.class=\"com.linkedin.common.urn.Urn\"typeref Urn=string}]]", SchemaFormatType.PDL));

    public UrnArrayMap() {
        this(new DataMap());
    }

    public UrnArrayMap(int initialCapacity) {
        this(new DataMap(initialCapacity));
    }

    public UrnArrayMap(int initialCapacity, float loadFactor) {
        this(new DataMap(initialCapacity, loadFactor));
    }

    public UrnArrayMap(Map<String, UrnArray> m) {
        this(newDataMapOfSize(m.size()));
        putAll(m);
    }

    public UrnArrayMap(DataMap data) {
        super(data, SCHEMA, UrnArray.class);
    }

    public static MapDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public UrnArrayMap clone()
        throws CloneNotSupportedException
    {
        UrnArrayMap __clone = ((UrnArrayMap) super.clone());
        return __clone;
    }

    @Override
    public UrnArrayMap copy()
        throws CloneNotSupportedException
    {
        UrnArrayMap __copy = ((UrnArrayMap) super.copy());
        return __copy;
    }

    @Override
    protected UrnArray coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        if (object == null) {
            return null;
        }
        return ((object == null)?null:new UrnArray(DataTemplateUtil.castOrThrow(object, DataList.class)));
    }

}
