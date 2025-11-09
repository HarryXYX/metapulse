package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * For consumption by UI only
 */
public class NamedBar implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private java.util.List<BarSegment> segments;

    public NamedBar() {
    }

    public NamedBar(String name, java.util.List<BarSegment> segments) {
        this.name = name;
        this.segments = segments;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<BarSegment> getSegments() {
        return segments;
    }
    public void setSegments(java.util.List<BarSegment> segments) {
        this.segments = segments;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (segments != null) {
            joiner.add("segments: " + segments);
        }
        return joiner.toString();
    }

    public static NamedBar.Builder builder() {
        return new NamedBar.Builder();
    }

    public static class Builder {

        private String name;
        private java.util.List<BarSegment> segments;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSegments(java.util.List<BarSegment> segments) {
            this.segments = segments;
            return this;
        }


        public NamedBar build() {
            return new NamedBar(name, segments);
        }

    }
}
