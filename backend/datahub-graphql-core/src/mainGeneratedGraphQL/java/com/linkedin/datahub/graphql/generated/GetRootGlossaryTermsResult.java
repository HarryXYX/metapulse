package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result when getting root GlossaryTerms
 */
public class GetRootGlossaryTermsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<GlossaryTerm> terms;
    private int start;
    private int count;
    private int total;

    public GetRootGlossaryTermsResult() {
    }

    public GetRootGlossaryTermsResult(java.util.List<GlossaryTerm> terms, int start, int count, int total) {
        this.terms = terms;
        this.start = start;
        this.count = count;
        this.total = total;
    }

    /**
     * A list of Glossary Terms without a parent node
     */
    public java.util.List<GlossaryTerm> getTerms() {
        return terms;
    }
    /**
     * A list of Glossary Terms without a parent node
     */
    public void setTerms(java.util.List<GlossaryTerm> terms) {
        this.terms = terms;
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
     * The number of terms in the returned result
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of terms in the returned result
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of terms in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of terms in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (terms != null) {
            joiner.add("terms: " + terms);
        }
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        return joiner.toString();
    }

    public static GetRootGlossaryTermsResult.Builder builder() {
        return new GetRootGlossaryTermsResult.Builder();
    }

    public static class Builder {

        private java.util.List<GlossaryTerm> terms;
        private int start;
        private int count;
        private int total;

        public Builder() {
        }

        /**
         * A list of Glossary Terms without a parent node
         */
        public Builder setTerms(java.util.List<GlossaryTerm> terms) {
            this.terms = terms;
            return this;
        }

        /**
         * The starting offset of the result set returned
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of terms in the returned result
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of terms in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }


        public GetRootGlossaryTermsResult build() {
            return new GetRootGlossaryTermsResult(terms, start, count, total);
        }

    }
}
