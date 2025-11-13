package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for creating a Query. For now, only datasets are supported.
 */
public class CreateQuerySubjectInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String datasetUrn;

    public CreateQuerySubjectInput() {
    }

    public CreateQuerySubjectInput(String datasetUrn) {
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

    public static CreateQuerySubjectInput.Builder builder() {
        return new CreateQuerySubjectInput.Builder();
    }

    public static class Builder {

        private String datasetUrn;

        public Builder() {
        }

        public Builder setDatasetUrn(String datasetUrn) {
            this.datasetUrn = datasetUrn;
            return this;
        }


        public CreateQuerySubjectInput build() {
            return new CreateQuerySubjectInput(datasetUrn);
        }

    }
}
