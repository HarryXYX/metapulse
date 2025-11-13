package com.linkedin.datahub.graphql.generated;

public enum IconLibrary {

    /**
     * Icons from the Material UI icon library
     */
    MATERIAL("MATERIAL");

    private final String graphqlName;

    private IconLibrary(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
