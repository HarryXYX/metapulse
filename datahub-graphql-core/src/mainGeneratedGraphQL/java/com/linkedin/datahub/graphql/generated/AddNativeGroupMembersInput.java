package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to add members to a native DataHub group
 */
public class AddNativeGroupMembersInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String groupUrn;
    @javax.annotation.Nonnull
    private java.util.List<String> userUrns;

    public AddNativeGroupMembersInput() {
    }

    public AddNativeGroupMembersInput(String groupUrn, java.util.List<String> userUrns) {
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

    public static AddNativeGroupMembersInput.Builder builder() {
        return new AddNativeGroupMembersInput.Builder();
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


        public AddNativeGroupMembersInput build() {
            return new AddNativeGroupMembersInput(groupUrn, userUrns);
        }

    }
}
