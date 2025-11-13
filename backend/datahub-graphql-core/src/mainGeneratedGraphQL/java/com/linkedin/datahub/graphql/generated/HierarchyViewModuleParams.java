package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The params required if the module is type HIERARCHY_VIEW
 */
public class HierarchyViewModuleParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> assetUrns;
    private boolean showRelatedEntities;
    private String relatedEntitiesFilterJson;

    public HierarchyViewModuleParams() {
    }

    public HierarchyViewModuleParams(java.util.List<String> assetUrns, boolean showRelatedEntities, String relatedEntitiesFilterJson) {
        this.assetUrns = assetUrns;
        this.showRelatedEntities = showRelatedEntities;
        this.relatedEntitiesFilterJson = relatedEntitiesFilterJson;
    }

    /**
     * The list of assets to show in the module
     */
    public java.util.List<String> getAssetUrns() {
        return assetUrns;
    }
    /**
     * The list of assets to show in the module
     */
    public void setAssetUrns(java.util.List<String> assetUrns) {
        this.assetUrns = assetUrns;
    }

    /**
     * Whether to show related entities in the module
     */
    public boolean getShowRelatedEntities() {
        return showRelatedEntities;
    }
    /**
     * Whether to show related entities in the module
     */
    public void setShowRelatedEntities(boolean showRelatedEntities) {
        this.showRelatedEntities = showRelatedEntities;
    }

    /**
     * Optional filters to filter relatedEntities (assetUrns) out

The stringified json representing the logical predicate built in the UI to select assets.
This predicate is turned into orFilters to send through graphql since graphql doesn't support
arbitrary nesting. This string is used to restore the UI for this logical predicate.
     */
    public String getRelatedEntitiesFilterJson() {
        return relatedEntitiesFilterJson;
    }
    /**
     * Optional filters to filter relatedEntities (assetUrns) out

The stringified json representing the logical predicate built in the UI to select assets.
This predicate is turned into orFilters to send through graphql since graphql doesn't support
arbitrary nesting. This string is used to restore the UI for this logical predicate.
     */
    public void setRelatedEntitiesFilterJson(String relatedEntitiesFilterJson) {
        this.relatedEntitiesFilterJson = relatedEntitiesFilterJson;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (assetUrns != null) {
            joiner.add("assetUrns: " + assetUrns);
        }
        joiner.add("showRelatedEntities: " + showRelatedEntities);
        if (relatedEntitiesFilterJson != null) {
            joiner.add("relatedEntitiesFilterJson: \"" + relatedEntitiesFilterJson + "\"");
        }
        return joiner.toString();
    }

    public static HierarchyViewModuleParams.Builder builder() {
        return new HierarchyViewModuleParams.Builder();
    }

    public static class Builder {

        private java.util.List<String> assetUrns;
        private boolean showRelatedEntities;
        private String relatedEntitiesFilterJson;

        public Builder() {
        }

        /**
         * The list of assets to show in the module
         */
        public Builder setAssetUrns(java.util.List<String> assetUrns) {
            this.assetUrns = assetUrns;
            return this;
        }

        /**
         * Whether to show related entities in the module
         */
        public Builder setShowRelatedEntities(boolean showRelatedEntities) {
            this.showRelatedEntities = showRelatedEntities;
            return this;
        }

        /**
         * Optional filters to filter relatedEntities (assetUrns) out

The stringified json representing the logical predicate built in the UI to select assets.
This predicate is turned into orFilters to send through graphql since graphql doesn't support
arbitrary nesting. This string is used to restore the UI for this logical predicate.
         */
        public Builder setRelatedEntitiesFilterJson(String relatedEntitiesFilterJson) {
            this.relatedEntitiesFilterJson = relatedEntitiesFilterJson;
            return this;
        }


        public HierarchyViewModuleParams build() {
            return new HierarchyViewModuleParams(assetUrns, showRelatedEntities, relatedEntitiesFilterJson);
        }

    }
}
