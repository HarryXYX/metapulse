package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Object containing the template and any additional info for asset summary settings
 */
public class AssetSummarySettingsTemplate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DataHubPageTemplate template;

    public AssetSummarySettingsTemplate() {
    }

    public AssetSummarySettingsTemplate(DataHubPageTemplate template) {
        this.template = template;
    }

    /**
     * The page template entity
     */
    public DataHubPageTemplate getTemplate() {
        return template;
    }
    /**
     * The page template entity
     */
    public void setTemplate(DataHubPageTemplate template) {
        this.template = template;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (template != null) {
            joiner.add("template: " + template);
        }
        return joiner.toString();
    }

    public static AssetSummarySettingsTemplate.Builder builder() {
        return new AssetSummarySettingsTemplate.Builder();
    }

    public static class Builder {

        private DataHubPageTemplate template;

        public Builder() {
        }

        /**
         * The page template entity
         */
        public Builder setTemplate(DataHubPageTemplate template) {
            this.template = template;
            return this;
        }


        public AssetSummarySettingsTemplate build() {
            return new AssetSummarySettingsTemplate(template);
        }

    }
}
