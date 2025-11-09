
package com.linkedin.view;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/view/DataHubViewInfo.pdl.")
public enum DataHubViewType {


    /**
     * A view private for a specific person.
     * 
     */
    PERSONAL,

    /**
     * A global view, which all users can see and use.
     * 
     */
    GLOBAL,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.view,enum DataHubViewType{/**A view private for a specific person.*/PERSONAL/**A global view, which all users can see and use.*/GLOBAL}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
