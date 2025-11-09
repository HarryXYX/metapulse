package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * For consumption by UI only
 */
public class NumericDataPoint implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String x;
    private int y;

    public NumericDataPoint() {
    }

    public NumericDataPoint(String x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getX() {
        return x;
    }
    public void setX(String x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (x != null) {
            joiner.add("x: \"" + x + "\"");
        }
        joiner.add("y: " + y);
        return joiner.toString();
    }

    public static NumericDataPoint.Builder builder() {
        return new NumericDataPoint.Builder();
    }

    public static class Builder {

        private String x;
        private int y;

        public Builder() {
        }

        public Builder setX(String x) {
            this.x = x;
            return this;
        }

        public Builder setY(int y) {
            this.y = y;
            return this;
        }


        public NumericDataPoint build() {
            return new NumericDataPoint(x, y);
        }

    }
}
