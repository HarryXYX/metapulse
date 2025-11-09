package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result obtained when listing DataHub Views
 */
public class ListViewsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<DataHubView> views;

    public ListViewsResult() {
    }

    public ListViewsResult(int start, int count, int total, java.util.List<DataHubView> views) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.views = views;
    }

    /**
     * The starting offset of the result set returned
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting offset of the result set returned
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of Views in the returned result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of Views in the returned result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of Views in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of Views in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The Views themselves
     */
    public java.util.List<DataHubView> getViews() {
        return views;
    }
    /**
     * The Views themselves
     */
    public void setViews(java.util.List<DataHubView> views) {
        this.views = views;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (views != null) {
            joiner.add("views: " + views);
        }
        return joiner.toString();
    }

    public static ListViewsResult.Builder builder() {
        return new ListViewsResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<DataHubView> views;

        public Builder() {
        }

        /**
         * The starting offset of the result set returned
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of Views in the returned result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of Views in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The Views themselves
         */
        public Builder setViews(java.util.List<DataHubView> views) {
            this.views = views;
            return this;
        }


        public ListViewsResult build() {
            return new ListViewsResult(start, count, total, views);
        }

    }
}
