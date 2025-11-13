package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Results returned by the ListRecommendations query
 */
public class ListRecommendationsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<RecommendationModule> modules;

    public ListRecommendationsResult() {
    }

    public ListRecommendationsResult(java.util.List<RecommendationModule> modules) {
        this.modules = modules;
    }

    /**
     * List of modules to show
     */
    public java.util.List<RecommendationModule> getModules() {
        return modules;
    }
    /**
     * List of modules to show
     */
    public void setModules(java.util.List<RecommendationModule> modules) {
        this.modules = modules;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (modules != null) {
            joiner.add("modules: " + modules);
        }
        return joiner.toString();
    }

    public static ListRecommendationsResult.Builder builder() {
        return new ListRecommendationsResult.Builder();
    }

    public static class Builder {

        private java.util.List<RecommendationModule> modules;

        public Builder() {
        }

        /**
         * List of modules to show
         */
        public Builder setModules(java.util.List<RecommendationModule> modules) {
            this.modules = modules;
            return this;
        }


        public ListRecommendationsResult build() {
            return new ListRecommendationsResult(modules);
        }

    }
}
