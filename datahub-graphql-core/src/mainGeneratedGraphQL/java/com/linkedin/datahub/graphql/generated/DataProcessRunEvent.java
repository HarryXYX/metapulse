package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A state change event in the data process instance lifecycle
 */
public class DataProcessRunEvent implements java.io.Serializable, TimeSeriesAspect {

    private static final long serialVersionUID = 1L;

    private DataProcessRunStatus status;
    private Integer attempt;
    private DataProcessInstanceRunResult result;
    @javax.annotation.Nonnull
    private Long timestampMillis;
    private Long durationMillis;

    public DataProcessRunEvent() {
    }

    public DataProcessRunEvent(DataProcessRunStatus status, Integer attempt, DataProcessInstanceRunResult result, Long timestampMillis, Long durationMillis) {
        this.status = status;
        this.attempt = attempt;
        this.result = result;
        this.timestampMillis = timestampMillis;
        this.durationMillis = durationMillis;
    }

    /**
     * The status of the data process instance
     */
    public DataProcessRunStatus getStatus() {
        return status;
    }
    /**
     * The status of the data process instance
     */
    public void setStatus(DataProcessRunStatus status) {
        this.status = status;
    }

    /**
     * The try number that this instance run is in
     */
    public Integer getAttempt() {
        return attempt;
    }
    /**
     * The try number that this instance run is in
     */
    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    /**
     * The result of a run
     */
    public DataProcessInstanceRunResult getResult() {
        return result;
    }
    /**
     * The result of a run
     */
    public void setResult(DataProcessInstanceRunResult result) {
        this.result = result;
    }

    /**
     * The timestamp associated with the run event in milliseconds
     */
    public Long getTimestampMillis() {
        return timestampMillis;
    }
    /**
     * The timestamp associated with the run event in milliseconds
     */
    public void setTimestampMillis(Long timestampMillis) {
        this.timestampMillis = timestampMillis;
    }

    /**
     * The duration of the run in milliseconds
     */
    public Long getDurationMillis() {
        return durationMillis;
    }
    /**
     * The duration of the run in milliseconds
     */
    public void setDurationMillis(Long durationMillis) {
        this.durationMillis = durationMillis;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (attempt != null) {
            joiner.add("attempt: " + attempt);
        }
        if (result != null) {
            joiner.add("result: " + result);
        }
        if (timestampMillis != null) {
            joiner.add("timestampMillis: " + timestampMillis);
        }
        if (durationMillis != null) {
            joiner.add("durationMillis: " + durationMillis);
        }
        return joiner.toString();
    }

    public static DataProcessRunEvent.Builder builder() {
        return new DataProcessRunEvent.Builder();
    }

    public static class Builder {

        private DataProcessRunStatus status;
        private Integer attempt;
        private DataProcessInstanceRunResult result;
        private Long timestampMillis;
        private Long durationMillis;

        public Builder() {
        }

        /**
         * The status of the data process instance
         */
        public Builder setStatus(DataProcessRunStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The try number that this instance run is in
         */
        public Builder setAttempt(Integer attempt) {
            this.attempt = attempt;
            return this;
        }

        /**
         * The result of a run
         */
        public Builder setResult(DataProcessInstanceRunResult result) {
            this.result = result;
            return this;
        }

        /**
         * The timestamp associated with the run event in milliseconds
         */
        public Builder setTimestampMillis(Long timestampMillis) {
            this.timestampMillis = timestampMillis;
            return this;
        }

        /**
         * The duration of the run in milliseconds
         */
        public Builder setDurationMillis(Long durationMillis) {
            this.durationMillis = durationMillis;
            return this;
        }


        public DataProcessRunEvent build() {
            return new DataProcessRunEvent(status, attempt, result, timestampMillis, durationMillis);
        }

    }
}
