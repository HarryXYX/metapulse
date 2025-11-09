package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for a full text search query across entities, specifying a starting pointer. Allows paging beyond 10k results
 */
public class ScrollAcrossEntitiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityType> types;
    @javax.annotation.Nonnull
    private String query;
    private String scrollId;
    private String keepAlive;
    private Integer count;
    private java.util.List<AndFilterInput> orFilters;
    private String viewUrn;
    private SearchFlags searchFlags;
    private SearchSortInput sortInput;

    public ScrollAcrossEntitiesInput() {
    }

    public ScrollAcrossEntitiesInput(java.util.List<EntityType> types, String query, String scrollId, String keepAlive, Integer count, java.util.List<AndFilterInput> orFilters, String viewUrn, SearchFlags searchFlags, SearchSortInput sortInput) {
        this.types = types;
        this.query = query;
        this.scrollId = scrollId;
        this.keepAlive = keepAlive;
        this.count = count;
        this.orFilters = orFilters;
        this.viewUrn = viewUrn;
        this.searchFlags = searchFlags;
        this.sortInput = sortInput;
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

    public String getScrollId() {
        return scrollId;
    }
    public void setScrollId(String scrollId) {
        this.scrollId = scrollId;
    }

    public String getKeepAlive() {
        return keepAlive;
    }
    public void setKeepAlive(String keepAlive) {
        this.keepAlive = keepAlive;
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

    public SearchFlags getSearchFlags() {
        return searchFlags;
    }
    public void setSearchFlags(SearchFlags searchFlags) {
        this.searchFlags = searchFlags;
    }

    public SearchSortInput getSortInput() {
        return sortInput;
    }
    public void setSortInput(SearchSortInput sortInput) {
        this.sortInput = sortInput;
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
        if (scrollId != null) {
            joiner.add("scrollId: \"" + scrollId + "\"");
        }
        if (keepAlive != null) {
            joiner.add("keepAlive: \"" + keepAlive + "\"");
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
        if (searchFlags != null) {
            joiner.add("searchFlags: " + searchFlags);
        }
        if (sortInput != null) {
            joiner.add("sortInput: " + sortInput);
        }
        return joiner.toString();
    }

    public static ScrollAcrossEntitiesInput.Builder builder() {
        return new ScrollAcrossEntitiesInput.Builder();
    }

    public static class Builder {

        private java.util.List<EntityType> types;
        private String query;
        private String scrollId;
        private String keepAlive;
        private Integer count;
        private java.util.List<AndFilterInput> orFilters;
        private String viewUrn;
        private SearchFlags searchFlags;
        private SearchSortInput sortInput;

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

        public Builder setScrollId(String scrollId) {
            this.scrollId = scrollId;
            return this;
        }

        public Builder setKeepAlive(String keepAlive) {
            this.keepAlive = keepAlive;
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

        public Builder setSearchFlags(SearchFlags searchFlags) {
            this.searchFlags = searchFlags;
            return this;
        }

        public Builder setSortInput(SearchSortInput sortInput) {
            this.sortInput = sortInput;
            return this;
        }


        public ScrollAcrossEntitiesInput build() {
            return new ScrollAcrossEntitiesInput(types, query, scrollId, keepAlive, count, orFilters, viewUrn, searchFlags, sortInput);
        }

    }
}
