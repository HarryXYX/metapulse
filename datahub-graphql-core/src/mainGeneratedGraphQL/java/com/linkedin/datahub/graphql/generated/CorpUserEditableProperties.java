package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional read write properties about a user
 */
public class CorpUserEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String displayName;
    private String title;
    private String aboutMe;
    private java.util.List<String> teams;
    private java.util.List<String> skills;
    private String pictureLink;
    private String slack;
    private String phone;
    private String email;
    private DataHubPersona persona;
    private java.util.List<DataPlatform> platforms;

    public CorpUserEditableProperties() {
    }

    public CorpUserEditableProperties(String displayName, String title, String aboutMe, java.util.List<String> teams, java.util.List<String> skills, String pictureLink, String slack, String phone, String email, DataHubPersona persona, java.util.List<DataPlatform> platforms) {
        this.displayName = displayName;
        this.title = title;
        this.aboutMe = aboutMe;
        this.teams = teams;
        this.skills = skills;
        this.pictureLink = pictureLink;
        this.slack = slack;
        this.phone = phone;
        this.email = email;
        this.persona = persona;
        this.platforms = platforms;
    }

    /**
     * Display name to show on DataHub
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * Display name to show on DataHub
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * Title to show on DataHub
     */
    public String getTitle() {
        return title;
    }
    /**
     * Title to show on DataHub
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * About me section of the user
     */
    public String getAboutMe() {
        return aboutMe;
    }
    /**
     * About me section of the user
     */
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    /**
     * Teams that the user belongs to
     */
    public java.util.List<String> getTeams() {
        return teams;
    }
    /**
     * Teams that the user belongs to
     */
    public void setTeams(java.util.List<String> teams) {
        this.teams = teams;
    }

    /**
     * Skills that the user possesses
     */
    public java.util.List<String> getSkills() {
        return skills;
    }
    /**
     * Skills that the user possesses
     */
    public void setSkills(java.util.List<String> skills) {
        this.skills = skills;
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

    /**
     * The slack handle of the user
     */
    public String getSlack() {
        return slack;
    }
    /**
     * The slack handle of the user
     */
    public void setSlack(String slack) {
        this.slack = slack;
    }

    /**
     * Phone number for the user
     */
    public String getPhone() {
        return phone;
    }
    /**
     * Phone number for the user
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Email address for the user
     */
    public String getEmail() {
        return email;
    }
    /**
     * Email address for the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * User persona, if present
     */
    public DataHubPersona getPersona() {
        return persona;
    }
    /**
     * User persona, if present
     */
    public void setPersona(DataHubPersona persona) {
        this.persona = persona;
    }

    /**
     * Platforms commonly used by the user, if present.
     */
    public java.util.List<DataPlatform> getPlatforms() {
        return platforms;
    }
    /**
     * Platforms commonly used by the user, if present.
     */
    public void setPlatforms(java.util.List<DataPlatform> platforms) {
        this.platforms = platforms;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (displayName != null) {
            joiner.add("displayName: \"" + displayName + "\"");
        }
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (aboutMe != null) {
            joiner.add("aboutMe: \"" + aboutMe + "\"");
        }
        if (teams != null) {
            joiner.add("teams: " + teams);
        }
        if (skills != null) {
            joiner.add("skills: " + skills);
        }
        if (pictureLink != null) {
            joiner.add("pictureLink: \"" + pictureLink + "\"");
        }
        if (slack != null) {
            joiner.add("slack: \"" + slack + "\"");
        }
        if (phone != null) {
            joiner.add("phone: \"" + phone + "\"");
        }
        if (email != null) {
            joiner.add("email: \"" + email + "\"");
        }
        if (persona != null) {
            joiner.add("persona: " + persona);
        }
        if (platforms != null) {
            joiner.add("platforms: " + platforms);
        }
        return joiner.toString();
    }

    public static CorpUserEditableProperties.Builder builder() {
        return new CorpUserEditableProperties.Builder();
    }

    public static class Builder {

        private String displayName;
        private String title;
        private String aboutMe;
        private java.util.List<String> teams;
        private java.util.List<String> skills;
        private String pictureLink;
        private String slack;
        private String phone;
        private String email;
        private DataHubPersona persona;
        private java.util.List<DataPlatform> platforms;

        public Builder() {
        }

        /**
         * Display name to show on DataHub
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * Title to show on DataHub
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * About me section of the user
         */
        public Builder setAboutMe(String aboutMe) {
            this.aboutMe = aboutMe;
            return this;
        }

        /**
         * Teams that the user belongs to
         */
        public Builder setTeams(java.util.List<String> teams) {
            this.teams = teams;
            return this;
        }

        /**
         * Skills that the user possesses
         */
        public Builder setSkills(java.util.List<String> skills) {
            this.skills = skills;
            return this;
        }

        /**
         * A URL which points to a picture which user wants to set as a profile photo
         */
        public Builder setPictureLink(String pictureLink) {
            this.pictureLink = pictureLink;
            return this;
        }

        /**
         * The slack handle of the user
         */
        public Builder setSlack(String slack) {
            this.slack = slack;
            return this;
        }

        /**
         * Phone number for the user
         */
        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * Email address for the user
         */
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        /**
         * User persona, if present
         */
        public Builder setPersona(DataHubPersona persona) {
            this.persona = persona;
            return this;
        }

        /**
         * Platforms commonly used by the user, if present.
         */
        public Builder setPlatforms(java.util.List<DataPlatform> platforms) {
            this.platforms = platforms;
            return this;
        }


        public CorpUserEditableProperties build() {
            return new CorpUserEditableProperties(displayName, title, aboutMe, teams, skills, pictureLink, slack, phone, email, persona, platforms);
        }

    }
}
