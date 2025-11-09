package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Deprecated, use DashboardProperties instead
Additional read only info about a Dashboard
 */
public class DashboardInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    @Deprecated
    @javax.annotation.Nonnull
    private java.util.List<Chart> charts;
    private String externalUrl;
    private AccessLevel access;
    private java.util.List<CustomPropertiesEntry> customProperties;
    private Long lastRefreshed;
    @javax.annotation.Nonnull
    private AuditStamp created;
    @javax.annotation.Nonnull
    private AuditStamp lastModified;
    private AuditStamp deleted;

    public DashboardInfo() {
    }

    public DashboardInfo(String name, String description, java.util.List<Chart> charts, String externalUrl, AccessLevel access, java.util.List<CustomPropertiesEntry> customProperties, Long lastRefreshed, AuditStamp created, AuditStamp lastModified, AuditStamp deleted) {
        this.name = name;
        this.description = description;
        this.charts = charts;
        this.externalUrl = externalUrl;
        this.access = access;
        this.customProperties = customProperties;
        this.lastRefreshed = lastRefreshed;
        this.created = created;
        this.lastModified = lastModified;
        this.deleted = deleted;
    }

    /**
     * Display of the dashboard
     */
    public String getName() {
        return name;
    }
    /**
     * Display of the dashboard
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the dashboard
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the dashboard
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Deprecated, use relationship Contains instead
Charts that comprise the dashboard
     */
    @Deprecated
    public java.util.List<Chart> getCharts() {
        return charts;
    }
    /**
     * Deprecated, use relationship Contains instead
Charts that comprise the dashboard
     */
    @Deprecated
    public void setCharts(java.util.List<Chart> charts) {
        this.charts = charts;
    }

    /**
     * Native platform URL of the dashboard
     */
    public String getExternalUrl() {
        return externalUrl;
    }
    /**
     * Native platform URL of the dashboard
     */
    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    /**
     * Access level for the dashboard
Note that this will soon be deprecated for low usage
     */
    public AccessLevel getAccess() {
        return access;
    }
    /**
     * Access level for the dashboard
Note that this will soon be deprecated for low usage
     */
    public void setAccess(AccessLevel access) {
        this.access = access;
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
     * The time when this dashboard last refreshed
     */
    public Long getLastRefreshed() {
        return lastRefreshed;
    }
    /**
     * The time when this dashboard last refreshed
     */
    public void setLastRefreshed(Long lastRefreshed) {
        this.lastRefreshed = lastRefreshed;
    }

    /**
     * An AuditStamp corresponding to the creation of this dashboard
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An AuditStamp corresponding to the creation of this dashboard
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * An AuditStamp corresponding to the modification of this dashboard
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * An AuditStamp corresponding to the modification of this dashboard
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * An optional AuditStamp corresponding to the deletion of this dashboard
     */
    public AuditStamp getDeleted() {
        return deleted;
    }
    /**
     * An optional AuditStamp corresponding to the deletion of this dashboard
     */
    public void setDeleted(AuditStamp deleted) {
        this.deleted = deleted;
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
        if (charts != null) {
            joiner.add("charts: " + charts);
        }
        if (externalUrl != null) {
            joiner.add("externalUrl: \"" + externalUrl + "\"");
        }
        if (access != null) {
            joiner.add("access: " + access);
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        if (lastRefreshed != null) {
            joiner.add("lastRefreshed: " + lastRefreshed);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        if (deleted != null) {
            joiner.add("deleted: " + deleted);
        }
        return joiner.toString();
    }

    public static DashboardInfo.Builder builder() {
        return new DashboardInfo.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private java.util.List<Chart> charts;
        private String externalUrl;
        private AccessLevel access;
        private java.util.List<CustomPropertiesEntry> customProperties;
        private Long lastRefreshed;
        private AuditStamp created;
        private AuditStamp lastModified;
        private AuditStamp deleted;

        public Builder() {
        }

        /**
         * Display of the dashboard
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the dashboard
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Deprecated, use relationship Contains instead
Charts that comprise the dashboard
         */
        @Deprecated
        public Builder setCharts(java.util.List<Chart> charts) {
            this.charts = charts;
            return this;
        }

        /**
         * Native platform URL of the dashboard
         */
        public Builder setExternalUrl(String externalUrl) {
            this.externalUrl = externalUrl;
            return this;
        }

        /**
         * Access level for the dashboard
Note that this will soon be deprecated for low usage
         */
        public Builder setAccess(AccessLevel access) {
            this.access = access;
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
         * The time when this dashboard last refreshed
         */
        public Builder setLastRefreshed(Long lastRefreshed) {
            this.lastRefreshed = lastRefreshed;
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this dashboard
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * An AuditStamp corresponding to the modification of this dashboard
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * An optional AuditStamp corresponding to the deletion of this dashboard
         */
        public Builder setDeleted(AuditStamp deleted) {
            this.deleted = deleted;
            return this;
        }


        public DashboardInfo build() {
            return new DashboardInfo(name, description, charts, externalUrl, access, customProperties, lastRefreshed, created, lastModified, deleted);
        }

    }
}
