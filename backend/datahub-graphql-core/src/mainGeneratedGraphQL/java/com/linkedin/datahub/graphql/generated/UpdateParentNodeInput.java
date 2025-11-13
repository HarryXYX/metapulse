package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for updating the parent node of a resource. Currently only GlossaryNodes and GlossaryTerms have parentNodes.
 */
public class UpdateParentNodeInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String parentNode;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public UpdateParentNodeInput() {
    }

    public UpdateParentNodeInput(String parentNode, String resourceUrn) {
        this.parentNode = parentNode;
        this.resourceUrn = resourceUrn;
    }

    public String getParentNode() {
        return parentNode;
    }
    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
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
        if (parentNode != null) {
            joiner.add("parentNode: \"" + parentNode + "\"");
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        return joiner.toString();
    }

    public static UpdateParentNodeInput.Builder builder() {
        return new UpdateParentNodeInput.Builder();
    }

    public static class Builder {

        private String parentNode;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setParentNode(String parentNode) {
            this.parentNode = parentNode;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public UpdateParentNodeInput build() {
            return new UpdateParentNodeInput(parentNode, resourceUrn);
        }

    }
}
