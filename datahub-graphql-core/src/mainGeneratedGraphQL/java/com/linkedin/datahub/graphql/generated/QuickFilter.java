package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A quick filter in search and auto-complete
 */
public class QuickFilter implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String field;
    @javax.annotation.Nonnull
    private String value;
    private Entity entity;

    public QuickFilter() {
    }

    public QuickFilter(String field, String value, Entity entity) {
        this.field = field;
        this.value = value;
        this.entity = entity;
    }

    /**
     * Name of field to filter by
     */
    public String getField() {
        return field;
    }
    /**
     * Name of field to filter by
     */
    public void setField(String field) {
        this.field = field;
    }

    /**
     * Value to filter on
     */
    public String getValue() {
        return value;
    }
    /**
     * Value to filter on
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Entity that the value maps to if any
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * Entity that the value maps to if any
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (field != null) {
            joiner.add("field: \"" + field + "\"");
        }
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (entity != null) {
            joiner.add("entity: " + entity);
        }
        return joiner.toString();
    }

    public static QuickFilter.Builder builder() {
        return new QuickFilter.Builder();
    }

    public static class Builder {

        private String field;
        private String value;
        private Entity entity;

        public Builder() {
        }

        /**
         * Name of field to filter by
         */
        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        /**
         * Value to filter on
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * Entity that the value maps to if any
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }


        public QuickFilter build() {
            return new QuickFilter(field, value, entity);
        }

    }
}
