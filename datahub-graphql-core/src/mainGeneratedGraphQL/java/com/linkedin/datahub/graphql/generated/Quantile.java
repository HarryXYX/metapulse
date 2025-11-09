package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A quantile along with its corresponding value
 */
public class Quantile implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String quantile;
    @javax.annotation.Nonnull
    private String value;

    public Quantile() {
    }

    public Quantile(String quantile, String value) {
        this.quantile = quantile;
        this.value = value;
    }

    /**
     * Quantile. E.g. "0.25" for the 25th percentile
     */
    public String getQuantile() {
        return quantile;
    }
    /**
     * Quantile. E.g. "0.25" for the 25th percentile
     */
    public void setQuantile(String quantile) {
        this.quantile = quantile;
    }

    /**
     * The value of the quantile
     */
    public String getValue() {
        return value;
    }
    /**
     * The value of the quantile
     */
    public void setValue(String value) {
        this.value = value;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (quantile != null) {
            joiner.add("quantile: \"" + quantile + "\"");
        }
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        return joiner.toString();
    }

    public static Quantile.Builder builder() {
        return new Quantile.Builder();
    }

    public static class Builder {

        private String quantile;
        private String value;

        public Builder() {
        }

        /**
         * Quantile. E.g. "0.25" for the 25th percentile
         */
        public Builder setQuantile(String quantile) {
            this.quantile = quantile;
            return this;
        }

        /**
         * The value of the quantile
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }


        public Quantile build() {
            return new Quantile(quantile, value);
        }

    }
}
