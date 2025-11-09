package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class VersionProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private VersionSet versionSet;
    @javax.annotation.Nonnull
    private VersionTag version;
    @javax.annotation.Nonnull
    private java.util.List<VersionTag> aliases;
    private String comment;
    private boolean isLatest;
    private ResolvedAuditStamp created;
    private ResolvedAuditStamp createdInSource;

    public VersionProperties() {
    }

    public VersionProperties(VersionSet versionSet, VersionTag version, java.util.List<VersionTag> aliases, String comment, boolean isLatest, ResolvedAuditStamp created, ResolvedAuditStamp createdInSource) {
        this.versionSet = versionSet;
        this.version = version;
        this.aliases = aliases;
        this.comment = comment;
        this.isLatest = isLatest;
        this.created = created;
        this.createdInSource = createdInSource;
    }

    /**
     * The linked Version Set entity that ties multiple versioned assets together
     */
    public VersionSet getVersionSet() {
        return versionSet;
    }
    /**
     * The linked Version Set entity that ties multiple versioned assets together
     */
    public void setVersionSet(VersionSet versionSet) {
        this.versionSet = versionSet;
    }

    /**
     * Label for this versioned asset, should be unique within a version set (not enforced)
     */
    public VersionTag getVersion() {
        return version;
    }
    /**
     * Label for this versioned asset, should be unique within a version set (not enforced)
     */
    public void setVersion(VersionTag version) {
        this.version = version;
    }

    /**
     * Additional version identifiers for this versioned asset.
     */
    public java.util.List<VersionTag> getAliases() {
        return aliases;
    }
    /**
     * Additional version identifiers for this versioned asset.
     */
    public void setAliases(java.util.List<VersionTag> aliases) {
        this.aliases = aliases;
    }

    /**
     * Comment documenting what this version was created for, changes, or represents
     */
    public String getComment() {
        return comment;
    }
    /**
     * Comment documenting what this version was created for, changes, or represents
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Whether this version is currently the latest in its verison set
     */
    public boolean getIsLatest() {
        return isLatest;
    }
    /**
     * Whether this version is currently the latest in its verison set
     */
    public void setIsLatest(boolean isLatest) {
        this.isLatest = isLatest;
    }

    /**
     * Timestamp reflecting when the metadata for this version was created in DataHub
     */
    public ResolvedAuditStamp getCreated() {
        return created;
    }
    /**
     * Timestamp reflecting when the metadata for this version was created in DataHub
     */
    public void setCreated(ResolvedAuditStamp created) {
        this.created = created;
    }

    /**
     * Timestamp reflecting when the metadata for this version was created in DataHub
     */
    public ResolvedAuditStamp getCreatedInSource() {
        return createdInSource;
    }
    /**
     * Timestamp reflecting when the metadata for this version was created in DataHub
     */
    public void setCreatedInSource(ResolvedAuditStamp createdInSource) {
        this.createdInSource = createdInSource;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (versionSet != null) {
            joiner.add("versionSet: " + versionSet);
        }
        if (version != null) {
            joiner.add("version: " + version);
        }
        if (aliases != null) {
            joiner.add("aliases: " + aliases);
        }
        if (comment != null) {
            joiner.add("comment: \"" + comment + "\"");
        }
        joiner.add("isLatest: " + isLatest);
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (createdInSource != null) {
            joiner.add("createdInSource: " + createdInSource);
        }
        return joiner.toString();
    }

    public static VersionProperties.Builder builder() {
        return new VersionProperties.Builder();
    }

    public static class Builder {

        private VersionSet versionSet;
        private VersionTag version;
        private java.util.List<VersionTag> aliases;
        private String comment;
        private boolean isLatest;
        private ResolvedAuditStamp created;
        private ResolvedAuditStamp createdInSource;

        public Builder() {
        }

        /**
         * The linked Version Set entity that ties multiple versioned assets together
         */
        public Builder setVersionSet(VersionSet versionSet) {
            this.versionSet = versionSet;
            return this;
        }

        /**
         * Label for this versioned asset, should be unique within a version set (not enforced)
         */
        public Builder setVersion(VersionTag version) {
            this.version = version;
            return this;
        }

        /**
         * Additional version identifiers for this versioned asset.
         */
        public Builder setAliases(java.util.List<VersionTag> aliases) {
            this.aliases = aliases;
            return this;
        }

        /**
         * Comment documenting what this version was created for, changes, or represents
         */
        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Whether this version is currently the latest in its verison set
         */
        public Builder setIsLatest(boolean isLatest) {
            this.isLatest = isLatest;
            return this;
        }

        /**
         * Timestamp reflecting when the metadata for this version was created in DataHub
         */
        public Builder setCreated(ResolvedAuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * Timestamp reflecting when the metadata for this version was created in DataHub
         */
        public Builder setCreatedInSource(ResolvedAuditStamp createdInSource) {
            this.createdInSource = createdInSource;
            return this;
        }


        public VersionProperties build() {
            return new VersionProperties(versionSet, version, aliases, comment, isLatest, created, createdInSource);
        }

    }
}
