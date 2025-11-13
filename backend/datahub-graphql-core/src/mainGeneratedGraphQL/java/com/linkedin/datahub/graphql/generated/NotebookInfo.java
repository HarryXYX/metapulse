package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional read only information about a Notebook
 */
public class NotebookInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private String description;
    private String externalUrl;
    private java.util.List<CustomPropertiesEntry> customProperties;
    private ChangeAuditStamps changeAuditStamps;

    public NotebookInfo() {
    }

    public NotebookInfo(String title, String description, String externalUrl, java.util.List<CustomPropertiesEntry> customProperties, ChangeAuditStamps changeAuditStamps) {
        this.title = title;
        this.description = description;
        this.externalUrl = externalUrl;
        this.customProperties = customProperties;
        this.changeAuditStamps = changeAuditStamps;
    }

    /**
     * Display of the Notebook
     */
    public String getTitle() {
        return title;
    }
    /**
     * Display of the Notebook
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Description of the Notebook
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Notebook
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Native platform URL of the Notebook
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Native platform URL of the Notebook
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

    /**
     * Captures information about who created/last modified/deleted this Notebook and when
     */
    public ChangeAuditStamps getChangeAuditStamps() {
        return changeAuditStamps;
    }
    /**
     * Captures information about who created/last modified/deleted this Notebook and when
     */
    public void setChangeAuditStamps(ChangeAuditStamps changeAuditStamps) {
        this.changeAuditStamps = changeAuditStamps;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
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
        if (changeAuditStamps != null) {
            joiner.add("changeAuditStamps: " + changeAuditStamps);
        }
        return joiner.toString();
    }

    public static NotebookInfo.Builder builder() {
        return new NotebookInfo.Builder();
    }

    public static class Builder {

        private String title;
        private String description;
        private String externalUrl;
        private java.util.List<CustomPropertiesEntry> customProperties;
        private ChangeAuditStamps changeAuditStamps;

        public Builder() {
        }

        /**
         * Display of the Notebook
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * Description of the Notebook
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Native platform URL of the Notebook
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

        /**
         * Captures information about who created/last modified/deleted this Notebook and when
         */
        public Builder setChangeAuditStamps(ChangeAuditStamps changeAuditStamps) {
            this.changeAuditStamps = changeAuditStamps;
            return this;
        }


        public NotebookInfo build() {
            return new NotebookInfo(title, description, externalUrl, customProperties, changeAuditStamps);
        }

    }
}
