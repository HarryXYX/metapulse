
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Should match the forms used in configs: envInfoFinder.envToEnvByteMap. PROD-ELA4, PROD-ECH3, EI, EI2, prod-lva1, etc
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/FabricUrn.pdl.")
public class FabricUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Should match the forms used in configs: envInfoFinder.envToEnvByteMap. PROD-ELA4, PROD-ECH3, EI, EI2, prod-lva1, etc*/@java.class=\"com.linkedin.common.urn.FabricUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"doc\":\"Should match the forms used in configs: envInfoFinder.envToEnvByteMap. PROD-ELA4, PROD-ECH3, EI, EI2, prod-lva1, etc\",\"entityType\":\"fabric\",\"fields\":[{\"doc\":\"\",\"maxLength\":36,\"name\":\"fabricName\",\"type\":\"string\"}],\"maxLength\":50,\"name\":\"Fabric\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:Tools\"}typeref FabricUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.FabricUrn.class);
    }

    public FabricUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
