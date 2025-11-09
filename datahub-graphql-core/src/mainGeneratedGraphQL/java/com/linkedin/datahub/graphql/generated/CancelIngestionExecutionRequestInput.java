package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for cancelling an execution request input
 */
public class CancelIngestionExecutionRequestInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String ingestionSourceUrn;
    @javax.annotation.Nonnull
    private String executionRequestUrn;

    public CancelIngestionExecutionRequestInput() {
    }

    public CancelIngestionExecutionRequestInput(String ingestionSourceUrn, String executionRequestUrn) {
        this.ingestionSourceUrn = ingestionSourceUrn;
        this.executionRequestUrn = executionRequestUrn;
    }

    public String getIngestionSourceUrn() {
        return ingestionSourceUrn;
    }
    public void setIngestionSourceUrn(String ingestionSourceUrn) {
        this.ingestionSourceUrn = ingestionSourceUrn;
    }

    public String getExecutionRequestUrn() {
        return executionRequestUrn;
    }
    public void setExecutionRequestUrn(String executionRequestUrn) {
        this.executionRequestUrn = executionRequestUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (ingestionSourceUrn != null) {
            joiner.add("ingestionSourceUrn: \"" + ingestionSourceUrn + "\"");
        }
        if (executionRequestUrn != null) {
            joiner.add("executionRequestUrn: \"" + executionRequestUrn + "\"");
        }
        return joiner.toString();
    }

    public static CancelIngestionExecutionRequestInput.Builder builder() {
        return new CancelIngestionExecutionRequestInput.Builder();
    }

    public static class Builder {

        private String ingestionSourceUrn;
        private String executionRequestUrn;

        public Builder() {
        }

        public Builder setIngestionSourceUrn(String ingestionSourceUrn) {
            this.ingestionSourceUrn = ingestionSourceUrn;
            return this;
        }

        public Builder setExecutionRequestUrn(String executionRequestUrn) {
            this.executionRequestUrn = executionRequestUrn;
            return this;
        }


        public CancelIngestionExecutionRequestInput build() {
            return new CancelIngestionExecutionRequestInput(ingestionSourceUrn, executionRequestUrn);
        }

    }
}
