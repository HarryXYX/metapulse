package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A group of Entities under a given browse path
 */
public class BrowseResultGroupV2 implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private Entity entity;
    @javax.annotation.Nonnull
    private Long count;
    private boolean hasSubGroups;

    public BrowseResultGroupV2() {
    }

    public BrowseResultGroupV2(String name, Entity entity, Long count, boolean hasSubGroups) {
        this.name = name;
        this.entity = entity;
        this.count = count;
        this.hasSubGroups = hasSubGroups;
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
     * An optional entity associated with this browse group. This will usually be a container entity.
If this entity is not populated, the name must be used.
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * An optional entity associated with this browse group. This will usually be a container entity.
If this entity is not populated, the name must be used.
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
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

    /**
     * Whether or not there are any more groups underneath this group
     */
    public boolean getHasSubGroups() {
        return hasSubGroups;
    }
    /**
     * Whether or not there are any more groups underneath this group
     */
    public void setHasSubGroups(boolean hasSubGroups) {
        this.hasSubGroups = hasSubGroups;
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
        if (count != null) {
            joiner.add("count: " + count);
        }
        joiner.add("hasSubGroups: " + hasSubGroups);
        return joiner.toString();
    }

    public static BrowseResultGroupV2.Builder builder() {
        return new BrowseResultGroupV2.Builder();
    }

    public static class Builder {

        private String name;
        private Entity entity;
        private Long count;
        private boolean hasSubGroups;

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
         * An optional entity associated with this browse group. This will usually be a container entity.
If this entity is not populated, the name must be used.
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * The number of entities within the group
         */
        public Builder setCount(Long count) {
            this.count = count;
            return this;
        }

        /**
         * Whether or not there are any more groups underneath this group
         */
        public Builder setHasSubGroups(boolean hasSubGroups) {
            this.hasSubGroups = hasSubGroups;
            return this;
        }


        public BrowseResultGroupV2 build() {
            return new BrowseResultGroupV2(name, entity, count, hasSubGroups);
        }

    }
}
