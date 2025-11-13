package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class EntityCountResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private EntityType entityType;
    private int count;

    public EntityCountResult() {
    }

    public EntityCountResult(EntityType entityType, int count) {
        this.entityType = entityType;
        this.count = count;
    }

    public EntityType getEntityType() {
        return entityType;
    }
    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entityType != null) {
            joiner.add("entityType: " + entityType);
        }
        joiner.add("count: " + count);
        return joiner.toString();
    }

    public static EntityCountResult.Builder builder() {
        return new EntityCountResult.Builder();
    }

    public static class Builder {

        private EntityType entityType;
        private int count;

        public Builder() {
        }

        public Builder setEntityType(EntityType entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setCount(int count) {
            this.count = count;
            return this;
        }


        public EntityCountResult build() {
            return new EntityCountResult(entityType, count);
        }

    }
}
