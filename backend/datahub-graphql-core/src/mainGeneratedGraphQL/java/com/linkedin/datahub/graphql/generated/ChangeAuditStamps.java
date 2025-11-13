package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Captures information about who created/last modified/deleted the entity and when
 */
public class ChangeAuditStamps implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AuditStamp created;
    @javax.annotation.Nonnull
    private AuditStamp lastModified;
    private AuditStamp deleted;

    public ChangeAuditStamps() {
    }

    public ChangeAuditStamps(AuditStamp created, AuditStamp lastModified, AuditStamp deleted) {
        this.created = created;
        this.lastModified = lastModified;
        this.deleted = deleted;
    }

    /**
     * An AuditStamp corresponding to the creation
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An AuditStamp corresponding to the creation
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * An AuditStamp corresponding to the modification
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * An AuditStamp corresponding to the modification
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * An optional AuditStamp corresponding to the deletion
     */
    public AuditStamp getDeleted() {
        return deleted;
    }
    /**
     * An optional AuditStamp corresponding to the deletion
     */
    public void setDeleted(AuditStamp deleted) {
        this.deleted = deleted;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
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

    public static ChangeAuditStamps.Builder builder() {
        return new ChangeAuditStamps.Builder();
    }

    public static class Builder {

        private AuditStamp created;
        private AuditStamp lastModified;
        private AuditStamp deleted;

        public Builder() {
        }

        /**
         * An AuditStamp corresponding to the creation
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * An AuditStamp corresponding to the modification
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * An optional AuditStamp corresponding to the deletion
         */
        public Builder setDeleted(AuditStamp deleted) {
            this.deleted = deleted;
            return this;
        }


        public ChangeAuditStamps build() {
            return new ChangeAuditStamps(created, lastModified, deleted);
        }

    }
}
