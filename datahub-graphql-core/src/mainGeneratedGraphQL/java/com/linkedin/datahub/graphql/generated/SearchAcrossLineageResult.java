package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Individual search result from a search across relationships query (has added metadata about the path)
 */
public class SearchAcrossLineageResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Entity entity;
    private java.util.List<SearchInsight> insights;
    @javax.annotation.Nonnull
    private java.util.List<MatchedField> matchedFields;
    private java.util.List<EntityPath> paths;
    private int degree;
    private java.util.List<Integer> degrees;
    private boolean explored;
    private boolean truncatedChildren;
    private boolean ignoredAsHop;

    public SearchAcrossLineageResult() {
    }

    public SearchAcrossLineageResult(Entity entity, java.util.List<SearchInsight> insights, java.util.List<MatchedField> matchedFields, java.util.List<EntityPath> paths, int degree, java.util.List<Integer> degrees, boolean explored, boolean truncatedChildren, boolean ignoredAsHop) {
        this.entity = entity;
        this.insights = insights;
        this.matchedFields = matchedFields;
        this.paths = paths;
        this.degree = degree;
        this.degrees = degrees;
        this.explored = explored;
        this.truncatedChildren = truncatedChildren;
        this.ignoredAsHop = ignoredAsHop;
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
     * Optional list of entities between the source and destination node
     */
    public java.util.List<EntityPath> getPaths() {
        return paths;
    }
    /**
     * Optional list of entities between the source and destination node
     */
    public void setPaths(java.util.List<EntityPath> paths) {
        this.paths = paths;
    }

    /**
     * Degree of relationship (number of hops to get to entity)
     */
    public int getDegree() {
        return degree;
    }
    /**
     * Degree of relationship (number of hops to get to entity)
     */
    public void setDegree(int degree) {
        this.degree = degree;
    }

    /**
     * Degrees of relationship (for entities discoverable at multiple degrees)
     */
    public java.util.List<Integer> getDegrees() {
        return degrees;
    }
    /**
     * Degrees of relationship (for entities discoverable at multiple degrees)
     */
    public void setDegrees(java.util.List<Integer> degrees) {
        this.degrees = degrees;
    }

    /**
     * Marks whether or not this entity was explored further for lineage
     */
    public boolean getExplored() {
        return explored;
    }
    /**
     * Marks whether or not this entity was explored further for lineage
     */
    public void setExplored(boolean explored) {
        this.explored = explored;
    }

    /**
     * Indicates this destination node has additional unexplored child relationships
     */
    public boolean getTruncatedChildren() {
        return truncatedChildren;
    }
    /**
     * Indicates this destination node has additional unexplored child relationships
     */
    public void setTruncatedChildren(boolean truncatedChildren) {
        this.truncatedChildren = truncatedChildren;
    }

    /**
     * Whether this relationship was ignored as a hop
     */
    public boolean getIgnoredAsHop() {
        return ignoredAsHop;
    }
    /**
     * Whether this relationship was ignored as a hop
     */
    public void setIgnoredAsHop(boolean ignoredAsHop) {
        this.ignoredAsHop = ignoredAsHop;
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
        if (paths != null) {
            joiner.add("paths: " + paths);
        }
        joiner.add("degree: " + degree);
        if (degrees != null) {
            joiner.add("degrees: " + degrees);
        }
        joiner.add("explored: " + explored);
        joiner.add("truncatedChildren: " + truncatedChildren);
        joiner.add("ignoredAsHop: " + ignoredAsHop);
        return joiner.toString();
    }

    public static SearchAcrossLineageResult.Builder builder() {
        return new SearchAcrossLineageResult.Builder();
    }

    public static class Builder {

        private Entity entity;
        private java.util.List<SearchInsight> insights;
        private java.util.List<MatchedField> matchedFields;
        private java.util.List<EntityPath> paths;
        private int degree;
        private java.util.List<Integer> degrees;
        private boolean explored;
        private boolean truncatedChildren;
        private boolean ignoredAsHop;

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
         * Optional list of entities between the source and destination node
         */
        public Builder setPaths(java.util.List<EntityPath> paths) {
            this.paths = paths;
            return this;
        }

        /**
         * Degree of relationship (number of hops to get to entity)
         */
        public Builder setDegree(int degree) {
            this.degree = degree;
            return this;
        }

        /**
         * Degrees of relationship (for entities discoverable at multiple degrees)
         */
        public Builder setDegrees(java.util.List<Integer> degrees) {
            this.degrees = degrees;
            return this;
        }

        /**
         * Marks whether or not this entity was explored further for lineage
         */
        public Builder setExplored(boolean explored) {
            this.explored = explored;
            return this;
        }

        /**
         * Indicates this destination node has additional unexplored child relationships
         */
        public Builder setTruncatedChildren(boolean truncatedChildren) {
            this.truncatedChildren = truncatedChildren;
            return this;
        }

        /**
         * Whether this relationship was ignored as a hop
         */
        public Builder setIgnoredAsHop(boolean ignoredAsHop) {
            this.ignoredAsHop = ignoredAsHop;
            return this;
        }


        public SearchAcrossLineageResult build() {
            return new SearchAcrossLineageResult(entity, insights, matchedFields, paths, degree, degrees, explored, truncatedChildren, ignoredAsHop);
        }

    }
}
