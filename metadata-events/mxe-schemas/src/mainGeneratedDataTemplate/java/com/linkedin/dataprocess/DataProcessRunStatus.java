
package com.linkedin.dataprocess;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataprocess/DataProcessInstanceRunEvent.pdl.")
public enum DataProcessRunStatus {


    /**
     * The status where the Data processing run is in.
     * 
     */
    STARTED,
    COMPLETE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataprocess,enum DataProcessRunStatus{/**The status where the Data processing run is in.*/STARTED,COMPLETE}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
