
package com.linkedin.dataprocess;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataprocess/DataProcessInstanceRunResult.pdl.")
public enum RunResultType {


    /**
     *  The Run Succeeded
     * 
     */
    SUCCESS,

    /**
     *  The Run Failed
     * 
     */
    FAILURE,

    /**
     *  The Run Skipped
     * 
     */
    SKIPPED,

    /**
     *  The Run Failed and will Retry
     * 
     */
    UP_FOR_RETRY,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataprocess,enum RunResultType{/** The Run Succeeded*/SUCCESS/** The Run Failed*/FAILURE/** The Run Skipped*/SKIPPED/** The Run Failed and will Retry*/UP_FOR_RETRY}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
