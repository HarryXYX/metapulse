package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Dataset entity, which encompasses Relational Tables, Document store collections, streaming topics, and other sets of data having an independent lifecycle
 */
public class Dataset implements java.io.Serializable, Entity, SupportsVersions, EntityWithRelationships, BrowsableEntity, HasLogicalParent {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private Long lastIngested;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private Container container;
    private ParentContainersResult parentContainers;
    @javax.annotation.Nonnull
    private String name;
    private DatasetProperties properties;
    private DatasetEditableProperties editableProperties;
    private Ownership ownership;
    private Deprecation deprecation;
    private InstitutionalMemory institutionalMemory;
    private SchemaMetadata schemaMetadata;
    private EditableSchemaMetadata editableSchemaMetadata;
    private Status status;
    private Embed embed;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private DataPlatformInstance dataPlatformInstance;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private Forms forms;
    private Access access;
    private UsageQueryResult usageStats;
    private DatasetStatsSummary statsSummary;
    private java.util.List<DatasetProfile> datasetProfiles;
    private java.util.List<Operation> operations;
    private EntityAssertionsResult assertions;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private java.util.List<BrowsePath> browsePaths;
    private BrowsePathV2 browsePathV2;
    private java.util.List<Health> health;
    @Deprecated
    private Schema schema;
    @Deprecated
    private String externalUrl;
    @Deprecated
    @javax.annotation.Nonnull
    private FabricType origin;
    @Deprecated
    private String description;
    @Deprecated
    private PlatformNativeType platformNativeType;
    @Deprecated
    private String uri;
    @Deprecated
    private GlobalTags globalTags;
    private SubTypes subTypes;
    private ViewProperties viewProperties;
    private java.util.List<RawAspect> aspects;
    private DataProcessInstanceResult runs;
    private SiblingProperties siblings;
    private ScrollResults siblingsSearch;
    private java.util.List<FineGrainedLineage> fineGrainedLineages;
    private EntityPrivileges privileges;
    private Boolean exists;
    private StructuredProperties structuredProperties;
    private OperationsQueryResult operationsStats;
    private TestResults testResults;
    private TimeseriesCapabilitiesResult timeseriesCapabilities;
    private EntityIncidentsResult incidents;
    private VersionProperties versionProperties;
    private Entity logicalParent;
    private DataContract contract;

    public Dataset() {
    }

    public Dataset(String urn, EntityType type, Long lastIngested, DataPlatform platform, Container container, ParentContainersResult parentContainers, String name, DatasetProperties properties, DatasetEditableProperties editableProperties, Ownership ownership, Deprecation deprecation, InstitutionalMemory institutionalMemory, SchemaMetadata schemaMetadata, EditableSchemaMetadata editableSchemaMetadata, Status status, Embed embed, GlobalTags tags, GlossaryTerms glossaryTerms, DataPlatformInstance dataPlatformInstance, DomainAssociation domain, ApplicationAssociation application, Forms forms, Access access, UsageQueryResult usageStats, DatasetStatsSummary statsSummary, java.util.List<DatasetProfile> datasetProfiles, java.util.List<Operation> operations, EntityAssertionsResult assertions, EntityRelationshipsResult relationships, EntityLineageResult lineage, java.util.List<BrowsePath> browsePaths, BrowsePathV2 browsePathV2, java.util.List<Health> health, Schema schema, String externalUrl, FabricType origin, String description, PlatformNativeType platformNativeType, String uri, GlobalTags globalTags, SubTypes subTypes, ViewProperties viewProperties, java.util.List<RawAspect> aspects, DataProcessInstanceResult runs, SiblingProperties siblings, ScrollResults siblingsSearch, java.util.List<FineGrainedLineage> fineGrainedLineages, EntityPrivileges privileges, Boolean exists, StructuredProperties structuredProperties, OperationsQueryResult operationsStats, TestResults testResults, TimeseriesCapabilitiesResult timeseriesCapabilities, EntityIncidentsResult incidents, VersionProperties versionProperties, Entity logicalParent, DataContract contract) {
        this.urn = urn;
        this.type = type;
        this.lastIngested = lastIngested;
        this.platform = platform;
        this.container = container;
        this.parentContainers = parentContainers;
        this.name = name;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.deprecation = deprecation;
        this.institutionalMemory = institutionalMemory;
        this.schemaMetadata = schemaMetadata;
        this.editableSchemaMetadata = editableSchemaMetadata;
        this.status = status;
        this.embed = embed;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.dataPlatformInstance = dataPlatformInstance;
        this.domain = domain;
        this.application = application;
        this.forms = forms;
        this.access = access;
        this.usageStats = usageStats;
        this.statsSummary = statsSummary;
        this.datasetProfiles = datasetProfiles;
        this.operations = operations;
        this.assertions = assertions;
        this.relationships = relationships;
        this.lineage = lineage;
        this.browsePaths = browsePaths;
        this.browsePathV2 = browsePathV2;
        this.health = health;
        this.schema = schema;
        this.externalUrl = externalUrl;
        this.origin = origin;
        this.description = description;
        this.platformNativeType = platformNativeType;
        this.uri = uri;
        this.globalTags = globalTags;
        this.subTypes = subTypes;
        this.viewProperties = viewProperties;
        this.aspects = aspects;
        this.runs = runs;
        this.siblings = siblings;
        this.siblingsSearch = siblingsSearch;
        this.fineGrainedLineages = fineGrainedLineages;
        this.privileges = privileges;
        this.exists = exists;
        this.structuredProperties = structuredProperties;
        this.operationsStats = operationsStats;
        this.testResults = testResults;
        this.timeseriesCapabilities = timeseriesCapabilities;
        this.incidents = incidents;
        this.versionProperties = versionProperties;
        this.logicalParent = logicalParent;
        this.contract = contract;
    }

