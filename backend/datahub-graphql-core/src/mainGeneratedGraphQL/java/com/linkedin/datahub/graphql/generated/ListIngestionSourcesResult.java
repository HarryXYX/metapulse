package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Results returned when listing ingestion sources
 */
public class ListIngestionSourcesResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<IngestionSource> ingestionSources;

    public ListIngestionSourcesResult() {
    }

    public ListIngestionSourcesResult(int start, int count, int total, java.util.List<IngestionSource> ingestionSources) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.ingestionSources = ingestionSources;
    }

    /**
     * The starting offset of the result set
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting offset of the result set
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of results to be returned
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of results to be returned
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of results in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of results in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The Ingestion Sources themselves
     */
    public java.util.List<IngestionSource> getIngestionSources() {
        return ingestionSources;
    }
    /**
     * The Ingestion Sources themselves
     */
    public void setIngestionSources(java.util.List<IngestionSource> ingestionSources) {
        this.ingestionSources = ingestionSources;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (ingestionSources != null) {
            joiner.add("ingestionSources: " + ingestionSources);
        }
        return joiner.toString();
    }

    public static ListIngestionSourcesResult.Builder builder() {
        return new ListIngestionSourcesResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<IngestionSource> ingestionSources;

        public Builder() {
        }

        /**
         * The starting offset of the result set
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of results to be returned
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of results in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The Ingestion Sources themselves
         */
        public Builder setIngestionSources(java.util.List<IngestionSource> ingestionSources) {
            this.ingestionSources = ingestionSources;
            return this;
        }


        public ListIngestionSourcesResult build() {
            return new ListIngestionSourcesResult(start, count, total, ingestionSources);
        }

    }
}
