package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Post content
 */
public class PostContent implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private PostContentType contentType;
    @javax.annotation.Nonnull
    private String title;
    private String description;
    private String link;
    private Media media;

    public PostContent() {
    }

    public PostContent(PostContentType contentType, String title, String description, String link, Media media) {
        this.contentType = contentType;
        this.title = title;
        this.description = description;
        this.link = link;
        this.media = media;
    }

    /**
     * The type of post content
     */
    public PostContentType getContentType() {
        return contentType;
    }
    /**
     * The type of post content
     */
    public void setContentType(PostContentType contentType) {
        this.contentType = contentType;
    }

    /**
     * The title of the post
     */
    public String getTitle() {
        return title;
    }
    /**
     * The title of the post
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Optional content of the post
     */
    public String getDescription() {
        return description;
    }
    /**
     * Optional content of the post
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Optional link that the post is associated with
     */
    public String getLink() {
        return link;
    }
    /**
     * Optional link that the post is associated with
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Optional media contained in the post
     */
    public Media getMedia() {
        return media;
    }
    /**
     * Optional media contained in the post
     */
    public void setMedia(Media media) {
        this.media = media;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (contentType != null) {
            joiner.add("contentType: " + contentType);
        }
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (link != null) {
            joiner.add("link: \"" + link + "\"");
        }
        if (media != null) {
            joiner.add("media: " + media);
        }
        return joiner.toString();
    }

    public static PostContent.Builder builder() {
        return new PostContent.Builder();
    }

    public static class Builder {

        private PostContentType contentType;
        private String title;
        private String description;
        private String link;
        private Media media;

        public Builder() {
        }

        /**
         * The type of post content
         */
        public Builder setContentType(PostContentType contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * The title of the post
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * Optional content of the post
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Optional link that the post is associated with
         */
        public Builder setLink(String link) {
            this.link = link;
            return this;
        }

        /**
         * Optional media contained in the post
         */
        public Builder setMedia(Media media) {
            this.media = media;
            return this;
        }


        public PostContent build() {
            return new PostContent(contentType, title, description, link, media);
        }

    }
}
