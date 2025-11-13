package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Results when listing custom ownership types.
 */
public class ListOwnershipTypesResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<OwnershipTypeEntity> ownershipTypes;

    public ListOwnershipTypesResult() {
    }

    public ListOwnershipTypesResult(int start, int count, int total, java.util.List<OwnershipTypeEntity> ownershipTypes) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.ownershipTypes = ownershipTypes;
    }

    /**
     * The starting offset of the result set
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting offset of the result set
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of results to be returned
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of results to be returned
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of results in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of results in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The Custom Ownership Types themselves
     */
    public java.util.List<OwnershipTypeEntity> getOwnershipTypes() {
        return ownershipTypes;
    }
    /**
     * The Custom Ownership Types themselves
     */
    public void setOwnershipTypes(java.util.List<OwnershipTypeEntity> ownershipTypes) {
        this.ownershipTypes = ownershipTypes;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (ownershipTypes != null) {
            joiner.add("ownershipTypes: " + ownershipTypes);
        }
        return joiner.toString();
    }

    public static ListOwnershipTypesResult.Builder builder() {
        return new ListOwnershipTypesResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<OwnershipTypeEntity> ownershipTypes;

        public Builder() {
        }

        /**
         * The starting offset of the result set
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of results to be returned
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of results in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The Custom Ownership Types themselves
         */
        public Builder setOwnershipTypes(java.util.List<OwnershipTypeEntity> ownershipTypes) {
            this.ownershipTypes = ownershipTypes;
            return this;
        }


        public ListOwnershipTypesResult build() {
            return new ListOwnershipTypesResult(start, count, total, ownershipTypes);
        }

    }
}
