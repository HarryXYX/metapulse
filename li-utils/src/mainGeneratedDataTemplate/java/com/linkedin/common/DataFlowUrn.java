
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.Custom;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Standardized data processing flow identifier.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from li-utils/src/main/pegasus/com/linkedin/common/DataFlowUrn.pdl.")
public class DataFlowUrn
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Standardized data processing flow identifier.*/@java.class=\"com.linkedin.common.urn.DataFlowUrn\"@validate.`com.linkedin.common.validator.TypedUrnValidator`={\"accessible\":true,\"constructable\":true,\"doc\":\"Standardized data processing flow identifier.\",\"entityType\":\"dataFlow\",\"fields\":[{\"doc\":\"Workflow manager like azkaban, airflow which orchestrates the flow\",\"maxLength\":50,\"name\":\"orchestrator\",\"type\":\"string\"},{\"doc\":\"Unique Identifier of the data flow\",\"maxLength\":200,\"name\":\"flowId\",\"type\":\"string\"},{\"doc\":\"Cluster where the flow is executed\",\"maxLength\":100,\"name\":\"cluster\",\"type\":\"string\"}],\"maxLength\":373,\"name\":\"DataFlow\",\"namespace\":\"li\",\"owners\":[\"urn:li:corpuser:fbar\",\"urn:li:corpuser:bfoo\"],\"owningTeam\":\"urn:li:internalTeam:datahub\"}typeref DataFlowUrn=string", SchemaFormatType.PDL));

    static {
        Custom.initializeCustomClass(com.linkedin.common.urn.DataFlowUrn.class);
    }

    public DataFlowUrn() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
