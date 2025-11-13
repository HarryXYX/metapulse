package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Experimental API result to debug Access for users.
Backward incompatible changes will be made without notice in the future.
 */
public class DebugAccessResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> roles;
    @javax.annotation.Nonnull
    private java.util.List<String> groups;
    @javax.annotation.Nonnull
    private java.util.List<String> groupsWithRoles;
    @javax.annotation.Nonnull
    private java.util.List<String> rolesViaGroups;
    @javax.annotation.Nonnull
    private java.util.List<String> allRoles;
    @javax.annotation.Nonnull
    private java.util.List<String> policies;
    @javax.annotation.Nonnull
    private java.util.List<String> privileges;

    public DebugAccessResult() {
    }

    public DebugAccessResult(java.util.List<String> roles, java.util.List<String> groups, java.util.List<String> groupsWithRoles, java.util.List<String> rolesViaGroups, java.util.List<String> allRoles, java.util.List<String> policies, java.util.List<String> privileges) {
        this.roles = roles;
        this.groups = groups;
        this.groupsWithRoles = groupsWithRoles;
        this.rolesViaGroups = rolesViaGroups;
        this.allRoles = allRoles;
        this.policies = policies;
        this.privileges = privileges;
    }

    /**
     * Roles that the user has.
     */
    public java.util.List<String> getRoles() {
        return roles;
    }
    /**
     * Roles that the user has.
     */
    public void setRoles(java.util.List<String> roles) {
        this.roles = roles;
    }

    /**
     * Groups that the user belongs to.
     */
    public java.util.List<String> getGroups() {
        return groups;
    }
    /**
     * Groups that the user belongs to.
     */
    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }

    /**
     * List of groups that the user is assigned to AND where the group has a role.
This is a subset of the groups property.
     */
    public java.util.List<String> getGroupsWithRoles() {
        return groupsWithRoles;
    }
    /**
     * List of groups that the user is assigned to AND where the group has a role.
This is a subset of the groups property.
     */
    public void setGroupsWithRoles(java.util.List<String> groupsWithRoles) {
        this.groupsWithRoles = groupsWithRoles;
    }

    /**
     * Final set of roles that are coming through groups.
If not role assigned to groups, then this would be empty.
     */
    public java.util.List<String> getRolesViaGroups() {
        return rolesViaGroups;
    }
    /**
     * Final set of roles that are coming through groups.
If not role assigned to groups, then this would be empty.
     */
    public void setRolesViaGroups(java.util.List<String> rolesViaGroups) {
        this.rolesViaGroups = rolesViaGroups;
    }

    /**
     * Union of `roles` + `rolesViaGroups` that the user has.
     */
    public java.util.List<String> getAllRoles() {
        return allRoles;
    }
    /**
     * Union of `roles` + `rolesViaGroups` that the user has.
     */
    public void setAllRoles(java.util.List<String> allRoles) {
        this.allRoles = allRoles;
    }

    /**
     * List of Policy that apply to this user directly or indirectly.
     */
    public java.util.List<String> getPolicies() {
        return policies;
    }
    /**
     * List of Policy that apply to this user directly or indirectly.
     */
    public void setPolicies(java.util.List<String> policies) {
        this.policies = policies;
    }

    /**
     * List of privileges that this user has directly or indirectly.
     */
    public java.util.List<String> getPrivileges() {
        return privileges;
    }
    /**
     * List of privileges that this user has directly or indirectly.
     */
    public void setPrivileges(java.util.List<String> privileges) {
        this.privileges = privileges;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (roles != null) {
            joiner.add("roles: " + roles);
        }
        if (groups != null) {
            joiner.add("groups: " + groups);
        }
        if (groupsWithRoles != null) {
            joiner.add("groupsWithRoles: " + groupsWithRoles);
        }
        if (rolesViaGroups != null) {
            joiner.add("rolesViaGroups: " + rolesViaGroups);
        }
        if (allRoles != null) {
            joiner.add("allRoles: " + allRoles);
        }
        if (policies != null) {
            joiner.add("policies: " + policies);
        }
        if (privileges != null) {
            joiner.add("privileges: " + privileges);
        }
        return joiner.toString();
    }

    public static DebugAccessResult.Builder builder() {
        return new DebugAccessResult.Builder();
    }

    public static class Builder {

        private java.util.List<String> roles;
        private java.util.List<String> groups;
        private java.util.List<String> groupsWithRoles;
        private java.util.List<String> rolesViaGroups;
        private java.util.List<String> allRoles;
        private java.util.List<String> policies;
        private java.util.List<String> privileges;

        public Builder() {
        }

        /**
         * Roles that the user has.
         */
        public Builder setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }

        /**
         * Groups that the user belongs to.
         */
        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * List of groups that the user is assigned to AND where the group has a role.
This is a subset of the groups property.
         */
        public Builder setGroupsWithRoles(java.util.List<String> groupsWithRoles) {
            this.groupsWithRoles = groupsWithRoles;
            return this;
        }

        /**
         * Final set of roles that are coming through groups.
If not role assigned to groups, then this would be empty.
         */
        public Builder setRolesViaGroups(java.util.List<String> rolesViaGroups) {
            this.rolesViaGroups = rolesViaGroups;
            return this;
        }

        /**
         * Union of `roles` + `rolesViaGroups` that the user has.
         */
        public Builder setAllRoles(java.util.List<String> allRoles) {
            this.allRoles = allRoles;
            return this;
        }

        /**
         * List of Policy that apply to this user directly or indirectly.
         */
        public Builder setPolicies(java.util.List<String> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * List of privileges that this user has directly or indirectly.
         */
        public Builder setPrivileges(java.util.List<String> privileges) {
            this.privileges = privileges;
            return this;
        }


        public DebugAccessResult build() {
            return new DebugAccessResult(roles, groups, groupsWithRoles, rolesViaGroups, allRoles, policies, privileges);
        }

    }
}
