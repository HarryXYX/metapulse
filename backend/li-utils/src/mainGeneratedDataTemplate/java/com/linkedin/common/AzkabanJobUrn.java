
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized azkaban job identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/AzkabanJobUrn.pdl.")
public class AzkabanJobUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized azkaban job identifier.*/@java.class=\"com.linkedin.common.urn.AzkabanJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized azkaban job identifier.\",\"entityType\":\"azkabanJob\",\"fields\":[{\"doc\":\"Standardized azkaban flow urn representing the flow for the job\",\"name\":\"flow\",\"type\":\"com.linkedin.common.urn.AzkabanFlowUrn\"},{\"doc\":\"Id or name of the azkaban job\",\"maxLength\":200,\"name\":\"jobID\",\"type\":\"string\"}],\"maxLength\":464,\"name\":\"AzkabanJob\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref AzkabanJobUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.AzkabanJobUrn.class);
    }

    public AzkabanJobUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
