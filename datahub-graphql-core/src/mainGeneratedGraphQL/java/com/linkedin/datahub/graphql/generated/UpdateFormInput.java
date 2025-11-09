package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for updating a form
 */
public class UpdateFormInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    private String name;
    private String description;
    private FormType type;
    private java.util.List<CreatePromptInput> promptsToAdd;
    private java.util.List<String> promptsToRemove;
    private FormActorAssignmentUpdateInput actors;

    public UpdateFormInput() {
    }

    public UpdateFormInput(String urn, String name, String description, FormType type, java.util.List<CreatePromptInput> promptsToAdd, java.util.List<String> promptsToRemove, FormActorAssignmentUpdateInput actors) {
        this.urn = urn;
        this.name = name;
        this.description = description;
        this.type = type;
        this.promptsToAdd = promptsToAdd;
        this.promptsToRemove = promptsToRemove;
        this.actors = actors;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
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

    public FormType getType() {
        return type;
    }
    public void setType(FormType type) {
        this.type = type;
    }

    public java.util.List<CreatePromptInput> getPromptsToAdd() {
        return promptsToAdd;
    }
    public void setPromptsToAdd(java.util.List<CreatePromptInput> promptsToAdd) {
        this.promptsToAdd = promptsToAdd;
    }

    public java.util.List<String> getPromptsToRemove() {
        return promptsToRemove;
    }
    public void setPromptsToRemove(java.util.List<String> promptsToRemove) {
        this.promptsToRemove = promptsToRemove;
    }

    public FormActorAssignmentUpdateInput getActors() {
        return actors;
    }
    public void setActors(FormActorAssignmentUpdateInput actors) {
        this.actors = actors;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
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
        if (promptsToAdd != null) {
            joiner.add("promptsToAdd: " + promptsToAdd);
        }
        if (promptsToRemove != null) {
            joiner.add("promptsToRemove: " + promptsToRemove);
        }
        if (actors != null) {
            joiner.add("actors: " + actors);
        }
        return joiner.toString();
    }

    public static UpdateFormInput.Builder builder() {
        return new UpdateFormInput.Builder();
    }

    public static class Builder {

        private String urn;
        private String name;
        private String description;
        private FormType type;
        private java.util.List<CreatePromptInput> promptsToAdd;
        private java.util.List<String> promptsToRemove;
        private FormActorAssignmentUpdateInput actors;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
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

        public Builder setType(FormType type) {
            this.type = type;
            return this;
        }

        public Builder setPromptsToAdd(java.util.List<CreatePromptInput> promptsToAdd) {
            this.promptsToAdd = promptsToAdd;
            return this;
        }

        public Builder setPromptsToRemove(java.util.List<String> promptsToRemove) {
            this.promptsToRemove = promptsToRemove;
            return this;
        }

        public Builder setActors(FormActorAssignmentUpdateInput actors) {
            this.actors = actors;
            return this;
        }


        public UpdateFormInput build() {
            return new UpdateFormInput(urn, name, description, type, promptsToAdd, promptsToRemove, actors);
        }

    }
}
