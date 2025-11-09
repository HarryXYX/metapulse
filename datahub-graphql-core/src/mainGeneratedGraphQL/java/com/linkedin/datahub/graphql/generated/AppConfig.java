package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Config loaded at application boot time
This configuration dictates the behavior of the UI, such as which features are enabled or disabled
 */
public class AppConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String appVersion;
    @javax.annotation.Nonnull
    private AuthConfig authConfig;
    @javax.annotation.Nonnull
    private AnalyticsConfig analyticsConfig;
    @javax.annotation.Nonnull
    private PoliciesConfig policiesConfig;
    @javax.annotation.Nonnull
    private IdentityManagementConfig identityManagementConfig;
    @javax.annotation.Nonnull
    private ManagedIngestionConfig managedIngestionConfig;
    @javax.annotation.Nonnull
    private LineageConfig lineageConfig;
    @javax.annotation.Nonnull
    private VisualConfig visualConfig;
    @javax.annotation.Nonnull
    private TelemetryConfig telemetryConfig;
    @javax.annotation.Nonnull
    private TestsConfig testsConfig;
    @javax.annotation.Nonnull
    private ViewsConfig viewsConfig;
    @javax.annotation.Nonnull
    private SearchBarConfig searchBarConfig;
    @javax.annotation.Nonnull
    private SearchCardConfig searchCardConfig;
    @javax.annotation.Nonnull
    private SearchFlagsConfig searchFlagsConfig;
    @javax.annotation.Nonnull
    private FeatureFlagsConfig featureFlags;
    @javax.annotation.Nonnull
    private ChromeExtensionConfig chromeExtensionConfig;
    @javax.annotation.Nonnull
    private HomePageConfig homePageConfig;

    public AppConfig() {
    }

    public AppConfig(String appVersion, AuthConfig authConfig, AnalyticsConfig analyticsConfig, PoliciesConfig policiesConfig, IdentityManagementConfig identityManagementConfig, ManagedIngestionConfig managedIngestionConfig, LineageConfig lineageConfig, VisualConfig visualConfig, TelemetryConfig telemetryConfig, TestsConfig testsConfig, ViewsConfig viewsConfig, SearchBarConfig searchBarConfig, SearchCardConfig searchCardConfig, SearchFlagsConfig searchFlagsConfig, FeatureFlagsConfig featureFlags, ChromeExtensionConfig chromeExtensionConfig, HomePageConfig homePageConfig) {
        this.appVersion = appVersion;
        this.authConfig = authConfig;
        this.analyticsConfig = analyticsConfig;
        this.policiesConfig = policiesConfig;
        this.identityManagementConfig = identityManagementConfig;
        this.managedIngestionConfig = managedIngestionConfig;
        this.lineageConfig = lineageConfig;
        this.visualConfig = visualConfig;
        this.telemetryConfig = telemetryConfig;
        this.testsConfig = testsConfig;
        this.viewsConfig = viewsConfig;
        this.searchBarConfig = searchBarConfig;
        this.searchCardConfig = searchCardConfig;
        this.searchFlagsConfig = searchFlagsConfig;
        this.featureFlags = featureFlags;
        this.chromeExtensionConfig = chromeExtensionConfig;
        this.homePageConfig = homePageConfig;
    }

    /**
     * App version
     */
    public String getAppVersion() {
        return appVersion;
    }
    /**
     * App version
     */
    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * Auth-related configurations
     */
    public AuthConfig getAuthConfig() {
        return authConfig;
    }
    /**
     * Auth-related configurations
     */
    public void setAuthConfig(AuthConfig authConfig) {
        this.authConfig = authConfig;
    }

    /**
     * Configurations related to the Analytics Feature
     */
    public AnalyticsConfig getAnalyticsConfig() {
        return analyticsConfig;
    }
    /**
     * Configurations related to the Analytics Feature
     */
    public void setAnalyticsConfig(AnalyticsConfig analyticsConfig) {
        this.analyticsConfig = analyticsConfig;
    }

    /**
     * Configurations related to the Policies Feature
     */
    public PoliciesConfig getPoliciesConfig() {
        return policiesConfig;
    }
    /**
     * Configurations related to the Policies Feature
     */
    public void setPoliciesConfig(PoliciesConfig policiesConfig) {
        this.policiesConfig = policiesConfig;
    }

    /**
     * Configurations related to the User & Group management
     */
    public IdentityManagementConfig getIdentityManagementConfig() {
        return identityManagementConfig;
    }
    /**
     * Configurations related to the User & Group management
     */
    public void setIdentityManagementConfig(IdentityManagementConfig identityManagementConfig) {
        this.identityManagementConfig = identityManagementConfig;
    }

    /**
     * Configurations related to UI-based ingestion
     */
    public ManagedIngestionConfig getManagedIngestionConfig() {
        return managedIngestionConfig;
    }
    /**
     * Configurations related to UI-based ingestion
     */
    public void setManagedIngestionConfig(ManagedIngestionConfig managedIngestionConfig) {
        this.managedIngestionConfig = managedIngestionConfig;
    }

    /**
     * Configurations related to Lineage
     */
    public LineageConfig getLineageConfig() {
        return lineageConfig;
    }
    /**
     * Configurations related to Lineage
     */
    public void setLineageConfig(LineageConfig lineageConfig) {
        this.lineageConfig = lineageConfig;
    }

    /**
     * Configurations related to visual appearance, allows styling the UI without rebuilding the bundle
     */
    public VisualConfig getVisualConfig() {
        return visualConfig;
    }
    /**
     * Configurations related to visual appearance, allows styling the UI without rebuilding the bundle
     */
    public void setVisualConfig(VisualConfig visualConfig) {
        this.visualConfig = visualConfig;
    }

    /**
     * Configurations related to tracking users in the app
     */
    public TelemetryConfig getTelemetryConfig() {
        return telemetryConfig;
    }
    /**
     * Configurations related to tracking users in the app
     */
    public void setTelemetryConfig(TelemetryConfig telemetryConfig) {
        this.telemetryConfig = telemetryConfig;
    }

    /**
     * Configurations related to DataHub tests
     */
    public TestsConfig getTestsConfig() {
        return testsConfig;
    }
    /**
     * Configurations related to DataHub tests
     */
    public void setTestsConfig(TestsConfig testsConfig) {
        this.testsConfig = testsConfig;
    }

    /**
     * Configurations related to DataHub Views
     */
    public ViewsConfig getViewsConfig() {
        return viewsConfig;
    }
    /**
     * Configurations related to DataHub Views
     */
    public void setViewsConfig(ViewsConfig viewsConfig) {
        this.viewsConfig = viewsConfig;
    }

    /**
     * Configurations related to the Search bar
     */
    public SearchBarConfig getSearchBarConfig() {
        return searchBarConfig;
    }
    /**
     * Configurations related to the Search bar
     */
    public void setSearchBarConfig(SearchBarConfig searchBarConfig) {
        this.searchBarConfig = searchBarConfig;
    }

    /**
     * Configurations related to the Search card
     */
    public SearchCardConfig getSearchCardConfig() {
        return searchCardConfig;
    }
    /**
     * Configurations related to the Search card
     */
    public void setSearchCardConfig(SearchCardConfig searchCardConfig) {
        this.searchCardConfig = searchCardConfig;
    }

    /**
     * Configurations related the Search Flags
     */
    public SearchFlagsConfig getSearchFlagsConfig() {
        return searchFlagsConfig;
    }
    /**
     * Configurations related the Search Flags
     */
    public void setSearchFlagsConfig(SearchFlagsConfig searchFlagsConfig) {
        this.searchFlagsConfig = searchFlagsConfig;
    }

    /**
     * Feature flags telling the UI whether a feature is enabled or not
     */
    public FeatureFlagsConfig getFeatureFlags() {
        return featureFlags;
    }
    /**
     * Feature flags telling the UI whether a feature is enabled or not
     */
    public void setFeatureFlags(FeatureFlagsConfig featureFlags) {
        this.featureFlags = featureFlags;
    }

    /**
     * Configuration related to the DataHub Chrome Extension
     */
    public ChromeExtensionConfig getChromeExtensionConfig() {
        return chromeExtensionConfig;
    }
    /**
     * Configuration related to the DataHub Chrome Extension
     */
    public void setChromeExtensionConfig(ChromeExtensionConfig chromeExtensionConfig) {
        this.chromeExtensionConfig = chromeExtensionConfig;
    }

    /**
     * Configuration related to the home page
     */
    public HomePageConfig getHomePageConfig() {
        return homePageConfig;
    }
    /**
     * Configuration related to the home page
     */
    public void setHomePageConfig(HomePageConfig homePageConfig) {
        this.homePageConfig = homePageConfig;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (appVersion != null) {
            joiner.add("appVersion: \"" + appVersion + "\"");
        }
        if (authConfig != null) {
            joiner.add("authConfig: " + authConfig);
        }
        if (analyticsConfig != null) {
            joiner.add("analyticsConfig: " + analyticsConfig);
        }
        if (policiesConfig != null) {
            joiner.add("policiesConfig: " + policiesConfig);
        }
        if (identityManagementConfig != null) {
            joiner.add("identityManagementConfig: " + identityManagementConfig);
        }
        if (managedIngestionConfig != null) {
            joiner.add("managedIngestionConfig: " + managedIngestionConfig);
        }
        if (lineageConfig != null) {
            joiner.add("lineageConfig: " + lineageConfig);
        }
        if (visualConfig != null) {
            joiner.add("visualConfig: " + visualConfig);
        }
        if (telemetryConfig != null) {
            joiner.add("telemetryConfig: " + telemetryConfig);
        }
        if (testsConfig != null) {
            joiner.add("testsConfig: " + testsConfig);
        }
        if (viewsConfig != null) {
            joiner.add("viewsConfig: " + viewsConfig);
        }
        if (searchBarConfig != null) {
            joiner.add("searchBarConfig: " + searchBarConfig);
        }
        if (searchCardConfig != null) {
            joiner.add("searchCardConfig: " + searchCardConfig);
        }
        if (searchFlagsConfig != null) {
            joiner.add("searchFlagsConfig: " + searchFlagsConfig);
        }
        if (featureFlags != null) {
            joiner.add("featureFlags: " + featureFlags);
        }
        if (chromeExtensionConfig != null) {
            joiner.add("chromeExtensionConfig: " + chromeExtensionConfig);
        }
        if (homePageConfig != null) {
            joiner.add("homePageConfig: " + homePageConfig);
        }
        return joiner.toString();
    }

    public static AppConfig.Builder builder() {
        return new AppConfig.Builder();
    }

    public static class Builder {

        private String appVersion;
        private AuthConfig authConfig;
        private AnalyticsConfig analyticsConfig;
        private PoliciesConfig policiesConfig;
        private IdentityManagementConfig identityManagementConfig;
        private ManagedIngestionConfig managedIngestionConfig;
        private LineageConfig lineageConfig;
        private VisualConfig visualConfig;
        private TelemetryConfig telemetryConfig;
        private TestsConfig testsConfig;
        private ViewsConfig viewsConfig;
        private SearchBarConfig searchBarConfig;
        private SearchCardConfig searchCardConfig;
        private SearchFlagsConfig searchFlagsConfig;
        private FeatureFlagsConfig featureFlags;
        private ChromeExtensionConfig chromeExtensionConfig;
        private HomePageConfig homePageConfig;

        public Builder() {
        }

        /**
         * App version
         */
        public Builder setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }

        /**
         * Auth-related configurations
         */
        public Builder setAuthConfig(AuthConfig authConfig) {
            this.authConfig = authConfig;
            return this;
        }

        /**
         * Configurations related to the Analytics Feature
         */
        public Builder setAnalyticsConfig(AnalyticsConfig analyticsConfig) {
            this.analyticsConfig = analyticsConfig;
            return this;
        }

        /**
         * Configurations related to the Policies Feature
         */
        public Builder setPoliciesConfig(PoliciesConfig policiesConfig) {
            this.policiesConfig = policiesConfig;
            return this;
        }

        /**
         * Configurations related to the User & Group management
         */
        public Builder setIdentityManagementConfig(IdentityManagementConfig identityManagementConfig) {
            this.identityManagementConfig = identityManagementConfig;
            return this;
        }

        /**
         * Configurations related to UI-based ingestion
         */
        public Builder setManagedIngestionConfig(ManagedIngestionConfig managedIngestionConfig) {
            this.managedIngestionConfig = managedIngestionConfig;
            return this;
        }

        /**
         * Configurations related to Lineage
         */
        public Builder setLineageConfig(LineageConfig lineageConfig) {
            this.lineageConfig = lineageConfig;
            return this;
        }

        /**
         * Configurations related to visual appearance, allows styling the UI without rebuilding the bundle
         */
        public Builder setVisualConfig(VisualConfig visualConfig) {
            this.visualConfig = visualConfig;
            return this;
        }

        /**
         * Configurations related to tracking users in the app
         */
        public Builder setTelemetryConfig(TelemetryConfig telemetryConfig) {
            this.telemetryConfig = telemetryConfig;
            return this;
        }

        /**
         * Configurations related to DataHub tests
         */
        public Builder setTestsConfig(TestsConfig testsConfig) {
            this.testsConfig = testsConfig;
            return this;
        }

        /**
         * Configurations related to DataHub Views
         */
        public Builder setViewsConfig(ViewsConfig viewsConfig) {
            this.viewsConfig = viewsConfig;
            return this;
        }

        /**
         * Configurations related to the Search bar
         */
        public Builder setSearchBarConfig(SearchBarConfig searchBarConfig) {
            this.searchBarConfig = searchBarConfig;
            return this;
        }

        /**
         * Configurations related to the Search card
         */
        public Builder setSearchCardConfig(SearchCardConfig searchCardConfig) {
            this.searchCardConfig = searchCardConfig;
            return this;
        }

        /**
         * Configurations related the Search Flags
         */
        public Builder setSearchFlagsConfig(SearchFlagsConfig searchFlagsConfig) {
            this.searchFlagsConfig = searchFlagsConfig;
            return this;
        }

        /**
         * Feature flags telling the UI whether a feature is enabled or not
         */
        public Builder setFeatureFlags(FeatureFlagsConfig featureFlags) {
            this.featureFlags = featureFlags;
            return this;
        }

        /**
         * Configuration related to the DataHub Chrome Extension
         */
        public Builder setChromeExtensionConfig(ChromeExtensionConfig chromeExtensionConfig) {
            this.chromeExtensionConfig = chromeExtensionConfig;
            return this;
        }

        /**
         * Configuration related to the home page
         */
        public Builder setHomePageConfig(HomePageConfig homePageConfig) {
            this.homePageConfig = homePageConfig;
            return this;
        }


        public AppConfig build() {
            return new AppConfig(appVersion, authConfig, analyticsConfig, policiesConfig, identityManagementConfig, managedIngestionConfig, lineageConfig, visualConfig, telemetryConfig, testsConfig, viewsConfig, searchBarConfig, searchCardConfig, searchFlagsConfig, featureFlags, chromeExtensionConfig, homePageConfig);
        }

    }
}
