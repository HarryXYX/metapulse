
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/AssertionResultError.pdl.")
public enum AssertionResultErrorType {


    /**
     *  Source is unreachable
     * 
     */
    SOURCE_CONNECTION_ERROR,

    /**
     *  Source query failed to execute
     * 
     */
    SOURCE_QUERY_FAILED,

    /**
     *  Insufficient data to evaluate the assertion
     * 
     */
    INSUFFICIENT_DATA,

    /**
     *  Invalid parameters were detected
     * 
     */
    INVALID_PARAMETERS,

    /**
     *  Event type not supported by the specified source
     * 
     */
    INVALID_SOURCE_TYPE,

    /**
     *  Unsupported platform
     * 
     */
    UNSUPPORTED_PLATFORM,

    /**
     *  Error while executing a custom SQL assertion
     * 
     */
    CUSTOM_SQL_ERROR,

    /**
     *  Error while executing a field assertion
     * 
     */
    FIELD_ASSERTION_ERROR,

    /**
     *  Unknown error
     * 
     */
    UNKNOWN_ERROR,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum AssertionResultErrorType{/** Source is unreachable*/SOURCE_CONNECTION_ERROR/** Source query failed to execute*/SOURCE_QUERY_FAILED/** Insufficient data to evaluate the assertion*/INSUFFICIENT_DATA/** Invalid parameters were detected*/INVALID_PARAMETERS/** Event type not supported by the specified source*/INVALID_SOURCE_TYPE/** Unsupported platform*/UNSUPPORTED_PLATFORM/** Error while executing a custom SQL assertion*/CUSTOM_SQL_ERROR/** Error while executing a field assertion*/FIELD_ASSERTION_ERROR/** Unknown error*/UNKNOWN_ERROR}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
