package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided for filling in a post content
 */
public class UpdatePostContentInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private PostContentType contentType;
    @javax.annotation.Nonnull
    private String title;
    private String description;
    private String link;
    private UpdateMediaInput media;

    public UpdatePostContentInput() {
    }

    public UpdatePostContentInput(PostContentType contentType, String title, String description, String link, UpdateMediaInput media) {
        this.contentType = contentType;
        this.title = title;
        this.description = description;
        this.link = link;
        this.media = media;
    }

    public PostContentType getContentType() {
        return contentType;
    }
    public void setContentType(PostContentType contentType) {
        this.contentType = contentType;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }
    public void setLink(String link) {
        this.link = link;
    }

    public UpdateMediaInput getMedia() {
        return media;
    }
    public void setMedia(UpdateMediaInput media) {
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

    public static UpdatePostContentInput.Builder builder() {
        return new UpdatePostContentInput.Builder();
    }

    public static class Builder {

        private PostContentType contentType;
        private String title;
        private String description;
        private String link;
        private UpdateMediaInput media;

        public Builder() {
        }

        public Builder setContentType(PostContentType contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setLink(String link) {
            this.link = link;
            return this;
        }

        public Builder setMedia(UpdateMediaInput media) {
            this.media = media;
            return this;
        }


        public UpdatePostContentInput build() {
            return new UpdatePostContentInput(contentType, title, description, link, media);
        }

    }
}
