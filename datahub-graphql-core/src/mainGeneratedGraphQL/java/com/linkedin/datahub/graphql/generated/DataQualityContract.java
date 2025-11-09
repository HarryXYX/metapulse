package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class DataQualityContract implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Assertion assertion;

    public DataQualityContract() {
    }

    public DataQualityContract(Assertion assertion) {
        this.assertion = assertion;
    }

    /**
     * The assertion representing the schema contract.
     */
    public Assertion getAssertion() {
        return assertion;
    }
    /**
     * The assertion representing the schema contract.
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

    public static DataQualityContract.Builder builder() {
        return new DataQualityContract.Builder();
    }

    public static class Builder {

        private Assertion assertion;

        public Builder() {
        }

        /**
         * The assertion representing the schema contract.
         */
        public Builder setAssertion(Assertion assertion) {
            this.assertion = assertion;
            return this;
        }


        public DataQualityContract build() {
            return new DataQualityContract(assertion);
        }

    }
}
