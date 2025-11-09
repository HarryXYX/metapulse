package com.linkedin.datahub.graphql.generated;

/**
 * A query language / dialect.
 */
public enum QueryLanguage {

    /**
     * Standard ANSI SQL
     */
    SQL("SQL");

    private final String graphqlName;

    private QueryLanguage(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
