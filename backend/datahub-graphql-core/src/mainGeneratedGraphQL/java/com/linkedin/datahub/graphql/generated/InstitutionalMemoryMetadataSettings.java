package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Settings for an institutional memory record
 */
public class InstitutionalMemoryMetadataSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean showInAssetPreview;

    public InstitutionalMemoryMetadataSettings() {
    }

    public InstitutionalMemoryMetadataSettings(boolean showInAssetPreview) {
        this.showInAssetPreview = showInAssetPreview;
    }

    /**
     * Show record in asset preview like on entity header and search previews
     */
    public boolean getShowInAssetPreview() {
        return showInAssetPreview;
    }
    /**
     * Show record in asset preview like on entity header and search previews
     */
    public void setShowInAssetPreview(boolean showInAssetPreview) {
        this.showInAssetPreview = showInAssetPreview;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("showInAssetPreview: " + showInAssetPreview);
        return joiner.toString();
    }

    public static InstitutionalMemoryMetadataSettings.Builder builder() {
        return new InstitutionalMemoryMetadataSettings.Builder();
    }

    public static class Builder {

        private boolean showInAssetPreview;

        public Builder() {
        }

        /**
         * Show record in asset preview like on entity header and search previews
         */
        public Builder setShowInAssetPreview(boolean showInAssetPreview) {
            this.showInAssetPreview = showInAssetPreview;
            return this;
        }


        public InstitutionalMemoryMetadataSettings build() {
            return new InstitutionalMemoryMetadataSettings(showInAssetPreview);
        }

    }
}
