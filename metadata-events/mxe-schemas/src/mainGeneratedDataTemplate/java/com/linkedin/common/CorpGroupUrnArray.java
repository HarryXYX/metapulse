
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
public class CorpGroupUrnArray
    extends DirectArrayTemplate<com.linkedin.common.urn.CorpGroupUrn>
{

    private final static ArrayDataSchema SCHEMA = ((ArrayDataSchema) DataTemplateUtil.parseSchema("array[{namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate group's AD/LDAP login\",\"entityType\":\"corpGroup\",\"fields\":[{\"doc\":\"The name of the AD/LDAP group.\",\"maxLength\":128,\"name\":\"groupName\",\"type\":\"string\"}],\"maxLength\":145,\"name\":\"CorpGroup\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpGroupUrn=string}]", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpGroupUrn.class);
    }

    public CorpGroupUrnArray() {
        this(new DataList());
    }

    public CorpGroupUrnArray(int initialCapacity) {
        this(new DataList(initialCapacity));
    }

    public CorpGroupUrnArray(Collection<com.linkedin.common.urn.CorpGroupUrn> c) {
        this(new DataList(c.size()));
        addAll(c);
    }

    public CorpGroupUrnArray(DataList data) {
        super(data, SCHEMA, com.linkedin.common.urn.CorpGroupUrn.class, String.class);
    }

    public CorpGroupUrnArray(com.linkedin.common.urn.CorpGroupUrn first, com.linkedin.common.urn.CorpGroupUrn... rest) {
        this(new DataList((rest.length + 1)));
        add(first);
        addAll(Arrays.asList(rest));
    }

    public static ArrayDataSchema dataSchema() {
        return SCHEMA;
    }

    @Override
    public CorpGroupUrnArray clone()
        throws CloneNotSupportedException
    {
        CorpGroupUrnArray __clone = ((CorpGroupUrnArray) super.clone());
        return __clone;
    }

    @Override
    public CorpGroupUrnArray copy()
        throws CloneNotSupportedException
    {
        CorpGroupUrnArray __copy = ((CorpGroupUrnArray) super.copy());
        return __copy;
    }

    @Override
    protected Object coerceInput(com.linkedin.common.urn.CorpGroupUrn object)
        throws ClassCastException
    {
        ArgumentUtil.notNull(object, "object");
        return DataTemplateUtil.coerceCustomInput(object, com.linkedin.common.urn.CorpGroupUrn.class);
    }

    @Override
    protected com.linkedin.common.urn.CorpGroupUrn coerceOutput(Object object)
        throws TemplateOutputCastException
    {
        assert(object != null);
        return DataTemplateUtil.coerceCustomOutput(object, com.linkedin.common.urn.CorpGroupUrn.class);
    }

}
