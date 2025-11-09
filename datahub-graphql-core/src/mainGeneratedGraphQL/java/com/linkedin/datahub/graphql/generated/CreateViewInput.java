package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when creating a DataHub View
 */
public class CreateViewInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private DataHubViewType viewType;
    @javax.annotation.Nonnull
    private String name;
    private String description;
    @javax.annotation.Nonnull
    private DataHubViewDefinitionInput definition;

    public CreateViewInput() {
    }

    public CreateViewInput(DataHubViewType viewType, String name, String description, DataHubViewDefinitionInput definition) {
        this.viewType = viewType;
        this.name = name;
        this.description = description;
        this.definition = definition;
    }

    public DataHubViewType getViewType() {
        return viewType;
    }
    public void setViewType(DataHubViewType viewType) {
        this.viewType = viewType;
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
        if (viewType != null) {
            joiner.add("viewType: " + viewType);
        }
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

    public static CreateViewInput.Builder builder() {
        return new CreateViewInput.Builder();
    }

    public static class Builder {

        private DataHubViewType viewType;
        private String name;
        private String description;
        private DataHubViewDefinitionInput definition;

        public Builder() {
        }

        public Builder setViewType(DataHubViewType viewType) {
            this.viewType = viewType;
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

        public Builder setDefinition(DataHubViewDefinitionInput definition) {
            this.definition = definition;
            return this;
        }


        public CreateViewInput build() {
            return new CreateViewInput(viewType, name, description, definition);
        }

    }
}
