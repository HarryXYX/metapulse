package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Dashboard Metadata Entity
 */
public class Dashboard implements java.io.Serializable, Entity, EntityWithRelationships, BrowsableEntity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private Long lastIngested;
    private Container container;
    private ParentContainersResult parentContainers;
    @javax.annotation.Nonnull
    private String tool;
    @javax.annotation.Nonnull
    private String dashboardId;
    private DashboardProperties properties;
    private DashboardEditableProperties editableProperties;
    private Ownership ownership;
    private Status status;
    private Embed embed;
    private Deprecation deprecation;
    private GlobalTags tags;
    private InstitutionalMemory institutionalMemory;
    private GlossaryTerms glossaryTerms;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private DataPlatformInstance dataPlatformInstance;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private java.util.List<BrowsePath> browsePaths;
    private BrowsePathV2 browsePathV2;
    private DashboardUsageQueryResult usageStats;
    private DashboardStatsSummary statsSummary;
    @Deprecated
    private DashboardInfo info;
    @Deprecated
    private DashboardEditableProperties editableInfo;
    @Deprecated
    private GlobalTags globalTags;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private InputFields inputFields;
    private SubTypes subTypes;
    private EntityPrivileges privileges;
    private Boolean exists;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private java.util.List<Health> health;
    private Forms forms;
    private EntityIncidentsResult incidents;

    public Dashboard() {
    }

    public Dashboard(String urn, EntityType type, Long lastIngested, Container container, ParentContainersResult parentContainers, String tool, String dashboardId, DashboardProperties properties, DashboardEditableProperties editableProperties, Ownership ownership, Status status, Embed embed, Deprecation deprecation, GlobalTags tags, InstitutionalMemory institutionalMemory, GlossaryTerms glossaryTerms, DomainAssociation domain, ApplicationAssociation application, DataPlatformInstance dataPlatformInstance, EntityRelationshipsResult relationships, EntityLineageResult lineage, java.util.List<BrowsePath> browsePaths, BrowsePathV2 browsePathV2, DashboardUsageQueryResult usageStats, DashboardStatsSummary statsSummary, DashboardInfo info, DashboardEditableProperties editableInfo, GlobalTags globalTags, DataPlatform platform, InputFields inputFields, SubTypes subTypes, EntityPrivileges privileges, Boolean exists, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, java.util.List<Health> health, Forms forms, EntityIncidentsResult incidents) {
        this.urn = urn;
        this.type = type;
        this.lastIngested = lastIngested;
        this.container = container;
        this.parentContainers = parentContainers;
        this.tool = tool;
        this.dashboardId = dashboardId;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.status = status;
        this.embed = embed;
        this.deprecation = deprecation;
        this.tags = tags;
        this.institutionalMemory = institutionalMemory;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.application = application;
        this.dataPlatformInstance = dataPlatformInstance;
        this.relationships = relationships;
        this.lineage = lineage;
        this.browsePaths = browsePaths;
        this.browsePathV2 = browsePathV2;
        this.usageStats = usageStats;
        this.statsSummary = statsSummary;
        this.info = info;
        this.editableInfo = editableInfo;
        this.globalTags = globalTags;
        this.platform = platform;
        this.inputFields = inputFields;
        this.subTypes = subTypes;
        this.privileges = privileges;
        this.exists = exists;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.health = health;
        this.forms = forms;
        this.incidents = incidents;
    }

    /**
     * The primary key of the Dashboard
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Dashboard
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
     * The dashboard tool name
Note that this will soon be deprecated in favor of a standardized notion of Data Platform
     */
    public String getTool() {
        return tool;
    }
    /**
     * The dashboard tool name
Note that this will soon be deprecated in favor of a standardized notion of Data Platform
     */
    public void setTool(String tool) {
        this.tool = tool;
    }

    /**
     * An id unique within the dashboard tool
     */
    public String getDashboardId() {
        return dashboardId;
    }
    /**
     * An id unique within the dashboard tool
     */
    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * Additional read only properties about the dashboard
     */
    public DashboardProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the dashboard
     */
    public void setProperties(DashboardProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about the dashboard
     */
    public DashboardEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about the dashboard
     */
    public void setEditableProperties(DashboardEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the dashboard
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the dashboard
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Status metadata of the dashboard
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the dashboard
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Embed information about the Dashboard
     */
    public Embed getEmbed() {
        return embed;
    }
    /**
     * Embed information about the Dashboard
     */
    public void setEmbed(Embed embed) {
        this.embed = embed;
    }

    /**
     * The deprecation status of the dashboard
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the dashboard
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
    }

    /**
     * The tags associated with the dashboard
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the dashboard
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
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
     * The Domain associated with the Dashboard
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the Dashboard
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
     * The browse paths corresponding to the dashboard. If no Browse Paths have been generated before, this will be null.
     */
    public java.util.List<BrowsePath> getBrowsePaths() {
        return browsePaths;
    }
    /**
     * The browse paths corresponding to the dashboard. If no Browse Paths have been generated before, this will be null.
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
     * Experimental (Subject to breaking change) -- Statistics about how this Dashboard is used
     */
    public DashboardUsageQueryResult getUsageStats() {
        return usageStats;
    }
    /**
     * Experimental (Subject to breaking change) -- Statistics about how this Dashboard is used
     */
    public void setUsageStats(DashboardUsageQueryResult usageStats) {
        this.usageStats = usageStats;
    }

    /**
     * Experimental - Summary operational & usage statistics about a Dashboard
     */
    public DashboardStatsSummary getStatsSummary() {
        return statsSummary;
    }
    /**
     * Experimental - Summary operational & usage statistics about a Dashboard
     */
    public void setStatsSummary(DashboardStatsSummary statsSummary) {
        this.statsSummary = statsSummary;
    }

    /**
     * Deprecated, use properties field instead
Additional read only information about the dashboard
     */
    @Deprecated
    public DashboardInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only information about the dashboard
     */
    @Deprecated
    public void setInfo(DashboardInfo info) {
        this.info = info;
    }

    /**
     * Deprecated, use editableProperties instead
Additional read write properties about the Dashboard
     */
    @Deprecated
    public DashboardEditableProperties getEditableInfo() {
        return editableInfo;
    }
    /**
     * Deprecated, use editableProperties instead
Additional read write properties about the Dashboard
     */
    @Deprecated
    public void setEditableInfo(DashboardEditableProperties editableInfo) {
        this.editableInfo = editableInfo;
    }

    /**
     * Deprecated, use tags field instead
The structured tags associated with the dashboard
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The structured tags associated with the dashboard
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * Standardized platform urn where the dashboard is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the dashboard is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Input fields that power all the charts in the dashboard
     */
    public InputFields getInputFields() {
        return inputFields;
    }
    /**
     * Input fields that power all the charts in the dashboard
     */
    public void setInputFields(InputFields inputFields) {
        this.inputFields = inputFields;
    }

    /**
     * Sub Types of the dashboard
     */
    public SubTypes getSubTypes() {
        return subTypes;
    }
    /**
     * Sub Types of the dashboard
     */
    public void setSubTypes(SubTypes subTypes) {
        this.subTypes = subTypes;
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
     * Incidents associated with the Dashboard
     */
    public EntityIncidentsResult getIncidents() {
        return incidents;
    }
    /**
     * Incidents associated with the Dashboard
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
        if (container != null) {
            joiner.add("container: " + container);
        }
        if (parentContainers != null) {
            joiner.add("parentContainers: " + parentContainers);
        }
        if (tool != null) {
            joiner.add("tool: \"" + tool + "\"");
        }
        if (dashboardId != null) {
            joiner.add("dashboardId: \"" + dashboardId + "\"");
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
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (embed != null) {
            joiner.add("embed: " + embed);
        }
        if (deprecation != null) {
            joiner.add("deprecation: " + deprecation);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
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
        if (usageStats != null) {
            joiner.add("usageStats: " + usageStats);
        }
        if (statsSummary != null) {
            joiner.add("statsSummary: " + statsSummary);
        }
        if (info != null) {
            joiner.add("info: " + info);
        }
        if (editableInfo != null) {
            joiner.add("editableInfo: " + editableInfo);
        }
        if (globalTags != null) {
            joiner.add("globalTags: " + globalTags);
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (inputFields != null) {
            joiner.add("inputFields: " + inputFields);
        }
        if (subTypes != null) {
            joiner.add("subTypes: " + subTypes);
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
        if (incidents != null) {
            joiner.add("incidents: " + incidents);
        }
        return joiner.toString();
    }

    public static Dashboard.Builder builder() {
        return new Dashboard.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Long lastIngested;
        private Container container;
        private ParentContainersResult parentContainers;
        private String tool;
        private String dashboardId;
        private DashboardProperties properties;
        private DashboardEditableProperties editableProperties;
        private Ownership ownership;
        private Status status;
        private Embed embed;
        private Deprecation deprecation;
        private GlobalTags tags;
        private InstitutionalMemory institutionalMemory;
        private GlossaryTerms glossaryTerms;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private DataPlatformInstance dataPlatformInstance;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private java.util.List<BrowsePath> browsePaths;
        private BrowsePathV2 browsePathV2;
        private DashboardUsageQueryResult usageStats;
        private DashboardStatsSummary statsSummary;
        private DashboardInfo info;
        private DashboardEditableProperties editableInfo;
        private GlobalTags globalTags;
        private DataPlatform platform;
        private InputFields inputFields;
        private SubTypes subTypes;
        private EntityPrivileges privileges;
        private Boolean exists;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private java.util.List<Health> health;
        private Forms forms;
        private EntityIncidentsResult incidents;

        public Builder() {
        }

        /**
         * The primary key of the Dashboard
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
         * The dashboard tool name
Note that this will soon be deprecated in favor of a standardized notion of Data Platform
         */
        public Builder setTool(String tool) {
            this.tool = tool;
            return this;
        }

        /**
         * An id unique within the dashboard tool
         */
        public Builder setDashboardId(String dashboardId) {
            this.dashboardId = dashboardId;
            return this;
        }

        /**
         * Additional read only properties about the dashboard
         */
        public Builder setProperties(DashboardProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about the dashboard
         */
        public Builder setEditableProperties(DashboardEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the dashboard
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Status metadata of the dashboard
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Embed information about the Dashboard
         */
        public Builder setEmbed(Embed embed) {
            this.embed = embed;
            return this;
        }

        /**
         * The deprecation status of the dashboard
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
            return this;
        }

        /**
         * The tags associated with the dashboard
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
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
         * The Domain associated with the Dashboard
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
         * The browse paths corresponding to the dashboard. If no Browse Paths have been generated before, this will be null.
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
         * Experimental (Subject to breaking change) -- Statistics about how this Dashboard is used
         */
        public Builder setUsageStats(DashboardUsageQueryResult usageStats) {
            this.usageStats = usageStats;
            return this;
        }

        /**
         * Experimental - Summary operational & usage statistics about a Dashboard
         */
        public Builder setStatsSummary(DashboardStatsSummary statsSummary) {
            this.statsSummary = statsSummary;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional read only information about the dashboard
         */
        @Deprecated
        public Builder setInfo(DashboardInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use editableProperties instead
Additional read write properties about the Dashboard
         */
        @Deprecated
        public Builder setEditableInfo(DashboardEditableProperties editableInfo) {
            this.editableInfo = editableInfo;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The structured tags associated with the dashboard
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * Standardized platform urn where the dashboard is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Input fields that power all the charts in the dashboard
         */
        public Builder setInputFields(InputFields inputFields) {
            this.inputFields = inputFields;
            return this;
        }

        /**
         * Sub Types of the dashboard
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
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
         * Incidents associated with the Dashboard
         */
        public Builder setIncidents(EntityIncidentsResult incidents) {
            this.incidents = incidents;
            return this;
        }


        public Dashboard build() {
            return new Dashboard(urn, type, lastIngested, container, parentContainers, tool, dashboardId, properties, editableProperties, ownership, status, embed, deprecation, tags, institutionalMemory, glossaryTerms, domain, application, dataPlatformInstance, relationships, lineage, browsePaths, browsePathV2, usageStats, statsSummary, info, editableInfo, globalTags, platform, inputFields, subTypes, privileges, exists, aspects, structuredProperties, health, forms, incidents);
        }

    }
}
