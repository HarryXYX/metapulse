
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The source of an operation
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/OperationSourceType.pdl.")
public enum OperationSourceType {


    /**
     * Provided by a Data Process
     * 
     */
    DATA_PROCESS,

    /**
     * Rows were updated
     * 
     */
    DATA_PLATFORM,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**The source of an operation*/enum OperationSourceType{/**Provided by a Data Process*/DATA_PROCESS/**Rows were updated*/DATA_PLATFORM}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
