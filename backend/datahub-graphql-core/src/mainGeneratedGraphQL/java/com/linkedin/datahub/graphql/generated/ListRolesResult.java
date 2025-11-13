package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * The result obtained when listing DataHub Roles
 */
public class ListRolesResult implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private int start;
    private int count;
    private int total;
    @javax.annotation.Nonnull
    private java.util.List<DataHubRole> roles;

    public ListRolesResult() {
    }

    public ListRolesResult(int start, int count, int total, java.util.List<DataHubRole> roles) {
        this.start = start;
        this.count = count;
        this.total = total;
        this.roles = roles;
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
     * The Roles themselves
     */
    public java.util.List<DataHubRole> getRoles() {
        return roles;
    }
    /**
     * The Roles themselves
     */
    public void setRoles(java.util.List<DataHubRole> roles) {
        this.roles = roles;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("start: " + start);
        joiner.add("count: " + count);
        joiner.add("total: " + total);
        if (roles != null) {
            joiner.add("roles: " + roles);
        }
        return joiner.toString();
    }

    public static ListRolesResult.Builder builder() {
        return new ListRolesResult.Builder();
    }

    public static class Builder {

        private int start;
        private int count;
        private int total;
        private java.util.List<DataHubRole> roles;

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
         * The Roles themselves
         */
        public Builder setRoles(java.util.List<DataHubRole> roles) {
            this.roles = roles;
            return this;
        }


        public ListRolesResult build() {
            return new ListRolesResult(start, count, total, roles);
        }

    }
}
