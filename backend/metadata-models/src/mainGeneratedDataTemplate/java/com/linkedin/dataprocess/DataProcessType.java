
package com.linkedin.dataprocess;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataprocess/DataProcessInstanceProperties.pdl.")
public enum DataProcessType {

    BATCH_SCHEDULED,
    BATCH_AD_HOC,
    STREAMING,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataprocess,enum DataProcessType{BATCH_SCHEDULED,BATCH_AD_HOC,STREAMING}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
