
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/AssertionAction.pdl.")
public enum AssertionActionType {


    /**
     * Raise an incident.
     * 
     */
    RAISE_INCIDENT,

    /**
     * Resolve open incidents related to the assertion.
     * 
     */
    RESOLVE_INCIDENT,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum AssertionActionType{/**Raise an incident.*/RAISE_INCIDENT/**Resolve open incidents related to the assertion.*/RESOLVE_INCIDENT}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
