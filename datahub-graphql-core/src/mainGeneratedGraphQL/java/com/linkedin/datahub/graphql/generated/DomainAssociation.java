package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class DomainAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Domain domain;
    @javax.annotation.Nonnull
    private String associatedUrn;

    public DomainAssociation() {
    }

    public DomainAssociation(Domain domain, String associatedUrn) {
        this.domain = domain;
        this.associatedUrn = associatedUrn;
    }

    /**
     * The domain related to the assocaited urn
     */
    public Domain getDomain() {
        return domain;
    }
    /**
     * The domain related to the assocaited urn
     */
    public void setDomain(Domain domain) {
        this.domain = domain;
    }

    /**
     * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public String getAssociatedUrn() {
        return associatedUrn;
    }
    /**
     * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public void setAssociatedUrn(String associatedUrn) {
        this.associatedUrn = associatedUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (domain != null) {
            joiner.add("domain: " + domain);
        }
        if (associatedUrn != null) {
            joiner.add("associatedUrn: \"" + associatedUrn + "\"");
        }
        return joiner.toString();
    }

    public static DomainAssociation.Builder builder() {
        return new DomainAssociation.Builder();
    }

    public static class Builder {

        private Domain domain;
        private String associatedUrn;

        public Builder() {
        }

        /**
         * The domain related to the assocaited urn
         */
        public Builder setDomain(Domain domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }


        public DomainAssociation build() {
            return new DomainAssociation(domain, associatedUrn);
        }

    }
}
