package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The page template info for asset summaries
 */
public class DataHubPageTemplateAssetSummary implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<SummaryElement> summaryElements;

    public DataHubPageTemplateAssetSummary() {
    }

    public DataHubPageTemplateAssetSummary(java.util.List<SummaryElement> summaryElements) {
        this.summaryElements = summaryElements;
    }

    /**
     * The list of properties shown on an asset summary page header.
     */
    public java.util.List<SummaryElement> getSummaryElements() {
        return summaryElements;
    }
    /**
     * The list of properties shown on an asset summary page header.
     */
    public void setSummaryElements(java.util.List<SummaryElement> summaryElements) {
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

    public static DataHubPageTemplateAssetSummary.Builder builder() {
        return new DataHubPageTemplateAssetSummary.Builder();
    }

    public static class Builder {

        private java.util.List<SummaryElement> summaryElements;

        public Builder() {
        }

        /**
         * The list of properties shown on an asset summary page header.
         */
        public Builder setSummaryElements(java.util.List<SummaryElement> summaryElements) {
            this.summaryElements = summaryElements;
            return this;
        }


        public DataHubPageTemplateAssetSummary build() {
            return new DataHubPageTemplateAssetSummary(summaryElements);
        }

    }
}
