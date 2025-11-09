package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A flexible carrier for structured results of an execution request.
 */
public class StructuredReport implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String type;
    @javax.annotation.Nonnull
    private String serializedValue;
    @javax.annotation.Nonnull
    private String contentType;

    public StructuredReport() {
    }

    public StructuredReport(String type, String serializedValue, String contentType) {
        this.type = type;
        this.serializedValue = serializedValue;
        this.contentType = contentType;
    }

    /**
     * The type of the structured report. (e.g. INGESTION_REPORT, TEST_CONNECTION_REPORT, etc.)
     */
    public String getType() {
        return type;
    }
    /**
     * The type of the structured report. (e.g. INGESTION_REPORT, TEST_CONNECTION_REPORT, etc.)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The serialized value of the structured report
     */
    public String getSerializedValue() {
        return serializedValue;
    }
    /**
     * The serialized value of the structured report
     */
    public void setSerializedValue(String serializedValue) {
        this.serializedValue = serializedValue;
    }

    /**
     * The content-type of the serialized value (e.g. application/json, application/json;gzip etc.)
     */
    public String getContentType() {
        return contentType;
    }
    /**
     * The content-type of the serialized value (e.g. application/json, application/json;gzip etc.)
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (serializedValue != null) {
            joiner.add("serializedValue: \"" + serializedValue + "\"");
        }
        if (contentType != null) {
            joiner.add("contentType: \"" + contentType + "\"");
        }
        return joiner.toString();
    }

    public static StructuredReport.Builder builder() {
        return new StructuredReport.Builder();
    }

    public static class Builder {

        private String type;
        private String serializedValue;
        private String contentType;

        public Builder() {
        }

        /**
         * The type of the structured report. (e.g. INGESTION_REPORT, TEST_CONNECTION_REPORT, etc.)
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The serialized value of the structured report
         */
        public Builder setSerializedValue(String serializedValue) {
            this.serializedValue = serializedValue;
            return this;
        }

        /**
         * The content-type of the serialized value (e.g. application/json, application/json;gzip etc.)
         */
        public Builder setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }


        public StructuredReport build() {
            return new StructuredReport(type, serializedValue, contentType);
        }

    }
}
