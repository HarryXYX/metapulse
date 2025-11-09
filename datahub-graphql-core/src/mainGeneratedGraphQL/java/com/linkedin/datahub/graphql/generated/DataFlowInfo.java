package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Deprecated, use DataFlowProperties instead
Additional read only properties about a Data Flow aka Pipeline
 */
public class DataFlowInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String project;
    private String externalUrl;
    private java.util.List<CustomPropertiesEntry> customProperties;

    public DataFlowInfo() {
    }

    public DataFlowInfo(String name, String description, String project, String externalUrl, java.util.List<CustomPropertiesEntry> customProperties) {
        this.name = name;
        this.description = description;
        this.project = project;
        this.externalUrl = externalUrl;
        this.customProperties = customProperties;
    }

    /**
     * Display name of the flow
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the flow
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the flow
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the flow
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Optional project or namespace associated with the flow
     */
    public String getProject() {
        return project;
    }
    /**
     * Optional project or namespace associated with the flow
     */
    public void setProject(String project) {
        this.project = project;
    }

    /**
     * External URL associated with the DataFlow
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * External URL associated with the DataFlow
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
        if (project != null) {
            joiner.add("project: \"" + project + "\"");
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        return joiner.toString();
    }

    public static DataFlowInfo.Builder builder() {
        return new DataFlowInfo.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String project;
        private String externalUrl;
        private java.util.List<CustomPropertiesEntry> customProperties;

        public Builder() {
        }

        /**
         * Display name of the flow
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the flow
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Optional project or namespace associated with the flow
         */
        public Builder setProject(String project) {
            this.project = project;
            return this;
        }

        /**
         * External URL associated with the DataFlow
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


        public DataFlowInfo build() {
            return new DataFlowInfo(name, description, project, externalUrl, customProperties);
        }

    }
}
