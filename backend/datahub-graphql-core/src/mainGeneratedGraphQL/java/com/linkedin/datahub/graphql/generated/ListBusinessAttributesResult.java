package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result obtained when listing Business Attribute
 */
public class ListBusinessAttributesResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<BusinessAttribute> businessAttributes;

    public ListBusinessAttributesResult() {
    }

    public ListBusinessAttributesResult(int start, int count, int total, java.util.List<BusinessAttribute> businessAttributes) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.businessAttributes = businessAttributes;
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
     * The number of Business Attributes in the returned result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of Business Attributes in the returned result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of Business Attributes in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of Business Attributes in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The Business Attributes
     */
    public java.util.List<BusinessAttribute> getBusinessAttributes() {
        return businessAttributes;
    }
    /**
     * The Business Attributes
     */
    public void setBusinessAttributes(java.util.List<BusinessAttribute> businessAttributes) {
        this.businessAttributes = businessAttributes;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (businessAttributes != null) {
            joiner.add("businessAttributes: " + businessAttributes);
        }
        return joiner.toString();
    }

    public static ListBusinessAttributesResult.Builder builder() {
        return new ListBusinessAttributesResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<BusinessAttribute> businessAttributes;

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
         * The number of Business Attributes in the returned result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of Business Attributes in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The Business Attributes
         */
        public Builder setBusinessAttributes(java.util.List<BusinessAttribute> businessAttributes) {
            this.businessAttributes = businessAttributes;
            return this;
        }


        public ListBusinessAttributesResult build() {
            return new ListBusinessAttributesResult(start, count, total, businessAttributes);
        }

    }
}
