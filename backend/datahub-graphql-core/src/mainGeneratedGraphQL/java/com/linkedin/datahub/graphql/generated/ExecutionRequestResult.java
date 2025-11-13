package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result of an ExecutionRequest
 */
public class ExecutionRequestResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String status;
    private Long startTimeMs;
    private Long durationMs;
    private String report;
    private StructuredReport structuredReport;

    public ExecutionRequestResult() {
    }

    public ExecutionRequestResult(String status, Long startTimeMs, Long durationMs, String report, StructuredReport structuredReport) {
        this.status = status;
        this.startTimeMs = startTimeMs;
        this.durationMs = durationMs;
        this.report = report;
        this.structuredReport = structuredReport;
    }

    /**
     * The result of the request, e.g. either SUCCEEDED or FAILED
     */
    public String getStatus() {
        return status;
    }
    /**
     * The result of the request, e.g. either SUCCEEDED or FAILED
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Time at which the task began
     */
    public Long getStartTimeMs() {
        return startTimeMs;
    }
    /**
     * Time at which the task began
     */
    public void setStartTimeMs(Long startTimeMs) {
        this.startTimeMs = startTimeMs;
    }

    /**
     * Duration of the task
     */
    public Long getDurationMs() {
        return durationMs;
    }
    /**
     * Duration of the task
     */
    public void setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
    }

    /**
     * A report about the ingestion run
     */
    public String getReport() {
        return report;
    }
    /**
     * A report about the ingestion run
     */
    public void setReport(String report) {
        this.report = report;
    }

    /**
     * A structured report for this Execution Request
     */
    public StructuredReport getStructuredReport() {
        return structuredReport;
    }
    /**
     * A structured report for this Execution Request
     */
    public void setStructuredReport(StructuredReport structuredReport) {
        this.structuredReport = structuredReport;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (status != null) {
            joiner.add("status: \"" + status + "\"");
        }
        if (startTimeMs != null) {
            joiner.add("startTimeMs: " + startTimeMs);
        }
        if (durationMs != null) {
            joiner.add("durationMs: " + durationMs);
        }
        if (report != null) {
            joiner.add("report: \"" + report + "\"");
        }
        if (structuredReport != null) {
            joiner.add("structuredReport: " + structuredReport);
        }
        return joiner.toString();
    }

    public static ExecutionRequestResult.Builder builder() {
        return new ExecutionRequestResult.Builder();
    }

    public static class Builder {

        private String status;
        private Long startTimeMs;
        private Long durationMs;
        private String report;
        private StructuredReport structuredReport;

        public Builder() {
        }

        /**
         * The result of the request, e.g. either SUCCEEDED or FAILED
         */
        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        /**
         * Time at which the task began
         */
        public Builder setStartTimeMs(Long startTimeMs) {
            this.startTimeMs = startTimeMs;
            return this;
        }

        /**
         * Duration of the task
         */
        public Builder setDurationMs(Long durationMs) {
            this.durationMs = durationMs;
            return this;
        }

        /**
         * A report about the ingestion run
         */
        public Builder setReport(String report) {
            this.report = report;
            return this;
        }

        /**
         * A structured report for this Execution Request
         */
        public Builder setStructuredReport(StructuredReport structuredReport) {
            this.structuredReport = structuredReport;
            return this;
        }


        public ExecutionRequestResult build() {
            return new ExecutionRequestResult(status, startTimeMs, durationMs, report, structuredReport);
        }

    }
}
