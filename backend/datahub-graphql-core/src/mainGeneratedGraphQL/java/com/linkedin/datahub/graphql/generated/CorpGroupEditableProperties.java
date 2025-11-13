package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional read write properties about a group
 */
public class CorpGroupEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;
    private String slack;
    private String email;
    private String pictureLink;

    public CorpGroupEditableProperties() {
    }

    public CorpGroupEditableProperties(String description, String slack, String email, String pictureLink) {
        this.description = description;
        this.slack = slack;
        this.email = email;
        this.pictureLink = pictureLink;
    }

    /**
     * DataHub description of the group
     */
    public String getDescription() {
        return description;
    }
    /**
     * DataHub description of the group
     */
    public void setDescription(String description) {
        this.description = description;
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

    /**
     * Email address for the group
     */
    public String getEmail() {
        return email;
    }
    /**
     * Email address for the group
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * A URL which points to a picture which user wants to set as a profile photo
     */
    public String getPictureLink() {
        return pictureLink;
    }
    /**
     * A URL which points to a picture which user wants to set as a profile photo
     */
    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (slack != null) {
            joiner.add("slack: \"" + slack + "\"");
        }
        if (email != null) {
            joiner.add("email: \"" + email + "\"");
        }
        if (pictureLink != null) {
            joiner.add("pictureLink: \"" + pictureLink + "\"");
        }
        return joiner.toString();
    }

    public static CorpGroupEditableProperties.Builder builder() {
        return new CorpGroupEditableProperties.Builder();
    }

    public static class Builder {

        private String description;
        private String slack;
        private String email;
        private String pictureLink;

        public Builder() {
        }

        /**
         * DataHub description of the group
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Slack handle for the group
         */
        public Builder setSlack(String slack) {
            this.slack = slack;
            return this;
        }

        /**
         * Email address for the group
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * A URL which points to a picture which user wants to set as a profile photo
         */
        public Builder setPictureLink(String pictureLink) {
            this.pictureLink = pictureLink;
            return this;
        }


        public CorpGroupEditableProperties build() {
            return new CorpGroupEditableProperties(description, slack, email, pictureLink);
        }

    }
}
