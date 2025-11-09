package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Details about how a policy was evaluated for a given actor and resource
 */
public class PolicyEvaluationDetail implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String policyName;
    @javax.annotation.Nonnull
    private String reason;

    public PolicyEvaluationDetail() {
    }

    public PolicyEvaluationDetail(String policyName, String reason) {
        this.policyName = policyName;
        this.reason = reason;
    }

    /**
     * The policy that was evaluated
     */
    public String getPolicyName() {
        return policyName;
    }
    /**
     * The policy that was evaluated
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * The reason for deny for this policy
     */
    public String getReason() {
        return reason;
    }
    /**
     * The reason for deny for this policy
     */
    public void setReason(String reason) {
        this.reason = reason;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (policyName != null) {
            joiner.add("policyName: \"" + policyName + "\"");
        }
        if (reason != null) {
            joiner.add("reason: \"" + reason + "\"");
        }
        return joiner.toString();
    }

    public static PolicyEvaluationDetail.Builder builder() {
        return new PolicyEvaluationDetail.Builder();
    }

    public static class Builder {

        private String policyName;
        private String reason;

        public Builder() {
        }

        /**
         * The policy that was evaluated
         */
        public Builder setPolicyName(String policyName) {
            this.policyName = policyName;
            return this;
        }

        /**
         * The reason for deny for this policy
         */
        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }


        public PolicyEvaluationDetail build() {
            return new PolicyEvaluationDetail(policyName, reason);
        }

    }
}
