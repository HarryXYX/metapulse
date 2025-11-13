package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Settings specific to a structured property entity
 */
public class StructuredPropertySettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean isHidden;
    private boolean showInSearchFilters;
    private boolean showInAssetSummary;
    private boolean hideInAssetSummaryWhenEmpty;
    private boolean showAsAssetBadge;
    private boolean showInColumnsTable;

    public StructuredPropertySettings() {
    }

    public StructuredPropertySettings(boolean isHidden, boolean showInSearchFilters, boolean showInAssetSummary, boolean hideInAssetSummaryWhenEmpty, boolean showAsAssetBadge, boolean showInColumnsTable) {
        this.isHidden = isHidden;
        this.showInSearchFilters = showInSearchFilters;
        this.showInAssetSummary = showInAssetSummary;
        this.hideInAssetSummaryWhenEmpty = hideInAssetSummaryWhenEmpty;
        this.showAsAssetBadge = showAsAssetBadge;
        this.showInColumnsTable = showInColumnsTable;
    }

    /**
     * Whether or not this asset should be hidden in the main application
     */
    public boolean getIsHidden() {
        return isHidden;
    }
    /**
     * Whether or not this asset should be hidden in the main application
     */
    public void setIsHidden(boolean isHidden) {
        this.isHidden = isHidden;
    }

    /**
     * Whether or not this asset should be displayed as a search filter
     */
    public boolean getShowInSearchFilters() {
        return showInSearchFilters;
    }
    /**
     * Whether or not this asset should be displayed as a search filter
     */
    public void setShowInSearchFilters(boolean showInSearchFilters) {
        this.showInSearchFilters = showInSearchFilters;
    }

    /**
     * Whether or not this asset should be displayed in the asset sidebar
     */
    public boolean getShowInAssetSummary() {
        return showInAssetSummary;
    }
    /**
     * Whether or not this asset should be displayed in the asset sidebar
     */
    public void setShowInAssetSummary(boolean showInAssetSummary) {
        this.showInAssetSummary = showInAssetSummary;
    }

    /**
     * Whether or not this asset should be hidden in the asset sidebar (showInAssetSummary should be enabled)
when its value is empty
     */
    public boolean getHideInAssetSummaryWhenEmpty() {
        return hideInAssetSummaryWhenEmpty;
    }
    /**
     * Whether or not this asset should be hidden in the asset sidebar (showInAssetSummary should be enabled)
when its value is empty
     */
    public void setHideInAssetSummaryWhenEmpty(boolean hideInAssetSummaryWhenEmpty) {
        this.hideInAssetSummaryWhenEmpty = hideInAssetSummaryWhenEmpty;
    }

    /**
     * Whether or not this asset should be displayed as an asset badge on other asset's headers
     */
    public boolean getShowAsAssetBadge() {
        return showAsAssetBadge;
    }
    /**
     * Whether or not this asset should be displayed as an asset badge on other asset's headers
     */
    public void setShowAsAssetBadge(boolean showAsAssetBadge) {
        this.showAsAssetBadge = showAsAssetBadge;
    }

    /**
     * Whether or not this asset should be displayed as a column in the schema field table in a Dataset's "Columns" tab.
     */
    public boolean getShowInColumnsTable() {
        return showInColumnsTable;
    }
    /**
     * Whether or not this asset should be displayed as a column in the schema field table in a Dataset's "Columns" tab.
     */
    public void setShowInColumnsTable(boolean showInColumnsTable) {
        this.showInColumnsTable = showInColumnsTable;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("isHidden: " + isHidden);
        joiner.add("showInSearchFilters: " + showInSearchFilters);
        joiner.add("showInAssetSummary: " + showInAssetSummary);
        joiner.add("hideInAssetSummaryWhenEmpty: " + hideInAssetSummaryWhenEmpty);
        joiner.add("showAsAssetBadge: " + showAsAssetBadge);
        joiner.add("showInColumnsTable: " + showInColumnsTable);
        return joiner.toString();
    }

    public static StructuredPropertySettings.Builder builder() {
        return new StructuredPropertySettings.Builder();
    }

    public static class Builder {

        private boolean isHidden;
        private boolean showInSearchFilters;
        private boolean showInAssetSummary;
        private boolean hideInAssetSummaryWhenEmpty;
        private boolean showAsAssetBadge;
        private boolean showInColumnsTable;

        public Builder() {
        }

        /**
         * Whether or not this asset should be hidden in the main application
         */
        public Builder setIsHidden(boolean isHidden) {
            this.isHidden = isHidden;
            return this;
        }

        /**
         * Whether or not this asset should be displayed as a search filter
         */
        public Builder setShowInSearchFilters(boolean showInSearchFilters) {
            this.showInSearchFilters = showInSearchFilters;
            return this;
        }

        /**
         * Whether or not this asset should be displayed in the asset sidebar
         */
        public Builder setShowInAssetSummary(boolean showInAssetSummary) {
            this.showInAssetSummary = showInAssetSummary;
            return this;
        }

        /**
         * Whether or not this asset should be hidden in the asset sidebar (showInAssetSummary should be enabled)
when its value is empty
         */
        public Builder setHideInAssetSummaryWhenEmpty(boolean hideInAssetSummaryWhenEmpty) {
            this.hideInAssetSummaryWhenEmpty = hideInAssetSummaryWhenEmpty;
            return this;
        }

        /**
         * Whether or not this asset should be displayed as an asset badge on other asset's headers
         */
        public Builder setShowAsAssetBadge(boolean showAsAssetBadge) {
            this.showAsAssetBadge = showAsAssetBadge;
            return this;
        }

        /**
         * Whether or not this asset should be displayed as a column in the schema field table in a Dataset's "Columns" tab.
         */
        public Builder setShowInColumnsTable(boolean showInColumnsTable) {
            this.showInColumnsTable = showInColumnsTable;
            return this;
        }


        public StructuredPropertySettings build() {
            return new StructuredPropertySettings(isHidden, showInSearchFilters, showInAssetSummary, hideInAssetSummaryWhenEmpty, showAsAssetBadge, showInColumnsTable);
        }

    }
}
