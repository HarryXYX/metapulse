
package com.linkedin.entity;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The type of a DataHub aspect
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/entity/AspectType.pdl.")
public enum AspectType {


    /**
     * Designates an aspect that has a monotonically increasing version number
     * 
     */
    VERSIONED,

    /**
     * Designates an aspect that represents a point-in-time data point
     * 
     */
    TIMESERIES,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.entity/**The type of a DataHub aspect*/enum AspectType{/**Designates an aspect that has a monotonically increasing version number*/VERSIONED/**Designates an aspect that represents a point-in-time data point*/TIMESERIES}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
