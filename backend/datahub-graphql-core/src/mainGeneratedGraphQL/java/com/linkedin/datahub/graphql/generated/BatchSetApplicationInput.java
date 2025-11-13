package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input properties required for batch setting a Application on other entities
 */
public class BatchSetApplicationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String applicationUrn;
    @javax.annotation.Nonnull
    private java.util.List<String> resourceUrns;

    public BatchSetApplicationInput() {
    }

    public BatchSetApplicationInput(String applicationUrn, java.util.List<String> resourceUrns) {
        this.applicationUrn = applicationUrn;
        this.resourceUrns = resourceUrns;
    }

    public String getApplicationUrn() {
        return applicationUrn;
    }
    public void setApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
    }

    public java.util.List<String> getResourceUrns() {
        return resourceUrns;
    }
    public void setResourceUrns(java.util.List<String> resourceUrns) {
        this.resourceUrns = resourceUrns;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (applicationUrn != null) {
            joiner.add("applicationUrn: \"" + applicationUrn + "\"");
        }
        if (resourceUrns != null) {
            joiner.add("resourceUrns: " + resourceUrns);
        }
        return joiner.toString();
    }

    public static BatchSetApplicationInput.Builder builder() {
        return new BatchSetApplicationInput.Builder();
    }

    public static class Builder {

        private String applicationUrn;
        private java.util.List<String> resourceUrns;

        public Builder() {
        }

        public Builder setApplicationUrn(String applicationUrn) {
            this.applicationUrn = applicationUrn;
            return this;
        }

        public Builder setResourceUrns(java.util.List<String> resourceUrns) {
            this.resourceUrns = resourceUrns;
            return this;
        }


        public BatchSetApplicationInput build() {
            return new BatchSetApplicationInput(applicationUrn, resourceUrns);
        }

    }
}
