package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class RoleUser implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private CorpUser user;

    public RoleUser() {
    }

    public RoleUser(CorpUser user) {
        this.user = user;
    }

    /**
     * Linked corp user of a role
     */
    public CorpUser getUser() {
        return user;
    }
    /**
     * Linked corp user of a role
     */
    public void setUser(CorpUser user) {
        this.user = user;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (user != null) {
            joiner.add("user: " + user);
        }
        return joiner.toString();
    }

    public static RoleUser.Builder builder() {
        return new RoleUser.Builder();
    }

    public static class Builder {

        private CorpUser user;

        public Builder() {
        }

        /**
         * Linked corp user of a role
         */
        public Builder setUser(CorpUser user) {
            this.user = user;
            return this;
        }


        public RoleUser build() {
            return new RoleUser(user);
        }

    }
}
