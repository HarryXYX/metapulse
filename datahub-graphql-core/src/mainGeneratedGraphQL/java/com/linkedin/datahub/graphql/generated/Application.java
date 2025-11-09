package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An Application, or a grouping of Entities for a single business purpose. Compared with Data Products, Applications represent a grouping of tables that exist to serve a specific
purpose. However, unlike Data Products, they don't represent groups that are tailored to be consumed for any particular purpose. Often, the assets in Applications power specific
outcomes, for example a Pricing Application.
 */
public class Application implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private ApplicationProperties properties;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;
    private EntityRelationshipsResult relationships;
    private GlossaryTerms glossaryTerms;
    private DomainAssociation domain;
    private GlobalTags tags;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private EntityPrivileges privileges;

    public Application() {
    }

    public Application(String urn, EntityType type, ApplicationProperties properties, Ownership ownership, InstitutionalMemory institutionalMemory, EntityRelationshipsResult relationships, GlossaryTerms glossaryTerms, DomainAssociation domain, GlobalTags tags, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, EntityPrivileges privileges) {
        this.urn = urn;
        this.type = type;
        this.properties = properties;
        this.ownership = ownership;
        this.institutionalMemory = institutionalMemory;
        this.relationships = relationships;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.tags = tags;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.privileges = privileges;
    }

    /**
     * The primary key of the Application
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Application
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
     * Properties about an Application
     */
    public ApplicationProperties getProperties() {
        return properties;
    }
    /**
     * Properties about an Application
     */
    public void setProperties(ApplicationProperties properties) {
        this.properties = properties;
    }

    /**
     * Ownership metadata of the Application
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the Application
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * References to internal resources related to the Application
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the Application
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
     * The structured glossary terms associated with the Application
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * The structured glossary terms associated with the Application
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * The Domain associated with the Application
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the Application
     */
    public void setDomain(DomainAssociation domain) {
        this.domain = domain;
    }

    /**
     * Tags used for searching Application
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * Tags used for searching Application
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
     * The forms associated with the Application
     */
    public Forms getForms() {
        return forms;
    }
    /**
     * The forms associated with the Application
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
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        if (domain != null) {
            joiner.add("domain: " + domain);
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
        return joiner.toString();
    }

    public static Application.Builder builder() {
        return new Application.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private ApplicationProperties properties;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;
        private EntityRelationshipsResult relationships;
        private GlossaryTerms glossaryTerms;
        private DomainAssociation domain;
        private GlobalTags tags;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private EntityPrivileges privileges;

        public Builder() {
        }

        /**
         * The primary key of the Application
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
         * Properties about an Application
         */
        public Builder setProperties(ApplicationProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Ownership metadata of the Application
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * References to internal resources related to the Application
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
         * The structured glossary terms associated with the Application
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }

        /**
         * The Domain associated with the Application
         */
        public Builder setDomain(DomainAssociation domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Tags used for searching Application
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
         * The forms associated with the Application
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


        public Application build() {
            return new Application(urn, type, properties, ownership, institutionalMemory, relationships, glossaryTerms, domain, tags, aspects, structuredProperties, forms, privileges);
        }

    }
}
