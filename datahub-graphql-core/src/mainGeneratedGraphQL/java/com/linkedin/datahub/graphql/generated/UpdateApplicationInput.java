package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input properties required for update a Application
 */
public class UpdateApplicationInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;

    public UpdateApplicationInput() {
    }

    public UpdateApplicationInput(String name, String description) {
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

    public static UpdateApplicationInput.Builder builder() {
        return new UpdateApplicationInput.Builder();
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


        public UpdateApplicationInput build() {
            return new UpdateApplicationInput(name, description);
        }

    }
}
