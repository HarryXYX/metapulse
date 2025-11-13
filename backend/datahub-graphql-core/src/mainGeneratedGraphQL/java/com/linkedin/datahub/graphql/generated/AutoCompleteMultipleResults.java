package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The results returned on a multi entity autocomplete query
 */
public class AutoCompleteMultipleResults implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String query;
    @javax.annotation.Nonnull
    private java.util.List<AutoCompleteResultForEntity> suggestions;

    public AutoCompleteMultipleResults() {
    }

    public AutoCompleteMultipleResults(String query, java.util.List<AutoCompleteResultForEntity> suggestions) {
        this.query = query;
        this.suggestions = suggestions;
    }

    /**
     * The raw query string
     */
    public String getQuery() {
        return query;
    }
    /**
     * The raw query string
     */
    public void setQuery(String query) {
        this.query = query;
    }

    /**
     * The autocompletion suggestions
     */
    public java.util.List<AutoCompleteResultForEntity> getSuggestions() {
        return suggestions;
    }
    /**
     * The autocompletion suggestions
     */
    public void setSuggestions(java.util.List<AutoCompleteResultForEntity> suggestions) {
        this.suggestions = suggestions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (suggestions != null) {
            joiner.add("suggestions: " + suggestions);
        }
        return joiner.toString();
    }

    public static AutoCompleteMultipleResults.Builder builder() {
        return new AutoCompleteMultipleResults.Builder();
    }

    public static class Builder {

        private String query;
        private java.util.List<AutoCompleteResultForEntity> suggestions;

        public Builder() {
        }

        /**
         * The raw query string
         */
        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        /**
         * The autocompletion suggestions
         */
        public Builder setSuggestions(java.util.List<AutoCompleteResultForEntity> suggestions) {
            this.suggestions = suggestions;
            return this;
        }


        public AutoCompleteMultipleResults build() {
            return new AutoCompleteMultipleResults(query, suggestions);
        }

    }
}
