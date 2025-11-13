
package com.linkedin.post;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Enum defining the type of content held in a Post.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/post/PostContentType.pdl.")
public enum PostContentType {


    /**
     * Text content
     * 
     */
    TEXT,

    /**
     * Link content
     * 
     */
    LINK,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.post/**Enum defining the type of content held in a Post.*/enum PostContentType{/**Text content*/TEXT/**Link content*/LINK}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
