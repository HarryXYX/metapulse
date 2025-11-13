package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties about a domain
 */
public class DomainProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private ResolvedAuditStamp createdOn;

    public DomainProperties() {
    }

    public DomainProperties(String name, String description, ResolvedAuditStamp createdOn) {
        this.name = name;
        this.description = description;
        this.createdOn = createdOn;
    }

    /**
     * Display name of the domain
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the domain
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of the Domain
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Domain
     */
    public void setDescription(String description) {
        this.description = description;
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
        if (createdOn != null) {
            joiner.add("createdOn: " + createdOn);
        }
        return joiner.toString();
    }

    public static DomainProperties.Builder builder() {
        return new DomainProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private ResolvedAuditStamp createdOn;

        public Builder() {
        }

        /**
         * Display name of the domain
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of the Domain
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * A Resolved Audit Stamp corresponding to the creation of this resource
         */
        public Builder setCreatedOn(ResolvedAuditStamp createdOn) {
            this.createdOn = createdOn;
            return this;
        }


        public DomainProperties build() {
            return new DomainProperties(name, description, createdOn);
        }

    }
}
