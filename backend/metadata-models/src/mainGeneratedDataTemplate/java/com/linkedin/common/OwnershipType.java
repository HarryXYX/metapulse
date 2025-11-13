
package com.linkedin.common;

import javax.annotation.Generated;
import com.linkedin.data.schema.EnumDataSchema;
import com.linkedin.data.schema.SchemaFormatType;
import com.linkedin.data.template.DataTemplateUtil;


/**
 * Asset owner types
 * 
 */
@Generated(value = "com.linkedin.pegasus.generator.JavaCodeUtil", comments = "Rest.li Data Template. Generated from metadata-models/src/main/pegasus/com/linkedin/common/OwnershipType.pdl.")
public enum OwnershipType {


    /**
     * Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no
     * enum value for. This is used for backwards compatibility
     * 
     */
    CUSTOM,

    /**
     * person or group who is responsible for technical aspects of the asset.
     * 
     */
    TECHNICAL_OWNER,

    /**
     * A person or group who is responsible for logical, or business related, aspects of the asset.
     * 
     */
    BUSINESS_OWNER,

    /**
     * A steward, expert, or delegate responsible for the asset.
     * 
     */
    DATA_STEWARD,

    /**
     * No specific type associated to the owner.
     * 
     */
    NONE,

    /**
     * A person or group that is in charge of developing the code
     * Deprecated! Use TECHNICAL_OWNER instead.
     * 
     */
    @Deprecated
    DEVELOPER,

    /**
     * A person or group that is owning the data
     * Deprecated! Use TECHNICAL_OWNER instead.
     * 
     */
    @Deprecated
    DATAOWNER,

    /**
     * A person or a group that overseas the operation, e.g. a DBA or SRE.
     * Deprecated! Use TECHNICAL_OWNER instead.
     * 
     */
    @Deprecated
    DELEGATE,

    /**
     * A person, group, or service that produces/generates the data
     * Deprecated! Use TECHNICAL_OWNER instead.
     * 
     */
    @Deprecated
    PRODUCER,

    /**
     * A person, group, or service that consumes the data
     * Deprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.
     * 
     */
    @Deprecated
    CONSUMER,

    /**
     * A person or a group that has direct business interest
     * Deprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.
     * 
     */
    @Deprecated
    STAKEHOLDER,
    $UNKNOWN;
    private final static EnumDataSchema SCHEMA = ((EnumDataSchema) DataTemplateUtil.parseSchema("namespace com.linkedin.common/**Asset owner types*/enum OwnershipType{/**Set when ownership type is unknown or a when new one is specified as an ownership type entity for which we have no\nenum value for. This is used for backwards compatibility*/CUSTOM/**person or group who is responsible for technical aspects of the asset.*/TECHNICAL_OWNER/**A person or group who is responsible for logical, or business related, aspects of the asset.*/BUSINESS_OWNER/**A steward, expert, or delegate responsible for the asset.*/DATA_STEWARD/**No specific type associated to the owner.*/NONE/**A person or group that is in charge of developing the code\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DEVELOPER/**A person or group that is owning the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DATAOWNER/**A person or a group that overseas the operation, e.g. a DBA or SRE.\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,DELEGATE/**A person, group, or service that produces/generates the data\nDeprecated! Use TECHNICAL_OWNER instead.*/@deprecated,PRODUCER/**A person, group, or service that consumes the data\nDeprecated! Use TECHNICAL_OWNER or BUSINESS_OWNER instead.*/@deprecated,CONSUMER/**A person or a group that has direct business interest\nDeprecated! Use TECHNICAL_OWNER, BUSINESS_OWNER, or STEWARD instead.*/@deprecated,STAKEHOLDER}", SchemaFormatType.PDL));

    public static EnumDataSchema dataSchema() {
        return SCHEMA;
    }

}
