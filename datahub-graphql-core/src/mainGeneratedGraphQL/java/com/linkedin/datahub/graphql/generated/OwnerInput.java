package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when adding an owner to an asset
 */
public class OwnerInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String ownerUrn;
    @javax.annotation.Nonnull
    private OwnerEntityType ownerEntityType;
    @Deprecated
    private OwnershipType type;
    private String ownershipTypeUrn;

    public OwnerInput() {
    }

    public OwnerInput(String ownerUrn, OwnerEntityType ownerEntityType, OwnershipType type, String ownershipTypeUrn) {
        this.ownerUrn = ownerUrn;
        this.ownerEntityType = ownerEntityType;
        this.type = type;
        this.ownershipTypeUrn = ownershipTypeUrn;
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
        return joiner.toString();
    }

    public static OwnerInput.Builder builder() {
        return new OwnerInput.Builder();
    }

    public static class Builder {

        private String ownerUrn;
        private OwnerEntityType ownerEntityType;
        private OwnershipType type;
        private String ownershipTypeUrn;

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


        public OwnerInput build() {
            return new OwnerInput(ownerUrn, ownerEntityType, type, ownershipTypeUrn);
        }

    }
}
