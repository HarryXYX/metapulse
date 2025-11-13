package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for creating a DataHub file
 */
public class CreateDataHubFileInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String id;
    @javax.annotation.Nonnull
    private String storageKey;
    @javax.annotation.Nonnull
    private String originalFileName;
    @javax.annotation.Nonnull
    private String mimeType;
    @javax.annotation.Nonnull
    private Long sizeInBytes;
    @javax.annotation.Nonnull
    private UploadDownloadScenario scenario;
    private String referencedByAsset;
    private String schemaField;
    private String contentHash;

    public CreateDataHubFileInput() {
    }

    public CreateDataHubFileInput(String id, String storageKey, String originalFileName, String mimeType, Long sizeInBytes, UploadDownloadScenario scenario, String referencedByAsset, String schemaField, String contentHash) {
        this.id = id;
        this.storageKey = storageKey;
        this.originalFileName = originalFileName;
        this.mimeType = mimeType;
        this.sizeInBytes = sizeInBytes;
        this.scenario = scenario;
        this.referencedByAsset = referencedByAsset;
        this.schemaField = schemaField;
        this.contentHash = contentHash;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getStorageKey() {
        return storageKey;
    }
    public void setStorageKey(String storageKey) {
        this.storageKey = storageKey;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }
    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public String getMimeType() {
        return mimeType;
    }
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Long getSizeInBytes() {
        return sizeInBytes;
    }
    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    public UploadDownloadScenario getScenario() {
        return scenario;
    }
    public void setScenario(UploadDownloadScenario scenario) {
        this.scenario = scenario;
    }

    public String getReferencedByAsset() {
        return referencedByAsset;
    }
    public void setReferencedByAsset(String referencedByAsset) {
        this.referencedByAsset = referencedByAsset;
    }

    public String getSchemaField() {
        return schemaField;
    }
    public void setSchemaField(String schemaField) {
        this.schemaField = schemaField;
    }

    public String getContentHash() {
        return contentHash;
    }
    public void setContentHash(String contentHash) {
        this.contentHash = contentHash;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (storageKey != null) {
            joiner.add("storageKey: \"" + storageKey + "\"");
        }
        if (originalFileName != null) {
            joiner.add("originalFileName: \"" + originalFileName + "\"");
        }
        if (mimeType != null) {
            joiner.add("mimeType: \"" + mimeType + "\"");
        }
        if (sizeInBytes != null) {
            joiner.add("sizeInBytes: " + sizeInBytes);
        }
        if (scenario != null) {
            joiner.add("scenario: " + scenario);
        }
        if (referencedByAsset != null) {
            joiner.add("referencedByAsset: \"" + referencedByAsset + "\"");
        }
        if (schemaField != null) {
            joiner.add("schemaField: \"" + schemaField + "\"");
        }
        if (contentHash != null) {
            joiner.add("contentHash: \"" + contentHash + "\"");
        }
        return joiner.toString();
    }

    public static CreateDataHubFileInput.Builder builder() {
        return new CreateDataHubFileInput.Builder();
    }

    public static class Builder {

        private String id;
        private String storageKey;
        private String originalFileName;
        private String mimeType;
        private Long sizeInBytes;
        private UploadDownloadScenario scenario;
        private String referencedByAsset;
        private String schemaField;
        private String contentHash;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setStorageKey(String storageKey) {
            this.storageKey = storageKey;
            return this;
        }

        public Builder setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }

        public Builder setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder setSizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }

        public Builder setScenario(UploadDownloadScenario scenario) {
            this.scenario = scenario;
            return this;
        }

        public Builder setReferencedByAsset(String referencedByAsset) {
            this.referencedByAsset = referencedByAsset;
            return this;
        }

        public Builder setSchemaField(String schemaField) {
            this.schemaField = schemaField;
            return this;
        }

        public Builder setContentHash(String contentHash) {
            this.contentHash = contentHash;
            return this;
        }


        public CreateDataHubFileInput build() {
            return new CreateDataHubFileInput(id, storageKey, originalFileName, mimeType, sizeInBytes, scenario, referencedByAsset, schemaField, contentHash);
        }

    }
}
