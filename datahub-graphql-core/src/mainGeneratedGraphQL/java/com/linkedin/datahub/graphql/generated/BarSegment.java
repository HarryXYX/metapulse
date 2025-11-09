package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * For consumption by UI only
 */
public class BarSegment implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String label;
    private int value;

    public BarSegment() {
    }

    public BarSegment(String label, int value) {
        this.label = label;
        this.value = value;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (label != null) {
            joiner.add("label: \"" + label + "\"");
        }
        joiner.add("value: " + value);
        return joiner.toString();
    }

    public static BarSegment.Builder builder() {
        return new BarSegment.Builder();
    }

    public static class Builder {

        private String label;
        private int value;

        public Builder() {
        }

        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        public Builder setValue(int value) {
            this.value = value;
            return this;
        }


        public BarSegment build() {
            return new BarSegment(label, value);
        }

    }
}
