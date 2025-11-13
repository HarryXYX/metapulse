package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related the Search Flags
 */
public class SearchFlagsConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean defaultSkipHighlighting;

    public SearchFlagsConfig() {
    }

    public SearchFlagsConfig(boolean defaultSkipHighlighting) {
        this.defaultSkipHighlighting = defaultSkipHighlighting;
    }

    /**
     * Default value for skipHighlighting search flag. Currently used in Search Page and Search Bar
     */
    public boolean getDefaultSkipHighlighting() {
        return defaultSkipHighlighting;
    }
    /**
     * Default value for skipHighlighting search flag. Currently used in Search Page and Search Bar
     */
    public void setDefaultSkipHighlighting(boolean defaultSkipHighlighting) {
        this.defaultSkipHighlighting = defaultSkipHighlighting;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("defaultSkipHighlighting: " + defaultSkipHighlighting);
        return joiner.toString();
    }

    public static SearchFlagsConfig.Builder builder() {
        return new SearchFlagsConfig.Builder();
    }

    public static class Builder {

        private boolean defaultSkipHighlighting;

        public Builder() {
        }

        /**
         * Default value for skipHighlighting search flag. Currently used in Search Page and Search Bar
         */
        public Builder setDefaultSkipHighlighting(boolean defaultSkipHighlighting) {
            this.defaultSkipHighlighting = defaultSkipHighlighting;
            return this;
        }


        public SearchFlagsConfig build() {
            return new SearchFlagsConfig(defaultSkipHighlighting);
        }

    }
}
