package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A set of filter criteria
 */
public class FilterInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> and;

    public FilterInput() {
    }

    public FilterInput(java.util.List<FacetFilterInput> and) {
        this.and = and;
    }

    public java.util.List<FacetFilterInput> getAnd() {
        return and;
    }
    public void setAnd(java.util.List<FacetFilterInput> and) {
        this.and = and;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (and != null) {
            joiner.add("and: " + and);
        }
        return joiner.toString();
    }

    public static FilterInput.Builder builder() {
        return new FilterInput.Builder();
    }

    public static class Builder {

        private java.util.List<FacetFilterInput> and;

        public Builder() {
        }

        public Builder setAnd(java.util.List<FacetFilterInput> and) {
            this.and = and;
            return this;
        }


        public FilterInput build() {
            return new FilterInput(and);
        }

    }
}
