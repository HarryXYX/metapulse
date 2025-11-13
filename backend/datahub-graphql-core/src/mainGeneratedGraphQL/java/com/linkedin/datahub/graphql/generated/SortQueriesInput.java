package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class SortQueriesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private SortCriterion sortCriterion;

    public SortQueriesInput() {
    }

    public SortQueriesInput(SortCriterion sortCriterion) {
        this.sortCriterion = sortCriterion;
    }

    public SortCriterion getSortCriterion() {
        return sortCriterion;
    }
    public void setSortCriterion(SortCriterion sortCriterion) {
        this.sortCriterion = sortCriterion;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (sortCriterion != null) {
            joiner.add("sortCriterion: " + sortCriterion);
        }
        return joiner.toString();
    }

    public static SortQueriesInput.Builder builder() {
        return new SortQueriesInput.Builder();
    }

    public static class Builder {

        private SortCriterion sortCriterion;

        public Builder() {
        }

        public Builder setSortCriterion(SortCriterion sortCriterion) {
            this.sortCriterion = sortCriterion;
            return this;
        }


        public SortQueriesInput build() {
            return new SortQueriesInput(sortCriterion);
        }

    }
}
