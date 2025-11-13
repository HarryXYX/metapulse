package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Business Attribute, or a logical schema Field
 */
public class BusinessAttribute implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private BusinessAttributeInfo properties;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;
    private Status status;
    private EntityRelationshipsResult relationships;

    public BusinessAttribute() {
    }

    public BusinessAttribute(String urn, EntityType type, BusinessAttributeInfo properties, Ownership ownership, InstitutionalMemory institutionalMemory, Status status, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.properties = properties;
        this.ownership = ownership;
        this.institutionalMemory = institutionalMemory;
        this.status = status;
        this.relationships = relationships;
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
     * Properties about a Business Attribute
     */
    public BusinessAttributeInfo getProperties() {
        return properties;
    }
    /**
     * Properties about a Business Attribute
     */
    public void setProperties(BusinessAttributeInfo properties) {
        this.properties = properties;
    }

    /**
     * Ownership metadata of the Business Attribute
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the Business Attribute
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * References to internal resources related to Business Attribute
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to Business Attribute
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
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
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static BusinessAttribute.Builder builder() {
        return new BusinessAttribute.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private BusinessAttributeInfo properties;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;
        private Status status;
        private EntityRelationshipsResult relationships;

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
         * Properties about a Business Attribute
         */
        public Builder setProperties(BusinessAttributeInfo properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Ownership metadata of the Business Attribute
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * References to internal resources related to Business Attribute
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
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
         * List of relationships between the source Entity and some destination entities with a given types
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public BusinessAttribute build() {
            return new BusinessAttribute(urn, type, properties, ownership, institutionalMemory, status, relationships);
        }

    }
}
