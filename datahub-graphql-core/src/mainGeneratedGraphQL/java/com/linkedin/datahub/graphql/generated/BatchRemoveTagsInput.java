package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when removing tags from a batch of assets
 */
public class BatchRemoveTagsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> tagUrns;
    @javax.annotation.Nonnull
    private java.util.List<ResourceRefInput> resources;

    public BatchRemoveTagsInput() {
    }

    public BatchRemoveTagsInput(java.util.List<String> tagUrns, java.util.List<ResourceRefInput> resources) {
        this.tagUrns = tagUrns;
        this.resources = resources;
    }

    public java.util.List<String> getTagUrns() {
        return tagUrns;
    }
    public void setTagUrns(java.util.List<String> tagUrns) {
        this.tagUrns = tagUrns;
    }

    public java.util.List<ResourceRefInput> getResources() {
        return resources;
    }
    public void setResources(java.util.List<ResourceRefInput> resources) {
        this.resources = resources;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (tagUrns != null) {
            joiner.add("tagUrns: " + tagUrns);
        }
        if (resources != null) {
            joiner.add("resources: " + resources);
        }
        return joiner.toString();
    }

    public static BatchRemoveTagsInput.Builder builder() {
        return new BatchRemoveTagsInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> tagUrns;
        private java.util.List<ResourceRefInput> resources;

        public Builder() {
        }

        public Builder setTagUrns(java.util.List<String> tagUrns) {
            this.tagUrns = tagUrns;
            return this;
        }

        public Builder setResources(java.util.List<ResourceRefInput> resources) {
            this.resources = resources;
            return this;
        }


        public BatchRemoveTagsInput build() {
            return new BatchRemoveTagsInput(tagUrns, resources);
        }

    }
}
