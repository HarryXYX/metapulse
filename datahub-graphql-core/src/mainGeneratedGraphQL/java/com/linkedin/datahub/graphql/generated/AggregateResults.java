package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Results returned from aggregateAcrossEntities
 */
public class AggregateResults implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<FacetMetadata> facets;

    public AggregateResults() {
    }

    public AggregateResults(java.util.List<FacetMetadata> facets) {
        this.facets = facets;
    }

    /**
     * Candidate facet aggregations used for search filtering
     */
    public java.util.List<FacetMetadata> getFacets() {
        return facets;
    }
    /**
     * Candidate facet aggregations used for search filtering
     */
    public void setFacets(java.util.List<FacetMetadata> facets) {
        this.facets = facets;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (facets != null) {
            joiner.add("facets: " + facets);
        }
        return joiner.toString();
    }

    public static AggregateResults.Builder builder() {
        return new AggregateResults.Builder();
    }

    public static class Builder {

        private java.util.List<FacetMetadata> facets;

        public Builder() {
        }

        /**
         * Candidate facet aggregations used for search filtering
         */
        public Builder setFacets(java.util.List<FacetMetadata> facets) {
            this.facets = facets;
            return this;
        }


        public AggregateResults build() {
            return new AggregateResults(facets);
        }

    }
}
