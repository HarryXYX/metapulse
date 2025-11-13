package com.linkedin.datahub.graphql.generated;

/**
 * The type of a form. This is optional on a form entity
 */
public enum FormType {

    /**
     * This form is used for "verifying" entities as a state for governance and compliance
     */
    VERIFICATION("VERIFICATION"),
    /**
     * This form is used to help with filling out metadata on entities
     */
    COMPLETION("COMPLETION");

    private final String graphqlName;

    private FormType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
