package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * All of the parent containers for a given entity. Returns parents with direct parent first followed by the parent's parent etc.
 */
public class ParentContainersResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int count;
    @javax.annotation.Nonnull
    private java.util.List<Container> containers;

    public ParentContainersResult() {
    }

    public ParentContainersResult(int count, java.util.List<Container> containers) {
        this.count = count;
        this.containers = containers;
    }

    /**
     * The number of containers bubbling up for this entity
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of containers bubbling up for this entity
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * A list of parent containers in order from direct parent, to parent's parent etc. If there are no containers, return an emty list
     */
    public java.util.List<Container> getContainers() {
        return containers;
    }
    /**
     * A list of parent containers in order from direct parent, to parent's parent etc. If there are no containers, return an emty list
     */
    public void setContainers(java.util.List<Container> containers) {
        this.containers = containers;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("count: " + count);
        if (containers != null) {
            joiner.add("containers: " + containers);
        }
        return joiner.toString();
    }

    public static ParentContainersResult.Builder builder() {
        return new ParentContainersResult.Builder();
    }

    public static class Builder {

        private int count;
        private java.util.List<Container> containers;

        public Builder() {
        }

        /**
         * The number of containers bubbling up for this entity
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * A list of parent containers in order from direct parent, to parent's parent etc. If there are no containers, return an emty list
         */
        public Builder setContainers(java.util.List<Container> containers) {
            this.containers = containers;
            return this;
        }


        public ParentContainersResult build() {
            return new ParentContainersResult(count, containers);
        }

    }
}
