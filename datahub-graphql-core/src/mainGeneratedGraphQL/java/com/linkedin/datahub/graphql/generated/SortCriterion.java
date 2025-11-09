package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A single sorting criterion for sorting search.
 */
public class SortCriterion implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String field;
    @javax.annotation.Nonnull
    private SortOrder sortOrder;

    public SortCriterion() {
    }

    public SortCriterion(String field, SortOrder sortOrder) {
        this.field = field;
        this.sortOrder = sortOrder;
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    public SortOrder getSortOrder() {
        return sortOrder;
    }
    public void setSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (field != null) {
            joiner.add("field: \"" + field + "\"");
        }
        if (sortOrder != null) {
            joiner.add("sortOrder: " + sortOrder);
        }
        return joiner.toString();
    }

    public static SortCriterion.Builder builder() {
        return new SortCriterion.Builder();
    }

    public static class Builder {

        private String field;
        private SortOrder sortOrder;

        public Builder() {
        }

        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        public Builder setSortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }


        public SortCriterion build() {
            return new SortCriterion(field, sortOrder);
        }

    }
}
