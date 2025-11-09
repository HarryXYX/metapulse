package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Additional properties about a ERModelRelationship
 */
public class ERModelRelationshipEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;
    private String name;

    public ERModelRelationshipEditableProperties() {
    }

    public ERModelRelationshipEditableProperties(String description, String name) {
        this.description = description;
        this.name = name;
    }

    /**
     * Documentation of the ERModelRelationship
     */
    public String getDescription() {
        return description;
    }
    /**
     * Documentation of the ERModelRelationship
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Display name of the ERModelRelationship
     */
    public String getName() {
        return name;
    }
    /**
     * Display name of the ERModelRelationship
     */
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        return joiner.toString();
    }

    public static ERModelRelationshipEditableProperties.Builder builder() {
        return new ERModelRelationshipEditableProperties.Builder();
    }

    public static class Builder {

        private String description;
        private String name;

        public Builder() {
        }

        /**
         * Documentation of the ERModelRelationship
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Display name of the ERModelRelationship
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public ERModelRelationshipEditableProperties build() {
            return new ERModelRelationshipEditableProperties(description, name);
        }

    }
}
