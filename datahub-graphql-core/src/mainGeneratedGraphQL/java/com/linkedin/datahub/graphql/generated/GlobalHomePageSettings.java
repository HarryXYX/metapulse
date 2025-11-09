package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Global settings related to the home page for an instance
 */
public class GlobalHomePageSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DataHubPageTemplate defaultTemplate;

    public GlobalHomePageSettings() {
    }

    public GlobalHomePageSettings(DataHubPageTemplate defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }

    /**
     * The default page template for the home page for this instance
     */
    public DataHubPageTemplate getDefaultTemplate() {
        return defaultTemplate;
    }
    /**
     * The default page template for the home page for this instance
     */
    public void setDefaultTemplate(DataHubPageTemplate defaultTemplate) {
        this.defaultTemplate = defaultTemplate;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (defaultTemplate != null) {
            joiner.add("defaultTemplate: " + defaultTemplate);
        }
        return joiner.toString();
    }

    public static GlobalHomePageSettings.Builder builder() {
        return new GlobalHomePageSettings.Builder();
    }

    public static class Builder {

        private DataHubPageTemplate defaultTemplate;

        public Builder() {
        }

        /**
         * The default page template for the home page for this instance
         */
        public Builder setDefaultTemplate(DataHubPageTemplate defaultTemplate) {
            this.defaultTemplate = defaultTemplate;
            return this;
        }


        public GlobalHomePageSettings build() {
            return new GlobalHomePageSettings(defaultTemplate);
        }

    }
}
