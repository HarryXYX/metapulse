package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Data Job Metadata Entity, representing an individual unit of computation or Task
to produce an output Dataset Always part of a parent Data Flow aka Pipeline
 */
public class DataJob implements java.io.Serializable, Entity, EntityWithRelationships, BrowsableEntity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private SubTypes subTypes;
    private Long lastIngested;
    private DataFlow dataFlow;
    @javax.annotation.Nonnull
    private String jobId;
    private DataJobProperties properties;
    private DataPlatformInstance dataPlatformInstance;
    private DataPlatform platform;
    private Container container;
    private ParentContainersResult parentContainers;
    private DataJobEditableProperties editableProperties;
    private GlobalTags tags;
    private Ownership ownership;
    private Status status;
    private Deprecation deprecation;
    private InstitutionalMemory institutionalMemory;
    private GlossaryTerms glossaryTerms;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private java.util.List<BrowsePath> browsePaths;
    private BrowsePathV2 browsePathV2;
    @Deprecated
    private DataJobInfo info;
    private DataJobInputOutput inputOutput;
    @Deprecated
    private GlobalTags globalTags;
    private DataProcessInstanceResult runs;
    private EntityPrivileges privileges;
    private Boolean exists;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private java.util.List<Health> health;
    private Forms forms;
    private DataTransformLogic dataTransformLogic;
    private EntityIncidentsResult incidents;

    public DataJob() {
    }

    public DataJob(String urn, EntityType type, SubTypes subTypes, Long lastIngested, DataFlow dataFlow, String jobId, DataJobProperties properties, DataPlatformInstance dataPlatformInstance, DataPlatform platform, Container container, ParentContainersResult parentContainers, DataJobEditableProperties editableProperties, GlobalTags tags, Ownership ownership, Status status, Deprecation deprecation, InstitutionalMemory institutionalMemory, GlossaryTerms glossaryTerms, DomainAssociation domain, ApplicationAssociation application, EntityRelationshipsResult relationships, EntityLineageResult lineage, java.util.List<BrowsePath> browsePaths, BrowsePathV2 browsePathV2, DataJobInfo info, DataJobInputOutput inputOutput, GlobalTags globalTags, DataProcessInstanceResult runs, EntityPrivileges privileges, Boolean exists, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, java.util.List<Health> health, Forms forms, DataTransformLogic dataTransformLogic, EntityIncidentsResult incidents) {
        this.urn = urn;
        this.type = type;
        this.subTypes = subTypes;
        this.lastIngested = lastIngested;
        this.dataFlow = dataFlow;
        this.jobId = jobId;
        this.properties = properties;
        this.dataPlatformInstance = dataPlatformInstance;
        this.platform = platform;
        this.container = container;
        this.parentContainers = parentContainers;
        this.editableProperties = editableProperties;
        this.tags = tags;
        this.ownership = ownership;
        this.status = status;
        this.deprecation = deprecation;
        this.institutionalMemory = institutionalMemory;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.application = application;
        this.relationships = relationships;
        this.lineage = lineage;
        this.browsePaths = browsePaths;
        this.browsePathV2 = browsePathV2;
        this.info = info;
        this.inputOutput = inputOutput;
        this.globalTags = globalTags;
        this.runs = runs;
        this.privileges = privileges;
        this.exists = exists;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.health = health;
        this.forms = forms;
        this.dataTransformLogic = dataTransformLogic;
        this.incidents = incidents;
    }

    /**
     * The primary key of the Data Job
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Data Job
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
     * Deprecated, use relationship IsPartOf instead
The associated data flow
     */
    public DataFlow getDataFlow() {
        return dataFlow;
    }
    /**
     * Deprecated, use relationship IsPartOf instead
The associated data flow
     */
    public void setDataFlow(DataFlow dataFlow) {
        this.dataFlow = dataFlow;
    }

    /**
     * Id of the job
     */
    public String getJobId() {
        return jobId;
    }
    /**
     * Id of the job
     */
    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * Additional read only properties associated with the Data Job
     */
    public DataJobProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties associated with the Data Job
     */
    public void setProperties(DataJobProperties properties) {
        this.properties = properties;
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
     * Standardized platform urn where the data job is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the data job is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
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
     * Additional read write properties associated with the Data Job
     */
    public DataJobEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties associated with the Data Job
     */
    public void setEditableProperties(DataJobEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * The tags associated with the DataJob
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the DataJob
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Ownership metadata of the job
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the job
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Status metadata of the DataJob
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the DataJob
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
     * The Domain associated with the Data Job
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the Data Job
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
     * The browse paths corresponding to the data job. If no Browse Paths have been generated before, this will be null.
     */
    public java.util.List<BrowsePath> getBrowsePaths() {
        return browsePaths;
    }
    /**
     * The browse paths corresponding to the data job. If no Browse Paths have been generated before, this will be null.
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
Additional read only information about a Data processing job
     */
    @Deprecated
    public DataJobInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only information about a Data processing job
     */
    @Deprecated
    public void setInfo(DataJobInfo info) {
        this.info = info;
    }

    /**
     * Information about the inputs and outputs of a Data processing job including column-level lineage.
     */
    public DataJobInputOutput getInputOutput() {
        return inputOutput;
    }
    /**
     * Information about the inputs and outputs of a Data processing job including column-level lineage.
     */
    public void setInputOutput(DataJobInputOutput inputOutput) {
        this.inputOutput = inputOutput;
    }

    /**
     * Deprecated, use the tags field instead
The structured tags associated with the DataJob
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use the tags field instead
The structured tags associated with the DataJob
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * History of runs of this task
     */
    public DataProcessInstanceResult getRuns() {
        return runs;
    }
    /**
     * History of runs of this task
     */
    public void setRuns(DataProcessInstanceResult runs) {
        this.runs = runs;
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
     * Data Transform Logic associated with the Data Job
     */
    public DataTransformLogic getDataTransformLogic() {
        return dataTransformLogic;
    }
    /**
     * Data Transform Logic associated with the Data Job
     */
    public void setDataTransformLogic(DataTransformLogic dataTransformLogic) {
        this.dataTransformLogic = dataTransformLogic;
    }

    /**
     * Incidents associated with the DataJob
     */
    public EntityIncidentsResult getIncidents() {
        return incidents;
    }
    /**
     * Incidents associated with the DataJob
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
        if (subTypes != null) {
            joiner.add("subTypes: " + subTypes);
        }
        if (lastIngested != null) {
            joiner.add("lastIngested: " + lastIngested);
        }
        if (dataFlow != null) {
            joiner.add("dataFlow: " + dataFlow);
        }
        if (jobId != null) {
            joiner.add("jobId: \"" + jobId + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (dataPlatformInstance != null) {
            joiner.add("dataPlatformInstance: " + dataPlatformInstance);
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (container != null) {
            joiner.add("container: " + container);
        }
        if (parentContainers != null) {
            joiner.add("parentContainers: " + parentContainers);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
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
        if (inputOutput != null) {
            joiner.add("inputOutput: " + inputOutput);
        }
        if (globalTags != null) {
            joiner.add("globalTags: " + globalTags);
        }
        if (runs != null) {
            joiner.add("runs: " + runs);
        }
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
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
        if (dataTransformLogic != null) {
            joiner.add("dataTransformLogic: " + dataTransformLogic);
        }
        if (incidents != null) {
            joiner.add("incidents: " + incidents);
        }
        return joiner.toString();
    }

    public static DataJob.Builder builder() {
        return new DataJob.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private SubTypes subTypes;
        private Long lastIngested;
        private DataFlow dataFlow;
        private String jobId;
        private DataJobProperties properties;
        private DataPlatformInstance dataPlatformInstance;
        private DataPlatform platform;
        private Container container;
        private ParentContainersResult parentContainers;
        private DataJobEditableProperties editableProperties;
        private GlobalTags tags;
        private Ownership ownership;
        private Status status;
        private Deprecation deprecation;
        private InstitutionalMemory institutionalMemory;
        private GlossaryTerms glossaryTerms;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private java.util.List<BrowsePath> browsePaths;
        private BrowsePathV2 browsePathV2;
        private DataJobInfo info;
        private DataJobInputOutput inputOutput;
        private GlobalTags globalTags;
        private DataProcessInstanceResult runs;
        private EntityPrivileges privileges;
        private Boolean exists;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private java.util.List<Health> health;
        private Forms forms;
        private DataTransformLogic dataTransformLogic;
        private EntityIncidentsResult incidents;

        public Builder() {
        }

        /**
         * The primary key of the Data Job
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
         * Sub Types that this entity implements
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
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
         * Deprecated, use relationship IsPartOf instead
The associated data flow
         */
        public Builder setDataFlow(DataFlow dataFlow) {
            this.dataFlow = dataFlow;
            return this;
        }

        /**
         * Id of the job
         */
        public Builder setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * Additional read only properties associated with the Data Job
         */
        public Builder setProperties(DataJobProperties properties) {
            this.properties = properties;
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
         * Standardized platform urn where the data job is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
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
         * Additional read write properties associated with the Data Job
         */
        public Builder setEditableProperties(DataJobEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * The tags associated with the DataJob
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Ownership metadata of the job
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Status metadata of the DataJob
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
         * The Domain associated with the Data Job
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
         * The browse paths corresponding to the data job. If no Browse Paths have been generated before, this will be null.
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
Additional read only information about a Data processing job
         */
        @Deprecated
        public Builder setInfo(DataJobInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Information about the inputs and outputs of a Data processing job including column-level lineage.
         */
        public Builder setInputOutput(DataJobInputOutput inputOutput) {
            this.inputOutput = inputOutput;
            return this;
        }

        /**
         * Deprecated, use the tags field instead
The structured tags associated with the DataJob
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * History of runs of this task
         */
        public Builder setRuns(DataProcessInstanceResult runs) {
            this.runs = runs;
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
         * Data Transform Logic associated with the Data Job
         */
        public Builder setDataTransformLogic(DataTransformLogic dataTransformLogic) {
            this.dataTransformLogic = dataTransformLogic;
            return this;
        }

        /**
         * Incidents associated with the DataJob
         */
        public Builder setIncidents(EntityIncidentsResult incidents) {
            this.incidents = incidents;
            return this;
        }


        public DataJob build() {
            return new DataJob(urn, type, subTypes, lastIngested, dataFlow, jobId, properties, dataPlatformInstance, platform, container, parentContainers, editableProperties, tags, ownership, status, deprecation, institutionalMemory, glossaryTerms, domain, application, relationships, lineage, browsePaths, browsePathV2, info, inputOutput, globalTags, runs, privileges, exists, aspects, structuredProperties, health, forms, dataTransformLogic, incidents);
        }

    }
}
