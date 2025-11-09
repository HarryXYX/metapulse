package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A group of Entities under a given browse path
 */
public class BrowseResultGroup implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private Long count;

    public BrowseResultGroup() {
    }

    public BrowseResultGroup(String name, Long count) {
        this.name = name;
        this.count = count;
    }

    /**
     * The path name of a group of browse results
     */
    public String getName() {
        return name;
    }
    /**
     * The path name of a group of browse results
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The number of entities within the group
     */
    public Long getCount() {
        return count;
    }
    /**
     * The number of entities within the group
     */
    public void setCount(Long count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        return joiner.toString();
    }

    public static BrowseResultGroup.Builder builder() {
        return new BrowseResultGroup.Builder();
    }

    public static class Builder {

        private String name;
        private Long count;

        public Builder() {
        }

        /**
         * The path name of a group of browse results
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The number of entities within the group
         */
        public Builder setCount(Long count) {
            this.count = count;
            return this;
        }


        public BrowseResultGroup build() {
            return new BrowseResultGroup(name, count);
        }

    }
}
