package com.linkedin.datahub.graphql.generated;

/**
 * The type associated with a single Dataset schema field
 */
public enum SchemaFieldDataType {

    /**
     * A boolean type
     */
    BOOLEAN("BOOLEAN"),
    /**
     * A fixed bytestring type
     */
    FIXED("FIXED"),
    /**
     * A string type
     */
    STRING("STRING"),
    /**
     * A string of bytes
     */
    BYTES("BYTES"),
    /**
     * A number, including integers, floats, and doubles
     */
    NUMBER("NUMBER"),
    /**
     * A datestrings type
     */
    DATE("DATE"),
    /**
     * A timestamp type
     */
    TIME("TIME"),
    /**
     * An enum type
     */
    ENUM("ENUM"),
    /**
     * A NULL type
     */
    NULL("NULL"),
    /**
     * A map collection type
     */
    MAP("MAP"),
    /**
     * An array collection type
     */
    ARRAY("ARRAY"),
    /**
     * An union type
     */
    UNION("UNION"),
    /**
     * An complex struct type
     */
    STRUCT("STRUCT");

    private final String graphqlName;

    private SchemaFieldDataType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
