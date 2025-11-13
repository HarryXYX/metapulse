package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when adding tags to a batch of assets
 */
public class BatchSetDomainInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String domainUrn;
    @javax.annotation.Nonnull
    private java.util.List<ResourceRefInput> resources;

    public BatchSetDomainInput() {
    }

    public BatchSetDomainInput(String domainUrn, java.util.List<ResourceRefInput> resources) {
        this.domainUrn = domainUrn;
        this.resources = resources;
    }

    public String getDomainUrn() {
        return domainUrn;
    }
    public void setDomainUrn(String domainUrn) {
        this.domainUrn = domainUrn;
    }

    public java.util.List<ResourceRefInput> getResources() {
        return resources;
    }
    public void setResources(java.util.List<ResourceRefInput> resources) {
        this.resources = resources;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (domainUrn != null) {
            joiner.add("domainUrn: \"" + domainUrn + "\"");
        }
        if (resources != null) {
            joiner.add("resources: " + resources);
        }
        return joiner.toString();
    }

    public static BatchSetDomainInput.Builder builder() {
        return new BatchSetDomainInput.Builder();
    }

    public static class Builder {

        private String domainUrn;
        private java.util.List<ResourceRefInput> resources;

        public Builder() {
        }

        public Builder setDomainUrn(String domainUrn) {
            this.domainUrn = domainUrn;
            return this;
        }

        public Builder setResources(java.util.List<ResourceRefInput> resources) {
            this.resources = resources;
            return this;
        }


        public BatchSetDomainInput build() {
            return new BatchSetDomainInput(domainUrn, resources);
        }

    }
}
