package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configuration for the queries tab
 */
public class QueriesTabConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer queriesTabResultSize;

    public QueriesTabConfig() {
    }

    public QueriesTabConfig(Integer queriesTabResultSize) {
        this.queriesTabResultSize = queriesTabResultSize;
    }

    /**
     * Number of queries to show in the queries tab
     */
    public Integer getQueriesTabResultSize() {
        return queriesTabResultSize;
    }
    /**
     * Number of queries to show in the queries tab
     */
    public void setQueriesTabResultSize(Integer queriesTabResultSize) {
        this.queriesTabResultSize = queriesTabResultSize;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (queriesTabResultSize != null) {
            joiner.add("queriesTabResultSize: " + queriesTabResultSize);
        }
        return joiner.toString();
    }

    public static QueriesTabConfig.Builder builder() {
        return new QueriesTabConfig.Builder();
    }

    public static class Builder {

        private Integer queriesTabResultSize;

        public Builder() {
        }

        /**
         * Number of queries to show in the queries tab
         */
        public Builder setQueriesTabResultSize(Integer queriesTabResultSize) {
            this.queriesTabResultSize = queriesTabResultSize;
            return this;
        }


        public QueriesTabConfig build() {
            return new QueriesTabConfig(queriesTabResultSize);
        }

    }
}
