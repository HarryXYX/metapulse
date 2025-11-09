package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Insights about why a search result was returned or ranked in the way that it was
 */
public class SearchInsight implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String text;
    private String icon;

    public SearchInsight() {
    }

    public SearchInsight(String text, String icon) {
        this.text = text;
        this.icon = icon;
    }

    /**
     * The insight to display
     */
    public String getText() {
        return text;
    }
    /**
     * The insight to display
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * An optional emoji to display in front of the text
     */
    public String getIcon() {
        return icon;
    }
    /**
     * An optional emoji to display in front of the text
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (text != null) {
            joiner.add("text: \"" + text + "\"");
        }
        if (icon != null) {
            joiner.add("icon: \"" + icon + "\"");
        }
        return joiner.toString();
    }

    public static SearchInsight.Builder builder() {
        return new SearchInsight.Builder();
    }

    public static class Builder {

        private String text;
        private String icon;

        public Builder() {
        }

        /**
         * The insight to display
         */
        public Builder setText(String text) {
            this.text = text;
            return this;
        }

        /**
         * An optional emoji to display in front of the text
         */
        public Builder setIcon(String icon) {
            this.icon = icon;
            return this;
        }


        public SearchInsight build() {
            return new SearchInsight(text, icon);
        }

    }
}
