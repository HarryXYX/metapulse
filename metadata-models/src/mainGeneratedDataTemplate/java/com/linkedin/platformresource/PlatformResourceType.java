
package com.linkedin.platformresource;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * A set of symbols for loose agreements between producers and consumers of
 *   platform resources
 *   See @PlatformResourceInfo.resourceType for where this can be populated into
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/platformresource/PlatformResourceType.pdl.")
public enum PlatformResourceType {


    /**
     * e.g. a Slack member resource, Looker user resource, etc.
     * 
     */
    USER_INFO,

    /**
     * e.g. a Slack channel
     * 
     */
    CONVERSATION,

    /**
     * e.g. Looker mapping of all user ids
     * 
     */
    USER_ID_MAPPING,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.platformresource/**A set of symbols for loose agreements between producers and consumers of\n  platform resources\n  See @PlatformResourceInfo.resourceType for where this can be populated into\n*/enum PlatformResourceType{/**e.g. a Slack member resource, Looker user resource, etc.*/USER_INFO/**e.g. a Slack channel*/CONVERSATION/**e.g. Looker mapping of all user ids*/USER_ID_MAPPING}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
