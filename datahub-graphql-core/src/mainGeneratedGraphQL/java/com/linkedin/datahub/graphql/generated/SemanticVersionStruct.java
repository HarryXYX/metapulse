package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties identify a semantic version
 */
public class SemanticVersionStruct implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String semanticVersion;
    private Long semanticVersionTimestamp;
    private String versionStamp;

    public SemanticVersionStruct() {
    }

    public SemanticVersionStruct(String semanticVersion, Long semanticVersionTimestamp, String versionStamp) {
        this.semanticVersion = semanticVersion;
        this.semanticVersionTimestamp = semanticVersionTimestamp;
        this.versionStamp = versionStamp;
    }

    /**
     * Semantic version of the change
     */
    public String getSemanticVersion() {
        return semanticVersion;
    }
    /**
     * Semantic version of the change
     */
    public void setSemanticVersion(String semanticVersion) {
        this.semanticVersion = semanticVersion;
    }

    /**
     * Semantic version timestamp
     */
    public Long getSemanticVersionTimestamp() {
        return semanticVersionTimestamp;
    }
    /**
     * Semantic version timestamp
     */
    public void setSemanticVersionTimestamp(Long semanticVersionTimestamp) {
        this.semanticVersionTimestamp = semanticVersionTimestamp;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (semanticVersion != null) {
            joiner.add("semanticVersion: \"" + semanticVersion + "\"");
        }
        if (semanticVersionTimestamp != null) {
            joiner.add("semanticVersionTimestamp: " + semanticVersionTimestamp);
        }
        if (versionStamp != null) {
            joiner.add("versionStamp: \"" + versionStamp + "\"");
        }
        return joiner.toString();
    }

    public static SemanticVersionStruct.Builder builder() {
        return new SemanticVersionStruct.Builder();
    }

    public static class Builder {

        private String semanticVersion;
        private Long semanticVersionTimestamp;
        private String versionStamp;

        public Builder() {
        }

        /**
         * Semantic version of the change
         */
        public Builder setSemanticVersion(String semanticVersion) {
            this.semanticVersion = semanticVersion;
            return this;
        }

        /**
         * Semantic version timestamp
         */
        public Builder setSemanticVersionTimestamp(Long semanticVersionTimestamp) {
            this.semanticVersionTimestamp = semanticVersionTimestamp;
            return this;
        }

        /**
         * Version stamp of the change
         */
        public Builder setVersionStamp(String versionStamp) {
            this.versionStamp = versionStamp;
            return this;
        }


        public SemanticVersionStruct build() {
            return new SemanticVersionStruct(semanticVersion, semanticVersionTimestamp, versionStamp);
        }

    }
}
