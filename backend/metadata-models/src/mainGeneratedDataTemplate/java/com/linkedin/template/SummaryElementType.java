
package com.linkedin.template;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/template/SummaryElement.pdl.")
public enum SummaryElementType {

    CREATED,
    TAGS,
    GLOSSARY_TERMS,
    OWNERS,
    DOMAIN,
    STRUCTURED_PROPERTY,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.template,enum SummaryElementType{CREATED,TAGS,GLOSSARY_TERMS,OWNERS,DOMAIN,STRUCTURED_PROPERTY}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
