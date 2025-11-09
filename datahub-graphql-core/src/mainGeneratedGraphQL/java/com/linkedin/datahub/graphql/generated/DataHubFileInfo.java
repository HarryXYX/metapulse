package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about a DataHub file
 */
public class DataHubFileInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private BucketStorageLocation bucketStorageLocation;
    @javax.annotation.Nonnull
    private String originalFileName;
    @javax.annotation.Nonnull
    private String mimeType;
    @javax.annotation.Nonnull
    private Long sizeInBytes;
    @javax.annotation.Nonnull
    private UploadDownloadScenario scenario;
    private Entity referencedByAsset;
    private SchemaFieldEntity schemaField;
    @javax.annotation.Nonnull
    private ResolvedAuditStamp created;

    public DataHubFileInfo() {
    }

    public DataHubFileInfo(BucketStorageLocation bucketStorageLocation, String originalFileName, String mimeType, Long sizeInBytes, UploadDownloadScenario scenario, Entity referencedByAsset, SchemaFieldEntity schemaField, ResolvedAuditStamp created) {
        this.bucketStorageLocation = bucketStorageLocation;
        this.originalFileName = originalFileName;
        this.mimeType = mimeType;
        this.sizeInBytes = sizeInBytes;
        this.scenario = scenario;
        this.referencedByAsset = referencedByAsset;
        this.schemaField = schemaField;
        this.created = created;
    }

    /**
     * Info about where a file is stored
     */
    public BucketStorageLocation getBucketStorageLocation() {
        return bucketStorageLocation;
    }
    /**
     * Info about where a file is stored
     */
    public void setBucketStorageLocation(BucketStorageLocation bucketStorageLocation) {
        this.bucketStorageLocation = bucketStorageLocation;
    }

    /**
     * The original filename as uploaded by the user
     */
    public String getOriginalFileName() {
        return originalFileName;
    }
    /**
     * The original filename as uploaded by the user
     */
    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    /**
     * MIME type of the file (e.g., image/png, application/pdf)
     */
    public String getMimeType() {
        return mimeType;
    }
    /**
     * MIME type of the file (e.g., image/png, application/pdf)
     */
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    /**
     * Size of the file in bytes
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }
    /**
     * Size of the file in bytes
     */
    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    /**
     * The scenario/context in which this file was uploaded
     */
    public UploadDownloadScenario getScenario() {
        return scenario;
    }
    /**
     * The scenario/context in which this file was uploaded
     */
    public void setScenario(UploadDownloadScenario scenario) {
        this.scenario = scenario;
    }

    /**
     * Optional entity this file is associated with
     */
    public Entity getReferencedByAsset() {
        return referencedByAsset;
    }
    /**
     * Optional entity this file is associated with
     */
    public void setReferencedByAsset(Entity referencedByAsset) {
        this.referencedByAsset = referencedByAsset;
    }

    /**
     * The dataset schema field this file is referenced by
     */
    public SchemaFieldEntity getSchemaField() {
        return schemaField;
    }
    /**
     * The dataset schema field this file is referenced by
     */
    public void setSchemaField(SchemaFieldEntity schemaField) {
        this.schemaField = schemaField;
    }

    /**
     * Audit stamp for when and by whom this file was created
     */
    public ResolvedAuditStamp getCreated() {
        return created;
    }
    /**
     * Audit stamp for when and by whom this file was created
     */
    public void setCreated(ResolvedAuditStamp created) {
        this.created = created;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (bucketStorageLocation != null) {
            joiner.add("bucketStorageLocation: " + bucketStorageLocation);
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
            joiner.add("referencedByAsset: " + referencedByAsset);
        }
        if (schemaField != null) {
            joiner.add("schemaField: " + schemaField);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        return joiner.toString();
    }

    public static DataHubFileInfo.Builder builder() {
        return new DataHubFileInfo.Builder();
    }

    public static class Builder {

        private BucketStorageLocation bucketStorageLocation;
        private String originalFileName;
        private String mimeType;
        private Long sizeInBytes;
        private UploadDownloadScenario scenario;
        private Entity referencedByAsset;
        private SchemaFieldEntity schemaField;
        private ResolvedAuditStamp created;

        public Builder() {
        }

        /**
         * Info about where a file is stored
         */
        public Builder setBucketStorageLocation(BucketStorageLocation bucketStorageLocation) {
            this.bucketStorageLocation = bucketStorageLocation;
            return this;
        }

        /**
         * The original filename as uploaded by the user
         */
        public Builder setOriginalFileName(String originalFileName) {
            this.originalFileName = originalFileName;
            return this;
        }

        /**
         * MIME type of the file (e.g., image/png, application/pdf)
         */
        public Builder setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        /**
         * Size of the file in bytes
         */
        public Builder setSizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            return this;
        }

        /**
         * The scenario/context in which this file was uploaded
         */
        public Builder setScenario(UploadDownloadScenario scenario) {
            this.scenario = scenario;
            return this;
        }

        /**
         * Optional entity this file is associated with
         */
        public Builder setReferencedByAsset(Entity referencedByAsset) {
            this.referencedByAsset = referencedByAsset;
            return this;
        }

        /**
         * The dataset schema field this file is referenced by
         */
        public Builder setSchemaField(SchemaFieldEntity schemaField) {
            this.schemaField = schemaField;
            return this;
        }

        /**
         * Audit stamp for when and by whom this file was created
         */
        public Builder setCreated(ResolvedAuditStamp created) {
            this.created = created;
            return this;
        }


        public DataHubFileInfo build() {
            return new DataHubFileInfo(bucketStorageLocation, originalFileName, mimeType, sizeInBytes, scenario, referencedByAsset, schemaField, created);
        }

    }
}
