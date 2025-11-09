
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized azkaban flow identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/AzkabanFlowUrn.pdl.")
public class AzkabanFlowUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized azkaban flow identifier.*/@java.class=\"com.linkedin.common.urn.AzkabanFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized azkaban flow identifier.\",\"entityType\":\"azkabanFlow\",\"fields\":[{\"doc\":\"Cluster on which the azkaban flow is deployed\",\"maxLength\":20,\"name\":\"cluster\",\"type\":\"string\"},{\"doc\":\"Azkaban project name which is unique per cluster\",\"maxLength\":100,\"name\":\"project\",\"type\":\"string\"},{\"doc\":\"Id or name of the azkaban flow\",\"maxLength\":100,\"name\":\"flowId\",\"type\":\"string\"}],\"maxLength\":243,\"name\":\"AzkabanFlow\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref AzkabanFlowUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.AzkabanFlowUrn.class);
    }

    public AzkabanFlowUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
