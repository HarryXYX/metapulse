package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class BrowsePathEntry implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private Entity entity;

    public BrowsePathEntry() {
    }

    public BrowsePathEntry(String name, Entity entity) {
        this.name = name;
        this.entity = entity;
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
     * An optional entity associated with this browse entry. This will usually be a container entity.
If this entity is not populated, the name must be used.
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * An optional entity associated with this browse entry. This will usually be a container entity.
If this entity is not populated, the name must be used.
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (entity != null) {
            joiner.add("entity: " + entity);
        }
        return joiner.toString();
    }

    public static BrowsePathEntry.Builder builder() {
        return new BrowsePathEntry.Builder();
    }

    public static class Builder {

        private String name;
        private Entity entity;

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
         * An optional entity associated with this browse entry. This will usually be a container entity.
If this entity is not populated, the name must be used.
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }


        public BrowsePathEntry build() {
            return new BrowsePathEntry(name, entity);
        }

    }
}
