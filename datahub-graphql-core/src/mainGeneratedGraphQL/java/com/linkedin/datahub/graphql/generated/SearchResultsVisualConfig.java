package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configuration for a search result
 */
public class SearchResultsVisualConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean enableNameHighlight;

    public SearchResultsVisualConfig() {
    }

    public SearchResultsVisualConfig(Boolean enableNameHighlight) {
        this.enableNameHighlight = enableNameHighlight;
    }

    /**
     * Whether a search result should highlight the name/description if it was matched on those fields.
     */
    public Boolean getEnableNameHighlight() {
        return enableNameHighlight;
    }
    /**
     * Whether a search result should highlight the name/description if it was matched on those fields.
     */
    public void setEnableNameHighlight(Boolean enableNameHighlight) {
        this.enableNameHighlight = enableNameHighlight;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (enableNameHighlight != null) {
            joiner.add("enableNameHighlight: " + enableNameHighlight);
        }
        return joiner.toString();
    }

    public static SearchResultsVisualConfig.Builder builder() {
        return new SearchResultsVisualConfig.Builder();
    }

    public static class Builder {

        private Boolean enableNameHighlight;

        public Builder() {
        }

        /**
         * Whether a search result should highlight the name/description if it was matched on those fields.
         */
        public Builder setEnableNameHighlight(Boolean enableNameHighlight) {
            this.enableNameHighlight = enableNameHighlight;
            return this;
        }


        public SearchResultsVisualConfig build() {
            return new SearchResultsVisualConfig(enableNameHighlight);
        }

    }
}
