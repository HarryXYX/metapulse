package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for reporting result of the assertion
 */
public class AssertionResultInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Long timestampMillis;
    @javax.annotation.Nonnull
    private AssertionResultType type;
    private java.util.List<StringMapEntryInput> properties;
    private String externalUrl;
    private AssertionResultErrorInput error;

    public AssertionResultInput() {
    }

    public AssertionResultInput(Long timestampMillis, AssertionResultType type, java.util.List<StringMapEntryInput> properties, String externalUrl, AssertionResultErrorInput error) {
        this.timestampMillis = timestampMillis;
        this.type = type;
        this.properties = properties;
        this.externalUrl = externalUrl;
        this.error = error;
    }

    public Long getTimestampMillis() {
        return timestampMillis;
    }
    public void setTimestampMillis(Long timestampMillis) {
        this.timestampMillis = timestampMillis;
    }

    public AssertionResultType getType() {
        return type;
    }
    public void setType(AssertionResultType type) {
        this.type = type;
    }

    public java.util.List<StringMapEntryInput> getProperties() {
        return properties;
    }
    public void setProperties(java.util.List<StringMapEntryInput> properties) {
        this.properties = properties;
    }

    public String getExternalUrl() {
        return externalUrl;
    }
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public AssertionResultErrorInput getError() {
        return error;
    }
    public void setError(AssertionResultErrorInput error) {
        this.error = error;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (timestampMillis != null) {
            joiner.add("timestampMillis: " + timestampMillis);
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (error != null) {
            joiner.add("error: " + error);
        }
        return joiner.toString();
    }

    public static AssertionResultInput.Builder builder() {
        return new AssertionResultInput.Builder();
    }

    public static class Builder {

        private Long timestampMillis;
        private AssertionResultType type;
        private java.util.List<StringMapEntryInput> properties;
        private String externalUrl;
        private AssertionResultErrorInput error;

        public Builder() {
        }

        public Builder setTimestampMillis(Long timestampMillis) {
            this.timestampMillis = timestampMillis;
            return this;
        }

        public Builder setType(AssertionResultType type) {
            this.type = type;
            return this;
        }

        public Builder setProperties(java.util.List<StringMapEntryInput> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        public Builder setError(AssertionResultErrorInput error) {
            this.error = error;
            return this;
        }


        public AssertionResultInput build() {
            return new AssertionResultInput(timestampMillis, type, properties, externalUrl, error);
        }

    }
}
