package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An overview of the field that was matched in the entity search document
 */
public class EntityPath implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<Entity> path;

    public EntityPath() {
    }

    public EntityPath(java.util.List<Entity> path) {
        this.path = path;
    }

    /**
     * Path of entities between source and destination nodes
     */
    public java.util.List<Entity> getPath() {
        return path;
    }
    /**
     * Path of entities between source and destination nodes
     */
    public void setPath(java.util.List<Entity> path) {
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

    public static EntityPath.Builder builder() {
        return new EntityPath.Builder();
    }

    public static class Builder {

        private java.util.List<Entity> path;

        public Builder() {
        }

        /**
         * Path of entities between source and destination nodes
         */
        public Builder setPath(java.util.List<Entity> path) {
            this.path = path;
            return this;
        }


        public EntityPath build() {
            return new EntityPath(path);
        }

    }
}
