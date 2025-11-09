
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized process identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/DataProcessUrn.pdl.")
public class DataProcessUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized process identifier.*/@java.class=\"com.linkedin.common.urn.DataProcessUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized process identifier.\",\"entityType\":\"dataProcess\",\"fields\":[{\"doc\":\"process name i.e. an ETL job name\",\"maxLength\":25,\"name\":\"name\",\"type\":\"string\"},{\"doc\":\"Standardized Orchestrator where data process is defined.\",\"maxLength\":100,\"name\":\"orchestrator\",\"type\":\"string\"},{\"doc\":\"Fabric type where dataset belongs to or where it was generated.\",\"name\":\"origin\",\"type\":\"com.linkedin.common.FabricType\"}],\"maxLength\":284,\"name\":\"DataProcess\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataProcessUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataProcessUrn.class);
    }

    public DataProcessUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
