
package com.linkedin.ermodelrelation;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/ermodelrelation/ERModelRelationshipProperties.pdl.")
public enum ERModelRelationshipCardinality {

    ONE_ONE,
    ONE_N,
    N_ONE,
    N_N,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.ermodelrelation,enum ERModelRelationshipCardinality{ONE_ONE,ONE_N,N_ONE,N_N}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
