
package com.linkedin.event.notification;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * A type of sink / platform to send a notification to.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/event/notification/NotificationSinkType.pdl.")
public enum NotificationSinkType {


    /**
     * Slack target type.
     * 
     */
    SLACK,

    /**
     * Email target type.
     * 
     */
    EMAIL,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.event.notification/**A type of sink / platform to send a notification to.*/enum NotificationSinkType{/**Slack target type.*/SLACK/**Email target type.*/EMAIL}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
