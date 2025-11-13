package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments for a search query over the results of a multi-hop graph query, uses scroll API
 */
public class ScrollAcrossLineageInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String urn;
    @javax.annotation.Nonnull
    private LineageDirection direction;
    private java.util.List<EntityType> types;
    private String query;
    private String scrollId;
    private String keepAlive;
    private Integer count;
    private java.util.List<AndFilterInput> orFilters;
    private Long startTimeMillis;
    private Long endTimeMillis;
    private SearchFlags searchFlags;
    private LineageFlags lineageFlags;

    public ScrollAcrossLineageInput() {
    }

    public ScrollAcrossLineageInput(String urn, LineageDirection direction, java.util.List<EntityType> types, String query, String scrollId, String keepAlive, Integer count, java.util.List<AndFilterInput> orFilters, Long startTimeMillis, Long endTimeMillis, SearchFlags searchFlags, LineageFlags lineageFlags) {
        this.urn = urn;
        this.direction = direction;
        this.types = types;
        this.query = query;
        this.scrollId = scrollId;
        this.keepAlive = keepAlive;
        this.count = count;
        this.orFilters = orFilters;
        this.startTimeMillis = startTimeMillis;
        this.endTimeMillis = endTimeMillis;
        this.searchFlags = searchFlags;
        this.lineageFlags = lineageFlags;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public LineageDirection getDirection() {
        return direction;
    }
    public void setDirection(LineageDirection direction) {
        this.direction = direction;
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

    public Long getStartTimeMillis() {
        return startTimeMillis;
    }
    public void setStartTimeMillis(Long startTimeMillis) {
        this.startTimeMillis = startTimeMillis;
    }

    public Long getEndTimeMillis() {
        return endTimeMillis;
    }
    public void setEndTimeMillis(Long endTimeMillis) {
        this.endTimeMillis = endTimeMillis;
    }

    public SearchFlags getSearchFlags() {
        return searchFlags;
    }
    public void setSearchFlags(SearchFlags searchFlags) {
        this.searchFlags = searchFlags;
    }

    public LineageFlags getLineageFlags() {
        return lineageFlags;
    }
    public void setLineageFlags(LineageFlags lineageFlags) {
        this.lineageFlags = lineageFlags;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (direction != null) {
            joiner.add("direction: " + direction);
        }
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
        if (startTimeMillis != null) {
            joiner.add("startTimeMillis: " + startTimeMillis);
        }
        if (endTimeMillis != null) {
            joiner.add("endTimeMillis: " + endTimeMillis);
        }
        if (searchFlags != null) {
            joiner.add("searchFlags: " + searchFlags);
        }
        if (lineageFlags != null) {
            joiner.add("lineageFlags: " + lineageFlags);
        }
        return joiner.toString();
    }

    public static ScrollAcrossLineageInput.Builder builder() {
        return new ScrollAcrossLineageInput.Builder();
    }

    public static class Builder {

        private String urn;
        private LineageDirection direction;
        private java.util.List<EntityType> types;
        private String query;
        private String scrollId;
        private String keepAlive;
        private Integer count;
        private java.util.List<AndFilterInput> orFilters;
        private Long startTimeMillis;
        private Long endTimeMillis;
        private SearchFlags searchFlags;
        private LineageFlags lineageFlags;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setDirection(LineageDirection direction) {
            this.direction = direction;
            return this;
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

        public Builder setStartTimeMillis(Long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            return this;
        }

        public Builder setEndTimeMillis(Long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            return this;
        }

        public Builder setSearchFlags(SearchFlags searchFlags) {
            this.searchFlags = searchFlags;
            return this;
        }

        public Builder setLineageFlags(LineageFlags lineageFlags) {
            this.lineageFlags = lineageFlags;
            return this;
        }


        public ScrollAcrossLineageInput build() {
            return new ScrollAcrossLineageInput(urn, direction, types, query, scrollId, keepAlive, count, orFilters, startTimeMillis, endTimeMillis, searchFlags, lineageFlags);
        }

    }
}
