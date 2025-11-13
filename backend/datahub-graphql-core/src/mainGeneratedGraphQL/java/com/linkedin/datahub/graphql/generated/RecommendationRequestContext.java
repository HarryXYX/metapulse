package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Context that defines the page requesting recommendations
i.e. for search pages, the query/filters. for entity pages, the entity urn and tab
 */
public class RecommendationRequestContext implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private ScenarioType scenario;
    private SearchRequestContext searchRequestContext;
    private EntityRequestContext entityRequestContext;

    public RecommendationRequestContext() {
    }

    public RecommendationRequestContext(ScenarioType scenario, SearchRequestContext searchRequestContext, EntityRequestContext entityRequestContext) {
        this.scenario = scenario;
        this.searchRequestContext = searchRequestContext;
        this.entityRequestContext = entityRequestContext;
    }

    public ScenarioType getScenario() {
        return scenario;
    }
    public void setScenario(ScenarioType scenario) {
        this.scenario = scenario;
    }

    public SearchRequestContext getSearchRequestContext() {
        return searchRequestContext;
    }
    public void setSearchRequestContext(SearchRequestContext searchRequestContext) {
        this.searchRequestContext = searchRequestContext;
    }

    public EntityRequestContext getEntityRequestContext() {
        return entityRequestContext;
    }
    public void setEntityRequestContext(EntityRequestContext entityRequestContext) {
        this.entityRequestContext = entityRequestContext;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (scenario != null) {
            joiner.add("scenario: " + scenario);
        }
        if (searchRequestContext != null) {
            joiner.add("searchRequestContext: " + searchRequestContext);
        }
        if (entityRequestContext != null) {
            joiner.add("entityRequestContext: " + entityRequestContext);
        }
        return joiner.toString();
    }

    public static RecommendationRequestContext.Builder builder() {
        return new RecommendationRequestContext.Builder();
    }

    public static class Builder {

        private ScenarioType scenario;
        private SearchRequestContext searchRequestContext;
        private EntityRequestContext entityRequestContext;

        public Builder() {
        }

        public Builder setScenario(ScenarioType scenario) {
            this.scenario = scenario;
            return this;
        }

        public Builder setSearchRequestContext(SearchRequestContext searchRequestContext) {
            this.searchRequestContext = searchRequestContext;
            return this;
        }

        public Builder setEntityRequestContext(EntityRequestContext entityRequestContext) {
            this.entityRequestContext = entityRequestContext;
            return this;
        }


        public RecommendationRequestContext build() {
            return new RecommendationRequestContext(scenario, searchRequestContext, entityRequestContext);
        }

    }
}
