package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Tag Entity, which can be associated with other Metadata Entities and subresources
 */
public class Tag implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @Deprecated
    @javax.annotation.Nonnull
    private String name;
    private TagProperties properties;
    @Deprecated
    private EditableTagProperties editableProperties;
    private Ownership ownership;
    private EntityRelationshipsResult relationships;
    @Deprecated
    private String description;
    private java.util.List<RawAspect> aspects;

    public Tag() {
    }

    public Tag(String urn, EntityType type, String name, TagProperties properties, EditableTagProperties editableProperties, Ownership ownership, EntityRelationshipsResult relationships, String description, java.util.List<RawAspect> aspects) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.ownership = ownership;
        this.relationships = relationships;
        this.description = description;
        this.aspects = aspects;
    }

    /**
     * The primary key of the TAG
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the TAG
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
     * A unique identifier for the Tag. Deprecated - Use properties.name field instead.
     */
    @Deprecated
    public String getName() {
        return name;
    }
    /**
     * A unique identifier for the Tag. Deprecated - Use properties.name field instead.
     */
    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Additional properties about the Tag
     */
    public TagProperties getProperties() {
        return properties;
    }
    /**
     * Additional properties about the Tag
     */
    public void setProperties(TagProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about the Tag
Deprecated! Use 'properties' field instead.
     */
    @Deprecated
    public EditableTagProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about the Tag
Deprecated! Use 'properties' field instead.
     */
    @Deprecated
    public void setEditableProperties(EditableTagProperties editableProperties) {
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
     * Deprecated, use properties.description field instead
     */
    @Deprecated
    public String getDescription() {
        return description;
    }
    /**
     * Deprecated, use properties.description field instead
     */
    @Deprecated
    public void setDescription(String description) {
        this.description = description;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
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
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (aspects != null) {
            joiner.add("aspects: " + aspects);
        }
        return joiner.toString();
    }

    public static Tag.Builder builder() {
        return new Tag.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private TagProperties properties;
        private EditableTagProperties editableProperties;
        private Ownership ownership;
        private EntityRelationshipsResult relationships;
        private String description;
        private java.util.List<RawAspect> aspects;

        public Builder() {
        }

        /**
         * The primary key of the TAG
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
         * A unique identifier for the Tag. Deprecated - Use properties.name field instead.
         */
        @Deprecated
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Additional properties about the Tag
         */
        public Builder setProperties(TagProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about the Tag
Deprecated! Use 'properties' field instead.
         */
        @Deprecated
        public Builder setEditableProperties(EditableTagProperties editableProperties) {
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
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Deprecated, use properties.description field instead
         */
        @Deprecated
        public Builder setDescription(String description) {
            this.description = description;
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


        public Tag build() {
            return new Tag(urn, type, name, properties, editableProperties, ownership, relationships, description, aspects);
        }

    }
}
