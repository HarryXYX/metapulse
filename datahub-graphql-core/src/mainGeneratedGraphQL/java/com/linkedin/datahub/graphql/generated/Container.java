package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A container of other Metadata Entities
 */
public class Container implements java.io.Serializable, Entity {

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
    private ContainerProperties properties;
    private ContainerEditableProperties editableProperties;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private SubTypes subTypes;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private Deprecation deprecation;
    private DataPlatformInstance dataPlatformInstance;
    private SearchResults entities;
    private EntityRelationshipsResult relationships;
    private Status status;
    private Boolean exists;
    private Access access;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private EntityPrivileges privileges;
    private BrowsePathV2 browsePathV2;

    public Container() {
    }

    public Container(String urn, EntityType type, Long lastIngested, DataPlatform platform, Container container, ParentContainersResult parentContainers, ContainerProperties properties, ContainerEditableProperties editableProperties, Ownership ownership, InstitutionalMemory institutionalMemory, GlobalTags tags, GlossaryTerms glossaryTerms, SubTypes subTypes, DomainAssociation domain, ApplicationAssociation application, Deprecation deprecation, DataPlatformInstance dataPlatformInstance, SearchResults entities, EntityRelationshipsResult relationships, Status status, Boolean exists, Access access, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, EntityPrivileges privileges, BrowsePathV2 browsePathV2) {
        this.urn = urn;
        this.type = type;
        this.lastIngested = lastIngested;
        this.platform = platform;
        this.container = container;
        this.parentContainers = parentContainers;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.institutionalMemory = institutionalMemory;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.subTypes = subTypes;
        this.domain = domain;
        this.application = application;
        this.deprecation = deprecation;
        this.dataPlatformInstance = dataPlatformInstance;
        this.entities = entities;
        this.relationships = relationships;
        this.status = status;
        this.exists = exists;
        this.access = access;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.privileges = privileges;
        this.browsePathV2 = browsePathV2;
    }

    /**
     * The primary key of the container
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the container
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
     * Standardized platform.
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Standardized platform.
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Fetch an Entity Container by primary key (urn)
     */
    public Container getContainer() {
        return container;
    }
    /**
     * Fetch an Entity Container by primary key (urn)
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
     * Read-only properties that originate in the source data platform
     */
    public ContainerProperties getProperties() {
        return properties;
    }
    /**
     * Read-only properties that originate in the source data platform
     */
    public void setProperties(ContainerProperties properties) {
        this.properties = properties;
    }

    /**
     * Read-write properties that originate in DataHub
     */
    public ContainerEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Read-write properties that originate in DataHub
     */
    public void setEditableProperties(ContainerEditableProperties editableProperties) {
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
     * Sub types of the container, e.g. "Database" etc
     */
    public SubTypes getSubTypes() {
        return subTypes;
    }
    /**
     * Sub types of the container, e.g. "Database" etc
     */
    public void setSubTypes(SubTypes subTypes) {
        this.subTypes = subTypes;
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
     * The deprecation status of the container
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the container
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
     * Children entities inside of the Container
     */
    public SearchResults getEntities() {
        return entities;
    }
    /**
     * Children entities inside of the Container
     */
    public void setEntities(SearchResults entities) {
        this.entities = entities;
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
     * Status metadata of the container
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the container
     */
    public void setStatus(Status status) {
        this.status = status;
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
     * The Roles and the properties to access the container
     */
    public Access getAccess() {
        return access;
    }
    /**
     * The Roles and the properties to access the container
     */
    public void setAccess(Access access) {
        this.access = access;
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
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (institutionalMemory != null) {
            joiner.add("institutionalMemory: " + institutionalMemory);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        if (subTypes != null) {
            joiner.add("subTypes: " + subTypes);
        }
        if (domain != null) {
            joiner.add("domain: " + domain);
        }
        if (application != null) {
            joiner.add("application: " + application);
        }
        if (deprecation != null) {
            joiner.add("deprecation: " + deprecation);
        }
        if (dataPlatformInstance != null) {
            joiner.add("dataPlatformInstance: " + dataPlatformInstance);
        }
        if (entities != null) {
            joiner.add("entities: " + entities);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (exists != null) {
            joiner.add("exists: " + exists);
        }
        if (access != null) {
            joiner.add("access: " + access);
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
        if (browsePathV2 != null) {
            joiner.add("browsePathV2: " + browsePathV2);
        }
        return joiner.toString();
    }

    public static Container.Builder builder() {
        return new Container.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Long lastIngested;
        private DataPlatform platform;
        private Container container;
        private ParentContainersResult parentContainers;
        private ContainerProperties properties;
        private ContainerEditableProperties editableProperties;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private SubTypes subTypes;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private Deprecation deprecation;
        private DataPlatformInstance dataPlatformInstance;
        private SearchResults entities;
        private EntityRelationshipsResult relationships;
        private Status status;
        private Boolean exists;
        private Access access;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private EntityPrivileges privileges;
        private BrowsePathV2 browsePathV2;

        public Builder() {
        }

        /**
         * The primary key of the container
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
         * Standardized platform.
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Fetch an Entity Container by primary key (urn)
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
         * Read-only properties that originate in the source data platform
         */
        public Builder setProperties(ContainerProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Read-write properties that originate in DataHub
         */
        public Builder setEditableProperties(ContainerEditableProperties editableProperties) {
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
         * References to internal resources related to the dataset
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
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
         * Sub types of the container, e.g. "Database" etc
         */
        public Builder setSubTypes(SubTypes subTypes) {
            this.subTypes = subTypes;
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
         * The application associated with the entity
         */
        public Builder setApplication(ApplicationAssociation application) {
            this.application = application;
            return this;
        }

        /**
         * The deprecation status of the container
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
         * Children entities inside of the Container
         */
        public Builder setEntities(SearchResults entities) {
            this.entities = entities;
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
         * Status metadata of the container
         */
        public Builder setStatus(Status status) {
            this.status = status;
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
         * The Roles and the properties to access the container
         */
        public Builder setAccess(Access access) {
            this.access = access;
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

        /**
         * The browse path V2 corresponding to an entity. If no Browse Paths V2 have been generated before, this will be null.
         */
        public Builder setBrowsePathV2(BrowsePathV2 browsePathV2) {
            this.browsePathV2 = browsePathV2;
            return this;
        }


        public Container build() {
            return new Container(urn, type, lastIngested, platform, container, parentContainers, properties, editableProperties, ownership, institutionalMemory, tags, glossaryTerms, subTypes, domain, application, deprecation, dataPlatformInstance, entities, relationships, status, exists, access, aspects, structuredProperties, forms, privileges, browsePathV2);
        }

    }
}
