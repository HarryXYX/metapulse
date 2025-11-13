package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when creating a Post
 */
public class UpdatePostInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private PostType postType;
    @javax.annotation.Nonnull
    private UpdatePostContentInput content;

    public UpdatePostInput() {
    }

    public UpdatePostInput(String urn, PostType postType, UpdatePostContentInput content) {
        this.urn = urn;
        this.postType = postType;
        this.content = content;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public PostType getPostType() {
        return postType;
    }
    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    public UpdatePostContentInput getContent() {
        return content;
    }
    public void setContent(UpdatePostContentInput content) {
        this.content = content;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (postType != null) {
            joiner.add("postType: " + postType);
        }
        if (content != null) {
            joiner.add("content: " + content);
        }
        return joiner.toString();
    }

    public static UpdatePostInput.Builder builder() {
        return new UpdatePostInput.Builder();
    }

    public static class Builder {

        private String urn;
        private PostType postType;
        private UpdatePostContentInput content;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setPostType(PostType postType) {
            this.postType = postType;
            return this;
        }

        public Builder setContent(UpdatePostContentInput content) {
            this.content = content;
            return this;
        }


        public UpdatePostInput build() {
            return new UpdatePostInput(urn, postType, content);
        }

    }
}
