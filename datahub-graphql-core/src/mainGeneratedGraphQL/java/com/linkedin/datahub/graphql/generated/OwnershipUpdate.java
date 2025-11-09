package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An update for the ownership information for a Metadata Entity
 */
public class OwnershipUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<OwnerUpdate> owners;

    public OwnershipUpdate() {
    }

    public OwnershipUpdate(java.util.List<OwnerUpdate> owners) {
        this.owners = owners;
    }

    public java.util.List<OwnerUpdate> getOwners() {
        return owners;
    }
    public void setOwners(java.util.List<OwnerUpdate> owners) {
        this.owners = owners;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (owners != null) {
            joiner.add("owners: " + owners);
        }
        return joiner.toString();
    }

    public static OwnershipUpdate.Builder builder() {
        return new OwnershipUpdate.Builder();
    }

    public static class Builder {

        private java.util.List<OwnerUpdate> owners;

        public Builder() {
        }

        public Builder setOwners(java.util.List<OwnerUpdate> owners) {
            this.owners = owners;
            return this;
        }


        public OwnershipUpdate build() {
            return new OwnershipUpdate(owners);
        }

    }
}
