package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to create a new Glossary Entity - a Node or a Term.
 */
public class CreateGlossaryEntityInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @javax.annotation.Nonnull
    private String name;
    private String description;
    private String parentNode;

    public CreateGlossaryEntityInput() {
    }

    public CreateGlossaryEntityInput(String id, String name, String description, String parentNode) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.parentNode = parentNode;
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

    public String getParentNode() {
        return parentNode;
    }
    public void setParentNode(String parentNode) {
        this.parentNode = parentNode;
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
        if (parentNode != null) {
            joiner.add("parentNode: \"" + parentNode + "\"");
        }
        return joiner.toString();
    }

    public static CreateGlossaryEntityInput.Builder builder() {
        return new CreateGlossaryEntityInput.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String parentNode;

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

        public Builder setParentNode(String parentNode) {
            this.parentNode = parentNode;
            return this;
        }


        public CreateGlossaryEntityInput build() {
            return new CreateGlossaryEntityInput(id, name, description, parentNode);
        }

    }
}
