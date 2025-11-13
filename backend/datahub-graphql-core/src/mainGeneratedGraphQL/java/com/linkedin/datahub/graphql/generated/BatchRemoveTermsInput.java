package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when removing glossary terms from a batch of assets
 */
public class BatchRemoveTermsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> termUrns;
    @javax.annotation.Nonnull
    private java.util.List<ResourceRefInput> resources;

    public BatchRemoveTermsInput() {
    }

    public BatchRemoveTermsInput(java.util.List<String> termUrns, java.util.List<ResourceRefInput> resources) {
        this.termUrns = termUrns;
        this.resources = resources;
    }

    public java.util.List<String> getTermUrns() {
        return termUrns;
    }
    public void setTermUrns(java.util.List<String> termUrns) {
        this.termUrns = termUrns;
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
        if (termUrns != null) {
            joiner.add("termUrns: " + termUrns);
        }
        if (resources != null) {
            joiner.add("resources: " + resources);
        }
        return joiner.toString();
    }

    public static BatchRemoveTermsInput.Builder builder() {
        return new BatchRemoveTermsInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> termUrns;
        private java.util.List<ResourceRefInput> resources;

        public Builder() {
        }

        public Builder setTermUrns(java.util.List<String> termUrns) {
            this.termUrns = termUrns;
            return this;
        }

        public Builder setResources(java.util.List<ResourceRefInput> resources) {
            this.resources = resources;
            return this;
        }


        public BatchRemoveTermsInput build() {
            return new BatchRemoveTermsInput(termUrns, resources);
        }

    }
}
