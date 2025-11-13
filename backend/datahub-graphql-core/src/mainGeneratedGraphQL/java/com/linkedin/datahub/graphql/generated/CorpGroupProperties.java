package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional read only properties about a group
 */
public class CorpGroupProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String displayName;
    private String description;
    private String email;
    private String slack;

    public CorpGroupProperties() {
    }

    public CorpGroupProperties(String displayName, String description, String email, String slack) {
        this.displayName = displayName;
        this.description = description;
        this.email = email;
        this.slack = slack;
    }

    /**
     * display name of this group
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * display name of this group
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * The description provided for the group
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description provided for the group
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * email of this group
     */
    public String getEmail() {
        return email;
    }
    /**
     * email of this group
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Slack handle for the group
     */
    public String getSlack() {
        return slack;
    }
    /**
     * Slack handle for the group
     */
    public void setSlack(String slack) {
        this.slack = slack;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (displayName != null) {
            joiner.add("displayName: \"" + displayName + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (email != null) {
            joiner.add("email: \"" + email + "\"");
        }
        if (slack != null) {
            joiner.add("slack: \"" + slack + "\"");
        }
        return joiner.toString();
    }

    public static CorpGroupProperties.Builder builder() {
        return new CorpGroupProperties.Builder();
    }

    public static class Builder {

        private String displayName;
        private String description;
        private String email;
        private String slack;

        public Builder() {
        }

        /**
         * display name of this group
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The description provided for the group
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * email of this group
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * Slack handle for the group
         */
        public Builder setSlack(String slack) {
            this.slack = slack;
            return this;
        }


        public CorpGroupProperties build() {
            return new CorpGroupProperties(displayName, description, email, slack);
        }

    }
}
