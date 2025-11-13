package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Token that allows users to sign up as a native user
 */
public class InviteToken implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String inviteToken;

    public InviteToken() {
    }

    public InviteToken(String inviteToken) {
        this.inviteToken = inviteToken;
    }

    /**
     * The invite token
     */
    public String getInviteToken() {
        return inviteToken;
    }
    /**
     * The invite token
     */
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

    public static InviteToken.Builder builder() {
        return new InviteToken.Builder();
    }

    public static class Builder {

        private String inviteToken;

        public Builder() {
        }

        /**
         * The invite token
         */
        public Builder setInviteToken(String inviteToken) {
            this.inviteToken = inviteToken;
            return this;
        }


        public InviteToken build() {
            return new InviteToken(inviteToken);
        }

    }
}
