package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Some actions associated with an assertion
 */
public class AssertionActions implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<AssertionAction> onSuccess;
    @javax.annotation.Nonnull
    private java.util.List<AssertionAction> onFailure;

    public AssertionActions() {
    }

    public AssertionActions(java.util.List<AssertionAction> onSuccess, java.util.List<AssertionAction> onFailure) {
        this.onSuccess = onSuccess;
        this.onFailure = onFailure;
    }

    /**
     * Actions to be executed on successful assertion run.
     */
    public java.util.List<AssertionAction> getOnSuccess() {
        return onSuccess;
    }
    /**
     * Actions to be executed on successful assertion run.
     */
    public void setOnSuccess(java.util.List<AssertionAction> onSuccess) {
        this.onSuccess = onSuccess;
    }

    /**
     * Actions to be executed on failed assertion run.
     */
    public java.util.List<AssertionAction> getOnFailure() {
        return onFailure;
    }
    /**
     * Actions to be executed on failed assertion run.
     */
    public void setOnFailure(java.util.List<AssertionAction> onFailure) {
        this.onFailure = onFailure;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (onSuccess != null) {
            joiner.add("onSuccess: " + onSuccess);
        }
        if (onFailure != null) {
            joiner.add("onFailure: " + onFailure);
        }
        return joiner.toString();
    }

    public static AssertionActions.Builder builder() {
        return new AssertionActions.Builder();
    }

    public static class Builder {

        private java.util.List<AssertionAction> onSuccess;
        private java.util.List<AssertionAction> onFailure;

        public Builder() {
        }

        /**
         * Actions to be executed on successful assertion run.
         */
        public Builder setOnSuccess(java.util.List<AssertionAction> onSuccess) {
            this.onSuccess = onSuccess;
            return this;
        }

        /**
         * Actions to be executed on failed assertion run.
         */
        public Builder setOnFailure(java.util.List<AssertionAction> onFailure) {
            this.onFailure = onFailure;
            return this;
        }


        public AssertionActions build() {
            return new AssertionActions(onSuccess, onFailure);
        }

    }
}
