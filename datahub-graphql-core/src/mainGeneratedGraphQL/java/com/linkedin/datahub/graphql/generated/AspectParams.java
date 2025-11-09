package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Params to configure what list of aspects should be fetched by the aspects property
 */
public class AspectParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean autoRenderOnly;
    private java.util.List<String> aspectNames;

    public AspectParams() {
    }

    public AspectParams(Boolean autoRenderOnly, java.util.List<String> aspectNames) {
        this.autoRenderOnly = autoRenderOnly;
        this.aspectNames = aspectNames;
    }

    public Boolean getAutoRenderOnly() {
        return autoRenderOnly;
    }
    public void setAutoRenderOnly(Boolean autoRenderOnly) {
        this.autoRenderOnly = autoRenderOnly;
    }

    public java.util.List<String> getAspectNames() {
        return aspectNames;
    }
    public void setAspectNames(java.util.List<String> aspectNames) {
        this.aspectNames = aspectNames;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (autoRenderOnly != null) {
            joiner.add("autoRenderOnly: " + autoRenderOnly);
        }
        if (aspectNames != null) {
            joiner.add("aspectNames: " + aspectNames);
        }
        return joiner.toString();
    }

    public static AspectParams.Builder builder() {
        return new AspectParams.Builder();
    }

    public static class Builder {

        private Boolean autoRenderOnly;
        private java.util.List<String> aspectNames;

        public Builder() {
        }

        public Builder setAutoRenderOnly(Boolean autoRenderOnly) {
            this.autoRenderOnly = autoRenderOnly;
            return this;
        }

        public Builder setAspectNames(java.util.List<String> aspectNames) {
            this.aspectNames = aspectNames;
            return this;
        }


        public AspectParams build() {
            return new AspectParams(autoRenderOnly, aspectNames);
        }

    }
}
