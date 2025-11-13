package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Settings related to the Views feature of DataHub.
 */
public class CorpUserViewsSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DataHubView defaultView;

    public CorpUserViewsSettings() {
    }

    public CorpUserViewsSettings(DataHubView defaultView) {
        this.defaultView = defaultView;
    }

    /**
     * The default view for the User.
     */
    public DataHubView getDefaultView() {
        return defaultView;
    }
    /**
     * The default view for the User.
     */
    public void setDefaultView(DataHubView defaultView) {
        this.defaultView = defaultView;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (defaultView != null) {
            joiner.add("defaultView: " + defaultView);
        }
        return joiner.toString();
    }

    public static CorpUserViewsSettings.Builder builder() {
        return new CorpUserViewsSettings.Builder();
    }

    public static class Builder {

        private DataHubView defaultView;

        public Builder() {
        }

        /**
         * The default view for the User.
         */
        public Builder setDefaultView(DataHubView defaultView) {
            this.defaultView = defaultView;
            return this;
        }


        public CorpUserViewsSettings build() {
            return new CorpUserViewsSettings(defaultView);
        }

    }
}
