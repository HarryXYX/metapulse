package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Settings that control look and feel of the DataHub UI for the user
 */
public class CorpUserAppearanceSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean showSimplifiedHomepage;
    private Boolean showThemeV2;

    public CorpUserAppearanceSettings() {
    }

    public CorpUserAppearanceSettings(Boolean showSimplifiedHomepage, Boolean showThemeV2) {
        this.showSimplifiedHomepage = showSimplifiedHomepage;
        this.showThemeV2 = showThemeV2;
    }

    /**
     * Flag whether the user should see a homepage with only datasets, charts & dashboards. Intended for users
who have less operational use cases for the datahub tool.
     */
    public Boolean getShowSimplifiedHomepage() {
        return showSimplifiedHomepage;
    }
    /**
     * Flag whether the user should see a homepage with only datasets, charts & dashboards. Intended for users
who have less operational use cases for the datahub tool.
     */
    public void setShowSimplifiedHomepage(Boolean showSimplifiedHomepage) {
        this.showSimplifiedHomepage = showSimplifiedHomepage;
    }

    /**
     * Flag controlling whether the V2 UI for DataHub is shown.
     */
    public Boolean getShowThemeV2() {
        return showThemeV2;
    }
    /**
     * Flag controlling whether the V2 UI for DataHub is shown.
     */
    public void setShowThemeV2(Boolean showThemeV2) {
        this.showThemeV2 = showThemeV2;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (showSimplifiedHomepage != null) {
            joiner.add("showSimplifiedHomepage: " + showSimplifiedHomepage);
        }
        if (showThemeV2 != null) {
            joiner.add("showThemeV2: " + showThemeV2);
        }
        return joiner.toString();
    }

    public static CorpUserAppearanceSettings.Builder builder() {
        return new CorpUserAppearanceSettings.Builder();
    }

    public static class Builder {

        private Boolean showSimplifiedHomepage;
        private Boolean showThemeV2;

        public Builder() {
        }

        /**
         * Flag whether the user should see a homepage with only datasets, charts & dashboards. Intended for users
who have less operational use cases for the datahub tool.
         */
        public Builder setShowSimplifiedHomepage(Boolean showSimplifiedHomepage) {
            this.showSimplifiedHomepage = showSimplifiedHomepage;
            return this;
        }

        /**
         * Flag controlling whether the V2 UI for DataHub is shown.
         */
        public Builder setShowThemeV2(Boolean showThemeV2) {
            this.showThemeV2 = showThemeV2;
            return this;
        }


        public CorpUserAppearanceSettings build() {
            return new CorpUserAppearanceSettings(showSimplifiedHomepage, showThemeV2);
        }

    }
}
