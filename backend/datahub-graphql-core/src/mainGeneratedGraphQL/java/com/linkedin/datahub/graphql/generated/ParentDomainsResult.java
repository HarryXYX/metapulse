package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * All of the parent domains starting from a single Domain through all of its ancestors
 */
public class ParentDomainsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int count;
    @javax.annotation.Nonnull
    private java.util.List<Entity> domains;

    public ParentDomainsResult() {
    }

    public ParentDomainsResult(int count, java.util.List<Entity> domains) {
        this.count = count;
        this.domains = domains;
    }

    /**
     * The number of parent domains bubbling up for this entity
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of parent domains bubbling up for this entity
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * A list of parent domains in order from direct parent, to parent's parent etc. If there are no parents, return an empty list
     */
    public java.util.List<Entity> getDomains() {
        return domains;
    }
    /**
     * A list of parent domains in order from direct parent, to parent's parent etc. If there are no parents, return an empty list
     */
    public void setDomains(java.util.List<Entity> domains) {
        this.domains = domains;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("count: " + count);
        if (domains != null) {
            joiner.add("domains: " + domains);
        }
        return joiner.toString();
    }

    public static ParentDomainsResult.Builder builder() {
        return new ParentDomainsResult.Builder();
    }

    public static class Builder {

        private int count;
        private java.util.List<Entity> domains;

        public Builder() {
        }

        /**
         * The number of parent domains bubbling up for this entity
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * A list of parent domains in order from direct parent, to parent's parent etc. If there are no parents, return an empty list
         */
        public Builder setDomains(java.util.List<Entity> domains) {
            this.domains = domains;
            return this;
        }


        public ParentDomainsResult build() {
            return new ParentDomainsResult(count, domains);
        }

    }
}
