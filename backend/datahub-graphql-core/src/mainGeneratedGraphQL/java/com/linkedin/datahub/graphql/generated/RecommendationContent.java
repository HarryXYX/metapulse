package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Content to display within each recommendation module
 */
public class RecommendationContent implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String value;
    private Entity entity;
    private RecommendationParams params;

    public RecommendationContent() {
    }

    public RecommendationContent(String value, Entity entity, RecommendationParams params) {
        this.value = value;
        this.entity = entity;
        this.params = params;
    }

    /**
     * String representation of content
     */
    public String getValue() {
        return value;
    }
    /**
     * String representation of content
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Entity being recommended. Empty if the content being recommended is not an entity
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * Entity being recommended. Empty if the content being recommended is not an entity
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * Additional context required to generate the the recommendation
     */
    public RecommendationParams getParams() {
        return params;
    }
    /**
     * Additional context required to generate the the recommendation
     */
    public void setParams(RecommendationParams params) {
        this.params = params;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (entity != null) {
            joiner.add("entity: " + entity);
        }
        if (params != null) {
            joiner.add("params: " + params);
        }
        return joiner.toString();
    }

    public static RecommendationContent.Builder builder() {
        return new RecommendationContent.Builder();
    }

    public static class Builder {

        private String value;
        private Entity entity;
        private RecommendationParams params;

        public Builder() {
        }

        /**
         * String representation of content
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * Entity being recommended. Empty if the content being recommended is not an entity
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * Additional context required to generate the the recommendation
         */
        public Builder setParams(RecommendationParams params) {
            this.params = params;
            return this;
        }


        public RecommendationContent build() {
            return new RecommendationContent(value, entity, params);
        }

    }
}
