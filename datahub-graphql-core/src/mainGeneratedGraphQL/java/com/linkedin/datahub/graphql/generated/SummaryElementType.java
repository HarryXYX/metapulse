package com.linkedin.datahub.graphql.generated;

/**
 * Different types of elements in asset summaries
 */
public enum SummaryElementType {

    CREATED("CREATED"),
    TAGS("TAGS"),
    GLOSSARY_TERMS("GLOSSARY_TERMS"),
    OWNERS("OWNERS"),
    DOMAIN("DOMAIN"),
    STRUCTURED_PROPERTY("STRUCTURED_PROPERTY");

    private final String graphqlName;

    private SummaryElementType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
