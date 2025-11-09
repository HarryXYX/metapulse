package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Data Process instances that match the provided query
 */
public class DataProcessInstanceResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer count;
    private Integer start;
    private Integer total;
    private java.util.List<DataProcessInstance> runs;

    public DataProcessInstanceResult() {
    }

    public DataProcessInstanceResult(Integer count, Integer start, Integer total, java.util.List<DataProcessInstance> runs) {
        this.count = count;
        this.start = start;
        this.total = total;
        this.runs = runs;
    }

    /**
     * The number of entities to include in result set
     */
    public Integer getCount() {
        return count;
    }
    /**
     * The number of entities to include in result set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * The offset of the result set
     */
    public Integer getStart() {
        return start;
    }
    /**
     * The offset of the result set
     */
    public void setStart(Integer start) {
        this.start = start;
    }

    /**
     * The total number of run events returned
     */
    public Integer getTotal() {
        return total;
    }
    /**
     * The total number of run events returned
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * The data process instances that produced or consumed the entity
     */
    public java.util.List<DataProcessInstance> getRuns() {
        return runs;
    }
    /**
     * The data process instances that produced or consumed the entity
     */
    public void setRuns(java.util.List<DataProcessInstance> runs) {
        this.runs = runs;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (total != null) {
            joiner.add("total: " + total);
        }
        if (runs != null) {
            joiner.add("runs: " + runs);
        }
        return joiner.toString();
    }

    public static DataProcessInstanceResult.Builder builder() {
        return new DataProcessInstanceResult.Builder();
    }

    public static class Builder {

        private Integer count;
        private Integer start;
        private Integer total;
        private java.util.List<DataProcessInstance> runs;

        public Builder() {
        }

        /**
         * The number of entities to include in result set
         */
        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The offset of the result set
         */
        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        /**
         * The total number of run events returned
         */
        public Builder setTotal(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * The data process instances that produced or consumed the entity
         */
        public Builder setRuns(java.util.List<DataProcessInstance> runs) {
            this.runs = runs;
            return this;
        }


        public DataProcessInstanceResult build() {
            return new DataProcessInstanceResult(count, start, total, runs);
        }

    }
}
