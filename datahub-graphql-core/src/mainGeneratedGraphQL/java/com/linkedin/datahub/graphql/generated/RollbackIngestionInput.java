package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for rolling back an ingestion execution
 */
public class RollbackIngestionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String runId;

    public RollbackIngestionInput() {
    }

    public RollbackIngestionInput(String runId) {
        this.runId = runId;
    }

    public String getRunId() {
        return runId;
    }
    public void setRunId(String runId) {
        this.runId = runId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (runId != null) {
            joiner.add("runId: \"" + runId + "\"");
        }
        return joiner.toString();
    }

    public static RollbackIngestionInput.Builder builder() {
        return new RollbackIngestionInput.Builder();
    }

    public static class Builder {

        private String runId;

        public Builder() {
        }

        public Builder setRunId(String runId) {
            this.runId = runId;
            return this;
        }


        public RollbackIngestionInput build() {
            return new RollbackIngestionInput(runId);
        }

    }
}
