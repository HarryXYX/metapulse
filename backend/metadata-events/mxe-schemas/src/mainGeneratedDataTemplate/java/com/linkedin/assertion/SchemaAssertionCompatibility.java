
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/SchemaAssertionInfo.pdl.")
public enum SchemaAssertionCompatibility {


    /**
     * The actual schema must be exactly the same as the expected schema
     * 
     */
    EXACT_MATCH,

    /**
     * The actual schema must be a superset of the expected schema
     * 
     */
    SUPERSET,

    /**
     * The actual schema must be a subset of the expected schema
     * 
     */
    SUBSET,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum SchemaAssertionCompatibility{/**The actual schema must be exactly the same as the expected schema*/EXACT_MATCH/**The actual schema must be a superset of the expected schema*/SUPERSET/**The actual schema must be a subset of the expected schema*/SUBSET}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
