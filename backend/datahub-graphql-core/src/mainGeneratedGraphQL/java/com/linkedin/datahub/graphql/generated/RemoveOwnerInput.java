package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when removing the association between a Metadata Entity and an user or group owner
 */
public class RemoveOwnerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String ownerUrn;
    private String ownershipTypeUrn;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public RemoveOwnerInput() {
    }

    public RemoveOwnerInput(String ownerUrn, String ownershipTypeUrn, String resourceUrn) {
        this.ownerUrn = ownerUrn;
        this.ownershipTypeUrn = ownershipTypeUrn;
        this.resourceUrn = resourceUrn;
    }

    public String getOwnerUrn() {
        return ownerUrn;
    }
    public void setOwnerUrn(String ownerUrn) {
        this.ownerUrn = ownerUrn;
    }

    public String getOwnershipTypeUrn() {
        return ownershipTypeUrn;
    }
    public void setOwnershipTypeUrn(String ownershipTypeUrn) {
        this.ownershipTypeUrn = ownershipTypeUrn;
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
        if (ownerUrn != null) {
            joiner.add("ownerUrn: \"" + ownerUrn + "\"");
        }
        if (ownershipTypeUrn != null) {
            joiner.add("ownershipTypeUrn: \"" + ownershipTypeUrn + "\"");
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        return joiner.toString();
    }

    public static RemoveOwnerInput.Builder builder() {
        return new RemoveOwnerInput.Builder();
    }

    public static class Builder {

        private String ownerUrn;
        private String ownershipTypeUrn;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setOwnerUrn(String ownerUrn) {
            this.ownerUrn = ownerUrn;
            return this;
        }

        public Builder setOwnershipTypeUrn(String ownershipTypeUrn) {
            this.ownershipTypeUrn = ownershipTypeUrn;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public RemoveOwnerInput build() {
            return new RemoveOwnerInput(ownerUrn, ownershipTypeUrn, resourceUrn);
        }

    }
}
