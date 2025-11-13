package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for linking a versioned entity to a Version Set
 */
public class LinkVersionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String versionSet;
    @javax.annotation.Nonnull
    private String linkedEntity;
    @javax.annotation.Nonnull
    private String version;
    private Long sourceTimestamp;
    private String sourceCreator;
    private String comment;

    public LinkVersionInput() {
    }

    public LinkVersionInput(String versionSet, String linkedEntity, String version, Long sourceTimestamp, String sourceCreator, String comment) {
        this.versionSet = versionSet;
        this.linkedEntity = linkedEntity;
        this.version = version;
        this.sourceTimestamp = sourceTimestamp;
        this.sourceCreator = sourceCreator;
        this.comment = comment;
    }

    public String getVersionSet() {
        return versionSet;
    }
    public void setVersionSet(String versionSet) {
        this.versionSet = versionSet;
    }

    public String getLinkedEntity() {
        return linkedEntity;
    }
    public void setLinkedEntity(String linkedEntity) {
        this.linkedEntity = linkedEntity;
    }

    public String getVersion() {
        return version;
    }
    public void setVersion(String version) {
        this.version = version;
    }

    public Long getSourceTimestamp() {
        return sourceTimestamp;
    }
    public void setSourceTimestamp(Long sourceTimestamp) {
        this.sourceTimestamp = sourceTimestamp;
    }

    public String getSourceCreator() {
        return sourceCreator;
    }
    public void setSourceCreator(String sourceCreator) {
        this.sourceCreator = sourceCreator;
    }

    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (versionSet != null) {
            joiner.add("versionSet: \"" + versionSet + "\"");
        }
        if (linkedEntity != null) {
            joiner.add("linkedEntity: \"" + linkedEntity + "\"");
        }
        if (version != null) {
            joiner.add("version: \"" + version + "\"");
        }
        if (sourceTimestamp != null) {
            joiner.add("sourceTimestamp: " + sourceTimestamp);
        }
        if (sourceCreator != null) {
            joiner.add("sourceCreator: \"" + sourceCreator + "\"");
        }
        if (comment != null) {
            joiner.add("comment: \"" + comment + "\"");
        }
        return joiner.toString();
    }

    public static LinkVersionInput.Builder builder() {
        return new LinkVersionInput.Builder();
    }

    public static class Builder {

        private String versionSet;
        private String linkedEntity;
        private String version;
        private Long sourceTimestamp;
        private String sourceCreator;
        private String comment;

        public Builder() {
        }

        public Builder setVersionSet(String versionSet) {
            this.versionSet = versionSet;
            return this;
        }

        public Builder setLinkedEntity(String linkedEntity) {
            this.linkedEntity = linkedEntity;
            return this;
        }

        public Builder setVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder setSourceTimestamp(Long sourceTimestamp) {
            this.sourceTimestamp = sourceTimestamp;
            return this;
        }

        public Builder setSourceCreator(String sourceCreator) {
            this.sourceCreator = sourceCreator;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }


        public LinkVersionInput build() {
            return new LinkVersionInput(versionSet, linkedEntity, version, sourceTimestamp, sourceCreator, comment);
        }

    }
}
