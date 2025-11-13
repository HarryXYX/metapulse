package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input properties required for batch setting a DataProduct on other entities
 */
public class BatchSetDataProductInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String dataProductUrn;
    @javax.annotation.Nonnull
    private java.util.List<String> resourceUrns;

    public BatchSetDataProductInput() {
    }

    public BatchSetDataProductInput(String dataProductUrn, java.util.List<String> resourceUrns) {
        this.dataProductUrn = dataProductUrn;
        this.resourceUrns = resourceUrns;
    }

    public String getDataProductUrn() {
        return dataProductUrn;
    }
    public void setDataProductUrn(String dataProductUrn) {
        this.dataProductUrn = dataProductUrn;
    }

    public java.util.List<String> getResourceUrns() {
        return resourceUrns;
    }
    public void setResourceUrns(java.util.List<String> resourceUrns) {
        this.resourceUrns = resourceUrns;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (dataProductUrn != null) {
            joiner.add("dataProductUrn: \"" + dataProductUrn + "\"");
        }
        if (resourceUrns != null) {
            joiner.add("resourceUrns: " + resourceUrns);
        }
        return joiner.toString();
    }

    public static BatchSetDataProductInput.Builder builder() {
        return new BatchSetDataProductInput.Builder();
    }

    public static class Builder {

        private String dataProductUrn;
        private java.util.List<String> resourceUrns;

        public Builder() {
        }

        public Builder setDataProductUrn(String dataProductUrn) {
            this.dataProductUrn = dataProductUrn;
            return this;
        }

        public Builder setResourceUrns(java.util.List<String> resourceUrns) {
            this.resourceUrns = resourceUrns;
            return this;
        }


        public BatchSetDataProductInput build() {
            return new BatchSetDataProductInput(dataProductUrn, resourceUrns);
        }

    }
}
