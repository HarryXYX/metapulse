package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to set or clear information related to rendering a Data Asset inside of DataHub.
 */
public class UpdateEmbedInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    private String renderUrl;

    public UpdateEmbedInput() {
    }

    public UpdateEmbedInput(String urn, String renderUrl) {
        this.urn = urn;
        this.renderUrl = renderUrl;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getRenderUrl() {
        return renderUrl;
    }
    public void setRenderUrl(String renderUrl) {
        this.renderUrl = renderUrl;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (renderUrl != null) {
            joiner.add("renderUrl: \"" + renderUrl + "\"");
        }
        return joiner.toString();
    }

    public static UpdateEmbedInput.Builder builder() {
        return new UpdateEmbedInput.Builder();
    }

    public static class Builder {

        private String urn;
        private String renderUrl;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setRenderUrl(String renderUrl) {
            this.renderUrl = renderUrl;
            return this;
        }


        public UpdateEmbedInput build() {
            return new UpdateEmbedInput(urn, renderUrl);
        }

    }
}
