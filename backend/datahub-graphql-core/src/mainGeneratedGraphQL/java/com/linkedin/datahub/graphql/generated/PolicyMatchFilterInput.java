package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Filter object that encodes a complex filter logic with OR + AND
 */
public class PolicyMatchFilterInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<PolicyMatchCriterionInput> criteria;

    public PolicyMatchFilterInput() {
    }

    public PolicyMatchFilterInput(java.util.List<PolicyMatchCriterionInput> criteria) {
        this.criteria = criteria;
    }

    public java.util.List<PolicyMatchCriterionInput> getCriteria() {
        return criteria;
    }
    public void setCriteria(java.util.List<PolicyMatchCriterionInput> criteria) {
        this.criteria = criteria;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (criteria != null) {
            joiner.add("criteria: " + criteria);
        }
        return joiner.toString();
    }

    public static PolicyMatchFilterInput.Builder builder() {
        return new PolicyMatchFilterInput.Builder();
    }

    public static class Builder {

        private java.util.List<PolicyMatchCriterionInput> criteria;

        public Builder() {
        }

        public Builder setCriteria(java.util.List<PolicyMatchCriterionInput> criteria) {
            this.criteria = criteria;
            return this;
        }


        public PolicyMatchFilterInput build() {
            return new PolicyMatchFilterInput(criteria);
        }

    }
}
