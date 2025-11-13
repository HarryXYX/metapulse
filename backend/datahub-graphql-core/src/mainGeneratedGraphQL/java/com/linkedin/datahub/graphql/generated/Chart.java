package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Chart Metadata Entity
 */
public class Chart implements java.io.Serializable, Entity, EntityWithRelationships, BrowsableEntity {

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
    private String chartId;
    private ChartProperties properties;
    private ChartEditableProperties editableProperties;
    private ChartQuery query;
    private Ownership ownership;
    private Status status;
    private Deprecation deprecation;
    private Embed embed;
    private GlobalTags tags;
    private InstitutionalMemory institutionalMemory;
    private GlossaryTerms glossaryTerms;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private DataPlatformInstance dataPlatformInstance;
    private ChartStatsSummary statsSummary;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private java.util.List<BrowsePath> browsePaths;
    private BrowsePathV2 browsePathV2;
    @Deprecated
    private ChartInfo info;
    @Deprecated
    private ChartEditableProperties editableInfo;
    @Deprecated
    private GlobalTags globalTags;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private InputFields inputFields;
    private EntityPrivileges privileges;
    private Boolean exists;
    private SubTypes subTypes;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private java.util.List<Health> health;
    private Forms forms;
    private EntityIncidentsResult incidents;

    public Chart() {
    }

    public Chart(String urn, EntityType type, Long lastIngested, Container container, ParentContainersResult parentContainers, String tool, String chartId, ChartProperties properties, ChartEditableProperties editableProperties, ChartQuery query, Ownership ownership, Status status, Deprecation deprecation, Embed embed, GlobalTags tags, InstitutionalMemory institutionalMemory, GlossaryTerms glossaryTerms, DomainAssociation domain, ApplicationAssociation application, DataPlatformInstance dataPlatformInstance, ChartStatsSummary statsSummary, EntityRelationshipsResult relationships, EntityLineageResult lineage, java.util.List<BrowsePath> browsePaths, BrowsePathV2 browsePathV2, ChartInfo info, ChartEditableProperties editableInfo, GlobalTags globalTags, DataPlatform platform, InputFields inputFields, EntityPrivileges privileges, Boolean exists, SubTypes subTypes, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, java.util.List<Health> health, Forms forms, EntityIncidentsResult incidents) {
        this.urn = urn;
        this.type = type;
        this.lastIngested = lastIngested;
        this.container = container;
        this.parentContainers = parentContainers;
        this.tool = tool;
        this.chartId = chartId;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.query = query;
        this.ownership = ownership;
        this.status = status;
        this.deprecation = deprecation;
        this.embed = embed;
        this.tags = tags;
        this.institutionalMemory = institutionalMemory;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.application = application;
        this.dataPlatformInstance = dataPlatformInstance;
        this.statsSummary = statsSummary;
        this.relationships = relationships;
        this.lineage = lineage;
        this.browsePaths = browsePaths;
        this.browsePathV2 = browsePathV2;
        this.info = info;
        this.editableInfo = editableInfo;
        this.globalTags = globalTags;
        this.platform = platform;
        this.inputFields = inputFields;
        this.privileges = privileges;
        this.exists = exists;
        this.subTypes = subTypes;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.health = health;
        this.forms = forms;
        this.incidents = incidents;
    }

    /**
     * The primary key of the Chart
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Chart
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
     * The chart tool name
Note that this field will soon be deprecated in favor a unified notion of Data Platform
     */
    public String getTool() {
        return tool;
    }
    /**
     * The chart tool name
Note that this field will soon be deprecated in favor a unified notion of Data Platform
     */
    public void setTool(String tool) {
        this.tool = tool;
    }

    /**
     * An id unique within the charting tool
     */
    public String getChartId() {
        return chartId;
    }
    /**
     * An id unique within the charting tool
     */
    public void setChartId(String chartId) {
        this.chartId = chartId;
    }

