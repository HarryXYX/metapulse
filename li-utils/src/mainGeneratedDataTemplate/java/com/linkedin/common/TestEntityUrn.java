
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized dashboard identifier
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/TestEntityUrn.pdl.")
public class TestEntityUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized dashboard identifier*/@java.class=\"com.linkedin.common.urn.TestEntityUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized dashboard identifier\",\"entityType\":\"testEntity\",\"fields\":[{\"doc\":\"First key part.\",\"maxLength\":20,\"name\":\"keyPart1\",\"type\":\"string\"},{\"doc\":\"Second key part\",\"maxLength\":200,\"name\":\"keyPart2\",\"type\":\"string\"},{\"doc\":\"Third key part\",\"maxLength\":200,\"name\":\"keyPart2\",\"type\":\"string\"}],\"maxLength\":240,\"name\":\"TestEntity\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref TestEntityUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.TestEntityUrn.class);
    }

    public TestEntityUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
