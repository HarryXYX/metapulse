package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties about an individual Custom Ownership Type.
 */
public class OwnershipTypeInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private AuditStamp created;
    private AuditStamp lastModified;

    public OwnershipTypeInfo() {
    }

    public OwnershipTypeInfo(String name, String description, AuditStamp created, AuditStamp lastModified) {
        this.name = name;
        this.description = description;
        this.created = created;
        this.lastModified = lastModified;
    }

    /**
     * The name of the Custom Ownership Type
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the Custom Ownership Type
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The description of the Custom Ownership Type
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of the Custom Ownership Type
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * An Audit Stamp corresponding to the creation of this resource
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An Audit Stamp corresponding to the creation of this resource
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * An Audit Stamp corresponding to the update of this resource
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * An Audit Stamp corresponding to the update of this resource
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
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
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        return joiner.toString();
    }

    public static OwnershipTypeInfo.Builder builder() {
        return new OwnershipTypeInfo.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private AuditStamp created;
        private AuditStamp lastModified;

        public Builder() {
        }

        /**
         * The name of the Custom Ownership Type
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The description of the Custom Ownership Type
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * An Audit Stamp corresponding to the creation of this resource
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * An Audit Stamp corresponding to the update of this resource
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }


        public OwnershipTypeInfo build() {
            return new OwnershipTypeInfo(name, description, created, lastModified);
        }

    }
}
