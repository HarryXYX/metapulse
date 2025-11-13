
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized erModelRelationship identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/ERModelRelationshipUrn.pdl.")
public class ERModelRelationshipUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized erModelRelationship identifier.*/@java.class=\"com.linkedin.common.urn.ERModelRelationshipUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized ERModelRelationship identifier.\",\"entityType\":\"erModelRelationship\",\"fields\":[{\"doc\":\"ERModelRelationship native name e.g. <db>.<table>, /dir/subdir/<name>, or <name>\",\"maxLength\":284,\"name\":\"id\",\"type\":\"string\"}],\"maxLength\":284,\"name\":\"ERModelRelationship\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref ERModelRelationshipUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.ERModelRelationshipUrn.class);
    }

    public ERModelRelationshipUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
