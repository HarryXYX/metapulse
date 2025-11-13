
package com.linkedin.form;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/form/FormPrompt.pdl.")
public enum FormPromptType {


    /**
     * This prompt is meant to apply a structured property to an entity
     * 
     */
    STRUCTURED_PROPERTY,

    /**
     * This prompt is meant to apply a structured property to a schema fields entity
     * 
     */
    FIELDS_STRUCTURED_PROPERTY,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.form,enum FormPromptType{/**This prompt is meant to apply a structured property to an entity*/STRUCTURED_PROPERTY/**This prompt is meant to apply a structured property to a schema fields entity*/FIELDS_STRUCTURED_PROPERTY}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
