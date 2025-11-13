package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when adding multiple associations between a Metadata Entity and an user or group owner
 */
public class AddOwnersInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<OwnerInput> owners;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public AddOwnersInput() {
    }

    public AddOwnersInput(java.util.List<OwnerInput> owners, String resourceUrn) {
        this.owners = owners;
        this.resourceUrn = resourceUrn;
    }

    public java.util.List<OwnerInput> getOwners() {
        return owners;
    }
    public void setOwners(java.util.List<OwnerInput> owners) {
        this.owners = owners;
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
        if (owners != null) {
            joiner.add("owners: " + owners);
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        return joiner.toString();
    }

    public static AddOwnersInput.Builder builder() {
        return new AddOwnersInput.Builder();
    }

    public static class Builder {

        private java.util.List<OwnerInput> owners;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setOwners(java.util.List<OwnerInput> owners) {
            this.owners = owners;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public AddOwnersInput build() {
            return new AddOwnersInput(owners, resourceUrn);
        }

    }
}
