package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An individual Query Statement
 */
public class QueryStatement implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String value;
    @javax.annotation.Nonnull
    private QueryLanguage language;

    public QueryStatement() {
    }

    public QueryStatement(String value, QueryLanguage language) {
        this.value = value;
        this.language = language;
    }

    /**
     * The query statement value
     */
    public String getValue() {
        return value;
    }
    /**
     * The query statement value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * The language for the Query Statement
     */
    public QueryLanguage getLanguage() {
        return language;
    }
    /**
     * The language for the Query Statement
     */
    public void setLanguage(QueryLanguage language) {
        this.language = language;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (language != null) {
            joiner.add("language: " + language);
        }
        return joiner.toString();
    }

    public static QueryStatement.Builder builder() {
        return new QueryStatement.Builder();
    }

    public static class Builder {

        private String value;
        private QueryLanguage language;

        public Builder() {
        }

        /**
         * The query statement value
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * The language for the Query Statement
         */
        public Builder setLanguage(QueryLanguage language) {
            this.language = language;
            return this;
        }


        public QueryStatement build() {
            return new QueryStatement(value, language);
        }

    }
}
