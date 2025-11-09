package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to the Search card
 */
public class SearchCardConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean showDescription;

    public SearchCardConfig() {
    }

    public SearchCardConfig(boolean showDescription) {
        this.showDescription = showDescription;
    }

    /**
     * Whether the search card should show description
     */
    public boolean getShowDescription() {
        return showDescription;
    }
    /**
     * Whether the search card should show description
     */
    public void setShowDescription(boolean showDescription) {
        this.showDescription = showDescription;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("showDescription: " + showDescription);
        return joiner.toString();
    }

    public static SearchCardConfig.Builder builder() {
        return new SearchCardConfig.Builder();
    }

    public static class Builder {

        private boolean showDescription;

        public Builder() {
        }

        /**
         * Whether the search card should show description
         */
        public Builder setShowDescription(boolean showDescription) {
            this.showDescription = showDescription;
            return this;
        }


        public SearchCardConfig build() {
            return new SearchCardConfig(showDescription);
        }

    }
}
