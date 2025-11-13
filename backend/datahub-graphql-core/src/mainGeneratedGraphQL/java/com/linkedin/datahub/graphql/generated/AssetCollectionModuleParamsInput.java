package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for the params required if the module is type ASSET_COLLECTION
 */
public class AssetCollectionModuleParamsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> assetUrns;
    private String dynamicFilterJson;

    public AssetCollectionModuleParamsInput() {
    }

    public AssetCollectionModuleParamsInput(java.util.List<String> assetUrns, String dynamicFilterJson) {
        this.assetUrns = assetUrns;
        this.dynamicFilterJson = dynamicFilterJson;
    }

    public java.util.List<String> getAssetUrns() {
        return assetUrns;
    }
    public void setAssetUrns(java.util.List<String> assetUrns) {
        this.assetUrns = assetUrns;
    }

    public String getDynamicFilterJson() {
        return dynamicFilterJson;
    }
    public void setDynamicFilterJson(String dynamicFilterJson) {
        this.dynamicFilterJson = dynamicFilterJson;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assetUrns != null) {
            joiner.add("assetUrns: " + assetUrns);
        }
        if (dynamicFilterJson != null) {
            joiner.add("dynamicFilterJson: \"" + dynamicFilterJson + "\"");
        }
        return joiner.toString();
    }

    public static AssetCollectionModuleParamsInput.Builder builder() {
        return new AssetCollectionModuleParamsInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> assetUrns;
        private String dynamicFilterJson;

        public Builder() {
        }

        public Builder setAssetUrns(java.util.List<String> assetUrns) {
            this.assetUrns = assetUrns;
            return this;
        }

        public Builder setDynamicFilterJson(String dynamicFilterJson) {
            this.dynamicFilterJson = dynamicFilterJson;
            return this;
        }


        public AssetCollectionModuleParamsInput build() {
            return new AssetCollectionModuleParamsInput(assetUrns, dynamicFilterJson);
        }

    }
}
