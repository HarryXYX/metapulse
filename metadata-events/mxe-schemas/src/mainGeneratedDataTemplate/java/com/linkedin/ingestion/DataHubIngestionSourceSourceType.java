
package com.linkedin.ingestion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/ingestion/DataHubIngestionSourceInfo.pdl.")
public enum DataHubIngestionSourceSourceType {


    /**
     * A system internal source, e.g. for running search indexing operations, feature computation, etc.
     * 
     */
    SYSTEM,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ingestion,enum DataHubIngestionSourceSourceType{/**A system internal source, e.g. for running search indexing operations, feature computation, etc.*/SYSTEM}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
