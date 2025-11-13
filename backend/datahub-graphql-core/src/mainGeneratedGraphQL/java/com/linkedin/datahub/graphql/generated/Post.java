package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when creating a Post
 */
public class Post implements java.io.Serializable, Entity {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    private EntityRelationshipsResult relationships;
    @javax.annotation.Nonnull
    private PostType postType;
    @javax.annotation.Nonnull
    private PostContent content;
    @javax.annotation.Nonnull
    private AuditStamp lastModified;

    public Post() {
    }

    public Post(String urn, EntityType type, EntityRelationshipsResult relationships, PostType postType, PostContent content, AuditStamp lastModified) {
        this.urn = urn;
        this.type = type;
        this.relationships = relationships;
        this.postType = postType;
        this.content = content;
        this.lastModified = lastModified;
    }

    /**
     * The primary key of the Post
     */
    public String getUrn() {
        return urn;
    }
    /**
     * The primary key of the Post
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * The standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * The standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Granular API for querying edges extending from the Post
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Granular API for querying edges extending from the Post
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
    }

    /**
     * The type of post
     */
    public PostType getPostType() {
        return postType;
    }
    /**
     * The type of post
     */
    public void setPostType(PostType postType) {
        this.postType = postType;
    }

    /**
     * The content of the post
     */
    public PostContent getContent() {
        return content;
    }
    /**
     * The content of the post
     */
    public void setContent(PostContent content) {
        this.content = content;
    }

    /**
     * When the post was last modified
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * When the post was last modified
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (postType != null) {
            joiner.add("postType: " + postType);
        }
        if (content != null) {
            joiner.add("content: " + content);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        return joiner.toString();
    }

    public static Post.Builder builder() {
        return new Post.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private EntityRelationshipsResult relationships;
        private PostType postType;
        private PostContent content;
        private AuditStamp lastModified;

        public Builder() {
        }

        /**
         * The primary key of the Post
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * The standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Granular API for querying edges extending from the Post
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * The type of post
         */
        public Builder setPostType(PostType postType) {
            this.postType = postType;
            return this;
        }

        /**
         * The content of the post
         */
        public Builder setContent(PostContent content) {
            this.content = content;
            return this;
        }

        /**
         * When the post was last modified
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }


        public Post build() {
            return new Post(urn, type, relationships, postType, content, lastModified);
        }

    }
}
