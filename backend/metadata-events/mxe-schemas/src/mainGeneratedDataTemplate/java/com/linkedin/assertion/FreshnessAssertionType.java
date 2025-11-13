
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/FreshnessAssertionInfo.pdl.")
public enum FreshnessAssertionType {


    /**
     * An Freshness based on Operations performed on a particular Dataset (insert, update, delete, etc) and sourced from an audit log, as
     * opposed to based on the highest watermark in a timestamp column (e.g. a query). Only valid when entity is of type "dataset".
     * 
     */
    DATASET_CHANGE,

    /**
     * An Freshness based on a successful execution of a Data Job.
     * 
     */
    DATA_JOB_RUN,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum FreshnessAssertionType{/**An Freshness based on Operations performed on a particular Dataset (insert, update, delete, etc) and sourced from an audit log, as\nopposed to based on the highest watermark in a timestamp column (e.g. a query). Only valid when entity is of type \"dataset\".*/DATASET_CHANGE/**An Freshness based on a successful execution of a Data Job.*/DATA_JOB_RUN}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
