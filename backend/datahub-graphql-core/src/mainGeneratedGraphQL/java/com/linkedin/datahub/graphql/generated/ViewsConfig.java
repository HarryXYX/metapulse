package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to DataHub Views feature
 */
public class ViewsConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean enabled;

    public ViewsConfig() {
    }

    public ViewsConfig(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether Views feature is enabled
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether Views feature is enabled
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

    public static ViewsConfig.Builder builder() {
        return new ViewsConfig.Builder();
    }

    public static class Builder {

        private boolean enabled;

        public Builder() {
        }

        /**
         * Whether Views feature is enabled
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }


        public ViewsConfig build() {
            return new ViewsConfig(enabled);
        }

    }
}
