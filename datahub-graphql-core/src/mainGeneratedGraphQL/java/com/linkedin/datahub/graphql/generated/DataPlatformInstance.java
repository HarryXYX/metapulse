package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Data Platform instance represents an instance of a 3rd party platform like Looker, Snowflake, etc.
 */
public class DataPlatformInstance implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    @javax.annotation.Nonnull
    private String instanceId;
    private EntityRelationshipsResult relationships;
    private DataPlatformInstanceProperties properties;
    private Ownership ownership;
    private InstitutionalMemory institutionalMemory;
    private GlobalTags tags;
    private Deprecation deprecation;
    private Status status;

    public DataPlatformInstance() {
    }

    public DataPlatformInstance(String urn, EntityType type, DataPlatform platform, String instanceId, EntityRelationshipsResult relationships, DataPlatformInstanceProperties properties, Ownership ownership, InstitutionalMemory institutionalMemory, GlobalTags tags, Deprecation deprecation, Status status) {
        this.urn = urn;
        this.type = type;
        this.platform = platform;
        this.instanceId = instanceId;
        this.relationships = relationships;
        this.properties = properties;
        this.ownership = ownership;
        this.institutionalMemory = institutionalMemory;
        this.tags = tags;
        this.deprecation = deprecation;
        this.status = status;
    }

    /**
     * Urn of the data platform
     */
    public String getUrn() {
        return urn;
    }
    /**
     * Urn of the data platform
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
     * Name of the data platform
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Name of the data platform
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * The platform instance id
     */
    public String getInstanceId() {
        return instanceId;
    }
    /**
     * The platform instance id
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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
     * Additional read only properties associated with a data platform instance
     */
    public DataPlatformInstanceProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties associated with a data platform instance
     */
    public void setProperties(DataPlatformInstanceProperties properties) {
        this.properties = properties;
    }

    /**
     * Ownership metadata of the data platform instance
     */
    public Ownership getOwnership() {
        return ownership;
    }
    /**
     * Ownership metadata of the data platform instance
     */
    public void setOwnership(Ownership ownership) {
        this.ownership = ownership;
    }

    /**
     * References to internal resources related to the data platform instance
     */
    public InstitutionalMemory getInstitutionalMemory() {
        return institutionalMemory;
    }
    /**
     * References to internal resources related to the data platform instance
     */
    public void setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
        this.institutionalMemory = institutionalMemory;
    }

    /**
     * Tags used for searching the data platform instance
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * Tags used for searching the data platform instance
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * The deprecation status of the data platform instance
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * The deprecation status of the data platform instance
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
    }

    /**
     * Status metadata of the container
     */
    public Status getStatus() {
        return status;
    }
    /**
     * Status metadata of the container
     */
    public void setStatus(Status status) {
        this.status = status;
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
        if (instanceId != null) {
            joiner.add("instanceId: \"" + instanceId + "\"");
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
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
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (deprecation != null) {
            joiner.add("deprecation: " + deprecation);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        return joiner.toString();
    }

    public static DataPlatformInstance.Builder builder() {
        return new DataPlatformInstance.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataPlatform platform;
        private String instanceId;
        private EntityRelationshipsResult relationships;
        private DataPlatformInstanceProperties properties;
        private Ownership ownership;
        private InstitutionalMemory institutionalMemory;
        private GlobalTags tags;
        private Deprecation deprecation;
        private Status status;

        public Builder() {
        }

        /**
         * Urn of the data platform
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
         * Name of the data platform
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * The platform instance id
         */
        public Builder setInstanceId(String instanceId) {
            this.instanceId = instanceId;
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
         * Additional read only properties associated with a data platform instance
         */
        public Builder setProperties(DataPlatformInstanceProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Ownership metadata of the data platform instance
         */
        public Builder setOwnership(Ownership ownership) {
            this.ownership = ownership;
            return this;
        }

        /**
         * References to internal resources related to the data platform instance
         */
        public Builder setInstitutionalMemory(InstitutionalMemory institutionalMemory) {
            this.institutionalMemory = institutionalMemory;
            return this;
        }

        /**
         * Tags used for searching the data platform instance
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The deprecation status of the data platform instance
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
            return this;
        }

        /**
         * Status metadata of the container
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }


        public DataPlatformInstance build() {
            return new DataPlatformInstance(urn, type, platform, instanceId, relationships, properties, ownership, institutionalMemory, tags, deprecation, status);
        }

    }
}
