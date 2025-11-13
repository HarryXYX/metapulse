package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Object that encodes the privileges the actor has for a given resource
 */
public class Privileges implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> privileges;
    private java.util.List<PolicyEvaluationDetail> evaluationDetails;

    public Privileges() {
    }

    public Privileges(java.util.List<String> privileges, java.util.List<PolicyEvaluationDetail> evaluationDetails) {
        this.privileges = privileges;
        this.evaluationDetails = evaluationDetails;
    }

    /**
     * Granted Privileges
     */
    public java.util.List<String> getPrivileges() {
        return privileges;
    }
    /**
     * Granted Privileges
     */
    public void setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
    }

    /**
     * Details about how each policy was evaluated
     */
    public java.util.List<PolicyEvaluationDetail> getEvaluationDetails() {
        return evaluationDetails;
    }
    /**
     * Details about how each policy was evaluated
     */
    public void setEvaluationDetails(java.util.List<PolicyEvaluationDetail> evaluationDetails) {
        this.evaluationDetails = evaluationDetails;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        if (evaluationDetails != null) {
            joiner.add("evaluationDetails: " + evaluationDetails);
        }
        return joiner.toString();
    }

    public static Privileges.Builder builder() {
        return new Privileges.Builder();
    }

    public static class Builder {

        private java.util.List<String> privileges;
        private java.util.List<PolicyEvaluationDetail> evaluationDetails;

        public Builder() {
        }

        /**
         * Granted Privileges
         */
        public Builder setPrivileges(java.util.List<String> privileges) {
            this.privileges = privileges;
            return this;
        }

        /**
         * Details about how each policy was evaluated
         */
        public Builder setEvaluationDetails(java.util.List<PolicyEvaluationDetail> evaluationDetails) {
            this.evaluationDetails = evaluationDetails;
            return this;
        }


        public Privileges build() {
            return new Privileges(privileges, evaluationDetails);
        }

    }
}
