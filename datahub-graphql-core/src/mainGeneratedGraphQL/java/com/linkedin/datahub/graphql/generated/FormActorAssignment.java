package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class FormActorAssignment implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean owners;
    private java.util.List<CorpUser> users;
    private java.util.List<CorpGroup> groups;
    private boolean isAssignedToMe;

    public FormActorAssignment() {
    }

    public FormActorAssignment(boolean owners, java.util.List<CorpUser> users, java.util.List<CorpGroup> groups, boolean isAssignedToMe) {
        this.owners = owners;
        this.users = users;
        this.groups = groups;
        this.isAssignedToMe = isAssignedToMe;
    }

    /**
     * Whether the form should be completed by owners of the assets which the form is applied to.
     */
    public boolean getOwners() {
        return owners;
    }
    /**
     * Whether the form should be completed by owners of the assets which the form is applied to.
     */
    public void setOwners(boolean owners) {
        this.owners = owners;
    }

    /**
     * Urns of the users that the form is assigned to. If null, then no users are specifically targeted.
     */
    public java.util.List<CorpUser> getUsers() {
        return users;
    }
    /**
     * Urns of the users that the form is assigned to. If null, then no users are specifically targeted.
     */
    public void setUsers(java.util.List<CorpUser> users) {
        this.users = users;
    }

    /**
     * Groups that the form is assigned to. If null, then no groups are specifically targeted.
     */
    public java.util.List<CorpGroup> getGroups() {
        return groups;
    }
    /**
     * Groups that the form is assigned to. If null, then no groups are specifically targeted.
     */
    public void setGroups(java.util.List<CorpGroup> groups) {
        this.groups = groups;
    }

    /**
     * Whether or not the current actor is universally assigned to this form, either by user or by group.
Note that this does not take into account entity ownership based assignment.
     */
    public boolean getIsAssignedToMe() {
        return isAssignedToMe;
    }
    /**
     * Whether or not the current actor is universally assigned to this form, either by user or by group.
Note that this does not take into account entity ownership based assignment.
     */
    public void setIsAssignedToMe(boolean isAssignedToMe) {
        this.isAssignedToMe = isAssignedToMe;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("owners: " + owners);
        if (users != null) {
            joiner.add("users: " + users);
        }
        if (groups != null) {
            joiner.add("groups: " + groups);
        }
        joiner.add("isAssignedToMe: " + isAssignedToMe);
        return joiner.toString();
    }

    public static FormActorAssignment.Builder builder() {
        return new FormActorAssignment.Builder();
    }

    public static class Builder {

        private boolean owners;
        private java.util.List<CorpUser> users;
        private java.util.List<CorpGroup> groups;
        private boolean isAssignedToMe;

        public Builder() {
        }

        /**
         * Whether the form should be completed by owners of the assets which the form is applied to.
         */
        public Builder setOwners(boolean owners) {
            this.owners = owners;
            return this;
        }

        /**
         * Urns of the users that the form is assigned to. If null, then no users are specifically targeted.
         */
        public Builder setUsers(java.util.List<CorpUser> users) {
            this.users = users;
            return this;
        }

        /**
         * Groups that the form is assigned to. If null, then no groups are specifically targeted.
         */
        public Builder setGroups(java.util.List<CorpGroup> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Whether or not the current actor is universally assigned to this form, either by user or by group.
Note that this does not take into account entity ownership based assignment.
         */
        public Builder setIsAssignedToMe(boolean isAssignedToMe) {
            this.isAssignedToMe = isAssignedToMe;
            return this;
        }


        public FormActorAssignment build() {
            return new FormActorAssignment(owners, users, groups, isAssignedToMe);
        }

    }
}
