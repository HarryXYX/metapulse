package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for getting schema changes computed at a specific version.
 */
public class GetSchemaBlameInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String datasetUrn;
    private String version;

    public GetSchemaBlameInput() {
    }

    public GetSchemaBlameInput(String datasetUrn, String version) {
        this.datasetUrn = datasetUrn;
        this.version = version;
    }

    public String getDatasetUrn() {
        return datasetUrn;
    }
    public void setDatasetUrn(String datasetUrn) {
        this.datasetUrn = datasetUrn;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (datasetUrn != null) {
            joiner.add("datasetUrn: \"" + datasetUrn + "\"");
        }
        if (version != null) {
            joiner.add("version: \"" + version + "\"");
        }
        return joiner.toString();
    }

    public static GetSchemaBlameInput.Builder builder() {
        return new GetSchemaBlameInput.Builder();
    }

    public static class Builder {

        private String datasetUrn;
        private String version;

        public Builder() {
        }

        public Builder setDatasetUrn(String datasetUrn) {
            this.datasetUrn = datasetUrn;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }


        public GetSchemaBlameInput build() {
            return new GetSchemaBlameInput(datasetUrn, version);
        }

    }
}
