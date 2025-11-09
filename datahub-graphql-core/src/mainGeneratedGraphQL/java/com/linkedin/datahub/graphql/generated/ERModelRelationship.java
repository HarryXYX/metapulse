package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An ERModelRelationship is a high-level abstraction that dictates what datasets fields are erModelRelationshiped.
 */
public class ERModelRelationship implements java.io.Serializable, Entity, EntityWithRelationships {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String id;
    private ERModelRelationshipProperties properties;
    private ERModelRelationshipEditableProperties editableProperties;
    private InstitutionalMemory institutionalMemory;
    private Ownership ownership;
    private Status status;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private EntityRelationshipsResult relationships;
    private EntityPrivileges privileges;
    private EntityLineageResult lineage;

    public ERModelRelationship() {
    }

    public ERModelRelationship(String urn, EntityType type, String id, ERModelRelationshipProperties properties, ERModelRelationshipEditableProperties editableProperties, InstitutionalMemory institutionalMemory, Ownership ownership, Status status, GlobalTags tags, GlossaryTerms glossaryTerms, EntityRelationshipsResult relationships, EntityPrivileges privileges, EntityLineageResult lineage) {
        this.urn = urn;
        this.type = type;
        this.id = id;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.institutionalMemory = institutionalMemory;
        this.ownership = ownership;
        this.status = status;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.relationships = relationships;
        this.privileges = privileges;
        this.lineage = lineage;
    }

    /**
     * The primary key of the role
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the role
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
     * Unique id for the erModelRelationship
     */
    public String getId() {
        return id;
    }
    /**
     * Unique id for the erModelRelationship
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * An additional set of read only properties
     */
    public ERModelRelationshipProperties getProperties() {
        return properties;
    }
    /**
     * An additional set of read only properties
     */
    public void setProperties(ERModelRelationshipProperties properties) {
        this.properties = properties;
    }

    /**
     * An additional set of of read write properties
     */
    public ERModelRelationshipEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * An additional set of of read write properties
     */
    public void setEditableProperties(ERModelRelationshipEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
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
     * List of relationships between the source Entity and some destination entities with a given types
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * List of relationships between the source Entity and some destination entities with a given types
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
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
     * No-op required for the model
     */
    public EntityLineageResult getLineage() {
        return lineage;
    }
    /**
     * No-op required for the model
     */
    public void setLineage(EntityLineageResult lineage) {
        this.lineage = lineage;
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
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
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
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        if (lineage != null) {
            joiner.add("lineage: " + lineage);
        }
        return joiner.toString();
    }

    public static ERModelRelationship.Builder builder() {
        return new ERModelRelationship.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String id;
        private ERModelRelationshipProperties properties;
        private ERModelRelationshipEditableProperties editableProperties;
        private InstitutionalMemory institutionalMemory;
        private Ownership ownership;
        private Status status;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private EntityRelationshipsResult relationships;
        private EntityPrivileges privileges;
        private EntityLineageResult lineage;

        public Builder() {
        }

        /**
         * The primary key of the role
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
         * Unique id for the erModelRelationship
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * An additional set of read only properties
         */
        public Builder setProperties(ERModelRelationshipProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * An additional set of of read write properties
         */
        public Builder setEditableProperties(ERModelRelationshipEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
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
         * Ownership metadata of the dataset
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
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
         * List of relationships between the source Entity and some destination entities with a given types
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
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
         * No-op required for the model
         */
        public Builder setLineage(EntityLineageResult lineage) {
            this.lineage = lineage;
            return this;
        }


        public ERModelRelationship build() {
            return new ERModelRelationship(urn, type, id, properties, editableProperties, institutionalMemory, ownership, status, tags, glossaryTerms, relationships, privileges, lineage);
        }

    }
}
