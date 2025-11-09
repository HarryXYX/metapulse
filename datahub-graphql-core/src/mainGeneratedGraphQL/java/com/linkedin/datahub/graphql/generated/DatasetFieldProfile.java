package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An individual Dataset Field Profile
 */
public class DatasetFieldProfile implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String fieldPath;
    private Long uniqueCount;
    private Float uniqueProportion;
    private Long nullCount;
    private Float nullProportion;
    private String min;
    private String max;
    private String mean;
    private String median;
    private String stdev;
    private java.util.List<String> sampleValues;
    private java.util.List<Quantile> quantiles;
    private java.util.List<ValueFrequency> distinctValueFrequencies;

    public DatasetFieldProfile() {
    }

    public DatasetFieldProfile(String fieldPath, Long uniqueCount, Float uniqueProportion, Long nullCount, Float nullProportion, String min, String max, String mean, String median, String stdev, java.util.List<String> sampleValues, java.util.List<Quantile> quantiles, java.util.List<ValueFrequency> distinctValueFrequencies) {
        this.fieldPath = fieldPath;
        this.uniqueCount = uniqueCount;
        this.uniqueProportion = uniqueProportion;
        this.nullCount = nullCount;
        this.nullProportion = nullProportion;
        this.min = min;
        this.max = max;
        this.mean = mean;
        this.median = median;
        this.stdev = stdev;
        this.sampleValues = sampleValues;
        this.quantiles = quantiles;
        this.distinctValueFrequencies = distinctValueFrequencies;
    }

    /**
     * The standardized path of the field
     */
    public String getFieldPath() {
        return fieldPath;
    }
    /**
     * The standardized path of the field
     */
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * The unique value count for the field across the Dataset
     */
    public Long getUniqueCount() {
        return uniqueCount;
    }
    /**
     * The unique value count for the field across the Dataset
     */
    public void setUniqueCount(Long uniqueCount) {
        this.uniqueCount = uniqueCount;
    }

    /**
     * The proportion of rows with unique values across the Dataset
     */
    public Float getUniqueProportion() {
        return uniqueProportion;
    }
    /**
     * The proportion of rows with unique values across the Dataset
     */
    public void setUniqueProportion(Float uniqueProportion) {
        this.uniqueProportion = uniqueProportion;
    }

    /**
     * The number of NULL row values across the Dataset
     */
    public Long getNullCount() {
        return nullCount;
    }
    /**
     * The number of NULL row values across the Dataset
     */
    public void setNullCount(Long nullCount) {
        this.nullCount = nullCount;
    }

    /**
     * The proportion of rows with NULL values across the Dataset
     */
    public Float getNullProportion() {
        return nullProportion;
    }
    /**
     * The proportion of rows with NULL values across the Dataset
     */
    public void setNullProportion(Float nullProportion) {
        this.nullProportion = nullProportion;
    }

    /**
     * The min value for the field
     */
    public String getMin() {
        return min;
    }
    /**
     * The min value for the field
     */
    public void setMin(String min) {
        this.min = min;
    }

    /**
     * The max value for the field
     */
    public String getMax() {
        return max;
    }
    /**
     * The max value for the field
     */
    public void setMax(String max) {
        this.max = max;
    }

    /**
     * The mean value for the field
     */
    public String getMean() {
        return mean;
    }
    /**
     * The mean value for the field
     */
    public void setMean(String mean) {
        this.mean = mean;
    }

    /**
     * The median value for the field
     */
    public String getMedian() {
        return median;
    }
    /**
     * The median value for the field
     */
    public void setMedian(String median) {
        this.median = median;
    }

    /**
     * The standard deviation for the field
     */
    public String getStdev() {
        return stdev;
    }
    /**
     * The standard deviation for the field
     */
    public void setStdev(String stdev) {
        this.stdev = stdev;
    }

    /**
     * A set of sample values for the field
     */
    public java.util.List<String> getSampleValues() {
        return sampleValues;
    }
    /**
     * A set of sample values for the field
     */
    public void setSampleValues(java.util.List<String> sampleValues) {
        this.sampleValues = sampleValues;
    }

    /**
     * Sorted list of quantile cutoffs for the field, in ascending order
Only for numerical columns
     */
    public java.util.List<Quantile> getQuantiles() {
        return quantiles;
    }
    /**
     * Sorted list of quantile cutoffs for the field, in ascending order
Only for numerical columns
     */
    public void setQuantiles(java.util.List<Quantile> quantiles) {
        this.quantiles = quantiles;
    }

    /**
     * Volume of each column value for a low-cardinality / categorical field
     */
    public java.util.List<ValueFrequency> getDistinctValueFrequencies() {
        return distinctValueFrequencies;
    }
    /**
     * Volume of each column value for a low-cardinality / categorical field
     */
    public void setDistinctValueFrequencies(java.util.List<ValueFrequency> distinctValueFrequencies) {
        this.distinctValueFrequencies = distinctValueFrequencies;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fieldPath != null) {
            joiner.add("fieldPath: \"" + fieldPath + "\"");
        }
        if (uniqueCount != null) {
            joiner.add("uniqueCount: " + uniqueCount);
        }
        if (uniqueProportion != null) {
            joiner.add("uniqueProportion: " + uniqueProportion);
        }
        if (nullCount != null) {
            joiner.add("nullCount: " + nullCount);
        }
        if (nullProportion != null) {
            joiner.add("nullProportion: " + nullProportion);
        }
        if (min != null) {
            joiner.add("min: \"" + min + "\"");
        }
        if (max != null) {
            joiner.add("max: \"" + max + "\"");
        }
        if (mean != null) {
            joiner.add("mean: \"" + mean + "\"");
        }
        if (median != null) {
            joiner.add("median: \"" + median + "\"");
        }
        if (stdev != null) {
            joiner.add("stdev: \"" + stdev + "\"");
        }
        if (sampleValues != null) {
            joiner.add("sampleValues: " + sampleValues);
        }
        if (quantiles != null) {
            joiner.add("quantiles: " + quantiles);
        }
        if (distinctValueFrequencies != null) {
            joiner.add("distinctValueFrequencies: " + distinctValueFrequencies);
        }
        return joiner.toString();
    }

    public static DatasetFieldProfile.Builder builder() {
        return new DatasetFieldProfile.Builder();
    }

    public static class Builder {

        private String fieldPath;
        private Long uniqueCount;
        private Float uniqueProportion;
        private Long nullCount;
        private Float nullProportion;
        private String min;
        private String max;
        private String mean;
        private String median;
        private String stdev;
        private java.util.List<String> sampleValues;
        private java.util.List<Quantile> quantiles;
        private java.util.List<ValueFrequency> distinctValueFrequencies;

        public Builder() {
        }

        /**
         * The standardized path of the field
         */
        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * The unique value count for the field across the Dataset
         */
        public Builder setUniqueCount(Long uniqueCount) {
            this.uniqueCount = uniqueCount;
            return this;
        }

        /**
         * The proportion of rows with unique values across the Dataset
         */
        public Builder setUniqueProportion(Float uniqueProportion) {
            this.uniqueProportion = uniqueProportion;
            return this;
        }

        /**
         * The number of NULL row values across the Dataset
         */
        public Builder setNullCount(Long nullCount) {
            this.nullCount = nullCount;
            return this;
        }

        /**
         * The proportion of rows with NULL values across the Dataset
         */
        public Builder setNullProportion(Float nullProportion) {
            this.nullProportion = nullProportion;
            return this;
        }

        /**
         * The min value for the field
         */
        public Builder setMin(String min) {
            this.min = min;
            return this;
        }

        /**
         * The max value for the field
         */
        public Builder setMax(String max) {
            this.max = max;
            return this;
        }

        /**
         * The mean value for the field
         */
        public Builder setMean(String mean) {
            this.mean = mean;
            return this;
        }

        /**
         * The median value for the field
         */
        public Builder setMedian(String median) {
            this.median = median;
            return this;
        }

        /**
         * The standard deviation for the field
         */
        public Builder setStdev(String stdev) {
            this.stdev = stdev;
            return this;
        }

        /**
         * A set of sample values for the field
         */
        public Builder setSampleValues(java.util.List<String> sampleValues) {
            this.sampleValues = sampleValues;
            return this;
        }

        /**
         * Sorted list of quantile cutoffs for the field, in ascending order
Only for numerical columns
         */
        public Builder setQuantiles(java.util.List<Quantile> quantiles) {
            this.quantiles = quantiles;
            return this;
        }

        /**
         * Volume of each column value for a low-cardinality / categorical field
         */
        public Builder setDistinctValueFrequencies(java.util.List<ValueFrequency> distinctValueFrequencies) {
            this.distinctValueFrequencies = distinctValueFrequencies;
            return this;
        }


        public DatasetFieldProfile build() {
            return new DatasetFieldProfile(fieldPath, uniqueCount, uniqueProportion, nullCount, nullProportion, min, max, mean, median, stdev, sampleValues, quantiles, distinctValueFrequencies);
        }

    }
}
