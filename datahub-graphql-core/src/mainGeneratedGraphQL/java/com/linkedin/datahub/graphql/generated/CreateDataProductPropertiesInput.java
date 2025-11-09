package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input properties required for creating a DataProduct
 */
public class CreateDataProductPropertiesInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;

    public CreateDataProductPropertiesInput() {
    }

    public CreateDataProductPropertiesInput(String name, String description) {
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

    public static CreateDataProductPropertiesInput.Builder builder() {
        return new CreateDataProductPropertiesInput.Builder();
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


        public CreateDataProductPropertiesInput build() {
            return new CreateDataProductPropertiesInput(name, description);
        }

    }
}
