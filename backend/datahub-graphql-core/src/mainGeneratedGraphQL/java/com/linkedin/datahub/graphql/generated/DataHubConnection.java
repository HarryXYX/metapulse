package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A connection between DataHub and an external Platform.
 */
public class DataHubConnection implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private DataHubConnectionDetails details;
    @javax.annotation.Nonnull
    private DataPlatform platform;
    private EntityRelationshipsResult relationships;

    public DataHubConnection() {
    }

    public DataHubConnection(String urn, EntityType type, DataHubConnectionDetails details, DataPlatform platform, EntityRelationshipsResult relationships) {
        this.urn = urn;
        this.type = type;
        this.details = details;
        this.platform = platform;
        this.relationships = relationships;
    }

    /**
     * The urn of the connection
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The urn of the connection
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard Entity Type field
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard Entity Type field
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * The connection details
     */
    public DataHubConnectionDetails getDetails() {
        return details;
    }
    /**
     * The connection details
     */
    public void setDetails(DataHubConnectionDetails details) {
        this.details = details;
    }

    /**
     * The external Data Platform associated with the connection
     */
    public DataPlatform getPlatform() {
        return platform;
    }
    /**
     * The external Data Platform associated with the connection
     */
    public void setPlatform(DataPlatform platform) {
        this.platform = platform;
    }

    /**
     * Not implemented!
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Not implemented!
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
        if (details != null) {
            joiner.add("details: " + details);
        }
        if (platform != null) {
            joiner.add("platform: " + platform);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static DataHubConnection.Builder builder() {
        return new DataHubConnection.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private DataHubConnectionDetails details;
        private DataPlatform platform;
        private EntityRelationshipsResult relationships;

        public Builder() {
        }

        /**
         * The urn of the connection
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard Entity Type field
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * The connection details
         */
        public Builder setDetails(DataHubConnectionDetails details) {
            this.details = details;
            return this;
        }

        /**
         * The external Data Platform associated with the connection
         */
        public Builder setPlatform(DataPlatform platform) {
            this.platform = platform;
            return this;
        }

        /**
         * Not implemented!
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }


        public DataHubConnection build() {
            return new DataHubConnection(urn, type, details, platform, relationships);
        }

    }
}
