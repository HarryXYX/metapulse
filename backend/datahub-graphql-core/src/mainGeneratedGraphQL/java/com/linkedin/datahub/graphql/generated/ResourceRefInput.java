package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Reference to a resource to apply an action to
 */
public class ResourceRefInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String resourceUrn;
    private SubResourceType subResourceType;
    private String subResource;

    public ResourceRefInput() {
    }

    public ResourceRefInput(String resourceUrn, SubResourceType subResourceType, String subResource) {
        this.resourceUrn = resourceUrn;
        this.subResourceType = subResourceType;
        this.subResource = subResource;
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

    public static ResourceRefInput.Builder builder() {
        return new ResourceRefInput.Builder();
    }

    public static class Builder {

        private String resourceUrn;
        private SubResourceType subResourceType;
        private String subResource;

        public Builder() {
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


        public ResourceRefInput build() {
            return new ResourceRefInput(resourceUrn, subResourceType, subResource);
        }

    }
}
