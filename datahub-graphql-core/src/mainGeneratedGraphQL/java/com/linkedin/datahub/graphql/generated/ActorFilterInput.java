package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required when creating or updating an Access Policies Determines which actors the Policy applies to
 */
public class ActorFilterInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> users;
    private java.util.List<String> groups;
    private boolean resourceOwners;
    private java.util.List<String> resourceOwnersTypes;
    private boolean allUsers;
    private boolean allGroups;

    public ActorFilterInput() {
    }

    public ActorFilterInput(java.util.List<String> users, java.util.List<String> groups, boolean resourceOwners, java.util.List<String> resourceOwnersTypes, boolean allUsers, boolean allGroups) {
        this.users = users;
        this.groups = groups;
        this.resourceOwners = resourceOwners;
        this.resourceOwnersTypes = resourceOwnersTypes;
        this.allUsers = allUsers;
        this.allGroups = allGroups;
    }

    public java.util.List<String> getUsers() {
        return users;
    }
    public void setUsers(java.util.List<String> users) {
        this.users = users;
    }

    public java.util.List<String> getGroups() {
        return groups;
    }
    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }

    public boolean getResourceOwners() {
        return resourceOwners;
    }
    public void setResourceOwners(boolean resourceOwners) {
        this.resourceOwners = resourceOwners;
    }

    public java.util.List<String> getResourceOwnersTypes() {
        return resourceOwnersTypes;
    }
    public void setResourceOwnersTypes(java.util.List<String> resourceOwnersTypes) {
        this.resourceOwnersTypes = resourceOwnersTypes;
    }

    public boolean getAllUsers() {
        return allUsers;
    }
    public void setAllUsers(boolean allUsers) {
        this.allUsers = allUsers;
    }

    public boolean getAllGroups() {
        return allGroups;
    }
    public void setAllGroups(boolean allGroups) {
        this.allGroups = allGroups;
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
        joiner.add("resourceOwners: " + resourceOwners);
        if (resourceOwnersTypes != null) {
            joiner.add("resourceOwnersTypes: " + resourceOwnersTypes);
        }
        joiner.add("allUsers: " + allUsers);
        joiner.add("allGroups: " + allGroups);
        return joiner.toString();
    }

    public static ActorFilterInput.Builder builder() {
        return new ActorFilterInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> users;
        private java.util.List<String> groups;
        private boolean resourceOwners;
        private java.util.List<String> resourceOwnersTypes;
        private boolean allUsers;
        private boolean allGroups;

        public Builder() {
        }

        public Builder setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }

        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setResourceOwners(boolean resourceOwners) {
            this.resourceOwners = resourceOwners;
            return this;
        }

        public Builder setResourceOwnersTypes(java.util.List<String> resourceOwnersTypes) {
            this.resourceOwnersTypes = resourceOwnersTypes;
            return this;
        }

        public Builder setAllUsers(boolean allUsers) {
            this.allUsers = allUsers;
            return this;
        }

        public Builder setAllGroups(boolean allGroups) {
            this.allGroups = allGroups;
            return this;
        }


        public ActorFilterInput build() {
            return new ActorFilterInput(users, groups, resourceOwners, resourceOwnersTypes, allUsers, allGroups);
        }

    }
}
