package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Rolled up metrics about Dataset operations over time
 */
public class OperationsAggregationsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer totalOperations;
    private Integer totalInserts;
    private Integer totalUpdates;
    private Integer totalDeletes;
    private Integer totalCreates;
    private Integer totalAlters;
    private Integer totalDrops;
    private Integer totalCustoms;
    private java.util.List<IntMapEntry> customOperationsMap;

    public OperationsAggregationsResult() {
    }

    public OperationsAggregationsResult(Integer totalOperations, Integer totalInserts, Integer totalUpdates, Integer totalDeletes, Integer totalCreates, Integer totalAlters, Integer totalDrops, Integer totalCustoms, java.util.List<IntMapEntry> customOperationsMap) {
        this.totalOperations = totalOperations;
        this.totalInserts = totalInserts;
        this.totalUpdates = totalUpdates;
        this.totalDeletes = totalDeletes;
        this.totalCreates = totalCreates;
        this.totalAlters = totalAlters;
        this.totalDrops = totalDrops;
        this.totalCustoms = totalCustoms;
        this.customOperationsMap = customOperationsMap;
    }

    /**
     * The total number of operations performed within the queried time range
     */
    public Integer getTotalOperations() {
        return totalOperations;
    }
    /**
     * The total number of operations performed within the queried time range
     */
    public void setTotalOperations(Integer totalOperations) {
        this.totalOperations = totalOperations;
    }

    /**
     * The total number of INSERT operations performed within the queried time range
     */
    public Integer getTotalInserts() {
        return totalInserts;
    }
    /**
     * The total number of INSERT operations performed within the queried time range
     */
    public void setTotalInserts(Integer totalInserts) {
        this.totalInserts = totalInserts;
    }

    /**
     * The total number of UPDATE operations performed within the queried time range
     */
    public Integer getTotalUpdates() {
        return totalUpdates;
    }
    /**
     * The total number of UPDATE operations performed within the queried time range
     */
    public void setTotalUpdates(Integer totalUpdates) {
        this.totalUpdates = totalUpdates;
    }

    /**
     * The total number of DELETE operations performed within the queried time range
     */
    public Integer getTotalDeletes() {
        return totalDeletes;
    }
    /**
     * The total number of DELETE operations performed within the queried time range
     */
    public void setTotalDeletes(Integer totalDeletes) {
        this.totalDeletes = totalDeletes;
    }

    /**
     * The total number of CREATE operations performed within the queried time range
     */
    public Integer getTotalCreates() {
        return totalCreates;
    }
    /**
     * The total number of CREATE operations performed within the queried time range
     */
    public void setTotalCreates(Integer totalCreates) {
        this.totalCreates = totalCreates;
    }

    /**
     * The total number of ALTER operations performed within the queried time range
     */
    public Integer getTotalAlters() {
        return totalAlters;
    }
    /**
     * The total number of ALTER operations performed within the queried time range
     */
    public void setTotalAlters(Integer totalAlters) {
        this.totalAlters = totalAlters;
    }

    /**
     * The total number of DROP operations performed within the queried time range
     */
    public Integer getTotalDrops() {
        return totalDrops;
    }
    /**
     * The total number of DROP operations performed within the queried time range
     */
    public void setTotalDrops(Integer totalDrops) {
        this.totalDrops = totalDrops;
    }

    /**
     * The total number of CUSTOM operations performed within the queried time range
     */
    public Integer getTotalCustoms() {
        return totalCustoms;
    }
    /**
     * The total number of CUSTOM operations performed within the queried time range
     */
    public void setTotalCustoms(Integer totalCustoms) {
        this.totalCustoms = totalCustoms;
    }

    /**
     * A map from each custom operation type to the total count for that type
     */
    public java.util.List<IntMapEntry> getCustomOperationsMap() {
        return customOperationsMap;
    }
    /**
     * A map from each custom operation type to the total count for that type
     */
    public void setCustomOperationsMap(java.util.List<IntMapEntry> customOperationsMap) {
        this.customOperationsMap = customOperationsMap;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (totalOperations != null) {
            joiner.add("totalOperations: " + totalOperations);
        }
        if (totalInserts != null) {
            joiner.add("totalInserts: " + totalInserts);
        }
        if (totalUpdates != null) {
            joiner.add("totalUpdates: " + totalUpdates);
        }
        if (totalDeletes != null) {
            joiner.add("totalDeletes: " + totalDeletes);
        }
        if (totalCreates != null) {
            joiner.add("totalCreates: " + totalCreates);
        }
        if (totalAlters != null) {
            joiner.add("totalAlters: " + totalAlters);
        }
        if (totalDrops != null) {
            joiner.add("totalDrops: " + totalDrops);
        }
        if (totalCustoms != null) {
            joiner.add("totalCustoms: " + totalCustoms);
        }
        if (customOperationsMap != null) {
            joiner.add("customOperationsMap: " + customOperationsMap);
        }
        return joiner.toString();
    }

    public static OperationsAggregationsResult.Builder builder() {
        return new OperationsAggregationsResult.Builder();
    }

    public static class Builder {

        private Integer totalOperations;
        private Integer totalInserts;
        private Integer totalUpdates;
        private Integer totalDeletes;
        private Integer totalCreates;
        private Integer totalAlters;
        private Integer totalDrops;
        private Integer totalCustoms;
        private java.util.List<IntMapEntry> customOperationsMap;

        public Builder() {
        }

        /**
         * The total number of operations performed within the queried time range
         */
        public Builder setTotalOperations(Integer totalOperations) {
            this.totalOperations = totalOperations;
            return this;
        }

        /**
         * The total number of INSERT operations performed within the queried time range
         */
        public Builder setTotalInserts(Integer totalInserts) {
            this.totalInserts = totalInserts;
            return this;
        }

        /**
         * The total number of UPDATE operations performed within the queried time range
         */
        public Builder setTotalUpdates(Integer totalUpdates) {
            this.totalUpdates = totalUpdates;
            return this;
        }

        /**
         * The total number of DELETE operations performed within the queried time range
         */
        public Builder setTotalDeletes(Integer totalDeletes) {
            this.totalDeletes = totalDeletes;
            return this;
        }

        /**
         * The total number of CREATE operations performed within the queried time range
         */
        public Builder setTotalCreates(Integer totalCreates) {
            this.totalCreates = totalCreates;
            return this;
        }

        /**
         * The total number of ALTER operations performed within the queried time range
         */
        public Builder setTotalAlters(Integer totalAlters) {
            this.totalAlters = totalAlters;
            return this;
        }

        /**
         * The total number of DROP operations performed within the queried time range
         */
        public Builder setTotalDrops(Integer totalDrops) {
            this.totalDrops = totalDrops;
            return this;
        }

        /**
         * The total number of CUSTOM operations performed within the queried time range
         */
        public Builder setTotalCustoms(Integer totalCustoms) {
            this.totalCustoms = totalCustoms;
            return this;
        }

        /**
         * A map from each custom operation type to the total count for that type
         */
        public Builder setCustomOperationsMap(java.util.List<IntMapEntry> customOperationsMap) {
            this.customOperationsMap = customOperationsMap;
            return this;
        }


        public OperationsAggregationsResult build() {
            return new OperationsAggregationsResult(totalOperations, totalInserts, totalUpdates, totalDeletes, totalCreates, totalAlters, totalDrops, totalCustoms, customOperationsMap);
        }

    }
}
