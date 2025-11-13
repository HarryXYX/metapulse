package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class Actor implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<RoleUser> users;
    private java.util.List<RoleGroup> groups;

    public Actor() {
    }

    public Actor(java.util.List<RoleUser> users, java.util.List<RoleGroup> groups) {
        this.users = users;
        this.groups = groups;
    }

    /**
     * List of users for which the role is provisioned
     */
    public java.util.List<RoleUser> getUsers() {
        return users;
    }
    /**
     * List of users for which the role is provisioned
     */
    public void setUsers(java.util.List<RoleUser> users) {
        this.users = users;
    }

    /**
     * List of groups for which the role is provisioned
     */
    public java.util.List<RoleGroup> getGroups() {
        return groups;
    }
    /**
     * List of groups for which the role is provisioned
     */
    public void setGroups(java.util.List<RoleGroup> groups) {
        this.groups = groups;
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
        return joiner.toString();
    }

    public static Actor.Builder builder() {
        return new Actor.Builder();
    }

    public static class Builder {

        private java.util.List<RoleUser> users;
        private java.util.List<RoleGroup> groups;

        public Builder() {
        }

        /**
         * List of users for which the role is provisioned
         */
        public Builder setUsers(java.util.List<RoleUser> users) {
            this.users = users;
            return this;
        }

        /**
         * List of groups for which the role is provisioned
         */
        public Builder setGroups(java.util.List<RoleGroup> groups) {
            this.groups = groups;
            return this;
        }


        public Actor build() {
            return new Actor(users, groups);
        }

    }
}
