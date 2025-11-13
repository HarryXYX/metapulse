package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A single filter value
 */
public class FacetFilter implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String field;
    private FilterOperator condition;
    @javax.annotation.Nonnull
    private java.util.List<String> values;
    private Boolean negated;

    public FacetFilter() {
    }

    public FacetFilter(String field, FilterOperator condition, java.util.List<String> values, Boolean negated) {
        this.field = field;
        this.condition = condition;
        this.values = values;
        this.negated = negated;
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
     * Condition for the values.
     */
    public FilterOperator getCondition() {
        return condition;
    }
    /**
     * Condition for the values.
     */
    public void setCondition(FilterOperator condition) {
        this.condition = condition;
    }

    /**
     * Values, one of which the intended field should match.
     */
    public java.util.List<String> getValues() {
        return values;
    }
    /**
     * Values, one of which the intended field should match.
     */
    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

    /**
     * If the filter should or should not be matched
     */
    public Boolean getNegated() {
        return negated;
    }
    /**
     * If the filter should or should not be matched
     */
    public void setNegated(Boolean negated) {
        this.negated = negated;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (field != null) {
            joiner.add("field: \"" + field + "\"");
        }
        if (condition != null) {
            joiner.add("condition: " + condition);
        }
        if (values != null) {
            joiner.add("values: " + values);
        }
        if (negated != null) {
            joiner.add("negated: " + negated);
        }
        return joiner.toString();
    }

    public static FacetFilter.Builder builder() {
        return new FacetFilter.Builder();
    }

    public static class Builder {

        private String field;
        private FilterOperator condition;
        private java.util.List<String> values;
        private Boolean negated;

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
         * Condition for the values.
         */
        public Builder setCondition(FilterOperator condition) {
            this.condition = condition;
            return this;
        }

        /**
         * Values, one of which the intended field should match.
         */
        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        /**
         * If the filter should or should not be matched
         */
        public Builder setNegated(Boolean negated) {
            this.negated = negated;
            return this;
        }


        public FacetFilter build() {
            return new FacetFilter(field, condition, values, negated);
        }

    }
}
