package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A list of disjunctive criterion for the filter. (or operation to combine filters)
 */
public class AndFilterInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<FacetFilterInput> and;

    public AndFilterInput() {
    }

    public AndFilterInput(java.util.List<FacetFilterInput> and) {
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

    public static AndFilterInput.Builder builder() {
        return new AndFilterInput.Builder();
    }

    public static class Builder {

        private java.util.List<FacetFilterInput> and;

        public Builder() {
        }

        public Builder setAnd(java.util.List<FacetFilterInput> and) {
            this.and = and;
            return this;
        }


        public AndFilterInput build() {
            return new AndFilterInput(and);
        }

    }
}
