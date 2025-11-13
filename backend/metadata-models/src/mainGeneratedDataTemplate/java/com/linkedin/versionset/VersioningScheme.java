
package com.linkedin.versionset;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/versionset/VersioningScheme.pdl.")
public enum VersioningScheme {


    /**
     * String sorted lexicographically.
     * 
     */
    LEXICOGRAPHIC_STRING,

    /**
     * String managed by DataHub. Currently, an 8 character alphabetical string.
     * 
     */
    ALPHANUMERIC_GENERATED_BY_DATAHUB,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.versionset,enum VersioningScheme{/**String sorted lexicographically.*/LEXICOGRAPHIC_STRING/**String managed by DataHub. Currently, an 8 character alphabetical string.*/ALPHANUMERIC_GENERATED_BY_DATAHUB}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
