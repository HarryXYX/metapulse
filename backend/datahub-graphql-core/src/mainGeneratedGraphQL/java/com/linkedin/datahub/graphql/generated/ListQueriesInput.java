package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for listing query entities
 */
public class ListQueriesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Integer start;
    private Integer count;
    private String query;
    private QuerySource source;
    private String datasetUrn;
    private SortQueriesInput sortInput;
    private java.util.List<AndFilterInput> orFilters;

    public ListQueriesInput() {
    }

    public ListQueriesInput(Integer start, Integer count, String query, QuerySource source, String datasetUrn, SortQueriesInput sortInput, java.util.List<AndFilterInput> orFilters) {
        this.start = start;
        this.count = count;
        this.query = query;
        this.source = source;
        this.datasetUrn = datasetUrn;
        this.sortInput = sortInput;
        this.orFilters = orFilters;
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

    public QuerySource getSource() {
        return source;
    }
    public void setSource(QuerySource source) {
        this.source = source;
    }

    public String getDatasetUrn() {
        return datasetUrn;
    }
    public void setDatasetUrn(String datasetUrn) {
        this.datasetUrn = datasetUrn;
    }

    public SortQueriesInput getSortInput() {
        return sortInput;
    }
    public void setSortInput(SortQueriesInput sortInput) {
        this.sortInput = sortInput;
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
        if (start != null) {
            joiner.add("start: " + start);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (query != null) {
            joiner.add("query: \"" + query + "\"");
        }
        if (source != null) {
            joiner.add("source: " + source);
        }
        if (datasetUrn != null) {
            joiner.add("datasetUrn: \"" + datasetUrn + "\"");
        }
        if (sortInput != null) {
            joiner.add("sortInput: " + sortInput);
        }
        if (orFilters != null) {
            joiner.add("orFilters: " + orFilters);
        }
        return joiner.toString();
    }

    public static ListQueriesInput.Builder builder() {
        return new ListQueriesInput.Builder();
    }

    public static class Builder {

        private Integer start;
        private Integer count;
        private String query;
        private QuerySource source;
        private String datasetUrn;
        private SortQueriesInput sortInput;
        private java.util.List<AndFilterInput> orFilters;

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

        public Builder setSource(QuerySource source) {
            this.source = source;
            return this;
        }

        public Builder setDatasetUrn(String datasetUrn) {
            this.datasetUrn = datasetUrn;
            return this;
        }

        public Builder setSortInput(SortQueriesInput sortInput) {
            this.sortInput = sortInput;
            return this;
        }

        public Builder setOrFilters(java.util.List<AndFilterInput> orFilters) {
            this.orFilters = orFilters;
            return this;
        }


        public ListQueriesInput build() {
            return new ListQueriesInput(start, count, query, source, datasetUrn, sortInput, orFilters);
        }

    }
}
