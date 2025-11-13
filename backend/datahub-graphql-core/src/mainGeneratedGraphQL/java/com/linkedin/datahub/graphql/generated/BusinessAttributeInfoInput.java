package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class BusinessAttributeInfoInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private SchemaFieldDataType type;

    public BusinessAttributeInfoInput() {
    }

    public BusinessAttributeInfoInput(String name, String description, SchemaFieldDataType type) {
        this.name = name;
        this.description = description;
        this.type = type;
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

    public SchemaFieldDataType getType() {
        return type;
    }
    public void setType(SchemaFieldDataType type) {
        this.type = type;
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
        if (type != null) {
            joiner.add("type: " + type);
        }
        return joiner.toString();
    }

    public static BusinessAttributeInfoInput.Builder builder() {
        return new BusinessAttributeInfoInput.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private SchemaFieldDataType type;

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

        public Builder setType(SchemaFieldDataType type) {
            this.type = type;
            return this;
        }


        public BusinessAttributeInfoInput build() {
            return new BusinessAttributeInfoInput(name, description, type);
        }

    }
}
