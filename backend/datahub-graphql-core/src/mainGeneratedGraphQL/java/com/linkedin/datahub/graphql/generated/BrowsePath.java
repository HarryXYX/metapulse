package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A hierarchical entity path
 */
public class BrowsePath implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> path;

    public BrowsePath() {
    }

    public BrowsePath(java.util.List<String> path) {
        this.path = path;
    }

    /**
     * The components of the browse path
     */
    public java.util.List<String> getPath() {
        return path;
    }
    /**
     * The components of the browse path
     */
    public void setPath(java.util.List<String> path) {
        this.path = path;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (path != null) {
            joiner.add("path: " + path);
        }
        return joiner.toString();
    }

    public static BrowsePath.Builder builder() {
        return new BrowsePath.Builder();
    }

    public static class Builder {

        private java.util.List<String> path;

        public Builder() {
        }

        /**
         * The components of the browse path
         */
        public Builder setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }


        public BrowsePath build() {
            return new BrowsePath(path);
        }

    }
}
