
package com.linkedin.datahub;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/datahub/DataHubSearchConfig.pdl.")
public enum SearchFieldType {

    KEYWORD,
    TEXT,
    TEXT_PARTIAL,
    BROWSE_PATH,
    URN,
    URN_PARTIAL,
    BOOLEAN,
    COUNT,
    DATETIME,
    OBJECT,
    BROWSE_PATH_V2,
    WORD_GRAM,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.datahub,enum SearchFieldType{KEYWORD,TEXT,TEXT_PARTIAL,BROWSE_PATH,URN,URN_PARTIAL,BOOLEAN,COUNT,DATETIME,OBJECT,BROWSE_PATH_V2,WORD_GRAM}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
