package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Data Product, or a logical grouping of Metadata Entities
 */
public class DataProduct implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private DataProductProperties properties;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;
    private EntityRelationshipsResult relationships;
    private SearchResults entities;
    private GlossaryTerms glossaryTerms;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private GlobalTags tags;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private EntityPrivileges privileges;
    private AssetSettings settings;

    public DataProduct() {
    }

    public DataProduct(String urn, EntityType type, DataProductProperties properties, Ownership ownership, InstitutionalMemory institutionalMemory, EntityRelationshipsResult relationships, SearchResults entities, GlossaryTerms glossaryTerms, DomainAssociation domain, ApplicationAssociation application, GlobalTags tags, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, EntityPrivileges privileges, AssetSettings settings) {
        this.urn = urn;
        this.type = type;
        this.properties = properties;
        this.ownership = ownership;
        this.institutionalMemory = institutionalMemory;
        this.relationships = relationships;
        this.entities = entities;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.application = application;
        this.tags = tags;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.privileges = privileges;
        this.settings = settings;
    }

    /**
     * The primary key of the Data Product
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Data Product
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
     * Properties about a Data Product
     */
    public DataProductProperties getProperties() {
        return properties;
    }
    /**
     * Properties about a Data Product
     */
    public void setProperties(DataProductProperties properties) {
        this.properties = properties;
    }

    /**
     * Ownership metadata of the Data Product
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the Data Product
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * References to internal resources related to the Data Product
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the Data Product
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
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
     * Children entities inside of the DataProduct
     */
    public SearchResults getEntities() {
        return entities;
    }
    /**
     * Children entities inside of the DataProduct
     */
    public void setEntities(SearchResults entities) {
        this.entities = entities;
    }

    /**
     * The structured glossary terms associated with the Data Product
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the Data Product
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * The Domain associated with the Data Product
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the Data Product
     */
    public void setDomain(DomainAssociation domain) {
        this.domain = domain;
    }

    /**
     * The application associated with the data product
     */
    public ApplicationAssociation getApplication() {
        return application;
    }
    /**
     * The application associated with the data product
     */
    public void setApplication(ApplicationAssociation application) {
        this.application = application;
    }

    /**
     * Tags used for searching Data Product
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * Tags used for searching Data Product
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
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
     * Settings associated with this asset
     */
    public AssetSettings getSettings() {
        return settings;
    }
    /**
     * Settings associated with this asset
     */
    public void setSettings(AssetSettings settings) {
        this.settings = settings;
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
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (institutionalMemory != null) {
            joiner.add("institutionalMemory: " + institutionalMemory);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (entities != null) {
            joiner.add("entities: " + entities);
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
        if (tags != null) {
            joiner.add("tags: " + tags);
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
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        return joiner.toString();
    }

    public static DataProduct.Builder builder() {
        return new DataProduct.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataProductProperties properties;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;
        private EntityRelationshipsResult relationships;
        private SearchResults entities;
        private GlossaryTerms glossaryTerms;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private GlobalTags tags;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private EntityPrivileges privileges;
        private AssetSettings settings;

        public Builder() {
        }

        /**
         * The primary key of the Data Product
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
         * Properties about a Data Product
         */
        public Builder setProperties(DataProductProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Ownership metadata of the Data Product
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * References to internal resources related to the Data Product
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
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
         * Children entities inside of the DataProduct
         */
        public Builder setEntities(SearchResults entities) {
            this.entities = entities;
            return this;
        }

        /**
         * The structured glossary terms associated with the Data Product
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * The Domain associated with the Data Product
         */
        public Builder setDomain(DomainAssociation domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The application associated with the data product
         */
        public Builder setApplication(ApplicationAssociation application) {
            this.application = application;
            return this;
        }

        /**
         * Tags used for searching Data Product
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
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
         * Settings associated with this asset
         */
        public Builder setSettings(AssetSettings settings) {
            this.settings = settings;
            return this;
        }


        public DataProduct build() {
            return new DataProduct(urn, type, properties, ownership, institutionalMemory, relationships, entities, glossaryTerms, domain, application, tags, aspects, structuredProperties, forms, privileges, settings);
        }

    }
}
