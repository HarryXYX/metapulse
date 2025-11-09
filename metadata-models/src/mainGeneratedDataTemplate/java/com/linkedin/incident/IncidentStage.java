
package com.linkedin.incident;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/incident/IncidentStatus.pdl.")
public enum IncidentStage {


    /**
     * The impact and priority of the incident is being actively assessed.
     * 
     */
    TRIAGE,

    /**
     * The incident root cause is being investigated.
     * 
     */
    INVESTIGATION,

    /**
     * The incident is in the remediation stage.
     * 
     */
    WORK_IN_PROGRESS,

    /**
     * The incident is in the resolved as completed stage.
     * 
     */
    FIXED,

    /**
     * The incident is in the resolved with no action required state, e.g. the
     * incident was a false positive, or was expected.
     * 
     */
    NO_ACTION_REQUIRED,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.incident,enum IncidentStage{/**The impact and priority of the incident is being actively assessed.*/TRIAGE/**The incident root cause is being investigated.*/INVESTIGATION/**The incident is in the remediation stage.*/WORK_IN_PROGRESS/**The incident is in the resolved as completed stage.*/FIXED/**The incident is in the resolved with no action required state, e.g. the\nincident was a false positive, or was expected.*/NO_ACTION_REQUIRED}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
