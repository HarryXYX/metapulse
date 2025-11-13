package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Facet filters to apply to search results
 */
public class FacetFilterInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String field;
    @Deprecated
    private String value;
    private java.util.List<String> values;
    private Boolean negated;
    private FilterOperator condition;

    public FacetFilterInput() {
    }

    public FacetFilterInput(String field, String value, java.util.List<String> values, Boolean negated, FilterOperator condition) {
        this.field = field;
        this.value = value;
        this.values = values;
        this.negated = negated;
        this.condition = condition;
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    @Deprecated
    public String getValue() {
        return value;
    }
    @Deprecated
    public void setValue(String value) {
        this.value = value;
    }

    public java.util.List<String> getValues() {
        return values;
    }
    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

    public Boolean getNegated() {
        return negated;
    }
    public void setNegated(Boolean negated) {
        this.negated = negated;
    }

    public FilterOperator getCondition() {
        return condition;
    }
    public void setCondition(FilterOperator condition) {
        this.condition = condition;
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
        if (values != null) {
            joiner.add("values: " + values);
        }
        if (negated != null) {
            joiner.add("negated: " + negated);
        }
        if (condition != null) {
            joiner.add("condition: " + condition);
        }
        return joiner.toString();
    }

    public static FacetFilterInput.Builder builder() {
        return new FacetFilterInput.Builder();
    }

    public static class Builder {

        private String field;
        private String value;
        private java.util.List<String> values;
        private Boolean negated;
        private FilterOperator condition;

        public Builder() {
        }

        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        @Deprecated
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setValues(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public Builder setNegated(Boolean negated) {
            this.negated = negated;
            return this;
        }

        public Builder setCondition(FilterOperator condition) {
            this.condition = condition;
            return this;
        }


        public FacetFilterInput build() {
            return new FacetFilterInput(field, value, values, negated, condition);
        }

    }
}
