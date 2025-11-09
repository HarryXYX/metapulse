package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to the Search bar
 */
public class HomePageConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private PersonalSidebarSection firstInPersonalSidebar;

    public HomePageConfig() {
    }

    public HomePageConfig(PersonalSidebarSection firstInPersonalSidebar) {
        this.firstInPersonalSidebar = firstInPersonalSidebar;
    }

    /**
     * The section that comes first on the personal sidebar on the homepage
     */
    public PersonalSidebarSection getFirstInPersonalSidebar() {
        return firstInPersonalSidebar;
    }
    /**
     * The section that comes first on the personal sidebar on the homepage
     */
    public void setFirstInPersonalSidebar(PersonalSidebarSection firstInPersonalSidebar) {
        this.firstInPersonalSidebar = firstInPersonalSidebar;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (firstInPersonalSidebar != null) {
            joiner.add("firstInPersonalSidebar: " + firstInPersonalSidebar);
        }
        return joiner.toString();
    }

    public static HomePageConfig.Builder builder() {
        return new HomePageConfig.Builder();
    }

    public static class Builder {

        private PersonalSidebarSection firstInPersonalSidebar;

        public Builder() {
        }

        /**
         * The section that comes first on the personal sidebar on the homepage
         */
        public Builder setFirstInPersonalSidebar(PersonalSidebarSection firstInPersonalSidebar) {
            this.firstInPersonalSidebar = firstInPersonalSidebar;
            return this;
        }


        public HomePageConfig build() {
            return new HomePageConfig(firstInPersonalSidebar);
        }

    }
}
