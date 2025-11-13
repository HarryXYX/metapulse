package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Settings related to the home page for a user
 */
public class CorpUserHomePageSettings implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private DataHubPageTemplate pageTemplate;
    private java.util.List<String> dismissedAnnouncementUrns;

    public CorpUserHomePageSettings() {
    }

    public CorpUserHomePageSettings(DataHubPageTemplate pageTemplate, java.util.List<String> dismissedAnnouncementUrns) {
        this.pageTemplate = pageTemplate;
        this.dismissedAnnouncementUrns = dismissedAnnouncementUrns;
    }

    /**
     * The default page template for the User.
     */
    public DataHubPageTemplate getPageTemplate() {
        return pageTemplate;
    }
    /**
     * The default page template for the User.
     */
    public void setPageTemplate(DataHubPageTemplate pageTemplate) {
        this.pageTemplate = pageTemplate;
    }

    /**
     * List of urns of the announcements dismissed by the User.
     */
    public java.util.List<String> getDismissedAnnouncementUrns() {
        return dismissedAnnouncementUrns;
    }
    /**
     * List of urns of the announcements dismissed by the User.
     */
    public void setDismissedAnnouncementUrns(java.util.List<String> dismissedAnnouncementUrns) {
        this.dismissedAnnouncementUrns = dismissedAnnouncementUrns;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (pageTemplate != null) {
            joiner.add("pageTemplate: " + pageTemplate);
        }
        if (dismissedAnnouncementUrns != null) {
            joiner.add("dismissedAnnouncementUrns: " + dismissedAnnouncementUrns);
        }
        return joiner.toString();
    }

    public static CorpUserHomePageSettings.Builder builder() {
        return new CorpUserHomePageSettings.Builder();
    }

    public static class Builder {

        private DataHubPageTemplate pageTemplate;
        private java.util.List<String> dismissedAnnouncementUrns;

        public Builder() {
        }

        /**
         * The default page template for the User.
         */
        public Builder setPageTemplate(DataHubPageTemplate pageTemplate) {
            this.pageTemplate = pageTemplate;
            return this;
        }

        /**
         * List of urns of the announcements dismissed by the User.
         */
        public Builder setDismissedAnnouncementUrns(java.util.List<String> dismissedAnnouncementUrns) {
            this.dismissedAnnouncementUrns = dismissedAnnouncementUrns;
            return this;
        }


        public CorpUserHomePageSettings build() {
            return new CorpUserHomePageSettings(pageTemplate, dismissedAnnouncementUrns);
        }

    }
}
