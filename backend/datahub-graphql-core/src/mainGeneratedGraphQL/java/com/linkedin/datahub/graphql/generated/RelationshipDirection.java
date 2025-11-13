package com.linkedin.datahub.graphql.generated;

/**
 * Direction between a source and destination node
 */
public enum RelationshipDirection {

    /**
     * A directed edge pointing at the source Entity
     */
    INCOMING("INCOMING"),
    /**
     * A directed edge pointing at the destination Entity
     */
    OUTGOING("OUTGOING");

    private final String graphqlName;

    private RelationshipDirection(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
