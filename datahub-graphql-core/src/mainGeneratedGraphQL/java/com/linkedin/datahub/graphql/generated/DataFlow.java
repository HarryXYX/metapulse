package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Data Flow Metadata Entity, representing an set of pipelined Data Job or Tasks required
to produce an output Dataset Also known as a Data Pipeline
 */
public class DataFlow implements java.io.Serializable, Entity, EntityWithRelationships, BrowsableEntity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private Long lastIngested;
    @javax.annotation.Nonnull
    private String orchestrator;
    @javax.annotation.Nonnull
    private String flowId;
    @javax.annotation.Nonnull
    private String cluster;
    private DataFlowProperties properties;
    private DataFlowEditableProperties editableProperties;
    private Ownership ownership;
    private GlobalTags tags;
    private Status status;
    private Deprecation deprecation;
    private InstitutionalMemory institutionalMemory;
    private GlossaryTerms glossaryTerms;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private DataPlatformInstance dataPlatformInstance;
    private Container container;
    private ParentContainersResult parentContainers;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private java.util.List<BrowsePath> browsePaths;
    private BrowsePathV2 browsePathV2;
    @Deprecated
    private DataFlowInfo info;
    @Deprecated
    private GlobalTags globalTags;
    @Deprecated
    private DataFlowDataJobsRelationships dataJobs;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private Boolean exists;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private java.util.List<Health> health;
    private Forms forms;
    private EntityPrivileges privileges;
    private SubTypes subTypes;
    private EntityIncidentsResult incidents;

    public DataFlow() {
    }

    public DataFlow(String urn, EntityType type, Long lastIngested, String orchestrator, String flowId, String cluster, DataFlowProperties properties, DataFlowEditableProperties editableProperties, Ownership ownership, GlobalTags tags, Status status, Deprecation deprecation, InstitutionalMemory institutionalMemory, GlossaryTerms glossaryTerms, DomainAssociation domain, ApplicationAssociation application, DataPlatformInstance dataPlatformInstance, Container container, ParentContainersResult parentContainers, EntityRelationshipsResult relationships, EntityLineageResult lineage, java.util.List<BrowsePath> browsePaths, BrowsePathV2 browsePathV2, DataFlowInfo info, GlobalTags globalTags, DataFlowDataJobsRelationships dataJobs, DataPlatform platform, Boolean exists, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, java.util.List<Health> health, Forms forms, EntityPrivileges privileges, SubTypes subTypes, EntityIncidentsResult incidents) {
        this.urn = urn;
        this.type = type;
        this.lastIngested = lastIngested;
        this.orchestrator = orchestrator;
        this.flowId = flowId;
        this.cluster = cluster;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.tags = tags;
        this.status = status;
        this.deprecation = deprecation;
        this.institutionalMemory = institutionalMemory;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.application = application;
        this.dataPlatformInstance = dataPlatformInstance;
        this.container = container;
        this.parentContainers = parentContainers;
        this.relationships = relationships;
        this.lineage = lineage;
        this.browsePaths = browsePaths;
        this.browsePathV2 = browsePathV2;
        this.info = info;
        this.globalTags = globalTags;
        this.dataJobs = dataJobs;
        this.platform = platform;
        this.exists = exists;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.health = health;
        this.forms = forms;
        this.privileges = privileges;
        this.subTypes = subTypes;
        this.incidents = incidents;
    }

    /**
     * The primary key of a Data Flow
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of a Data Flow
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * A standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * A standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * The timestamp for the last time this entity was ingested
     */
    public Long getLastIngested() {
        return lastIngested;
    }
    /**
     * The timestamp for the last time this entity was ingested
     */
    public void setLastIngested(Long lastIngested) {
        this.lastIngested = lastIngested;
    }

    /**
     * Workflow orchestrator ei Azkaban, Airflow
     */
    public String getOrchestrator() {
        return orchestrator;
    }
    /**
     * Workflow orchestrator ei Azkaban, Airflow
     */
    public void setOrchestrator(String orchestrator) {
        this.orchestrator = orchestrator;
    }

    /**
     * Id of the flow
     */
    public String getFlowId() {
        return flowId;
    }
    /**
     * Id of the flow
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    /**
     * Cluster of the flow
     */
    public String getCluster() {
        return cluster;
    }
    /**
     * Cluster of the flow
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * Additional read only properties about a Data flow
     */
    public DataFlowProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about a Data flow
     */
    public void setProperties(DataFlowProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about a Data Flow
     */
    public DataFlowEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about a Data Flow
     */
    public void setEditableProperties(DataFlowEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the flow
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the flow
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * The tags associated with the dataflow
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the dataflow
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Status metadata of the dataflow
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the dataflow
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The deprecation status of the Data Flow
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the Data Flow
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
    }

    /**
     * References to internal resources related to the dashboard
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the dashboard
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * The structured glossary terms associated with the dashboard
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the dashboard
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * The Domain associated with the DataFlow
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the DataFlow
     */
    public void setDomain(DomainAssociation domain) {
        this.domain = domain;
    }

    /**
     * The application associated with the entity
     */
    public ApplicationAssociation getApplication() {
        return application;
    }
    /**
     * The application associated with the entity
     */
    public void setApplication(ApplicationAssociation application) {
        this.application = application;
    }

    /**
     * The specific instance of the data platform that this entity belongs to
     */
    public DataPlatformInstance getDataPlatformInstance() {
        return dataPlatformInstance;
    }
    /**
     * The specific instance of the data platform that this entity belongs to
     */
    public void setDataPlatformInstance(DataPlatformInstance dataPlatformInstance) {
        this.dataPlatformInstance = dataPlatformInstance;
    }

    /**
     * The parent container in which the entity resides
     */
    public Container getContainer() {
        return container;
    }
    /**
     * The parent container in which the entity resides
     */
    public void setContainer(Container container) {
        this.container = container;
    }

    /**
     * Recursively get the lineage of containers for this entity
     */
    public ParentContainersResult getParentContainers() {
        return parentContainers;
    }
    /**
     * Recursively get the lineage of containers for this entity
     */
    public void setParentContainers(ParentContainersResult parentContainers) {
        this.parentContainers = parentContainers;
    }

    /**
     * Granular API for querying edges extending from this entity
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Granular API for querying edges extending from this entity
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
    }

    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    public EntityLineageResult getLineage() {
        return lineage;
    }
    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    public void setLineage(EntityLineageResult lineage) {
        this.lineage = lineage;
    }

    /**
     * The browse paths corresponding to the data flow. If no Browse Paths have been generated before, this will be null.
     */
    public java.util.List<BrowsePath> getBrowsePaths() {
        return browsePaths;
    }
    /**
     * The browse paths corresponding to the data flow. If no Browse Paths have been generated before, this will be null.
     */
    public void setBrowsePaths(java.util.List<BrowsePath> browsePaths) {
        this.browsePaths = browsePaths;
    }

    /**
     * The browse path V2 corresponding to an entity. If no Browse Paths V2 have been generated before, this will be null.
     */
    public BrowsePathV2 getBrowsePathV2() {
        return browsePathV2;
    }
    /**
     * The browse path V2 corresponding to an entity. If no Browse Paths V2 have been generated before, this will be null.
     */
    public void setBrowsePathV2(BrowsePathV2 browsePathV2) {
        this.browsePathV2 = browsePathV2;
    }

    /**
     * Deprecated, use properties field instead
Additional read only information about a Data flow
     */
    @Deprecated
    public DataFlowInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only information about a Data flow
     */
    @Deprecated
    public void setInfo(DataFlowInfo info) {
        this.info = info;
    }

    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataflow
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataflow
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * Deprecated, use relationship IsPartOf instead
Data Jobs
     */
    @Deprecated
    public DataFlowDataJobsRelationships getDataJobs() {
        return dataJobs;
    }
    /**
     * Deprecated, use relationship IsPartOf instead
Data Jobs
     */
    @Deprecated
    public void setDataJobs(DataFlowDataJobsRelationships dataJobs) {
        this.dataJobs = dataJobs;
    }

    /**
     * Standardized platform urn where the datflow is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the datflow is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Whether or not this entity exists on DataHub
     */
    public Boolean getExists() {
        return exists;
    }
    /**
     * Whether or not this entity exists on DataHub
     */
    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    /**
     * Experimental API.
For fetching extra entities that do not have custom UI code yet
     */
    public java.util.List<RawAspect> getAspects() {
        return aspects;
    }
    /**
     * Experimental API.
For fetching extra entities that do not have custom UI code yet
     */
    public void setAspects(java.util.List<RawAspect> aspects) {
        this.aspects = aspects;
    }

    /**
     * Structured properties about this asset
     */
    public StructuredProperties getStructuredProperties() {
        return structuredProperties;
    }
    /**
     * Structured properties about this asset
     */
    public void setStructuredProperties(StructuredProperties structuredProperties) {
        this.structuredProperties = structuredProperties;
    }

    /**
     * Experimental! The resolved health statuses of the asset
     */
    public java.util.List<Health> getHealth() {
        return health;
    }
    /**
     * Experimental! The resolved health statuses of the asset
     */
    public void setHealth(java.util.List<Health> health) {
        this.health = health;
    }

    /**
     * The forms associated with the Dataset
     */
    public Forms getForms() {
        return forms;
    }
    /**
     * The forms associated with the Dataset
     */
    public void setForms(Forms forms) {
        this.forms = forms;
    }

    /**
     * Privileges given to a user relevant to this entity
     */
    public EntityPrivileges getPrivileges() {
        return privileges;
    }
    /**
     * Privileges given to a user relevant to this entity
     */
    public void setPrivileges(EntityPrivileges privileges) {
        this.privileges = privileges;
    }

    /**
     * Sub Types that this entity implements
     */
    public SubTypes getSubTypes() {
        return subTypes;
    }
    /**
     * Sub Types that this entity implements
     */
    public void setSubTypes(SubTypes subTypes) {
        this.subTypes = subTypes;
    }

    /**
     * Incidents associated with the DataFlow
     */
    public EntityIncidentsResult getIncidents() {
        return incidents;
    }
    /**
     * Incidents associated with the DataFlow
     */
    public void setIncidents(EntityIncidentsResult incidents) {
        this.incidents = incidents;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (lastIngested != null) {
            joiner.add("lastIngested: " + lastIngested);
        }
        if (orchestrator != null) {
            joiner.add("orchestrator: \"" + orchestrator + "\"");
        }
        if (flowId != null) {
            joiner.add("flowId: \"" + flowId + "\"");
        }
        if (cluster != null) {
            joiner.add("cluster: \"" + cluster + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (deprecation != null) {
            joiner.add("deprecation: " + deprecation);
        }
        if (institutionalMemory != null) {
            joiner.add("institutionalMemory: " + institutionalMemory);
        }
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        if (domain != null) {
            joiner.add("domain: " + domain);
        }
        if (application != null) {
            joiner.add("application: " + application);
        }
        if (dataPlatformInstance != null) {
            joiner.add("dataPlatformInstance: " + dataPlatformInstance);
        }
        if (container != null) {
            joiner.add("container: " + container);
        }
        if (parentContainers != null) {
            joiner.add("parentContainers: " + parentContainers);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (lineage != null) {
            joiner.add("lineage: " + lineage);
        }
        if (browsePaths != null) {
            joiner.add("browsePaths: " + browsePaths);
        }
        if (browsePathV2 != null) {
            joiner.add("browsePathV2: " + browsePathV2);
        }
        if (info != null) {
            joiner.add("info: " + info);
        }
        if (globalTags != null) {
            joiner.add("globalTags: " + globalTags);
        }
        if (dataJobs != null) {
            joiner.add("dataJobs: " + dataJobs);
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (exists != null) {
            joiner.add("exists: " + exists);
        }
        if (aspects != null) {
            joiner.add("aspects: " + aspects);
        }
        if (structuredProperties != null) {
            joiner.add("structuredProperties: " + structuredProperties);
        }
        if (health != null) {
            joiner.add("health: " + health);
        }
        if (forms != null) {
            joiner.add("forms: " + forms);
        }
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        if (subTypes != null) {
            joiner.add("subTypes: " + subTypes);
        }
        if (incidents != null) {
            joiner.add("incidents: " + incidents);
        }
        return joiner.toString();
    }

    public static DataFlow.Builder builder() {
        return new DataFlow.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Long lastIngested;
        private String orchestrator;
        private String flowId;
        private String cluster;
        private DataFlowProperties properties;
        private DataFlowEditableProperties editableProperties;
        private Ownership ownership;
        private GlobalTags tags;
        private Status status;
        private Deprecation deprecation;
        private InstitutionalMemory institutionalMemory;
        private GlossaryTerms glossaryTerms;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private DataPlatformInstance dataPlatformInstance;
        private Container container;
        private ParentContainersResult parentContainers;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private java.util.List<BrowsePath> browsePaths;
        private BrowsePathV2 browsePathV2;
        private DataFlowInfo info;
        private GlobalTags globalTags;
        private DataFlowDataJobsRelationships dataJobs;
        private DataPlatform platform;
        private Boolean exists;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private java.util.List<Health> health;
        private Forms forms;
        private EntityPrivileges privileges;
        private SubTypes subTypes;
        private EntityIncidentsResult incidents;

        public Builder() {
        }

        /**
         * The primary key of a Data Flow
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * The timestamp for the last time this entity was ingested
         */
        public Builder setLastIngested(Long lastIngested) {
            this.lastIngested = lastIngested;
            return this;
        }

        /**
         * Workflow orchestrator ei Azkaban, Airflow
         */
        public Builder setOrchestrator(String orchestrator) {
            this.orchestrator = orchestrator;
            return this;
        }

        /**
         * Id of the flow
         */
        public Builder setFlowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * Cluster of the flow
         */
        public Builder setCluster(String cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * Additional read only properties about a Data flow
         */
        public Builder setProperties(DataFlowProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about a Data Flow
         */
        public Builder setEditableProperties(DataFlowEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the flow
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * The tags associated with the dataflow
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Status metadata of the dataflow
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * The deprecation status of the Data Flow
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
            return this;
        }

        /**
         * References to internal resources related to the dashboard
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * The structured glossary terms associated with the dashboard
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * The Domain associated with the DataFlow
         */
        public Builder setDomain(DomainAssociation domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The application associated with the entity
         */
        public Builder setApplication(ApplicationAssociation application) {
            this.application = application;
            return this;
        }

        /**
         * The specific instance of the data platform that this entity belongs to
         */
        public Builder setDataPlatformInstance(DataPlatformInstance dataPlatformInstance) {
            this.dataPlatformInstance = dataPlatformInstance;
            return this;
        }

        /**
         * The parent container in which the entity resides
         */
        public Builder setContainer(Container container) {
            this.container = container;
            return this;
        }

        /**
         * Recursively get the lineage of containers for this entity
         */
        public Builder setParentContainers(ParentContainersResult parentContainers) {
            this.parentContainers = parentContainers;
            return this;
        }

        /**
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Edges extending from this entity grouped by direction in the lineage graph
         */
        public Builder setLineage(EntityLineageResult lineage) {
            this.lineage = lineage;
            return this;
        }

        /**
         * The browse paths corresponding to the data flow. If no Browse Paths have been generated before, this will be null.
         */
        public Builder setBrowsePaths(java.util.List<BrowsePath> browsePaths) {
            this.browsePaths = browsePaths;
            return this;
        }

        /**
         * The browse path V2 corresponding to an entity. If no Browse Paths V2 have been generated before, this will be null.
         */
        public Builder setBrowsePathV2(BrowsePathV2 browsePathV2) {
            this.browsePathV2 = browsePathV2;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional read only information about a Data flow
         */
        @Deprecated
        public Builder setInfo(DataFlowInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The structured tags associated with the dataflow
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * Deprecated, use relationship IsPartOf instead
Data Jobs
         */
        @Deprecated
        public Builder setDataJobs(DataFlowDataJobsRelationships dataJobs) {
            this.dataJobs = dataJobs;
            return this;
        }

        /**
         * Standardized platform urn where the datflow is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Whether or not this entity exists on DataHub
         */
        public Builder setExists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * Experimental API.
For fetching extra entities that do not have custom UI code yet
         */
        public Builder setAspects(java.util.List<RawAspect> aspects) {
            this.aspects = aspects;
            return this;
        }

        /**
         * Structured properties about this asset
         */
        public Builder setStructuredProperties(StructuredProperties structuredProperties) {
            this.structuredProperties = structuredProperties;
            return this;
        }

        /**
         * Experimental! The resolved health statuses of the asset
         */
        public Builder setHealth(java.util.List<Health> health) {
            this.health = health;
            return this;
        }

        /**
         * The forms associated with the Dataset
         */
        public Builder setForms(Forms forms) {
            this.forms = forms;
            return this;
        }

        /**
         * Privileges given to a user relevant to this entity
         */
        public Builder setPrivileges(EntityPrivileges privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Sub Types that this entity implements
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
            return this;
        }

        /**
         * Incidents associated with the DataFlow
         */
        public Builder setIncidents(EntityIncidentsResult incidents) {
            this.incidents = incidents;
            return this;
        }


        public DataFlow build() {
            return new DataFlow(urn, type, lastIngested, orchestrator, flowId, cluster, properties, editableProperties, ownership, tags, status, deprecation, institutionalMemory, glossaryTerms, domain, application, dataPlatformInstance, container, parentContainers, relationships, lineage, browsePaths, browsePathV2, info, globalTags, dataJobs, platform, exists, aspects, structuredProperties, health, forms, privileges, subTypes, incidents);
        }

    }
}
