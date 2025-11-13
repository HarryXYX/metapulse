
package com.linkedin.metadata.graph;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Direction between two nodes in the lineage graph
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/metadata/graph/LineageDirection.pdl.")
public enum LineageDirection {


    /**
     * Upstream, or left-to-right in the lineage visualization
     * 
     */
    UPSTREAM,

    /**
     * Downstream, or right-to-left in the lineage visualization
     * 
     */
    DOWNSTREAM,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.metadata.graph/**Direction between two nodes in the lineage graph*/enum LineageDirection{/**Upstream, or left-to-right in the lineage visualization*/UPSTREAM/**Downstream, or right-to-left in the lineage visualization*/DOWNSTREAM}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
