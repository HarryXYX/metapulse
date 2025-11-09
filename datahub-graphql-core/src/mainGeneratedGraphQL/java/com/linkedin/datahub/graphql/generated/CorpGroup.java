package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A DataHub Group entity, which represents a Person on the Metadata Entity Graph
 */
public class CorpGroup implements java.io.Serializable, OwnerType, ResolvedActor, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String name;
    private Ownership ownership;
    private CorpGroupProperties properties;
    private CorpGroupEditableProperties editableProperties;
    private EntityRelationshipsResult relationships;
    private Origin origin;
    @Deprecated
    private CorpGroupInfo info;
    private Boolean exists;
    private java.util.List<RawAspect> aspects;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private EntityPrivileges privileges;

    public CorpGroup() {
    }

    public CorpGroup(String urn, EntityType type, String name, Ownership ownership, CorpGroupProperties properties, CorpGroupEditableProperties editableProperties, EntityRelationshipsResult relationships, Origin origin, CorpGroupInfo info, Boolean exists, java.util.List<RawAspect> aspects, StructuredProperties structuredProperties, Forms forms, EntityPrivileges privileges) {
        this.urn = urn;
        this.type = type;
        this.name = name;
        this.ownership = ownership;
        this.properties = properties;
        this.editableProperties = editableProperties;
        this.relationships = relationships;
        this.origin = origin;
        this.info = info;
        this.exists = exists;
        this.aspects = aspects;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.privileges = privileges;
    }

    /**
     * The primary key of the group
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the group
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
     * Group name eg wherehows dev, ask_metadata
     */
    public String getName() {
        return name;
    }
    /**
     * Group name eg wherehows dev, ask_metadata
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Ownership metadata of the Corp Group
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the Corp Group
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * Additional read only properties about the group
     */
    public CorpGroupProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties about the group
     */
    public void setProperties(CorpGroupProperties properties) {
        this.properties = properties;
    }

    /**
     * Additional read write properties about the group
     */
    public CorpGroupEditableProperties getEditableProperties() {
        return editableProperties;
    }
    /**
     * Additional read write properties about the group
     */
    public void setEditableProperties(CorpGroupEditableProperties editableProperties) {
        this.editableProperties = editableProperties;
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
     * Origin info about this group.
     */
    public Origin getOrigin() {
        return origin;
    }
    /**
     * Origin info about this group.
     */
    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    /**
     * Deprecated, use properties field instead
Additional read only info about the group
     */
    @Deprecated
    public CorpGroupInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional read only info about the group
     */
    @Deprecated
    public void setInfo(CorpGroupInfo info) {
        this.info = info;
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
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (origin != null) {
            joiner.add("origin: " + origin);
        }
        if (info != null) {
            joiner.add("info: " + info);
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

    public static CorpGroup.Builder builder() {
        return new CorpGroup.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String name;
        private Ownership ownership;
        private CorpGroupProperties properties;
        private CorpGroupEditableProperties editableProperties;
        private EntityRelationshipsResult relationships;
        private Origin origin;
        private CorpGroupInfo info;
        private Boolean exists;
        private java.util.List<RawAspect> aspects;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private EntityPrivileges privileges;

        public Builder() {
        }

        /**
         * The primary key of the group
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
         * Group name eg wherehows dev, ask_metadata
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Ownership metadata of the Corp Group
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * Additional read only properties about the group
         */
        public Builder setProperties(CorpGroupProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Additional read write properties about the group
         */
        public Builder setEditableProperties(CorpGroupEditableProperties editableProperties) {
            this.editableProperties = editableProperties;
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
         * Origin info about this group.
         */
        public Builder setOrigin(Origin origin) {
            this.origin = origin;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional read only info about the group
         */
        @Deprecated
        public Builder setInfo(CorpGroupInfo info) {
            this.info = info;
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


        public CorpGroup build() {
            return new CorpGroup(urn, type, name, ownership, properties, editableProperties, relationships, origin, info, exists, aspects, structuredProperties, forms, privileges);
        }

    }
}
