package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties for a DataHub Tag
 */
public class TagProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String colorHex;

    public TagProperties() {
    }

    public TagProperties(String name, String description, String colorHex) {
        this.name = name;
        this.description = description;
        this.colorHex = colorHex;
    }

    /**
     * A display name for the Tag
     */
    public String getName() {
        return name;
    }
    /**
     * A display name for the Tag
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A description of the Tag
     */
    public String getDescription() {
        return description;
    }
    /**
     * A description of the Tag
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * An optional RGB hex code for a Tag color, e.g. #FFFFFF
     */
    public String getColorHex() {
        return colorHex;
    }
    /**
     * An optional RGB hex code for a Tag color, e.g. #FFFFFF
     */
    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (colorHex != null) {
            joiner.add("colorHex: \"" + colorHex + "\"");
        }
        return joiner.toString();
    }

    public static TagProperties.Builder builder() {
        return new TagProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String colorHex;

        public Builder() {
        }

        /**
         * A display name for the Tag
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * A description of the Tag
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * An optional RGB hex code for a Tag color, e.g. #FFFFFF
         */
        public Builder setColorHex(String colorHex) {
            this.colorHex = colorHex;
            return this;
        }


        public TagProperties build() {
            return new TagProperties(name, description, colorHex);
        }

    }
}
