package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties about a domain
 */
public class DataProductProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String externalUrl;
    private Integer numAssets;
    private java.util.List<CustomPropertiesEntry> customProperties;
    private ResolvedAuditStamp createdOn;

    public DataProductProperties() {
    }

    public DataProductProperties(String name, String description, String externalUrl, Integer numAssets, java.util.List<CustomPropertiesEntry> customProperties, ResolvedAuditStamp createdOn) {
        this.name = name;
        this.description = description;
        this.externalUrl = externalUrl;
        this.numAssets = numAssets;
        this.customProperties = customProperties;
        this.createdOn = createdOn;
    }

    /**
     * Display name of the Data Product
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the Data Product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the Data Product
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Data Product
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * External URL for the DataProduct (most likely GitHub repo where Data Products are managed as code)
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * External URL for the DataProduct (most likely GitHub repo where Data Products are managed as code)
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Number of children entities inside of the Data Product. This number includes soft deleted entities.
     */
    public Integer getNumAssets() {
        return numAssets;
    }
    /**
     * Number of children entities inside of the Data Product. This number includes soft deleted entities.
     */
    public void setNumAssets(Integer numAssets) {
        this.numAssets = numAssets;
    }

    /**
     * Custom properties of the Data Product
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * Custom properties of the Data Product
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * A Resolved Audit Stamp corresponding to the creation of this resource
     */
    public ResolvedAuditStamp getCreatedOn() {
        return createdOn;
    }
    /**
     * A Resolved Audit Stamp corresponding to the creation of this resource
     */
    public void setCreatedOn(ResolvedAuditStamp createdOn) {
        this.createdOn = createdOn;
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
        if (createdOn != null) {
            joiner.add("createdOn: " + createdOn);
        }
        return joiner.toString();
    }

    public static DataProductProperties.Builder builder() {
        return new DataProductProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String externalUrl;
        private Integer numAssets;
        private java.util.List<CustomPropertiesEntry> customProperties;
        private ResolvedAuditStamp createdOn;

        public Builder() {
        }

        /**
         * Display name of the Data Product
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the Data Product
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * External URL for the DataProduct (most likely GitHub repo where Data Products are managed as code)
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Number of children entities inside of the Data Product. This number includes soft deleted entities.
         */
        public Builder setNumAssets(Integer numAssets) {
            this.numAssets = numAssets;
            return this;
        }

        /**
         * Custom properties of the Data Product
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * A Resolved Audit Stamp corresponding to the creation of this resource
         */
        public Builder setCreatedOn(ResolvedAuditStamp createdOn) {
            this.createdOn = createdOn;
            return this;
        }


        public DataProductProperties build() {
            return new DataProductProperties(name, description, externalUrl, numAssets, customProperties, createdOn);
        }

    }
}
