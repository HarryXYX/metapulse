package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An individual search result hit
 */
public class SearchResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Entity entity;
    private java.util.List<SearchInsight> insights;
    @javax.annotation.Nonnull
    private java.util.List<MatchedField> matchedFields;
    private java.util.List<ExtraProperty> extraProperties;

    public SearchResult() {
    }

    public SearchResult(Entity entity, java.util.List<SearchInsight> insights, java.util.List<MatchedField> matchedFields, java.util.List<ExtraProperty> extraProperties) {
        this.entity = entity;
        this.insights = insights;
        this.matchedFields = matchedFields;
        this.extraProperties = extraProperties;
    }

    /**
     * The resolved DataHub Metadata Entity matching the search query
     */
    public Entity getEntity() {
        return entity;
    }
    /**
     * The resolved DataHub Metadata Entity matching the search query
     */
    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    /**
     * Insights about why the search result was matched
     */
    public java.util.List<SearchInsight> getInsights() {
        return insights;
    }
    /**
     * Insights about why the search result was matched
     */
    public void setInsights(java.util.List<SearchInsight> insights) {
        this.insights = insights;
    }

    /**
     * Matched field hint
     */
    public java.util.List<MatchedField> getMatchedFields() {
        return matchedFields;
    }
    /**
     * Matched field hint
     */
    public void setMatchedFields(java.util.List<MatchedField> matchedFields) {
        this.matchedFields = matchedFields;
    }

    /**
     * Additional properties about the search result. Used for rendering in the UI
     */
    public java.util.List<ExtraProperty> getExtraProperties() {
        return extraProperties;
    }
    /**
     * Additional properties about the search result. Used for rendering in the UI
     */
    public void setExtraProperties(java.util.List<ExtraProperty> extraProperties) {
        this.extraProperties = extraProperties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (entity != null) {
            joiner.add("entity: " + entity);
        }
        if (insights != null) {
            joiner.add("insights: " + insights);
        }
        if (matchedFields != null) {
            joiner.add("matchedFields: " + matchedFields);
        }
        if (extraProperties != null) {
            joiner.add("extraProperties: " + extraProperties);
        }
        return joiner.toString();
    }

    public static SearchResult.Builder builder() {
        return new SearchResult.Builder();
    }

    public static class Builder {

        private Entity entity;
        private java.util.List<SearchInsight> insights;
        private java.util.List<MatchedField> matchedFields;
        private java.util.List<ExtraProperty> extraProperties;

        public Builder() {
        }

        /**
         * The resolved DataHub Metadata Entity matching the search query
         */
        public Builder setEntity(Entity entity) {
            this.entity = entity;
            return this;
        }

        /**
         * Insights about why the search result was matched
         */
        public Builder setInsights(java.util.List<SearchInsight> insights) {
            this.insights = insights;
            return this;
        }

        /**
         * Matched field hint
         */
        public Builder setMatchedFields(java.util.List<MatchedField> matchedFields) {
            this.matchedFields = matchedFields;
            return this;
        }

        /**
         * Additional properties about the search result. Used for rendering in the UI
         */
        public Builder setExtraProperties(java.util.List<ExtraProperty> extraProperties) {
            this.extraProperties = extraProperties;
            return this;
        }


        public SearchResult build() {
            return new SearchResult(entity, insights, matchedFields, extraProperties);
        }

    }
}
