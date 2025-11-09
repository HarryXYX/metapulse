package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * For consumption by UI only
 */
public class AnalyticsChartGroup implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String groupId;
    @javax.annotation.Nonnull
    private String title;
    @javax.annotation.Nonnull
    private java.util.List<AnalyticsChart> charts;

    public AnalyticsChartGroup() {
    }

    public AnalyticsChartGroup(String groupId, String title, java.util.List<AnalyticsChart> charts) {
        this.groupId = groupId;
        this.title = title;
        this.charts = charts;
    }

    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public java.util.List<AnalyticsChart> getCharts() {
        return charts;
    }
    public void setCharts(java.util.List<AnalyticsChart> charts) {
        this.charts = charts;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (groupId != null) {
            joiner.add("groupId: \"" + groupId + "\"");
        }
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (charts != null) {
            joiner.add("charts: " + charts);
        }
        return joiner.toString();
    }

    public static AnalyticsChartGroup.Builder builder() {
        return new AnalyticsChartGroup.Builder();
    }

    public static class Builder {

        private String groupId;
        private String title;
        private java.util.List<AnalyticsChart> charts;

        public Builder() {
        }

        public Builder setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setCharts(java.util.List<AnalyticsChart> charts) {
            this.charts = charts;
            return this;
        }


        public AnalyticsChartGroup build() {
            return new AnalyticsChartGroup(groupId, title, charts);
        }

    }
}
