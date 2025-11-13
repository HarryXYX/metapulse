package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class LinkSettingsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean showInAssetPreview;

    public LinkSettingsInput() {
    }

    public LinkSettingsInput(Boolean showInAssetPreview) {
        this.showInAssetPreview = showInAssetPreview;
    }

    public Boolean getShowInAssetPreview() {
        return showInAssetPreview;
    }
    public void setShowInAssetPreview(Boolean showInAssetPreview) {
        this.showInAssetPreview = showInAssetPreview;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (showInAssetPreview != null) {
            joiner.add("showInAssetPreview: " + showInAssetPreview);
        }
        return joiner.toString();
    }

    public static LinkSettingsInput.Builder builder() {
        return new LinkSettingsInput.Builder();
    }

    public static class Builder {

        private Boolean showInAssetPreview;

        public Builder() {
        }

        public Builder setShowInAssetPreview(Boolean showInAssetPreview) {
            this.showInAssetPreview = showInAssetPreview;
            return this;
        }


        public LinkSettingsInput build() {
            return new LinkSettingsInput(showInAssetPreview);
        }

    }
}
