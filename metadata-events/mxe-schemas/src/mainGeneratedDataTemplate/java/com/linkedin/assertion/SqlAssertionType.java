
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/SqlAssertionInfo.pdl.")
public enum SqlAssertionType {


    /**
     * A SQL Metric Assertion, e.g. one based on a numeric value returned by an arbitrary SQL query.
     * 
     */
    METRIC,

    /**
     * A SQL assertion that is evaluated against the CHANGE in a metric assertion
     * over time.
     * 
     */
    METRIC_CHANGE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum SqlAssertionType{/**A SQL Metric Assertion, e.g. one based on a numeric value returned by an arbitrary SQL query.*/METRIC/**A SQL assertion that is evaluated against the CHANGE in a metric assertion\nover time.*/METRIC_CHANGE}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
