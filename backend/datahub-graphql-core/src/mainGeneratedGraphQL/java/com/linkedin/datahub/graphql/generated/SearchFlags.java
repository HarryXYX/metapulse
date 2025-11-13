package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Set of flags to control search behavior
 */
public class SearchFlags implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean skipCache;
    private Integer maxAggValues;
    private Boolean fulltext;
    private Boolean skipHighlighting;
    private Boolean skipAggregates;
    private Boolean getSuggestions;
    private GroupingSpec groupingSpec;
    private Boolean includeSoftDeleted;
    private Boolean includeRestricted;
    private java.util.List<String> customHighlightingFields;
    private Boolean includeStructuredPropertyFacets;
    private Boolean filterNonLatestVersions;

    public SearchFlags() {
    }

    public SearchFlags(Boolean skipCache, Integer maxAggValues, Boolean fulltext, Boolean skipHighlighting, Boolean skipAggregates, Boolean getSuggestions, GroupingSpec groupingSpec, Boolean includeSoftDeleted, Boolean includeRestricted, java.util.List<String> customHighlightingFields, Boolean includeStructuredPropertyFacets, Boolean filterNonLatestVersions) {
        this.skipCache = skipCache;
        this.maxAggValues = maxAggValues;
        this.fulltext = fulltext;
        this.skipHighlighting = skipHighlighting;
        this.skipAggregates = skipAggregates;
        this.getSuggestions = getSuggestions;
        this.groupingSpec = groupingSpec;
        this.includeSoftDeleted = includeSoftDeleted;
        this.includeRestricted = includeRestricted;
        this.customHighlightingFields = customHighlightingFields;
        this.includeStructuredPropertyFacets = includeStructuredPropertyFacets;
        this.filterNonLatestVersions = filterNonLatestVersions;
    }

    public Boolean getSkipCache() {
        return skipCache;
    }
    public void setSkipCache(Boolean skipCache) {
        this.skipCache = skipCache;
    }

    public Integer getMaxAggValues() {
        return maxAggValues;
    }
    public void setMaxAggValues(Integer maxAggValues) {
        this.maxAggValues = maxAggValues;
    }

    public Boolean getFulltext() {
        return fulltext;
    }
    public void setFulltext(Boolean fulltext) {
        this.fulltext = fulltext;
    }

    public Boolean getSkipHighlighting() {
        return skipHighlighting;
    }
    public void setSkipHighlighting(Boolean skipHighlighting) {
        this.skipHighlighting = skipHighlighting;
    }

    public Boolean getSkipAggregates() {
        return skipAggregates;
    }
    public void setSkipAggregates(Boolean skipAggregates) {
        this.skipAggregates = skipAggregates;
    }

    public Boolean getGetSuggestions() {
        return getSuggestions;
    }
    public void setGetSuggestions(Boolean getSuggestions) {
        this.getSuggestions = getSuggestions;
    }

    public GroupingSpec getGroupingSpec() {
        return groupingSpec;
    }
    public void setGroupingSpec(GroupingSpec groupingSpec) {
        this.groupingSpec = groupingSpec;
    }

    public Boolean getIncludeSoftDeleted() {
        return includeSoftDeleted;
    }
    public void setIncludeSoftDeleted(Boolean includeSoftDeleted) {
        this.includeSoftDeleted = includeSoftDeleted;
    }

    public Boolean getIncludeRestricted() {
        return includeRestricted;
    }
    public void setIncludeRestricted(Boolean includeRestricted) {
        this.includeRestricted = includeRestricted;
    }

    public java.util.List<String> getCustomHighlightingFields() {
        return customHighlightingFields;
    }
    public void setCustomHighlightingFields(java.util.List<String> customHighlightingFields) {
        this.customHighlightingFields = customHighlightingFields;
    }

    public Boolean getIncludeStructuredPropertyFacets() {
        return includeStructuredPropertyFacets;
    }
    public void setIncludeStructuredPropertyFacets(Boolean includeStructuredPropertyFacets) {
        this.includeStructuredPropertyFacets = includeStructuredPropertyFacets;
    }

    public Boolean getFilterNonLatestVersions() {
        return filterNonLatestVersions;
    }
    public void setFilterNonLatestVersions(Boolean filterNonLatestVersions) {
        this.filterNonLatestVersions = filterNonLatestVersions;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (skipCache != null) {
            joiner.add("skipCache: " + skipCache);
        }
        if (maxAggValues != null) {
            joiner.add("maxAggValues: " + maxAggValues);
        }
        if (fulltext != null) {
            joiner.add("fulltext: " + fulltext);
        }
        if (skipHighlighting != null) {
            joiner.add("skipHighlighting: " + skipHighlighting);
        }
        if (skipAggregates != null) {
            joiner.add("skipAggregates: " + skipAggregates);
        }
        if (getSuggestions != null) {
            joiner.add("getSuggestions: " + getSuggestions);
        }
        if (groupingSpec != null) {
            joiner.add("groupingSpec: " + groupingSpec);
        }
        if (includeSoftDeleted != null) {
            joiner.add("includeSoftDeleted: " + includeSoftDeleted);
        }
        if (includeRestricted != null) {
            joiner.add("includeRestricted: " + includeRestricted);
        }
        if (customHighlightingFields != null) {
            joiner.add("customHighlightingFields: " + customHighlightingFields);
        }
        if (includeStructuredPropertyFacets != null) {
            joiner.add("includeStructuredPropertyFacets: " + includeStructuredPropertyFacets);
        }
        if (filterNonLatestVersions != null) {
            joiner.add("filterNonLatestVersions: " + filterNonLatestVersions);
        }
        return joiner.toString();
    }

    public static SearchFlags.Builder builder() {
        return new SearchFlags.Builder();
    }

    public static class Builder {

        private Boolean skipCache;
        private Integer maxAggValues;
        private Boolean fulltext;
        private Boolean skipHighlighting;
        private Boolean skipAggregates;
        private Boolean getSuggestions;
        private GroupingSpec groupingSpec;
        private Boolean includeSoftDeleted;
        private Boolean includeRestricted;
        private java.util.List<String> customHighlightingFields;
        private Boolean includeStructuredPropertyFacets;
        private Boolean filterNonLatestVersions;

        public Builder() {
        }

        public Builder setSkipCache(Boolean skipCache) {
            this.skipCache = skipCache;
            return this;
        }

        public Builder setMaxAggValues(Integer maxAggValues) {
            this.maxAggValues = maxAggValues;
            return this;
        }

        public Builder setFulltext(Boolean fulltext) {
            this.fulltext = fulltext;
            return this;
        }

        public Builder setSkipHighlighting(Boolean skipHighlighting) {
            this.skipHighlighting = skipHighlighting;
            return this;
        }

        public Builder setSkipAggregates(Boolean skipAggregates) {
            this.skipAggregates = skipAggregates;
            return this;
        }

        public Builder setGetSuggestions(Boolean getSuggestions) {
            this.getSuggestions = getSuggestions;
            return this;
        }

        public Builder setGroupingSpec(GroupingSpec groupingSpec) {
            this.groupingSpec = groupingSpec;
            return this;
        }

        public Builder setIncludeSoftDeleted(Boolean includeSoftDeleted) {
            this.includeSoftDeleted = includeSoftDeleted;
            return this;
        }

        public Builder setIncludeRestricted(Boolean includeRestricted) {
            this.includeRestricted = includeRestricted;
            return this;
        }

        public Builder setCustomHighlightingFields(java.util.List<String> customHighlightingFields) {
            this.customHighlightingFields = customHighlightingFields;
            return this;
        }

        public Builder setIncludeStructuredPropertyFacets(Boolean includeStructuredPropertyFacets) {
            this.includeStructuredPropertyFacets = includeStructuredPropertyFacets;
            return this;
        }

        public Builder setFilterNonLatestVersions(Boolean filterNonLatestVersions) {
            this.filterNonLatestVersions = filterNonLatestVersions;
            return this;
        }


        public SearchFlags build() {
            return new SearchFlags(skipCache, maxAggValues, fulltext, skipHighlighting, skipAggregates, getSuggestions, groupingSpec, includeSoftDeleted, includeRestricted, customHighlightingFields, includeStructuredPropertyFacets, filterNonLatestVersions);
        }

    }
}
