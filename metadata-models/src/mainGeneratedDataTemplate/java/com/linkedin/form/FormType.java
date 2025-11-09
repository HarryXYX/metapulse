
package com.linkedin.form;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/form/FormInfo.pdl.")
public enum FormType {


    /**
     * A form simply used for collecting metadata fields for an entity.
     * 
     */
    COMPLETION,

    /**
     * This form is used for "verifying" that entities comply with a policy via presence of a specific set of metadata fields.
     * 
     */
    VERIFICATION,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.form,enum FormType{/**A form simply used for collecting metadata fields for an entity.*/COMPLETION/**This form is used for \"verifying\" that entities comply with a policy via presence of a specific set of metadata fields.*/VERIFICATION}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
