package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties describing an icon associated with an entity
 */
public class IconProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private IconLibrary iconLibrary;
    private String name;
    private String style;

    public IconProperties() {
    }

    public IconProperties(IconLibrary iconLibrary, String name, String style) {
        this.iconLibrary = iconLibrary;
        this.name = name;
        this.style = style;
    }

    /**
     * The source of the icon: e.g. Antd, Material, etc
     */
    public IconLibrary getIconLibrary() {
        return iconLibrary;
    }
    /**
     * The source of the icon: e.g. Antd, Material, etc
     */
    public void setIconLibrary(IconLibrary iconLibrary) {
        this.iconLibrary = iconLibrary;
    }

    /**
     * The name of the icon
     */
    public String getName() {
        return name;
    }
    /**
     * The name of the icon
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Any modifier for the icon, this will be library-specific, e.g. filled/outlined, etc
     */
    public String getStyle() {
        return style;
    }
    /**
     * Any modifier for the icon, this will be library-specific, e.g. filled/outlined, etc
     */
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

    public static IconProperties.Builder builder() {
        return new IconProperties.Builder();
    }

    public static class Builder {

        private IconLibrary iconLibrary;
        private String name;
        private String style;

        public Builder() {
        }

        /**
         * The source of the icon: e.g. Antd, Material, etc
         */
        public Builder setIconLibrary(IconLibrary iconLibrary) {
            this.iconLibrary = iconLibrary;
            return this;
        }

        /**
         * The name of the icon
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Any modifier for the icon, this will be library-specific, e.g. filled/outlined, etc
         */
        public Builder setStyle(String style) {
            this.style = style;
            return this;
        }


        public IconProperties build() {
            return new IconProperties(iconLibrary, name, style);
        }

    }
}
