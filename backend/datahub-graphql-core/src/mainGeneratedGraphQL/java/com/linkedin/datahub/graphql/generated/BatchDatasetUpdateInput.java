package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Arguments provided to batch update Dataset entities
 */
public class BatchDatasetUpdateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private DatasetUpdateInput update;

    public BatchDatasetUpdateInput() {
    }

    public BatchDatasetUpdateInput(String urn, DatasetUpdateInput update) {
        this.urn = urn;
        this.update = update;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public DatasetUpdateInput getUpdate() {
        return update;
    }
    public void setUpdate(DatasetUpdateInput update) {
        this.update = update;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (update != null) {
            joiner.add("update: " + update);
        }
        return joiner.toString();
    }

    public static BatchDatasetUpdateInput.Builder builder() {
        return new BatchDatasetUpdateInput.Builder();
    }

    public static class Builder {

        private String urn;
        private DatasetUpdateInput update;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setUpdate(DatasetUpdateInput update) {
            this.update = update;
            return this;
        }


        public BatchDatasetUpdateInput build() {
            return new BatchDatasetUpdateInput(urn, update);
        }

    }
}
