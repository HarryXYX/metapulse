
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * An enum to represent a type of change in an assertion value, metric, or measurement.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/AssertionValueChangeType.pdl.")
public enum AssertionValueChangeType {


    /**
     * A change that is defined in absolute terms.
     * 
     */
    ABSOLUTE,

    /**
     * A change that is defined in relative terms using percentage change
     * from the original value.
     * 
     */
    PERCENTAGE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**An enum to represent a type of change in an assertion value, metric, or measurement.*/enum AssertionValueChangeType{/**A change that is defined in absolute terms.*/ABSOLUTE/**A change that is defined in relative terms using percentage change\nfrom the original value.*/PERCENTAGE}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
