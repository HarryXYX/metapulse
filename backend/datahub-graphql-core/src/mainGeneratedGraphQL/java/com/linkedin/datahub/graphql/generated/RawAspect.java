package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Payload representing data about a single aspect
 */
public class RawAspect implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String aspectName;
    private String payload;
    private AspectRenderSpec renderSpec;

    public RawAspect() {
    }

    public RawAspect(String aspectName, String payload, AspectRenderSpec renderSpec) {
        this.aspectName = aspectName;
        this.payload = payload;
        this.renderSpec = renderSpec;
    }

    /**
     * The name of the aspect
     */
    public String getAspectName() {
        return aspectName;
    }
    /**
     * The name of the aspect
     */
    public void setAspectName(String aspectName) {
        this.aspectName = aspectName;
    }

    /**
     * JSON string containing the aspect's payload
     */
    public String getPayload() {
        return payload;
    }
    /**
     * JSON string containing the aspect's payload
     */
    public void setPayload(String payload) {
        this.payload = payload;
    }

    /**
     * Details for the frontend on how the raw aspect should be rendered
     */
    public AspectRenderSpec getRenderSpec() {
        return renderSpec;
    }
    /**
     * Details for the frontend on how the raw aspect should be rendered
     */
    public void setRenderSpec(AspectRenderSpec renderSpec) {
        this.renderSpec = renderSpec;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (aspectName != null) {
            joiner.add("aspectName: \"" + aspectName + "\"");
        }
        if (payload != null) {
            joiner.add("payload: \"" + payload + "\"");
        }
        if (renderSpec != null) {
            joiner.add("renderSpec: " + renderSpec);
        }
        return joiner.toString();
    }

    public static RawAspect.Builder builder() {
        return new RawAspect.Builder();
    }

    public static class Builder {

        private String aspectName;
        private String payload;
        private AspectRenderSpec renderSpec;

        public Builder() {
        }

        /**
         * The name of the aspect
         */
        public Builder setAspectName(String aspectName) {
            this.aspectName = aspectName;
            return this;
        }

        /**
         * JSON string containing the aspect's payload
         */
        public Builder setPayload(String payload) {
            this.payload = payload;
            return this;
        }

        /**
         * Details for the frontend on how the raw aspect should be rendered
         */
        public Builder setRenderSpec(AspectRenderSpec renderSpec) {
            this.renderSpec = renderSpec;
            return this;
        }


        public RawAspect build() {
            return new RawAspect(aspectName, payload, renderSpec);
        }

    }
}
