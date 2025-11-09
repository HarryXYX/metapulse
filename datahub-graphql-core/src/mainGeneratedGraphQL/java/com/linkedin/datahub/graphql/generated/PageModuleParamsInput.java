package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for the specific parameters stored for a module
 */
public class PageModuleParamsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private LinkModuleParamsInput linkParams;
    private RichTextModuleParamsInput richTextParams;
    private AssetCollectionModuleParamsInput assetCollectionParams;
    private HierarchyViewModuleParamsInput hierarchyViewParams;

    public PageModuleParamsInput() {
    }

    public PageModuleParamsInput(LinkModuleParamsInput linkParams, RichTextModuleParamsInput richTextParams, AssetCollectionModuleParamsInput assetCollectionParams, HierarchyViewModuleParamsInput hierarchyViewParams) {
        this.linkParams = linkParams;
        this.richTextParams = richTextParams;
        this.assetCollectionParams = assetCollectionParams;
        this.hierarchyViewParams = hierarchyViewParams;
    }

    public LinkModuleParamsInput getLinkParams() {
        return linkParams;
    }
    public void setLinkParams(LinkModuleParamsInput linkParams) {
        this.linkParams = linkParams;
    }

    public RichTextModuleParamsInput getRichTextParams() {
        return richTextParams;
    }
    public void setRichTextParams(RichTextModuleParamsInput richTextParams) {
        this.richTextParams = richTextParams;
    }

    public AssetCollectionModuleParamsInput getAssetCollectionParams() {
        return assetCollectionParams;
    }
    public void setAssetCollectionParams(AssetCollectionModuleParamsInput assetCollectionParams) {
        this.assetCollectionParams = assetCollectionParams;
    }

    public HierarchyViewModuleParamsInput getHierarchyViewParams() {
        return hierarchyViewParams;
    }
    public void setHierarchyViewParams(HierarchyViewModuleParamsInput hierarchyViewParams) {
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

    public static PageModuleParamsInput.Builder builder() {
        return new PageModuleParamsInput.Builder();
    }

    public static class Builder {

        private LinkModuleParamsInput linkParams;
        private RichTextModuleParamsInput richTextParams;
        private AssetCollectionModuleParamsInput assetCollectionParams;
        private HierarchyViewModuleParamsInput hierarchyViewParams;

        public Builder() {
        }

        public Builder setLinkParams(LinkModuleParamsInput linkParams) {
            this.linkParams = linkParams;
            return this;
        }

        public Builder setRichTextParams(RichTextModuleParamsInput richTextParams) {
            this.richTextParams = richTextParams;
            return this;
        }

        public Builder setAssetCollectionParams(AssetCollectionModuleParamsInput assetCollectionParams) {
            this.assetCollectionParams = assetCollectionParams;
            return this;
        }

        public Builder setHierarchyViewParams(HierarchyViewModuleParamsInput hierarchyViewParams) {
            this.hierarchyViewParams = hierarchyViewParams;
            return this;
        }


        public PageModuleParamsInput build() {
            return new PageModuleParamsInput(linkParams, richTextParams, assetCollectionParams, hierarchyViewParams);
        }

    }
}
