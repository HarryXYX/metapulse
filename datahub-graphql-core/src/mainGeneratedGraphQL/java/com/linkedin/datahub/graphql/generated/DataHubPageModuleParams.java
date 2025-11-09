package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The specific parameters stored for a module
 */
public class DataHubPageModuleParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private LinkModuleParams linkParams;
    private RichTextModuleParams richTextParams;
    private AssetCollectionModuleParams assetCollectionParams;
    private HierarchyViewModuleParams hierarchyViewParams;

    public DataHubPageModuleParams() {
    }

    public DataHubPageModuleParams(LinkModuleParams linkParams, RichTextModuleParams richTextParams, AssetCollectionModuleParams assetCollectionParams, HierarchyViewModuleParams hierarchyViewParams) {
        this.linkParams = linkParams;
        this.richTextParams = richTextParams;
        this.assetCollectionParams = assetCollectionParams;
        this.hierarchyViewParams = hierarchyViewParams;
    }

    /**
     * The params required if the module is type LINK
     */
    public LinkModuleParams getLinkParams() {
        return linkParams;
    }
    /**
     * The params required if the module is type LINK
     */
    public void setLinkParams(LinkModuleParams linkParams) {
        this.linkParams = linkParams;
    }

    /**
     * The params required if the module is type RICH_TEXT
     */
    public RichTextModuleParams getRichTextParams() {
        return richTextParams;
    }
    /**
     * The params required if the module is type RICH_TEXT
     */
    public void setRichTextParams(RichTextModuleParams richTextParams) {
        this.richTextParams = richTextParams;
    }

    /**
     * The params required if the module is type ASSET_COLLECTION
     */
    public AssetCollectionModuleParams getAssetCollectionParams() {
        return assetCollectionParams;
    }
    /**
     * The params required if the module is type ASSET_COLLECTION
     */
    public void setAssetCollectionParams(AssetCollectionModuleParams assetCollectionParams) {
        this.assetCollectionParams = assetCollectionParams;
    }

    /**
     * The params required if the module is type HIERARCHY_VIEW
     */
    public HierarchyViewModuleParams getHierarchyViewParams() {
        return hierarchyViewParams;
    }
    /**
     * The params required if the module is type HIERARCHY_VIEW
     */
    public void setHierarchyViewParams(HierarchyViewModuleParams hierarchyViewParams) {
        this.hierarchyViewParams = hierarchyViewParams;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (linkParams != null) {
            joiner.add("linkParams: " + linkParams);
        }
        if (richTextParams != null) {
            joiner.add("richTextParams: " + richTextParams);
        }
        if (assetCollectionParams != null) {
            joiner.add("assetCollectionParams: " + assetCollectionParams);
        }
        if (hierarchyViewParams != null) {
            joiner.add("hierarchyViewParams: " + hierarchyViewParams);
        }
        return joiner.toString();
    }

    public static DataHubPageModuleParams.Builder builder() {
        return new DataHubPageModuleParams.Builder();
    }

    public static class Builder {

        private LinkModuleParams linkParams;
        private RichTextModuleParams richTextParams;
        private AssetCollectionModuleParams assetCollectionParams;
        private HierarchyViewModuleParams hierarchyViewParams;

        public Builder() {
        }

        /**
         * The params required if the module is type LINK
         */
        public Builder setLinkParams(LinkModuleParams linkParams) {
            this.linkParams = linkParams;
            return this;
        }

        /**
         * The params required if the module is type RICH_TEXT
         */
        public Builder setRichTextParams(RichTextModuleParams richTextParams) {
            this.richTextParams = richTextParams;
            return this;
        }

        /**
         * The params required if the module is type ASSET_COLLECTION
         */
        public Builder setAssetCollectionParams(AssetCollectionModuleParams assetCollectionParams) {
            this.assetCollectionParams = assetCollectionParams;
            return this;
        }

        /**
         * The params required if the module is type HIERARCHY_VIEW
         */
        public Builder setHierarchyViewParams(HierarchyViewModuleParams hierarchyViewParams) {
            this.hierarchyViewParams = hierarchyViewParams;
            return this;
        }


        public DataHubPageModuleParams build() {
            return new DataHubPageModuleParams(linkParams, richTextParams, assetCollectionParams, hierarchyViewParams);
        }

    }
}
