package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Settings that a user can customize through the datahub ui
 */
public class CorpUserSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CorpUserAppearanceSettings appearance;
    private CorpUserViewsSettings views;
    private CorpUserHomePageSettings homePage;

    public CorpUserSettings() {
    }

    public CorpUserSettings(CorpUserAppearanceSettings appearance, CorpUserViewsSettings views, CorpUserHomePageSettings homePage) {
        this.appearance = appearance;
        this.views = views;
        this.homePage = homePage;
    }

    /**
     * Settings that control look and feel of the DataHub UI for the user
     */
    public CorpUserAppearanceSettings getAppearance() {
        return appearance;
    }
    /**
     * Settings that control look and feel of the DataHub UI for the user
     */
    public void setAppearance(CorpUserAppearanceSettings appearance) {
        this.appearance = appearance;
    }

    /**
     * Settings related to the DataHub Views feature
     */
    public CorpUserViewsSettings getViews() {
        return views;
    }
    /**
     * Settings related to the DataHub Views feature
     */
    public void setViews(CorpUserViewsSettings views) {
        this.views = views;
    }

    /**
     * Settings related to the home page for a user
     */
    public CorpUserHomePageSettings getHomePage() {
        return homePage;
    }
    /**
     * Settings related to the home page for a user
     */
    public void setHomePage(CorpUserHomePageSettings homePage) {
        this.homePage = homePage;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (appearance != null) {
            joiner.add("appearance: " + appearance);
        }
        if (views != null) {
            joiner.add("views: " + views);
        }
        if (homePage != null) {
            joiner.add("homePage: " + homePage);
        }
        return joiner.toString();
    }

    public static CorpUserSettings.Builder builder() {
        return new CorpUserSettings.Builder();
    }

    public static class Builder {

        private CorpUserAppearanceSettings appearance;
        private CorpUserViewsSettings views;
        private CorpUserHomePageSettings homePage;

        public Builder() {
        }

        /**
         * Settings that control look and feel of the DataHub UI for the user
         */
        public Builder setAppearance(CorpUserAppearanceSettings appearance) {
            this.appearance = appearance;
            return this;
        }

        /**
         * Settings related to the DataHub Views feature
         */
        public Builder setViews(CorpUserViewsSettings views) {
            this.views = views;
            return this;
        }

        /**
         * Settings related to the home page for a user
         */
        public Builder setHomePage(CorpUserHomePageSettings homePage) {
            this.homePage = homePage;
            return this;
        }


        public CorpUserSettings build() {
            return new CorpUserSettings(appearance, views, homePage);
        }

    }
}
