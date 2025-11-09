package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when removing the association between a Metadata Entity and a Link
 */
public class RemoveLinkInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String linkUrl;
    private String label;
    @javax.annotation.Nonnull
    private String resourceUrn;

    public RemoveLinkInput() {
    }

    public RemoveLinkInput(String linkUrl, String label, String resourceUrn) {
        this.linkUrl = linkUrl;
        this.label = label;
        this.resourceUrn = resourceUrn;
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
        return joiner.toString();
    }

    public static RemoveLinkInput.Builder builder() {
        return new RemoveLinkInput.Builder();
    }

    public static class Builder {

        private String linkUrl;
        private String label;
        private String resourceUrn;

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


        public RemoveLinkInput build() {
            return new RemoveLinkInput(linkUrl, label, resourceUrn);
        }

    }
}
