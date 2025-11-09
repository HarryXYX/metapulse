package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An ML Feature Metadata Entity Note that this entity is incubating
 */
public class MLFeature implements java.io.Serializable, Entity, EntityWithRelationships {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private Long lastIngested;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String featureNamespace;
    private String description;
    private MLFeatureDataType dataType;
    private Ownership ownership;
    @Deprecated
    private MLFeatureProperties featureProperties;
    private MLFeatureProperties properties;
    private InstitutionalMemory institutionalMemory;
    private Status status;
    private Deprecation deprecation;
    private BrowsePathV2 browsePathV2;
    private DataPlatformInstance dataPlatformInstance;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private MLFeatureEditableProperties editableProperties;
    private Boolean exists;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private EntityPrivileges privileges;

    public MLFeature() {
    }

    public MLFeature(String urn, EntityType type, Long lastIngested, String name, String featureNamespace, String description, MLFeatureDataType dataType, Ownership ownership, MLFeatureProperties featureProperties, MLFeatureProperties properties, InstitutionalMemory institutionalMemory, Status status, Deprecation deprecation, BrowsePathV2 browsePathV2, DataPlatformInstance dataPlatformInstance, EntityRelationshipsResult relationships, EntityLineageResult lineage, GlobalTags tags, GlossaryTerms glossaryTerms, DomainAssociation domain, ApplicationAssociation application, MLFeatureEditableProperties editableProperties, Boolean exists, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, EntityPrivileges privileges) {
        this.urn = urn;
        this.type = type;
        this.lastIngested = lastIngested;
        this.name = name;
        this.featureNamespace = featureNamespace;
        this.description = description;
        this.dataType = dataType;
        this.ownership = ownership;
        this.featureProperties = featureProperties;
        this.properties = properties;
        this.institutionalMemory = institutionalMemory;
        this.status = status;
        this.deprecation = deprecation;
        this.browsePathV2 = browsePathV2;
        this.dataPlatformInstance = dataPlatformInstance;
        this.relationships = relationships;
        this.lineage = lineage;
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
     * The primary key of the ML Feature
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the ML Feature
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
     * The display name for the ML Feature
     */
    public String getName() {
        return name;
    }
    /**
     * The display name for the ML Feature
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * MLFeature featureNamespace
     */
    public String getFeatureNamespace() {
        return featureNamespace;
    }
    /**
     * MLFeature featureNamespace
     */
    public void setFeatureNamespace(String featureNamespace) {
        this.featureNamespace = featureNamespace;
    }

    /**
     * The description about the ML Feature
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description about the ML Feature
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * MLFeature data type
     */
    public MLFeatureDataType getDataType() {
        return dataType;
    }
    /**
     * MLFeature data type
     */
    public void setDataType(MLFeatureDataType dataType) {
        this.dataType = dataType;
    }

    /**
     * Ownership metadata of the MLFeature
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the MLFeature
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * ModelProperties metadata of the MLFeature
     */
    @Deprecated
    public MLFeatureProperties getFeatureProperties() {
        return featureProperties;
    }
    /**
     * ModelProperties metadata of the MLFeature
     */
    @Deprecated
    public void setFeatureProperties(MLFeatureProperties featureProperties) {
        this.featureProperties = featureProperties;
    }

    /**
     * ModelProperties metadata of the MLFeature
     */
    public MLFeatureProperties getProperties() {
        return properties;
    }
    /**
     * ModelProperties metadata of the MLFeature
     */
    public void setProperties(MLFeatureProperties properties) {
        this.properties = properties;
    }

    /**
     * References to internal resources related to the MLFeature
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the MLFeature
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Status metadata of the MLFeature
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the MLFeature
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
    public MLFeatureEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(MLFeatureEditableProperties editableProperties) {
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
        if (featureNamespace != null) {
            joiner.add("featureNamespace: \"" + featureNamespace + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (dataType != null) {
            joiner.add("dataType: " + dataType);
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (featureProperties != null) {
            joiner.add("featureProperties: " + featureProperties);
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (institutionalMemory != null) {
            joiner.add("institutionalMemory: " + institutionalMemory);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (deprecation != null) {
            joiner.add("deprecation: " + deprecation);
        }
        if (browsePathV2 != null) {
            joiner.add("browsePathV2: " + browsePathV2);
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

    public static MLFeature.Builder builder() {
        return new MLFeature.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Long lastIngested;
        private String name;
        private String featureNamespace;
        private String description;
        private MLFeatureDataType dataType;
        private Ownership ownership;
        private MLFeatureProperties featureProperties;
        private MLFeatureProperties properties;
        private InstitutionalMemory institutionalMemory;
        private Status status;
        private Deprecation deprecation;
        private BrowsePathV2 browsePathV2;
        private DataPlatformInstance dataPlatformInstance;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private MLFeatureEditableProperties editableProperties;
        private Boolean exists;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private EntityPrivileges privileges;

        public Builder() {
        }

        /**
         * The primary key of the ML Feature
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
         * The display name for the ML Feature
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * MLFeature featureNamespace
         */
        public Builder setFeatureNamespace(String featureNamespace) {
            this.featureNamespace = featureNamespace;
            return this;
        }

        /**
         * The description about the ML Feature
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * MLFeature data type
         */
        public Builder setDataType(MLFeatureDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Ownership metadata of the MLFeature
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * ModelProperties metadata of the MLFeature
         */
        @Deprecated
        public Builder setFeatureProperties(MLFeatureProperties featureProperties) {
            this.featureProperties = featureProperties;
            return this;
        }

        /**
         * ModelProperties metadata of the MLFeature
         */
        public Builder setProperties(MLFeatureProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * References to internal resources related to the MLFeature
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Status metadata of the MLFeature
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
         * The browse path V2 corresponding to an entity. If no Browse Paths V2 have been generated before, this will be null.
         */
        public Builder setBrowsePathV2(BrowsePathV2 browsePathV2) {
            this.browsePathV2 = browsePathV2;
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
        public Builder setEditableProperties(MLFeatureEditableProperties editableProperties) {
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


        public MLFeature build() {
            return new MLFeature(urn, type, lastIngested, name, featureNamespace, description, dataType, ownership, featureProperties, properties, institutionalMemory, status, deprecation, browsePathV2, dataPlatformInstance, relationships, lineage, tags, glossaryTerms, domain, application, editableProperties, exists, aspects, structuredProperties, forms, privileges);
        }

    }
}
