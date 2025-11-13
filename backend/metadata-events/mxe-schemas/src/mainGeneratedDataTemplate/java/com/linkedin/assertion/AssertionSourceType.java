
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/AssertionSource.pdl.")
public enum AssertionSourceType {


    /**
     * The assertion was defined natively on DataHub by a user.
     * DataHub Cloud only
     * 
     */
    NATIVE,

    /**
     * The assertion was defined and managed externally of DataHub.
     * 
     */
    EXTERNAL,

    /**
     * The assertion was inferred, e.g. from offline AI / ML models.
     * DataHub Cloud only
     * 
     */
    INFERRED,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum AssertionSourceType{/**The assertion was defined natively on DataHub by a user.\nDataHub Cloud only*/NATIVE/**The assertion was defined and managed externally of DataHub.*/EXTERNAL/**The assertion was inferred, e.g. from offline AI / ML models.\nDataHub Cloud only*/INFERRED}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
