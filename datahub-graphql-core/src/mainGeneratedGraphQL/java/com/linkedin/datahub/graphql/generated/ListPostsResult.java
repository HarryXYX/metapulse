package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result obtained when listing Posts
 */
public class ListPostsResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<Post> posts;

    public ListPostsResult() {
    }

    public ListPostsResult(int start, int count, int total, java.util.List<Post> posts) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.posts = posts;
    }

    /**
     * The starting offset of the result set returned
     */
    public int getStart() {
        return start;
    }
    /**
     * The starting offset of the result set returned
     */
    public void setStart(int start) {
        this.start = start;
    }

    /**
     * The number of Roles in the returned result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of Roles in the returned result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of Roles in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of Roles in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The Posts themselves
     */
    public java.util.List<Post> getPosts() {
        return posts;
    }
    /**
     * The Posts themselves
     */
    public void setPosts(java.util.List<Post> posts) {
        this.posts = posts;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (posts != null) {
            joiner.add("posts: " + posts);
        }
        return joiner.toString();
    }

    public static ListPostsResult.Builder builder() {
        return new ListPostsResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<Post> posts;

        public Builder() {
        }

        /**
         * The starting offset of the result set returned
         */
        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        /**
         * The number of Roles in the returned result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of Roles in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The Posts themselves
         */
        public Builder setPosts(java.util.List<Post> posts) {
            this.posts = posts;
            return this;
        }


        public ListPostsResult build() {
            return new ListPostsResult(start, count, total, posts);
        }

    }
}
