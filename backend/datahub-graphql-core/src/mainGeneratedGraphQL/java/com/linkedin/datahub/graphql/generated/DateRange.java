package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * For consumption by UI only
 */
public class DateRange implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String start;
    @javax.annotation.Nonnull
    private String end;

    public DateRange() {
    }

    public DateRange(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String getStart() {
        return start;
    }
    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }
    public void setEnd(String end) {
        this.end = end;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (start != null) {
            joiner.add("start: \"" + start + "\"");
        }
        if (end != null) {
            joiner.add("end: \"" + end + "\"");
        }
        return joiner.toString();
    }

    public static DateRange.Builder builder() {
        return new DateRange.Builder();
    }

    public static class Builder {

        private String start;
        private String end;

        public Builder() {
        }

        public Builder setStart(String start) {
            this.start = start;
            return this;
        }

        public Builder setEnd(String end) {
            this.end = end;
            return this;
        }


        public DateRange build() {
            return new DateRange(start, end);
        }

    }
}
