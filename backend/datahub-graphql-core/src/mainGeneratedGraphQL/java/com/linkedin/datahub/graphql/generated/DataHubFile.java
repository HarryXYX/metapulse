package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A DataHub file entity representing a file stored in S3
 */
public class DataHubFile implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataHubFileInfo info;
    private EntityRelationshipsResult relationships;

    public DataHubFile() {
    }

    public DataHubFile(String urn, EntityType type, DataHubFileInfo info, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.info = info;
        this.relationships = relationships;
    }

    /**
     * A primary key associated with the DataHub File
     */
    public String getUrn() {
        return urn;
    }
    /**
     * A primary key associated with the DataHub File
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
     * The main information about a DataHub file
     */
    public DataHubFileInfo getInfo() {
        return info;
    }
    /**
     * The main information about a DataHub file
     */
    public void setInfo(DataHubFileInfo info) {
        this.info = info;
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
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static DataHubFile.Builder builder() {
        return new DataHubFile.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataHubFileInfo info;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * A primary key associated with the DataHub File
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
         * The main information about a DataHub file
         */
        public Builder setInfo(DataHubFileInfo info) {
            this.info = info;
            return this;
        }

        /**
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public DataHubFile build() {
            return new DataHubFile(urn, type, info, relationships);
        }

    }
}
