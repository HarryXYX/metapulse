package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties related to how the entity is displayed in the Datahub UI
 */
public class DisplayProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String colorHex;
    private IconProperties icon;

    public DisplayProperties() {
    }

    public DisplayProperties(String colorHex, IconProperties icon) {
        this.colorHex = colorHex;
        this.icon = icon;
    }

    /**
     * Color associated with the entity in Hex. For example #FFFFFF
     */
    public String getColorHex() {
        return colorHex;
    }
    /**
     * Color associated with the entity in Hex. For example #FFFFFF
     */
    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }

    /**
     * The icon associated with the entity
     */
    public IconProperties getIcon() {
        return icon;
    }
    /**
     * The icon associated with the entity
     */
    public void setIcon(IconProperties icon) {
        this.icon = icon;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (colorHex != null) {
            joiner.add("colorHex: \"" + colorHex + "\"");
        }
        if (icon != null) {
            joiner.add("icon: " + icon);
        }
        return joiner.toString();
    }

    public static DisplayProperties.Builder builder() {
        return new DisplayProperties.Builder();
    }

    public static class Builder {

        private String colorHex;
        private IconProperties icon;

        public Builder() {
        }

        /**
         * Color associated with the entity in Hex. For example #FFFFFF
         */
        public Builder setColorHex(String colorHex) {
            this.colorHex = colorHex;
            return this;
        }

        /**
         * The icon associated with the entity
         */
        public Builder setIcon(IconProperties icon) {
            this.icon = icon;
            return this;
        }


        public DisplayProperties build() {
            return new DisplayProperties(colorHex, icon);
        }

    }
}
