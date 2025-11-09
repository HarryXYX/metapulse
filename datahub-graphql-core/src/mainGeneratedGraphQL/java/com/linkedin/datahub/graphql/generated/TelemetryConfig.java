package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to tracking users in the app
 */
public class TelemetryConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean enableThirdPartyLogging;

    public TelemetryConfig() {
    }

    public TelemetryConfig(Boolean enableThirdPartyLogging) {
        this.enableThirdPartyLogging = enableThirdPartyLogging;
    }

    /**
     * Env variable for whether or not third party logging should be enabled for this instance
     */
    public Boolean getEnableThirdPartyLogging() {
        return enableThirdPartyLogging;
    }
    /**
     * Env variable for whether or not third party logging should be enabled for this instance
     */
    public void setEnableThirdPartyLogging(Boolean enableThirdPartyLogging) {
        this.enableThirdPartyLogging = enableThirdPartyLogging;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (enableThirdPartyLogging != null) {
            joiner.add("enableThirdPartyLogging: " + enableThirdPartyLogging);
        }
        return joiner.toString();
    }

    public static TelemetryConfig.Builder builder() {
        return new TelemetryConfig.Builder();
    }

    public static class Builder {

        private Boolean enableThirdPartyLogging;

        public Builder() {
        }

        /**
         * Env variable for whether or not third party logging should be enabled for this instance
         */
        public Builder setEnableThirdPartyLogging(Boolean enableThirdPartyLogging) {
            this.enableThirdPartyLogging = enableThirdPartyLogging;
            return this;
        }


        public TelemetryConfig build() {
            return new TelemetryConfig(enableThirdPartyLogging);
        }

    }
}
