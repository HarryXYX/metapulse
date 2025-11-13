package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for performing an auto completion query against a a set of Metadata Entities
 */
public class AutoCompleteMultipleInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityType> types;
    @javax.annotation.Nonnull
    private String query;
    private String field;
    private Integer limit;
    private java.util.List<FacetFilterInput> filters;
    private java.util.List<AndFilterInput> orFilters;
    private String viewUrn;

    public AutoCompleteMultipleInput() {
    }

    public AutoCompleteMultipleInput(java.util.List<EntityType> types, String query, String field, Integer limit, java.util.List<FacetFilterInput> filters, java.util.List<AndFilterInput> orFilters, String viewUrn) {
        this.types = types;
        this.query = query;
        this.field = field;
        this.limit = limit;
        this.filters = filters;
        this.orFilters = orFilters;
        this.viewUrn = viewUrn;
    }

    public java.util.List<EntityType> getTypes() {
        return types;
    }
    public void setTypes(java.util.List<EntityType> types) {
        this.types = types;
    }

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }

    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
    }

    public java.util.List<AndFilterInput> getOrFilters() {
        return orFilters;
    }
    public void setOrFilters(java.util.List<AndFilterInput> orFilters) {
        this.orFilters = orFilters;
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
        if (types != null) {
            joiner.add("types: " + types);
        }
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (field != null) {
            joiner.add("field: \"" + field + "\"");
        }
        if (limit != null) {
            joiner.add("limit: " + limit);
        }
        if (filters != null) {
            joiner.add("filters: " + filters);
        }
        if (orFilters != null) {
            joiner.add("orFilters: " + orFilters);
        }
        if (viewUrn != null) {
            joiner.add("viewUrn: \"" + viewUrn + "\"");
        }
        return joiner.toString();
    }

    public static AutoCompleteMultipleInput.Builder builder() {
        return new AutoCompleteMultipleInput.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> types;
        private String query;
        private String field;
        private Integer limit;
        private java.util.List<FacetFilterInput> filters;
        private java.util.List<AndFilterInput> orFilters;
        private String viewUrn;

        public Builder() {
        }

        public Builder setTypes(java.util.List<EntityType> types) {
            this.types = types;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setField(String field) {
            this.field = field;
            return this;
        }

        public Builder setLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setOrFilters(java.util.List<AndFilterInput> orFilters) {
            this.orFilters = orFilters;
            return this;
        }

        public Builder setViewUrn(String viewUrn) {
            this.viewUrn = viewUrn;
            return this;
        }


        public AutoCompleteMultipleInput build() {
            return new AutoCompleteMultipleInput(types, query, field, limit, filters, orFilters, viewUrn);
        }

    }
}
