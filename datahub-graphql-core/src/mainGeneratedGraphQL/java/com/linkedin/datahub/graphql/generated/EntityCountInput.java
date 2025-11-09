package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for the get entity counts endpoint
 */
public class EntityCountInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityType> types;
    private String viewUrn;

    public EntityCountInput() {
    }

    public EntityCountInput(java.util.List<EntityType> types, String viewUrn) {
        this.types = types;
        this.viewUrn = viewUrn;
    }

    public java.util.List<EntityType> getTypes() {
        return types;
    }
    public void setTypes(java.util.List<EntityType> types) {
        this.types = types;
    }

    public String getViewUrn() {
        return viewUrn;
    }
    public void setViewUrn(String viewUrn) {
        this.viewUrn = viewUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (types != null) {
            joiner.add("types: " + types);
        }
        if (viewUrn != null) {
            joiner.add("viewUrn: \"" + viewUrn + "\"");
        }
        return joiner.toString();
    }

    public static EntityCountInput.Builder builder() {
        return new EntityCountInput.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> types;
        private String viewUrn;

        public Builder() {
        }

        public Builder setTypes(java.util.List<EntityType> types) {
            this.types = types;
            return this;
        }

        public Builder setViewUrn(String viewUrn) {
            this.viewUrn = viewUrn;
            return this;
        }


        public EntityCountInput build() {
            return new EntityCountInput(types, viewUrn);
        }

    }
}
