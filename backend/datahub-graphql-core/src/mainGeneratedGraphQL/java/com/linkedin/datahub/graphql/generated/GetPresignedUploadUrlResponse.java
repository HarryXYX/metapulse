package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class GetPresignedUploadUrlResponse implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String url;
    @javax.annotation.Nonnull
    private String fileId;

    public GetPresignedUploadUrlResponse() {
    }

    public GetPresignedUploadUrlResponse(String url, String fileId) {
        this.url = url;
        this.fileId = fileId;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getFileId() {
        return fileId;
    }
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (url != null) {
            joiner.add("url: \"" + url + "\"");
        }
        if (fileId != null) {
            joiner.add("fileId: \"" + fileId + "\"");
        }
        return joiner.toString();
    }

    public static GetPresignedUploadUrlResponse.Builder builder() {
        return new GetPresignedUploadUrlResponse.Builder();
    }

    public static class Builder {

        private String url;
        private String fileId;

        public Builder() {
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }


        public GetPresignedUploadUrlResponse build() {
            return new GetPresignedUploadUrlResponse(url, fileId);
        }

    }
}
