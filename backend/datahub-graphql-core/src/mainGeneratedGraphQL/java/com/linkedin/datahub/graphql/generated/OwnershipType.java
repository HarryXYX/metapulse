package com.linkedin.datahub.graphql.generated;

/**
 * The type of the ownership relationship between a Person and a Metadata Entity
Note that this field will soon become deprecated due to low usage
 */
public enum OwnershipType {

    /**
     * A person or group who is responsible for technical aspects of the asset.
     */
    TECHNICAL_OWNER("TECHNICAL_OWNER"),
    /**
     * A person or group who is responsible for logical, or business related, aspects of the asset.
     */
    BUSINESS_OWNER("BUSINESS_OWNER"),
    /**
     * A steward, expert, or delegate responsible for the asset.
     */
    DATA_STEWARD("DATA_STEWARD"),
    /**
     * No specific type associated with the owner.
     */
    NONE("NONE"),
    /**
     * Associated ownership type is a custom ownership type. Please check OwnershipTypeEntity urn for custom value.
     */
    CUSTOM("CUSTOM"),
    /**
     * A person or group that owns the data.
Deprecated! This ownership type is no longer supported. Use TECHNICAL_OWNER instead.
     */
    @Deprecated
    DATAOWNER("DATAOWNER"),
    /**
     * A person or group that is in charge of developing the code
Deprecated! This ownership type is no longer supported. Use TECHNICAL_OWNER instead.
     */
    @Deprecated
    DEVELOPER("DEVELOPER"),
    /**
     * A person or a group that overseas the operation, eg a DBA or SRE
Deprecated! This ownership type is no longer supported. Use TECHNICAL_OWNER instead.
     */
    @Deprecated
    DELEGATE("DELEGATE"),
    /**
     * A person, group, or service that produces or generates the data
Deprecated! This ownership type is no longer supported. Use TECHNICAL_OWNER instead.
     */
    @Deprecated
    PRODUCER("PRODUCER"),
    /**
     * A person or a group that has direct business interest
Deprecated! Use BUSINESS_OWNER instead.
     */
    @Deprecated
    STAKEHOLDER("STAKEHOLDER"),
    /**
     * A person, group, or service that consumes the data
Deprecated! This ownership type is no longer supported.
     */
    @Deprecated
    CONSUMER("CONSUMER");

    private final String graphqlName;

    private OwnershipType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
