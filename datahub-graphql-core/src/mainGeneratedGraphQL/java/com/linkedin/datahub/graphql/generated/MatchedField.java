package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An overview of the field that was matched in the entity search document
 */
public class MatchedField implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String value;
    private Entity entity;

    public MatchedField() {
    }

    public MatchedField(String name, String value, Entity entity) {
        this.name = name;
        this.value = value;
        this.entity = entity;
    }

    /**
     * Name of the field that matched
     */
    public String getName() {
        return name;
    }
    /**
     * Name of the field that matched
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Value of the field that matched
     */
    public String getValue() {
        return value;
    }
    /**
     * Value of the field that matched
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Entity if the value is an urn
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * Entity if the value is an urn
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
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (entity != null) {
            joiner.add("entity: " + entity);
        }
        return joiner.toString();
    }

    public static MatchedField.Builder builder() {
        return new MatchedField.Builder();
    }

    public static class Builder {

        private String name;
        private String value;
        private Entity entity;

        public Builder() {
        }

        /**
         * Name of the field that matched
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Value of the field that matched
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * Entity if the value is an urn
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }


        public MatchedField build() {
            return new MatchedField(name, value, entity);
        }

    }
}
