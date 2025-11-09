package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A set of capabilities regarding our timerseries indices
 */
public class TimeseriesCapabilitiesResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private AssetStatsResult assetStats;

    public TimeseriesCapabilitiesResult() {
    }

    public TimeseriesCapabilitiesResult(AssetStatsResult assetStats) {
        this.assetStats = assetStats;
    }

    /**
     * Information regarding asset stats
     */
    public AssetStatsResult getAssetStats() {
        return assetStats;
    }
    /**
     * Information regarding asset stats
     */
    public void setAssetStats(AssetStatsResult assetStats) {
        this.assetStats = assetStats;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assetStats != null) {
            joiner.add("assetStats: " + assetStats);
        }
        return joiner.toString();
    }

    public static TimeseriesCapabilitiesResult.Builder builder() {
        return new TimeseriesCapabilitiesResult.Builder();
    }

    public static class Builder {

        private AssetStatsResult assetStats;

        public Builder() {
        }

        /**
         * Information regarding asset stats
         */
        public Builder setAssetStats(AssetStatsResult assetStats) {
            this.assetStats = assetStats;
            return this;
        }


        public TimeseriesCapabilitiesResult build() {
            return new TimeseriesCapabilitiesResult(assetStats);
        }

    }
}
