package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class MLModelProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private AuditStamp lastModified;
    private String version;
    private String type;
    private HyperParameterMap hyperParameters;
    private java.util.List<MLHyperParam> hyperParams;
    private java.util.List<MLMetric> trainingMetrics;
    private java.util.List<String> mlFeatures;
    private java.util.List<String> tags;
    private java.util.List<MLModelGroup> groups;
    private java.util.List<CustomPropertiesEntry> customProperties;
    private String externalUrl;
    private AuditStamp created;
    @Deprecated
    private Long date;
    private MLModelLineageInfo mlModelLineageInfo;

    public MLModelProperties() {
    }

    public MLModelProperties(String name, String description, AuditStamp lastModified, String version, String type, HyperParameterMap hyperParameters, java.util.List<MLHyperParam> hyperParams, java.util.List<MLMetric> trainingMetrics, java.util.List<String> mlFeatures, java.util.List<String> tags, java.util.List<MLModelGroup> groups, java.util.List<CustomPropertiesEntry> customProperties, String externalUrl, AuditStamp created, Long date, MLModelLineageInfo mlModelLineageInfo) {
        this.name = name;
        this.description = description;
        this.lastModified = lastModified;
        this.version = version;
        this.type = type;
        this.hyperParameters = hyperParameters;
        this.hyperParams = hyperParams;
        this.trainingMetrics = trainingMetrics;
        this.mlFeatures = mlFeatures;
        this.tags = tags;
        this.groups = groups;
        this.customProperties = customProperties;
        this.externalUrl = externalUrl;
        this.created = created;
        this.date = date;
        this.mlModelLineageInfo = mlModelLineageInfo;
    }

    /**
     * The display name of the model used in the UI
     */
    public String getName() {
        return name;
    }
    /**
     * The display name of the model used in the UI
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Detailed description of the model's purpose and characteristics
     */
    public String getDescription() {
        return description;
    }
    /**
     * Detailed description of the model's purpose and characteristics
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * When the model was last modified
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * When the model was last modified
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Version identifier for this model
     */
    public String getVersion() {
        return version;
    }
    /**
     * Version identifier for this model
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * The type/category of ML model (e.g. classification, regression)
     */
    public String getType() {
        return type;
    }
    /**
     * The type/category of ML model (e.g. classification, regression)
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Mapping of hyperparameter configurations
     */
    public HyperParameterMap getHyperParameters() {
        return hyperParameters;
    }
    /**
     * Mapping of hyperparameter configurations
     */
    public void setHyperParameters(HyperParameterMap hyperParameters) {
        this.hyperParameters = hyperParameters;
    }

    /**
     * List of hyperparameter settings used to train this model
     */
    public java.util.List<MLHyperParam> getHyperParams() {
        return hyperParams;
    }
    /**
     * List of hyperparameter settings used to train this model
     */
    public void setHyperParams(java.util.List<MLHyperParam> hyperParams) {
        this.hyperParams = hyperParams;
    }

    /**
     * Performance metrics from model training
     */
    public java.util.List<MLMetric> getTrainingMetrics() {
        return trainingMetrics;
    }
    /**
     * Performance metrics from model training
     */
    public void setTrainingMetrics(java.util.List<MLMetric> trainingMetrics) {
        this.trainingMetrics = trainingMetrics;
    }

    /**
     * Names of ML features used by this model
     */
    public java.util.List<String> getMlFeatures() {
        return mlFeatures;
    }
    /**
     * Names of ML features used by this model
     */
    public void setMlFeatures(java.util.List<String> mlFeatures) {
        this.mlFeatures = mlFeatures;
    }

    /**
     * Tags for categorizing and searching models
     */
    public java.util.List<String> getTags() {
        return tags;
    }
    /**
     * Tags for categorizing and searching models
     */
    public void setTags(java.util.List<String> tags) {
        this.tags = tags;
    }

    /**
     * Model groups this model belongs to
     */
    public java.util.List<MLModelGroup> getGroups() {
        return groups;
    }
    /**
     * Model groups this model belongs to
     */
    public void setGroups(java.util.List<MLModelGroup> groups) {
        this.groups = groups;
    }

    /**
     * Additional custom properties specific to this model
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Additional custom properties specific to this model
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * URL to view this model in external system
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * URL to view this model in external system
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * When this model was created
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * When this model was created
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * Deprecated timestamp for model creation
@deprecated Use 'created' field instead
     */
    @Deprecated
    public Long getDate() {
        return date;
    }
    /**
     * Deprecated timestamp for model creation
@deprecated Use 'created' field instead
     */
    @Deprecated
    public void setDate(Long date) {
        this.date = date;
    }

    /**
     * Information related to lineage to this model group
     */
    public MLModelLineageInfo getMlModelLineageInfo() {
        return mlModelLineageInfo;
    }
    /**
     * Information related to lineage to this model group
     */
    public void setMlModelLineageInfo(MLModelLineageInfo mlModelLineageInfo) {
        this.mlModelLineageInfo = mlModelLineageInfo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        if (version != null) {
            joiner.add("version: \"" + version + "\"");
        }
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (hyperParameters != null) {
            joiner.add("hyperParameters: " + hyperParameters);
        }
        if (hyperParams != null) {
            joiner.add("hyperParams: " + hyperParams);
        }
        if (trainingMetrics != null) {
            joiner.add("trainingMetrics: " + trainingMetrics);
        }
        if (mlFeatures != null) {
            joiner.add("mlFeatures: " + mlFeatures);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (groups != null) {
            joiner.add("groups: " + groups);
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (date != null) {
            joiner.add("date: " + date);
        }
        if (mlModelLineageInfo != null) {
            joiner.add("mlModelLineageInfo: " + mlModelLineageInfo);
        }
        return joiner.toString();
    }

    public static MLModelProperties.Builder builder() {
        return new MLModelProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private AuditStamp lastModified;
        private String version;
        private String type;
        private HyperParameterMap hyperParameters;
        private java.util.List<MLHyperParam> hyperParams;
        private java.util.List<MLMetric> trainingMetrics;
        private java.util.List<String> mlFeatures;
        private java.util.List<String> tags;
        private java.util.List<MLModelGroup> groups;
        private java.util.List<CustomPropertiesEntry> customProperties;
        private String externalUrl;
        private AuditStamp created;
        private Long date;
        private MLModelLineageInfo mlModelLineageInfo;

        public Builder() {
        }

        /**
         * The display name of the model used in the UI
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Detailed description of the model's purpose and characteristics
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * When the model was last modified
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * Version identifier for this model
         */
        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        /**
         * The type/category of ML model (e.g. classification, regression)
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * Mapping of hyperparameter configurations
         */
        public Builder setHyperParameters(HyperParameterMap hyperParameters) {
            this.hyperParameters = hyperParameters;
            return this;
        }

        /**
         * List of hyperparameter settings used to train this model
         */
        public Builder setHyperParams(java.util.List<MLHyperParam> hyperParams) {
            this.hyperParams = hyperParams;
            return this;
        }

        /**
         * Performance metrics from model training
         */
        public Builder setTrainingMetrics(java.util.List<MLMetric> trainingMetrics) {
            this.trainingMetrics = trainingMetrics;
            return this;
        }

        /**
         * Names of ML features used by this model
         */
        public Builder setMlFeatures(java.util.List<String> mlFeatures) {
            this.mlFeatures = mlFeatures;
            return this;
        }

        /**
         * Tags for categorizing and searching models
         */
        public Builder setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Model groups this model belongs to
         */
        public Builder setGroups(java.util.List<MLModelGroup> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Additional custom properties specific to this model
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * URL to view this model in external system
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * When this model was created
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * Deprecated timestamp for model creation
@deprecated Use 'created' field instead
         */
        @Deprecated
        public Builder setDate(Long date) {
            this.date = date;
            return this;
        }

        /**
         * Information related to lineage to this model group
         */
        public Builder setMlModelLineageInfo(MLModelLineageInfo mlModelLineageInfo) {
            this.mlModelLineageInfo = mlModelLineageInfo;
            return this;
        }


        public MLModelProperties build() {
            return new MLModelProperties(name, description, lastModified, version, type, hyperParameters, hyperParams, trainingMetrics, mlFeatures, tags, groups, customProperties, externalUrl, created, date, mlModelLineageInfo);
        }

    }
}
