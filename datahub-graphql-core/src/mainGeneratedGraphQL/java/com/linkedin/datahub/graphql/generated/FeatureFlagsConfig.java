package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Configurations related to DataHub Views feature
 */
public class FeatureFlagsConfig implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean readOnlyModeEnabled;
    private boolean showSearchFiltersV2;
    private boolean showBrowseV2;
    private boolean platformBrowseV2;
    private boolean lineageGraphV2;
    private boolean showAcrylInfo;
    private boolean erModelRelationshipFeatureEnabled;
    private boolean showAccessManagement;
    private boolean nestedDomainsEnabled;
    private boolean businessAttributeEntityEnabled;
    private boolean dataContractsEnabled;
    private boolean editableDatasetNameEnabled;
    private boolean themeV2Enabled;
    private boolean themeV2Default;
    private boolean themeV2Toggleable;
    private boolean schemaFieldCLLEnabled;
    private boolean showSeparateSiblings;
    private boolean showManageStructuredProperties;
    private boolean hideDbtSourceInLineage;
    private boolean schemaFieldLineageIgnoreStatus;
    private boolean showNavBarRedesign;
    private boolean showAutoCompleteResults;
    private boolean entityVersioningEnabled;
    private boolean showHasSiblingsFilter;
    private boolean showSearchBarAutocompleteRedesign;
    private boolean showManageTags;
    private boolean showIntroducePage;
    private boolean showIngestionPageRedesign;
    private boolean showLineageExpandMore;
    private boolean showStatsTabRedesign;
    private boolean showHomePageRedesign;
    private boolean showProductUpdates;
    private boolean lineageGraphV3;
    private boolean logicalModelsEnabled;
    private boolean showHomepageUserRole;
    private boolean showDefaultExternalLinks;
    private boolean assetSummaryPageV1;
    private boolean documentationFileUploadV1;

    public FeatureFlagsConfig() {
    }

    public FeatureFlagsConfig(boolean readOnlyModeEnabled, boolean showSearchFiltersV2, boolean showBrowseV2, boolean platformBrowseV2, boolean lineageGraphV2, boolean showAcrylInfo, boolean erModelRelationshipFeatureEnabled, boolean showAccessManagement, boolean nestedDomainsEnabled, boolean businessAttributeEntityEnabled, boolean dataContractsEnabled, boolean editableDatasetNameEnabled, boolean themeV2Enabled, boolean themeV2Default, boolean themeV2Toggleable, boolean schemaFieldCLLEnabled, boolean showSeparateSiblings, boolean showManageStructuredProperties, boolean hideDbtSourceInLineage, boolean schemaFieldLineageIgnoreStatus, boolean showNavBarRedesign, boolean showAutoCompleteResults, boolean entityVersioningEnabled, boolean showHasSiblingsFilter, boolean showSearchBarAutocompleteRedesign, boolean showManageTags, boolean showIntroducePage, boolean showIngestionPageRedesign, boolean showLineageExpandMore, boolean showStatsTabRedesign, boolean showHomePageRedesign, boolean showProductUpdates, boolean lineageGraphV3, boolean logicalModelsEnabled, boolean showHomepageUserRole, boolean showDefaultExternalLinks, boolean assetSummaryPageV1, boolean documentationFileUploadV1) {
        this.readOnlyModeEnabled = readOnlyModeEnabled;
        this.showSearchFiltersV2 = showSearchFiltersV2;
        this.showBrowseV2 = showBrowseV2;
        this.platformBrowseV2 = platformBrowseV2;
        this.lineageGraphV2 = lineageGraphV2;
        this.showAcrylInfo = showAcrylInfo;
        this.erModelRelationshipFeatureEnabled = erModelRelationshipFeatureEnabled;
        this.showAccessManagement = showAccessManagement;
        this.nestedDomainsEnabled = nestedDomainsEnabled;
        this.businessAttributeEntityEnabled = businessAttributeEntityEnabled;
        this.dataContractsEnabled = dataContractsEnabled;
        this.editableDatasetNameEnabled = editableDatasetNameEnabled;
        this.themeV2Enabled = themeV2Enabled;
        this.themeV2Default = themeV2Default;
        this.themeV2Toggleable = themeV2Toggleable;
        this.schemaFieldCLLEnabled = schemaFieldCLLEnabled;
        this.showSeparateSiblings = showSeparateSiblings;
        this.showManageStructuredProperties = showManageStructuredProperties;
        this.hideDbtSourceInLineage = hideDbtSourceInLineage;
        this.schemaFieldLineageIgnoreStatus = schemaFieldLineageIgnoreStatus;
        this.showNavBarRedesign = showNavBarRedesign;
        this.showAutoCompleteResults = showAutoCompleteResults;
        this.entityVersioningEnabled = entityVersioningEnabled;
        this.showHasSiblingsFilter = showHasSiblingsFilter;
        this.showSearchBarAutocompleteRedesign = showSearchBarAutocompleteRedesign;
        this.showManageTags = showManageTags;
        this.showIntroducePage = showIntroducePage;
        this.showIngestionPageRedesign = showIngestionPageRedesign;
        this.showLineageExpandMore = showLineageExpandMore;
        this.showStatsTabRedesign = showStatsTabRedesign;
        this.showHomePageRedesign = showHomePageRedesign;
        this.showProductUpdates = showProductUpdates;
        this.lineageGraphV3 = lineageGraphV3;
        this.logicalModelsEnabled = logicalModelsEnabled;
        this.showHomepageUserRole = showHomepageUserRole;
        this.showDefaultExternalLinks = showDefaultExternalLinks;
        this.assetSummaryPageV1 = assetSummaryPageV1;
        this.documentationFileUploadV1 = documentationFileUploadV1;
    }

    /**
     * Whether read only mode is enabled on an instance.
Right now this only affects ability to edit user profile image URL but can be extended.
     */
    public boolean getReadOnlyModeEnabled() {
        return readOnlyModeEnabled;
    }
    /**
     * Whether read only mode is enabled on an instance.
Right now this only affects ability to edit user profile image URL but can be extended.
     */
    public void setReadOnlyModeEnabled(boolean readOnlyModeEnabled) {
        this.readOnlyModeEnabled = readOnlyModeEnabled;
    }

    /**
     * Whether search filters V2 should be shown or the default filter side-panel
     */
    public boolean getShowSearchFiltersV2() {
        return showSearchFiltersV2;
    }
    /**
     * Whether search filters V2 should be shown or the default filter side-panel
     */
    public void setShowSearchFiltersV2(boolean showSearchFiltersV2) {
        this.showSearchFiltersV2 = showSearchFiltersV2;
    }

    /**
     * Whether browse V2 sidebar should be shown
     */
    public boolean getShowBrowseV2() {
        return showBrowseV2;
    }
    /**
     * Whether browse V2 sidebar should be shown
     */
    public void setShowBrowseV2(boolean showBrowseV2) {
        this.showBrowseV2 = showBrowseV2;
    }

    /**
     * Whether browse v2 is platform mode, which means that platforms are displayed instead of entity types at the root.
     */
    public boolean getPlatformBrowseV2() {
        return platformBrowseV2;
    }
    /**
     * Whether browse v2 is platform mode, which means that platforms are displayed instead of entity types at the root.
     */
    public void setPlatformBrowseV2(boolean platformBrowseV2) {
        this.platformBrowseV2 = platformBrowseV2;
    }

    /**
     * Whether to show the new lineage visualization.
     */
    public boolean getLineageGraphV2() {
        return lineageGraphV2;
    }
    /**
     * Whether to show the new lineage visualization.
     */
    public void setLineageGraphV2(boolean lineageGraphV2) {
        this.lineageGraphV2 = lineageGraphV2;
    }

    /**
     * Whether we should show CTAs in the UI related to moving to DataHub Cloud by DataHub.
     */
    public boolean getShowAcrylInfo() {
        return showAcrylInfo;
    }
    /**
     * Whether we should show CTAs in the UI related to moving to DataHub Cloud by DataHub.
     */
    public void setShowAcrylInfo(boolean showAcrylInfo) {
        this.showAcrylInfo = showAcrylInfo;
    }

    /**
     * Whether ERModelRelationship Tables Feature should be shown.
     */
    public boolean getErModelRelationshipFeatureEnabled() {
        return erModelRelationshipFeatureEnabled;
    }
    /**
     * Whether ERModelRelationship Tables Feature should be shown.
     */
    public void setErModelRelationshipFeatureEnabled(boolean erModelRelationshipFeatureEnabled) {
        this.erModelRelationshipFeatureEnabled = erModelRelationshipFeatureEnabled;
    }

    /**
     * Whether we should show AccessManagement tab in the datahub UI.
     */
    public boolean getShowAccessManagement() {
        return showAccessManagement;
    }
    /**
     * Whether we should show AccessManagement tab in the datahub UI.
     */
    public void setShowAccessManagement(boolean showAccessManagement) {
        this.showAccessManagement = showAccessManagement;
    }

    /**
     * Enables the nested Domains feature that allows users to have sub-Domains.
If this is off, Domains appear "flat" again.
     */
    public boolean getNestedDomainsEnabled() {
        return nestedDomainsEnabled;
    }
    /**
     * Enables the nested Domains feature that allows users to have sub-Domains.
If this is off, Domains appear "flat" again.
     */
    public void setNestedDomainsEnabled(boolean nestedDomainsEnabled) {
        this.nestedDomainsEnabled = nestedDomainsEnabled;
    }

    /**
     * Whether business attribute entity should be shown
     */
    public boolean getBusinessAttributeEntityEnabled() {
        return businessAttributeEntityEnabled;
    }
    /**
     * Whether business attribute entity should be shown
     */
    public void setBusinessAttributeEntityEnabled(boolean businessAttributeEntityEnabled) {
        this.businessAttributeEntityEnabled = businessAttributeEntityEnabled;
    }

    /**
     * Whether data contracts should be enabled
     */
    public boolean getDataContractsEnabled() {
        return dataContractsEnabled;
    }
    /**
     * Whether data contracts should be enabled
     */
    public void setDataContractsEnabled(boolean dataContractsEnabled) {
        this.dataContractsEnabled = dataContractsEnabled;
    }

    /**
     * Whether dataset names are editable
     */
    public boolean getEditableDatasetNameEnabled() {
        return editableDatasetNameEnabled;
    }
    /**
     * Whether dataset names are editable
     */
    public void setEditableDatasetNameEnabled(boolean editableDatasetNameEnabled) {
        this.editableDatasetNameEnabled = editableDatasetNameEnabled;
    }

    /**
     * Allows the V2 theme to be turned on.
Includes new UX for home page, search, entity profiles, and lineage.
If false, then the V2 experience will be unavailable even if themeV2Default or themeV2Toggleable are true.
     */
    public boolean getThemeV2Enabled() {
        return themeV2Enabled;
    }
    /**
     * Allows the V2 theme to be turned on.
Includes new UX for home page, search, entity profiles, and lineage.
If false, then the V2 experience will be unavailable even if themeV2Default or themeV2Toggleable are true.
     */
    public void setThemeV2Enabled(boolean themeV2Enabled) {
        this.themeV2Enabled = themeV2Enabled;
    }

    /**
     * Sets the default theme to V2.
If `themeV2Toggleable` is set, then users can toggle between V1 and V2.
If not, then the default is the only option.
     */
    public boolean getThemeV2Default() {
        return themeV2Default;
    }
    /**
     * Sets the default theme to V2.
If `themeV2Toggleable` is set, then users can toggle between V1 and V2.
If not, then the default is the only option.
     */
    public void setThemeV2Default(boolean themeV2Default) {
        this.themeV2Default = themeV2Default;
    }

    /**
     * Allows the V2 theme to be toggled by users.
     */
    public boolean getThemeV2Toggleable() {
        return themeV2Toggleable;
    }
    /**
     * Allows the V2 theme to be toggled by users.
     */
    public void setThemeV2Toggleable(boolean themeV2Toggleable) {
        this.themeV2Toggleable = themeV2Toggleable;
    }

    /**
     * Enables links to schema field-level lineage on lineage explorer.
     */
    public boolean getSchemaFieldCLLEnabled() {
        return schemaFieldCLLEnabled;
    }
    /**
     * Enables links to schema field-level lineage on lineage explorer.
     */
    public void setSchemaFieldCLLEnabled(boolean schemaFieldCLLEnabled) {
        this.schemaFieldCLLEnabled = schemaFieldCLLEnabled;
    }

    /**
     * If turned on, all siblings will be separated with no way to get to a "combined" sibling view
     */
    public boolean getShowSeparateSiblings() {
        return showSeparateSiblings;
    }
    /**
     * If turned on, all siblings will be separated with no way to get to a "combined" sibling view
     */
    public void setShowSeparateSiblings(boolean showSeparateSiblings) {
        this.showSeparateSiblings = showSeparateSiblings;
    }

    /**
     * If turned on, show the manage structured properties tab in the govern dropdown
     */
    public boolean getShowManageStructuredProperties() {
        return showManageStructuredProperties;
    }
    /**
     * If turned on, show the manage structured properties tab in the govern dropdown
     */
    public void setShowManageStructuredProperties(boolean showManageStructuredProperties) {
        this.showManageStructuredProperties = showManageStructuredProperties;
    }

    /**
     * If turned on, hides DBT Sources from lineage by:
i) Hiding the source in the lineage graph, if it has no downstreams
ii) Swapping to the source's sibling urn on V2 lineage graph
iii) Representing source sibling as a merged node, with both icons on graph and combined version in sidebar
     */
    public boolean getHideDbtSourceInLineage() {
        return hideDbtSourceInLineage;
    }
    /**
     * If turned on, hides DBT Sources from lineage by:
i) Hiding the source in the lineage graph, if it has no downstreams
ii) Swapping to the source's sibling urn on V2 lineage graph
iii) Representing source sibling as a merged node, with both icons on graph and combined version in sidebar
     */
    public void setHideDbtSourceInLineage(boolean hideDbtSourceInLineage) {
        this.hideDbtSourceInLineage = hideDbtSourceInLineage;
    }

    /**
     * If turned on, schema field lineage will always fetch ghost entities and present them as real
     */
    public boolean getSchemaFieldLineageIgnoreStatus() {
        return schemaFieldLineageIgnoreStatus;
    }
    /**
     * If turned on, schema field lineage will always fetch ghost entities and present them as real
     */
    public void setSchemaFieldLineageIgnoreStatus(boolean schemaFieldLineageIgnoreStatus) {
        this.schemaFieldLineageIgnoreStatus = schemaFieldLineageIgnoreStatus;
    }

    /**
     * If turned on, show the newly designed nav bar in the V2 experience
     */
    public boolean getShowNavBarRedesign() {
        return showNavBarRedesign;
    }
    /**
     * If turned on, show the newly designed nav bar in the V2 experience
     */
    public void setShowNavBarRedesign(boolean showNavBarRedesign) {
        this.showNavBarRedesign = showNavBarRedesign;
    }

    /**
     * If turned on, we display auto complete results. Otherwise, do not.
     */
    public boolean getShowAutoCompleteResults() {
        return showAutoCompleteResults;
    }
    /**
     * If turned on, we display auto complete results. Otherwise, do not.
     */
    public void setShowAutoCompleteResults(boolean showAutoCompleteResults) {
        this.showAutoCompleteResults = showAutoCompleteResults;
    }

    /**
     * If turned on, exposes the versioning feature by allowing users to link entities in the UI.
     */
    public boolean getEntityVersioningEnabled() {
        return entityVersioningEnabled;
    }
    /**
     * If turned on, exposes the versioning feature by allowing users to link entities in the UI.
     */
    public void setEntityVersioningEnabled(boolean entityVersioningEnabled) {
        this.entityVersioningEnabled = entityVersioningEnabled;
    }

    /**
     * If turned on, show the "has siblings" filter in search
     */
    public boolean getShowHasSiblingsFilter() {
        return showHasSiblingsFilter;
    }
    /**
     * If turned on, show the "has siblings" filter in search
     */
    public void setShowHasSiblingsFilter(boolean showHasSiblingsFilter) {
        this.showHasSiblingsFilter = showHasSiblingsFilter;
    }

    /**
     * If turned on, show the redesigned search bar's autocomplete
     */
    public boolean getShowSearchBarAutocompleteRedesign() {
        return showSearchBarAutocompleteRedesign;
    }
    /**
     * If turned on, show the redesigned search bar's autocomplete
     */
    public void setShowSearchBarAutocompleteRedesign(boolean showSearchBarAutocompleteRedesign) {
        this.showSearchBarAutocompleteRedesign = showSearchBarAutocompleteRedesign;
    }

    /**
     * If enabled, users will be able to view the tags management experience
     */
    public boolean getShowManageTags() {
        return showManageTags;
    }
    /**
     * If enabled, users will be able to view the tags management experience
     */
    public void setShowManageTags(boolean showManageTags) {
        this.showManageTags = showManageTags;
    }

    /**
     * If enabled, we will show the introduce page in the V2 UI experience to add a title and select platforms
     */
    public boolean getShowIntroducePage() {
        return showIntroducePage;
    }
    /**
     * If enabled, we will show the introduce page in the V2 UI experience to add a title and select platforms
     */
    public void setShowIntroducePage(boolean showIntroducePage) {
        this.showIntroducePage = showIntroducePage;
    }

    /**
     * If turned on, show the re-designed Ingestions page
     */
    public boolean getShowIngestionPageRedesign() {
        return showIngestionPageRedesign;
    }
    /**
     * If turned on, show the re-designed Ingestions page
     */
    public void setShowIngestionPageRedesign(boolean showIngestionPageRedesign) {
        this.showIngestionPageRedesign = showIngestionPageRedesign;
    }

    /**
     * If enabled, show the expand more button (>>) in the lineage graph
     */
    public boolean getShowLineageExpandMore() {
        return showLineageExpandMore;
    }
    /**
     * If enabled, show the expand more button (>>) in the lineage graph
     */
    public void setShowLineageExpandMore(boolean showLineageExpandMore) {
        this.showLineageExpandMore = showLineageExpandMore;
    }

    /**
     * If turned on, show the re-designed Stats tab on the entity page
     */
    public boolean getShowStatsTabRedesign() {
        return showStatsTabRedesign;
    }
    /**
     * If turned on, show the re-designed Stats tab on the entity page
     */
    public void setShowStatsTabRedesign(boolean showStatsTabRedesign) {
        this.showStatsTabRedesign = showStatsTabRedesign;
    }

    /**
     * If turned on, show the re-designed home page
     */
    public boolean getShowHomePageRedesign() {
        return showHomePageRedesign;
    }
    /**
     * If turned on, show the re-designed home page
     */
    public void setShowHomePageRedesign(boolean showHomePageRedesign) {
        this.showHomePageRedesign = showHomePageRedesign;
    }

    /**
     * Whether product updates on the sidebar is enabled. Will go to oss.
     */
    public boolean getShowProductUpdates() {
        return showProductUpdates;
    }
    /**
     * Whether product updates on the sidebar is enabled. Will go to oss.
     */
    public void setShowProductUpdates(boolean showProductUpdates) {
        this.showProductUpdates = showProductUpdates;
    }

    /**
     * Enables the redesign of the lineage v2 graph
     */
    public boolean getLineageGraphV3() {
        return lineageGraphV3;
    }
    /**
     * Enables the redesign of the lineage v2 graph
     */
    public void setLineageGraphV3(boolean lineageGraphV3) {
        this.lineageGraphV3 = lineageGraphV3;
    }

    /**
     * Enables logical models feature
     */
    public boolean getLogicalModelsEnabled() {
        return logicalModelsEnabled;
    }
    /**
     * Enables logical models feature
     */
    public void setLogicalModelsEnabled(boolean logicalModelsEnabled) {
        this.logicalModelsEnabled = logicalModelsEnabled;
    }

    /**
     * Enables displaying the homepage user role underneath the name. Only available for custom home page.
     */
    public boolean getShowHomepageUserRole() {
        return showHomepageUserRole;
    }
    /**
     * Enables displaying the homepage user role underneath the name. Only available for custom home page.
     */
    public void setShowHomepageUserRole(boolean showHomepageUserRole) {
        this.showHomepageUserRole = showHomepageUserRole;
    }

    /**
     * If enabled, show the default external links on the entity page
     */
    public boolean getShowDefaultExternalLinks() {
        return showDefaultExternalLinks;
    }
    /**
     * If enabled, show the default external links on the entity page
     */
    public void setShowDefaultExternalLinks(boolean showDefaultExternalLinks) {
        this.showDefaultExternalLinks = showDefaultExternalLinks;
    }

    /**
     * Enables displaying the asset summary page
     */
    public boolean getAssetSummaryPageV1() {
        return assetSummaryPageV1;
    }
    /**
     * Enables displaying the asset summary page
     */
    public void setAssetSummaryPageV1(boolean assetSummaryPageV1) {
        this.assetSummaryPageV1 = assetSummaryPageV1;
    }

    /**
     * If enabled, allows uploading of files for documentation.
     */
    public boolean getDocumentationFileUploadV1() {
        return documentationFileUploadV1;
    }
    /**
     * If enabled, allows uploading of files for documentation.
     */
    public void setDocumentationFileUploadV1(boolean documentationFileUploadV1) {
        this.documentationFileUploadV1 = documentationFileUploadV1;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("readOnlyModeEnabled: " + readOnlyModeEnabled);
        joiner.add("showSearchFiltersV2: " + showSearchFiltersV2);
        joiner.add("showBrowseV2: " + showBrowseV2);
        joiner.add("platformBrowseV2: " + platformBrowseV2);
        joiner.add("lineageGraphV2: " + lineageGraphV2);
        joiner.add("showAcrylInfo: " + showAcrylInfo);
        joiner.add("erModelRelationshipFeatureEnabled: " + erModelRelationshipFeatureEnabled);
        joiner.add("showAccessManagement: " + showAccessManagement);
        joiner.add("nestedDomainsEnabled: " + nestedDomainsEnabled);
        joiner.add("businessAttributeEntityEnabled: " + businessAttributeEntityEnabled);
        joiner.add("dataContractsEnabled: " + dataContractsEnabled);
        joiner.add("editableDatasetNameEnabled: " + editableDatasetNameEnabled);
        joiner.add("themeV2Enabled: " + themeV2Enabled);
        joiner.add("themeV2Default: " + themeV2Default);
        joiner.add("themeV2Toggleable: " + themeV2Toggleable);
        joiner.add("schemaFieldCLLEnabled: " + schemaFieldCLLEnabled);
        joiner.add("showSeparateSiblings: " + showSeparateSiblings);
        joiner.add("showManageStructuredProperties: " + showManageStructuredProperties);
        joiner.add("hideDbtSourceInLineage: " + hideDbtSourceInLineage);
        joiner.add("schemaFieldLineageIgnoreStatus: " + schemaFieldLineageIgnoreStatus);
        joiner.add("showNavBarRedesign: " + showNavBarRedesign);
        joiner.add("showAutoCompleteResults: " + showAutoCompleteResults);
        joiner.add("entityVersioningEnabled: " + entityVersioningEnabled);
        joiner.add("showHasSiblingsFilter: " + showHasSiblingsFilter);
        joiner.add("showSearchBarAutocompleteRedesign: " + showSearchBarAutocompleteRedesign);
        joiner.add("showManageTags: " + showManageTags);
        joiner.add("showIntroducePage: " + showIntroducePage);
        joiner.add("showIngestionPageRedesign: " + showIngestionPageRedesign);
        joiner.add("showLineageExpandMore: " + showLineageExpandMore);
        joiner.add("showStatsTabRedesign: " + showStatsTabRedesign);
        joiner.add("showHomePageRedesign: " + showHomePageRedesign);
        joiner.add("showProductUpdates: " + showProductUpdates);
        joiner.add("lineageGraphV3: " + lineageGraphV3);
        joiner.add("logicalModelsEnabled: " + logicalModelsEnabled);
        joiner.add("showHomepageUserRole: " + showHomepageUserRole);
        joiner.add("showDefaultExternalLinks: " + showDefaultExternalLinks);
        joiner.add("assetSummaryPageV1: " + assetSummaryPageV1);
        joiner.add("documentationFileUploadV1: " + documentationFileUploadV1);
        return joiner.toString();
    }

    public static FeatureFlagsConfig.Builder builder() {
        return new FeatureFlagsConfig.Builder();
    }

    public static class Builder {

        private boolean readOnlyModeEnabled;
        private boolean showSearchFiltersV2;
        private boolean showBrowseV2;
        private boolean platformBrowseV2;
        private boolean lineageGraphV2;
        private boolean showAcrylInfo;
        private boolean erModelRelationshipFeatureEnabled;
        private boolean showAccessManagement;
        private boolean nestedDomainsEnabled;
        private boolean businessAttributeEntityEnabled;
        private boolean dataContractsEnabled;
        private boolean editableDatasetNameEnabled;
        private boolean themeV2Enabled;
        private boolean themeV2Default;
        private boolean themeV2Toggleable;
        private boolean schemaFieldCLLEnabled;
        private boolean showSeparateSiblings;
        private boolean showManageStructuredProperties;
        private boolean hideDbtSourceInLineage;
        private boolean schemaFieldLineageIgnoreStatus;
        private boolean showNavBarRedesign;
        private boolean showAutoCompleteResults;
        private boolean entityVersioningEnabled;
        private boolean showHasSiblingsFilter;
        private boolean showSearchBarAutocompleteRedesign;
        private boolean showManageTags;
        private boolean showIntroducePage;
        private boolean showIngestionPageRedesign;
        private boolean showLineageExpandMore;
        private boolean showStatsTabRedesign;
        private boolean showHomePageRedesign;
        private boolean showProductUpdates;
        private boolean lineageGraphV3;
        private boolean logicalModelsEnabled;
        private boolean showHomepageUserRole;
        private boolean showDefaultExternalLinks;
        private boolean assetSummaryPageV1;
        private boolean documentationFileUploadV1;

        public Builder() {
        }

        /**
         * Whether read only mode is enabled on an instance.
Right now this only affects ability to edit user profile image URL but can be extended.
         */
        public Builder setReadOnlyModeEnabled(boolean readOnlyModeEnabled) {
            this.readOnlyModeEnabled = readOnlyModeEnabled;
            return this;
        }

        /**
         * Whether search filters V2 should be shown or the default filter side-panel
         */
        public Builder setShowSearchFiltersV2(boolean showSearchFiltersV2) {
            this.showSearchFiltersV2 = showSearchFiltersV2;
            return this;
        }

        /**
         * Whether browse V2 sidebar should be shown
         */
        public Builder setShowBrowseV2(boolean showBrowseV2) {
            this.showBrowseV2 = showBrowseV2;
            return this;
        }

        /**
         * Whether browse v2 is platform mode, which means that platforms are displayed instead of entity types at the root.
         */
        public Builder setPlatformBrowseV2(boolean platformBrowseV2) {
            this.platformBrowseV2 = platformBrowseV2;
            return this;
        }

        /**
         * Whether to show the new lineage visualization.
         */
        public Builder setLineageGraphV2(boolean lineageGraphV2) {
            this.lineageGraphV2 = lineageGraphV2;
            return this;
        }

        /**
         * Whether we should show CTAs in the UI related to moving to DataHub Cloud by DataHub.
         */
        public Builder setShowAcrylInfo(boolean showAcrylInfo) {
            this.showAcrylInfo = showAcrylInfo;
            return this;
        }

        /**
         * Whether ERModelRelationship Tables Feature should be shown.
         */
        public Builder setErModelRelationshipFeatureEnabled(boolean erModelRelationshipFeatureEnabled) {
            this.erModelRelationshipFeatureEnabled = erModelRelationshipFeatureEnabled;
            return this;
        }

        /**
         * Whether we should show AccessManagement tab in the datahub UI.
         */
        public Builder setShowAccessManagement(boolean showAccessManagement) {
            this.showAccessManagement = showAccessManagement;
            return this;
        }

        /**
         * Enables the nested Domains feature that allows users to have sub-Domains.
If this is off, Domains appear "flat" again.
         */
        public Builder setNestedDomainsEnabled(boolean nestedDomainsEnabled) {
            this.nestedDomainsEnabled = nestedDomainsEnabled;
            return this;
        }

        /**
         * Whether business attribute entity should be shown
         */
        public Builder setBusinessAttributeEntityEnabled(boolean businessAttributeEntityEnabled) {
            this.businessAttributeEntityEnabled = businessAttributeEntityEnabled;
            return this;
        }

        /**
         * Whether data contracts should be enabled
         */
        public Builder setDataContractsEnabled(boolean dataContractsEnabled) {
            this.dataContractsEnabled = dataContractsEnabled;
            return this;
        }

        /**
         * Whether dataset names are editable
         */
        public Builder setEditableDatasetNameEnabled(boolean editableDatasetNameEnabled) {
            this.editableDatasetNameEnabled = editableDatasetNameEnabled;
            return this;
        }

        /**
         * Allows the V2 theme to be turned on.
Includes new UX for home page, search, entity profiles, and lineage.
If false, then the V2 experience will be unavailable even if themeV2Default or themeV2Toggleable are true.
         */
        public Builder setThemeV2Enabled(boolean themeV2Enabled) {
            this.themeV2Enabled = themeV2Enabled;
            return this;
        }

        /**
         * Sets the default theme to V2.
If `themeV2Toggleable` is set, then users can toggle between V1 and V2.
If not, then the default is the only option.
         */
        public Builder setThemeV2Default(boolean themeV2Default) {
            this.themeV2Default = themeV2Default;
            return this;
        }

        /**
         * Allows the V2 theme to be toggled by users.
         */
        public Builder setThemeV2Toggleable(boolean themeV2Toggleable) {
            this.themeV2Toggleable = themeV2Toggleable;
            return this;
        }

        /**
         * Enables links to schema field-level lineage on lineage explorer.
         */
        public Builder setSchemaFieldCLLEnabled(boolean schemaFieldCLLEnabled) {
            this.schemaFieldCLLEnabled = schemaFieldCLLEnabled;
            return this;
        }

        /**
         * If turned on, all siblings will be separated with no way to get to a "combined" sibling view
         */
        public Builder setShowSeparateSiblings(boolean showSeparateSiblings) {
            this.showSeparateSiblings = showSeparateSiblings;
            return this;
        }

        /**
         * If turned on, show the manage structured properties tab in the govern dropdown
         */
        public Builder setShowManageStructuredProperties(boolean showManageStructuredProperties) {
            this.showManageStructuredProperties = showManageStructuredProperties;
            return this;
        }

        /**
         * If turned on, hides DBT Sources from lineage by:
i) Hiding the source in the lineage graph, if it has no downstreams
ii) Swapping to the source's sibling urn on V2 lineage graph
iii) Representing source sibling as a merged node, with both icons on graph and combined version in sidebar
         */
        public Builder setHideDbtSourceInLineage(boolean hideDbtSourceInLineage) {
            this.hideDbtSourceInLineage = hideDbtSourceInLineage;
            return this;
        }

        /**
         * If turned on, schema field lineage will always fetch ghost entities and present them as real
         */
        public Builder setSchemaFieldLineageIgnoreStatus(boolean schemaFieldLineageIgnoreStatus) {
            this.schemaFieldLineageIgnoreStatus = schemaFieldLineageIgnoreStatus;
            return this;
        }

        /**
         * If turned on, show the newly designed nav bar in the V2 experience
         */
        public Builder setShowNavBarRedesign(boolean showNavBarRedesign) {
            this.showNavBarRedesign = showNavBarRedesign;
            return this;
        }

        /**
         * If turned on, we display auto complete results. Otherwise, do not.
         */
        public Builder setShowAutoCompleteResults(boolean showAutoCompleteResults) {
            this.showAutoCompleteResults = showAutoCompleteResults;
            return this;
        }

        /**
         * If turned on, exposes the versioning feature by allowing users to link entities in the UI.
         */
        public Builder setEntityVersioningEnabled(boolean entityVersioningEnabled) {
            this.entityVersioningEnabled = entityVersioningEnabled;
            return this;
        }

        /**
         * If turned on, show the "has siblings" filter in search
         */
        public Builder setShowHasSiblingsFilter(boolean showHasSiblingsFilter) {
            this.showHasSiblingsFilter = showHasSiblingsFilter;
            return this;
        }

        /**
         * If turned on, show the redesigned search bar's autocomplete
         */
        public Builder setShowSearchBarAutocompleteRedesign(boolean showSearchBarAutocompleteRedesign) {
            this.showSearchBarAutocompleteRedesign = showSearchBarAutocompleteRedesign;
            return this;
        }

        /**
         * If enabled, users will be able to view the tags management experience
         */
        public Builder setShowManageTags(boolean showManageTags) {
            this.showManageTags = showManageTags;
            return this;
        }

        /**
         * If enabled, we will show the introduce page in the V2 UI experience to add a title and select platforms
         */
        public Builder setShowIntroducePage(boolean showIntroducePage) {
            this.showIntroducePage = showIntroducePage;
            return this;
        }

        /**
         * If turned on, show the re-designed Ingestions page
         */
        public Builder setShowIngestionPageRedesign(boolean showIngestionPageRedesign) {
            this.showIngestionPageRedesign = showIngestionPageRedesign;
            return this;
        }

        /**
         * If enabled, show the expand more button (>>) in the lineage graph
         */
        public Builder setShowLineageExpandMore(boolean showLineageExpandMore) {
            this.showLineageExpandMore = showLineageExpandMore;
            return this;
        }

        /**
         * If turned on, show the re-designed Stats tab on the entity page
         */
        public Builder setShowStatsTabRedesign(boolean showStatsTabRedesign) {
            this.showStatsTabRedesign = showStatsTabRedesign;
            return this;
        }

        /**
         * If turned on, show the re-designed home page
         */
        public Builder setShowHomePageRedesign(boolean showHomePageRedesign) {
            this.showHomePageRedesign = showHomePageRedesign;
            return this;
        }

        /**
         * Whether product updates on the sidebar is enabled. Will go to oss.
         */
        public Builder setShowProductUpdates(boolean showProductUpdates) {
            this.showProductUpdates = showProductUpdates;
            return this;
        }

        /**
         * Enables the redesign of the lineage v2 graph
         */
        public Builder setLineageGraphV3(boolean lineageGraphV3) {
            this.lineageGraphV3 = lineageGraphV3;
            return this;
        }

        /**
         * Enables logical models feature
         */
        public Builder setLogicalModelsEnabled(boolean logicalModelsEnabled) {
            this.logicalModelsEnabled = logicalModelsEnabled;
            return this;
        }

        /**
         * Enables displaying the homepage user role underneath the name. Only available for custom home page.
         */
        public Builder setShowHomepageUserRole(boolean showHomepageUserRole) {
            this.showHomepageUserRole = showHomepageUserRole;
            return this;
        }

        /**
         * If enabled, show the default external links on the entity page
         */
        public Builder setShowDefaultExternalLinks(boolean showDefaultExternalLinks) {
            this.showDefaultExternalLinks = showDefaultExternalLinks;
            return this;
        }

        /**
         * Enables displaying the asset summary page
         */
        public Builder setAssetSummaryPageV1(boolean assetSummaryPageV1) {
            this.assetSummaryPageV1 = assetSummaryPageV1;
            return this;
        }

        /**
         * If enabled, allows uploading of files for documentation.
         */
        public Builder setDocumentationFileUploadV1(boolean documentationFileUploadV1) {
            this.documentationFileUploadV1 = documentationFileUploadV1;
            return this;
        }


        public FeatureFlagsConfig build() {
            return new FeatureFlagsConfig(readOnlyModeEnabled, showSearchFiltersV2, showBrowseV2, platformBrowseV2, lineageGraphV2, showAcrylInfo, erModelRelationshipFeatureEnabled, showAccessManagement, nestedDomainsEnabled, businessAttributeEntityEnabled, dataContractsEnabled, editableDatasetNameEnabled, themeV2Enabled, themeV2Default, themeV2Toggleable, schemaFieldCLLEnabled, showSeparateSiblings, showManageStructuredProperties, hideDbtSourceInLineage, schemaFieldLineageIgnoreStatus, showNavBarRedesign, showAutoCompleteResults, entityVersioningEnabled, showHasSiblingsFilter, showSearchBarAutocompleteRedesign, showManageTags, showIntroducePage, showIngestionPageRedesign, showLineageExpandMore, showStatsTabRedesign, showHomePageRedesign, showProductUpdates, lineageGraphV3, logicalModelsEnabled, showHomepageUserRole, showDefaultExternalLinks, assetSummaryPageV1, documentationFileUploadV1);
        }

    }
}
