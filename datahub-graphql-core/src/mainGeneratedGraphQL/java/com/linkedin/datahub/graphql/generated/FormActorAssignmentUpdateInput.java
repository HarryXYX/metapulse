package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Update input for assigning a form to actors
 */
public class FormActorAssignmentUpdateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean owners;
    private java.util.List<String> usersToAdd;
    private java.util.List<String> usersToRemove;
    private java.util.List<String> groupsToAdd;
    private java.util.List<String> groupsToRemove;

    public FormActorAssignmentUpdateInput() {
    }

    public FormActorAssignmentUpdateInput(Boolean owners, java.util.List<String> usersToAdd, java.util.List<String> usersToRemove, java.util.List<String> groupsToAdd, java.util.List<String> groupsToRemove) {
        this.owners = owners;
        this.usersToAdd = usersToAdd;
        this.usersToRemove = usersToRemove;
        this.groupsToAdd = groupsToAdd;
        this.groupsToRemove = groupsToRemove;
    }

    public Boolean getOwners() {
        return owners;
    }
    public void setOwners(Boolean owners) {
        this.owners = owners;
    }

    public java.util.List<String> getUsersToAdd() {
        return usersToAdd;
    }
    public void setUsersToAdd(java.util.List<String> usersToAdd) {
        this.usersToAdd = usersToAdd;
    }

    public java.util.List<String> getUsersToRemove() {
        return usersToRemove;
    }
    public void setUsersToRemove(java.util.List<String> usersToRemove) {
        this.usersToRemove = usersToRemove;
    }

    public java.util.List<String> getGroupsToAdd() {
        return groupsToAdd;
    }
    public void setGroupsToAdd(java.util.List<String> groupsToAdd) {
        this.groupsToAdd = groupsToAdd;
    }

    public java.util.List<String> getGroupsToRemove() {
        return groupsToRemove;
    }
    public void setGroupsToRemove(java.util.List<String> groupsToRemove) {
        this.groupsToRemove = groupsToRemove;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (owners != null) {
            joiner.add("owners: " + owners);
        }
        if (usersToAdd != null) {
            joiner.add("usersToAdd: " + usersToAdd);
        }
        if (usersToRemove != null) {
            joiner.add("usersToRemove: " + usersToRemove);
        }
        if (groupsToAdd != null) {
            joiner.add("groupsToAdd: " + groupsToAdd);
        }
        if (groupsToRemove != null) {
            joiner.add("groupsToRemove: " + groupsToRemove);
        }
        return joiner.toString();
    }

    public static FormActorAssignmentUpdateInput.Builder builder() {
        return new FormActorAssignmentUpdateInput.Builder();
    }

    public static class Builder {

        private Boolean owners;
        private java.util.List<String> usersToAdd;
        private java.util.List<String> usersToRemove;
        private java.util.List<String> groupsToAdd;
        private java.util.List<String> groupsToRemove;

        public Builder() {
        }

        public Builder setOwners(Boolean owners) {
            this.owners = owners;
            return this;
        }

        public Builder setUsersToAdd(java.util.List<String> usersToAdd) {
            this.usersToAdd = usersToAdd;
            return this;
        }

        public Builder setUsersToRemove(java.util.List<String> usersToRemove) {
            this.usersToRemove = usersToRemove;
            return this;
        }

        public Builder setGroupsToAdd(java.util.List<String> groupsToAdd) {
            this.groupsToAdd = groupsToAdd;
            return this;
        }

        public Builder setGroupsToRemove(java.util.List<String> groupsToRemove) {
            this.groupsToRemove = groupsToRemove;
            return this;
        }


        public FormActorAssignmentUpdateInput build() {
            return new FormActorAssignmentUpdateInput(owners, usersToAdd, usersToRemove, groupsToAdd, groupsToRemove);
        }

    }
}
