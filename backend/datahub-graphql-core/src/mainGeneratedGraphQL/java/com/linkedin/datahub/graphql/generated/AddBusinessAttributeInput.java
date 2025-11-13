package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to attach Business Attribute
If businessAttributeUrn is null, then it will remove the business attribute from the resource
 */
public class AddBusinessAttributeInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String businessAttributeUrn;
    @javax.annotation.Nonnull
    private java.util.List<ResourceRefInput> resourceUrn;

    public AddBusinessAttributeInput() {
    }

    public AddBusinessAttributeInput(String businessAttributeUrn, java.util.List<ResourceRefInput> resourceUrn) {
        this.businessAttributeUrn = businessAttributeUrn;
        this.resourceUrn = resourceUrn;
    }

    public String getBusinessAttributeUrn() {
        return businessAttributeUrn;
    }
    public void setBusinessAttributeUrn(String businessAttributeUrn) {
        this.businessAttributeUrn = businessAttributeUrn;
    }

    public java.util.List<ResourceRefInput> getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(java.util.List<ResourceRefInput> resourceUrn) {
        this.resourceUrn = resourceUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (businessAttributeUrn != null) {
            joiner.add("businessAttributeUrn: \"" + businessAttributeUrn + "\"");
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: " + resourceUrn);
        }
        return joiner.toString();
    }

    public static AddBusinessAttributeInput.Builder builder() {
        return new AddBusinessAttributeInput.Builder();
    }

    public static class Builder {

        private String businessAttributeUrn;
        private java.util.List<ResourceRefInput> resourceUrn;

        public Builder() {
        }

        public Builder setBusinessAttributeUrn(String businessAttributeUrn) {
            this.businessAttributeUrn = businessAttributeUrn;
            return this;
        }

        public Builder setResourceUrn(java.util.List<ResourceRefInput> resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public AddBusinessAttributeInput build() {
            return new AddBusinessAttributeInput(businessAttributeUrn, resourceUrn);
        }

    }
}
