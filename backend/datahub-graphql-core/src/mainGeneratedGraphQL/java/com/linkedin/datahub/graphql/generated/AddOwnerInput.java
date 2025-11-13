package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when adding the association between a Metadata Entity and an user or group owner
 */
public class AddOwnerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String ownerUrn;
    @javax.annotation.Nonnull
    private OwnerEntityType ownerEntityType;
    @Deprecated
    private OwnershipType type;
    private String ownershipTypeUrn;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public AddOwnerInput() {
    }

    public AddOwnerInput(String ownerUrn, OwnerEntityType ownerEntityType, OwnershipType type, String ownershipTypeUrn, String resourceUrn) {
        this.ownerUrn = ownerUrn;
        this.ownerEntityType = ownerEntityType;
        this.type = type;
        this.ownershipTypeUrn = ownershipTypeUrn;
        this.resourceUrn = resourceUrn;
    }

    public String getOwnerUrn() {
        return ownerUrn;
    }
    public void setOwnerUrn(String ownerUrn) {
        this.ownerUrn = ownerUrn;
    }

    public OwnerEntityType getOwnerEntityType() {
        return ownerEntityType;
    }
    public void setOwnerEntityType(OwnerEntityType ownerEntityType) {
        this.ownerEntityType = ownerEntityType;
    }

    @Deprecated
    public OwnershipType getType() {
        return type;
    }
    @Deprecated
    public void setType(OwnershipType type) {
        this.type = type;
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
        if (ownerEntityType != null) {
            joiner.add("ownerEntityType: " + ownerEntityType);
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (ownershipTypeUrn != null) {
            joiner.add("ownershipTypeUrn: \"" + ownershipTypeUrn + "\"");
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        return joiner.toString();
    }

    public static AddOwnerInput.Builder builder() {
        return new AddOwnerInput.Builder();
    }

    public static class Builder {

        private String ownerUrn;
        private OwnerEntityType ownerEntityType;
        private OwnershipType type;
        private String ownershipTypeUrn;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setOwnerUrn(String ownerUrn) {
            this.ownerUrn = ownerUrn;
            return this;
        }

        public Builder setOwnerEntityType(OwnerEntityType ownerEntityType) {
            this.ownerEntityType = ownerEntityType;
            return this;
        }

        @Deprecated
        public Builder setType(OwnershipType type) {
            this.type = type;
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


        public AddOwnerInput build() {
            return new AddOwnerInput(ownerUrn, ownerEntityType, type, ownershipTypeUrn, resourceUrn);
        }

    }
}
