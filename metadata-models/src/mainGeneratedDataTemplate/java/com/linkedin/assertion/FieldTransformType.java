
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/FieldTransform.pdl.")
public enum FieldTransformType {


    /**
     * Obtain the length of a string field / column (applicable to string types)
     * 
     */
    LENGTH,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum FieldTransformType{/**Obtain the length of a string field / column (applicable to string types)*/LENGTH}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
