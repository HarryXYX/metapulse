package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A domain, or a logical grouping of Metadata Entities
 */
public class Domain implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String id;
    private DomainProperties properties;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;
    private SearchResults entities;
    private ParentDomainsResult parentDomains;
    private EntityRelationshipsResult relationships;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private DisplayProperties displayProperties;
    private EntityPrivileges privileges;
    private AssetSettings settings;

    public Domain() {
    }

    public Domain(String urn, EntityType type, String id, DomainProperties properties, Ownership ownership, InstitutionalMemory institutionalMemory, SearchResults entities, ParentDomainsResult parentDomains, EntityRelationshipsResult relationships, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, DisplayProperties displayProperties, EntityPrivileges privileges, AssetSettings settings) {
        this.urn = urn;
        this.type = type;
        this.id = id;
        this.properties = properties;
        this.ownership = ownership;
        this.institutionalMemory = institutionalMemory;
        this.entities = entities;
        this.parentDomains = parentDomains;
        this.relationships = relationships;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.displayProperties = displayProperties;
        this.privileges = privileges;
        this.settings = settings;
    }

    /**
     * The primary key of the domain
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the domain
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
     * Id of the domain
     */
    public String getId() {
        return id;
    }
    /**
     * Id of the domain
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Properties about a domain
     */
    public DomainProperties getProperties() {
        return properties;
    }
    /**
     * Properties about a domain
     */
    public void setProperties(DomainProperties properties) {
        this.properties = properties;
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
     * Children entities inside of the Domain
     */
    public SearchResults getEntities() {
        return entities;
    }
    /**
     * Children entities inside of the Domain
     */
    public void setEntities(SearchResults entities) {
        this.entities = entities;
    }

    /**
     * Recursively get the lineage of parent domains for this entity
     */
    public ParentDomainsResult getParentDomains() {
        return parentDomains;
    }
    /**
     * Recursively get the lineage of parent domains for this entity
     */
    public void setParentDomains(ParentDomainsResult parentDomains) {
        this.parentDomains = parentDomains;
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
     * Display properties for the domain
     */
    public DisplayProperties getDisplayProperties() {
        return displayProperties;
    }
    /**
     * Display properties for the domain
     */
    public void setDisplayProperties(DisplayProperties displayProperties) {
        this.displayProperties = displayProperties;
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
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
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
        if (entities != null) {
            joiner.add("entities: " + entities);
        }
        if (parentDomains != null) {
            joiner.add("parentDomains: " + parentDomains);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
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
        if (displayProperties != null) {
            joiner.add("displayProperties: " + displayProperties);
        }
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        return joiner.toString();
    }

    public static Domain.Builder builder() {
        return new Domain.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String id;
        private DomainProperties properties;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;
        private SearchResults entities;
        private ParentDomainsResult parentDomains;
        private EntityRelationshipsResult relationships;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private DisplayProperties displayProperties;
        private EntityPrivileges privileges;
        private AssetSettings settings;

        public Builder() {
        }

        /**
         * The primary key of the domain
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
         * Id of the domain
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * Properties about a domain
         */
        public Builder setProperties(DomainProperties properties) {
            this.properties = properties;
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
         * Children entities inside of the Domain
         */
        public Builder setEntities(SearchResults entities) {
            this.entities = entities;
            return this;
        }

        /**
         * Recursively get the lineage of parent domains for this entity
         */
        public Builder setParentDomains(ParentDomainsResult parentDomains) {
            this.parentDomains = parentDomains;
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
         * Display properties for the domain
         */
        public Builder setDisplayProperties(DisplayProperties displayProperties) {
            this.displayProperties = displayProperties;
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


        public Domain build() {
            return new Domain(urn, type, id, properties, ownership, institutionalMemory, entities, parentDomains, relationships, aspects, structuredProperties, forms, displayProperties, privileges, settings);
        }

    }
}
