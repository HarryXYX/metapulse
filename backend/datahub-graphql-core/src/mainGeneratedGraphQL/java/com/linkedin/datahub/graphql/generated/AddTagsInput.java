package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when adding tags to an asset
 */
public class AddTagsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<String> tagUrns;
    @javax.annotation.Nonnull
    private String resourceUrn;
    private SubResourceType subResourceType;
    private String subResource;

    public AddTagsInput() {
    }

    public AddTagsInput(java.util.List<String> tagUrns, String resourceUrn, SubResourceType subResourceType, String subResource) {
        this.tagUrns = tagUrns;
        this.resourceUrn = resourceUrn;
        this.subResourceType = subResourceType;
        this.subResource = subResource;
    }

    public java.util.List<String> getTagUrns() {
        return tagUrns;
    }
    public void setTagUrns(java.util.List<String> tagUrns) {
        this.tagUrns = tagUrns;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public SubResourceType getSubResourceType() {
        return subResourceType;
    }
    public void setSubResourceType(SubResourceType subResourceType) {
        this.subResourceType = subResourceType;
    }

    public String getSubResource() {
        return subResource;
    }
    public void setSubResource(String subResource) {
        this.subResource = subResource;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (tagUrns != null) {
            joiner.add("tagUrns: " + tagUrns);
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        if (subResourceType != null) {
            joiner.add("subResourceType: " + subResourceType);
        }
        if (subResource != null) {
            joiner.add("subResource: \"" + subResource + "\"");
        }
        return joiner.toString();
    }

    public static AddTagsInput.Builder builder() {
        return new AddTagsInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> tagUrns;
        private String resourceUrn;
        private SubResourceType subResourceType;
        private String subResource;

        public Builder() {
        }

        public Builder setTagUrns(java.util.List<String> tagUrns) {
            this.tagUrns = tagUrns;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }

        public Builder setSubResourceType(SubResourceType subResourceType) {
            this.subResourceType = subResourceType;
            return this;
        }

        public Builder setSubResource(String subResource) {
            this.subResource = subResource;
            return this;
        }


        public AddTagsInput build() {
            return new AddTagsInput(tagUrns, resourceUrn, subResourceType, subResource);
        }

    }
}
