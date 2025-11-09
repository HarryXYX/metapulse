package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Attributes identifying a field change
 */
public class SchemaFieldChange implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Long timestampMillis;
    @javax.annotation.Nonnull
    private String lastSemanticVersion;
    @javax.annotation.Nonnull
    private String versionStamp;
    @javax.annotation.Nonnull
    private ChangeOperationType changeType;
    private String lastSchemaFieldChange;

    public SchemaFieldChange() {
    }

    public SchemaFieldChange(Long timestampMillis, String lastSemanticVersion, String versionStamp, ChangeOperationType changeType, String lastSchemaFieldChange) {
        this.timestampMillis = timestampMillis;
        this.lastSemanticVersion = lastSemanticVersion;
        this.versionStamp = versionStamp;
        this.changeType = changeType;
        this.lastSchemaFieldChange = lastSchemaFieldChange;
    }

    /**
     * The time at which the schema was updated
     */
    public Long getTimestampMillis() {
        return timestampMillis;
    }
    /**
     * The time at which the schema was updated
     */
    public void setTimestampMillis(Long timestampMillis) {
        this.timestampMillis = timestampMillis;
    }

    /**
     * The last semantic version that this schema was changed in
     */
    public String getLastSemanticVersion() {
        return lastSemanticVersion;
    }
    /**
     * The last semantic version that this schema was changed in
     */
    public void setLastSemanticVersion(String lastSemanticVersion) {
        this.lastSemanticVersion = lastSemanticVersion;
    }

    /**
     * Version stamp of the change
     */
    public String getVersionStamp() {
        return versionStamp;
    }
    /**
     * Version stamp of the change
     */
    public void setVersionStamp(String versionStamp) {
        this.versionStamp = versionStamp;
    }

    /**
     * The type of the change
     */
    public ChangeOperationType getChangeType() {
        return changeType;
    }
    /**
     * The type of the change
     */
    public void setChangeType(ChangeOperationType changeType) {
        this.changeType = changeType;
    }

    /**
     * Last column update, such as Added/Modified/Removed in v1.2.3.
     */
    public String getLastSchemaFieldChange() {
        return lastSchemaFieldChange;
    }
    /**
     * Last column update, such as Added/Modified/Removed in v1.2.3.
     */
    public void setLastSchemaFieldChange(String lastSchemaFieldChange) {
        this.lastSchemaFieldChange = lastSchemaFieldChange;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (timestampMillis != null) {
            joiner.add("timestampMillis: " + timestampMillis);
        }
        if (lastSemanticVersion != null) {
            joiner.add("lastSemanticVersion: \"" + lastSemanticVersion + "\"");
        }
        if (versionStamp != null) {
            joiner.add("versionStamp: \"" + versionStamp + "\"");
        }
        if (changeType != null) {
            joiner.add("changeType: " + changeType);
        }
        if (lastSchemaFieldChange != null) {
            joiner.add("lastSchemaFieldChange: \"" + lastSchemaFieldChange + "\"");
        }
        return joiner.toString();
    }

    public static SchemaFieldChange.Builder builder() {
        return new SchemaFieldChange.Builder();
    }

    public static class Builder {

        private Long timestampMillis;
        private String lastSemanticVersion;
        private String versionStamp;
        private ChangeOperationType changeType;
        private String lastSchemaFieldChange;

        public Builder() {
        }

        /**
         * The time at which the schema was updated
         */
        public Builder setTimestampMillis(Long timestampMillis) {
            this.timestampMillis = timestampMillis;
            return this;
        }

        /**
         * The last semantic version that this schema was changed in
         */
        public Builder setLastSemanticVersion(String lastSemanticVersion) {
            this.lastSemanticVersion = lastSemanticVersion;
            return this;
        }

        /**
         * Version stamp of the change
         */
        public Builder setVersionStamp(String versionStamp) {
            this.versionStamp = versionStamp;
            return this;
        }

        /**
         * The type of the change
         */
        public Builder setChangeType(ChangeOperationType changeType) {
            this.changeType = changeType;
            return this;
        }

        /**
         * Last column update, such as Added/Modified/Removed in v1.2.3.
         */
        public Builder setLastSchemaFieldChange(String lastSchemaFieldChange) {
            this.lastSchemaFieldChange = lastSchemaFieldChange;
            return this;
        }


        public SchemaFieldChange build() {
            return new SchemaFieldChange(timestampMillis, lastSemanticVersion, versionStamp, changeType, lastSchemaFieldChange);
        }

    }
}
