package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Dataset entity, which encompasses Relational Tables, Document store collections, streaming topics, and other sets of data having an independent lifecycle
 */
public class VersionedDataset implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
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
    private EditableSchemaMetadata editableSchemaMetadata;
    private Status status;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private DomainAssociation domain;
    private ApplicationAssociation application;
    private java.util.List<Health> health;
    private Schema schema;
    private SubTypes subTypes;
    private ViewProperties viewProperties;
    @Deprecated
    @javax.annotation.Nonnull
    private FabricType origin;
    @Deprecated
    private EntityRelationshipsResult relationships;

    public VersionedDataset() {
    }

    public VersionedDataset(String urn, EntityType type, DataPlatform platform, Container container, ParentContainersResult parentContainers, String name, DatasetProperties properties, DatasetEditableProperties editableProperties, Ownership ownership, Deprecation deprecation, InstitutionalMemory institutionalMemory, EditableSchemaMetadata editableSchemaMetadata, Status status, GlobalTags tags, GlossaryTerms glossaryTerms, DomainAssociation domain, ApplicationAssociation application, java.util.List<Health> health, Schema schema, SubTypes subTypes, ViewProperties viewProperties, FabricType origin, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.platform = platform;
        this.container = container;
        this.parentContainers = parentContainers;
        this.name = name;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.deprecation = deprecation;
        this.institutionalMemory = institutionalMemory;
        this.editableSchemaMetadata = editableSchemaMetadata;
        this.status = status;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.domain = domain;
        this.application = application;
        this.health = health;
        this.schema = schema;
        this.subTypes = subTypes;
        this.viewProperties = viewProperties;
        this.origin = origin;
        this.relationships = relationships;
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
     * Experimental! The resolved health status of the asset
     */
    public java.util.List<Health> getHealth() {
        return health;
    }
    /**
     * Experimental! The resolved health status of the asset
     */
    public void setHealth(java.util.List<Health> health) {
        this.health = health;
    }

    /**
     * Schema metadata of the dataset
     */
    public Schema getSchema() {
        return schema;
    }
    /**
     * Schema metadata of the dataset
     */
    public void setSchema(Schema schema) {
        this.schema = schema;
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
     * No-op, has to be included due to model
     */
    @Deprecated
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * No-op, has to be included due to model
     */
    @Deprecated
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
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
        if (editableSchemaMetadata != null) {
            joiner.add("editableSchemaMetadata: " + editableSchemaMetadata);
        }
        if (status != null) {
            joiner.add("status: " + status);
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
        if (health != null) {
            joiner.add("health: " + health);
        }
        if (schema != null) {
            joiner.add("schema: " + schema);
        }
        if (subTypes != null) {
            joiner.add("subTypes: " + subTypes);
        }
        if (viewProperties != null) {
            joiner.add("viewProperties: " + viewProperties);
        }
        if (origin != null) {
            joiner.add("origin: " + origin);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static VersionedDataset.Builder builder() {
        return new VersionedDataset.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataPlatform platform;
        private Container container;
        private ParentContainersResult parentContainers;
        private String name;
        private DatasetProperties properties;
        private DatasetEditableProperties editableProperties;
        private Ownership ownership;
        private Deprecation deprecation;
        private InstitutionalMemory institutionalMemory;
        private EditableSchemaMetadata editableSchemaMetadata;
        private Status status;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private DomainAssociation domain;
        private ApplicationAssociation application;
        private java.util.List<Health> health;
        private Schema schema;
        private SubTypes subTypes;
        private ViewProperties viewProperties;
        private FabricType origin;
        private EntityRelationshipsResult relationships;

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
         * Experimental! The resolved health status of the asset
         */
        public Builder setHealth(java.util.List<Health> health) {
            this.health = health;
            return this;
        }

        /**
         * Schema metadata of the dataset
         */
        public Builder setSchema(Schema schema) {
            this.schema = schema;
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
         * No-op, has to be included due to model
         */
        @Deprecated
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public VersionedDataset build() {
            return new VersionedDataset(urn, type, platform, container, parentContainers, name, properties, editableProperties, ownership, deprecation, institutionalMemory, editableSchemaMetadata, status, tags, glossaryTerms, domain, application, health, schema, subTypes, viewProperties, origin, relationships);
        }

    }
}
