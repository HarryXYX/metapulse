package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Arguments provided to update a CorpUser Entity
 */
public class CorpUserUpdateInput implements java.io.Serializable {

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
    private java.util.List<String> platformUrns;
    private String personaUrn;

    public CorpUserUpdateInput() {
    }

    public CorpUserUpdateInput(String displayName, String title, String aboutMe, java.util.List<String> teams, java.util.List<String> skills, String pictureLink, String slack, String phone, String email, java.util.List<String> platformUrns, String personaUrn) {
        this.displayName = displayName;
        this.title = title;
        this.aboutMe = aboutMe;
        this.teams = teams;
        this.skills = skills;
        this.pictureLink = pictureLink;
        this.slack = slack;
        this.phone = phone;
        this.email = email;
        this.platformUrns = platformUrns;
        this.personaUrn = personaUrn;
    }

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAboutMe() {
        return aboutMe;
    }
    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public java.util.List<String> getTeams() {
        return teams;
    }
    public void setTeams(java.util.List<String> teams) {
        this.teams = teams;
    }

    public java.util.List<String> getSkills() {
        return skills;
    }
    public void setSkills(java.util.List<String> skills) {
        this.skills = skills;
    }

    public String getPictureLink() {
        return pictureLink;
    }
    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }

    public String getSlack() {
        return slack;
    }
    public void setSlack(String slack) {
        this.slack = slack;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public java.util.List<String> getPlatformUrns() {
        return platformUrns;
    }
    public void setPlatformUrns(java.util.List<String> platformUrns) {
        this.platformUrns = platformUrns;
    }

    public String getPersonaUrn() {
        return personaUrn;
    }
    public void setPersonaUrn(String personaUrn) {
        this.personaUrn = personaUrn;
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
        if (platformUrns != null) {
            joiner.add("platformUrns: " + platformUrns);
        }
        if (personaUrn != null) {
            joiner.add("personaUrn: \"" + personaUrn + "\"");
        }
        return joiner.toString();
    }

    public static CorpUserUpdateInput.Builder builder() {
        return new CorpUserUpdateInput.Builder();
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
        private java.util.List<String> platformUrns;
        private String personaUrn;

        public Builder() {
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setAboutMe(String aboutMe) {
            this.aboutMe = aboutMe;
            return this;
        }

        public Builder setTeams(java.util.List<String> teams) {
            this.teams = teams;
            return this;
        }

        public Builder setSkills(java.util.List<String> skills) {
            this.skills = skills;
            return this;
        }

        public Builder setPictureLink(String pictureLink) {
            this.pictureLink = pictureLink;
            return this;
        }

        public Builder setSlack(String slack) {
            this.slack = slack;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPlatformUrns(java.util.List<String> platformUrns) {
            this.platformUrns = platformUrns;
            return this;
        }

        public Builder setPersonaUrn(String personaUrn) {
            this.personaUrn = personaUrn;
            return this;
        }


        public CorpUserUpdateInput build() {
            return new CorpUserUpdateInput(displayName, title, aboutMe, teams, skills, pictureLink, slack, phone, email, platformUrns, personaUrn);
        }

    }
}