    /**
     * The primary key of the Dataset
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Dataset
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard Entity Type
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
     * Standardized platform urn where the dataset is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the dataset is defined
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
     * Unique guid for dataset
No longer to be used as the Dataset display name. Use properties.name instead
     */
    public String getName() {
        return name;
    }
    /**
     * Unique guid for dataset
No longer to be used as the Dataset display name. Use properties.name instead
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * An additional set of read only properties
     */
    public DatasetProperties getProperties() {
        return properties;
    }
    /**
     * An additional set of read only properties
     */
    public void setProperties(DatasetProperties properties) {
        this.properties = properties;
    }

    /**
     * An additional set of of read write properties
     */
    public DatasetEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(DatasetEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
    }

    /**
     * Ownership metadata of the dataset
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the dataset
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * The deprecation status of the dataset
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the dataset
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
    }

    /**
     * References to internal resources related to the dataset
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the dataset
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Schema metadata of the dataset, available by version number
     */
    public SchemaMetadata getSchemaMetadata() {
        return schemaMetadata;
    }
    /**
     * Schema metadata of the dataset, available by version number
     */
    public void setSchemaMetadata(SchemaMetadata schemaMetadata) {
        this.schemaMetadata = schemaMetadata;
    }

    /**
     * Editable schema metadata of the dataset
     */
    public EditableSchemaMetadata getEditableSchemaMetadata() {
        return editableSchemaMetadata;
    }
    /**
     * Editable schema metadata of the dataset
     */
    public void setEditableSchemaMetadata(EditableSchemaMetadata editableSchemaMetadata) {
        this.editableSchemaMetadata = editableSchemaMetadata;
    }

    /**
     * Status of the Dataset
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status of the Dataset
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Embed information about the Dataset
     */
    public Embed getEmbed() {
        return embed;
    }
    /**
     * Embed information about the Dataset
     */
    public void setEmbed(Embed embed) {
        this.embed = embed;
    }

    /**
     * Tags used for searching dataset
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * Tags used for searching dataset
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * The structured glossary terms associated with the dataset
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the dataset
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
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
     * The Domain associated with the Dataset
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the Dataset
     */
    public void setDomain(DomainAssociation domain) {
        this.domain = domain;
    }

