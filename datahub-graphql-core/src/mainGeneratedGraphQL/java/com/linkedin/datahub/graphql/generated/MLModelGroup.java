package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An ML Model Group Metadata Entity
Note that this entity is incubating
 */
public class MLModelGroup implements java.io.Serializable, Entity, EntityWithRelationships, BrowsableEntity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private Long lastIngested;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    @javax.annotation.Nonnull
    private FabricType origin;
    private String description;
    private MLModelGroupProperties properties;
    private InstitutionalMemory institutionalMemory;
    private Ownership ownership;
    private Status status;
    private Deprecation deprecation;
    private DataPlatformInstance dataPlatformInstance;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private java.util.List<BrowsePath> browsePaths;
    private BrowsePathV2 browsePathV2;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private MLModelGroupEditableProperties editableProperties;
    private Boolean exists;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private EntityPrivileges privileges;

    public MLModelGroup() {
    }

    public MLModelGroup(String urn, EntityType type, Long lastIngested, String name, DataPlatform platform, FabricType origin, String description, MLModelGroupProperties properties, InstitutionalMemory institutionalMemory, Ownership ownership, Status status, Deprecation deprecation, DataPlatformInstance dataPlatformInstance, EntityRelationshipsResult relationships, EntityLineageResult lineage, java.util.List<BrowsePath> browsePaths, BrowsePathV2 browsePathV2, GlobalTags tags, GlossaryTerms glossaryTerms, DomainAssociation domain, ApplicationAssociation application, MLModelGroupEditableProperties editableProperties, Boolean exists, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, EntityPrivileges privileges) {
        this.urn = urn;
        this.type = type;
        this.lastIngested = lastIngested;
        this.name = name;
        this.platform = platform;
        this.origin = origin;
        this.description = description;
        this.properties = properties;
        this.institutionalMemory = institutionalMemory;
        this.ownership = ownership;
        this.status = status;
        this.deprecation = deprecation;
        this.dataPlatformInstance = dataPlatformInstance;
        this.relationships = relationships;
        this.lineage = lineage;
        this.browsePaths = browsePaths;
        this.browsePathV2 = browsePathV2;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.application = application;
        this.editableProperties = editableProperties;
        this.exists = exists;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.privileges = privileges;
    }

    /**
     * The primary key of the ML Model Group
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the ML Model Group
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
     * The display name for the Entity
     */
    public String getName() {
        return name;
    }
    /**
     * The display name for the Entity
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Standardized platform urn where the MLModelGroup is defined
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform urn where the MLModelGroup is defined
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Fabric type where MLModelGroup belongs to or where it was generated
     */
    public FabricType getOrigin() {
        return origin;
    }
    /**
     * Fabric type where MLModelGroup belongs to or where it was generated
     */
    public void setOrigin(FabricType origin) {
        this.origin = origin;
    }

    /**
     * Human readable description for MLModelGroup
     */
    public String getDescription() {
        return description;
    }
    /**
     * Human readable description for MLModelGroup
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Additional read only properties about the ML Model Group
     */
    public MLModelGroupProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the ML Model Group
     */
    public void setProperties(MLModelGroupProperties properties) {
        this.properties = properties;
    }

    /**
     * References to internal resources related to the ml model group
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the ml model group
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Ownership metadata of the MLModelGroup
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the MLModelGroup
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Status metadata of the MLModelGroup
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the MLModelGroup
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Deprecation
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * Deprecation
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
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
     * The browse paths corresponding to the ML Model Group. If no Browse Paths have been generated before, this will be null.
     */
    public java.util.List<BrowsePath> getBrowsePaths() {
        return browsePaths;
    }
    /**
     * The browse paths corresponding to the ML Model Group. If no Browse Paths have been generated before, this will be null.
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
     * Tags applied to entity
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * Tags applied to entity
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * The structured glossary terms associated with the entity
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the entity
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * The Domain associated with the entity
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the entity
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
     * An additional set of of read write properties
     */
    public MLModelGroupEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(MLModelGroupEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
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
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (origin != null) {
            joiner.add("origin: " + origin);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (institutionalMemory != null) {
            joiner.add("institutionalMemory: " + institutionalMemory);
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
        if (tags != null) {
            joiner.add("tags: " + tags);
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
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
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
        if (forms != null) {
            joiner.add("forms: " + forms);
        }
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        return joiner.toString();
    }

    public static MLModelGroup.Builder builder() {
        return new MLModelGroup.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Long lastIngested;
        private String name;
        private DataPlatform platform;
        private FabricType origin;
        private String description;
        private MLModelGroupProperties properties;
        private InstitutionalMemory institutionalMemory;
        private Ownership ownership;
        private Status status;
        private Deprecation deprecation;
        private DataPlatformInstance dataPlatformInstance;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private java.util.List<BrowsePath> browsePaths;
        private BrowsePathV2 browsePathV2;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private MLModelGroupEditableProperties editableProperties;
        private Boolean exists;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private EntityPrivileges privileges;

        public Builder() {
        }

        /**
         * The primary key of the ML Model Group
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
         * The display name for the Entity
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Standardized platform urn where the MLModelGroup is defined
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Fabric type where MLModelGroup belongs to or where it was generated
         */
        public Builder setOrigin(FabricType origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Human readable description for MLModelGroup
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Additional read only properties about the ML Model Group
         */
        public Builder setProperties(MLModelGroupProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * References to internal resources related to the ml model group
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Ownership metadata of the MLModelGroup
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Status metadata of the MLModelGroup
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * Deprecation
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
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
         * The browse paths corresponding to the ML Model Group. If no Browse Paths have been generated before, this will be null.
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
         * Tags applied to entity
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The structured glossary terms associated with the entity
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * The Domain associated with the entity
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
         * An additional set of of read write properties
         */
        public Builder setEditableProperties(MLModelGroupEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
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


        public MLModelGroup build() {
            return new MLModelGroup(urn, type, lastIngested, name, platform, origin, description, properties, institutionalMemory, ownership, status, deprecation, dataPlatformInstance, relationships, lineage, browsePaths, browsePathV2, tags, glossaryTerms, domain, application, editableProperties, exists, aspects, structuredProperties, forms, privileges);
        }

    }
}
