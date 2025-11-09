package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result object when fetching quick filters
 */
public class GetQuickFiltersResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<QuickFilter> quickFilters;

    public GetQuickFiltersResult() {
    }

    public GetQuickFiltersResult(java.util.List<QuickFilter> quickFilters) {
        this.quickFilters = quickFilters;
    }

    /**
     * The list of quick filters to render in the UI
     */
    public java.util.List<QuickFilter> getQuickFilters() {
        return quickFilters;
    }
    /**
     * The list of quick filters to render in the UI
     */
    public void setQuickFilters(java.util.List<QuickFilter> quickFilters) {
        this.quickFilters = quickFilters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (quickFilters != null) {
            joiner.add("quickFilters: " + quickFilters);
        }
        return joiner.toString();
    }

    public static GetQuickFiltersResult.Builder builder() {
        return new GetQuickFiltersResult.Builder();
    }

    public static class Builder {

        private java.util.List<QuickFilter> quickFilters;

        public Builder() {
        }

        /**
         * The list of quick filters to render in the UI
         */
        public Builder setQuickFilters(java.util.List<QuickFilter> quickFilters) {
            this.quickFilters = quickFilters;
            return this;
        }


        public GetQuickFiltersResult build() {
            return new GetQuickFiltersResult(quickFilters);
        }

    }
}
