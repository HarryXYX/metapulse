package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to auth
 */
public class AuthConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean tokenAuthEnabled;

    public AuthConfig() {
    }

    public AuthConfig(boolean tokenAuthEnabled) {
        this.tokenAuthEnabled = tokenAuthEnabled;
    }

    /**
     * Whether token-based auth is enabled.
     */
    public boolean getTokenAuthEnabled() {
        return tokenAuthEnabled;
    }
    /**
     * Whether token-based auth is enabled.
     */
    public void setTokenAuthEnabled(boolean tokenAuthEnabled) {
        this.tokenAuthEnabled = tokenAuthEnabled;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("tokenAuthEnabled: " + tokenAuthEnabled);
        return joiner.toString();
    }

    public static AuthConfig.Builder builder() {
        return new AuthConfig.Builder();
    }

    public static class Builder {

        private boolean tokenAuthEnabled;

        public Builder() {
        }

        /**
         * Whether token-based auth is enabled.
         */
        public Builder setTokenAuthEnabled(boolean tokenAuthEnabled) {
            this.tokenAuthEnabled = tokenAuthEnabled;
            return this;
        }


        public AuthConfig build() {
            return new AuthConfig(tokenAuthEnabled);
        }

    }
}
