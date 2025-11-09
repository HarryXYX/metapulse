
package com.linkedin.incident;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/incident/IncidentStatus.pdl.")
public enum IncidentState {


    /**
     * The incident is ongoing, or active.
     * 
     */
    ACTIVE,

    /**
     * The incident is resolved.
     * 
     */
    RESOLVED,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.incident,enum IncidentState{/**The incident is ongoing, or active.*/ACTIVE/**The incident is resolved.*/RESOLVED}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
