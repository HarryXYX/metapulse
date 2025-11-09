package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to create a schema contract
 */
public class SchemaContractInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String assertionUrn;

    public SchemaContractInput() {
    }

    public SchemaContractInput(String assertionUrn) {
        this.assertionUrn = assertionUrn;
    }

    public String getAssertionUrn() {
        return assertionUrn;
    }
    public void setAssertionUrn(String assertionUrn) {
        this.assertionUrn = assertionUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assertionUrn != null) {
            joiner.add("assertionUrn: \"" + assertionUrn + "\"");
        }
        return joiner.toString();
    }

    public static SchemaContractInput.Builder builder() {
        return new SchemaContractInput.Builder();
    }

    public static class Builder {

        private String assertionUrn;

        public Builder() {
        }

        public Builder setAssertionUrn(String assertionUrn) {
            this.assertionUrn = assertionUrn;
            return this;
        }


        public SchemaContractInput build() {
            return new SchemaContractInput(assertionUrn);
        }

    }
}
