package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties about an Application
 */
public class ApplicationProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String externalUrl;
    private Integer numAssets;
    private java.util.List<CustomPropertiesEntry> customProperties;

    public ApplicationProperties() {
    }

    public ApplicationProperties(String name, String description, String externalUrl, Integer numAssets, java.util.List<CustomPropertiesEntry> customProperties) {
        this.name = name;
        this.description = description;
        this.externalUrl = externalUrl;
        this.numAssets = numAssets;
        this.customProperties = customProperties;
    }

    /**
     * Display name of the Application
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the Application
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the Application
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Application
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * External URL for the Appliation (most likely GitHub repo where Application may be managed as code)
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * External URL for the Appliation (most likely GitHub repo where Application may be managed as code)
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Number of children entities inside of the Application. This number includes soft deleted entities.
     */
    public Integer getNumAssets() {
        return numAssets;
    }
    /**
     * Number of children entities inside of the Application. This number includes soft deleted entities.
     */
    public void setNumAssets(Integer numAssets) {
        this.numAssets = numAssets;
    }

    /**
     * Custom properties of the Application
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the Application
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
        if (numAssets != null) {
            joiner.add("numAssets: " + numAssets);
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        return joiner.toString();
    }

    public static ApplicationProperties.Builder builder() {
        return new ApplicationProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String externalUrl;
        private Integer numAssets;
        private java.util.List<CustomPropertiesEntry> customProperties;

        public Builder() {
        }

        /**
         * Display name of the Application
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the Application
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * External URL for the Appliation (most likely GitHub repo where Application may be managed as code)
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Number of children entities inside of the Application. This number includes soft deleted entities.
         */
        public Builder setNumAssets(Integer numAssets) {
            this.numAssets = numAssets;
            return this;
        }

        /**
         * Custom properties of the Application
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }


        public ApplicationProperties build() {
            return new ApplicationProperties(name, description, externalUrl, numAssets, customProperties);
        }

    }
}
