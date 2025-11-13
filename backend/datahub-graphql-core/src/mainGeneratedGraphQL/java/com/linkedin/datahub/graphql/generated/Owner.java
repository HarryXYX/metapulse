package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An owner of a Metadata Entity
 */
public class Owner implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private OwnerType owner;
    @Deprecated
    private OwnershipType type;
    private OwnershipTypeEntity ownershipType;
    private OwnershipSource source;
    @javax.annotation.Nonnull
    private String associatedUrn;
    private MetadataAttribution attribution;

    public Owner() {
    }

    public Owner(OwnerType owner, OwnershipType type, OwnershipTypeEntity ownershipType, OwnershipSource source, String associatedUrn, MetadataAttribution attribution) {
        this.owner = owner;
        this.type = type;
        this.ownershipType = ownershipType;
        this.source = source;
        this.associatedUrn = associatedUrn;
        this.attribution = attribution;
    }

    /**
     * Owner object
     */
    public OwnerType getOwner() {
        return owner;
    }
    /**
     * Owner object
     */
    public void setOwner(OwnerType owner) {
        this.owner = owner;
    }

    /**
     * The type of the ownership. Deprecated - Use ownershipType field instead.
     */
    @Deprecated
    public OwnershipType getType() {
        return type;
    }
    /**
     * The type of the ownership. Deprecated - Use ownershipType field instead.
     */
    @Deprecated
    public void setType(OwnershipType type) {
        this.type = type;
    }

    /**
     * Ownership type information
     */
    public OwnershipTypeEntity getOwnershipType() {
        return ownershipType;
    }
    /**
     * Ownership type information
     */
    public void setOwnershipType(OwnershipTypeEntity ownershipType) {
        this.ownershipType = ownershipType;
    }

    /**
     * Source information for the ownership
     */
    public OwnershipSource getSource() {
        return source;
    }
    /**
     * Source information for the ownership
     */
    public void setSource(OwnershipSource source) {
        this.source = source;
    }

    /**
     * Reference back to the owned urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public String getAssociatedUrn() {
        return associatedUrn;
    }
    /**
     * Reference back to the owned urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public void setAssociatedUrn(String associatedUrn) {
        this.associatedUrn = associatedUrn;
    }

    /**
     * Information about who, why, and how this metadata was applied
     */
    public MetadataAttribution getAttribution() {
        return attribution;
    }
    /**
     * Information about who, why, and how this metadata was applied
     */
    public void setAttribution(MetadataAttribution attribution) {
        this.attribution = attribution;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (owner != null) {
            joiner.add("owner: " + owner);
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (ownershipType != null) {
            joiner.add("ownershipType: " + ownershipType);
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        if (associatedUrn != null) {
            joiner.add("associatedUrn: \"" + associatedUrn + "\"");
        }
        if (attribution != null) {
            joiner.add("attribution: " + attribution);
        }
        return joiner.toString();
    }

    public static Owner.Builder builder() {
        return new Owner.Builder();
    }

    public static class Builder {

        private OwnerType owner;
        private OwnershipType type;
        private OwnershipTypeEntity ownershipType;
        private OwnershipSource source;
        private String associatedUrn;
        private MetadataAttribution attribution;

        public Builder() {
        }

        /**
         * Owner object
         */
        public Builder setOwner(OwnerType owner) {
            this.owner = owner;
            return this;
        }

        /**
         * The type of the ownership. Deprecated - Use ownershipType field instead.
         */
        @Deprecated
        public Builder setType(OwnershipType type) {
            this.type = type;
            return this;
        }

        /**
         * Ownership type information
         */
        public Builder setOwnershipType(OwnershipTypeEntity ownershipType) {
            this.ownershipType = ownershipType;
            return this;
        }

        /**
         * Source information for the ownership
         */
        public Builder setSource(OwnershipSource source) {
            this.source = source;
            return this;
        }

        /**
         * Reference back to the owned urn for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         */
        public Builder setAttribution(MetadataAttribution attribution) {
            this.attribution = attribution;
            return this;
        }


        public Owner build() {
            return new Owner(owner, type, ownershipType, source, associatedUrn, attribution);
        }

    }
}
