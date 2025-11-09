package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The params required if the module is type ASSET_COLLECTION
 */
public class AssetCollectionModuleParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> assetUrns;
    private String dynamicFilterJson;

    public AssetCollectionModuleParams() {
    }

    public AssetCollectionModuleParams(java.util.List<String> assetUrns, String dynamicFilterJson) {
        this.assetUrns = assetUrns;
        this.dynamicFilterJson = dynamicFilterJson;
    }

    /**
     * The list of asset urns for the asset collection module
     */
    public java.util.List<String> getAssetUrns() {
        return assetUrns;
    }
    /**
     * The list of asset urns for the asset collection module
     */
    public void setAssetUrns(java.util.List<String> assetUrns) {
        this.assetUrns = assetUrns;
    }

    /**
     * Optional dynamic filter

The stringified json representing the logical predicate built in the UI to select assets.
This predicate is turned into orFilters to send through graphql since graphql doesn't support
arbitrary nesting. This string is used to restore the UI for this logical predicate.
     */
    public String getDynamicFilterJson() {
        return dynamicFilterJson;
    }
    /**
     * Optional dynamic filter

The stringified json representing the logical predicate built in the UI to select assets.
This predicate is turned into orFilters to send through graphql since graphql doesn't support
arbitrary nesting. This string is used to restore the UI for this logical predicate.
     */
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

    public static AssetCollectionModuleParams.Builder builder() {
        return new AssetCollectionModuleParams.Builder();
    }

    public static class Builder {

        private java.util.List<String> assetUrns;
        private String dynamicFilterJson;

        public Builder() {
        }

        /**
         * The list of asset urns for the asset collection module
         */
        public Builder setAssetUrns(java.util.List<String> assetUrns) {
            this.assetUrns = assetUrns;
            return this;
        }

        /**
         * Optional dynamic filter

The stringified json representing the logical predicate built in the UI to select assets.
This predicate is turned into orFilters to send through graphql since graphql doesn't support
arbitrary nesting. This string is used to restore the UI for this logical predicate.
         */
        public Builder setDynamicFilterJson(String dynamicFilterJson) {
            this.dynamicFilterJson = dynamicFilterJson;
            return this;
        }


        public AssetCollectionModuleParams build() {
            return new AssetCollectionModuleParams(assetUrns, dynamicFilterJson);
        }

    }
}
