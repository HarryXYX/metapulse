package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A list of relationship information associated with a source Entity
 */
public class EntityRelationshipsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private Integer total;
    @javax.annotation.Nonnull
    private java.util.List<EntityRelationship> relationships;

    public EntityRelationshipsResult() {
    }

    public EntityRelationshipsResult(Integer start, Integer count, Integer total, java.util.List<EntityRelationship> relationships) {
        this.start = start;
        this.count = count;
        this.total = total;
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
     * Relationships in the result set
     */
    public java.util.List<EntityRelationship> getRelationships() {
        return relationships;
    }
    /**
     * Relationships in the result set
     */
    public void setRelationships(java.util.List<EntityRelationship> relationships) {
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
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        return joiner.toString();
    }

    public static EntityRelationshipsResult.Builder builder() {
        return new EntityRelationshipsResult.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private Integer total;
        private java.util.List<EntityRelationship> relationships;

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
         * Relationships in the result set
         */
        public Builder setRelationships(java.util.List<EntityRelationship> relationships) {
            this.relationships = relationships;
            return this;
        }


        public EntityRelationshipsResult build() {
            return new EntityRelationshipsResult(start, count, total, relationships);
        }

    }
}
