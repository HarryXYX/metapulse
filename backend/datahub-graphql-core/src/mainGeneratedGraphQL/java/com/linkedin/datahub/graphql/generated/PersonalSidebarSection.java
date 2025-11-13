package com.linkedin.datahub.graphql.generated;

/**
 * Variants of APIs used in the Search bar to get data
 */
public enum PersonalSidebarSection {

    /**
     * The section containing groups you are in
     */
    YOUR_GROUPS("YOUR_GROUPS"),
    /**
     * The section containing assets you own
     */
    YOUR_ASSETS("YOUR_ASSETS"),
    /**
     * The section containing domains you own
     */
    YOUR_DOMAINS("YOUR_DOMAINS"),
    /**
     * The section containing glossary nodes you own
     */
    YOUR_GLOSSARY_NODES("YOUR_GLOSSARY_NODES"),
    /**
     * The section containing tags you own
     */
    YOUR_TAGS("YOUR_TAGS");

    private final String graphqlName;

    private PersonalSidebarSection(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
