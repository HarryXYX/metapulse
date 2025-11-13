package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to update Business Attribute
 */
public class UpdateBusinessAttributeInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private SchemaFieldDataType type;

    public UpdateBusinessAttributeInput() {
    }

    public UpdateBusinessAttributeInput(String name, String description, SchemaFieldDataType type) {
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

    public static UpdateBusinessAttributeInput.Builder builder() {
        return new UpdateBusinessAttributeInput.Builder();
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


        public UpdateBusinessAttributeInput build() {
            return new UpdateBusinessAttributeInput(name, description, type);
        }

    }
}
