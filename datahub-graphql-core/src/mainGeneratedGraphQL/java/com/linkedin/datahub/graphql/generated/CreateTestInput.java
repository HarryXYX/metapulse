package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class CreateTestInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @javax.annotation.Nonnull
    private String name;
    @javax.annotation.Nonnull
    private String category;
    private String description;
    @javax.annotation.Nonnull
    private TestDefinitionInput definition;

    public CreateTestInput() {
    }

    public CreateTestInput(String id, String name, String category, String description, TestDefinitionInput definition) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description;
        this.definition = definition;
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

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public TestDefinitionInput getDefinition() {
        return definition;
    }
    public void setDefinition(TestDefinitionInput definition) {
        this.definition = definition;
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
        if (category != null) {
            joiner.add("category: \"" + category + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (definition != null) {
            joiner.add("definition: " + definition);
        }
        return joiner.toString();
    }

    public static CreateTestInput.Builder builder() {
        return new CreateTestInput.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String category;
        private String description;
        private TestDefinitionInput definition;

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

        public Builder setCategory(String category) {
            this.category = category;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setDefinition(TestDefinitionInput definition) {
            this.definition = definition;
            return this;
        }


        public CreateTestInput build() {
            return new CreateTestInput(id, name, category, description, definition);
        }

    }
}
