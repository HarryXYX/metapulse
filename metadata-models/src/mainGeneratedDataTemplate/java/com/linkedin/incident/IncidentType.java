
package com.linkedin.incident;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * A type of asset incident
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/incident/IncidentType.pdl.")
public enum IncidentType {


    /**
     * An Freshness Assertion has failed, triggering the incident.
     * Raised on entities where assertions are configured to generate incidents.
     * 
     */
    FRESHNESS,

    /**
     * An Volume Assertion has failed, triggering the incident.
     * Raised on entities where assertions are configured to generate incidents.
     * 
     */
    VOLUME,

    /**
     * A Field Assertion has failed, triggering the incident.
     * Raised on entities where assertions are configured to generate incidents.
     * 
     */
    FIELD,

    /**
     * A raw SQL-statement based assertion has failed, triggering the incident.
     * Raised on entities where assertions are configured to generate incidents.
     * 
     */
    SQL,

    /**
     * A Data Schema assertion has failed, triggering the incident.
     * Raised on entities where assertions are configured to generate incidents.
     * 
     */
    DATA_SCHEMA,

    /**
     * A misc. operational incident, e.g. failure to materialize a dataset.
     * 
     */
    OPERATIONAL,

    /**
     * A custom type of incident
     * 
     */
    CUSTOM,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.incident/**A type of asset incident*/enum IncidentType{/**An Freshness Assertion has failed, triggering the incident.\nRaised on entities where assertions are configured to generate incidents.*/FRESHNESS/**An Volume Assertion has failed, triggering the incident.\nRaised on entities where assertions are configured to generate incidents.*/VOLUME/**A Field Assertion has failed, triggering the incident.\nRaised on entities where assertions are configured to generate incidents.*/FIELD/**A raw SQL-statement based assertion has failed, triggering the incident.\nRaised on entities where assertions are configured to generate incidents.*/SQL/**A Data Schema assertion has failed, triggering the incident.\nRaised on entities where assertions are configured to generate incidents.*/DATA_SCHEMA/**A misc. operational incident, e.g. failure to materialize a dataset.*/OPERATIONAL/**A custom type of incident*/CUSTOM}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
