package com.linkedin.datahub.graphql.generated;

/**
 * A well-supported, standard DataHub Data Type.
 */
public enum StdDataType {

    /**
     * String data type
     */
    STRING("STRING"),
    /**
     * Number data type
     */
    NUMBER("NUMBER"),
    /**
     * Urn data type
     */
    URN("URN"),
    /**
     * Rich text data type. Right now this is markdown only.
     */
    RICH_TEXT("RICH_TEXT"),
    /**
     * Date data type in format YYYY-MM-DD
     */
    DATE("DATE"),
    /**
     * Any other data type - refer to a provided data type urn.
     */
    OTHER("OTHER");

    private final String graphqlName;

    private StdDataType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
