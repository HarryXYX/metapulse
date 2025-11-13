
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/FreshnessFieldKind.pdl.")
public enum FreshnessFieldKind {


    /**
     * Determine that a change has occurred by inspecting an last modified field which
     * represents the last time at which a row was changed.
     * 
     */
    LAST_MODIFIED,

    /**
     * Determine that a change has occurred by inspecting a field which should be tracked as the
     * "high watermark" for the table. This should be an ascending number or date field.
     * 
     * If rows with this column have not been added since the previous check
     * then the Freshness Assertion will fail.
     * 
     */
    HIGH_WATERMARK,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum FreshnessFieldKind{/**Determine that a change has occurred by inspecting an last modified field which\nrepresents the last time at which a row was changed.*/LAST_MODIFIED/**Determine that a change has occurred by inspecting a field which should be tracked as the\n\"high watermark\" for the table. This should be an ascending number or date field.\n\nIf rows with this column have not been added since the previous check\nthen the Freshness Assertion will fail.*/HIGH_WATERMARK}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
