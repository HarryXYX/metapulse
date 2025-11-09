package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * For consumption by UI only
 */
public class BarChart implements java.io.Serializable, AnalyticsChart {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String title;
    @javax.annotation.Nonnull
    private java.util.List<NamedBar> bars;

    public BarChart() {
    }

    public BarChart(String title, java.util.List<NamedBar> bars) {
        this.title = title;
        this.bars = bars;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public java.util.List<NamedBar> getBars() {
        return bars;
    }
    public void setBars(java.util.List<NamedBar> bars) {
        this.bars = bars;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (bars != null) {
            joiner.add("bars: " + bars);
        }
        return joiner.toString();
    }

    public static BarChart.Builder builder() {
        return new BarChart.Builder();
    }

    public static class Builder {

        private String title;
        private java.util.List<NamedBar> bars;

        public Builder() {
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setBars(java.util.List<NamedBar> bars) {
            this.bars = bars;
            return this;
        }


        public BarChart build() {
            return new BarChart(title, bars);
        }

    }
}
