
package com.linkedin.ml.metadata;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DirectArrayTemplate;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.util.ArgumentUtil;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ml/metadata/IntendedUse.pdl.")
public class IntendedUserTypeArray
    extends DirectArrayTemplate<IntendedUserType>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.ml.metadata,enum IntendedUserType{ENTERPRISE,HOBBY,ENTERTAINMENT}}]", SchemaFormatType.PDL));

    public IntendedUserTypeArray() {
        this(new DataList());
    }

    public IntendedUserTypeArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public IntendedUserTypeArray(Collection<IntendedUserType> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public IntendedUserTypeArray(DataList data) {
        super(data, SCHEMA, IntendedUserType.class, String.class);
    }

    public IntendedUserTypeArray(IntendedUserType first, IntendedUserType... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public IntendedUserTypeArray clone()
        throws CloneNotSupportedException
    {
        IntendedUserTypeArray __clone = ((IntendedUserTypeArray) super.clone());
        return __clone;
    }

    @Override
    public IntendedUserTypeArray copy()
        throws CloneNotSupportedException
    {
        IntendedUserTypeArray __copy = ((IntendedUserTypeArray) super.copy());
        return __copy;
    }

    @Override
    protected Object coerceInput(IntendedUserType object)
        throws ClassCastException
    {
        ArgumentUtil.notNull(object, "object");
        return object.name();
    }

    @Override
    protected IntendedUserType coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return DataTemplateUtil.coerceEnumOutput(object, IntendedUserType.class, IntendedUserType.$UNKNOWN);
    }

}
