package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information required to render an embedded version of an asset
 */
public class Embed implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String renderUrl;

    public Embed() {
    }

    public Embed(String renderUrl) {
        this.renderUrl = renderUrl;
    }

    /**
     * A URL which can be rendered inside of an iframe.
     */
    public String getRenderUrl() {
        return renderUrl;
    }
    /**
     * A URL which can be rendered inside of an iframe.
     */
    public void setRenderUrl(String renderUrl) {
        this.renderUrl = renderUrl;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (renderUrl != null) {
            joiner.add("renderUrl: \"" + renderUrl + "\"");
        }
        return joiner.toString();
    }

    public static Embed.Builder builder() {
        return new Embed.Builder();
    }

    public static class Builder {

        private String renderUrl;

        public Builder() {
        }

        /**
         * A URL which can be rendered inside of an iframe.
         */
        public Builder setRenderUrl(String renderUrl) {
            this.renderUrl = renderUrl;
            return this;
        }


        public Embed build() {
            return new Embed(renderUrl);
        }

    }
}
