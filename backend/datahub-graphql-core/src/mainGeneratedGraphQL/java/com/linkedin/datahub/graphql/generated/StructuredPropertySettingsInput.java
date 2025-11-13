package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Settings for a structured property
 */
public class StructuredPropertySettingsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean isHidden;
    private Boolean showInSearchFilters;
    private Boolean showInAssetSummary;
    private Boolean hideInAssetSummaryWhenEmpty;
    private Boolean showAsAssetBadge;
    private Boolean showInColumnsTable;

    public StructuredPropertySettingsInput() {
    }

    public StructuredPropertySettingsInput(Boolean isHidden, Boolean showInSearchFilters, Boolean showInAssetSummary, Boolean hideInAssetSummaryWhenEmpty, Boolean showAsAssetBadge, Boolean showInColumnsTable) {
        this.isHidden = isHidden;
        this.showInSearchFilters = showInSearchFilters;
        this.showInAssetSummary = showInAssetSummary;
        this.hideInAssetSummaryWhenEmpty = hideInAssetSummaryWhenEmpty;
        this.showAsAssetBadge = showAsAssetBadge;
        this.showInColumnsTable = showInColumnsTable;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }
    public void setIsHidden(Boolean isHidden) {
        this.isHidden = isHidden;
    }

    public Boolean getShowInSearchFilters() {
        return showInSearchFilters;
    }
    public void setShowInSearchFilters(Boolean showInSearchFilters) {
        this.showInSearchFilters = showInSearchFilters;
    }

    public Boolean getShowInAssetSummary() {
        return showInAssetSummary;
    }
    public void setShowInAssetSummary(Boolean showInAssetSummary) {
        this.showInAssetSummary = showInAssetSummary;
    }

    public Boolean getHideInAssetSummaryWhenEmpty() {
        return hideInAssetSummaryWhenEmpty;
    }
    public void setHideInAssetSummaryWhenEmpty(Boolean hideInAssetSummaryWhenEmpty) {
        this.hideInAssetSummaryWhenEmpty = hideInAssetSummaryWhenEmpty;
    }

    public Boolean getShowAsAssetBadge() {
        return showAsAssetBadge;
    }
    public void setShowAsAssetBadge(Boolean showAsAssetBadge) {
        this.showAsAssetBadge = showAsAssetBadge;
    }

    public Boolean getShowInColumnsTable() {
        return showInColumnsTable;
    }
    public void setShowInColumnsTable(Boolean showInColumnsTable) {
        this.showInColumnsTable = showInColumnsTable;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (isHidden != null) {
            joiner.add("isHidden: " + isHidden);
        }
        if (showInSearchFilters != null) {
            joiner.add("showInSearchFilters: " + showInSearchFilters);
        }
        if (showInAssetSummary != null) {
            joiner.add("showInAssetSummary: " + showInAssetSummary);
        }
        if (hideInAssetSummaryWhenEmpty != null) {
            joiner.add("hideInAssetSummaryWhenEmpty: " + hideInAssetSummaryWhenEmpty);
        }
        if (showAsAssetBadge != null) {
            joiner.add("showAsAssetBadge: " + showAsAssetBadge);
        }
        if (showInColumnsTable != null) {
            joiner.add("showInColumnsTable: " + showInColumnsTable);
        }
        return joiner.toString();
    }

    public static StructuredPropertySettingsInput.Builder builder() {
        return new StructuredPropertySettingsInput.Builder();
    }

    public static class Builder {

        private Boolean isHidden;
        private Boolean showInSearchFilters;
        private Boolean showInAssetSummary;
        private Boolean hideInAssetSummaryWhenEmpty;
        private Boolean showAsAssetBadge;
        private Boolean showInColumnsTable;

        public Builder() {
        }

        public Builder setIsHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            return this;
        }

        public Builder setShowInSearchFilters(Boolean showInSearchFilters) {
            this.showInSearchFilters = showInSearchFilters;
            return this;
        }

        public Builder setShowInAssetSummary(Boolean showInAssetSummary) {
            this.showInAssetSummary = showInAssetSummary;
            return this;
        }

        public Builder setHideInAssetSummaryWhenEmpty(Boolean hideInAssetSummaryWhenEmpty) {
            this.hideInAssetSummaryWhenEmpty = hideInAssetSummaryWhenEmpty;
            return this;
        }

        public Builder setShowAsAssetBadge(Boolean showAsAssetBadge) {
            this.showAsAssetBadge = showAsAssetBadge;
            return this;
        }

        public Builder setShowInColumnsTable(Boolean showInColumnsTable) {
            this.showInColumnsTable = showInColumnsTable;
            return this;
        }


        public StructuredPropertySettingsInput build() {
            return new StructuredPropertySettingsInput(isHidden, showInSearchFilters, showInAssetSummary, hideInAssetSummaryWhenEmpty, showAsAssetBadge, showInColumnsTable);
        }

    }
}
