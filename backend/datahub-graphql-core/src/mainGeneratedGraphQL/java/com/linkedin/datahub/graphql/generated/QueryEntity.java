package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An individual Query
 */
public class QueryEntity implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private QueryProperties properties;
    private java.util.List<QuerySubject> subjects;
    private EntityRelationshipsResult relationships;
    private DataPlatform platform;

    public QueryEntity() {
    }

    public QueryEntity(String urn, EntityType type, QueryProperties properties, java.util.List<QuerySubject> subjects, EntityRelationshipsResult relationships, DataPlatform platform) {
        this.urn = urn;
        this.type = type;
        this.properties = properties;
        this.subjects = subjects;
        this.relationships = relationships;
        this.platform = platform;
    }

    /**
     * A primary key associated with the Query
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A primary key associated with the Query
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
     * Properties about the Query
     */
    public QueryProperties getProperties() {
        return properties;
    }
    /**
     * Properties about the Query
     */
    public void setProperties(QueryProperties properties) {
        this.properties = properties;
    }

    /**
     * Subjects for the query
     */
    public java.util.List<QuerySubject> getSubjects() {
        return subjects;
    }
    /**
     * Subjects for the query
     */
    public void setSubjects(java.util.List<QuerySubject> subjects) {
        this.subjects = subjects;
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
     * Platform from which the Query was detected
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * Platform from which the Query was detected
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
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
        if (subjects != null) {
            joiner.add("subjects: " + subjects);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        return joiner.toString();
    }

    public static QueryEntity.Builder builder() {
        return new QueryEntity.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private QueryProperties properties;
        private java.util.List<QuerySubject> subjects;
        private EntityRelationshipsResult relationships;
        private DataPlatform platform;

        public Builder() {
        }

        /**
         * A primary key associated with the Query
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
         * Properties about the Query
         */
        public Builder setProperties(QueryProperties properties) {
            this.properties = properties;
            return this;
        }

        /**
         * Subjects for the query
         */
        public Builder setSubjects(java.util.List<QuerySubject> subjects) {
            this.subjects = subjects;
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
         * Platform from which the Query was detected
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }


        public QueryEntity build() {
            return new QueryEntity(urn, type, properties, subjects, relationships, platform);
        }

    }
}
