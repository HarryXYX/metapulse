package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An individual auto complete result specific to an individual Metadata Entity Type
 */
public class AutoCompleteResultForEntity implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private java.util.List<String> suggestions;
    @javax.annotation.Nonnull
    private java.util.List<Entity> entities;

    public AutoCompleteResultForEntity() {
    }

    public AutoCompleteResultForEntity(EntityType type, java.util.List<String> suggestions, java.util.List<Entity> entities) {
        this.type = type;
        this.suggestions = suggestions;
        this.entities = entities;
    }

    /**
     * Entity type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * Entity type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * The autocompletion results for specified entity type
     */
    public java.util.List<String> getSuggestions() {
        return suggestions;
    }
    /**
     * The autocompletion results for specified entity type
     */
    public void setSuggestions(java.util.List<String> suggestions) {
        this.suggestions = suggestions;
    }

    /**
     * A list of entities to render in autocomplete
     */
    public java.util.List<Entity> getEntities() {
        return entities;
    }
    /**
     * A list of entities to render in autocomplete
     */
    public void setEntities(java.util.List<Entity> entities) {
        this.entities = entities;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (suggestions != null) {
            joiner.add("suggestions: " + suggestions);
        }
        if (entities != null) {
            joiner.add("entities: " + entities);
        }
        return joiner.toString();
    }

    public static AutoCompleteResultForEntity.Builder builder() {
        return new AutoCompleteResultForEntity.Builder();
    }

    public static class Builder {

        private EntityType type;
        private java.util.List<String> suggestions;
        private java.util.List<Entity> entities;

        public Builder() {
        }

        /**
         * Entity type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * The autocompletion results for specified entity type
         */
        public Builder setSuggestions(java.util.List<String> suggestions) {
            this.suggestions = suggestions;
            return this;
        }

        /**
         * A list of entities to render in autocomplete
         */
        public Builder setEntities(java.util.List<Entity> entities) {
            this.entities = entities;
            return this;
        }


        public AutoCompleteResultForEntity build() {
            return new AutoCompleteResultForEntity(type, suggestions, entities);
        }

    }
}
