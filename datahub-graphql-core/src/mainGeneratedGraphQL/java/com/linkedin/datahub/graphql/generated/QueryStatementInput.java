package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for creating a Query Statement
 */
public class QueryStatementInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String value;
    @javax.annotation.Nonnull
    private QueryLanguage language;

    public QueryStatementInput() {
    }

    public QueryStatementInput(String value, QueryLanguage language) {
        this.value = value;
        this.language = language;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public QueryLanguage getLanguage() {
        return language;
    }
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

    public static QueryStatementInput.Builder builder() {
        return new QueryStatementInput.Builder();
    }

    public static class Builder {

        private String value;
        private QueryLanguage language;

        public Builder() {
        }

        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        public Builder setLanguage(QueryLanguage language) {
            this.language = language;
            return this;
        }


        public QueryStatementInput build() {
            return new QueryStatementInput(value, language);
        }

    }
}
