package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for the params required if the module is type HIERARCHY_VIEW
 */
public class HierarchyViewModuleParamsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> assetUrns;
    private boolean showRelatedEntities;
    private String relatedEntitiesFilterJson;

    public HierarchyViewModuleParamsInput() {
    }

    public HierarchyViewModuleParamsInput(java.util.List<String> assetUrns, boolean showRelatedEntities, String relatedEntitiesFilterJson) {
        this.assetUrns = assetUrns;
        this.showRelatedEntities = showRelatedEntities;
        this.relatedEntitiesFilterJson = relatedEntitiesFilterJson;
    }

    public java.util.List<String> getAssetUrns() {
        return assetUrns;
    }
    public void setAssetUrns(java.util.List<String> assetUrns) {
        this.assetUrns = assetUrns;
    }

    public boolean getShowRelatedEntities() {
        return showRelatedEntities;
    }
    public void setShowRelatedEntities(boolean showRelatedEntities) {
        this.showRelatedEntities = showRelatedEntities;
    }

    public String getRelatedEntitiesFilterJson() {
        return relatedEntitiesFilterJson;
    }
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

    public static HierarchyViewModuleParamsInput.Builder builder() {
        return new HierarchyViewModuleParamsInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> assetUrns;
        private boolean showRelatedEntities;
        private String relatedEntitiesFilterJson;

        public Builder() {
        }

        public Builder setAssetUrns(java.util.List<String> assetUrns) {
            this.assetUrns = assetUrns;
            return this;
        }

        public Builder setShowRelatedEntities(boolean showRelatedEntities) {
            this.showRelatedEntities = showRelatedEntities;
            return this;
        }

        public Builder setRelatedEntitiesFilterJson(String relatedEntitiesFilterJson) {
            this.relatedEntitiesFilterJson = relatedEntitiesFilterJson;
            return this;
        }


        public HierarchyViewModuleParamsInput build() {
            return new HierarchyViewModuleParamsInput(assetUrns, showRelatedEntities, relatedEntitiesFilterJson);
        }

    }
}
