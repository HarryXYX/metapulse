package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when getting an invite token
 */
public class GetInviteTokenInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String roleUrn;

    public GetInviteTokenInput() {
    }

    public GetInviteTokenInput(String roleUrn) {
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

    public static GetInviteTokenInput.Builder builder() {
        return new GetInviteTokenInput.Builder();
    }

    public static class Builder {

        private String roleUrn;

        public Builder() {
        }

        public Builder setRoleUrn(String roleUrn) {
            this.roleUrn = roleUrn;
            return this;
        }


        public GetInviteTokenInput build() {
            return new GetInviteTokenInput(roleUrn);
        }

    }
}
