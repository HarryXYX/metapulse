package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The platform privileges that the currently authenticated user has
 */
public class PlatformPrivileges implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean viewAnalytics;
    private boolean managePolicies;
    private boolean manageIdentities;
    private boolean generatePersonalAccessTokens;
    private boolean createDomains;
    private boolean manageDomains;
    private boolean manageIngestion;
    private boolean manageSecrets;
    private boolean manageTokens;
    private boolean viewTests;
    private boolean manageTests;
    private boolean manageGlossaries;
    private boolean manageUserCredentials;
    private boolean createTags;
    private boolean manageTags;
    private boolean viewManageTags;
    private boolean manageGlobalViews;
    private boolean manageOwnershipTypes;
    private boolean manageGlobalAnnouncements;
    private boolean createBusinessAttributes;
    private boolean manageBusinessAttributes;
    private boolean manageStructuredProperties;
    private boolean viewStructuredPropertiesPage;
    private boolean manageApplications;
    private boolean manageFeatures;
    private boolean manageHomePageTemplates;

    public PlatformPrivileges() {
    }

    public PlatformPrivileges(boolean viewAnalytics, boolean managePolicies, boolean manageIdentities, boolean generatePersonalAccessTokens, boolean createDomains, boolean manageDomains, boolean manageIngestion, boolean manageSecrets, boolean manageTokens, boolean viewTests, boolean manageTests, boolean manageGlossaries, boolean manageUserCredentials, boolean createTags, boolean manageTags, boolean viewManageTags, boolean manageGlobalViews, boolean manageOwnershipTypes, boolean manageGlobalAnnouncements, boolean createBusinessAttributes, boolean manageBusinessAttributes, boolean manageStructuredProperties, boolean viewStructuredPropertiesPage, boolean manageApplications, boolean manageFeatures, boolean manageHomePageTemplates) {
        this.viewAnalytics = viewAnalytics;
        this.managePolicies = managePolicies;
        this.manageIdentities = manageIdentities;
        this.generatePersonalAccessTokens = generatePersonalAccessTokens;
        this.createDomains = createDomains;
        this.manageDomains = manageDomains;
        this.manageIngestion = manageIngestion;
        this.manageSecrets = manageSecrets;
        this.manageTokens = manageTokens;
        this.viewTests = viewTests;
        this.manageTests = manageTests;
        this.manageGlossaries = manageGlossaries;
        this.manageUserCredentials = manageUserCredentials;
        this.createTags = createTags;
        this.manageTags = manageTags;
        this.viewManageTags = viewManageTags;
        this.manageGlobalViews = manageGlobalViews;
        this.manageOwnershipTypes = manageOwnershipTypes;
        this.manageGlobalAnnouncements = manageGlobalAnnouncements;
        this.createBusinessAttributes = createBusinessAttributes;
        this.manageBusinessAttributes = manageBusinessAttributes;
        this.manageStructuredProperties = manageStructuredProperties;
        this.viewStructuredPropertiesPage = viewStructuredPropertiesPage;
        this.manageApplications = manageApplications;
        this.manageFeatures = manageFeatures;
        this.manageHomePageTemplates = manageHomePageTemplates;
    }

    /**
     * Whether the user should be able to view analytics
     */
    public boolean getViewAnalytics() {
        return viewAnalytics;
    }
    /**
     * Whether the user should be able to view analytics
     */
    public void setViewAnalytics(boolean viewAnalytics) {
        this.viewAnalytics = viewAnalytics;
    }

    /**
     * Whether the user should be able to manage policies
     */
    public boolean getManagePolicies() {
        return managePolicies;
    }
    /**
     * Whether the user should be able to manage policies
     */
    public void setManagePolicies(boolean managePolicies) {
        this.managePolicies = managePolicies;
    }

    /**
     * Whether the user should be able to manage users & groups
     */
    public boolean getManageIdentities() {
        return manageIdentities;
    }
    /**
     * Whether the user should be able to manage users & groups
     */
    public void setManageIdentities(boolean manageIdentities) {
        this.manageIdentities = manageIdentities;
    }

    /**
     * Whether the user should be able to generate personal access tokens
     */
    public boolean getGeneratePersonalAccessTokens() {
        return generatePersonalAccessTokens;
    }
    /**
     * Whether the user should be able to generate personal access tokens
     */
    public void setGeneratePersonalAccessTokens(boolean generatePersonalAccessTokens) {
        this.generatePersonalAccessTokens = generatePersonalAccessTokens;
    }

    /**
     * Whether the user should be able to create new Domains
     */
    public boolean getCreateDomains() {
        return createDomains;
    }
    /**
     * Whether the user should be able to create new Domains
     */
    public void setCreateDomains(boolean createDomains) {
        this.createDomains = createDomains;
    }

    /**
     * Whether the user should be able to manage Domains
     */
    public boolean getManageDomains() {
        return manageDomains;
    }
    /**
     * Whether the user should be able to manage Domains
     */
    public void setManageDomains(boolean manageDomains) {
        this.manageDomains = manageDomains;
    }

    /**
     * Whether the user is able to manage UI-based ingestion
     */
    public boolean getManageIngestion() {
        return manageIngestion;
    }
    /**
     * Whether the user is able to manage UI-based ingestion
     */
    public void setManageIngestion(boolean manageIngestion) {
        this.manageIngestion = manageIngestion;
    }

    /**
     * Whether the user is able to manage UI-based secrets
     */
    public boolean getManageSecrets() {
        return manageSecrets;
    }
    /**
     * Whether the user is able to manage UI-based secrets
     */
    public void setManageSecrets(boolean manageSecrets) {
        this.manageSecrets = manageSecrets;
    }

    /**
     * Whether the user should be able to manage tokens on behalf of other users.
     */
    public boolean getManageTokens() {
        return manageTokens;
    }
    /**
     * Whether the user should be able to manage tokens on behalf of other users.
     */
    public void setManageTokens(boolean manageTokens) {
        this.manageTokens = manageTokens;
    }

    /**
     * Whether the user is able to view Tests
     */
    public boolean getViewTests() {
        return viewTests;
    }
    /**
     * Whether the user is able to view Tests
     */
    public void setViewTests(boolean viewTests) {
        this.viewTests = viewTests;
    }

    /**
     * Whether the user is able to manage Tests
     */
    public boolean getManageTests() {
        return manageTests;
    }
    /**
     * Whether the user is able to manage Tests
     */
    public void setManageTests(boolean manageTests) {
        this.manageTests = manageTests;
    }

    /**
     * Whether the user should be able to manage Glossaries
     */
    public boolean getManageGlossaries() {
        return manageGlossaries;
    }
    /**
     * Whether the user should be able to manage Glossaries
     */
    public void setManageGlossaries(boolean manageGlossaries) {
        this.manageGlossaries = manageGlossaries;
    }

    /**
     * Whether the user is able to manage user credentials
     */
    public boolean getManageUserCredentials() {
        return manageUserCredentials;
    }
    /**
     * Whether the user is able to manage user credentials
     */
    public void setManageUserCredentials(boolean manageUserCredentials) {
        this.manageUserCredentials = manageUserCredentials;
    }

    /**
     * Whether the user should be able to create new Tags
     */
    public boolean getCreateTags() {
        return createTags;
    }
    /**
     * Whether the user should be able to create new Tags
     */
    public void setCreateTags(boolean createTags) {
        this.createTags = createTags;
    }

    /**
     * Whether the user should be able to create and delete all Tags
     */
    public boolean getManageTags() {
        return manageTags;
    }
    /**
     * Whether the user should be able to create and delete all Tags
     */
    public void setManageTags(boolean manageTags) {
        this.manageTags = manageTags;
    }

    /**
     * Whether the user should be able to view the tags management page.
     */
    public boolean getViewManageTags() {
        return viewManageTags;
    }
    /**
     * Whether the user should be able to view the tags management page.
     */
    public void setViewManageTags(boolean viewManageTags) {
        this.viewManageTags = viewManageTags;
    }

    /**
     * Whether the user should be able to create, update, and delete global views.
     */
    public boolean getManageGlobalViews() {
        return manageGlobalViews;
    }
    /**
     * Whether the user should be able to create, update, and delete global views.
     */
    public void setManageGlobalViews(boolean manageGlobalViews) {
        this.manageGlobalViews = manageGlobalViews;
    }

    /**
     * Whether the user should be able to create, update, and delete ownership types.
     */
    public boolean getManageOwnershipTypes() {
        return manageOwnershipTypes;
    }
    /**
     * Whether the user should be able to create, update, and delete ownership types.
     */
    public void setManageOwnershipTypes(boolean manageOwnershipTypes) {
        this.manageOwnershipTypes = manageOwnershipTypes;
    }

    /**
     * Whether the user can create and delete posts pinned to the home page.
     */
    public boolean getManageGlobalAnnouncements() {
        return manageGlobalAnnouncements;
    }
    /**
     * Whether the user can create and delete posts pinned to the home page.
     */
    public void setManageGlobalAnnouncements(boolean manageGlobalAnnouncements) {
        this.manageGlobalAnnouncements = manageGlobalAnnouncements;
    }

    /**
     * Whether the user can create Business Attributes.
     */
    public boolean getCreateBusinessAttributes() {
        return createBusinessAttributes;
    }
    /**
     * Whether the user can create Business Attributes.
     */
    public void setCreateBusinessAttributes(boolean createBusinessAttributes) {
        this.createBusinessAttributes = createBusinessAttributes;
    }

    /**
     * Whether the user can manage Business Attributes.
     */
    public boolean getManageBusinessAttributes() {
        return manageBusinessAttributes;
    }
    /**
     * Whether the user can manage Business Attributes.
     */
    public void setManageBusinessAttributes(boolean manageBusinessAttributes) {
        this.manageBusinessAttributes = manageBusinessAttributes;
    }

    /**
     * Whether the user can create, edit, and delete structured properties.
     */
    public boolean getManageStructuredProperties() {
        return manageStructuredProperties;
    }
    /**
     * Whether the user can create, edit, and delete structured properties.
     */
    public void setManageStructuredProperties(boolean manageStructuredProperties) {
        this.manageStructuredProperties = manageStructuredProperties;
    }

    /**
     * Whether the user can view the manage structured properties page.
     */
    public boolean getViewStructuredPropertiesPage() {
        return viewStructuredPropertiesPage;
    }
    /**
     * Whether the user can view the manage structured properties page.
     */
    public void setViewStructuredPropertiesPage(boolean viewStructuredPropertiesPage) {
        this.viewStructuredPropertiesPage = viewStructuredPropertiesPage;
    }

    /**
     * Whether the user can manage applications.
     */
    public boolean getManageApplications() {
        return manageApplications;
    }
    /**
     * Whether the user can manage applications.
     */
    public void setManageApplications(boolean manageApplications) {
        this.manageApplications = manageApplications;
    }

    /**
     * Whether the user can manage platform features.
     */
    public boolean getManageFeatures() {
        return manageFeatures;
    }
    /**
     * Whether the user can manage platform features.
     */
    public void setManageFeatures(boolean manageFeatures) {
        this.manageFeatures = manageFeatures;
    }

    /**
     * Whether the user can manage default home page template.
     */
    public boolean getManageHomePageTemplates() {
        return manageHomePageTemplates;
    }
    /**
     * Whether the user can manage default home page template.
     */
    public void setManageHomePageTemplates(boolean manageHomePageTemplates) {
        this.manageHomePageTemplates = manageHomePageTemplates;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("viewAnalytics: " + viewAnalytics);
        joiner.add("managePolicies: " + managePolicies);
        joiner.add("manageIdentities: " + manageIdentities);
        joiner.add("generatePersonalAccessTokens: " + generatePersonalAccessTokens);
        joiner.add("createDomains: " + createDomains);
        joiner.add("manageDomains: " + manageDomains);
        joiner.add("manageIngestion: " + manageIngestion);
        joiner.add("manageSecrets: " + manageSecrets);
        joiner.add("manageTokens: " + manageTokens);
        joiner.add("viewTests: " + viewTests);
        joiner.add("manageTests: " + manageTests);
        joiner.add("manageGlossaries: " + manageGlossaries);
        joiner.add("manageUserCredentials: " + manageUserCredentials);
        joiner.add("createTags: " + createTags);
        joiner.add("manageTags: " + manageTags);
        joiner.add("viewManageTags: " + viewManageTags);
        joiner.add("manageGlobalViews: " + manageGlobalViews);
        joiner.add("manageOwnershipTypes: " + manageOwnershipTypes);
        joiner.add("manageGlobalAnnouncements: " + manageGlobalAnnouncements);
        joiner.add("createBusinessAttributes: " + createBusinessAttributes);
        joiner.add("manageBusinessAttributes: " + manageBusinessAttributes);
        joiner.add("manageStructuredProperties: " + manageStructuredProperties);
        joiner.add("viewStructuredPropertiesPage: " + viewStructuredPropertiesPage);
        joiner.add("manageApplications: " + manageApplications);
        joiner.add("manageFeatures: " + manageFeatures);
        joiner.add("manageHomePageTemplates: " + manageHomePageTemplates);
        return joiner.toString();
    }

    public static PlatformPrivileges.Builder builder() {
        return new PlatformPrivileges.Builder();
    }

    public static class Builder {

        private boolean viewAnalytics;
        private boolean managePolicies;
        private boolean manageIdentities;
        private boolean generatePersonalAccessTokens;
        private boolean createDomains;
        private boolean manageDomains;
        private boolean manageIngestion;
        private boolean manageSecrets;
        private boolean manageTokens;
        private boolean viewTests;
        private boolean manageTests;
        private boolean manageGlossaries;
        private boolean manageUserCredentials;
        private boolean createTags;
        private boolean manageTags;
        private boolean viewManageTags;
        private boolean manageGlobalViews;
        private boolean manageOwnershipTypes;
        private boolean manageGlobalAnnouncements;
        private boolean createBusinessAttributes;
        private boolean manageBusinessAttributes;
        private boolean manageStructuredProperties;
        private boolean viewStructuredPropertiesPage;
        private boolean manageApplications;
        private boolean manageFeatures;
        private boolean manageHomePageTemplates;

        public Builder() {
        }

        /**
         * Whether the user should be able to view analytics
         */
        public Builder setViewAnalytics(boolean viewAnalytics) {
            this.viewAnalytics = viewAnalytics;
            return this;
        }

        /**
         * Whether the user should be able to manage policies
         */
        public Builder setManagePolicies(boolean managePolicies) {
            this.managePolicies = managePolicies;
            return this;
        }

        /**
         * Whether the user should be able to manage users & groups
         */
        public Builder setManageIdentities(boolean manageIdentities) {
            this.manageIdentities = manageIdentities;
            return this;
        }

        /**
         * Whether the user should be able to generate personal access tokens
         */
        public Builder setGeneratePersonalAccessTokens(boolean generatePersonalAccessTokens) {
            this.generatePersonalAccessTokens = generatePersonalAccessTokens;
            return this;
        }

        /**
         * Whether the user should be able to create new Domains
         */
        public Builder setCreateDomains(boolean createDomains) {
            this.createDomains = createDomains;
            return this;
        }

        /**
         * Whether the user should be able to manage Domains
         */
        public Builder setManageDomains(boolean manageDomains) {
            this.manageDomains = manageDomains;
            return this;
        }

        /**
         * Whether the user is able to manage UI-based ingestion
         */
        public Builder setManageIngestion(boolean manageIngestion) {
            this.manageIngestion = manageIngestion;
            return this;
        }

        /**
         * Whether the user is able to manage UI-based secrets
         */
        public Builder setManageSecrets(boolean manageSecrets) {
            this.manageSecrets = manageSecrets;
            return this;
        }

        /**
         * Whether the user should be able to manage tokens on behalf of other users.
         */
        public Builder setManageTokens(boolean manageTokens) {
            this.manageTokens = manageTokens;
            return this;
        }

        /**
         * Whether the user is able to view Tests
         */
        public Builder setViewTests(boolean viewTests) {
            this.viewTests = viewTests;
            return this;
        }

        /**
         * Whether the user is able to manage Tests
         */
        public Builder setManageTests(boolean manageTests) {
            this.manageTests = manageTests;
            return this;
        }

        /**
         * Whether the user should be able to manage Glossaries
         */
        public Builder setManageGlossaries(boolean manageGlossaries) {
            this.manageGlossaries = manageGlossaries;
            return this;
        }

        /**
         * Whether the user is able to manage user credentials
         */
        public Builder setManageUserCredentials(boolean manageUserCredentials) {
            this.manageUserCredentials = manageUserCredentials;
            return this;
        }

        /**
         * Whether the user should be able to create new Tags
         */
        public Builder setCreateTags(boolean createTags) {
            this.createTags = createTags;
            return this;
        }

        /**
         * Whether the user should be able to create and delete all Tags
         */
        public Builder setManageTags(boolean manageTags) {
            this.manageTags = manageTags;
            return this;
        }

        /**
         * Whether the user should be able to view the tags management page.
         */
        public Builder setViewManageTags(boolean viewManageTags) {
            this.viewManageTags = viewManageTags;
            return this;
        }

        /**
         * Whether the user should be able to create, update, and delete global views.
         */
        public Builder setManageGlobalViews(boolean manageGlobalViews) {
            this.manageGlobalViews = manageGlobalViews;
            return this;
        }

        /**
         * Whether the user should be able to create, update, and delete ownership types.
         */
        public Builder setManageOwnershipTypes(boolean manageOwnershipTypes) {
            this.manageOwnershipTypes = manageOwnershipTypes;
            return this;
        }

        /**
         * Whether the user can create and delete posts pinned to the home page.
         */
        public Builder setManageGlobalAnnouncements(boolean manageGlobalAnnouncements) {
            this.manageGlobalAnnouncements = manageGlobalAnnouncements;
            return this;
        }

        /**
         * Whether the user can create Business Attributes.
         */
        public Builder setCreateBusinessAttributes(boolean createBusinessAttributes) {
            this.createBusinessAttributes = createBusinessAttributes;
            return this;
        }

        /**
         * Whether the user can manage Business Attributes.
         */
        public Builder setManageBusinessAttributes(boolean manageBusinessAttributes) {
            this.manageBusinessAttributes = manageBusinessAttributes;
            return this;
        }

        /**
         * Whether the user can create, edit, and delete structured properties.
         */
        public Builder setManageStructuredProperties(boolean manageStructuredProperties) {
            this.manageStructuredProperties = manageStructuredProperties;
            return this;
        }

        /**
         * Whether the user can view the manage structured properties page.
         */
        public Builder setViewStructuredPropertiesPage(boolean viewStructuredPropertiesPage) {
            this.viewStructuredPropertiesPage = viewStructuredPropertiesPage;
            return this;
        }

        /**
         * Whether the user can manage applications.
         */
        public Builder setManageApplications(boolean manageApplications) {
            this.manageApplications = manageApplications;
            return this;
        }

        /**
         * Whether the user can manage platform features.
         */
        public Builder setManageFeatures(boolean manageFeatures) {
            this.manageFeatures = manageFeatures;
            return this;
        }

        /**
         * Whether the user can manage default home page template.
         */
        public Builder setManageHomePageTemplates(boolean manageHomePageTemplates) {
            this.manageHomePageTemplates = manageHomePageTemplates;
            return this;
        }


        public PlatformPrivileges build() {
            return new PlatformPrivileges(viewAnalytics, managePolicies, manageIdentities, generatePersonalAccessTokens, createDomains, manageDomains, manageIngestion, manageSecrets, manageTokens, viewTests, manageTests, manageGlossaries, manageUserCredentials, createTags, manageTags, viewManageTags, manageGlobalViews, manageOwnershipTypes, manageGlobalAnnouncements, createBusinessAttributes, manageBusinessAttributes, manageStructuredProperties, viewStructuredPropertiesPage, manageApplications, manageFeatures, manageHomePageTemplates);
        }

    }
}
