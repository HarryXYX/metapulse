package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when updating a DataHub View
 */
public class UpdateViewInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private DataHubViewDefinitionInput definition;

    public UpdateViewInput() {
    }

    public UpdateViewInput(String name, String description, DataHubViewDefinitionInput definition) {
        this.name = name;
        this.description = description;
        this.definition = definition;
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

    public DataHubViewDefinitionInput getDefinition() {
        return definition;
    }
    public void setDefinition(DataHubViewDefinitionInput definition) {
        this.definition = definition;
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
        if (definition != null) {
            joiner.add("definition: " + definition);
        }
        return joiner.toString();
    }

    public static UpdateViewInput.Builder builder() {
        return new UpdateViewInput.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private DataHubViewDefinitionInput definition;

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

        public Builder setDefinition(DataHubViewDefinitionInput definition) {
            this.definition = definition;
            return this;
        }


        public UpdateViewInput build() {
            return new UpdateViewInput(name, description, definition);
        }

    }
}
