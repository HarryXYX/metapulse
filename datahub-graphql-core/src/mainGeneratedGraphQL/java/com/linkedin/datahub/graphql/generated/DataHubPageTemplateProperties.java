package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The main properties of a DataHub page template
 */
public class DataHubPageTemplateProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<DataHubPageTemplateRow> rows;
    private DataHubPageTemplateAssetSummary assetSummary;
    @javax.annotation.Nonnull
    private DataHubPageTemplateSurface surface;
    @javax.annotation.Nonnull
    private DataHubPageTemplateVisibility visibility;
    @javax.annotation.Nonnull
    private ResolvedAuditStamp created;
    @javax.annotation.Nonnull
    private ResolvedAuditStamp lastModified;

    public DataHubPageTemplateProperties() {
    }

    public DataHubPageTemplateProperties(java.util.List<DataHubPageTemplateRow> rows, DataHubPageTemplateAssetSummary assetSummary, DataHubPageTemplateSurface surface, DataHubPageTemplateVisibility visibility, ResolvedAuditStamp created, ResolvedAuditStamp lastModified) {
        this.rows = rows;
        this.assetSummary = assetSummary;
        this.surface = surface;
        this.visibility = visibility;
        this.created = created;
        this.lastModified = lastModified;
    }

    /**
     * The rows of modules contained in this template
     */
    public java.util.List<DataHubPageTemplateRow> getRows() {
        return rows;
    }
    /**
     * The rows of modules contained in this template
     */
    public void setRows(java.util.List<DataHubPageTemplateRow> rows) {
        this.rows = rows;
    }

    /**
     * The optional info for asset summaries. Should be populated if surfaceType is ASSET_SUMMARY
     */
    public DataHubPageTemplateAssetSummary getAssetSummary() {
        return assetSummary;
    }
    /**
     * The optional info for asset summaries. Should be populated if surfaceType is ASSET_SUMMARY
     */
    public void setAssetSummary(DataHubPageTemplateAssetSummary assetSummary) {
        this.assetSummary = assetSummary;
    }

    /**
     * Info about the surface area of the product that this template is deployed in
     */
    public DataHubPageTemplateSurface getSurface() {
        return surface;
    }
    /**
     * Info about the surface area of the product that this template is deployed in
     */
    public void setSurface(DataHubPageTemplateSurface surface) {
        this.surface = surface;
    }

    /**
     * Info about the visibility of this template
     */
    public DataHubPageTemplateVisibility getVisibility() {
        return visibility;
    }
    /**
     * Info about the visibility of this template
     */
    public void setVisibility(DataHubPageTemplateVisibility visibility) {
        this.visibility = visibility;
    }

    /**
     * Audit stamp for when and by whom this template was created
     */
    public ResolvedAuditStamp getCreated() {
        return created;
    }
    /**
     * Audit stamp for when and by whom this template was created
     */
    public void setCreated(ResolvedAuditStamp created) {
        this.created = created;
    }

    /**
     * Audit stamp for when and by whom this template was last updated
     */
    public ResolvedAuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * Audit stamp for when and by whom this template was last updated
     */
    public void setLastModified(ResolvedAuditStamp lastModified) {
        this.lastModified = lastModified;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (rows != null) {
            joiner.add("rows: " + rows);
        }
        if (assetSummary != null) {
            joiner.add("assetSummary: " + assetSummary);
        }
        if (surface != null) {
            joiner.add("surface: " + surface);
        }
        if (visibility != null) {
            joiner.add("visibility: " + visibility);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        return joiner.toString();
    }

    public static DataHubPageTemplateProperties.Builder builder() {
        return new DataHubPageTemplateProperties.Builder();
    }

    public static class Builder {

        private java.util.List<DataHubPageTemplateRow> rows;
        private DataHubPageTemplateAssetSummary assetSummary;
        private DataHubPageTemplateSurface surface;
        private DataHubPageTemplateVisibility visibility;
        private ResolvedAuditStamp created;
        private ResolvedAuditStamp lastModified;

        public Builder() {
        }

        /**
         * The rows of modules contained in this template
         */
        public Builder setRows(java.util.List<DataHubPageTemplateRow> rows) {
            this.rows = rows;
            return this;
        }

        /**
         * The optional info for asset summaries. Should be populated if surfaceType is ASSET_SUMMARY
         */
        public Builder setAssetSummary(DataHubPageTemplateAssetSummary assetSummary) {
            this.assetSummary = assetSummary;
            return this;
        }

        /**
         * Info about the surface area of the product that this template is deployed in
         */
        public Builder setSurface(DataHubPageTemplateSurface surface) {
            this.surface = surface;
            return this;
        }

        /**
         * Info about the visibility of this template
         */
        public Builder setVisibility(DataHubPageTemplateVisibility visibility) {
            this.visibility = visibility;
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was created
         */
        public Builder setCreated(ResolvedAuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * Audit stamp for when and by whom this template was last updated
         */
        public Builder setLastModified(ResolvedAuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }


        public DataHubPageTemplateProperties build() {
            return new DataHubPageTemplateProperties(rows, assetSummary, surface, visibility, created, lastModified);
        }

    }
}
