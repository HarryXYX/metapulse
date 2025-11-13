
package com.linkedin.incident;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/incident/IncidentSource.pdl.")
public enum IncidentSourceType {


    /**
     * Manually created incident, via UI or API.
     * 
     */
    MANUAL,

    /**
     * An assertion has failed, triggering the incident.
     * 
     */
    ASSERTION_FAILURE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.incident,enum IncidentSourceType{/**Manually created incident, via UI or API.*/MANUAL/**An assertion has failed, triggering the incident.*/ASSERTION_FAILURE}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
