
package com.linkedin.query;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/query/QueryProperties.pdl.")
public enum QuerySource {


    /**
     * The query was entered manually by a user (via the UI).
     * 
     */
    MANUAL,

    /**
     * The query was discovered by a crawler.
     * 
     */
    SYSTEM,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.query,enum QuerySource{/**The query was entered manually by a user (via the UI).*/MANUAL/**The query was discovered by a crawler.*/SYSTEM}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
