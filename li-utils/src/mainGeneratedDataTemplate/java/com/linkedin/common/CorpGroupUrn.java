
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Corporate group's AD/LDAP login
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/CorpGroupUrn.pdl.")
public class CorpGroupUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Corporate group's AD/LDAP login*/@java.class=\"com.linkedin.common.urn.CorpGroupUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Corporate group's AD/LDAP login\",\"entityType\":\"corpGroup\",\"fields\":[{\"doc\":\"The name of the AD/LDAP group.\",\"maxLength\":128,\"name\":\"groupName\",\"type\":\"string\"}],\"maxLength\":145,\"name\":\"CorpGroup\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:security\"}typeref CorpGroupUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.CorpGroupUrn.class);
    }

    public CorpGroupUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
