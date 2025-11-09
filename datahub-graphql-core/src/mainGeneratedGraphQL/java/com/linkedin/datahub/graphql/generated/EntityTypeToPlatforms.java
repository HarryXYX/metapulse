package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class EntityTypeToPlatforms implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private EntityType entityType;
    private java.util.List<String> platforms;

    public EntityTypeToPlatforms() {
    }

    public EntityTypeToPlatforms(EntityType entityType, java.util.List<String> platforms) {
        this.entityType = entityType;
        this.platforms = platforms;
    }

    public EntityType getEntityType() {
        return entityType;
    }
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public java.util.List<String> getPlatforms() {
        return platforms;
    }
    public void setPlatforms(java.util.List<String> platforms) {
        this.platforms = platforms;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityType != null) {
            joiner.add("entityType: " + entityType);
        }
        if (platforms != null) {
            joiner.add("platforms: " + platforms);
        }
        return joiner.toString();
    }

    public static EntityTypeToPlatforms.Builder builder() {
        return new EntityTypeToPlatforms.Builder();
    }

    public static class Builder {

        private EntityType entityType;
        private java.util.List<String> platforms;

        public Builder() {
        }

        public Builder setEntityType(EntityType entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setPlatforms(java.util.List<String> platforms) {
            this.platforms = platforms;
            return this;
        }


        public EntityTypeToPlatforms build() {
            return new EntityTypeToPlatforms(entityType, platforms);
        }

    }
}
