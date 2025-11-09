package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties describing a group of related ML models
 */
public class MLModelGroupProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private AuditStamp created;
    private AuditStamp lastModified;
    private VersionTag version;
    private java.util.List<CustomPropertiesEntry> customProperties;
    private String externalUrl;
    @Deprecated
    private Long createdAt;
    private MLModelLineageInfo mlModelLineageInfo;

    public MLModelGroupProperties() {
    }

    public MLModelGroupProperties(String name, String description, AuditStamp created, AuditStamp lastModified, VersionTag version, java.util.List<CustomPropertiesEntry> customProperties, String externalUrl, Long createdAt, MLModelLineageInfo mlModelLineageInfo) {
        this.name = name;
        this.description = description;
        this.created = created;
        this.lastModified = lastModified;
        this.version = version;
        this.customProperties = customProperties;
        this.externalUrl = externalUrl;
        this.createdAt = createdAt;
        this.mlModelLineageInfo = mlModelLineageInfo;
    }

    /**
     * Display name of the model group
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the model group
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Detailed description of the model group's purpose and contents
     */
    public String getDescription() {
        return description;
    }
    /**
     * Detailed description of the model group's purpose and contents
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * When this model group was created
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * When this model group was created
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * When this model group was last modified
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * When this model group was last modified
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Version identifier for this model group
     */
    public VersionTag getVersion() {
        return version;
    }
    /**
     * Version identifier for this model group
     */
    public void setVersion(VersionTag version) {
        this.version = version;
    }

    /**
     * Custom key-value properties for the model group
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom key-value properties for the model group
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * URL to view this model group in the external system
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * URL to view this model group in the external system
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Deprecated creation timestamp
@deprecated Use the 'created' field instead
     */
    @Deprecated
    public Long getCreatedAt() {
        return createdAt;
    }
    /**
     * Deprecated creation timestamp
@deprecated Use the 'created' field instead
     */
    @Deprecated
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
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
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        if (version != null) {
            joiner.add("version: " + version);
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + createdAt);
        }
        if (mlModelLineageInfo != null) {
            joiner.add("mlModelLineageInfo: " + mlModelLineageInfo);
        }
        return joiner.toString();
    }

    public static MLModelGroupProperties.Builder builder() {
        return new MLModelGroupProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private AuditStamp created;
        private AuditStamp lastModified;
        private VersionTag version;
        private java.util.List<CustomPropertiesEntry> customProperties;
        private String externalUrl;
        private Long createdAt;
        private MLModelLineageInfo mlModelLineageInfo;

        public Builder() {
        }

        /**
         * Display name of the model group
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Detailed description of the model group's purpose and contents
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * When this model group was created
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * When this model group was last modified
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * Version identifier for this model group
         */
        public Builder setVersion(VersionTag version) {
            this.version = version;
            return this;
        }

        /**
         * Custom key-value properties for the model group
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * URL to view this model group in the external system
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Deprecated creation timestamp
@deprecated Use the 'created' field instead
         */
        @Deprecated
        public Builder setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Information related to lineage to this model group
         */
        public Builder setMlModelLineageInfo(MLModelLineageInfo mlModelLineageInfo) {
            this.mlModelLineageInfo = mlModelLineageInfo;
            return this;
        }


        public MLModelGroupProperties build() {
            return new MLModelGroupProperties(name, description, created, lastModified, version, customProperties, externalUrl, createdAt, mlModelLineageInfo);
        }

    }
}
