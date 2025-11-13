package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configuration for an entity profile
 */
public class EntityProfileConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String defaultTab;

    public EntityProfileConfig() {
    }

    public EntityProfileConfig(String defaultTab) {
        this.defaultTab = defaultTab;
    }

    /**
     * The enum value from EntityProfileTab for which tab should be showed by default on
entity profile pages. If null, rely on default sorting from React code.
     */
    public String getDefaultTab() {
        return defaultTab;
    }
    /**
     * The enum value from EntityProfileTab for which tab should be showed by default on
entity profile pages. If null, rely on default sorting from React code.
     */
    public void setDefaultTab(String defaultTab) {
        this.defaultTab = defaultTab;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (defaultTab != null) {
            joiner.add("defaultTab: \"" + defaultTab + "\"");
        }
        return joiner.toString();
    }

    public static EntityProfileConfig.Builder builder() {
        return new EntityProfileConfig.Builder();
    }

    public static class Builder {

        private String defaultTab;

        public Builder() {
        }

        /**
         * The enum value from EntityProfileTab for which tab should be showed by default on
entity profile pages. If null, rely on default sorting from React code.
         */
        public Builder setDefaultTab(String defaultTab) {
            this.defaultTab = defaultTab;
            return this;
        }


        public EntityProfileConfig build() {
            return new EntityProfileConfig(defaultTab);
        }

    }
}
