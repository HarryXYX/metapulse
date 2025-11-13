package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when removing owners from a batch of assets
 */
public class BatchRemoveOwnersInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> ownerUrns;
    private String ownershipTypeUrn;
    @javax.annotation.Nonnull
    private java.util.List<ResourceRefInput> resources;

    public BatchRemoveOwnersInput() {
    }

    public BatchRemoveOwnersInput(java.util.List<String> ownerUrns, String ownershipTypeUrn, java.util.List<ResourceRefInput> resources) {
        this.ownerUrns = ownerUrns;
        this.ownershipTypeUrn = ownershipTypeUrn;
        this.resources = resources;
    }

    public java.util.List<String> getOwnerUrns() {
        return ownerUrns;
    }
    public void setOwnerUrns(java.util.List<String> ownerUrns) {
        this.ownerUrns = ownerUrns;
    }

    public String getOwnershipTypeUrn() {
        return ownershipTypeUrn;
    }
    public void setOwnershipTypeUrn(String ownershipTypeUrn) {
        this.ownershipTypeUrn = ownershipTypeUrn;
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
        if (ownerUrns != null) {
            joiner.add("ownerUrns: " + ownerUrns);
        }
        if (ownershipTypeUrn != null) {
            joiner.add("ownershipTypeUrn: \"" + ownershipTypeUrn + "\"");
        }
        if (resources != null) {
            joiner.add("resources: " + resources);
        }
        return joiner.toString();
    }

    public static BatchRemoveOwnersInput.Builder builder() {
        return new BatchRemoveOwnersInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> ownerUrns;
        private String ownershipTypeUrn;
        private java.util.List<ResourceRefInput> resources;

        public Builder() {
        }

        public Builder setOwnerUrns(java.util.List<String> ownerUrns) {
            this.ownerUrns = ownerUrns;
            return this;
        }

        public Builder setOwnershipTypeUrn(String ownershipTypeUrn) {
            this.ownershipTypeUrn = ownershipTypeUrn;
            return this;
        }

        public Builder setResources(java.util.List<ResourceRefInput> resources) {
            this.resources = resources;
            return this;
        }


        public BatchRemoveOwnersInput build() {
            return new BatchRemoveOwnersInput(ownerUrns, ownershipTypeUrn, resources);
        }

    }
}
