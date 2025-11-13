package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about the source of an execution request
 */
public class ExecutionRequestSource implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String type;
    private String ingestionSource;

    public ExecutionRequestSource() {
    }

    public ExecutionRequestSource(String type, String ingestionSource) {
        this.type = type;
        this.ingestionSource = ingestionSource;
    }

    /**
     * The type of the source, e.g. SCHEDULED_INGESTION_SOURCE
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the source, e.g. SCHEDULED_INGESTION_SOURCE
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The urn of the ingestion source, if applicable
     */
    public String getIngestionSource() {
        return ingestionSource;
    }
    /**
     * The urn of the ingestion source, if applicable
     */
    public void setIngestionSource(String ingestionSource) {
        this.ingestionSource = ingestionSource;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (ingestionSource != null) {
            joiner.add("ingestionSource: \"" + ingestionSource + "\"");
        }
        return joiner.toString();
    }

    public static ExecutionRequestSource.Builder builder() {
        return new ExecutionRequestSource.Builder();
    }

    public static class Builder {

        private String type;
        private String ingestionSource;

        public Builder() {
        }

        /**
         * The type of the source, e.g. SCHEDULED_INGESTION_SOURCE
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The urn of the ingestion source, if applicable
         */
        public Builder setIngestionSource(String ingestionSource) {
            this.ingestionSource = ingestionSource;
            return this;
        }


        public ExecutionRequestSource build() {
            return new ExecutionRequestSource(type, ingestionSource);
        }

    }
}
