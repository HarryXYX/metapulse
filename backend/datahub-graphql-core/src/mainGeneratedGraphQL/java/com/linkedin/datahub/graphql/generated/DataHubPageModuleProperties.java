package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The main properties of a DataHub page module
 */
public class DataHubPageModuleProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private DataHubPageModuleType type;
    @javax.annotation.Nonnull
    private DataHubPageModuleVisibility visibility;
    @javax.annotation.Nonnull
    private DataHubPageModuleParams params;
    @javax.annotation.Nonnull
    private ResolvedAuditStamp created;
    @javax.annotation.Nonnull
    private ResolvedAuditStamp lastModified;

    public DataHubPageModuleProperties() {
    }

    public DataHubPageModuleProperties(String name, DataHubPageModuleType type, DataHubPageModuleVisibility visibility, DataHubPageModuleParams params, ResolvedAuditStamp created, ResolvedAuditStamp lastModified) {
        this.name = name;
        this.type = type;
        this.visibility = visibility;
        this.params = params;
        this.created = created;
        this.lastModified = lastModified;
    }

    /**
     * The display name of this module
     */
    public String getName() {
        return name;
    }
    /**
     * The display name of this module
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Info about the surface area of the product that this module is deployed in
     */
    public DataHubPageModuleType getType() {
        return type;
    }
    /**
     * Info about the surface area of the product that this module is deployed in
     */
    public void setType(DataHubPageModuleType type) {
        this.type = type;
    }

    /**
     * Info about the visibility of this module
     */
    public DataHubPageModuleVisibility getVisibility() {
        return visibility;
    }
    /**
     * Info about the visibility of this module
     */
    public void setVisibility(DataHubPageModuleVisibility visibility) {
        this.visibility = visibility;
    }

    /**
     * The specific parameters stored for this module
     */
    public DataHubPageModuleParams getParams() {
        return params;
    }
    /**
     * The specific parameters stored for this module
     */
    public void setParams(DataHubPageModuleParams params) {
        this.params = params;
    }

    /**
     * Audit stamp for when and by whom this module was created
     */
    public ResolvedAuditStamp getCreated() {
        return created;
    }
    /**
     * Audit stamp for when and by whom this module was created
     */
    public void setCreated(ResolvedAuditStamp created) {
        this.created = created;
    }

    /**
     * Audit stamp for when and by whom this module was last updated
     */
    public ResolvedAuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * Audit stamp for when and by whom this module was last updated
     */
    public void setLastModified(ResolvedAuditStamp lastModified) {
        this.lastModified = lastModified;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (visibility != null) {
            joiner.add("visibility: " + visibility);
        }
        if (params != null) {
            joiner.add("params: " + params);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        return joiner.toString();
    }

    public static DataHubPageModuleProperties.Builder builder() {
        return new DataHubPageModuleProperties.Builder();
    }

    public static class Builder {

        private String name;
        private DataHubPageModuleType type;
        private DataHubPageModuleVisibility visibility;
        private DataHubPageModuleParams params;
        private ResolvedAuditStamp created;
        private ResolvedAuditStamp lastModified;

        public Builder() {
        }

        /**
         * The display name of this module
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Info about the surface area of the product that this module is deployed in
         */
        public Builder setType(DataHubPageModuleType type) {
            this.type = type;
            return this;
        }

        /**
         * Info about the visibility of this module
         */
        public Builder setVisibility(DataHubPageModuleVisibility visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * The specific parameters stored for this module
         */
        public Builder setParams(DataHubPageModuleParams params) {
            this.params = params;
            return this;
        }

        /**
         * Audit stamp for when and by whom this module was created
         */
        public Builder setCreated(ResolvedAuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * Audit stamp for when and by whom this module was last updated
         */
        public Builder setLastModified(ResolvedAuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }


        public DataHubPageModuleProperties build() {
            return new DataHubPageModuleProperties(name, type, visibility, params, created, lastModified);
        }

    }
}
