package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A hierarchical entity path V2
 */
public class BrowsePathV2 implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<BrowsePathEntry> path;

    public BrowsePathV2() {
    }

    public BrowsePathV2(java.util.List<BrowsePathEntry> path) {
        this.path = path;
    }

    /**
     * The components of the browse path
     */
    public java.util.List<BrowsePathEntry> getPath() {
        return path;
    }
    /**
     * The components of the browse path
     */
    public void setPath(java.util.List<BrowsePathEntry> path) {
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

    public static BrowsePathV2.Builder builder() {
        return new BrowsePathV2.Builder();
    }

    public static class Builder {

        private java.util.List<BrowsePathEntry> path;

        public Builder() {
        }

        /**
         * The components of the browse path
         */
        public Builder setPath(java.util.List<BrowsePathEntry> path) {
            this.path = path;
            return this;
        }


        public BrowsePathV2 build() {
            return new BrowsePathV2(path);
        }

    }
}
