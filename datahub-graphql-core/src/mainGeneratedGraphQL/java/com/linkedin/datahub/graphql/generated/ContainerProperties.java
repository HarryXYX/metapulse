package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Read-only properties that originate in the source data platform
 */
public class ContainerProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private java.util.List<CustomPropertiesEntry> customProperties;
    private String externalUrl;
    private String qualifiedName;

    public ContainerProperties() {
    }

    public ContainerProperties(String name, String description, java.util.List<CustomPropertiesEntry> customProperties, String externalUrl, String qualifiedName) {
        this.name = name;
        this.description = description;
        this.customProperties = customProperties;
        this.externalUrl = externalUrl;
        this.qualifiedName = qualifiedName;
    }

    /**
     * Display name of the Container
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the Container
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * System description of the Container
     */
    public String getDescription() {
        return description;
    }
    /**
     * System description of the Container
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Custom properties of the Container
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the Container
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * Native platform URL of the Container
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Native platform URL of the Container
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Fully-qualified name of the Container
     */
    public String getQualifiedName() {
        return qualifiedName;
    }
    /**
     * Fully-qualified name of the Container
     */
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
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
        if (qualifiedName != null) {
            joiner.add("qualifiedName: \"" + qualifiedName + "\"");
        }
        return joiner.toString();
    }

    public static ContainerProperties.Builder builder() {
        return new ContainerProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<CustomPropertiesEntry> customProperties;
        private String externalUrl;
        private String qualifiedName;

        public Builder() {
        }

        /**
         * Display name of the Container
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * System description of the Container
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Custom properties of the Container
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * Native platform URL of the Container
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Fully-qualified name of the Container
         */
        public Builder setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }


        public ContainerProperties build() {
            return new ContainerProperties(name, description, customProperties, externalUrl, qualifiedName);
        }

    }
}
