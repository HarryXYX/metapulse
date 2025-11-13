package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Settings associated with this asset
 */
public class AssetSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private AssetSummarySettings assetSummary;

    public AssetSettings() {
    }

    public AssetSettings(AssetSummarySettings assetSummary) {
        this.assetSummary = assetSummary;
    }

    /**
     * Information related to the asset summary for this asset
     */
    public AssetSummarySettings getAssetSummary() {
        return assetSummary;
    }
    /**
     * Information related to the asset summary for this asset
     */
    public void setAssetSummary(AssetSummarySettings assetSummary) {
        this.assetSummary = assetSummary;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assetSummary != null) {
            joiner.add("assetSummary: " + assetSummary);
        }
        return joiner.toString();
    }

    public static AssetSettings.Builder builder() {
        return new AssetSettings.Builder();
    }

    public static class Builder {

        private AssetSummarySettings assetSummary;

        public Builder() {
        }

        /**
         * Information related to the asset summary for this asset
         */
        public Builder setAssetSummary(AssetSummarySettings assetSummary) {
            this.assetSummary = assetSummary;
            return this;
        }


        public AssetSettings build() {
            return new AssetSettings(assetSummary);
        }

    }
}
