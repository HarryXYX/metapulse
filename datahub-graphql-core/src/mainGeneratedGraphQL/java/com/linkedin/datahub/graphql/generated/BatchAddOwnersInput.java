package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when adding owners to a batch of assets
 */
public class BatchAddOwnersInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<OwnerInput> owners;
    private String ownershipTypeUrn;
    @javax.annotation.Nonnull
    private java.util.List<ResourceRefInput> resources;

    public BatchAddOwnersInput() {
    }

    public BatchAddOwnersInput(java.util.List<OwnerInput> owners, String ownershipTypeUrn, java.util.List<ResourceRefInput> resources) {
        this.owners = owners;
        this.ownershipTypeUrn = ownershipTypeUrn;
        this.resources = resources;
    }

    public java.util.List<OwnerInput> getOwners() {
        return owners;
    }
    public void setOwners(java.util.List<OwnerInput> owners) {
        this.owners = owners;
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
        if (owners != null) {
            joiner.add("owners: " + owners);
        }
        if (ownershipTypeUrn != null) {
            joiner.add("ownershipTypeUrn: \"" + ownershipTypeUrn + "\"");
        }
        if (resources != null) {
            joiner.add("resources: " + resources);
        }
        return joiner.toString();
    }

    public static BatchAddOwnersInput.Builder builder() {
        return new BatchAddOwnersInput.Builder();
    }

    public static class Builder {

        private java.util.List<OwnerInput> owners;
        private String ownershipTypeUrn;
        private java.util.List<ResourceRefInput> resources;

        public Builder() {
        }

        public Builder setOwners(java.util.List<OwnerInput> owners) {
            this.owners = owners;
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


        public BatchAddOwnersInput build() {
            return new BatchAddOwnersInput(owners, ownershipTypeUrn, resources);
        }

    }
}
