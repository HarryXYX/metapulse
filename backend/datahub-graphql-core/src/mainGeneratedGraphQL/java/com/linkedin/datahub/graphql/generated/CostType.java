package com.linkedin.datahub.graphql.generated;

public enum CostType {

    /**
     * Org Cost Type to which the Cost of this entity should be attributed to
     */
    ORG_COST_TYPE("ORG_COST_TYPE");

    private final String graphqlName;

    private CostType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
