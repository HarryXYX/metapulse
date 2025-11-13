package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for unlinking a versioned entity from a Version Set
 */
public class UnlinkVersionInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String versionSet;
    private String unlinkedEntity;

    public UnlinkVersionInput() {
    }

    public UnlinkVersionInput(String versionSet, String unlinkedEntity) {
        this.versionSet = versionSet;
        this.unlinkedEntity = unlinkedEntity;
    }

    public String getVersionSet() {
        return versionSet;
    }
    public void setVersionSet(String versionSet) {
        this.versionSet = versionSet;
    }

    public String getUnlinkedEntity() {
        return unlinkedEntity;
    }
    public void setUnlinkedEntity(String unlinkedEntity) {
        this.unlinkedEntity = unlinkedEntity;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (versionSet != null) {
            joiner.add("versionSet: \"" + versionSet + "\"");
        }
        if (unlinkedEntity != null) {
            joiner.add("unlinkedEntity: \"" + unlinkedEntity + "\"");
        }
        return joiner.toString();
    }

    public static UnlinkVersionInput.Builder builder() {
        return new UnlinkVersionInput.Builder();
    }

    public static class Builder {

        private String versionSet;
        private String unlinkedEntity;

        public Builder() {
        }

        public Builder setVersionSet(String versionSet) {
            this.versionSet = versionSet;
            return this;
        }

        public Builder setUnlinkedEntity(String unlinkedEntity) {
            this.unlinkedEntity = unlinkedEntity;
            return this;
        }


        public UnlinkVersionInput build() {
            return new UnlinkVersionInput(versionSet, unlinkedEntity);
        }

    }
}
