
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/VolumeAssertionInfo.pdl.")
public enum VolumeAssertionType {


    /**
     * A volume assertion that is evaluated against the total row count of a dataset.
     * 
     */
    ROW_COUNT_TOTAL,

    /**
     * A volume assertion that is evaluated against an incremental row count of a dataset,
     * or a row count change.
     * 
     */
    ROW_COUNT_CHANGE,

    /**
     * A volume assertion that checks the latest "segment" in a table based on an incrementing
     * column to check whether it's row count falls into a particular range.
     * 
     * This can be used to monitor the row count of an incrementing date-partition column segment.
     * 
     */
    INCREMENTING_SEGMENT_ROW_COUNT_TOTAL,

    /**
     * A volume assertion that compares the row counts in neighboring "segments" or "partitions"
     * of an incrementing column.
     * This can be used to track changes between subsequent date partition
     * in a table, for example.
     * 
     */
    INCREMENTING_SEGMENT_ROW_COUNT_CHANGE,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum VolumeAssertionType{/**A volume assertion that is evaluated against the total row count of a dataset.*/ROW_COUNT_TOTAL/**A volume assertion that is evaluated against an incremental row count of a dataset,\nor a row count change.*/ROW_COUNT_CHANGE/**A volume assertion that checks the latest \"segment\" in a table based on an incrementing\ncolumn to check whether it's row count falls into a particular range.\n\nThis can be used to monitor the row count of an incrementing date-partition column segment.*/INCREMENTING_SEGMENT_ROW_COUNT_TOTAL/**A volume assertion that compares the row counts in neighboring \"segments\" or \"partitions\"\nof an incrementing column.\nThis can be used to track changes between subsequent date partition\nin a table, for example.*/INCREMENTING_SEGMENT_ROW_COUNT_CHANGE}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
