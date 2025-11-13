package com.linkedin.datahub.graphql.generated;

/**
 * An individual setting type for a Corp User.
 */
public enum UserSetting {

    /**
     * Show simplified homepage
     */
    SHOW_SIMPLIFIED_HOMEPAGE("SHOW_SIMPLIFIED_HOMEPAGE"),
    /**
     * Show theme v2
     */
    SHOW_THEME_V2("SHOW_THEME_V2");

    private final String graphqlName;

    private UserSetting(String graphqlName) {
        this.graphqlName = graphqlName;
    }

    @Override
    public String toString() {
        return this.graphqlName;
    }

}
