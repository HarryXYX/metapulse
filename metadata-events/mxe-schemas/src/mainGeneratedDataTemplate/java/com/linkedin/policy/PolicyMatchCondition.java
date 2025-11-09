
package com.linkedin.policy;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The matching condition in a filter criterion
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/policy/PolicyMatchCondition.pdl.")
public enum PolicyMatchCondition {


    /**
     * Whether the field matches the value
     * 
     */
    EQUALS,

    /**
     * Whether the field value starts with the value
     * 
     */
    STARTS_WITH,

    /**
     * Whether the field does not match the value
     * 
     */
    NOT_EQUALS,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.policy/**The matching condition in a filter criterion*/enum PolicyMatchCondition{/**Whether the field matches the value*/EQUALS/**Whether the field value starts with the value*/STARTS_WITH/**Whether the field does not match the value*/NOT_EQUALS}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
