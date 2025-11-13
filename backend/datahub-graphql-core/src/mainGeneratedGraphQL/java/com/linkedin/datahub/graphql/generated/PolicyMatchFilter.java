package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Filter object that encodes a complex filter logic with OR + AND
 */
public class PolicyMatchFilter implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<PolicyMatchCriterion> criteria;

    public PolicyMatchFilter() {
    }

    public PolicyMatchFilter(java.util.List<PolicyMatchCriterion> criteria) {
        this.criteria = criteria;
    }

    /**
     * List of criteria to apply
     */
    public java.util.List<PolicyMatchCriterion> getCriteria() {
        return criteria;
    }
    /**
     * List of criteria to apply
     */
    public void setCriteria(java.util.List<PolicyMatchCriterion> criteria) {
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

    public static PolicyMatchFilter.Builder builder() {
        return new PolicyMatchFilter.Builder();
    }

    public static class Builder {

        private java.util.List<PolicyMatchCriterion> criteria;

        public Builder() {
        }

        /**
         * List of criteria to apply
         */
        public Builder setCriteria(java.util.List<PolicyMatchCriterion> criteria) {
            this.criteria = criteria;
            return this;
        }


        public PolicyMatchFilter build() {
            return new PolicyMatchFilter(criteria);
        }

    }
}
