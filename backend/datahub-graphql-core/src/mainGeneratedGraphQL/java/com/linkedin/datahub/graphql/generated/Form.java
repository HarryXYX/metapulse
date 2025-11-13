package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A form that helps with filling out metadata on an entity
 */
public class Form implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private FormInfo info;
    private Ownership ownership;
    private EntityRelationshipsResult relationships;

    public Form() {
    }

    public Form(String urn, EntityType type, FormInfo info, Ownership ownership, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.info = info;
        this.ownership = ownership;
        this.relationships = relationships;
    }

    /**
     * A primary key associated with the Form
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A primary key associated with the Form
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
     * Information about this form
     */
    public FormInfo getInfo() {
        return info;
    }
    /**
     * Information about this form
     */
    public void setInfo(FormInfo info) {
        this.info = info;
    }

    /**
     * Ownership metadata of the form
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the form
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (info != null) {
            joiner.add("info: " + info);
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static Form.Builder builder() {
        return new Form.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private FormInfo info;
        private Ownership ownership;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * A primary key associated with the Form
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
         * Information about this form
         */
        public Builder setInfo(FormInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Ownership metadata of the form
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


        public Form build() {
            return new Form(urn, type, info, ownership, relationships);
        }

    }
}
