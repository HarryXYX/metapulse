package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Requests for execution associated with an ingestion source
 */
public class IngestionSourceExecutionRequests implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private Integer total;
    @javax.annotation.Nonnull
    private java.util.List<ExecutionRequest> executionRequests;

    public IngestionSourceExecutionRequests() {
    }

    public IngestionSourceExecutionRequests(Integer start, Integer count, Integer total, java.util.List<ExecutionRequest> executionRequests) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.executionRequests = executionRequests;
    }

    /**
     * The starting offset of the result set
     */
    public Integer getStart() {
        return start;
    }
    /**
     * The starting offset of the result set
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * The number of results to be returned
     */
    public Integer getCount() {
        return count;
    }
    /**
     * The number of results to be returned
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * The total number of results in the result set
     */
    public Integer getTotal() {
        return total;
    }
    /**
     * The total number of results in the result set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * The execution request objects comprising the result set
     */
    public java.util.List<ExecutionRequest> getExecutionRequests() {
        return executionRequests;
    }
    /**
     * The execution request objects comprising the result set
     */
    public void setExecutionRequests(java.util.List<ExecutionRequest> executionRequests) {
        this.executionRequests = executionRequests;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (total != null) {
            joiner.add("total: " + total);
        }
        if (executionRequests != null) {
            joiner.add("executionRequests: " + executionRequests);
        }
        return joiner.toString();
    }

    public static IngestionSourceExecutionRequests.Builder builder() {
        return new IngestionSourceExecutionRequests.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private Integer total;
        private java.util.List<ExecutionRequest> executionRequests;

        public Builder() {
        }

        /**
         * The starting offset of the result set
         */
        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        /**
         * The number of results to be returned
         */
        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of results in the result set
         */
        public Builder setTotal(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * The execution request objects comprising the result set
         */
        public Builder setExecutionRequests(java.util.List<ExecutionRequest> executionRequests) {
            this.executionRequests = executionRequests;
            return this;
        }


        public IngestionSourceExecutionRequests build() {
            return new IngestionSourceExecutionRequests(start, count, total, executionRequests);
        }

    }
}
