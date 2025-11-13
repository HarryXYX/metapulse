package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when accepting a DataHub role using an invite token
 */
public class AcceptRoleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String inviteToken;

    public AcceptRoleInput() {
    }

    public AcceptRoleInput(String inviteToken) {
        this.inviteToken = inviteToken;
    }

    public String getInviteToken() {
        return inviteToken;
    }
    public void setInviteToken(String inviteToken) {
        this.inviteToken = inviteToken;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (inviteToken != null) {
            joiner.add("inviteToken: \"" + inviteToken + "\"");
        }
        return joiner.toString();
    }

    public static AcceptRoleInput.Builder builder() {
        return new AcceptRoleInput.Builder();
    }

    public static class Builder {

        private String inviteToken;

        public Builder() {
        }

        public Builder setInviteToken(String inviteToken) {
            this.inviteToken = inviteToken;
            return this;
        }


        public AcceptRoleInput build() {
            return new AcceptRoleInput(inviteToken);
        }

    }
}
