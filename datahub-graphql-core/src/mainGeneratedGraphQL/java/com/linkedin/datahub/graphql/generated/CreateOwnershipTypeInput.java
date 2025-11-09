package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class CreateOwnershipTypeInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String description;

    public CreateOwnershipTypeInput() {
    }

    public CreateOwnershipTypeInput(String name, String description) {
        this.name = name;
        this.description = description;
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

    public static CreateOwnershipTypeInput.Builder builder() {
        return new CreateOwnershipTypeInput.Builder();
    }

    public static class Builder {

        private String name;
        private String description;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public CreateOwnershipTypeInput build() {
            return new CreateOwnershipTypeInput(name, description);
        }

    }
}
