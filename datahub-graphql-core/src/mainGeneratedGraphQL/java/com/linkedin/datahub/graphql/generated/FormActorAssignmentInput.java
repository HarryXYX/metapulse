package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for assigning a form to actors
 */
public class FormActorAssignmentInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean owners;
    private java.util.List<String> users;
    private java.util.List<String> groups;

    public FormActorAssignmentInput() {
    }

    public FormActorAssignmentInput(Boolean owners, java.util.List<String> users, java.util.List<String> groups) {
        this.owners = owners;
        this.users = users;
        this.groups = groups;
    }

    public Boolean getOwners() {
        return owners;
    }
    public void setOwners(Boolean owners) {
        this.owners = owners;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (owners != null) {
            joiner.add("owners: " + owners);
        }
        if (users != null) {
            joiner.add("users: " + users);
        }
        if (groups != null) {
            joiner.add("groups: " + groups);
        }
        return joiner.toString();
    }

    public static FormActorAssignmentInput.Builder builder() {
        return new FormActorAssignmentInput.Builder();
    }

    public static class Builder {

        private Boolean owners;
        private java.util.List<String> users;
        private java.util.List<String> groups;

        public Builder() {
        }

        public Builder setOwners(Boolean owners) {
            this.owners = owners;
            return this;
        }

        public Builder setUsers(java.util.List<String> users) {
            this.users = users;
            return this;
        }

        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }


        public FormActorAssignmentInput build() {
            return new FormActorAssignmentInput(owners, users, groups);
        }

    }
}
