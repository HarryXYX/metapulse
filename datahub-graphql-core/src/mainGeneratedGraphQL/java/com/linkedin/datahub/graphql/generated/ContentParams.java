package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Params about the recommended content
 */
public class ContentParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Long count;

    public ContentParams() {
    }

    public ContentParams(Long count) {
        this.count = count;
    }

    /**
     * Number of entities corresponding to the recommended content
     */
    public Long getCount() {
        return count;
    }
    /**
     * Number of entities corresponding to the recommended content
     */
    public void setCount(Long count) {
        this.count = count;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (count != null) {
            joiner.add("count: " + count);
        }
        return joiner.toString();
    }

    public static ContentParams.Builder builder() {
        return new ContentParams.Builder();
    }

    public static class Builder {

        private Long count;

        public Builder() {
        }

        /**
         * Number of entities corresponding to the recommended content
         */
        public Builder setCount(Long count) {
            this.count = count;
            return this;
        }


        public ContentParams build() {
            return new ContentParams(count);
        }

    }
}
