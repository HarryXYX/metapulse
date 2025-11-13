package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Parameters required to specify the page to land once clicked
 */
public class LinkParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private SearchParams searchParams;
    private EntityProfileParams entityProfileParams;

    public LinkParams() {
    }

    public LinkParams(SearchParams searchParams, EntityProfileParams entityProfileParams) {
        this.searchParams = searchParams;
        this.entityProfileParams = entityProfileParams;
    }

    /**
     * Context to define the search page
     */
    public SearchParams getSearchParams() {
        return searchParams;
    }
    /**
     * Context to define the search page
     */
    public void setSearchParams(SearchParams searchParams) {
        this.searchParams = searchParams;
    }

    /**
     * Context to define the entity profile page
     */
    public EntityProfileParams getEntityProfileParams() {
        return entityProfileParams;
    }
    /**
     * Context to define the entity profile page
     */
    public void setEntityProfileParams(EntityProfileParams entityProfileParams) {
        this.entityProfileParams = entityProfileParams;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (searchParams != null) {
            joiner.add("searchParams: " + searchParams);
        }
        if (entityProfileParams != null) {
            joiner.add("entityProfileParams: " + entityProfileParams);
        }
        return joiner.toString();
    }

    public static LinkParams.Builder builder() {
        return new LinkParams.Builder();
    }

    public static class Builder {

        private SearchParams searchParams;
        private EntityProfileParams entityProfileParams;

        public Builder() {
        }

        /**
         * Context to define the search page
         */
        public Builder setSearchParams(SearchParams searchParams) {
            this.searchParams = searchParams;
            return this;
        }

        /**
         * Context to define the entity profile page
         */
        public Builder setEntityProfileParams(EntityProfileParams entityProfileParams) {
            this.entityProfileParams = entityProfileParams;
            return this;
        }


        public LinkParams build() {
            return new LinkParams(searchParams, entityProfileParams);
        }

    }
}
