
package com.linkedin.upgrade;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * 
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/upgrade/DataHubUpgradeState.pdl.")
public enum DataHubUpgradeState {


    /**
     * Upgrade in progress.
     * 
     */
    IN_PROGRESS,

    /**
     * Upgrade was successful.
     * 
     */
    SUCCEEDED,

    /**
     * Upgrade with an error state, however the upgrade should be re-run.
     * 
     */
    FAILED,

    /**
     * Upgrade with an error state and should not be re-run.
     * 
     */
    ABORTED,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.upgrade,enum DataHubUpgradeState{/**Upgrade in progress.*/IN_PROGRESS/**Upgrade was successful.*/SUCCEEDED/**Upgrade with an error state, however the upgrade should be re-run.*/FAILED/**Upgrade with an error state and should not be re-run.*/ABORTED}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
