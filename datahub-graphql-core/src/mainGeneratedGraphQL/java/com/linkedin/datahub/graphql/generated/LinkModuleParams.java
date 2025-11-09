package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The params required if the module is type LINK
 */
public class LinkModuleParams implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String linkUrl;
    private String imageUrl;
    private String description;

    public LinkModuleParams() {
    }

    public LinkModuleParams(String linkUrl, String imageUrl, String description) {
        this.linkUrl = linkUrl;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    /**
     * The URL of the link
     */
    public String getLinkUrl() {
        return linkUrl;
    }
    /**
     * The URL of the link
     */
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    /**
     * The image URL of the link
     */
    public String getImageUrl() {
        return imageUrl;
    }
    /**
     * The image URL of the link
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     * The description of the link
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of the link
     */
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

    public static LinkModuleParams.Builder builder() {
        return new LinkModuleParams.Builder();
    }

    public static class Builder {

        private String linkUrl;
        private String imageUrl;
        private String description;

        public Builder() {
        }

        /**
         * The URL of the link
         */
        public Builder setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }

        /**
         * The image URL of the link
         */
        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * The description of the link
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public LinkModuleParams build() {
            return new LinkModuleParams(linkUrl, imageUrl, description);
        }

    }
}
