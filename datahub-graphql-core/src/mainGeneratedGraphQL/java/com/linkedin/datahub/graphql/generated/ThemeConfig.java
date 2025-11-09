package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configuration for any custom theme-ing
 */
public class ThemeConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String themeId;

    public ThemeConfig() {
    }

    public ThemeConfig(String themeId) {
        this.themeId = themeId;
    }

    /**
     * The optional custom theme ID to determine which theme config we use in the frontend
     */
    public String getThemeId() {
        return themeId;
    }
    /**
     * The optional custom theme ID to determine which theme config we use in the frontend
     */
    public void setThemeId(String themeId) {
        this.themeId = themeId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (themeId != null) {
            joiner.add("themeId: \"" + themeId + "\"");
        }
        return joiner.toString();
    }

    public static ThemeConfig.Builder builder() {
        return new ThemeConfig.Builder();
    }

    public static class Builder {

        private String themeId;

        public Builder() {
        }

        /**
         * The optional custom theme ID to determine which theme config we use in the frontend
         */
        public Builder setThemeId(String themeId) {
            this.themeId = themeId;
            return this;
        }


        public ThemeConfig build() {
            return new ThemeConfig(themeId);
        }

    }
}
