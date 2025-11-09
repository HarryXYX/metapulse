package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information related to the asset summary for this asset
 */
public class AssetSummarySettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<AssetSummarySettingsTemplate> templates;

    public AssetSummarySettings() {
    }

    public AssetSummarySettings(java.util.List<AssetSummarySettingsTemplate> templates) {
        this.templates = templates;
    }

    /**
     * The list of templates applied to this asset in order. Right now we only expect one.
     */
    public java.util.List<AssetSummarySettingsTemplate> getTemplates() {
        return templates;
    }
    /**
     * The list of templates applied to this asset in order. Right now we only expect one.
     */
    public void setTemplates(java.util.List<AssetSummarySettingsTemplate> templates) {
        this.templates = templates;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (templates != null) {
            joiner.add("templates: " + templates);
        }
        return joiner.toString();
    }

    public static AssetSummarySettings.Builder builder() {
        return new AssetSummarySettings.Builder();
    }

    public static class Builder {

        private java.util.List<AssetSummarySettingsTemplate> templates;

        public Builder() {
        }

        /**
         * The list of templates applied to this asset in order. Right now we only expect one.
         */
        public Builder setTemplates(java.util.List<AssetSummarySettingsTemplate> templates) {
            this.templates = templates;
            return this;
        }


        public AssetSummarySettings build() {
            return new AssetSummarySettings(templates);
        }

    }
}
