package com.linkedin.datahub.graphql.generated;

/**
 * A top level Metadata Entity Type
 */
public enum EntityType {

    /**
     * A Domain containing Metadata Entities
     */
    DOMAIN("DOMAIN"),
    /**
     * The Dataset Entity
     */
    DATASET("DATASET"),
    /**
     * The CorpUser Entity
     */
    CORP_USER("CORP_USER"),
    /**
     * The CorpGroup Entity
     */
    CORP_GROUP("CORP_GROUP"),
    /**
     * The DataPlatform Entity
     */
    DATA_PLATFORM("DATA_PLATFORM"),
    /**
     * The ERModelRelationship Entity
     */
    ER_MODEL_RELATIONSHIP("ER_MODEL_RELATIONSHIP"),
    /**
     * The Dashboard Entity
     */
    DASHBOARD("DASHBOARD"),
    /**
     * The Notebook Entity
     */
    NOTEBOOK("NOTEBOOK"),
    /**
     * The Chart Entity
     */
    CHART("CHART"),
    /**
     * The Data Flow (or Data Pipeline) Entity,
     */
    DATA_FLOW("DATA_FLOW"),
    /**
     * The Data Job (or Data Task) Entity
     */
    DATA_JOB("DATA_JOB"),
    /**
     * The Tag Entity
     */
    TAG("TAG"),
    /**
     * The Glossary Term Entity
     */
    GLOSSARY_TERM("GLOSSARY_TERM"),
    /**
     * The Glossary Node Entity
     */
    GLOSSARY_NODE("GLOSSARY_NODE"),
    /**
     * A container of Metadata Entities
     */
    CONTAINER("CONTAINER"),
    /**
     * The ML Model Entity
     */
    MLMODEL("MLMODEL"),
    /**
     * The MLModelGroup Entity
     */
    MLMODEL_GROUP("MLMODEL_GROUP"),
    /**
     * ML Feature Table Entity
     */
    MLFEATURE_TABLE("MLFEATURE_TABLE"),
    /**
     * The ML Feature Entity
     */
    MLFEATURE("MLFEATURE"),
    /**
     * The ML Primary Key Entity
     */
    MLPRIMARY_KEY("MLPRIMARY_KEY"),
    /**
     * A DataHub Managed Ingestion Source
     */
    INGESTION_SOURCE("INGESTION_SOURCE"),
    /**
     * A DataHub ExecutionRequest
     */
    EXECUTION_REQUEST("EXECUTION_REQUEST"),
    /**
     * A DataHub Assertion
     */
    ASSERTION("ASSERTION"),
    /**
     * An instance of an individual run of a data job or data flow
     */
    DATA_PROCESS_INSTANCE("DATA_PROCESS_INSTANCE"),
    /**
     * Data Platform Instance Entity
     */
    DATA_PLATFORM_INSTANCE("DATA_PLATFORM_INSTANCE"),
    /**
     * A DataHub Access Token
     */
    ACCESS_TOKEN("ACCESS_TOKEN"),
    /**
     * A DataHub Test
     */
    TEST("TEST"),
    /**
     * A DataHub Policy
     */
    DATAHUB_POLICY("DATAHUB_POLICY"),
    /**
     * A DataHub Role
     */
    DATAHUB_ROLE("DATAHUB_ROLE"),
    /**
     * A DataHub Post
     */
    POST("POST"),
    /**
     * A Schema Field
     */
    SCHEMA_FIELD("SCHEMA_FIELD"),
    /**
     * A DataHub View
     */
    DATAHUB_VIEW("DATAHUB_VIEW"),
    /**
     * A dataset query
     */
    QUERY("QUERY"),
    /**
     * A Data Product
     */
    DATA_PRODUCT("DATA_PRODUCT"),
    /**
     * A Custom Ownership Type
     */
    CUSTOM_OWNERSHIP_TYPE("CUSTOM_OWNERSHIP_TYPE"),
    /**
     * A connection to an external source.
     */
    DATAHUB_CONNECTION("DATAHUB_CONNECTION"),
    /**
     * A DataHub incident - SaaS only
     */
    INCIDENT("INCIDENT"),
    /**
     * "
A Role from an organisation
     */
    ROLE("ROLE"),
    /**
     * A data contract
     */
    DATA_CONTRACT("DATA_CONTRACT"),
    /**
     * "
An structured property on entities
     */
    STRUCTURED_PROPERTY("STRUCTURED_PROPERTY"),
    /**
     * "
A form entity on entities
     */
    FORM("FORM"),
    /**
     * "
A data type registered to DataHub
     */
    DATA_TYPE("DATA_TYPE"),
    /**
     * "
A type of entity registered to DataHub
     */
    ENTITY_TYPE("ENTITY_TYPE"),
    /**
     * "
A type of entity that is restricted to the user
     */
    RESTRICTED("RESTRICTED"),
    /**
     * Another entity type - refer to a provided entity type urn.
     */
    OTHER("OTHER"),
    /**
     * A Business Attribute
     */
    BUSINESS_ATTRIBUTE("BUSINESS_ATTRIBUTE"),
    /**
     * A set of versioned entities, representing a single source / logical entity over time
     */
    VERSION_SET("VERSION_SET"),
    /**
     * An application
     */
    APPLICATION("APPLICATION"),
    /**
     * An DataHub Page Template
     */
    DATAHUB_PAGE_TEMPLATE("DATAHUB_PAGE_TEMPLATE"),
    /**
     * An DataHub Page Module
     */
    DATAHUB_PAGE_MODULE("DATAHUB_PAGE_MODULE"),
    /**
     * An DataHub File
     */
    DATAHUB_FILE("DATAHUB_FILE");

    private final String graphqlName;

    private EntityType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
