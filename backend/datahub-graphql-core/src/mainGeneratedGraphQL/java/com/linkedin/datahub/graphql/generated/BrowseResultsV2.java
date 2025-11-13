package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The results of a browse path V2 traversal query
 */
public class BrowseResultsV2 implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<BrowseResultGroupV2> groups;
    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private BrowseResultMetadata metadata;

    public BrowseResultsV2() {
    }

    public BrowseResultsV2(java.util.List<BrowseResultGroupV2> groups, int start, int count, int total, BrowseResultMetadata metadata) {
        this.groups = groups;
        this.start = start;
        this.count = count;
        this.total = total;
        this.metadata = metadata;
    }

    /**
     * The groups present at the provided browse path V2
     */
    public java.util.List<BrowseResultGroupV2> getGroups() {
        return groups;
    }
    /**
     * The groups present at the provided browse path V2
     */
    public void setGroups(java.util.List<BrowseResultGroupV2> groups) {
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
     * The number of groups included in the results
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of groups included in the results
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of browse groups under the path with filters applied
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of browse groups under the path with filters applied
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

    public static BrowseResultsV2.Builder builder() {
        return new BrowseResultsV2.Builder();
    }

    public static class Builder {

        private java.util.List<BrowseResultGroupV2> groups;
        private int start;
        private int count;
        private int total;
        private BrowseResultMetadata metadata;

        public Builder() {
        }

        /**
         * The groups present at the provided browse path V2
         */
        public Builder setGroups(java.util.List<BrowseResultGroupV2> groups) {
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
         * The number of groups included in the results
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of browse groups under the path with filters applied
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


        public BrowseResultsV2 build() {
            return new BrowseResultsV2(groups, start, count, total, metadata);
        }

    }
}
