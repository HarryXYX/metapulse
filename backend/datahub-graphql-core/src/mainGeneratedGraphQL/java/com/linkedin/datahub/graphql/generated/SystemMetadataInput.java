package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class SystemMetadataInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Long lastObserved;
    private String runId;
    private java.util.List<StringMapEntryInput> properties;

    public SystemMetadataInput() {
    }

    public SystemMetadataInput(Long lastObserved, String runId, java.util.List<StringMapEntryInput> properties) {
        this.lastObserved = lastObserved;
        this.runId = runId;
        this.properties = properties;
    }

    public Long getLastObserved() {
        return lastObserved;
    }
    public void setLastObserved(Long lastObserved) {
        this.lastObserved = lastObserved;
    }

    public String getRunId() {
        return runId;
    }
    public void setRunId(String runId) {
        this.runId = runId;
    }

    public java.util.List<StringMapEntryInput> getProperties() {
        return properties;
    }
    public void setProperties(java.util.List<StringMapEntryInput> properties) {
        this.properties = properties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (lastObserved != null) {
            joiner.add("lastObserved: " + lastObserved);
        }
        if (runId != null) {
            joiner.add("runId: \"" + runId + "\"");
        }
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        return joiner.toString();
    }

    public static SystemMetadataInput.Builder builder() {
        return new SystemMetadataInput.Builder();
    }

    public static class Builder {

        private Long lastObserved;
        private String runId;
        private java.util.List<StringMapEntryInput> properties;

        public Builder() {
        }

        public Builder setLastObserved(Long lastObserved) {
            this.lastObserved = lastObserved;
            return this;
        }

        public Builder setRunId(String runId) {
            this.runId = runId;
            return this;
        }

        public Builder setProperties(java.util.List<StringMapEntryInput> properties) {
            this.properties = properties;
            return this;
        }


        public SystemMetadataInput build() {
            return new SystemMetadataInput(lastObserved, runId, properties);
        }

    }
}
