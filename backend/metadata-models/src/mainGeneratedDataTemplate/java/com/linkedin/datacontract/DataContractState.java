
package com.linkedin.datacontract;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/datacontract/DataContractStatus.pdl.")
public enum DataContractState {


    /**
     * The data contract is active.
     * 
     */
    ACTIVE,

    /**
     * The data contract is pending implementation.
     * 
     */
    PENDING,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datacontract,enum DataContractState{/**The data contract is active.*/ACTIVE/**The data contract is pending implementation.*/PENDING}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
