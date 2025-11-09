package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for browse queries
 */
public class BrowseInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private EntityType type;
    private java.util.List<String> path;
    private Integer start;
    private Integer count;
    @Deprecated
    private java.util.List<FacetFilterInput> filters;
    private java.util.List<AndFilterInput> orFilters;

    public BrowseInput() {
    }

    public BrowseInput(EntityType type, java.util.List<String> path, Integer start, Integer count, java.util.List<FacetFilterInput> filters, java.util.List<AndFilterInput> orFilters) {
        this.type = type;
        this.path = path;
        this.start = start;
        this.count = count;
        this.filters = filters;
        this.orFilters = orFilters;
    }

    public EntityType getType() {
        return type;
    }
    public void setType(EntityType type) {
        this.type = type;
    }

    public java.util.List<String> getPath() {
        return path;
    }
    public void setPath(java.util.List<String> path) {
        this.path = path;
    }

    public Integer getStart() {
        return start;
    }
    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    @Deprecated
    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    @Deprecated
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
    }

    public java.util.List<AndFilterInput> getOrFilters() {
        return orFilters;
    }
    public void setOrFilters(java.util.List<AndFilterInput> orFilters) {
        this.orFilters = orFilters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (path != null) {
            joiner.add("path: " + path);
        }
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (filters != null) {
            joiner.add("filters: " + filters);
        }
        if (orFilters != null) {
            joiner.add("orFilters: " + orFilters);
        }
        return joiner.toString();
    }

    public static BrowseInput.Builder builder() {
        return new BrowseInput.Builder();
    }

    public static class Builder {

        private EntityType type;
        private java.util.List<String> path;
        private Integer start;
        private Integer count;
        private java.util.List<FacetFilterInput> filters;
        private java.util.List<AndFilterInput> orFilters;

        public Builder() {
        }

        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        public Builder setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        @Deprecated
        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setOrFilters(java.util.List<AndFilterInput> orFilters) {
            this.orFilters = orFilters;
            return this;
        }


        public BrowseInput build() {
            return new BrowseInput(type, path, start, count, filters, orFilters);
        }

    }
}
