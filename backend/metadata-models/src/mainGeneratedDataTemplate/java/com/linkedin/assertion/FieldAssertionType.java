
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/FieldAssertionInfo.pdl.")
public enum FieldAssertionType {


    /**
     * An assertion used to validate the values contained with a field / column given a set of rows.
     * 
     */
    FIELD_VALUES,

    /**
     * An assertion used to validate the value of a common field / column metric (e.g. aggregation) such as null count + percentage,
     * min, max, median, and more.
     * 
     */
    FIELD_METRIC,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum FieldAssertionType{/**An assertion used to validate the values contained with a field / column given a set of rows.*/FIELD_VALUES/**An assertion used to validate the value of a common field / column metric (e.g. aggregation) such as null count + percentage,\nmin, max, median, and more.*/FIELD_METRIC}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
