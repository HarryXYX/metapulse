package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for fetching UI recommendations
 */
public class ListRecommendationsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String userUrn;
    private RecommendationRequestContext requestContext;
    private Integer limit;
    private String viewUrn;

    public ListRecommendationsInput() {
    }

    public ListRecommendationsInput(String userUrn, RecommendationRequestContext requestContext, Integer limit, String viewUrn) {
        this.userUrn = userUrn;
        this.requestContext = requestContext;
        this.limit = limit;
        this.viewUrn = viewUrn;
    }

    public String getUserUrn() {
        return userUrn;
    }
    public void setUserUrn(String userUrn) {
        this.userUrn = userUrn;
    }

    public RecommendationRequestContext getRequestContext() {
        return requestContext;
    }
    public void setRequestContext(RecommendationRequestContext requestContext) {
        this.requestContext = requestContext;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public String getViewUrn() {
        return viewUrn;
    }
    public void setViewUrn(String viewUrn) {
        this.viewUrn = viewUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (userUrn != null) {
            joiner.add("userUrn: \"" + userUrn + "\"");
        }
        if (requestContext != null) {
            joiner.add("requestContext: " + requestContext);
        }
        if (limit != null) {
            joiner.add("limit: " + limit);
        }
        if (viewUrn != null) {
            joiner.add("viewUrn: \"" + viewUrn + "\"");
        }
        return joiner.toString();
    }

    public static ListRecommendationsInput.Builder builder() {
        return new ListRecommendationsInput.Builder();
    }

    public static class Builder {

        private String userUrn;
        private RecommendationRequestContext requestContext;
        private Integer limit;
        private String viewUrn;

        public Builder() {
        }

        public Builder setUserUrn(String userUrn) {
            this.userUrn = userUrn;
            return this;
        }

        public Builder setRequestContext(RecommendationRequestContext requestContext) {
            this.requestContext = requestContext;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setViewUrn(String viewUrn) {
            this.viewUrn = viewUrn;
            return this;
        }


        public ListRecommendationsInput build() {
            return new ListRecommendationsInput(userUrn, requestContext, limit, viewUrn);
        }

    }
}
