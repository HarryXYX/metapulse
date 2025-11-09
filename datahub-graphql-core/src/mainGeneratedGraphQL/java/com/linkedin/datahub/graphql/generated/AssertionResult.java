package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result of evaluating an assertion.
 */
public class AssertionResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AssertionResultType type;
    private Long rowCount;
    private Long missingCount;
    private Long unexpectedCount;
    private Float actualAggValue;
    private String externalUrl;
    private java.util.List<StringMapEntry> nativeResults;
    private AssertionResultError error;

    public AssertionResult() {
    }

    public AssertionResult(AssertionResultType type, Long rowCount, Long missingCount, Long unexpectedCount, Float actualAggValue, String externalUrl, java.util.List<StringMapEntry> nativeResults, AssertionResultError error) {
        this.type = type;
        this.rowCount = rowCount;
        this.missingCount = missingCount;
        this.unexpectedCount = unexpectedCount;
        this.actualAggValue = actualAggValue;
        this.externalUrl = externalUrl;
        this.nativeResults = nativeResults;
        this.error = error;
    }

    /**
     * The final result, e.g. either SUCCESS or FAILURE.
     */
    public AssertionResultType getType() {
        return type;
    }
    /**
     * The final result, e.g. either SUCCESS or FAILURE.
     */
    public void setType(AssertionResultType type) {
        this.type = type;
    }

    /**
     * Number of rows for evaluated batch
     */
    public Long getRowCount() {
        return rowCount;
    }
    /**
     * Number of rows for evaluated batch
     */
    public void setRowCount(Long rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * Number of rows with missing value for evaluated batch
     */
    public Long getMissingCount() {
        return missingCount;
    }
    /**
     * Number of rows with missing value for evaluated batch
     */
    public void setMissingCount(Long missingCount) {
        this.missingCount = missingCount;
    }

    /**
     * Number of rows with unexpected value for evaluated batch
     */
    public Long getUnexpectedCount() {
        return unexpectedCount;
    }
    /**
     * Number of rows with unexpected value for evaluated batch
     */
    public void setUnexpectedCount(Long unexpectedCount) {
        this.unexpectedCount = unexpectedCount;
    }

    /**
     * Observed aggregate value for evaluated batch
     */
    public Float getActualAggValue() {
        return actualAggValue;
    }
    /**
     * Observed aggregate value for evaluated batch
     */
    public void setActualAggValue(Float actualAggValue) {
        this.actualAggValue = actualAggValue;
    }

    /**
     * URL where full results are available
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * URL where full results are available
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Native results / properties of evaluation
     */
    public java.util.List<StringMapEntry> getNativeResults() {
        return nativeResults;
    }
    /**
     * Native results / properties of evaluation
     */
    public void setNativeResults(java.util.List<StringMapEntry> nativeResults) {
        this.nativeResults = nativeResults;
    }

    /**
     * Error details, if type is ERROR
     */
    public AssertionResultError getError() {
        return error;
    }
    /**
     * Error details, if type is ERROR
     */
    public void setError(AssertionResultError error) {
        this.error = error;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (rowCount != null) {
            joiner.add("rowCount: " + rowCount);
        }
        if (missingCount != null) {
            joiner.add("missingCount: " + missingCount);
        }
        if (unexpectedCount != null) {
            joiner.add("unexpectedCount: " + unexpectedCount);
        }
        if (actualAggValue != null) {
            joiner.add("actualAggValue: " + actualAggValue);
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (nativeResults != null) {
            joiner.add("nativeResults: " + nativeResults);
        }
        if (error != null) {
            joiner.add("error: " + error);
        }
        return joiner.toString();
    }

    public static AssertionResult.Builder builder() {
        return new AssertionResult.Builder();
    }

    public static class Builder {

        private AssertionResultType type;
        private Long rowCount;
        private Long missingCount;
        private Long unexpectedCount;
        private Float actualAggValue;
        private String externalUrl;
        private java.util.List<StringMapEntry> nativeResults;
        private AssertionResultError error;

        public Builder() {
        }

        /**
         * The final result, e.g. either SUCCESS or FAILURE.
         */
        public Builder setType(AssertionResultType type) {
            this.type = type;
            return this;
        }

        /**
         * Number of rows for evaluated batch
         */
        public Builder setRowCount(Long rowCount) {
            this.rowCount = rowCount;
            return this;
        }

        /**
         * Number of rows with missing value for evaluated batch
         */
        public Builder setMissingCount(Long missingCount) {
            this.missingCount = missingCount;
            return this;
        }

        /**
         * Number of rows with unexpected value for evaluated batch
         */
        public Builder setUnexpectedCount(Long unexpectedCount) {
            this.unexpectedCount = unexpectedCount;
            return this;
        }

        /**
         * Observed aggregate value for evaluated batch
         */
        public Builder setActualAggValue(Float actualAggValue) {
            this.actualAggValue = actualAggValue;
            return this;
        }

        /**
         * URL where full results are available
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Native results / properties of evaluation
         */
        public Builder setNativeResults(java.util.List<StringMapEntry> nativeResults) {
            this.nativeResults = nativeResults;
            return this;
        }

        /**
         * Error details, if type is ERROR
         */
        public Builder setError(AssertionResultError error) {
            this.error = error;
            return this;
        }


        public AssertionResult build() {
            return new AssertionResult(type, rowCount, missingCount, unexpectedCount, actualAggValue, externalUrl, nativeResults, error);
        }

    }
}
