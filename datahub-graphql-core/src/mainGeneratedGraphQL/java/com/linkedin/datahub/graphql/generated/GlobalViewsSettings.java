package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Global (platform-level) settings related to the Views feature
 */
public class GlobalViewsSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String defaultView;

    public GlobalViewsSettings() {
    }

    public GlobalViewsSettings(String defaultView) {
        this.defaultView = defaultView;
    }

    /**
     * The global default View. If a user does not have a personal default, then
this will be the default view.
     */
    public String getDefaultView() {
        return defaultView;
    }
    /**
     * The global default View. If a user does not have a personal default, then
this will be the default view.
     */
    public void setDefaultView(String defaultView) {
        this.defaultView = defaultView;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (defaultView != null) {
            joiner.add("defaultView: \"" + defaultView + "\"");
        }
        return joiner.toString();
    }

    public static GlobalViewsSettings.Builder builder() {
        return new GlobalViewsSettings.Builder();
    }

    public static class Builder {

        private String defaultView;

        public Builder() {
        }

        /**
         * The global default View. If a user does not have a personal default, then
this will be the default view.
         */
        public Builder setDefaultView(String defaultView) {
            this.defaultView = defaultView;
            return this;
        }


        public GlobalViewsSettings build() {
            return new GlobalViewsSettings(defaultView);
        }

    }
}
