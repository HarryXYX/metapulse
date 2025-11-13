package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for removing structured properties on a given asset
 */
public class RemoveStructuredPropertiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String assetUrn;
    @javax.annotation.Nonnull
    private java.util.List<String> structuredPropertyUrns;

    public RemoveStructuredPropertiesInput() {
    }

    public RemoveStructuredPropertiesInput(String assetUrn, java.util.List<String> structuredPropertyUrns) {
        this.assetUrn = assetUrn;
        this.structuredPropertyUrns = structuredPropertyUrns;
    }

    public String getAssetUrn() {
        return assetUrn;
    }
    public void setAssetUrn(String assetUrn) {
        this.assetUrn = assetUrn;
    }

    public java.util.List<String> getStructuredPropertyUrns() {
        return structuredPropertyUrns;
    }
    public void setStructuredPropertyUrns(java.util.List<String> structuredPropertyUrns) {
        this.structuredPropertyUrns = structuredPropertyUrns;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assetUrn != null) {
            joiner.add("assetUrn: \"" + assetUrn + "\"");
        }
        if (structuredPropertyUrns != null) {
            joiner.add("structuredPropertyUrns: " + structuredPropertyUrns);
        }
        return joiner.toString();
    }

    public static RemoveStructuredPropertiesInput.Builder builder() {
        return new RemoveStructuredPropertiesInput.Builder();
    }

    public static class Builder {

        private String assetUrn;
        private java.util.List<String> structuredPropertyUrns;

        public Builder() {
        }

        public Builder setAssetUrn(String assetUrn) {
            this.assetUrn = assetUrn;
            return this;
        }

        public Builder setStructuredPropertyUrns(java.util.List<String> structuredPropertyUrns) {
            this.structuredPropertyUrns = structuredPropertyUrns;
            return this;
        }


        public RemoveStructuredPropertiesInput build() {
            return new RemoveStructuredPropertiesInput(assetUrn, structuredPropertyUrns);
        }

    }
}
