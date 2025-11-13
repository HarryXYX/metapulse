package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional read only properties about a Data Job aka Task
 */
public class DataJobProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String externalUrl;
    private java.util.List<CustomPropertiesEntry> customProperties;

    public DataJobProperties() {
    }

    public DataJobProperties(String name, String description, String externalUrl, java.util.List<CustomPropertiesEntry> customProperties) {
        this.name = name;
        this.description = description;
        this.externalUrl = externalUrl;
        this.customProperties = customProperties;
    }

    /**
     * Job display name
     */
    public String getName() {
        return name;
    }
    /**
     * Job display name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Job description
     */
    public String getDescription() {
        return description;
    }
    /**
     * Job description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * External URL associated with the DataJob
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * External URL associated with the DataJob
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * A list of platform specific metadata tuples
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * A list of platform specific metadata tuples
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
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        return joiner.toString();
    }

    public static DataJobProperties.Builder builder() {
        return new DataJobProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String externalUrl;
        private java.util.List<CustomPropertiesEntry> customProperties;

        public Builder() {
        }

        /**
         * Job display name
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Job description
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * External URL associated with the DataJob
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * A list of platform specific metadata tuples
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public DataJobProperties build() {
            return new DataJobProperties(name, description, externalUrl, customProperties);
        }

    }
}
