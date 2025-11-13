package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for upserting structured properties on a given asset
 */
public class UpsertStructuredPropertiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String assetUrn;
    @javax.annotation.Nonnull
    private java.util.List<StructuredPropertyInputParams> structuredPropertyInputParams;

    public UpsertStructuredPropertiesInput() {
    }

    public UpsertStructuredPropertiesInput(String assetUrn, java.util.List<StructuredPropertyInputParams> structuredPropertyInputParams) {
        this.assetUrn = assetUrn;
        this.structuredPropertyInputParams = structuredPropertyInputParams;
    }

    public String getAssetUrn() {
        return assetUrn;
    }
    public void setAssetUrn(String assetUrn) {
        this.assetUrn = assetUrn;
    }

    public java.util.List<StructuredPropertyInputParams> getStructuredPropertyInputParams() {
        return structuredPropertyInputParams;
    }
    public void setStructuredPropertyInputParams(java.util.List<StructuredPropertyInputParams> structuredPropertyInputParams) {
        this.structuredPropertyInputParams = structuredPropertyInputParams;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assetUrn != null) {
            joiner.add("assetUrn: \"" + assetUrn + "\"");
        }
        if (structuredPropertyInputParams != null) {
            joiner.add("structuredPropertyInputParams: " + structuredPropertyInputParams);
        }
        return joiner.toString();
    }

    public static UpsertStructuredPropertiesInput.Builder builder() {
        return new UpsertStructuredPropertiesInput.Builder();
    }

    public static class Builder {

        private String assetUrn;
        private java.util.List<StructuredPropertyInputParams> structuredPropertyInputParams;

        public Builder() {
        }

        public Builder setAssetUrn(String assetUrn) {
            this.assetUrn = assetUrn;
            return this;
        }

        public Builder setStructuredPropertyInputParams(java.util.List<StructuredPropertyInputParams> structuredPropertyInputParams) {
            this.structuredPropertyInputParams = structuredPropertyInputParams;
            return this;
        }


        public UpsertStructuredPropertiesInput build() {
            return new UpsertStructuredPropertiesInput(assetUrn, structuredPropertyInputParams);
        }

    }
}
