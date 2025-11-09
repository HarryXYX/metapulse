package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A change transaction is a set of changes that were committed together.
 */
public class ChangeTransaction implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Long timestampMillis;
    @javax.annotation.Nonnull
    private String lastSemanticVersion;
    @javax.annotation.Nonnull
    private String versionStamp;
    @javax.annotation.Nonnull
    private ChangeOperationType changeType;
    private java.util.List<ChangeEvent> changes;

    public ChangeTransaction() {
    }

    public ChangeTransaction(Long timestampMillis, String lastSemanticVersion, String versionStamp, ChangeOperationType changeType, java.util.List<ChangeEvent> changes) {
        this.timestampMillis = timestampMillis;
        this.lastSemanticVersion = lastSemanticVersion;
        this.versionStamp = versionStamp;
        this.changeType = changeType;
        this.changes = changes;
    }

    /**
     * The time at which the transaction was committed
     */
    public Long getTimestampMillis() {
        return timestampMillis;
    }
    /**
     * The time at which the transaction was committed
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
     * The list of changes in this transaction
     */
    public java.util.List<ChangeEvent> getChanges() {
        return changes;
    }
    /**
     * The list of changes in this transaction
     */
    public void setChanges(java.util.List<ChangeEvent> changes) {
        this.changes = changes;
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
        if (changes != null) {
            joiner.add("changes: " + changes);
        }
        return joiner.toString();
    }

    public static ChangeTransaction.Builder builder() {
        return new ChangeTransaction.Builder();
    }

    public static class Builder {

        private Long timestampMillis;
        private String lastSemanticVersion;
        private String versionStamp;
        private ChangeOperationType changeType;
        private java.util.List<ChangeEvent> changes;

        public Builder() {
        }

        /**
         * The time at which the transaction was committed
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
         * The list of changes in this transaction
         */
        public Builder setChanges(java.util.List<ChangeEvent> changes) {
            this.changes = changes;
            return this;
        }


        public ChangeTransaction build() {
            return new ChangeTransaction(timestampMillis, lastSemanticVersion, versionStamp, changeType, changes);
        }

    }
}
