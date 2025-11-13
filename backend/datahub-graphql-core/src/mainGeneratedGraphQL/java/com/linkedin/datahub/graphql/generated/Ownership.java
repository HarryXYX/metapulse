package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Ownership information about a Metadata Entity
 */
public class Ownership implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<Owner> owners;
    @javax.annotation.Nonnull
    private AuditStamp lastModified;

    public Ownership() {
    }

    public Ownership(java.util.List<Owner> owners, AuditStamp lastModified) {
        this.owners = owners;
        this.lastModified = lastModified;
    }

    /**
     * List of owners of the entity
     */
    public java.util.List<Owner> getOwners() {
        return owners;
    }
    /**
     * List of owners of the entity
     */
    public void setOwners(java.util.List<Owner> owners) {
        this.owners = owners;
    }

    /**
     * Audit stamp containing who last modified the record and when
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * Audit stamp containing who last modified the record and when
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (owners != null) {
            joiner.add("owners: " + owners);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        return joiner.toString();
    }

    public static Ownership.Builder builder() {
        return new Ownership.Builder();
    }

    public static class Builder {

        private java.util.List<Owner> owners;
        private AuditStamp lastModified;

        public Builder() {
        }

        /**
         * List of owners of the entity
         */
        public Builder setOwners(java.util.List<Owner> owners) {
            this.owners = owners;
            return this;
        }

        /**
         * Audit stamp containing who last modified the record and when
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }


        public Ownership build() {
            return new Ownership(owners, lastModified);
        }

    }
}
