
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized data processing job identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/DataJobUrn.pdl.")
public class DataJobUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized data processing job identifier.*/@java.class=\"com.linkedin.common.urn.DataJobUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing job identifier.\",\"entityType\":\"dataJob\",\"fields\":[{\"doc\":\"Standardized data processing flow urn representing the flow for the job\",\"name\":\"flow\",\"type\":\"com.linkedin.common.urn.DataFlowUrn\"},{\"doc\":\"Unique identifier of the data job\",\"maxLength\":200,\"name\":\"jobID\",\"type\":\"string\"}],\"maxLength\":594,\"name\":\"DataJob\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataJobUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataJobUrn.class);
    }

    public DataJobUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
