package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional read write Tag properties
Deprecated! Replaced by TagProperties.
 */
public class EditableTagProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;

    public EditableTagProperties() {
    }

    public EditableTagProperties(String name, String description) {
        this.name = name;
        this.description = description;
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


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        return joiner.toString();
    }

    public static EditableTagProperties.Builder builder() {
        return new EditableTagProperties.Builder();
    }

    public static class Builder {

        private String name;
        private String description;

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


        public EditableTagProperties build() {
            return new EditableTagProperties(name, description);
        }

    }
}
