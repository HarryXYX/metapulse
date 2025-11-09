package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about the currently authenticated user
 */
public class AuthenticatedUser implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private CorpUser corpUser;
    @javax.annotation.Nonnull
    private PlatformPrivileges platformPrivileges;

    public AuthenticatedUser() {
    }

    public AuthenticatedUser(CorpUser corpUser, PlatformPrivileges platformPrivileges) {
        this.corpUser = corpUser;
        this.platformPrivileges = platformPrivileges;
    }

    /**
     * The user information associated with the authenticated user, including properties used in rendering the profile
     */
    public CorpUser getCorpUser() {
        return corpUser;
    }
    /**
     * The user information associated with the authenticated user, including properties used in rendering the profile
     */
    public void setCorpUser(CorpUser corpUser) {
        this.corpUser = corpUser;
    }

    /**
     * The privileges assigned to the currently authenticated user, which dictates which parts of the UI they should be able to use
     */
    public PlatformPrivileges getPlatformPrivileges() {
        return platformPrivileges;
    }
    /**
     * The privileges assigned to the currently authenticated user, which dictates which parts of the UI they should be able to use
     */
    public void setPlatformPrivileges(PlatformPrivileges platformPrivileges) {
        this.platformPrivileges = platformPrivileges;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (corpUser != null) {
            joiner.add("corpUser: " + corpUser);
        }
        if (platformPrivileges != null) {
            joiner.add("platformPrivileges: " + platformPrivileges);
        }
        return joiner.toString();
    }

    public static AuthenticatedUser.Builder builder() {
        return new AuthenticatedUser.Builder();
    }

    public static class Builder {

        private CorpUser corpUser;
        private PlatformPrivileges platformPrivileges;

        public Builder() {
        }

        /**
         * The user information associated with the authenticated user, including properties used in rendering the profile
         */
        public Builder setCorpUser(CorpUser corpUser) {
            this.corpUser = corpUser;
            return this;
        }

        /**
         * The privileges assigned to the currently authenticated user, which dictates which parts of the UI they should be able to use
         */
        public Builder setPlatformPrivileges(PlatformPrivileges platformPrivileges) {
            this.platformPrivileges = platformPrivileges;
            return this;
        }


        public AuthenticatedUser build() {
            return new AuthenticatedUser(corpUser, platformPrivileges);
        }

    }
}
