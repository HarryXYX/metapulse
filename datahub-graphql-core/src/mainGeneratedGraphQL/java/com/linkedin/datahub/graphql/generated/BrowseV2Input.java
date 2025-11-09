package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for browse queries
 */
public class BrowseV2Input implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private EntityType type;
    private java.util.List<EntityType> types;
    private java.util.List<String> path;
    private Integer start;
    private Integer count;
    private java.util.List<AndFilterInput> orFilters;
    private String viewUrn;
    private String query;
    private SearchFlags searchFlags;

    public BrowseV2Input() {
    }

    public BrowseV2Input(EntityType type, java.util.List<EntityType> types, java.util.List<String> path, Integer start, Integer count, java.util.List<AndFilterInput> orFilters, String viewUrn, String query, SearchFlags searchFlags) {
        this.type = type;
        this.types = types;
        this.path = path;
        this.start = start;
        this.count = count;
        this.orFilters = orFilters;
        this.viewUrn = viewUrn;
        this.query = query;
        this.searchFlags = searchFlags;
    }

    public EntityType getType() {
        return type;
    }
    public void setType(EntityType type) {
        this.type = type;
    }

    public java.util.List<EntityType> getTypes() {
        return types;
    }
    public void setTypes(java.util.List<EntityType> types) {
        this.types = types;
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

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public SearchFlags getSearchFlags() {
        return searchFlags;
    }
    public void setSearchFlags(SearchFlags searchFlags) {
        this.searchFlags = searchFlags;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (types != null) {
            joiner.add("types: " + types);
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
        if (orFilters != null) {
            joiner.add("orFilters: " + orFilters);
        }
        if (viewUrn != null) {
            joiner.add("viewUrn: \"" + viewUrn + "\"");
        }
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (searchFlags != null) {
            joiner.add("searchFlags: " + searchFlags);
        }
        return joiner.toString();
    }

    public static BrowseV2Input.Builder builder() {
        return new BrowseV2Input.Builder();
    }

    public static class Builder {

        private EntityType type;
        private java.util.List<EntityType> types;
        private java.util.List<String> path;
        private Integer start;
        private Integer count;
        private java.util.List<AndFilterInput> orFilters;
        private String viewUrn;
        private String query;
        private SearchFlags searchFlags;

        public Builder() {
        }

        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        public Builder setTypes(java.util.List<EntityType> types) {
            this.types = types;
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

        public Builder setOrFilters(java.util.List<AndFilterInput> orFilters) {
            this.orFilters = orFilters;
            return this;
        }

        public Builder setViewUrn(String viewUrn) {
            this.viewUrn = viewUrn;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setSearchFlags(SearchFlags searchFlags) {
            this.searchFlags = searchFlags;
            return this;
        }


        public BrowseV2Input build() {
            return new BrowseV2Input(type, types, path, start, count, orFilters, viewUrn, query, searchFlags);
        }

    }
}
