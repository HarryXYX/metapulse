package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class RoleAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Role role;
    @javax.annotation.Nonnull
    private String associatedUrn;

    public RoleAssociation() {
    }

    public RoleAssociation(Role role, String associatedUrn) {
        this.role = role;
        this.associatedUrn = associatedUrn;
    }

    /**
     * The Role entity itself
     */
    public Role getRole() {
        return role;
    }
    /**
     * The Role entity itself
     */
    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public String getAssociatedUrn() {
        return associatedUrn;
    }
    /**
     * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public void setAssociatedUrn(String associatedUrn) {
        this.associatedUrn = associatedUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (role != null) {
            joiner.add("role: " + role);
        }
        if (associatedUrn != null) {
            joiner.add("associatedUrn: \"" + associatedUrn + "\"");
        }
        return joiner.toString();
    }

    public static RoleAssociation.Builder builder() {
        return new RoleAssociation.Builder();
    }

    public static class Builder {

        private Role role;
        private String associatedUrn;

        public Builder() {
        }

        /**
         * The Role entity itself
         */
        public Builder setRole(Role role) {
            this.role = role;
            return this;
        }

        /**
         * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }


        public RoleAssociation build() {
            return new RoleAssociation(role, associatedUrn);
        }

    }
}
