
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized data platforms available
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/DataPlatformUrn.pdl.")
public class DataPlatformUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized data platforms available*/@java.class=\"com.linkedin.common.urn.DataPlatformUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data platforms available\",\"entityType\":\"dataPlatform\",\"fields\":[{\"doc\":\"data platform name i.e. hdfs, oracle, espresso\",\"maxLength\":25,\"name\":\"platformName\",\"type\":\"string\"}],\"maxLength\":45,\"name\":\"DataPlatform\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:wherehows\"}typeref DataPlatformUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataPlatformUrn.class);
    }

    public DataPlatformUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
