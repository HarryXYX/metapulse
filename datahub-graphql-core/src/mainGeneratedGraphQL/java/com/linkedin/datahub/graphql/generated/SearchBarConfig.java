package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to the Search bar
 */
public class SearchBarConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private SearchBarAPI apiVariant;

    public SearchBarConfig() {
    }

    public SearchBarConfig(SearchBarAPI apiVariant) {
        this.apiVariant = apiVariant;
    }

    /**
     * API variant
     */
    public SearchBarAPI getApiVariant() {
        return apiVariant;
    }
    /**
     * API variant
     */
    public void setApiVariant(SearchBarAPI apiVariant) {
        this.apiVariant = apiVariant;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (apiVariant != null) {
            joiner.add("apiVariant: " + apiVariant);
        }
        return joiner.toString();
    }

    public static SearchBarConfig.Builder builder() {
        return new SearchBarConfig.Builder();
    }

    public static class Builder {

        private SearchBarAPI apiVariant;

        public Builder() {
        }

        /**
         * API variant
         */
        public Builder setApiVariant(SearchBarAPI apiVariant) {
            this.apiVariant = apiVariant;
            return this;
        }


        public SearchBarConfig build() {
            return new SearchBarConfig(apiVariant);
        }

    }
}
