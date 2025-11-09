package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for updating the parent domain of a domain.
 */
public class MoveDomainInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String parentDomain;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public MoveDomainInput() {
    }

    public MoveDomainInput(String parentDomain, String resourceUrn) {
        this.parentDomain = parentDomain;
        this.resourceUrn = resourceUrn;
    }

    public String getParentDomain() {
        return parentDomain;
    }
    public void setParentDomain(String parentDomain) {
        this.parentDomain = parentDomain;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (parentDomain != null) {
            joiner.add("parentDomain: \"" + parentDomain + "\"");
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        return joiner.toString();
    }

    public static MoveDomainInput.Builder builder() {
        return new MoveDomainInput.Builder();
    }

    public static class Builder {

        private String parentDomain;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setParentDomain(String parentDomain) {
            this.parentDomain = parentDomain;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public MoveDomainInput build() {
            return new MoveDomainInput(parentDomain, resourceUrn);
        }

    }
}
