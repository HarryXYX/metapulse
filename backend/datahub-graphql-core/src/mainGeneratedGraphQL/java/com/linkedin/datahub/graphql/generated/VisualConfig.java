package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to visual appearance of the app
 */
public class VisualConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String logoUrl;
    private String faviconUrl;
    private String appTitle;
    private Boolean hideGlossary;
    private QueriesTabConfig queriesTab;
    private EntityProfilesConfig entityProfiles;
    private SearchResultsVisualConfig searchResult;
    private Boolean showFullTitleInLineage;
    private ThemeConfig theme;
    private ApplicationConfig application;

    public VisualConfig() {
    }

    public VisualConfig(String logoUrl, String faviconUrl, String appTitle, Boolean hideGlossary, QueriesTabConfig queriesTab, EntityProfilesConfig entityProfiles, SearchResultsVisualConfig searchResult, Boolean showFullTitleInLineage, ThemeConfig theme, ApplicationConfig application) {
        this.logoUrl = logoUrl;
        this.faviconUrl = faviconUrl;
        this.appTitle = appTitle;
        this.hideGlossary = hideGlossary;
        this.queriesTab = queriesTab;
        this.entityProfiles = entityProfiles;
        this.searchResult = searchResult;
        this.showFullTitleInLineage = showFullTitleInLineage;
        this.theme = theme;
        this.application = application;
    }

    /**
     * Custom logo url for the homepage & top banner
     */
    public String getLogoUrl() {
        return logoUrl;
    }
    /**
     * Custom logo url for the homepage & top banner
     */
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    /**
     * Custom favicon url for the homepage & top banner
     */
    public String getFaviconUrl() {
        return faviconUrl;
    }
    /**
     * Custom favicon url for the homepage & top banner
     */
    public void setFaviconUrl(String faviconUrl) {
        this.faviconUrl = faviconUrl;
    }

    /**
     * Custom app title to show in the browser tab
     */
    public String getAppTitle() {
        return appTitle;
    }
    /**
     * Custom app title to show in the browser tab
     */
    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
    }

    /**
     * Boolean flag disabling viewing the Business Glossary page for users without the 'Manage Glossaries' privilege
     */
    public Boolean getHideGlossary() {
        return hideGlossary;
    }
    /**
     * Boolean flag disabling viewing the Business Glossary page for users without the 'Manage Glossaries' privilege
     */
    public void setHideGlossary(Boolean hideGlossary) {
        this.hideGlossary = hideGlossary;
    }

    /**
     * Configuration for the queries tab
     */
    public QueriesTabConfig getQueriesTab() {
        return queriesTab;
    }
    /**
     * Configuration for the queries tab
     */
    public void setQueriesTab(QueriesTabConfig queriesTab) {
        this.queriesTab = queriesTab;
    }

    /**
     * Configuration for the queries tab
     */
    public EntityProfilesConfig getEntityProfiles() {
        return entityProfiles;
    }
    /**
     * Configuration for the queries tab
     */
    public void setEntityProfiles(EntityProfilesConfig entityProfiles) {
        this.entityProfiles = entityProfiles;
    }

    /**
     * Configuration for search results
     */
    public SearchResultsVisualConfig getSearchResult() {
        return searchResult;
    }
    /**
     * Configuration for search results
     */
    public void setSearchResult(SearchResultsVisualConfig searchResult) {
        this.searchResult = searchResult;
    }

    /**
     * Show full title in lineage view by default
     */
    public Boolean getShowFullTitleInLineage() {
        return showFullTitleInLineage;
    }
    /**
     * Show full title in lineage view by default
     */
    public void setShowFullTitleInLineage(Boolean showFullTitleInLineage) {
        this.showFullTitleInLineage = showFullTitleInLineage;
    }

    /**
     * Configuration for custom theme-ing
     */
    public ThemeConfig getTheme() {
        return theme;
    }
    /**
     * Configuration for custom theme-ing
     */
    public void setTheme(ThemeConfig theme) {
        this.theme = theme;
    }

    /**
     * Configuration for the application sidebar section
     */
    public ApplicationConfig getApplication() {
        return application;
    }
    /**
     * Configuration for the application sidebar section
     */
    public void setApplication(ApplicationConfig application) {
        this.application = application;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (logoUrl != null) {
            joiner.add("logoUrl: \"" + logoUrl + "\"");
        }
        if (faviconUrl != null) {
            joiner.add("faviconUrl: \"" + faviconUrl + "\"");
        }
        if (appTitle != null) {
            joiner.add("appTitle: \"" + appTitle + "\"");
        }
        if (hideGlossary != null) {
            joiner.add("hideGlossary: " + hideGlossary);
        }
        if (queriesTab != null) {
            joiner.add("queriesTab: " + queriesTab);
        }
        if (entityProfiles != null) {
            joiner.add("entityProfiles: " + entityProfiles);
        }
        if (searchResult != null) {
            joiner.add("searchResult: " + searchResult);
        }
        if (showFullTitleInLineage != null) {
            joiner.add("showFullTitleInLineage: " + showFullTitleInLineage);
        }
        if (theme != null) {
            joiner.add("theme: " + theme);
        }
        if (application != null) {
            joiner.add("application: " + application);
        }
        return joiner.toString();
    }

    public static VisualConfig.Builder builder() {
        return new VisualConfig.Builder();
    }

    public static class Builder {

        private String logoUrl;
        private String faviconUrl;
        private String appTitle;
        private Boolean hideGlossary;
        private QueriesTabConfig queriesTab;
        private EntityProfilesConfig entityProfiles;
        private SearchResultsVisualConfig searchResult;
        private Boolean showFullTitleInLineage;
        private ThemeConfig theme;
        private ApplicationConfig application;

        public Builder() {
        }

        /**
         * Custom logo url for the homepage & top banner
         */
        public Builder setLogoUrl(String logoUrl) {
            this.logoUrl = logoUrl;
            return this;
        }

        /**
         * Custom favicon url for the homepage & top banner
         */
        public Builder setFaviconUrl(String faviconUrl) {
            this.faviconUrl = faviconUrl;
            return this;
        }

        /**
         * Custom app title to show in the browser tab
         */
        public Builder setAppTitle(String appTitle) {
            this.appTitle = appTitle;
            return this;
        }

        /**
         * Boolean flag disabling viewing the Business Glossary page for users without the 'Manage Glossaries' privilege
         */
        public Builder setHideGlossary(Boolean hideGlossary) {
            this.hideGlossary = hideGlossary;
            return this;
        }

        /**
         * Configuration for the queries tab
         */
        public Builder setQueriesTab(QueriesTabConfig queriesTab) {
            this.queriesTab = queriesTab;
            return this;
        }

        /**
         * Configuration for the queries tab
         */
        public Builder setEntityProfiles(EntityProfilesConfig entityProfiles) {
            this.entityProfiles = entityProfiles;
            return this;
        }

        /**
         * Configuration for search results
         */
        public Builder setSearchResult(SearchResultsVisualConfig searchResult) {
            this.searchResult = searchResult;
            return this;
        }

        /**
         * Show full title in lineage view by default
         */
        public Builder setShowFullTitleInLineage(Boolean showFullTitleInLineage) {
            this.showFullTitleInLineage = showFullTitleInLineage;
            return this;
        }

        /**
         * Configuration for custom theme-ing
         */
        public Builder setTheme(ThemeConfig theme) {
            this.theme = theme;
            return this;
        }

        /**
         * Configuration for the application sidebar section
         */
        public Builder setApplication(ApplicationConfig application) {
            this.application = application;
            return this;
        }


        public VisualConfig build() {
            return new VisualConfig(logoUrl, faviconUrl, appTitle, hideGlossary, queriesTab, entityProfiles, searchResult, showFullTitleInLineage, theme, application);
        }

    }
}