    /**
     * The application associated with the dataset
     */
    public ApplicationAssociation getApplication() {
        return application;
    }
    /**
     * The application associated with the dataset
     */
    public void setApplication(ApplicationAssociation application) {
        this.application = application;
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
     * The Roles and the properties to access the dataset
     */
    public Access getAccess() {
        return access;
    }
    /**
     * The Roles and the properties to access the dataset
     */
    public void setAccess(Access access) {
        this.access = access;
    }

    /**
     * Statistics about how this Dataset is used
The first parameter, `resource`, is deprecated and no longer needs to be provided
timeZone accepts standard IANA time zone identifier ie. America/New_York
     */
    public UsageQueryResult getUsageStats() {
        return usageStats;
    }
    /**
     * Statistics about how this Dataset is used
The first parameter, `resource`, is deprecated and no longer needs to be provided
timeZone accepts standard IANA time zone identifier ie. America/New_York
     */
    public void setUsageStats(UsageQueryResult usageStats) {
        this.usageStats = usageStats;
    }

    /**
     * Experimental - Summary operational & usage statistics about a Dataset
     */
    public DatasetStatsSummary getStatsSummary() {
        return statsSummary;
    }
    /**
     * Experimental - Summary operational & usage statistics about a Dataset
     */
    public void setStatsSummary(DatasetStatsSummary statsSummary) {
        this.statsSummary = statsSummary;
    }

    /**
     * Profile Stats resource that retrieves the events in a previous unit of time in descending order
If no start or end time are provided, the most recent events will be returned
     */
    public java.util.List<DatasetProfile> getDatasetProfiles() {
        return datasetProfiles;
    }
    /**
     * Profile Stats resource that retrieves the events in a previous unit of time in descending order
If no start or end time are provided, the most recent events will be returned
     */
    public void setDatasetProfiles(java.util.List<DatasetProfile> datasetProfiles) {
        this.datasetProfiles = datasetProfiles;
    }

    /**
     * Operational events for an entity.
     */
    public java.util.List<Operation> getOperations() {
        return operations;
    }
    /**
     * Operational events for an entity.
     */
    public void setOperations(java.util.List<Operation> operations) {
        this.operations = operations;
    }

    /**
     * Assertions associated with the Dataset
     */
    public EntityAssertionsResult getAssertions() {
        return assertions;
    }
    /**
     * Assertions associated with the Dataset
     */
    public void setAssertions(EntityAssertionsResult assertions) {
        this.assertions = assertions;
    }

    /**
     * Edges extending from this entity
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Edges extending from this entity
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
     * The browse paths corresponding to the dataset. If no Browse Paths have been generated before, this will be null.
     */
    public java.util.List<BrowsePath> getBrowsePaths() {
        return browsePaths;
    }
    /**
     * The browse paths corresponding to the dataset. If no Browse Paths have been generated before, this will be null.
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
     * Experimental! The resolved health statuses of the Dataset
     */
    public java.util.List<Health> getHealth() {
        return health;
    }
    /**
     * Experimental! The resolved health statuses of the Dataset
     */
    public void setHealth(java.util.List<Health> health) {
        this.health = health;
    }

    /**
     * Schema metadata of the dataset
     */
    @Deprecated
    public Schema getSchema() {
        return schema;
    }
    /**
     * Schema metadata of the dataset
     */
    @Deprecated
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    /**
     * Deprecated, use properties field instead
External URL associated with the Dataset
     */
    @Deprecated
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Deprecated, use properties field instead
External URL associated with the Dataset
     */
    @Deprecated
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Deprecated, see the properties field instead
Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
     */
    @Deprecated
    public FabricType getOrigin() {
        return origin;
    }
    /**
     * Deprecated, see the properties field instead
Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
     */
    @Deprecated
    public void setOrigin(FabricType origin) {
        this.origin = origin;
    }

    /**
     * Deprecated, use the properties field instead
Read only technical description for dataset
     */
    @Deprecated
    public String getDescription() {
        return description;
    }
    /**
     * Deprecated, use the properties field instead
Read only technical description for dataset
     */
    @Deprecated
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Deprecated, do not use this field
The logical type of the dataset ie table, stream, etc
     */
    @Deprecated
    public PlatformNativeType getPlatformNativeType() {
        return platformNativeType;
    }
    /**
     * Deprecated, do not use this field
The logical type of the dataset ie table, stream, etc
     */
    @Deprecated
    public void setPlatformNativeType(PlatformNativeType platformNativeType) {
        this.platformNativeType = platformNativeType;
    }

    /**
     * Deprecated, use properties instead
Native Dataset Uri
Uri should not include any environment specific properties
     */
    @Deprecated
    public String getUri() {
        return uri;
    }
    /**
     * Deprecated, use properties instead
Native Dataset Uri
Uri should not include any environment specific properties
     */
    @Deprecated
    public void setUri(String uri) {
        this.uri = uri;
    }

    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataset
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
The structured tags associated with the dataset
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
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
     * View related properties. Only relevant if subtypes field contains view.
     */
    public ViewProperties getViewProperties() {
        return viewProperties;
    }
    /**
     * View related properties. Only relevant if subtypes field contains view.
     */
    public void setViewProperties(ViewProperties viewProperties) {
        this.viewProperties = viewProperties;
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
     * History of datajob runs that either produced or consumed this dataset
     */
    public DataProcessInstanceResult getRuns() {
        return runs;
    }
    /**
     * History of datajob runs that either produced or consumed this dataset
     */
    public void setRuns(DataProcessInstanceResult runs) {
        this.runs = runs;
    }

    /**
     * Metadata about the datasets siblings
     */
    public SiblingProperties getSiblings() {
        return siblings;
    }
    /**
     * Metadata about the datasets siblings
     */
    public void setSiblings(SiblingProperties siblings) {
        this.siblings = siblings;
    }

    /**
     * Executes a search on only the siblings of an entity
     */
    public ScrollResults getSiblingsSearch() {
        return siblingsSearch;
    }
    /**
     * Executes a search on only the siblings of an entity
     */
    public void setSiblingsSearch(ScrollResults siblingsSearch) {
        this.siblingsSearch = siblingsSearch;
    }

    /**
     * Lineage information for the column-level. Includes a list of objects
detailing which columns are upstream and which are downstream of each other.
The upstream and downstream columns are from datasets.
     */
    public java.util.List<FineGrainedLineage> getFineGrainedLineages() {
        return fineGrainedLineages;
    }
    /**
     * Lineage information for the column-level. Includes a list of objects
detailing which columns are upstream and which are downstream of each other.
The upstream and downstream columns are from datasets.
     */
    public void setFineGrainedLineages(java.util.List<FineGrainedLineage> fineGrainedLineages) {
        this.fineGrainedLineages = fineGrainedLineages;
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
     * Structured properties about this Dataset
     */
    public StructuredProperties getStructuredProperties() {
        return structuredProperties;
    }
    /**
     * Structured properties about this Dataset
     */
    public void setStructuredProperties(StructuredProperties structuredProperties) {
        this.structuredProperties = structuredProperties;
    }

    /**
     * Statistics about how this Dataset has been operated on
     */
    public OperationsQueryResult getOperationsStats() {
        return operationsStats;
    }
    /**
     * Statistics about how this Dataset has been operated on
     */
    public void setOperationsStats(OperationsQueryResult operationsStats) {
        this.operationsStats = operationsStats;
    }

    /**
     * The results of evaluating tests
     */
    public TestResults getTestResults() {
        return testResults;
    }
    /**
     * The results of evaluating tests
     */
    public void setTestResults(TestResults testResults) {
        this.testResults = testResults;
    }

    /**
     * Returns a set of capabilities regarding our timerseries indices
     */
    public TimeseriesCapabilitiesResult getTimeseriesCapabilities() {
        return timeseriesCapabilities;
    }
    /**
     * Returns a set of capabilities regarding our timerseries indices
     */
    public void setTimeseriesCapabilities(TimeseriesCapabilitiesResult timeseriesCapabilities) {
        this.timeseriesCapabilities = timeseriesCapabilities;
    }

    /**
     * Incidents associated with the Dataset
     */
    public EntityIncidentsResult getIncidents() {
        return incidents;
    }
    /**
     * Incidents associated with the Dataset
     */
    public void setIncidents(EntityIncidentsResult incidents) {
        this.incidents = incidents;
    }

    /**
     * Indicates that this entity is versioned and provides information about the version.
     */
    public VersionProperties getVersionProperties() {
        return versionProperties;
    }
    /**
     * Indicates that this entity is versioned and provides information about the version.
     */
    public void setVersionProperties(VersionProperties versionProperties) {
        this.versionProperties = versionProperties;
    }

    /**
     * If this entity represents a physical asset, this is its logical parent, from which metadata can propagate.
     */
    public Entity getLogicalParent() {
        return logicalParent;
    }
    /**
     * If this entity represents a physical asset, this is its logical parent, from which metadata can propagate.
     */
    public void setLogicalParent(Entity logicalParent) {
        this.logicalParent = logicalParent;
    }

    /**
     * An optional Data Contract defined for the Dataset.
     */
    public DataContract getContract() {
        return contract;
    }
    /**
     * An optional Data Contract defined for the Dataset.
     */
    public void setContract(DataContract contract) {
        this.contract = contract;
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
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (container != null) {
            joiner.add("container: " + container);
        }
        if (parentContainers != null) {
            joiner.add("parentContainers: " + parentContainers);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
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
        if (deprecation != null) {
            joiner.add("deprecation: " + deprecation);
        }
        if (institutionalMemory != null) {
            joiner.add("institutionalMemory: " + institutionalMemory);
        }
        if (schemaMetadata != null) {
            joiner.add("schemaMetadata: " + schemaMetadata);
        }
        if (editableSchemaMetadata != null) {
            joiner.add("editableSchemaMetadata: " + editableSchemaMetadata);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (embed != null) {
            joiner.add("embed: " + embed);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        if (dataPlatformInstance != null) {
            joiner.add("dataPlatformInstance: " + dataPlatformInstance);
        }
        if (domain != null) {
            joiner.add("domain: " + domain);
        }
        if (application != null) {
            joiner.add("application: " + application);
        }
        if (forms != null) {
            joiner.add("forms: " + forms);
        }
        if (access != null) {
            joiner.add("access: " + access);
        }
        if (usageStats != null) {
            joiner.add("usageStats: " + usageStats);
        }
        if (statsSummary != null) {
            joiner.add("statsSummary: " + statsSummary);
        }
        if (datasetProfiles != null) {
            joiner.add("datasetProfiles: " + datasetProfiles);
        }
        if (operations != null) {
            joiner.add("operations: " + operations);
        }
        if (assertions != null) {
            joiner.add("assertions: " + assertions);
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
        if (health != null) {
            joiner.add("health: " + health);
        }
        if (schema != null) {
            joiner.add("schema: " + schema);
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (origin != null) {
            joiner.add("origin: " + origin);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (platformNativeType != null) {
            joiner.add("platformNativeType: " + platformNativeType);
        }
        if (uri != null) {
            joiner.add("uri: \"" + uri + "\"");
        }
        if (globalTags != null) {
            joiner.add("globalTags: " + globalTags);
        }
        if (subTypes != null) {
            joiner.add("subTypes: " + subTypes);
        }
        if (viewProperties != null) {
            joiner.add("viewProperties: " + viewProperties);
        }
        if (aspects != null) {
            joiner.add("aspects: " + aspects);
        }
        if (runs != null) {
            joiner.add("runs: " + runs);
        }
        if (siblings != null) {
            joiner.add("siblings: " + siblings);
        }
        if (siblingsSearch != null) {
            joiner.add("siblingsSearch: " + siblingsSearch);
        }
        if (fineGrainedLineages != null) {
            joiner.add("fineGrainedLineages: " + fineGrainedLineages);
        }
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        if (exists != null) {
            joiner.add("exists: " + exists);
        }
        if (structuredProperties != null) {
            joiner.add("structuredProperties: " + structuredProperties);
        }
        if (operationsStats != null) {
            joiner.add("operationsStats: " + operationsStats);
        }
        if (testResults != null) {
            joiner.add("testResults: " + testResults);
        }
        if (timeseriesCapabilities != null) {
            joiner.add("timeseriesCapabilities: " + timeseriesCapabilities);
        }
        if (incidents != null) {
            joiner.add("incidents: " + incidents);
        }
        if (versionProperties != null) {
            joiner.add("versionProperties: " + versionProperties);
        }
        if (logicalParent != null) {
            joiner.add("logicalParent: " + logicalParent);
        }
        if (contract != null) {
            joiner.add("contract: " + contract);
        }
        return joiner.toString();
    }

    public static Dataset.Builder builder() {
        return new Dataset.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Long lastIngested;
        private DataPlatform platform;
        private Container container;
        private ParentContainersResult parentContainers;
        private String name;
        private DatasetProperties properties;
        private DatasetEditableProperties editableProperties;
        private Ownership ownership;
        private Deprecation deprecation;
        private InstitutionalMemory institutionalMemory;
        private SchemaMetadata schemaMetadata;
        private EditableSchemaMetadata editableSchemaMetadata;
        private Status status;
        private Embed embed;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private DataPlatformInstance dataPlatformInstance;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private Forms forms;
        private Access access;
        private UsageQueryResult usageStats;
        private DatasetStatsSummary statsSummary;
        private java.util.List<DatasetProfile> datasetProfiles;
        private java.util.List<Operation> operations;
        private EntityAssertionsResult assertions;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private java.util.List<BrowsePath> browsePaths;
        private BrowsePathV2 browsePathV2;
        private java.util.List<Health> health;
        private Schema schema;
        private String externalUrl;
        private FabricType origin;
        private String description;
        private PlatformNativeType platformNativeType;
        private String uri;
        private GlobalTags globalTags;
        private SubTypes subTypes;
        private ViewProperties viewProperties;
        private java.util.List<RawAspect> aspects;
        private DataProcessInstanceResult runs;
        private SiblingProperties siblings;
        private ScrollResults siblingsSearch;
        private java.util.List<FineGrainedLineage> fineGrainedLineages;
        private EntityPrivileges privileges;
        private Boolean exists;
        private StructuredProperties structuredProperties;
        private OperationsQueryResult operationsStats;
        private TestResults testResults;
        private TimeseriesCapabilitiesResult timeseriesCapabilities;
        private EntityIncidentsResult incidents;
        private VersionProperties versionProperties;
        private Entity logicalParent;
        private DataContract contract;

        public Builder() {
        }

        /**
         * The primary key of the Dataset
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard Entity Type
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
         * Standardized platform urn where the dataset is defined
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
         * Unique guid for dataset
No longer to be used as the Dataset display name. Use properties.name instead
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * An additional set of read only properties
         */
        public Builder setProperties(DatasetProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * An additional set of of read write properties
         */
        public Builder setEditableProperties(DatasetEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }

        /**
         * Ownership metadata of the dataset
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * The deprecation status of the dataset
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
            return this;
        }

        /**
         * References to internal resources related to the dataset
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Schema metadata of the dataset, available by version number
         */
        public Builder setSchemaMetadata(SchemaMetadata schemaMetadata) {
            this.schemaMetadata = schemaMetadata;
            return this;
        }

        /**
         * Editable schema metadata of the dataset
         */
        public Builder setEditableSchemaMetadata(EditableSchemaMetadata editableSchemaMetadata) {
            this.editableSchemaMetadata = editableSchemaMetadata;
            return this;
        }

        /**
         * Status of the Dataset
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Embed information about the Dataset
         */
        public Builder setEmbed(Embed embed) {
            this.embed = embed;
            return this;
        }

        /**
         * Tags used for searching dataset
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The structured glossary terms associated with the dataset
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
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
         * The Domain associated with the Dataset
         */
        public Builder setDomain(DomainAssociation domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The application associated with the dataset
         */
        public Builder setApplication(ApplicationAssociation application) {
            this.application = application;
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
         * The Roles and the properties to access the dataset
         */
        public Builder setAccess(Access access) {
            this.access = access;
            return this;
        }

        /**
         * Statistics about how this Dataset is used
The first parameter, `resource`, is deprecated and no longer needs to be provided
timeZone accepts standard IANA time zone identifier ie. America/New_York
         */
        public Builder setUsageStats(UsageQueryResult usageStats) {
            this.usageStats = usageStats;
            return this;
        }

        /**
         * Experimental - Summary operational & usage statistics about a Dataset
         */
        public Builder setStatsSummary(DatasetStatsSummary statsSummary) {
            this.statsSummary = statsSummary;
            return this;
        }

        /**
         * Profile Stats resource that retrieves the events in a previous unit of time in descending order
If no start or end time are provided, the most recent events will be returned
         */
        public Builder setDatasetProfiles(java.util.List<DatasetProfile> datasetProfiles) {
            this.datasetProfiles = datasetProfiles;
            return this;
        }

        /**
         * Operational events for an entity.
         */
        public Builder setOperations(java.util.List<Operation> operations) {
            this.operations = operations;
            return this;
        }

        /**
         * Assertions associated with the Dataset
         */
        public Builder setAssertions(EntityAssertionsResult assertions) {
            this.assertions = assertions;
            return this;
        }

        /**
         * Edges extending from this entity
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
         * The browse paths corresponding to the dataset. If no Browse Paths have been generated before, this will be null.
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
         * Experimental! The resolved health statuses of the Dataset
         */
        public Builder setHealth(java.util.List<Health> health) {
            this.health = health;
            return this;
        }

        /**
         * Schema metadata of the dataset
         */
        @Deprecated
        public Builder setSchema(Schema schema) {
            this.schema = schema;
            return this;
        }

        /**
         * Deprecated, use properties field instead
External URL associated with the Dataset
         */
        @Deprecated
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Deprecated, see the properties field instead
Environment in which the dataset belongs to or where it was generated
Note that this field will soon be deprecated in favor of a more standardized concept of Environment
         */
        @Deprecated
        public Builder setOrigin(FabricType origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Deprecated, use the properties field instead
Read only technical description for dataset
         */
        @Deprecated
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Deprecated, do not use this field
The logical type of the dataset ie table, stream, etc
         */
        @Deprecated
        public Builder setPlatformNativeType(PlatformNativeType platformNativeType) {
            this.platformNativeType = platformNativeType;
            return this;
        }

        /**
         * Deprecated, use properties instead
Native Dataset Uri
Uri should not include any environment specific properties
         */
        @Deprecated
        public Builder setUri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * Deprecated, use tags field instead
The structured tags associated with the dataset
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
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
         * View related properties. Only relevant if subtypes field contains view.
         */
        public Builder setViewProperties(ViewProperties viewProperties) {
            this.viewProperties = viewProperties;
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
         * History of datajob runs that either produced or consumed this dataset
         */
        public Builder setRuns(DataProcessInstanceResult runs) {
            this.runs = runs;
            return this;
        }

        /**
         * Metadata about the datasets siblings
         */
        public Builder setSiblings(SiblingProperties siblings) {
            this.siblings = siblings;
            return this;
        }

        /**
         * Executes a search on only the siblings of an entity
         */
        public Builder setSiblingsSearch(ScrollResults siblingsSearch) {
            this.siblingsSearch = siblingsSearch;
            return this;
        }

        /**
         * Lineage information for the column-level. Includes a list of objects
detailing which columns are upstream and which are downstream of each other.
The upstream and downstream columns are from datasets.
         */
        public Builder setFineGrainedLineages(java.util.List<FineGrainedLineage> fineGrainedLineages) {
            this.fineGrainedLineages = fineGrainedLineages;
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
         * Structured properties about this Dataset
         */
        public Builder setStructuredProperties(StructuredProperties structuredProperties) {
            this.structuredProperties = structuredProperties;
            return this;
        }

        /**
         * Statistics about how this Dataset has been operated on
         */
        public Builder setOperationsStats(OperationsQueryResult operationsStats) {
            this.operationsStats = operationsStats;
            return this;
        }

        /**
         * The results of evaluating tests
         */
        public Builder setTestResults(TestResults testResults) {
            this.testResults = testResults;
            return this;
        }

        /**
         * Returns a set of capabilities regarding our timerseries indices
         */
        public Builder setTimeseriesCapabilities(TimeseriesCapabilitiesResult timeseriesCapabilities) {
            this.timeseriesCapabilities = timeseriesCapabilities;
            return this;
        }

        /**
         * Incidents associated with the Dataset
         */
        public Builder setIncidents(EntityIncidentsResult incidents) {
            this.incidents = incidents;
            return this;
        }

        /**
         * Indicates that this entity is versioned and provides information about the version.
         */
        public Builder setVersionProperties(VersionProperties versionProperties) {
            this.versionProperties = versionProperties;
            return this;
        }

        /**
         * If this entity represents a physical asset, this is its logical parent, from which metadata can propagate.
         */
        public Builder setLogicalParent(Entity logicalParent) {
            this.logicalParent = logicalParent;
            return this;
        }

        /**
         * An optional Data Contract defined for the Dataset.
         */
        public Builder setContract(DataContract contract) {
            this.contract = contract;
            return this;
        }


        public Dataset build() {
            return new Dataset(urn, type, lastIngested, platform, container, parentContainers, name, properties, editableProperties, ownership, deprecation, institutionalMemory, schemaMetadata, editableSchemaMetadata, status, embed, tags, glossaryTerms, dataPlatformInstance, domain, application, forms, access, usageStats, statsSummary, datasetProfiles, operations, assertions, relationships, lineage, browsePaths, browsePathV2, health, schema, externalUrl, origin, description, platformNativeType, uri, globalTags, subTypes, viewProperties, aspects, runs, siblings, siblingsSearch, fineGrainedLineages, privileges, exists, structuredProperties, operationsStats, testResults, timeseriesCapabilities, incidents, versionProperties, logicalParent, contract);
        }

    }
}
