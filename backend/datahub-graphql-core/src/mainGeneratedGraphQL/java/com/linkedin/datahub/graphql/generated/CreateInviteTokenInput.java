package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when creating an invite token
 */
public class CreateInviteTokenInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String roleUrn;

    public CreateInviteTokenInput() {
    }

    public CreateInviteTokenInput(String roleUrn) {
        this.roleUrn = roleUrn;
    }

    public String getRoleUrn() {
        return roleUrn;
    }
    public void setRoleUrn(String roleUrn) {
        this.roleUrn = roleUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (roleUrn != null) {
            joiner.add("roleUrn: \"" + roleUrn + "\"");
        }
        return joiner.toString();
    }

    public static CreateInviteTokenInput.Builder builder() {
        return new CreateInviteTokenInput.Builder();
    }

    public static class Builder {

        private String roleUrn;

        public Builder() {
        }

        public Builder setRoleUrn(String roleUrn) {
            this.roleUrn = roleUrn;
            return this;
        }


        public CreateInviteTokenInput build() {
            return new CreateInviteTokenInput(roleUrn);
        }

    }
}
