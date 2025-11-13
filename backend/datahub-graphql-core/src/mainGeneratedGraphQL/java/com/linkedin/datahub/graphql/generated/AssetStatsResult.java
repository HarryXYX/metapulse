package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information regarding asset stats
 */
public class AssetStatsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Long oldestOperationTime;
    private Long oldestDatasetUsageTime;
    private Long oldestDatasetProfileTime;

    public AssetStatsResult() {
    }

    public AssetStatsResult(Long oldestOperationTime, Long oldestDatasetUsageTime, Long oldestDatasetProfileTime) {
        this.oldestOperationTime = oldestOperationTime;
        this.oldestDatasetUsageTime = oldestDatasetUsageTime;
        this.oldestDatasetProfileTime = oldestDatasetProfileTime;
    }

    /**
     * The oldest dataset operation in our index
     */
    public Long getOldestOperationTime() {
        return oldestOperationTime;
    }
    /**
     * The oldest dataset operation in our index
     */
    public void setOldestOperationTime(Long oldestOperationTime) {
        this.oldestOperationTime = oldestOperationTime;
    }

    /**
     * The oldest dataset usage in our index
     */
    public Long getOldestDatasetUsageTime() {
        return oldestDatasetUsageTime;
    }
    /**
     * The oldest dataset usage in our index
     */
    public void setOldestDatasetUsageTime(Long oldestDatasetUsageTime) {
        this.oldestDatasetUsageTime = oldestDatasetUsageTime;
    }

    /**
     * The oldest dataset profile in our index
     */
    public Long getOldestDatasetProfileTime() {
        return oldestDatasetProfileTime;
    }
    /**
     * The oldest dataset profile in our index
     */
    public void setOldestDatasetProfileTime(Long oldestDatasetProfileTime) {
        this.oldestDatasetProfileTime = oldestDatasetProfileTime;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (oldestOperationTime != null) {
            joiner.add("oldestOperationTime: " + oldestOperationTime);
        }
        if (oldestDatasetUsageTime != null) {
            joiner.add("oldestDatasetUsageTime: " + oldestDatasetUsageTime);
        }
        if (oldestDatasetProfileTime != null) {
            joiner.add("oldestDatasetProfileTime: " + oldestDatasetProfileTime);
        }
        return joiner.toString();
    }

    public static AssetStatsResult.Builder builder() {
        return new AssetStatsResult.Builder();
    }

    public static class Builder {

        private Long oldestOperationTime;
        private Long oldestDatasetUsageTime;
        private Long oldestDatasetProfileTime;

        public Builder() {
        }

        /**
         * The oldest dataset operation in our index
         */
        public Builder setOldestOperationTime(Long oldestOperationTime) {
            this.oldestOperationTime = oldestOperationTime;
            return this;
        }

        /**
         * The oldest dataset usage in our index
         */
        public Builder setOldestDatasetUsageTime(Long oldestDatasetUsageTime) {
            this.oldestDatasetUsageTime = oldestDatasetUsageTime;
            return this;
        }

        /**
         * The oldest dataset profile in our index
         */
        public Builder setOldestDatasetProfileTime(Long oldestDatasetProfileTime) {
            this.oldestDatasetProfileTime = oldestDatasetProfileTime;
            return this;
        }


        public AssetStatsResult build() {
            return new AssetStatsResult(oldestOperationTime, oldestDatasetUsageTime, oldestDatasetProfileTime);
        }

    }
}
