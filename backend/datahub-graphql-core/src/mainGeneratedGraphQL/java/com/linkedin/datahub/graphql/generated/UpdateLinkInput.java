package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when updating the association between a Metadata Entity and a Link
 */
public class UpdateLinkInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String currentUrl;
    @javax.annotation.Nonnull
    private String currentLabel;
    @javax.annotation.Nonnull
    private String linkUrl;
    @javax.annotation.Nonnull
    private String label;
    private LinkSettingsInput settings;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public UpdateLinkInput() {
    }

    public UpdateLinkInput(String currentUrl, String currentLabel, String linkUrl, String label, LinkSettingsInput settings, String resourceUrn) {
        this.currentUrl = currentUrl;
        this.currentLabel = currentLabel;
        this.linkUrl = linkUrl;
        this.label = label;
        this.settings = settings;
        this.resourceUrn = resourceUrn;
    }

    public String getCurrentUrl() {
        return currentUrl;
    }
    public void setCurrentUrl(String currentUrl) {
        this.currentUrl = currentUrl;
    }

    public String getCurrentLabel() {
        return currentLabel;
    }
    public void setCurrentLabel(String currentLabel) {
        this.currentLabel = currentLabel;
    }

    public String getLinkUrl() {
        return linkUrl;
    }
    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public LinkSettingsInput getSettings() {
        return settings;
    }
    public void setSettings(LinkSettingsInput settings) {
        this.settings = settings;
    }

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (currentUrl != null) {
            joiner.add("currentUrl: \"" + currentUrl + "\"");
        }
        if (currentLabel != null) {
            joiner.add("currentLabel: \"" + currentLabel + "\"");
        }
        if (linkUrl != null) {
            joiner.add("linkUrl: \"" + linkUrl + "\"");
        }
        if (label != null) {
            joiner.add("label: \"" + label + "\"");
        }
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        return joiner.toString();
    }

    public static UpdateLinkInput.Builder builder() {
        return new UpdateLinkInput.Builder();
    }

    public static class Builder {

        private String currentUrl;
        private String currentLabel;
        private String linkUrl;
        private String label;
        private LinkSettingsInput settings;
        private String resourceUrn;

        public Builder() {
        }

        public Builder setCurrentUrl(String currentUrl) {
            this.currentUrl = currentUrl;
            return this;
        }

        public Builder setCurrentLabel(String currentLabel) {
            this.currentLabel = currentLabel;
            return this;
        }

        public Builder setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        public Builder setSettings(LinkSettingsInput settings) {
            this.settings = settings;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }


        public UpdateLinkInput build() {
            return new UpdateLinkInput(currentUrl, currentLabel, linkUrl, label, settings, resourceUrn);
        }

    }
}