    /**
     * Additional read only properties about the Chart
     */
    public ChartProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the Chart
     */
    public void setProperties(ChartProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about the Chart
     */
    public ChartEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about the Chart
     */
    public void setEditableProperties(ChartEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Info about the query which is used to render the chart
     */
    public ChartQuery getQuery() {
        return query;
    }
    /**
     * Info about the query which is used to render the chart
     */
    public void setQuery(ChartQuery query) {
        this.query = query;
    }

    /**
     * Ownership metadata of the chart
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the chart
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Status metadata of the chart
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the chart
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * The deprecation status of the chart
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the chart
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
    }

    /**
     * Embed information about the Chart
     */
    public Embed getEmbed() {
        return embed;
    }
    /**
     * Embed information about the Chart
     */
    public void setEmbed(Embed embed) {
        this.embed = embed;
    }

    /**
     * The tags associated with the chart
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * The tags associated with the chart
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
     * The Domain associated with the Chart
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the Chart
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
     * Not yet implemented.

Experimental - Summary operational & usage statistics about a Chart
     */
    public ChartStatsSummary getStatsSummary() {
        return statsSummary;
    }
    /**
     * Not yet implemented.

Experimental - Summary operational & usage statistics about a Chart
     */
    public void setStatsSummary(ChartStatsSummary statsSummary) {
        this.statsSummary = statsSummary;
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
     * The browse paths corresponding to the chart. If no Browse Paths have been generated before, this will be null.
     */
    public java.util.List<BrowsePath> getBrowsePaths() {
        return browsePaths;
    }
    /**
     * The browse paths corresponding to the chart. If no Browse Paths have been generated before, this will be null.
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
Additional read only information about the chart
     */
    @Deprecated
    public ChartInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only information about the chart
     */
    @Deprecated
    public void setInfo(ChartInfo info) {
        this.info = info;
    }

    /**
     * Deprecated, use editableProperties field instead
Additional read write information about the Chart
     */
    @Deprecated
    public ChartEditableProperties getEditableInfo() {
        return editableInfo;
    }
    /**
     * Deprecated, use editableProperties field instead
Additional read write information about the Chart
     */
    @Deprecated
    public void setEditableInfo(ChartEditableProperties editableInfo) {
        this.editableInfo = editableInfo;
    }

    /**
     * Deprecated, use tags instead
The structured tags associated with the chart
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags instead
The structured tags associated with the chart
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * Standardized platform urn where the chart is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the chart is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Input fields to power the chart
     */
    public InputFields getInputFields() {
        return inputFields;
    }
    /**
     * Input fields to power the chart
     */
    public void setInputFields(InputFields inputFields) {
        this.inputFields = inputFields;
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
     * Incidents associated with the Chart
     */
    public EntityIncidentsResult getIncidents() {
        return incidents;
    }
    /**
     * Incidents associated with the Chart
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
        if (chartId != null) {
            joiner.add("chartId: \"" + chartId + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
        }
        if (query != null) {
            joiner.add("query: " + query);
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
        if (embed != null) {
            joiner.add("embed: " + embed);
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
        if (statsSummary != null) {
            joiner.add("statsSummary: " + statsSummary);
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
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        if (exists != null) {
            joiner.add("exists: " + exists);
        }
        if (subTypes != null) {
            joiner.add("subTypes: " + subTypes);
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

    public static Chart.Builder builder() {
        return new Chart.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Long lastIngested;
        private Container container;
        private ParentContainersResult parentContainers;
        private String tool;
        private String chartId;
        private ChartProperties properties;
        private ChartEditableProperties editableProperties;
        private ChartQuery query;
        private Ownership ownership;
        private Status status;
        private Deprecation deprecation;
        private Embed embed;
        private GlobalTags tags;
        private InstitutionalMemory institutionalMemory;
        private GlossaryTerms glossaryTerms;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private DataPlatformInstance dataPlatformInstance;
        private ChartStatsSummary statsSummary;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private java.util.List<BrowsePath> browsePaths;
        private BrowsePathV2 browsePathV2;
        private ChartInfo info;
        private ChartEditableProperties editableInfo;
        private GlobalTags globalTags;
        private DataPlatform platform;
        private InputFields inputFields;
        private EntityPrivileges privileges;
        private Boolean exists;
        private SubTypes subTypes;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private java.util.List<Health> health;
        private Forms forms;
        private EntityIncidentsResult incidents;

        public Builder() {
        }

        /**
         * The primary key of the Chart
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
         * The chart tool name
Note that this field will soon be deprecated in favor a unified notion of Data Platform
         */
        public Builder setTool(String tool) {
            this.tool = tool;
            return this;
        }

        /**
         * An id unique within the charting tool
         */
        public Builder setChartId(String chartId) {
            this.chartId = chartId;
            return this;
        }

        /**
         * Additional read only properties about the Chart
         */
        public Builder setProperties(ChartProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about the Chart
         */
        public Builder setEditableProperties(ChartEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Info about the query which is used to render the chart
         */
        public Builder setQuery(ChartQuery query) {
            this.query = query;
            return this;
        }

        /**
         * Ownership metadata of the chart
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Status metadata of the chart
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * The deprecation status of the chart
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
            return this;
        }

        /**
         * Embed information about the Chart
         */
        public Builder setEmbed(Embed embed) {
            this.embed = embed;
            return this;
        }

        /**
         * The tags associated with the chart
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
         * The Domain associated with the Chart
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
         * Not yet implemented.

Experimental - Summary operational & usage statistics about a Chart
         */
        public Builder setStatsSummary(ChartStatsSummary statsSummary) {
            this.statsSummary = statsSummary;
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
         * The browse paths corresponding to the chart. If no Browse Paths have been generated before, this will be null.
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
Additional read only information about the chart
         */
        @Deprecated
        public Builder setInfo(ChartInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Deprecated, use editableProperties field instead
Additional read write information about the Chart
         */
        @Deprecated
        public Builder setEditableInfo(ChartEditableProperties editableInfo) {
            this.editableInfo = editableInfo;
            return this;
        }

        /**
         * Deprecated, use tags instead
The structured tags associated with the chart
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * Standardized platform urn where the chart is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Input fields to power the chart
         */
        public Builder setInputFields(InputFields inputFields) {
            this.inputFields = inputFields;
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
         * Sub Types that this entity implements
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
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
         * Incidents associated with the Chart
         */
        public Builder setIncidents(EntityIncidentsResult incidents) {
            this.incidents = incidents;
            return this;
        }


        public Chart build() {
            return new Chart(urn, type, lastIngested, container, parentContainers, tool, chartId, properties, editableProperties, query, ownership, status, deprecation, embed, tags, institutionalMemory, glossaryTerms, domain, application, dataPlatformInstance, statsSummary, relationships, lineage, browsePaths, browsePathV2, info, editableInfo, globalTags, platform, inputFields, privileges, exists, subTypes, aspects, structuredProperties, health, forms, incidents);
        }

    }
}
