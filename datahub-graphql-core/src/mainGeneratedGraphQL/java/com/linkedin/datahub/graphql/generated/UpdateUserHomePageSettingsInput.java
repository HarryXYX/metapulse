package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to update a user's home page settings.
 */
public class UpdateUserHomePageSettingsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String pageTemplate;
    private java.util.List<String> newDismissedAnnouncements;
    private Boolean removePageTemplate;

    public UpdateUserHomePageSettingsInput() {
    }

    public UpdateUserHomePageSettingsInput(String pageTemplate, java.util.List<String> newDismissedAnnouncements, Boolean removePageTemplate) {
        this.pageTemplate = pageTemplate;
        this.newDismissedAnnouncements = newDismissedAnnouncements;
        this.removePageTemplate = removePageTemplate;
    }

    public String getPageTemplate() {
        return pageTemplate;
    }
    public void setPageTemplate(String pageTemplate) {
        this.pageTemplate = pageTemplate;
    }

    public java.util.List<String> getNewDismissedAnnouncements() {
        return newDismissedAnnouncements;
    }
    public void setNewDismissedAnnouncements(java.util.List<String> newDismissedAnnouncements) {
        this.newDismissedAnnouncements = newDismissedAnnouncements;
    }

    public Boolean getRemovePageTemplate() {
        return removePageTemplate;
    }
    public void setRemovePageTemplate(Boolean removePageTemplate) {
        this.removePageTemplate = removePageTemplate;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (pageTemplate != null) {
            joiner.add("pageTemplate: \"" + pageTemplate + "\"");
        }
        if (newDismissedAnnouncements != null) {
            joiner.add("newDismissedAnnouncements: " + newDismissedAnnouncements);
        }
        if (removePageTemplate != null) {
            joiner.add("removePageTemplate: " + removePageTemplate);
        }
        return joiner.toString();
    }

    public static UpdateUserHomePageSettingsInput.Builder builder() {
        return new UpdateUserHomePageSettingsInput.Builder();
    }

    public static class Builder {

        private String pageTemplate;
        private java.util.List<String> newDismissedAnnouncements;
        private Boolean removePageTemplate;

        public Builder() {
        }

        public Builder setPageTemplate(String pageTemplate) {
            this.pageTemplate = pageTemplate;
            return this;
        }

        public Builder setNewDismissedAnnouncements(java.util.List<String> newDismissedAnnouncements) {
            this.newDismissedAnnouncements = newDismissedAnnouncements;
            return this;
        }

        public Builder setRemovePageTemplate(Boolean removePageTemplate) {
            this.removePageTemplate = removePageTemplate;
            return this;
        }


        public UpdateUserHomePageSettingsInput build() {
            return new UpdateUserHomePageSettingsInput(pageTemplate, newDismissedAnnouncements, removePageTemplate);
        }

    }
}
