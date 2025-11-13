package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Spec to identify resource
 */
public class ResourceSpec implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private EntityType resourceType;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public ResourceSpec() {
    }

    public ResourceSpec(EntityType resourceType, String resourceUrn) {
        this.resourceType = resourceType;
        this.resourceUrn = resourceUrn;
    }

    public EntityType getResourceType() {
        return resourceType;
    }
    public void setResourceType(EntityType resourceType) {
        this.resourceType = resourceType;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (resourceType != null) {
            joiner.add("resourceType: " + resourceType);
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        return joiner.toString();
    }

    public static ResourceSpec.Builder builder() {
        return new ResourceSpec.Builder();
    }

    public static class Builder {

        private EntityType resourceType;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setResourceType(EntityType resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public ResourceSpec build() {
            return new ResourceSpec(resourceType, resourceUrn);
        }

    }
}
