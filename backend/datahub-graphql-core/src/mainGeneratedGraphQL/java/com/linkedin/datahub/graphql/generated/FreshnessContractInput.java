package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to create an Freshness contract
 */
public class FreshnessContractInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String assertionUrn;

    public FreshnessContractInput() {
    }

    public FreshnessContractInput(String assertionUrn) {
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

    public static FreshnessContractInput.Builder builder() {
        return new FreshnessContractInput.Builder();
    }

    public static class Builder {

        private String assertionUrn;

        public Builder() {
        }

        public Builder setAssertionUrn(String assertionUrn) {
            this.assertionUrn = assertionUrn;
            return this;
        }


        public FreshnessContractInput build() {
            return new FreshnessContractInput(assertionUrn);
        }

    }
}
