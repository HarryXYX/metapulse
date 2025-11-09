package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Schema changes computed at a specific version.
 */
public class GetSchemaVersionListResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private SemanticVersionStruct latestVersion;
    private SemanticVersionStruct version;
    private java.util.List<SemanticVersionStruct> semanticVersionList;

    public GetSchemaVersionListResult() {
    }

    public GetSchemaVersionListResult(SemanticVersionStruct latestVersion, SemanticVersionStruct version, java.util.List<SemanticVersionStruct> semanticVersionList) {
        this.latestVersion = latestVersion;
        this.version = version;
        this.semanticVersionList = semanticVersionList;
    }

    /**
     * Latest and current semantic version
     */
    public SemanticVersionStruct getLatestVersion() {
        return latestVersion;
    }
    /**
     * Latest and current semantic version
     */
    public void setLatestVersion(SemanticVersionStruct latestVersion) {
        this.latestVersion = latestVersion;
    }

    /**
     * Selected semantic version
     */
    public SemanticVersionStruct getVersion() {
        return version;
    }
    /**
     * Selected semantic version
     */
    public void setVersion(SemanticVersionStruct version) {
        this.version = version;
    }

    /**
     * All semantic versions. Absent when there are no versions.
     */
    public java.util.List<SemanticVersionStruct> getSemanticVersionList() {
        return semanticVersionList;
    }
    /**
     * All semantic versions. Absent when there are no versions.
     */
    public void setSemanticVersionList(java.util.List<SemanticVersionStruct> semanticVersionList) {
        this.semanticVersionList = semanticVersionList;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (latestVersion != null) {
            joiner.add("latestVersion: " + latestVersion);
        }
        if (version != null) {
            joiner.add("version: " + version);
        }
        if (semanticVersionList != null) {
            joiner.add("semanticVersionList: " + semanticVersionList);
        }
        return joiner.toString();
    }

    public static GetSchemaVersionListResult.Builder builder() {
        return new GetSchemaVersionListResult.Builder();
    }

    public static class Builder {

        private SemanticVersionStruct latestVersion;
        private SemanticVersionStruct version;
        private java.util.List<SemanticVersionStruct> semanticVersionList;

        public Builder() {
        }

        /**
         * Latest and current semantic version
         */
        public Builder setLatestVersion(SemanticVersionStruct latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * Selected semantic version
         */
        public Builder setVersion(SemanticVersionStruct version) {
            this.version = version;
            return this;
        }

        /**
         * All semantic versions. Absent when there are no versions.
         */
        public Builder setSemanticVersionList(java.util.List<SemanticVersionStruct> semanticVersionList) {
            this.semanticVersionList = semanticVersionList;
            return this;
        }


        public GetSchemaVersionListResult build() {
            return new GetSchemaVersionListResult(latestVersion, version, semanticVersionList);
        }

    }
}
