package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for getting list of schema versions.
 */
public class GetSchemaVersionListInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String datasetUrn;

    public GetSchemaVersionListInput() {
    }

    public GetSchemaVersionListInput(String datasetUrn) {
        this.datasetUrn = datasetUrn;
    }

    public String getDatasetUrn() {
        return datasetUrn;
    }
    public void setDatasetUrn(String datasetUrn) {
        this.datasetUrn = datasetUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (datasetUrn != null) {
            joiner.add("datasetUrn: \"" + datasetUrn + "\"");
        }
        return joiner.toString();
    }

    public static GetSchemaVersionListInput.Builder builder() {
        return new GetSchemaVersionListInput.Builder();
    }

    public static class Builder {

        private String datasetUrn;

        public Builder() {
        }

        public Builder setDatasetUrn(String datasetUrn) {
            this.datasetUrn = datasetUrn;
            return this;
        }


        public GetSchemaVersionListInput build() {
            return new GetSchemaVersionListInput(datasetUrn);
        }

    }
}
