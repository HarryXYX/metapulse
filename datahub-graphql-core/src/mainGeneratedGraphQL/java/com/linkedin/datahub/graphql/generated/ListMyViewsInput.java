package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when listing DataHub Views
 */
public class ListMyViewsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private String query;
    private DataHubViewType viewType;

    public ListMyViewsInput() {
    }

    public ListMyViewsInput(Integer start, Integer count, String query, DataHubViewType viewType) {
        this.start = start;
        this.count = count;
        this.query = query;
        this.viewType = viewType;
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

    public String getQuery() {
        return query;
    }
    public void setQuery(String query) {
        this.query = query;
    }

    public DataHubViewType getViewType() {
        return viewType;
    }
    public void setViewType(DataHubViewType viewType) {
        this.viewType = viewType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (viewType != null) {
            joiner.add("viewType: " + viewType);
        }
        return joiner.toString();
    }

    public static ListMyViewsInput.Builder builder() {
        return new ListMyViewsInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private String query;
        private DataHubViewType viewType;

        public Builder() {
        }

        public Builder setStart(Integer start) {
            this.start = start;
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        public Builder setQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder setViewType(DataHubViewType viewType) {
            this.viewType = viewType;
            return this;
        }


        public ListMyViewsInput build() {
            return new ListMyViewsInput(start, count, query, viewType);
        }

    }
}
