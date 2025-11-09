package com.linkedin.datahub.graphql.generated;

/**
 * An environment identifier for a particular Entity, ie staging or production
Note that this model will soon be deprecated in favor of a more general purpose of notion
of data environment
 */
public enum FabricType {

    /**
     * Designates development fabrics
     */
    DEV("DEV"),
    /**
     * Designates testing fabrics
     */
    TEST("TEST"),
    /**
     * Designates quality assurance fabrics
     */
    QA("QA"),
    /**
     * Designates user acceptance testing fabrics
     */
    UAT("UAT"),
    /**
     * Designates early integration fabrics
     */
    EI("EI"),
    /**
     * Designates pre-production fabrics
     */
    PRE("PRE"),
    /**
     * Designates staging fabrics
     */
    STG("STG"),
    /**
     * Designates non-production fabrics
     */
    NON_PROD("NON_PROD"),
    /**
     * Designates production fabrics
     */
    PROD("PROD"),
    /**
     * Designates corporation fabrics
     */
    CORP("CORP"),
    /**
     * Designates review fabrics
     */
    RVW("RVW"),
    /**
     * Designates sandbox fabrics
     */
    SANDBOX("SANDBOX");

    private final String graphqlName;

    private FabricType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
