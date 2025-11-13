package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required in order to sort search results
 */
public class SearchSortInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Deprecated
    private SortCriterion sortCriterion;
    private java.util.List<SortCriterion> sortCriteria;

    public SearchSortInput() {
    }

    public SearchSortInput(SortCriterion sortCriterion, java.util.List<SortCriterion> sortCriteria) {
        this.sortCriterion = sortCriterion;
        this.sortCriteria = sortCriteria;
    }

    @Deprecated
    public SortCriterion getSortCriterion() {
        return sortCriterion;
    }
    @Deprecated
    public void setSortCriterion(SortCriterion sortCriterion) {
        this.sortCriterion = sortCriterion;
    }

    public java.util.List<SortCriterion> getSortCriteria() {
        return sortCriteria;
    }
    public void setSortCriteria(java.util.List<SortCriterion> sortCriteria) {
        this.sortCriteria = sortCriteria;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (sortCriterion != null) {
            joiner.add("sortCriterion: " + sortCriterion);
        }
        if (sortCriteria != null) {
            joiner.add("sortCriteria: " + sortCriteria);
        }
        return joiner.toString();
    }

    public static SearchSortInput.Builder builder() {
        return new SearchSortInput.Builder();
    }

    public static class Builder {

        private SortCriterion sortCriterion;
        private java.util.List<SortCriterion> sortCriteria;

        public Builder() {
        }

        @Deprecated
        public Builder setSortCriterion(SortCriterion sortCriterion) {
            this.sortCriterion = sortCriterion;
            return this;
        }

        public Builder setSortCriteria(java.util.List<SortCriterion> sortCriteria) {
            this.sortCriteria = sortCriteria;
            return this;
        }


        public SearchSortInput build() {
            return new SearchSortInput(sortCriterion, sortCriteria);
        }

    }
}
