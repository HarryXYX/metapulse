package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A Data Platform represents a specific third party Data System or Tool Examples include
warehouses like Snowflake, orchestrators like Airflow, and dashboarding tools like Looker
 */
public class DataPlatform implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private Long lastIngested;
    @javax.annotation.Nonnull
    private String name;
    private DataPlatformProperties properties;
    @Deprecated
    private String displayName;
    @Deprecated
    private DataPlatformInfo info;
    private EntityRelationshipsResult relationships;

    public DataPlatform() {
    }

    public DataPlatform(String urn, EntityType type, Long lastIngested, String name, DataPlatformProperties properties, String displayName, DataPlatformInfo info, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.lastIngested = lastIngested;
        this.name = name;
        this.properties = properties;
        this.displayName = displayName;
        this.info = info;
        this.relationships = relationships;
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
     * The timestamp for the last time this entity was ingested
     */
    public Long getLastIngested() {
        return lastIngested;
    }
    /**
     * The timestamp for the last time this entity was ingested
     */
    public void setLastIngested(Long lastIngested) {
        this.lastIngested = lastIngested;
    }

    /**
     * Name of the data platform
     */
    public String getName() {
        return name;
    }
    /**
     * Name of the data platform
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Additional read only properties associated with a data platform
     */
    public DataPlatformProperties getProperties() {
        return properties;
    }
    /**
     * Additional read only properties associated with a data platform
     */
    public void setProperties(DataPlatformProperties properties) {
        this.properties = properties;
    }

    /**
     * Deprecated, use properties displayName instead
Display name of the data platform
     */
    @Deprecated
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Deprecated, use properties displayName instead
Display name of the data platform
     */
    @Deprecated
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Deprecated, use properties field instead
Additional properties associated with a data platform
     */
    @Deprecated
    public DataPlatformInfo getInfo() {
        return info;
    }
    /**
     * Deprecated, use properties field instead
Additional properties associated with a data platform
     */
    @Deprecated
    public void setInfo(DataPlatformInfo info) {
        this.info = info;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (lastIngested != null) {
            joiner.add("lastIngested: " + lastIngested);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (displayName != null) {
            joiner.add("displayName: \"" + displayName + "\"");
        }
        if (info != null) {
            joiner.add("info: " + info);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static DataPlatform.Builder builder() {
        return new DataPlatform.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private Long lastIngested;
        private String name;
        private DataPlatformProperties properties;
        private String displayName;
        private DataPlatformInfo info;
        private EntityRelationshipsResult relationships;

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
         * The timestamp for the last time this entity was ingested
         */
        public Builder setLastIngested(Long lastIngested) {
            this.lastIngested = lastIngested;
            return this;
        }

        /**
         * Name of the data platform
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Additional read only properties associated with a data platform
         */
        public Builder setProperties(DataPlatformProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Deprecated, use properties displayName instead
Display name of the data platform
         */
        @Deprecated
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Deprecated, use properties field instead
Additional properties associated with a data platform
         */
        @Deprecated
        public Builder setInfo(DataPlatformInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public DataPlatform build() {
            return new DataPlatform(urn, type, lastIngested, name, properties, displayName, info, relationships);
        }

    }
}
