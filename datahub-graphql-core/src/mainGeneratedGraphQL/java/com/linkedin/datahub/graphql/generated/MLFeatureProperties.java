package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class MLFeatureProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;
    private MLFeatureDataType dataType;
    private VersionTag version;
    private java.util.List<Dataset> sources;
    private java.util.List<CustomPropertiesEntry> customProperties;

    public MLFeatureProperties() {
    }

    public MLFeatureProperties(String description, MLFeatureDataType dataType, VersionTag version, java.util.List<Dataset> sources, java.util.List<CustomPropertiesEntry> customProperties) {
        this.description = description;
        this.dataType = dataType;
        this.version = version;
        this.sources = sources;
        this.customProperties = customProperties;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public MLFeatureDataType getDataType() {
        return dataType;
    }
    public void setDataType(MLFeatureDataType dataType) {
        this.dataType = dataType;
    }

    public VersionTag getVersion() {
        return version;
    }
    public void setVersion(VersionTag version) {
        this.version = version;
    }

    public java.util.List<Dataset> getSources() {
        return sources;
    }
    public void setSources(java.util.List<Dataset> sources) {
        this.sources = sources;
    }

    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (dataType != null) {
            joiner.add("dataType: " + dataType);
        }
        if (version != null) {
            joiner.add("version: " + version);
        }
        if (sources != null) {
            joiner.add("sources: " + sources);
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        return joiner.toString();
    }

    public static MLFeatureProperties.Builder builder() {
        return new MLFeatureProperties.Builder();
    }

    public static class Builder {

        private String description;
        private MLFeatureDataType dataType;
        private VersionTag version;
        private java.util.List<Dataset> sources;
        private java.util.List<CustomPropertiesEntry> customProperties;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDataType(MLFeatureDataType dataType) {
            this.dataType = dataType;
            return this;
        }

        public Builder setVersion(VersionTag version) {
            this.version = version;
            return this;
        }

        public Builder setSources(java.util.List<Dataset> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public MLFeatureProperties build() {
            return new MLFeatureProperties(description, dataType, version, sources, customProperties);
        }

    }
}
