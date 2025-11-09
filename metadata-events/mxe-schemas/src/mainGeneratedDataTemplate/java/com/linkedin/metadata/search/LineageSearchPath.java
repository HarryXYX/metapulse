
package com.linkedin.metadata.search;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The path taken when doing search across lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/search/LineageSearchPath.pdl.")
public enum LineageSearchPath {


    /**
     * Designates the tortoise lineage code path
     * 
     */
    TORTOISE,

    /**
     * Designates the lightning lineage code path
     * 
     */
    LIGHTNING,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.search/**The path taken when doing search across lineage*/enum LineageSearchPath{/**Designates the tortoise lineage code path*/TORTOISE/**Designates the lightning lineage code path*/LIGHTNING}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
