package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Update a particular entity's display properties
 */
public class DisplayPropertiesUpdateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String colorHex;
    private IconPropertiesInput icon;

    public DisplayPropertiesUpdateInput() {
    }

    public DisplayPropertiesUpdateInput(String colorHex, IconPropertiesInput icon) {
        this.colorHex = colorHex;
        this.icon = icon;
    }

    public String getColorHex() {
        return colorHex;
    }
    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }

    public IconPropertiesInput getIcon() {
        return icon;
    }
    public void setIcon(IconPropertiesInput icon) {
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

    public static DisplayPropertiesUpdateInput.Builder builder() {
        return new DisplayPropertiesUpdateInput.Builder();
    }

    public static class Builder {

        private String colorHex;
        private IconPropertiesInput icon;

        public Builder() {
        }

        public Builder setColorHex(String colorHex) {
            this.colorHex = colorHex;
            return this;
        }

        public Builder setIcon(IconPropertiesInput icon) {
            this.icon = icon;
            return this;
        }


        public DisplayPropertiesUpdateInput build() {
            return new DisplayPropertiesUpdateInput(colorHex, icon);
        }

    }
}
