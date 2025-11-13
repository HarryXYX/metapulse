package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class MLFeatureTableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;
    private java.util.List<MLFeature> mlFeatures;
    private java.util.List<MLPrimaryKey> mlPrimaryKeys;
    private java.util.List<CustomPropertiesEntry> customProperties;

    public MLFeatureTableProperties() {
    }

    public MLFeatureTableProperties(String description, java.util.List<MLFeature> mlFeatures, java.util.List<MLPrimaryKey> mlPrimaryKeys, java.util.List<CustomPropertiesEntry> customProperties) {
        this.description = description;
        this.mlFeatures = mlFeatures;
        this.mlPrimaryKeys = mlPrimaryKeys;
        this.customProperties = customProperties;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<MLFeature> getMlFeatures() {
        return mlFeatures;
    }
    public void setMlFeatures(java.util.List<MLFeature> mlFeatures) {
        this.mlFeatures = mlFeatures;
    }

    public java.util.List<MLPrimaryKey> getMlPrimaryKeys() {
        return mlPrimaryKeys;
    }
    public void setMlPrimaryKeys(java.util.List<MLPrimaryKey> mlPrimaryKeys) {
        this.mlPrimaryKeys = mlPrimaryKeys;
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
        if (mlFeatures != null) {
            joiner.add("mlFeatures: " + mlFeatures);
        }
        if (mlPrimaryKeys != null) {
            joiner.add("mlPrimaryKeys: " + mlPrimaryKeys);
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        return joiner.toString();
    }

    public static MLFeatureTableProperties.Builder builder() {
        return new MLFeatureTableProperties.Builder();
    }

    public static class Builder {

        private String description;
        private java.util.List<MLFeature> mlFeatures;
        private java.util.List<MLPrimaryKey> mlPrimaryKeys;
        private java.util.List<CustomPropertiesEntry> customProperties;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setMlFeatures(java.util.List<MLFeature> mlFeatures) {
            this.mlFeatures = mlFeatures;
            return this;
        }

        public Builder setMlPrimaryKeys(java.util.List<MLPrimaryKey> mlPrimaryKeys) {
            this.mlPrimaryKeys = mlPrimaryKeys;
            return this;
        }

        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public MLFeatureTableProperties build() {
            return new MLFeatureTableProperties(description, mlFeatures, mlPrimaryKeys, customProperties);
        }

    }
}
