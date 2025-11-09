
package com.linkedin.query;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/query/QueryStatement.pdl.")
public enum QueryLanguage {


    /**
     * A SQL Query
     * 
     */
    SQL,

    /**
     * Unknown query language
     * 
     */
    UNKNOWN,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.query,enum QueryLanguage{/**A SQL Query*/SQL/**Unknown query language*/UNKNOWN}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
