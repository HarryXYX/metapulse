package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties describing a data process instance's execution metadata
 */
public class DataProcessInstanceProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String externalUrl;
    @javax.annotation.Nonnull
    private AuditStamp created;
    private java.util.List<CustomPropertiesEntry> customProperties;

    public DataProcessInstanceProperties() {
    }

    public DataProcessInstanceProperties(String name, String externalUrl, AuditStamp created, java.util.List<CustomPropertiesEntry> customProperties) {
        this.name = name;
        this.externalUrl = externalUrl;
        this.created = created;
        this.customProperties = customProperties;
    }

    /**
     * The display name of this process instance
     */
    public String getName() {
        return name;
    }
    /**
     * The display name of this process instance
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * URL to view this process instance in the external system
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * URL to view this process instance in the external system
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * When this process instance was created
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * When this process instance was created
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * Additional custom properties specific to this process instance
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Additional custom properties specific to this process instance
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        return joiner.toString();
    }

    public static DataProcessInstanceProperties.Builder builder() {
        return new DataProcessInstanceProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String externalUrl;
        private AuditStamp created;
        private java.util.List<CustomPropertiesEntry> customProperties;

        public Builder() {
        }

        /**
         * The display name of this process instance
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * URL to view this process instance in the external system
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * When this process instance was created
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * Additional custom properties specific to this process instance
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public DataProcessInstanceProperties build() {
            return new DataProcessInstanceProperties(name, externalUrl, created, customProperties);
        }

    }
}
