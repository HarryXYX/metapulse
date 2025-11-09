package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to the Analytics Feature
 */
public class AnalyticsConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean enabled;

    public AnalyticsConfig() {
    }

    public AnalyticsConfig(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether the Analytics feature is enabled and should be displayed
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether the Analytics feature is enabled and should be displayed
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

    public static AnalyticsConfig.Builder builder() {
        return new AnalyticsConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;

        public Builder() {
        }

        /**
         * Whether the Analytics feature is enabled and should be displayed
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public AnalyticsConfig build() {
            return new AnalyticsConfig(enabled);
        }

    }
}
