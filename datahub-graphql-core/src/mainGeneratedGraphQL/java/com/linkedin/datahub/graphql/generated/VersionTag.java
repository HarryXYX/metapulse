package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The technical version associated with a given Metadata Entity
 */
public class VersionTag implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String versionTag;

    public VersionTag() {
    }

    public VersionTag(String versionTag) {
        this.versionTag = versionTag;
    }

    public String getVersionTag() {
        return versionTag;
    }
    public void setVersionTag(String versionTag) {
        this.versionTag = versionTag;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (versionTag != null) {
            joiner.add("versionTag: \"" + versionTag + "\"");
        }
        return joiner.toString();
    }

    public static VersionTag.Builder builder() {
        return new VersionTag.Builder();
    }

    public static class Builder {

        private String versionTag;

        public Builder() {
        }

        public Builder setVersionTag(String versionTag) {
            this.versionTag = versionTag;
            return this;
        }


        public VersionTag build() {
            return new VersionTag(versionTag);
        }

    }
}
