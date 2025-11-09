
package com.linkedin.assertion;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-events/mxe-schemas/src/main/pegasus/com/linkedin/assertion/AssertionInfo.pdl.")
public enum AssertionType {


    /**
     * A single-dataset assertion.
     * When this is the value, the datasetAssertion field will be populated.
     * 
     */
    DATASET,

    /**
     * A freshness assertion, or an assertion which indicates when a particular operation should occur
     * to an asset.
     * 
     */
    FRESHNESS,

    /**
     * A volume assertion, or an assertion which indicates how much data should be available for a
     * particular asset.
     * 
     */
    VOLUME,

    /**
     * A raw SQL-statement based assertion
     * 
     */
    SQL,

    /**
     * A structured assertion targeting a specific column or field of the Dataset.
     * 
     */
    FIELD,

    /**
     * A schema or structural assertion.
     * 
     * Would have named this SCHEMA but the codegen for PDL does not allow this (reserved word).
     * 
     */
    DATA_SCHEMA,

    /**
     * A custom assertion. 
     * When this is the value, the customAssertion field will be populated.
     * Use this assertion type when the exact type of assertion is not modeled in DataHub or
     * as a starting point when integrating third-party data quality tools.
     * 
     */
    CUSTOM,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.assertion,enum AssertionType{/**A single-dataset assertion.\nWhen this is the value, the datasetAssertion field will be populated.*/DATASET/**A freshness assertion, or an assertion which indicates when a particular operation should occur\nto an asset.*/FRESHNESS/**A volume assertion, or an assertion which indicates how much data should be available for a\nparticular asset.*/VOLUME/**A raw SQL-statement based assertion*/SQL/**A structured assertion targeting a specific column or field of the Dataset.*/FIELD/**A schema or structural assertion.\n\nWould have named this SCHEMA but the codegen for PDL does not allow this (reserved word).*/DATA_SCHEMA/**A custom assertion. \nWhen this is the value, the customAssertion field will be populated.\nUse this assertion type when the exact type of assertion is not modeled in DataHub or\nas a starting point when integrating third-party data quality tools.*/CUSTOM}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
