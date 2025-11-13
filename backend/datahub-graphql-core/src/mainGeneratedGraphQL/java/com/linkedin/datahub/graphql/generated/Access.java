package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class Access implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<RoleAssociation> roles;

    public Access() {
    }

    public Access(java.util.List<RoleAssociation> roles) {
        this.roles = roles;
    }

    public java.util.List<RoleAssociation> getRoles() {
        return roles;
    }
    public void setRoles(java.util.List<RoleAssociation> roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (roles != null) {
            joiner.add("roles: " + roles);
        }
        return joiner.toString();
    }

    public static Access.Builder builder() {
        return new Access.Builder();
    }

    public static class Builder {

        private java.util.List<RoleAssociation> roles;

        public Builder() {
        }

        public Builder setRoles(java.util.List<RoleAssociation> roles) {
            this.roles = roles;
            return this;
        }


        public Access build() {
            return new Access(roles);
        }

    }
}
