
package com.linkedin.common;

import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Generated;
import com.linkedin.data.DataList;
import com.linkedin.data.schema.ArrayDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.DirectArrayTemplate;
import com.linkedin.data.template.TemplateOutputCastException;
import com.linkedin.util.ArgumentUtil;

@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/identity/CorpGroupInfo.pdl.")
public class CorpuserUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.CorpuserUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Corporate user's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpuserUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate user's AD/LDAP login\",\"entityType\":\"corpuser\",\"fields\":[{\"doc\":\"The name of the AD/LDAP user.\",\"maxLength\":20,\"name\":\"username\",\"type\":\"string\"}],\"maxLength\":36,\"name\":\"Corpuser\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpuserUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpuserUrn.class);
    }

    public CorpuserUrnArray() {
        this(new DataList());
    }

    public CorpuserUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public CorpuserUrnArray(Collection<com.linkedin.common.urn.CorpuserUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public CorpuserUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.CorpuserUrn.class, String.class);
    }

    public CorpuserUrnArray(com.linkedin.common.urn.CorpuserUrn first, com.linkedin.common.urn.CorpuserUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public CorpuserUrnArray clone()
        throws CloneNotSupportedException
    {
        CorpuserUrnArray __clone = ((CorpuserUrnArray) super.clone());
        return __clone;
    }

    @Override
    public CorpuserUrnArray copy()
        throws CloneNotSupportedException
    {
        CorpuserUrnArray __copy = ((CorpuserUrnArray) super.copy());
        return __copy;
    }

    @Override
    protected Object coerceInput(com.linkedin.common.urn.CorpuserUrn object)
        throws ClassCastException
    {
        ArgumentUtil.notNull(object, "object");
        return DataTemplateUtil.coerceCustomInput(object, com.linkedin.common.urn.CorpuserUrn.class);
    }

    @Override
    protected com.linkedin.common.urn.CorpuserUrn coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return DataTemplateUtil.coerceCustomOutput(object, com.linkedin.common.urn.CorpuserUrn.class);
    }

}
