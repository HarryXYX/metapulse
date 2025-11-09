
package com.linkedin.dataset;

import javax.annotation.Generated;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.schema.TyperefDataSchema;
import com.linkedin.data.template.DataTemplateUtil;
import com.linkedin.data.template.TyperefInfo;


/**
 * Schema field path. TODO: Add formal documentation on normalization rules.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/dataset/SchemaFieldPath.pdl.")
public class SchemaFieldPath
    extends TyperefInfo
{

    private final static TyperefDataSchema SCHEMA = ((TyperefDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**Schema field path. TODO: Add formal documentation on normalization rules.*/typeref SchemaFieldPath=string", SchemaFormatType.PDL));

    public SchemaFieldPath() {
        super(SCHEMA);
    }

    public static TyperefDataSchema dataSchema() {
        return SCHEMA;
    }

}
