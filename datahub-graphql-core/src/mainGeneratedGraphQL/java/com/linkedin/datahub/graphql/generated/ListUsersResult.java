package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result obtained when listing DataHub Users
 */
public class ListUsersResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<CorpUser> users;

    public ListUsersResult() {
    }

    public ListUsersResult(int start, int count, int total, java.util.List<CorpUser> users) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.users = users;
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
     * The number of Policies in the returned result set
     */
    public int getCount() {
        return count;
    }
    /**
     * The number of Policies in the returned result set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * The total number of Policies in the result set
     */
    public int getTotal() {
        return total;
    }
    /**
     * The total number of Policies in the result set
     */
    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * The users themselves
     */
    public java.util.List<CorpUser> getUsers() {
        return users;
    }
    /**
     * The users themselves
     */
    public void setUsers(java.util.List<CorpUser> users) {
        this.users = users;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (users != null) {
            joiner.add("users: " + users);
        }
        return joiner.toString();
    }

    public static ListUsersResult.Builder builder() {
        return new ListUsersResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<CorpUser> users;

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
         * The number of Policies in the returned result set
         */
        public Builder setCount(int count) {
            this.count = count;
            return this;
        }

        /**
         * The total number of Policies in the result set
         */
        public Builder setTotal(int total) {
            this.total = total;
            return this;
        }

        /**
         * The users themselves
         */
        public Builder setUsers(java.util.List<CorpUser> users) {
            this.users = users;
            return this;
        }


        public ListUsersResult build() {
            return new ListUsersResult(start, count, total, users);
        }

    }
}
