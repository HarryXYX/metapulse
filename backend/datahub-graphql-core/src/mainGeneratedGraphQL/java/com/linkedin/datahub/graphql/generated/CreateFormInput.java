package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for batch removing a form from different entities
 */
public class CreateFormInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @javax.annotation.Nonnull
    private String name;
    private String description;
    private FormType type;
    private java.util.List<CreatePromptInput> prompts;
    private FormActorAssignmentInput actors;

    public CreateFormInput() {
    }

    public CreateFormInput(String id, String name, String description, FormType type, java.util.List<CreatePromptInput> prompts, FormActorAssignmentInput actors) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.prompts = prompts;
        this.actors = actors;
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

    public FormType getType() {
        return type;
    }
    public void setType(FormType type) {
        this.type = type;
    }

    public java.util.List<CreatePromptInput> getPrompts() {
        return prompts;
    }
    public void setPrompts(java.util.List<CreatePromptInput> prompts) {
        this.prompts = prompts;
    }

    public FormActorAssignmentInput getActors() {
        return actors;
    }
    public void setActors(FormActorAssignmentInput actors) {
        this.actors = actors;
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
        if (prompts != null) {
            joiner.add("prompts: " + prompts);
        }
        if (actors != null) {
            joiner.add("actors: " + actors);
        }
        return joiner.toString();
    }

    public static CreateFormInput.Builder builder() {
        return new CreateFormInput.Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private FormType type;
        private java.util.List<CreatePromptInput> prompts;
        private FormActorAssignmentInput actors;

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

        public Builder setType(FormType type) {
            this.type = type;
            return this;
        }

        public Builder setPrompts(java.util.List<CreatePromptInput> prompts) {
            this.prompts = prompts;
            return this;
        }

        public Builder setActors(FormActorAssignmentInput actors) {
            this.actors = actors;
            return this;
        }


        public CreateFormInput build() {
            return new CreateFormInput(id, name, description, type, prompts, actors);
        }

    }
}
