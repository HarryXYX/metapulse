package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class PatchEntityInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String urn;
    private String entityType;
    @javax.annotation.Nonnull
    private String aspectName;
    @javax.annotation.Nonnull
    private java.util.List<PatchOperationInput> patch;
    private java.util.List<ArrayPrimaryKeyInput> arrayPrimaryKeys;
    private Boolean forceGenericPatch;
    private SystemMetadataInput systemMetadata;
    private java.util.List<StringMapEntryInput> headers;

    public PatchEntityInput() {
    }

    public PatchEntityInput(String urn, String entityType, String aspectName, java.util.List<PatchOperationInput> patch, java.util.List<ArrayPrimaryKeyInput> arrayPrimaryKeys, Boolean forceGenericPatch, SystemMetadataInput systemMetadata, java.util.List<StringMapEntryInput> headers) {
        this.urn = urn;
        this.entityType = entityType;
        this.aspectName = aspectName;
        this.patch = patch;
        this.arrayPrimaryKeys = arrayPrimaryKeys;
        this.forceGenericPatch = forceGenericPatch;
        this.systemMetadata = systemMetadata;
        this.headers = headers;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getEntityType() {
        return entityType;
    }
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public String getAspectName() {
        return aspectName;
    }
    public void setAspectName(String aspectName) {
        this.aspectName = aspectName;
    }

    public java.util.List<PatchOperationInput> getPatch() {
        return patch;
    }
    public void setPatch(java.util.List<PatchOperationInput> patch) {
        this.patch = patch;
    }

    public java.util.List<ArrayPrimaryKeyInput> getArrayPrimaryKeys() {
        return arrayPrimaryKeys;
    }
    public void setArrayPrimaryKeys(java.util.List<ArrayPrimaryKeyInput> arrayPrimaryKeys) {
        this.arrayPrimaryKeys = arrayPrimaryKeys;
    }

    public Boolean getForceGenericPatch() {
        return forceGenericPatch;
    }
    public void setForceGenericPatch(Boolean forceGenericPatch) {
        this.forceGenericPatch = forceGenericPatch;
    }

    public SystemMetadataInput getSystemMetadata() {
        return systemMetadata;
    }
    public void setSystemMetadata(SystemMetadataInput systemMetadata) {
        this.systemMetadata = systemMetadata;
    }

    public java.util.List<StringMapEntryInput> getHeaders() {
        return headers;
    }
    public void setHeaders(java.util.List<StringMapEntryInput> headers) {
        this.headers = headers;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (entityType != null) {
            joiner.add("entityType: \"" + entityType + "\"");
        }
        if (aspectName != null) {
            joiner.add("aspectName: \"" + aspectName + "\"");
        }
        if (patch != null) {
            joiner.add("patch: " + patch);
        }
        if (arrayPrimaryKeys != null) {
            joiner.add("arrayPrimaryKeys: " + arrayPrimaryKeys);
        }
        if (forceGenericPatch != null) {
            joiner.add("forceGenericPatch: " + forceGenericPatch);
        }
        if (systemMetadata != null) {
            joiner.add("systemMetadata: " + systemMetadata);
        }
        if (headers != null) {
            joiner.add("headers: " + headers);
        }
        return joiner.toString();
    }

    public static PatchEntityInput.Builder builder() {
        return new PatchEntityInput.Builder();
    }

    public static class Builder {

        private String urn;
        private String entityType;
        private String aspectName;
        private java.util.List<PatchOperationInput> patch;
        private java.util.List<ArrayPrimaryKeyInput> arrayPrimaryKeys;
        private Boolean forceGenericPatch;
        private SystemMetadataInput systemMetadata;
        private java.util.List<StringMapEntryInput> headers;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setEntityType(String entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder setAspectName(String aspectName) {
            this.aspectName = aspectName;
            return this;
        }

        public Builder setPatch(java.util.List<PatchOperationInput> patch) {
            this.patch = patch;
            return this;
        }

        public Builder setArrayPrimaryKeys(java.util.List<ArrayPrimaryKeyInput> arrayPrimaryKeys) {
            this.arrayPrimaryKeys = arrayPrimaryKeys;
            return this;
        }

        public Builder setForceGenericPatch(Boolean forceGenericPatch) {
            this.forceGenericPatch = forceGenericPatch;
            return this;
        }

        public Builder setSystemMetadata(SystemMetadataInput systemMetadata) {
            this.systemMetadata = systemMetadata;
            return this;
        }

        public Builder setHeaders(java.util.List<StringMapEntryInput> headers) {
            this.headers = headers;
            return this;
        }


        public PatchEntityInput build() {
            return new PatchEntityInput(urn, entityType, aspectName, patch, arrayPrimaryKeys, forceGenericPatch, systemMetadata, headers);
        }

    }
}
