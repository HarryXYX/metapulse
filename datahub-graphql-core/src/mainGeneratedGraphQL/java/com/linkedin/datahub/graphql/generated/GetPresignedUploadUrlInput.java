package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for the getUploadPresignedUrl query.
 */
public class GetPresignedUploadUrlInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String fileName;
    @javax.annotation.Nonnull
    private UploadDownloadScenario scenario;
    private String assetUrn;
    private String schemaFieldUrn;
    private String contentType;

    public GetPresignedUploadUrlInput() {
    }

    public GetPresignedUploadUrlInput(String fileName, UploadDownloadScenario scenario, String assetUrn, String schemaFieldUrn, String contentType) {
        this.fileName = fileName;
        this.scenario = scenario;
        this.assetUrn = assetUrn;
        this.schemaFieldUrn = schemaFieldUrn;
        this.contentType = contentType;
    }

    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public UploadDownloadScenario getScenario() {
        return scenario;
    }
    public void setScenario(UploadDownloadScenario scenario) {
        this.scenario = scenario;
    }

    public String getAssetUrn() {
        return assetUrn;
    }
    public void setAssetUrn(String assetUrn) {
        this.assetUrn = assetUrn;
    }

    public String getSchemaFieldUrn() {
        return schemaFieldUrn;
    }
    public void setSchemaFieldUrn(String schemaFieldUrn) {
        this.schemaFieldUrn = schemaFieldUrn;
    }

    public String getContentType() {
        return contentType;
    }
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fileName != null) {
            joiner.add("fileName: \"" + fileName + "\"");
        }
        if (scenario != null) {
            joiner.add("scenario: " + scenario);
        }
        if (assetUrn != null) {
            joiner.add("assetUrn: \"" + assetUrn + "\"");
        }
        if (schemaFieldUrn != null) {
            joiner.add("schemaFieldUrn: \"" + schemaFieldUrn + "\"");
        }
        if (contentType != null) {
            joiner.add("contentType: \"" + contentType + "\"");
        }
        return joiner.toString();
    }

    public static GetPresignedUploadUrlInput.Builder builder() {
        return new GetPresignedUploadUrlInput.Builder();
    }

    public static class Builder {

        private String fileName;
        private UploadDownloadScenario scenario;
        private String assetUrn;
        private String schemaFieldUrn;
        private String contentType;

        public Builder() {
        }

        public Builder setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        public Builder setScenario(UploadDownloadScenario scenario) {
            this.scenario = scenario;
            return this;
        }

        public Builder setAssetUrn(String assetUrn) {
            this.assetUrn = assetUrn;
            return this;
        }

        public Builder setSchemaFieldUrn(String schemaFieldUrn) {
            this.schemaFieldUrn = schemaFieldUrn;
            return this;
        }

        public Builder setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }


        public GetPresignedUploadUrlInput build() {
            return new GetPresignedUploadUrlInput(fileName, scenario, assetUrn, schemaFieldUrn, contentType);
        }

    }
}
