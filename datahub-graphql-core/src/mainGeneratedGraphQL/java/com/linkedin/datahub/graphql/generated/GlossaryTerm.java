package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Glossary Term, or a node in a Business Glossary representing a standardized domain
data type
 */
public class GlossaryTerm implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    private Ownership ownership;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private InstitutionalMemory institutionalMemory;
    @javax.annotation.Nonnull
    private EntityType type;
    @Deprecated
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String hierarchicalName;
    private GlossaryTermProperties properties;
    private GlossaryTermInfo glossaryTermInfo;
    private Deprecation deprecation;
    private EntityRelationshipsResult relationships;
    private SchemaMetadata schemaMetadata;
    private ParentNodesResult parentNodes;
    private EntityPrivileges privileges;
    private Boolean exists;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private AssetSettings settings;

    public GlossaryTerm() {
    }

    public GlossaryTerm(String urn, Ownership ownership, DomainAssociation domain, ApplicationAssociation application, InstitutionalMemory institutionalMemory, EntityType type, String name, String hierarchicalName, GlossaryTermProperties properties, GlossaryTermInfo glossaryTermInfo, Deprecation deprecation, EntityRelationshipsResult relationships, SchemaMetadata schemaMetadata, ParentNodesResult parentNodes, EntityPrivileges privileges, Boolean exists, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, AssetSettings settings) {
        this.urn = urn;
        this.ownership = ownership;
        this.domain = domain;
        this.application = application;
        this.institutionalMemory = institutionalMemory;
        this.type = type;
        this.name = name;
        this.hierarchicalName = hierarchicalName;
        this.properties = properties;
        this.glossaryTermInfo = glossaryTermInfo;
        this.deprecation = deprecation;
        this.relationships = relationships;
        this.schemaMetadata = schemaMetadata;
        this.parentNodes = parentNodes;
        this.privileges = privileges;
        this.exists = exists;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.settings = settings;
    }

    /**
     * The primary key of the glossary term
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the glossary term
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * Ownership metadata of the glossary term
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the glossary term
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * The Domain associated with the glossary term
     */
    public DomainAssociation getDomain() {
        return domain;
    }
    /**
     * The Domain associated with the glossary term
     */
    public void setDomain(DomainAssociation domain) {
        this.domain = domain;
    }

    /**
     * The application associated with the glossary term
     */
    public ApplicationAssociation getApplication() {
        return application;
    }
    /**
     * The application associated with the glossary term
     */
    public void setApplication(ApplicationAssociation application) {
        this.application = application;
    }

    /**
     * References to internal resources related to the Glossary Term
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the Glossary Term
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
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
     * A unique identifier for the Glossary Term. Deprecated - Use properties.name field instead.
     */
    @Deprecated
    public String getName() {
        return name;
    }
    /**
     * A unique identifier for the Glossary Term. Deprecated - Use properties.name field instead.
     */
    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    /**
     * hierarchicalName of glossary term
     */
    public String getHierarchicalName() {
        return hierarchicalName;
    }
    /**
     * hierarchicalName of glossary term
     */
    public void setHierarchicalName(String hierarchicalName) {
        this.hierarchicalName = hierarchicalName;
    }

    /**
     * Additional properties associated with the Glossary Term
     */
    public GlossaryTermProperties getProperties() {
        return properties;
    }
    /**
     * Additional properties associated with the Glossary Term
     */
    public void setProperties(GlossaryTermProperties properties) {
        this.properties = properties;
    }

    /**
     * Deprecated, use properties field instead
Details of the Glossary Term
     */
    public GlossaryTermInfo getGlossaryTermInfo() {
        return glossaryTermInfo;
    }
    /**
     * Deprecated, use properties field instead
Details of the Glossary Term
     */
    public void setGlossaryTermInfo(GlossaryTermInfo glossaryTermInfo) {
        this.glossaryTermInfo = glossaryTermInfo;
    }

    /**
     * The deprecation status of the Glossary Term
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the Glossary Term
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
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
     * Schema metadata of the dataset
     */
    public SchemaMetadata getSchemaMetadata() {
        return schemaMetadata;
    }
    /**
     * Schema metadata of the dataset
     */
    public void setSchemaMetadata(SchemaMetadata schemaMetadata) {
        this.schemaMetadata = schemaMetadata;
    }

    /**
     * Recursively get the lineage of glossary nodes for this entity
     */
    public ParentNodesResult getParentNodes() {
        return parentNodes;
    }
    /**
     * Recursively get the lineage of glossary nodes for this entity
     */
    public void setParentNodes(ParentNodesResult parentNodes) {
        this.parentNodes = parentNodes;
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
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (domain != null) {
            joiner.add("domain: " + domain);
        }
        if (application != null) {
            joiner.add("application: " + application);
        }
        if (institutionalMemory != null) {
            joiner.add("institutionalMemory: " + institutionalMemory);
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (hierarchicalName != null) {
            joiner.add("hierarchicalName: \"" + hierarchicalName + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (glossaryTermInfo != null) {
            joiner.add("glossaryTermInfo: " + glossaryTermInfo);
        }
        if (deprecation != null) {
            joiner.add("deprecation: " + deprecation);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (schemaMetadata != null) {
            joiner.add("schemaMetadata: " + schemaMetadata);
        }
        if (parentNodes != null) {
            joiner.add("parentNodes: " + parentNodes);
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
        if (forms != null) {
            joiner.add("forms: " + forms);
        }
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        return joiner.toString();
    }

    public static GlossaryTerm.Builder builder() {
        return new GlossaryTerm.Builder();
    }

    public static class Builder {

        private String urn;
        private Ownership ownership;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private InstitutionalMemory institutionalMemory;
        private EntityType type;
        private String name;
        private String hierarchicalName;
        private GlossaryTermProperties properties;
        private GlossaryTermInfo glossaryTermInfo;
        private Deprecation deprecation;
        private EntityRelationshipsResult relationships;
        private SchemaMetadata schemaMetadata;
        private ParentNodesResult parentNodes;
        private EntityPrivileges privileges;
        private Boolean exists;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private AssetSettings settings;

        public Builder() {
        }

        /**
         * The primary key of the glossary term
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * Ownership metadata of the glossary term
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * The Domain associated with the glossary term
         */
        public Builder setDomain(DomainAssociation domain) {
            this.domain = domain;
            return this;
        }

        /**
         * The application associated with the glossary term
         */
        public Builder setApplication(ApplicationAssociation application) {
            this.application = application;
            return this;
        }

        /**
         * References to internal resources related to the Glossary Term
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
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
         * A unique identifier for the Glossary Term. Deprecated - Use properties.name field instead.
         */
        @Deprecated
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * hierarchicalName of glossary term
         */
        public Builder setHierarchicalName(String hierarchicalName) {
            this.hierarchicalName = hierarchicalName;
            return this;
        }

        /**
         * Additional properties associated with the Glossary Term
         */
        public Builder setProperties(GlossaryTermProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Details of the Glossary Term
         */
        public Builder setGlossaryTermInfo(GlossaryTermInfo glossaryTermInfo) {
            this.glossaryTermInfo = glossaryTermInfo;
            return this;
        }

        /**
         * The deprecation status of the Glossary Term
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
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
         * Schema metadata of the dataset
         */
        public Builder setSchemaMetadata(SchemaMetadata schemaMetadata) {
            this.schemaMetadata = schemaMetadata;
            return this;
        }

        /**
         * Recursively get the lineage of glossary nodes for this entity
         */
        public Builder setParentNodes(ParentNodesResult parentNodes) {
            this.parentNodes = parentNodes;
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
         * The forms associated with the Dataset
         */
        public Builder setForms(Forms forms) {
            this.forms = forms;
            return this;
        }

        /**
         * Settings associated with this asset
         */
        public Builder setSettings(AssetSettings settings) {
            this.settings = settings;
            return this;
        }


        public GlossaryTerm build() {
            return new GlossaryTerm(urn, ownership, domain, application, institutionalMemory, type, name, hierarchicalName, properties, glossaryTermInfo, deprecation, relationships, schemaMetadata, parentNodes, privileges, exists, aspects, structuredProperties, forms, settings);
        }

    }
}
