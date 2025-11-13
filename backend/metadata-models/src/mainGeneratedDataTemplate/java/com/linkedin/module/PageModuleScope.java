
package com.linkedin.module;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/module/DataHubPageModuleVisibility.pdl.")
public enum PageModuleScope {


    /**
     * This module is used for individual use only
     * 
     */
    PERSONAL,

    /**
     * This module is discoverable and can be used by any user on the platform
     * 
     */
    GLOBAL,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.module,enum PageModuleScope{/**This module is used for individual use only*/PERSONAL/**This module is discoverable and can be used by any user on the platform*/GLOBAL}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
