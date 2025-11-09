package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for adding or updating a DataHubPageTemplate entity
 */
public class UpsertPageTemplateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String urn;
    @javax.annotation.Nonnull
    private java.util.List<PageTemplateRowInput> rows;
    private PageTemplateAssetSummaryInput assetSummary;
    @javax.annotation.Nonnull
    private PageTemplateScope scope;
    @javax.annotation.Nonnull
    private PageTemplateSurfaceType surfaceType;

    public UpsertPageTemplateInput() {
    }

    public UpsertPageTemplateInput(String urn, java.util.List<PageTemplateRowInput> rows, PageTemplateAssetSummaryInput assetSummary, PageTemplateScope scope, PageTemplateSurfaceType surfaceType) {
        this.urn = urn;
        this.rows = rows;
        this.assetSummary = assetSummary;
        this.scope = scope;
        this.surfaceType = surfaceType;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public java.util.List<PageTemplateRowInput> getRows() {
        return rows;
    }
    public void setRows(java.util.List<PageTemplateRowInput> rows) {
        this.rows = rows;
    }

    public PageTemplateAssetSummaryInput getAssetSummary() {
        return assetSummary;
    }
    public void setAssetSummary(PageTemplateAssetSummaryInput assetSummary) {
        this.assetSummary = assetSummary;
    }

    public PageTemplateScope getScope() {
        return scope;
    }
    public void setScope(PageTemplateScope scope) {
        this.scope = scope;
    }

    public PageTemplateSurfaceType getSurfaceType() {
        return surfaceType;
    }
    public void setSurfaceType(PageTemplateSurfaceType surfaceType) {
        this.surfaceType = surfaceType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (rows != null) {
            joiner.add("rows: " + rows);
        }
        if (assetSummary != null) {
            joiner.add("assetSummary: " + assetSummary);
        }
        if (scope != null) {
            joiner.add("scope: " + scope);
        }
        if (surfaceType != null) {
            joiner.add("surfaceType: " + surfaceType);
        }
        return joiner.toString();
    }

    public static UpsertPageTemplateInput.Builder builder() {
        return new UpsertPageTemplateInput.Builder();
    }

    public static class Builder {

        private String urn;
        private java.util.List<PageTemplateRowInput> rows;
        private PageTemplateAssetSummaryInput assetSummary;
        private PageTemplateScope scope;
        private PageTemplateSurfaceType surfaceType;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setRows(java.util.List<PageTemplateRowInput> rows) {
            this.rows = rows;
            return this;
        }

        public Builder setAssetSummary(PageTemplateAssetSummaryInput assetSummary) {
            this.assetSummary = assetSummary;
            return this;
        }

        public Builder setScope(PageTemplateScope scope) {
            this.scope = scope;
            return this;
        }

        public Builder setSurfaceType(PageTemplateSurfaceType surfaceType) {
            this.surfaceType = surfaceType;
            return this;
        }


        public UpsertPageTemplateInput build() {
            return new UpsertPageTemplateInput(urn, rows, assetSummary, scope, surfaceType);
        }

    }
}
