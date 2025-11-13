package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The usage for a particular Dataset field
 */
public class FieldUsageCounts implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String fieldName;
    private Integer count;

    public FieldUsageCounts() {
    }

    public FieldUsageCounts(String fieldName, Integer count) {
        this.fieldName = fieldName;
        this.count = count;
    }

    /**
     * The path of the field
     */
    public String getFieldName() {
        return fieldName;
    }
    /**
     * The path of the field
     */
    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * The count of usages
     */
    public Integer getCount() {
        return count;
    }
    /**
     * The count of usages
     */
    public void setCount(Integer count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fieldName != null) {
            joiner.add("fieldName: \"" + fieldName + "\"");
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        return joiner.toString();
    }

    public static FieldUsageCounts.Builder builder() {
        return new FieldUsageCounts.Builder();
    }

    public static class Builder {

        private String fieldName;
        private Integer count;

        public Builder() {
        }

        /**
         * The path of the field
         */
        public Builder setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }

        /**
         * The count of usages
         */
        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }


        public FieldUsageCounts build() {
            return new FieldUsageCounts(fieldName, count);
        }

    }
}
