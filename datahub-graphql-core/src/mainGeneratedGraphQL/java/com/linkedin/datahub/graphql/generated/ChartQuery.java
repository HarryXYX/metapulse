package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The query that was used to populate a Chart
 */
public class ChartQuery implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String rawQuery;
    @javax.annotation.Nonnull
    private ChartQueryType type;

    public ChartQuery() {
    }

    public ChartQuery(String rawQuery, ChartQueryType type) {
        this.rawQuery = rawQuery;
        this.type = type;
    }

    /**
     * Raw query to build a chart from input datasets
     */
    public String getRawQuery() {
        return rawQuery;
    }
    /**
     * Raw query to build a chart from input datasets
     */
    public void setRawQuery(String rawQuery) {
        this.rawQuery = rawQuery;
    }

    /**
     * The type of the chart query
     */
    public ChartQueryType getType() {
        return type;
    }
    /**
     * The type of the chart query
     */
    public void setType(ChartQueryType type) {
        this.type = type;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (rawQuery != null) {
            joiner.add("rawQuery: \"" + rawQuery + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        return joiner.toString();
    }

    public static ChartQuery.Builder builder() {
        return new ChartQuery.Builder();
    }

    public static class Builder {

        private String rawQuery;
        private ChartQueryType type;

        public Builder() {
        }

        /**
         * Raw query to build a chart from input datasets
         */
        public Builder setRawQuery(String rawQuery) {
            this.rawQuery = rawQuery;
            return this;
        }

        /**
         * The type of the chart query
         */
        public Builder setType(ChartQueryType type) {
            this.type = type;
            return this;
        }


        public ChartQuery build() {
            return new ChartQuery(rawQuery, type);
        }

    }
}
