
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 *  The final result of evaluating an assertion, e.g. SUCCESS, FAILURE, or ERROR.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/AssertionResultType.pdl.")
public enum AssertionResultType {


    /**
     *  The Assertion has not yet been fully evaluated
     * 
     */
    INIT,

    /**
     *  The Assertion Succeeded
     * 
     */
    SUCCESS,

    /**
     *  The Assertion Failed
     * 
     */
    FAILURE,

    /**
     *  The Assertion encountered an Error
     * 
     */
    ERROR,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/** The final result of evaluating an assertion, e.g. SUCCESS, FAILURE, or ERROR.*/enum AssertionResultType{/** The Assertion has not yet been fully evaluated*/INIT/** The Assertion Succeeded*/SUCCESS/** The Assertion Failed*/FAILURE/** The Assertion encountered an Error*/ERROR}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
