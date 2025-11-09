package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Product update information fetched from remote JSON source
 */
public class ProductUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private boolean enabled;
    @javax.annotation.Nonnull
    private String id;
    @javax.annotation.Nonnull
    private String title;
    private String image;
    private String description;
    @javax.annotation.Nonnull
    private String ctaText;
    @javax.annotation.Nonnull
    private String ctaLink;

    public ProductUpdate() {
    }

    public ProductUpdate(boolean enabled, String id, String title, String image, String description, String ctaText, String ctaLink) {
        this.enabled = enabled;
        this.id = id;
        this.title = title;
        this.image = image;
        this.description = description;
        this.ctaText = ctaText;
        this.ctaLink = ctaLink;
    }

    /**
     * Whether this update is enabled and should be shown
     */
    public boolean getEnabled() {
        return enabled;
    }
    /**
     * Whether this update is enabled and should be shown
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Unique identifier for this update (e.g., "v1.2.1")
Version changes trigger re-display for users who dismissed previous versions
     */
    public String getId() {
        return id;
    }
    /**
     * Unique identifier for this update (e.g., "v1.2.1")
Version changes trigger re-display for users who dismissed previous versions
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Title of the update notification
     */
    public String getTitle() {
        return title;
    }
    /**
     * Title of the update notification
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Optional URL to an image to display with the update
     */
    public String getImage() {
        return image;
    }
    /**
     * Optional URL to an image to display with the update
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * Optional description text for the update
     */
    public String getDescription() {
        return description;
    }
    /**
     * Optional description text for the update
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Call-to-action button text (e.g., "Read updates")
     */
    public String getCtaText() {
        return ctaText;
    }
    /**
     * Call-to-action button text (e.g., "Read updates")
     */
    public void setCtaText(String ctaText) {
        this.ctaText = ctaText;
    }

    /**
     * Call-to-action link URL, with telemetry client ID appended
     */
    public String getCtaLink() {
        return ctaLink;
    }
    /**
     * Call-to-action link URL, with telemetry client ID appended
     */
    public void setCtaLink(String ctaLink) {
        this.ctaLink = ctaLink;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        joiner.add("enabled: " + enabled);
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (image != null) {
            joiner.add("image: \"" + image + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (ctaText != null) {
            joiner.add("ctaText: \"" + ctaText + "\"");
        }
        if (ctaLink != null) {
            joiner.add("ctaLink: \"" + ctaLink + "\"");
        }
        return joiner.toString();
    }

    public static ProductUpdate.Builder builder() {
        return new ProductUpdate.Builder();
    }

    public static class Builder {

        private boolean enabled;
        private String id;
        private String title;
        private String image;
        private String description;
        private String ctaText;
        private String ctaLink;

        public Builder() {
        }

        /**
         * Whether this update is enabled and should be shown
         */
        public Builder setEnabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Unique identifier for this update (e.g., "v1.2.1")
Version changes trigger re-display for users who dismissed previous versions
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * Title of the update notification
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * Optional URL to an image to display with the update
         */
        public Builder setImage(String image) {
            this.image = image;
            return this;
        }

        /**
         * Optional description text for the update
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Call-to-action button text (e.g., "Read updates")
         */
        public Builder setCtaText(String ctaText) {
            this.ctaText = ctaText;
            return this;
        }

        /**
         * Call-to-action link URL, with telemetry client ID appended
         */
        public Builder setCtaLink(String ctaLink) {
            this.ctaLink = ctaLink;
            return this;
        }


        public ProductUpdate build() {
            return new ProductUpdate(enabled, id, title, image, description, ctaText, ctaLink);
        }

    }
}
