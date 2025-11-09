
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/IncrementingSegmentFieldTransformer.pdl.")
public enum IncrementingSegmentFieldTransformerType {


    /**
     * Rounds a timestamp (in seconds) down to the start of the month.
     * 
     */
    TIMESTAMP_MS_TO_MINUTE,

    /**
     * Rounds a timestamp (in milliseconds) down to the nearest hour.
     * 
     */
    TIMESTAMP_MS_TO_HOUR,

    /**
     * Rounds a timestamp (in milliseconds) down to the start of the day.
     * 
     */
    TIMESTAMP_MS_TO_DATE,

    /**
     * Rounds a timestamp (in milliseconds) down to the start of the month
     * 
     */
    TIMESTAMP_MS_TO_MONTH,

    /**
     * Rounds a timestamp (in milliseconds) down to the start of the year
     * 
     */
    TIMESTAMP_MS_TO_YEAR,

    /**
     * Rounds a numeric value down to the nearest integer.
     * 
     */
    FLOOR,

    /**
     * Rounds a numeric value up to the nearest integer.
     * 
     */
    CEILING,

    /**
     * A backdoor to provide a native operator type specific to a given source system like
     * Snowflake, Redshift, BQ, etc.
     * 
     */
    NATIVE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum IncrementingSegmentFieldTransformerType{/**Rounds a timestamp (in seconds) down to the start of the month.*/TIMESTAMP_MS_TO_MINUTE/**Rounds a timestamp (in milliseconds) down to the nearest hour.*/TIMESTAMP_MS_TO_HOUR/**Rounds a timestamp (in milliseconds) down to the start of the day.*/TIMESTAMP_MS_TO_DATE/**Rounds a timestamp (in milliseconds) down to the start of the month*/TIMESTAMP_MS_TO_MONTH/**Rounds a timestamp (in milliseconds) down to the start of the year*/TIMESTAMP_MS_TO_YEAR/**Rounds a numeric value down to the nearest integer.*/FLOOR/**Rounds a numeric value up to the nearest integer.*/CEILING/**A backdoor to provide a native operator type specific to a given source system like\nSnowflake, Redshift, BQ, etc.*/NATIVE}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
