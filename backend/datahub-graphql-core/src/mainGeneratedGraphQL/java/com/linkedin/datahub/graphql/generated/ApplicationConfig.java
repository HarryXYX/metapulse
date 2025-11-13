package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configuration for the application sidebar section
 */
public class ApplicationConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean showSidebarSectionWhenEmpty;
    private Boolean showApplicationInNavigation;

    public ApplicationConfig() {
    }

    public ApplicationConfig(Boolean showSidebarSectionWhenEmpty, Boolean showApplicationInNavigation) {
        this.showSidebarSectionWhenEmpty = showSidebarSectionWhenEmpty;
        this.showApplicationInNavigation = showApplicationInNavigation;
    }

    /**
     * Whether to show the application sidebar section even when empty
     */
    public Boolean getShowSidebarSectionWhenEmpty() {
        return showSidebarSectionWhenEmpty;
    }
    /**
     * Whether to show the application sidebar section even when empty
     */
    public void setShowSidebarSectionWhenEmpty(Boolean showSidebarSectionWhenEmpty) {
        this.showSidebarSectionWhenEmpty = showSidebarSectionWhenEmpty;
    }

    /**
     * Whether to show the application in the navigation sidebar
     */
    public Boolean getShowApplicationInNavigation() {
        return showApplicationInNavigation;
    }
    /**
     * Whether to show the application in the navigation sidebar
     */
    public void setShowApplicationInNavigation(Boolean showApplicationInNavigation) {
        this.showApplicationInNavigation = showApplicationInNavigation;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (showSidebarSectionWhenEmpty != null) {
            joiner.add("showSidebarSectionWhenEmpty: " + showSidebarSectionWhenEmpty);
        }
        if (showApplicationInNavigation != null) {
            joiner.add("showApplicationInNavigation: " + showApplicationInNavigation);
        }
        return joiner.toString();
    }

    public static ApplicationConfig.Builder builder() {
        return new ApplicationConfig.Builder();
    }

    public static class Builder {

        private Boolean showSidebarSectionWhenEmpty;
        private Boolean showApplicationInNavigation;

        public Builder() {
        }

        /**
         * Whether to show the application sidebar section even when empty
         */
        public Builder setShowSidebarSectionWhenEmpty(Boolean showSidebarSectionWhenEmpty) {
            this.showSidebarSectionWhenEmpty = showSidebarSectionWhenEmpty;
            return this;
        }

        /**
         * Whether to show the application in the navigation sidebar
         */
        public Builder setShowApplicationInNavigation(Boolean showApplicationInNavigation) {
            this.showApplicationInNavigation = showApplicationInNavigation;
            return this;
        }


        public ApplicationConfig build() {
            return new ApplicationConfig(showSidebarSectionWhenEmpty, showApplicationInNavigation);
        }

    }
}
