package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Arguments provided to update a CorpGroup Entity
 */
public class CorpGroupUpdateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;
    private String slack;
    private String email;
    private String pictureLink;

    public CorpGroupUpdateInput() {
    }

    public CorpGroupUpdateInput(String description, String slack, String email, String pictureLink) {
        this.description = description;
        this.slack = slack;
        this.email = email;
        this.pictureLink = pictureLink;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getSlack() {
        return slack;
    }
    public void setSlack(String slack) {
        this.slack = slack;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPictureLink() {
        return pictureLink;
    }
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

    public static CorpGroupUpdateInput.Builder builder() {
        return new CorpGroupUpdateInput.Builder();
    }

    public static class Builder {

        private String description;
        private String slack;
        private String email;
        private String pictureLink;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setSlack(String slack) {
            this.slack = slack;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPictureLink(String pictureLink) {
            this.pictureLink = pictureLink;
            return this;
        }


        public CorpGroupUpdateInput build() {
            return new CorpGroupUpdateInput(description, slack, email, pictureLink);
        }

    }
}
