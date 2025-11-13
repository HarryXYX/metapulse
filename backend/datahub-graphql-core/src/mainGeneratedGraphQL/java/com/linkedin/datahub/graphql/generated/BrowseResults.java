package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The results of a browse path traversal query
 */
public class BrowseResults implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<Entity> entities;
    @javax.annotation.Nonnull
    private java.util.List<BrowseResultGroup> groups;
    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private BrowseResultMetadata metadata;

    public BrowseResults() {
    }

    public BrowseResults(java.util.List<Entity> entities, java.util.List<BrowseResultGroup> groups, int start, int count, int total, BrowseResultMetadata metadata) {
        this.entities = entities;
        this.groups = groups;
        this.start = start;
        this.count = count;
        this.total = total;
        this.metadata = metadata;
    }

    /**
     * The browse results
     */
    public java.util.List<Entity> getEntities() {
        return entities;
    }
    /**
     * The browse results
     */
    public void setEntities(java.util.List<Entity> entities) {
        this.entities = entities;
    }

    /**
     * The groups present at the provided browse path
     */
    public java.util.List<BrowseResultGroup> getGroups() {
        return groups;
    }
    /**
     * The groups present at the provided browse path
     */
    public void setGroups(java.util.List<BrowseResultGroup> groups) {
        this.groups = groups;
    }

    /**
     * The starting point of paginated results
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting point of paginated results
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of elements included in the results
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of elements included in the results
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of browse results under the path with filters applied
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of browse results under the path with filters applied
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * Metadata containing resulting browse groups
     */
    public BrowseResultMetadata getMetadata() {
        return metadata;
    }
    /**
     * Metadata containing resulting browse groups
     */
    public void setMetadata(BrowseResultMetadata metadata) {
        this.metadata = metadata;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entities != null) {
            joiner.add("entities: " + entities);
        }
        if (groups != null) {
            joiner.add("groups: " + groups);
        }
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (metadata != null) {
            joiner.add("metadata: " + metadata);
        }
        return joiner.toString();
    }

    public static BrowseResults.Builder builder() {
        return new BrowseResults.Builder();
    }

    public static class Builder {

        private java.util.List<Entity> entities;
        private java.util.List<BrowseResultGroup> groups;
        private int start;
        private int count;
        private int total;
        private BrowseResultMetadata metadata;

        public Builder() {
        }

        /**
         * The browse results
         */
        public Builder setEntities(java.util.List<Entity> entities) {
            this.entities = entities;
            return this;
        }

        /**
         * The groups present at the provided browse path
         */
        public Builder setGroups(java.util.List<BrowseResultGroup> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * The starting point of paginated results
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of elements included in the results
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of browse results under the path with filters applied
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * Metadata containing resulting browse groups
         */
        public Builder setMetadata(BrowseResultMetadata metadata) {
            this.metadata = metadata;
            return this;
        }


        public BrowseResults build() {
            return new BrowseResults(entities, groups, start, count, total, metadata);
        }

    }
}
