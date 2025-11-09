package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when adding the association between a Metadata Entity and a Link
 */
public class AddLinkInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String linkUrl;
    @javax.annotation.Nonnull
    private String label;
    @javax.annotation.Nonnull
    private String resourceUrn;
    private LinkSettingsInput settings;

    public AddLinkInput() {
    }

    public AddLinkInput(String linkUrl, String label, String resourceUrn, LinkSettingsInput settings) {
        this.linkUrl = linkUrl;
        this.label = label;
        this.resourceUrn = resourceUrn;
        this.settings = settings;
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

    public String getResourceUrn() {
        return resourceUrn;
    }
    public void setResourceUrn(String resourceUrn) {
        this.resourceUrn = resourceUrn;
    }

    public LinkSettingsInput getSettings() {
        return settings;
    }
    public void setSettings(LinkSettingsInput settings) {
        this.settings = settings;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (linkUrl != null) {
            joiner.add("linkUrl: \"" + linkUrl + "\"");
        }
        if (label != null) {
            joiner.add("label: \"" + label + "\"");
        }
        if (resourceUrn != null) {
            joiner.add("resourceUrn: \"" + resourceUrn + "\"");
        }
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        return joiner.toString();
    }

    public static AddLinkInput.Builder builder() {
        return new AddLinkInput.Builder();
    }

    public static class Builder {

        private String linkUrl;
        private String label;
        private String resourceUrn;
        private LinkSettingsInput settings;

        public Builder() {
        }

        public Builder setLinkUrl(String linkUrl) {
            this.linkUrl = linkUrl;
            return this;
        }

        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        public Builder setResourceUrn(String resourceUrn) {
            this.resourceUrn = resourceUrn;
            return this;
        }

        public Builder setSettings(LinkSettingsInput settings) {
            this.settings = settings;
            return this;
        }


        public AddLinkInput build() {
            return new AddLinkInput(linkUrl, label, resourceUrn, settings);
        }

    }
}
