
package com.linkedin.post;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Enum defining types of Posts.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/post/PostType.pdl.")
public enum PostType {


    /**
     * The Post is an Home Page announcement.
     * 
     */
    HOME_PAGE_ANNOUNCEMENT,

    /**
     * The Post is an Entity level announcement.
     * 
     */
    ENTITY_ANNOUNCEMENT,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.post/**Enum defining types of Posts.*/enum PostType{/**The Post is an Home Page announcement.*/HOME_PAGE_ANNOUNCEMENT/**The Post is an Entity level announcement.*/ENTITY_ANNOUNCEMENT}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
