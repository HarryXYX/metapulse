package com.linkedin.datahub.graphql.generated;

/**
 * The source of an assertion
 */
public enum AssertionSourceType {

    /**
     * The assertion was defined natively on DataHub by a user.
     */
    NATIVE("NATIVE"),
    /**
     * The assertion was defined and managed externally of DataHub.
     */
    EXTERNAL("EXTERNAL"),
    /**
     * The assertion was inferred, e.g. from offline AI / ML models.
     */
    INFERRED("INFERRED");

    private final String graphqlName;

    private AssertionSourceType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
