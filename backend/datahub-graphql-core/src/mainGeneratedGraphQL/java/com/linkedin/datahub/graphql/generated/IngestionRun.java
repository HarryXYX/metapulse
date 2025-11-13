package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The runs associated with an Ingestion Source managed by DataHub
 */
public class IngestionRun implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String executionRequestUrn;

    public IngestionRun() {
    }

    public IngestionRun(String executionRequestUrn) {
        this.executionRequestUrn = executionRequestUrn;
    }

    /**
     * The urn of the execution request associated with the user
     */
    public String getExecutionRequestUrn() {
        return executionRequestUrn;
    }
    /**
     * The urn of the execution request associated with the user
     */
    public void setExecutionRequestUrn(String executionRequestUrn) {
        this.executionRequestUrn = executionRequestUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (executionRequestUrn != null) {
            joiner.add("executionRequestUrn: \"" + executionRequestUrn + "\"");
        }
        return joiner.toString();
    }

    public static IngestionRun.Builder builder() {
        return new IngestionRun.Builder();
    }

    public static class Builder {

        private String executionRequestUrn;

        public Builder() {
        }

        /**
         * The urn of the execution request associated with the user
         */
        public Builder setExecutionRequestUrn(String executionRequestUrn) {
            this.executionRequestUrn = executionRequestUrn;
            return this;
        }


        public IngestionRun build() {
            return new IngestionRun(executionRequestUrn);
        }

    }
}
