
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/AssertionStdParameter.pdl.")
public enum AssertionStdParameterType {


    /**
     * A string value
     * 
     */
    STRING,

    /**
     * A numeric value
     * 
     */
    NUMBER,

    /**
     * A list of values. When used, value should be formatted as a serialized JSON array.
     * 
     */
    LIST,

    /**
     * A set of values. When used, value should be formatted as a serialized JSON array.
     * 
     */
    SET,

    /**
     * A value of unknown type
     * 
     */
    UNKNOWN,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum AssertionStdParameterType{/**A string value*/STRING/**A numeric value*/NUMBER/**A list of values. When used, value should be formatted as a serialized JSON array.*/LIST/**A set of values. When used, value should be formatted as a serialized JSON array.*/SET/**A value of unknown type*/UNKNOWN}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
