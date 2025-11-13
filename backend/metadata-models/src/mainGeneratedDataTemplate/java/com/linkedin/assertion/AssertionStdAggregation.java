
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * The function that is applied to the aggregation input (schema, rows, column values) before evaluating an operator.
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/AssertionStdAggregation.pdl.")
public enum AssertionStdAggregation {


    /**
     * Assertion is applied on number of rows.
     * 
     */
    ROW_COUNT,

    /**
     * Assertion is applied on all columns.
     * 
     */
    COLUMNS,

    /**
     * Assertion is applied on number of columns.
     * 
     */
    COLUMN_COUNT,

    /**
     * Assertion is applied on individual column value. (No aggregation)
     * 
     */
    IDENTITY,

    /**
     * Assertion is applied on column mean
     * 
     */
    MEAN,

    /**
     * Assertion is applied on column median
     * 
     */
    MEDIAN,

    /**
     * Assertion is applied on number of distinct values in column
     * 
     */
    UNIQUE_COUNT,

    /**
     * Assertion is applied on proportion of distinct values in column
     * 
     */
    UNIQUE_PROPORTION,

    /**
     * Assertion is applied on proportion of distinct values in column
     * 
     * Deprecated! Use UNIQUE_PROPORTION instead.
     * 
     */
    UNIQUE_PROPOTION,

    /**
     * Assertion is applied on number of null values in column
     * 
     */
    NULL_COUNT,

    /**
     * Assertion is applied on proportion of null values in column
     * 
     */
    NULL_PROPORTION,

    /**
     * Assertion is applied on column std deviation
     * 
     */
    STDDEV,

    /**
     * Assertion is applied on column min
     * 
     */
    MIN,

    /**
     * Assertion is applied on column std deviation
     * 
     */
    MAX,

    /**
     * Assertion is applied on column sum
     * 
     */
    SUM,

    /**
     * Other
     * 
     */
    _NATIVE_,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion/**The function that is applied to the aggregation input (schema, rows, column values) before evaluating an operator.*/enum AssertionStdAggregation{/**Assertion is applied on number of rows.*/ROW_COUNT/**Assertion is applied on all columns.*/COLUMNS/**Assertion is applied on number of columns.*/COLUMN_COUNT/**Assertion is applied on individual column value. (No aggregation)*/IDENTITY/**Assertion is applied on column mean*/MEAN/**Assertion is applied on column median*/MEDIAN/**Assertion is applied on number of distinct values in column*/UNIQUE_COUNT/**Assertion is applied on proportion of distinct values in column*/UNIQUE_PROPORTION/**Assertion is applied on proportion of distinct values in column\n\nDeprecated! Use UNIQUE_PROPORTION instead.*/UNIQUE_PROPOTION/**Assertion is applied on number of null values in column*/NULL_COUNT/**Assertion is applied on proportion of null values in column*/NULL_PROPORTION/**Assertion is applied on column std deviation*/STDDEV/**Assertion is applied on column min*/MIN/**Assertion is applied on column std deviation*/MAX/**Assertion is applied on column sum*/SUM/**Other*/_NATIVE_}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
