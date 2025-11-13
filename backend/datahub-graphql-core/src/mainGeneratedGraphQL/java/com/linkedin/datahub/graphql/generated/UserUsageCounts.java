package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about individual user usage of a Dataset
 */
public class UserUsageCounts implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CorpUser user;
    private Integer count;
    private String userEmail;

    public UserUsageCounts() {
    }

    public UserUsageCounts(CorpUser user, Integer count, String userEmail) {
        this.user = user;
        this.count = count;
        this.userEmail = userEmail;
    }

    /**
     * The user of the Dataset
     */
    public CorpUser getUser() {
        return user;
    }
    /**
     * The user of the Dataset
     */
    public void setUser(CorpUser user) {
        this.user = user;
    }

    /**
     * The number of queries issued by the user
     */
    public Integer getCount() {
        return count;
    }
    /**
     * The number of queries issued by the user
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * The extracted user email
Note that this field will soon be deprecated and merged with user
     */
    public String getUserEmail() {
        return userEmail;
    }
    /**
     * The extracted user email
Note that this field will soon be deprecated and merged with user
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (user != null) {
            joiner.add("user: " + user);
        }
        if (count != null) {
            joiner.add("count: " + count);
        }
        if (userEmail != null) {
            joiner.add("userEmail: \"" + userEmail + "\"");
        }
        return joiner.toString();
    }

    public static UserUsageCounts.Builder builder() {
        return new UserUsageCounts.Builder();
    }

    public static class Builder {

        private CorpUser user;
        private Integer count;
        private String userEmail;

        public Builder() {
        }

        /**
         * The user of the Dataset
         */
        public Builder setUser(CorpUser user) {
            this.user = user;
            return this;
        }

        /**
         * The number of queries issued by the user
         */
        public Builder setCount(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The extracted user email
Note that this field will soon be deprecated and merged with user
         */
        public Builder setUserEmail(String userEmail) {
            this.userEmail = userEmail;
            return this;
        }


        public UserUsageCounts build() {
            return new UserUsageCounts(user, count, userEmail);
        }

    }
}
