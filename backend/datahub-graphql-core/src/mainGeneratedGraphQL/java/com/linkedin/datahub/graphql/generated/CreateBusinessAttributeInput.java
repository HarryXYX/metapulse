package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for creating a BusinessAttribute.
 */
public class CreateBusinessAttributeInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @javax.annotation.Nonnull
    private String name;
    private String description;
    private SchemaFieldDataType type;

    public CreateBusinessAttributeInput() {
    }

    public CreateBusinessAttributeInput(String id, String name, String description, SchemaFieldDataType type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
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

    public static CreateBusinessAttributeInput.Builder builder() {
        return new CreateBusinessAttributeInput.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private SchemaFieldDataType type;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
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

        public Builder setType(SchemaFieldDataType type) {
            this.type = type;
            return this;
        }


        public CreateBusinessAttributeInput build() {
            return new CreateBusinessAttributeInput(id, name, description, type);
        }

    }
}
