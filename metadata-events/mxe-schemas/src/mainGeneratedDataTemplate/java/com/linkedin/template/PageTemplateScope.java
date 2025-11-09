
package com.linkedin.template;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/template/DataHubPageTemplateVisibility.pdl.")
public enum PageTemplateScope {


    /**
     * This template is used for individual use only
     * 
     */
    PERSONAL,

    /**
     * This template is used across users
     * 
     */
    GLOBAL,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.template,enum PageTemplateScope{/**This template is used for individual use only*/PERSONAL/**This template is used across users*/GLOBAL}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
