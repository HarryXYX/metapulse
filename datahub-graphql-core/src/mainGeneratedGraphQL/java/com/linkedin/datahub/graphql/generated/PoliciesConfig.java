package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to the Policies Feature
 */
public class PoliciesConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean enabled;
    @javax.annotation.Nonnull
    private java.util.List<Privilege> platformPrivileges;
    @javax.annotation.Nonnull
    private java.util.List<ResourcePrivileges> resourcePrivileges;

    public PoliciesConfig() {
    }

    public PoliciesConfig(boolean enabled, java.util.List<Privilege> platformPrivileges, java.util.List<ResourcePrivileges> resourcePrivileges) {
        this.enabled = enabled;
        this.platformPrivileges = platformPrivileges;
        this.resourcePrivileges = resourcePrivileges;
    }

    /**
     * Whether the policies feature is enabled and should be displayed in the UI
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether the policies feature is enabled and should be displayed in the UI
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * A list of platform privileges to display in the Policy Builder experience
     */
    public java.util.List<Privilege> getPlatformPrivileges() {
        return platformPrivileges;
    }
    /**
     * A list of platform privileges to display in the Policy Builder experience
     */
    public void setPlatformPrivileges(java.util.List<Privilege> platformPrivileges) {
        this.platformPrivileges = platformPrivileges;
    }

    /**
     * A list of resource privileges to display in the Policy Builder experience
     */
    public java.util.List<ResourcePrivileges> getResourcePrivileges() {
        return resourcePrivileges;
    }
    /**
     * A list of resource privileges to display in the Policy Builder experience
     */
    public void setResourcePrivileges(java.util.List<ResourcePrivileges> resourcePrivileges) {
        this.resourcePrivileges = resourcePrivileges;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("enabled: " + enabled);
        if (platformPrivileges != null) {
            joiner.add("platformPrivileges: " + platformPrivileges);
        }
        if (resourcePrivileges != null) {
            joiner.add("resourcePrivileges: " + resourcePrivileges);
        }
        return joiner.toString();
    }

    public static PoliciesConfig.Builder builder() {
        return new PoliciesConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;
        private java.util.List<Privilege> platformPrivileges;
        private java.util.List<ResourcePrivileges> resourcePrivileges;

        public Builder() {
        }

        /**
         * Whether the policies feature is enabled and should be displayed in the UI
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * A list of platform privileges to display in the Policy Builder experience
         */
        public Builder setPlatformPrivileges(java.util.List<Privilege> platformPrivileges) {
            this.platformPrivileges = platformPrivileges;
            return this;
        }

        /**
         * A list of resource privileges to display in the Policy Builder experience
         */
        public Builder setResourcePrivileges(java.util.List<ResourcePrivileges> resourcePrivileges) {
            this.resourcePrivileges = resourcePrivileges;
            return this;
        }


        public PoliciesConfig build() {
            return new PoliciesConfig(enabled, platformPrivileges, resourcePrivileges);
        }

    }
}
