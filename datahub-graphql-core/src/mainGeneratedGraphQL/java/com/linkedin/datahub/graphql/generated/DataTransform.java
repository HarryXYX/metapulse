package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about a transformation applied to data assets
 */
public class DataTransform implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private QueryStatement queryStatement;

    public DataTransform() {
    }

    public DataTransform(QueryStatement queryStatement) {
        this.queryStatement = queryStatement;
    }

    /**
     * The transformation may be defined by a query statement
     */
    public QueryStatement getQueryStatement() {
        return queryStatement;
    }
    /**
     * The transformation may be defined by a query statement
     */
    public void setQueryStatement(QueryStatement queryStatement) {
        this.queryStatement = queryStatement;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (queryStatement != null) {
            joiner.add("queryStatement: " + queryStatement);
        }
        return joiner.toString();
    }

    public static DataTransform.Builder builder() {
        return new DataTransform.Builder();
    }

    public static class Builder {

        private QueryStatement queryStatement;

        public Builder() {
        }

        /**
         * The transformation may be defined by a query statement
         */
        public Builder setQueryStatement(QueryStatement queryStatement) {
            this.queryStatement = queryStatement;
            return this;
        }


        public DataTransform build() {
            return new DataTransform(queryStatement);
        }

    }
}
