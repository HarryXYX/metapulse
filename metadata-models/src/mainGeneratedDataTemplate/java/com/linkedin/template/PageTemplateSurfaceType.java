
package com.linkedin.template;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/template/DataHubPageTemplateSurface.pdl.")
public enum PageTemplateSurfaceType {


    /**
     * This template applies to what to display on the home page for users.
     * 
     */
    HOME_PAGE,

    /**
     * This template applies to what to display on asset summary pages
     * 
     */
    ASSET_SUMMARY,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.template,enum PageTemplateSurfaceType{/**This template applies to what to display on the home page for users.*/HOME_PAGE/**This template applies to what to display on asset summary pages*/ASSET_SUMMARY}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
