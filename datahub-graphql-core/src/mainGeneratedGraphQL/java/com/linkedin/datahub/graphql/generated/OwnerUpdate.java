package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An owner to add to a Metadata Entity
TODO Add a USER or GROUP actor enum
 */
public class OwnerUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String owner;
    @Deprecated
    private OwnershipType type;
    private String ownershipTypeUrn;

    public OwnerUpdate() {
    }

    public OwnerUpdate(String owner, OwnershipType type, String ownershipTypeUrn) {
        this.owner = owner;
        this.type = type;
        this.ownershipTypeUrn = ownershipTypeUrn;
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (owner != null) {
            joiner.add("owner: \"" + owner + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (ownershipTypeUrn != null) {
            joiner.add("ownershipTypeUrn: \"" + ownershipTypeUrn + "\"");
        }
        return joiner.toString();
    }

    public static OwnerUpdate.Builder builder() {
        return new OwnerUpdate.Builder();
    }

    public static class Builder {

        private String owner;
        private OwnershipType type;
        private String ownershipTypeUrn;

        public Builder() {
        }

        public Builder setOwner(String owner) {
            this.owner = owner;
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


        public OwnerUpdate build() {
            return new OwnerUpdate(owner, type, ownershipTypeUrn);
        }

    }
}
