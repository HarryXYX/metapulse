package com.linkedin.datahub.graphql.generated;

/**
 * Enum of all form prompt types
 */
public enum FormPromptType {

    /**
     * A structured property form prompt type.
     */
    STRUCTURED_PROPERTY("STRUCTURED_PROPERTY"),
    /**
     * A schema field-level structured property form prompt type.
     */
    FIELDS_STRUCTURED_PROPERTY("FIELDS_STRUCTURED_PROPERTY");

    private final String graphqlName;

    private FormPromptType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
