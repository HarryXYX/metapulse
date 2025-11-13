
package com.linkedin.dataset;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The type of upstream entity in a fine-grained lineage
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/dataset/FineGrainedLineageUpstreamType.pdl.")
public enum FineGrainedLineageUpstreamType {


    /**
     *  Indicates that this lineage is originating from upstream field(s)
     * 
     */
    FIELD_SET,

    /**
     *  Indicates that this lineage is originating from upstream dataset(s)
     * 
     */
    DATASET,

    /**
     *  Indicates that there is no upstream lineage i.e. the downstream field is not a derived field
     * 
     */
    NONE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.dataset/**The type of upstream entity in a fine-grained lineage*/enum FineGrainedLineageUpstreamType{/** Indicates that this lineage is originating from upstream field(s)*/FIELD_SET/** Indicates that this lineage is originating from upstream dataset(s)*/DATASET/** Indicates that there is no upstream lineage i.e. the downstream field is not a derived field*/NONE}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
