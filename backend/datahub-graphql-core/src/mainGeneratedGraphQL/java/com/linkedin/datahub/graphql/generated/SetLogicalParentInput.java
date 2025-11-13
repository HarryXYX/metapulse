package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class SetLogicalParentInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String resourceUrn;
    private String parentUrn;

    public SetLogicalParentInput() {
    }

    public SetLogicalParentInput(String resourceUrn, String parentUrn) {
        this.resourceUrn = resourceUrn;
        this.parentUrn = parentUrn;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public String getParentUrn() {
        return parentUrn;
    }
    public void setParentUrn(String parentUrn) {
        this.parentUrn = parentUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        if (parentUrn != null) {
            joiner.add("parentUrn: \"" + parentUrn + "\"");
        }
        return joiner.toString();
    }

    public static SetLogicalParentInput.Builder builder() {
        return new SetLogicalParentInput.Builder();
    }

    public static class Builder {

        private String resourceUrn;
        private String parentUrn;

        public Builder() {
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }

        public Builder setParentUrn(String parentUrn) {
            this.parentUrn = parentUrn;
            return this;
        }


        public SetLogicalParentInput build() {
            return new SetLogicalParentInput(resourceUrn, parentUrn);
        }

    }
}
