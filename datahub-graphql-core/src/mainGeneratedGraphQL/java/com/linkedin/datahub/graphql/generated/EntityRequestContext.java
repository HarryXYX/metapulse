package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Context that defines an entity page requesting recommendations
 */
public class EntityRequestContext implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String urn;

    public EntityRequestContext() {
    }

    public EntityRequestContext(EntityType type, String urn) {
        this.type = type;
        this.urn = urn;
    }

    public EntityType getType() {
        return type;
    }
    public void setType(EntityType type) {
        this.type = type;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        return joiner.toString();
    }

    public static EntityRequestContext.Builder builder() {
        return new EntityRequestContext.Builder();
    }

    public static class Builder {

        private EntityType type;
        private String urn;

        public Builder() {
        }

        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }


        public EntityRequestContext build() {
            return new EntityRequestContext(type, urn);
        }

    }
}
