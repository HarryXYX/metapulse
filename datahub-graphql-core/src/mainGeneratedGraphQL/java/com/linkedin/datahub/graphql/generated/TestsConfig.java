package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to DataHub Tests feature
 */
public class TestsConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean enabled;

    public TestsConfig() {
    }

    public TestsConfig(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether Tests feature is enabled
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether Tests feature is enabled
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

    public static TestsConfig.Builder builder() {
        return new TestsConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;

        public Builder() {
        }

        /**
         * Whether Tests feature is enabled
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public TestsConfig build() {
            return new TestsConfig(enabled);
        }

    }
}
