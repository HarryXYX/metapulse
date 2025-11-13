package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The actors that a DataHub Access Policy applies to
 */
public class ActorFilter implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> users;
    private java.util.List<String> groups;
    private java.util.List<String> roles;
    private boolean resourceOwners;
    private java.util.List<String> resourceOwnersTypes;
    private java.util.List<OwnershipTypeEntity> resolvedOwnershipTypes;
    private boolean allUsers;
    private boolean allGroups;
    private java.util.List<CorpUser> resolvedUsers;
    private java.util.List<CorpGroup> resolvedGroups;
    private java.util.List<DataHubRole> resolvedRoles;

    public ActorFilter() {
    }

    public ActorFilter(java.util.List<String> users, java.util.List<String> groups, java.util.List<String> roles, boolean resourceOwners, java.util.List<String> resourceOwnersTypes, java.util.List<OwnershipTypeEntity> resolvedOwnershipTypes, boolean allUsers, boolean allGroups, java.util.List<CorpUser> resolvedUsers, java.util.List<CorpGroup> resolvedGroups, java.util.List<DataHubRole> resolvedRoles) {
        this.users = users;
        this.groups = groups;
        this.roles = roles;
        this.resourceOwners = resourceOwners;
        this.resourceOwnersTypes = resourceOwnersTypes;
        this.resolvedOwnershipTypes = resolvedOwnershipTypes;
        this.allUsers = allUsers;
        this.allGroups = allGroups;
        this.resolvedUsers = resolvedUsers;
        this.resolvedGroups = resolvedGroups;
        this.resolvedRoles = resolvedRoles;
    }

    /**
     * A disjunctive set of users to apply the policy to
     */
    public java.util.List<String> getUsers() {
        return users;
    }
    /**
     * A disjunctive set of users to apply the policy to
     */
    public void setUsers(java.util.List<String> users) {
        this.users = users;
    }

    /**
     * A disjunctive set of groups to apply the policy to
     */
    public java.util.List<String> getGroups() {
        return groups;
    }
    /**
     * A disjunctive set of groups to apply the policy to
     */
    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }

    /**
     * A disjunctive set of roles to apply the policy to
     */
    public java.util.List<String> getRoles() {
        return roles;
    }
    /**
     * A disjunctive set of roles to apply the policy to
     */
    public void setRoles(java.util.List<String> roles) {
        this.roles = roles;
    }

    /**
     * Whether the filter should return TRUE for owners of a particular resource
Only applies to policies of type METADATA, which have a resource associated with them
     */
    public boolean getResourceOwners() {
        return resourceOwners;
    }
    /**
     * Whether the filter should return TRUE for owners of a particular resource
Only applies to policies of type METADATA, which have a resource associated with them
     */
    public void setResourceOwners(boolean resourceOwners) {
        this.resourceOwners = resourceOwners;
    }

    /**
     * Set of OwnershipTypes to apply the policy to (if resourceOwners field is set to True)
     */
    public java.util.List<String> getResourceOwnersTypes() {
        return resourceOwnersTypes;
    }
    /**
     * Set of OwnershipTypes to apply the policy to (if resourceOwners field is set to True)
     */
    public void setResourceOwnersTypes(java.util.List<String> resourceOwnersTypes) {
        this.resourceOwnersTypes = resourceOwnersTypes;
    }

    /**
     * Set of OwnershipTypes to apply the policy to (if resourceOwners field is set to True), resolved.
     */
    public java.util.List<OwnershipTypeEntity> getResolvedOwnershipTypes() {
        return resolvedOwnershipTypes;
    }
    /**
     * Set of OwnershipTypes to apply the policy to (if resourceOwners field is set to True), resolved.
     */
    public void setResolvedOwnershipTypes(java.util.List<OwnershipTypeEntity> resolvedOwnershipTypes) {
        this.resolvedOwnershipTypes = resolvedOwnershipTypes;
    }

    /**
     * Whether the filter should apply to all users
     */
    public boolean getAllUsers() {
        return allUsers;
    }
    /**
     * Whether the filter should apply to all users
     */
    public void setAllUsers(boolean allUsers) {
        this.allUsers = allUsers;
    }

    /**
     * Whether the filter should apply to all groups
     */
    public boolean getAllGroups() {
        return allGroups;
    }
    /**
     * Whether the filter should apply to all groups
     */
    public void setAllGroups(boolean allGroups) {
        this.allGroups = allGroups;
    }

    /**
     * The list of users on the Policy, resolved.
     */
    public java.util.List<CorpUser> getResolvedUsers() {
        return resolvedUsers;
    }
    /**
     * The list of users on the Policy, resolved.
     */
    public void setResolvedUsers(java.util.List<CorpUser> resolvedUsers) {
        this.resolvedUsers = resolvedUsers;
    }

    /**
     * The list of groups on the Policy, resolved.
     */
    public java.util.List<CorpGroup> getResolvedGroups() {
        return resolvedGroups;
    }
    /**
     * The list of groups on the Policy, resolved.
     */
    public void setResolvedGroups(java.util.List<CorpGroup> resolvedGroups) {
        this.resolvedGroups = resolvedGroups;
    }

    /**
     * The list of roles on the Policy, resolved.
     */
    public java.util.List<DataHubRole> getResolvedRoles() {
        return resolvedRoles;
    }
    /**
     * The list of roles on the Policy, resolved.
     */
    public void setResolvedRoles(java.util.List<DataHubRole> resolvedRoles) {
        this.resolvedRoles = resolvedRoles;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (users != null) {
            joiner.add("users: " + users);
        }
        if (groups != null) {
            joiner.add("groups: " + groups);
        }
        if (roles != null) {
            joiner.add("roles: " + roles);
        }
        joiner.add("resourceOwners: " + resourceOwners);
        if (resourceOwnersTypes != null) {
            joiner.add("resourceOwnersTypes: " + resourceOwnersTypes);
        }
        if (resolvedOwnershipTypes != null) {
            joiner.add("resolvedOwnershipTypes: " + resolvedOwnershipTypes);
        }
        joiner.add("allUsers: " + allUsers);
        joiner.add("allGroups: " + allGroups);
        if (resolvedUsers != null) {
            joiner.add("resolvedUsers: " + resolvedUsers);
        }
        if (resolvedGroups != null) {
            joiner.add("resolvedGroups: " + resolvedGroups);
        }
        if (resolvedRoles != null) {
            joiner.add("resolvedRoles: " + resolvedRoles);
        }
        return joiner.toString();
    }

    public static ActorFilter.Builder builder() {
        return new ActorFilter.Builder();
    }

    public static class Builder {

        private java.util.List<String> users;
        private java.util.List<String> groups;
        private java.util.List<String> roles;
        private boolean resourceOwners;
        private java.util.List<String> resourceOwnersTypes;
        private java.util.List<OwnershipTypeEntity> resolvedOwnershipTypes;
        private boolean allUsers;
        private boolean allGroups;
        private java.util.List<CorpUser> resolvedUsers;
        private java.util.List<CorpGroup> resolvedGroups;
        private java.util.List<DataHubRole> resolvedRoles;

        public Builder() {
        }

        /**
         * A disjunctive set of users to apply the policy to
         */
        public Builder setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }

        /**
         * A disjunctive set of groups to apply the policy to
         */
        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * A disjunctive set of roles to apply the policy to
         */
        public Builder setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }

        /**
         * Whether the filter should return TRUE for owners of a particular resource
Only applies to policies of type METADATA, which have a resource associated with them
         */
        public Builder setResourceOwners(boolean resourceOwners) {
            this.resourceOwners = resourceOwners;
            return this;
        }

        /**
         * Set of OwnershipTypes to apply the policy to (if resourceOwners field is set to True)
         */
        public Builder setResourceOwnersTypes(java.util.List<String> resourceOwnersTypes) {
            this.resourceOwnersTypes = resourceOwnersTypes;
            return this;
        }

        /**
         * Set of OwnershipTypes to apply the policy to (if resourceOwners field is set to True), resolved.
         */
        public Builder setResolvedOwnershipTypes(java.util.List<OwnershipTypeEntity> resolvedOwnershipTypes) {
            this.resolvedOwnershipTypes = resolvedOwnershipTypes;
            return this;
        }

        /**
         * Whether the filter should apply to all users
         */
        public Builder setAllUsers(boolean allUsers) {
            this.allUsers = allUsers;
            return this;
        }

        /**
         * Whether the filter should apply to all groups
         */
        public Builder setAllGroups(boolean allGroups) {
            this.allGroups = allGroups;
            return this;
        }

        /**
         * The list of users on the Policy, resolved.
         */
        public Builder setResolvedUsers(java.util.List<CorpUser> resolvedUsers) {
            this.resolvedUsers = resolvedUsers;
            return this;
        }

        /**
         * The list of groups on the Policy, resolved.
         */
        public Builder setResolvedGroups(java.util.List<CorpGroup> resolvedGroups) {
            this.resolvedGroups = resolvedGroups;
            return this;
        }

        /**
         * The list of roles on the Policy, resolved.
         */
        public Builder setResolvedRoles(java.util.List<DataHubRole> resolvedRoles) {
            this.resolvedRoles = resolvedRoles;
            return this;
        }


        public ActorFilter build() {
            return new ActorFilter(users, groups, roles, resourceOwners, resourceOwnersTypes, resolvedOwnershipTypes, allUsers, allGroups, resolvedUsers, resolvedGroups, resolvedRoles);
        }

    }
}
