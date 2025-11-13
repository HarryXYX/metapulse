
package com.linkedin.settings;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/settings/NotificationSetting.pdl.")
public enum NotificationSettingValue {


    /**
     * Setting is enabled.
     * 
     */
    ENABLED,

    /**
     * Setting is disabled.
     * 
     */
    DISABLED,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.settings,enum NotificationSettingValue{/**Setting is enabled.*/ENABLED/**Setting is disabled.*/DISABLED}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
