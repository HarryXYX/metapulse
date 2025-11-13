package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An individual DataHub Access Privilege
 */
public class Privilege implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String type;
    private String displayName;
    private String description;

    public Privilege() {
    }

    public Privilege(String type, String displayName, String description) {
        this.type = type;
        this.displayName = displayName;
        this.description = description;
    }

    /**
     * Standardized privilege type, serving as a unique identifier for a privilege eg EDIT_ENTITY
     */
    public String getType() {
        return type;
    }
    /**
     * Standardized privilege type, serving as a unique identifier for a privilege eg EDIT_ENTITY
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * The name to appear when displaying the privilege, eg Edit Entity
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The name to appear when displaying the privilege, eg Edit Entity
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * A description of the privilege to display
     */
    public String getDescription() {
        return description;
    }
    /**
     * A description of the privilege to display
     */
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: \"" + type + "\"");
        }
        if (displayName != null) {
            joiner.add("displayName: \"" + displayName + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        return joiner.toString();
    }

    public static Privilege.Builder builder() {
        return new Privilege.Builder();
    }

    public static class Builder {

        private String type;
        private String displayName;
        private String description;

        public Builder() {
        }

        /**
         * Standardized privilege type, serving as a unique identifier for a privilege eg EDIT_ENTITY
         */
        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * The name to appear when displaying the privilege, eg Edit Entity
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A description of the privilege to display
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public Privilege build() {
            return new Privilege(type, displayName, description);
        }

    }
}
