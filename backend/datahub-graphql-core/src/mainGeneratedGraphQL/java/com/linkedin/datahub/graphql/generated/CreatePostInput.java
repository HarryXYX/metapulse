package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when creating a Post
 */
public class CreatePostInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private PostType postType;
    @javax.annotation.Nonnull
    private UpdatePostContentInput content;
    private String resourceUrn;
    private SubResourceType subResourceType;
    private String subResource;

    public CreatePostInput() {
    }

    public CreatePostInput(PostType postType, UpdatePostContentInput content, String resourceUrn, SubResourceType subResourceType, String subResource) {
        this.postType = postType;
        this.content = content;
        this.resourceUrn = resourceUrn;
        this.subResourceType = subResourceType;
        this.subResource = subResource;
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

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public SubResourceType getSubResourceType() {
        return subResourceType;
    }
    public void setSubResourceType(SubResourceType subResourceType) {
        this.subResourceType = subResourceType;
    }

    public String getSubResource() {
        return subResource;
    }
    public void setSubResource(String subResource) {
        this.subResource = subResource;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (postType != null) {
            joiner.add("postType: " + postType);
        }
        if (content != null) {
            joiner.add("content: " + content);
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        if (subResourceType != null) {
            joiner.add("subResourceType: " + subResourceType);
        }
        if (subResource != null) {
            joiner.add("subResource: \"" + subResource + "\"");
        }
        return joiner.toString();
    }

    public static CreatePostInput.Builder builder() {
        return new CreatePostInput.Builder();
    }

    public static class Builder {

        private PostType postType;
        private UpdatePostContentInput content;
        private String resourceUrn;
        private SubResourceType subResourceType;
        private String subResource;

        public Builder() {
        }

        public Builder setPostType(PostType postType) {
            this.postType = postType;
            return this;
        }

        public Builder setContent(UpdatePostContentInput content) {
            this.content = content;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }

        public Builder setSubResourceType(SubResourceType subResourceType) {
            this.subResourceType = subResourceType;
            return this;
        }

        public Builder setSubResource(String subResource) {
            this.subResource = subResource;
            return this;
        }


        public CreatePostInput build() {
            return new CreatePostInput(postType, content, resourceUrn, subResourceType, subResource);
        }

    }
}
