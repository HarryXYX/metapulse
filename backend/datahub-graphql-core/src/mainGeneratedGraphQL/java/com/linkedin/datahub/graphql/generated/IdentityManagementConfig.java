package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to Identity Management
 */
public class IdentityManagementConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean enabled;

    public IdentityManagementConfig() {
    }

    public IdentityManagementConfig(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether identity management screen is able to be shown in the UI
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether identity management screen is able to be shown in the UI
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("enabled: " + enabled);
        return joiner.toString();
    }

    public static IdentityManagementConfig.Builder builder() {
        return new IdentityManagementConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;

        public Builder() {
        }

        /**
         * Whether identity management screen is able to be shown in the UI
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public IdentityManagementConfig build() {
            return new IdentityManagementConfig(enabled);
        }

    }
}
