
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Enum to define the operation type when an entity changes.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/common/OperationType.pdl.")
public enum OperationType {


    /**
     * Rows were inserted
     * 
     */
    INSERT,

    /**
     * Rows were updated
     * 
     */
    UPDATE,

    /**
     * Rows were deleted
     * 
     */
    DELETE,

    /**
     * Asset was created
     * 
     */
    CREATE,

    /**
     * Asset was altered
     * 
     */
    ALTER,

    /**
     * Asset was dropped
     * 
     */
    DROP,

    /**
     * Custom asset operation. If this is set, ensure customOperationType is filled out.
     * 
     */
    CUSTOM,
    UNKNOWN,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Enum to define the operation type when an entity changes.*/enum OperationType{/**Rows were inserted*/INSERT/**Rows were updated*/UPDATE/**Rows were deleted*/DELETE/**Asset was created*/CREATE/**Asset was altered*/ALTER/**Asset was dropped*/DROP/**Custom asset operation. If this is set, ensure customOperationType is filled out.*/CUSTOM,UNKNOWN}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
