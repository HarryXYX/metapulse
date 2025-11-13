package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input arguments required for fetching step states
 */
public class BatchGetStepStatesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> ids;

    public BatchGetStepStatesInput() {
    }

    public BatchGetStepStatesInput(java.util.List<String> ids) {
        this.ids = ids;
    }

    public java.util.List<String> getIds() {
        return ids;
    }
    public void setIds(java.util.List<String> ids) {
        this.ids = ids;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (ids != null) {
            joiner.add("ids: " + ids);
        }
        return joiner.toString();
    }

    public static BatchGetStepStatesInput.Builder builder() {
        return new BatchGetStepStatesInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> ids;

        public Builder() {
        }

        public Builder setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }


        public BatchGetStepStatesInput build() {
            return new BatchGetStepStatesInput(ids);
        }

    }
}
