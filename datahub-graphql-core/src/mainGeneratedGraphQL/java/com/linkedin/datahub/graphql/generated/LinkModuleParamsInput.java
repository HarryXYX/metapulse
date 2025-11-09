package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for the params required if the module is type LINK
 */
public class LinkModuleParamsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String linkUrl;
    private String imageUrl;
    private String description;

    public LinkModuleParamsInput() {
    }

    public LinkModuleParamsInput(String linkUrl, String imageUrl, String description) {
        this.linkUrl = linkUrl;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public String getLinkUrl() {
        return linkUrl;
    }
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (linkUrl != null) {
            joiner.add("linkUrl: \"" + linkUrl + "\"");
        }
        if (imageUrl != null) {
            joiner.add("imageUrl: \"" + imageUrl + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        return joiner.toString();
    }

    public static LinkModuleParamsInput.Builder builder() {
        return new LinkModuleParamsInput.Builder();
    }

    public static class Builder {

        private String linkUrl;
        private String imageUrl;
        private String description;

        public Builder() {
        }

        public Builder setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public LinkModuleParamsInput build() {
            return new LinkModuleParamsInput(linkUrl, imageUrl, description);
        }

    }
}
