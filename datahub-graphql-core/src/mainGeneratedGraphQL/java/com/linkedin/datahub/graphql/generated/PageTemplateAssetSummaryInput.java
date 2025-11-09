package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The optional info for asset summaries on this template
 */
public class PageTemplateAssetSummaryInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<SummaryElementInput> summaryElements;

    public PageTemplateAssetSummaryInput() {
    }

    public PageTemplateAssetSummaryInput(java.util.List<SummaryElementInput> summaryElements) {
        this.summaryElements = summaryElements;
    }

    public java.util.List<SummaryElementInput> getSummaryElements() {
        return summaryElements;
    }
    public void setSummaryElements(java.util.List<SummaryElementInput> summaryElements) {
        this.summaryElements = summaryElements;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (summaryElements != null) {
            joiner.add("summaryElements: " + summaryElements);
        }
        return joiner.toString();
    }

    public static PageTemplateAssetSummaryInput.Builder builder() {
        return new PageTemplateAssetSummaryInput.Builder();
    }

    public static class Builder {

        private java.util.List<SummaryElementInput> summaryElements;

        public Builder() {
        }

        public Builder setSummaryElements(java.util.List<SummaryElementInput> summaryElements) {
            this.summaryElements = summaryElements;
            return this;
        }


        public PageTemplateAssetSummaryInput build() {
            return new PageTemplateAssetSummaryInput(summaryElements);
        }

    }
}
