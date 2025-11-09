package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class VersionSet implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private EntityRelationshipsResult relationships;
    private Entity latestVersion;
    private SearchResults versionsSearch;

    public VersionSet() {
    }

    public VersionSet(String urn, EntityType type, EntityRelationshipsResult relationships, Entity latestVersion, SearchResults versionsSearch) {
        this.urn = urn;
        this.type = type;
        this.relationships = relationships;
        this.latestVersion = latestVersion;
        this.versionsSearch = versionsSearch;
    }

    /**
     * The primary key of the VersionSet
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the VersionSet
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
     * The latest versioned entity linked to in this version set
     */
    public Entity getLatestVersion() {
        return latestVersion;
    }
    /**
     * The latest versioned entity linked to in this version set
     */
    public void setLatestVersion(Entity latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * Executes a search on all versioned entities linked to this version set
By default sorts by sortId in descending order
     */
    public SearchResults getVersionsSearch() {
        return versionsSearch;
    }
    /**
     * Executes a search on all versioned entities linked to this version set
By default sorts by sortId in descending order
     */
    public void setVersionsSearch(SearchResults versionsSearch) {
        this.versionsSearch = versionsSearch;
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
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (latestVersion != null) {
            joiner.add("latestVersion: " + latestVersion);
        }
        if (versionsSearch != null) {
            joiner.add("versionsSearch: " + versionsSearch);
        }
        return joiner.toString();
    }

    public static VersionSet.Builder builder() {
        return new VersionSet.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private EntityRelationshipsResult relationships;
        private Entity latestVersion;
        private SearchResults versionsSearch;

        public Builder() {
        }

        /**
         * The primary key of the VersionSet
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
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * The latest versioned entity linked to in this version set
         */
        public Builder setLatestVersion(Entity latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * Executes a search on all versioned entities linked to this version set
By default sorts by sortId in descending order
         */
        public Builder setVersionsSearch(SearchResults versionsSearch) {
            this.versionsSearch = versionsSearch;
            return this;
        }


        public VersionSet build() {
            return new VersionSet(urn, type, relationships, latestVersion, versionsSearch);
        }

    }
}
