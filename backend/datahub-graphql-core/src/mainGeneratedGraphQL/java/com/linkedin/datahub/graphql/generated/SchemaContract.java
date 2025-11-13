package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class SchemaContract implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Assertion assertion;

    public SchemaContract() {
    }

    public SchemaContract(Assertion assertion) {
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

    public static SchemaContract.Builder builder() {
        return new SchemaContract.Builder();
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


        public SchemaContract build() {
            return new SchemaContract(assertion);
        }

    }
}
