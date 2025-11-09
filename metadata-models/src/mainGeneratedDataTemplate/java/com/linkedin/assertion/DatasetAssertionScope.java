
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/assertion/DatasetAssertionInfo.pdl.")
public enum DatasetAssertionScope {


    /**
     * This assertion applies to dataset column(s)
     * 
     */
    DATASET_COLUMN,

    /**
     * This assertion applies to entire rows of the dataset
     * 
     */
    DATASET_ROWS,

    /**
     * This assertion applies to the storage size of the dataset
     * 
     */
    DATASET_STORAGE_SIZE,

    /**
     * This assertion applies to the schema of the dataset
     * 
     */
    DATASET_SCHEMA,

    /**
     * The scope of the assertion is unknown
     * 
     */
    UNKNOWN,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum DatasetAssertionScope{/**This assertion applies to dataset column(s)*/DATASET_COLUMN/**This assertion applies to entire rows of the dataset*/DATASET_ROWS/**This assertion applies to the storage size of the dataset*/DATASET_STORAGE_SIZE/**This assertion applies to the schema of the dataset*/DATASET_SCHEMA/**The scope of the assertion is unknown*/UNKNOWN}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
