package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to managed, UI based ingestion
 */
public class ManagedIngestionConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean enabled;

    public ManagedIngestionConfig() {
    }

    public ManagedIngestionConfig(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether ingestion screen is enabled in the UI
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether ingestion screen is enabled in the UI
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

    public static ManagedIngestionConfig.Builder builder() {
        return new ManagedIngestionConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;

        public Builder() {
        }

        /**
         * Whether ingestion screen is enabled in the UI
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public ManagedIngestionConfig build() {
            return new ManagedIngestionConfig(enabled);
        }

    }
}
