package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to DataHub Chrome extension
 */
public class ChromeExtensionConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean enabled;
    private boolean lineageEnabled;

    public ChromeExtensionConfig() {
    }

    public ChromeExtensionConfig(boolean enabled, boolean lineageEnabled) {
        this.enabled = enabled;
        this.lineageEnabled = lineageEnabled;
    }

    /**
     * Whether the Chrome Extension is enabled
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether the Chrome Extension is enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether lineage is enabled
     */
    public boolean getLineageEnabled() {
        return lineageEnabled;
    }
    /**
     * Whether lineage is enabled
     */
    public void setLineageEnabled(boolean lineageEnabled) {
        this.lineageEnabled = lineageEnabled;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("enabled: " + enabled);
        joiner.add("lineageEnabled: " + lineageEnabled);
        return joiner.toString();
    }

    public static ChromeExtensionConfig.Builder builder() {
        return new ChromeExtensionConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;
        private boolean lineageEnabled;

        public Builder() {
        }

        /**
         * Whether the Chrome Extension is enabled
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Whether lineage is enabled
         */
        public Builder setLineageEnabled(boolean lineageEnabled) {
            this.lineageEnabled = lineageEnabled;
            return this;
        }


        public ChromeExtensionConfig build() {
            return new ChromeExtensionConfig(enabled, lineageEnabled);
        }

    }
}
