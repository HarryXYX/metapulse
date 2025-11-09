package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for creating an execution request input
 */
public class CreateIngestionExecutionRequestInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String ingestionSourceUrn;

    public CreateIngestionExecutionRequestInput() {
    }

    public CreateIngestionExecutionRequestInput(String ingestionSourceUrn) {
        this.ingestionSourceUrn = ingestionSourceUrn;
    }

    public String getIngestionSourceUrn() {
        return ingestionSourceUrn;
    }
    public void setIngestionSourceUrn(String ingestionSourceUrn) {
        this.ingestionSourceUrn = ingestionSourceUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (ingestionSourceUrn != null) {
            joiner.add("ingestionSourceUrn: \"" + ingestionSourceUrn + "\"");
        }
        return joiner.toString();
    }

    public static CreateIngestionExecutionRequestInput.Builder builder() {
        return new CreateIngestionExecutionRequestInput.Builder();
    }

    public static class Builder {

        private String ingestionSourceUrn;

        public Builder() {
        }

        public Builder setIngestionSourceUrn(String ingestionSourceUrn) {
            this.ingestionSourceUrn = ingestionSourceUrn;
            return this;
        }


        public CreateIngestionExecutionRequestInput build() {
            return new CreateIngestionExecutionRequestInput(ingestionSourceUrn);
        }

    }
}
