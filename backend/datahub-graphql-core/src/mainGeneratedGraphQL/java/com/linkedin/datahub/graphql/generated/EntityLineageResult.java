package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A list of lineage information associated with a source Entity
 */
public class EntityLineageResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private Integer total;
    private Integer filtered;
    @javax.annotation.Nonnull
    private java.util.List<LineageRelationship> relationships;

    public EntityLineageResult() {
    }

    public EntityLineageResult(Integer start, Integer count, Integer total, Integer filtered, java.util.List<LineageRelationship> relationships) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.filtered = filtered;
        this.relationships = relationships;
    }

    /**
     * Start offset of the result set
     */
    public Integer getStart() {
        return start;
    }
    /**
     * Start offset of the result set
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * Number of results in the returned result set
     */
    public Integer getCount() {
        return count;
    }
    /**
     * Number of results in the returned result set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * Total number of results in the result set
     */
    public Integer getTotal() {
        return total;
    }
    /**
     * Total number of results in the result set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * The number of results that were filtered out of the page (soft-deleted or non-existent)
     */
    public Integer getFiltered() {
        return filtered;
    }
    /**
     * The number of results that were filtered out of the page (soft-deleted or non-existent)
     */
    public void setFiltered(Integer filtered) {
        this.filtered = filtered;
    }

    /**
     * Relationships in the result set
     */
    public java.util.List<LineageRelationship> getRelationships() {
        return relationships;
    }
    /**
     * Relationships in the result set
     */
    public void setRelationships(java.util.List<LineageRelationship> relationships) {
        this.relationships = relationships;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (total != null) {
            joiner.add("total: " + total);
        }
        if (filtered != null) {
            joiner.add("filtered: " + filtered);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static EntityLineageResult.Builder builder() {
        return new EntityLineageResult.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private Integer total;
        private Integer filtered;
        private java.util.List<LineageRelationship> relationships;

        public Builder() {
        }

        /**
         * Start offset of the result set
         */
        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        /**
         * Number of results in the returned result set
         */
        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Total number of results in the result set
         */
        public Builder setTotal(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * The number of results that were filtered out of the page (soft-deleted or non-existent)
         */
        public Builder setFiltered(Integer filtered) {
            this.filtered = filtered;
            return this;
        }

        /**
         * Relationships in the result set
         */
        public Builder setRelationships(java.util.List<LineageRelationship> relationships) {
            this.relationships = relationships;
            return this;
        }


        public EntityLineageResult build() {
            return new EntityLineageResult(start, count, total, filtered, relationships);
        }

    }
}
