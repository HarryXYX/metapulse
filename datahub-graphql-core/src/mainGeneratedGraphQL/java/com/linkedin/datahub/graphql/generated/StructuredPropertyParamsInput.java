package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for a structured property type prompt
 */
public class StructuredPropertyParamsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;

    public StructuredPropertyParamsInput() {
    }

    public StructuredPropertyParamsInput(String urn) {
        this.urn = urn;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        return joiner.toString();
    }

    public static StructuredPropertyParamsInput.Builder builder() {
        return new StructuredPropertyParamsInput.Builder();
    }

    public static class Builder {

        private String urn;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }


        public StructuredPropertyParamsInput build() {
            return new StructuredPropertyParamsInput(urn);
        }

    }
}
