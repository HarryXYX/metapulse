
package com.linkedin.dataset;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The type of downstream field(s) in a fine-grained lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/FineGrainedLineageDownstreamType.pdl.")
public enum FineGrainedLineageDownstreamType {


    /**
     *  Indicates that the lineage is for a single, specific, downstream field
     * 
     */
    FIELD,

    /**
     *  Indicates that the lineage is for a set of downstream fields
     * 
     */
    FIELD_SET,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**The type of downstream field(s) in a fine-grained lineage*/enum FineGrainedLineageDownstreamType{/** Indicates that the lineage is for a single, specific, downstream field*/FIELD/** Indicates that the lineage is for a set of downstream fields*/FIELD_SET}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
