package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class FreshnessContract implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Assertion assertion;

    public FreshnessContract() {
    }

    public FreshnessContract(Assertion assertion) {
        this.assertion = assertion;
    }

    /**
     * The assertion representing the Freshness contract.
     */
    public Assertion getAssertion() {
        return assertion;
    }
    /**
     * The assertion representing the Freshness contract.
     */
    public void setAssertion(Assertion assertion) {
        this.assertion = assertion;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assertion != null) {
            joiner.add("assertion: " + assertion);
        }
        return joiner.toString();
    }

    public static FreshnessContract.Builder builder() {
        return new FreshnessContract.Builder();
    }

    public static class Builder {

        private Assertion assertion;

        public Builder() {
        }

        /**
         * The assertion representing the Freshness contract.
         */
        public Builder setAssertion(Assertion assertion) {
            this.assertion = assertion;
            return this;
        }


        public FreshnessContract build() {
            return new FreshnessContract(assertion);
        }

    }
}
