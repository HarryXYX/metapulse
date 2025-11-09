package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for Properties describing an icon associated with an entity
 */
public class IconPropertiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private IconLibrary iconLibrary;
    private String name;
    private String style;

    public IconPropertiesInput() {
    }

    public IconPropertiesInput(IconLibrary iconLibrary, String name, String style) {
        this.iconLibrary = iconLibrary;
        this.name = name;
        this.style = style;
    }

    public IconLibrary getIconLibrary() {
        return iconLibrary;
    }
    public void setIconLibrary(IconLibrary iconLibrary) {
        this.iconLibrary = iconLibrary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (iconLibrary != null) {
            joiner.add("iconLibrary: " + iconLibrary);
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (style != null) {
            joiner.add("style: \"" + style + "\"");
        }
        return joiner.toString();
    }

    public static IconPropertiesInput.Builder builder() {
        return new IconPropertiesInput.Builder();
    }

    public static class Builder {

        private IconLibrary iconLibrary;
        private String name;
        private String style;

        public Builder() {
        }

        public Builder setIconLibrary(IconLibrary iconLibrary) {
            this.iconLibrary = iconLibrary;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStyle(String style) {
            this.style = style;
            return this;
        }


        public IconPropertiesInput build() {
            return new IconPropertiesInput(iconLibrary, name, style);
        }

    }
}
