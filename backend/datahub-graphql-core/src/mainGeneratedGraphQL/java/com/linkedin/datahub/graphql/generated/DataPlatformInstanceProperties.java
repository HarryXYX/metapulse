package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional read only properties about a DataPlatformInstance
 */
public class DataPlatformInstanceProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private java.util.List<CustomPropertiesEntry> customProperties;
    private String externalUrl;

    public DataPlatformInstanceProperties() {
    }

    public DataPlatformInstanceProperties(String name, String description, java.util.List<CustomPropertiesEntry> customProperties, String externalUrl) {
        this.name = name;
        this.description = description;
        this.customProperties = customProperties;
        this.externalUrl = externalUrl;
    }

    /**
     * The name of the data platform instance used in display
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the data platform instance used in display
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Read only technical description for the data platform instance
     */
    public String getDescription() {
        return description;
    }
    /**
     * Read only technical description for the data platform instance
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Custom properties of the data platform instance
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the data platform instance
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * External URL associated with the data platform instance
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * External URL associated with the data platform instance
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
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
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        return joiner.toString();
    }

    public static DataPlatformInstanceProperties.Builder builder() {
        return new DataPlatformInstanceProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<CustomPropertiesEntry> customProperties;
        private String externalUrl;

        public Builder() {
        }

        /**
         * The name of the data platform instance used in display
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Read only technical description for the data platform instance
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Custom properties of the data platform instance
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * External URL associated with the data platform instance
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }


        public DataPlatformInstanceProperties build() {
            return new DataPlatformInstanceProperties(name, description, customProperties, externalUrl);
        }

    }
}
