package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Deprecated, use addTag or removeTag mutations instead
An update for a particular Tag entity
 */
public class TagUpdateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private String name;
    private String description;
    private OwnershipUpdate ownership;

    public TagUpdateInput() {
    }

    public TagUpdateInput(String urn, String name, String description, OwnershipUpdate ownership) {
        this.urn = urn;
        this.name = name;
        this.description = description;
        this.ownership = ownership;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public OwnershipUpdate getOwnership() {
        return ownership;
    }
    public void setOwnership(OwnershipUpdate ownership) {
        this.ownership = ownership;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        return joiner.toString();
    }

    public static TagUpdateInput.Builder builder() {
        return new TagUpdateInput.Builder();
    }

    public static class Builder {

        private String urn;
        private String name;
        private String description;
        private OwnershipUpdate ownership;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setOwnership(OwnershipUpdate ownership) {
            this.ownership = ownership;
            return this;
        }


        public TagUpdateInput build() {
            return new TagUpdateInput(urn, name, description, ownership);
        }

    }
}
