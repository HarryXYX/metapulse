package com.linkedin.datahub.graphql.generated;

/**
 * Enum containing the types of page modules that there are
 */
public enum DataHubPageModuleType {

    /**
     * Link type module
     */
    LINK("LINK"),
    /**
     * Module containing rich text to be rendered
     */
    RICH_TEXT("RICH_TEXT"),
    /**
     * A module with a collection of assets
     */
    ASSET_COLLECTION("ASSET_COLLECTION"),
    /**
     * A module displaying a hierarchy to navigate
     */
    HIERARCHY("HIERARCHY"),
    /**
     * Module displaying assets owned by a user
     */
    OWNED_ASSETS("OWNED_ASSETS"),
    /**
     * Module displaying the top domains
     */
    DOMAINS("DOMAINS"),
    /**
     * Module displaying the assets of parent entities
     */
    ASSETS("ASSETS"),
    /**
     * Module displaying the hierarchy of the children of a given entity. Glossary or Domains.
     */
    CHILD_HIERARCHY("CHILD_HIERARCHY"),
    /**
     * Module displaying child data products of a given domain
     */
    DATA_PRODUCTS("DATA_PRODUCTS"),
    /**
     * Module displaying the related terms of a given glossary term
     */
    RELATED_TERMS("RELATED_TERMS"),
    /**
     * Module displaying the platforms in the instance
     */
    PLATFORMS("PLATFORMS");

    private final String graphqlName;

    private DataHubPageModuleType(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
