package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to remove members from an external DataHub group
 */
public class RemoveGroupMembersInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String groupUrn;
    @javax.annotation.Nonnull
    private java.util.List<String> userUrns;

    public RemoveGroupMembersInput() {
    }

    public RemoveGroupMembersInput(String groupUrn, java.util.List<String> userUrns) {
        this.groupUrn = groupUrn;
        this.userUrns = userUrns;
    }

    public String getGroupUrn() {
        return groupUrn;
    }
    public void setGroupUrn(String groupUrn) {
        this.groupUrn = groupUrn;
    }

    public java.util.List<String> getUserUrns() {
        return userUrns;
    }
    public void setUserUrns(java.util.List<String> userUrns) {
        this.userUrns = userUrns;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (groupUrn != null) {
            joiner.add("groupUrn: \"" + groupUrn + "\"");
        }
        if (userUrns != null) {
            joiner.add("userUrns: " + userUrns);
        }
        return joiner.toString();
    }

    public static RemoveGroupMembersInput.Builder builder() {
        return new RemoveGroupMembersInput.Builder();
    }

    public static class Builder {

        private String groupUrn;
        private java.util.List<String> userUrns;

        public Builder() {
        }

        public Builder setGroupUrn(String groupUrn) {
            this.groupUrn = groupUrn;
            return this;
        }

        public Builder setUserUrns(java.util.List<String> userUrns) {
            this.userUrns = userUrns;
            return this;
        }


        public RemoveGroupMembersInput build() {
            return new RemoveGroupMembersInput(groupUrn, userUrns);
        }

    }
}
