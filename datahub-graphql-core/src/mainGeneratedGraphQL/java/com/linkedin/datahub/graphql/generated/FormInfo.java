package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties about an individual Form
 */
public class FormInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    @javax.annotation.Nonnull
    private FormType type;
    @javax.annotation.Nonnull
    private java.util.List<FormPrompt> prompts;
    @javax.annotation.Nonnull
    private FormActorAssignment actors;

    public FormInfo() {
    }

    public FormInfo(String name, String description, FormType type, java.util.List<FormPrompt> prompts, FormActorAssignment actors) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.prompts = prompts;
        this.actors = actors;
    }

    /**
     * The name of this form
     */
    public String getName() {
        return name;
    }
    /**
     * The name of this form
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The description of this form
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of this form
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The type of this form
     */
    public FormType getType() {
        return type;
    }
    /**
     * The type of this form
     */
    public void setType(FormType type) {
        this.type = type;
    }

    /**
     * The prompt for this form
     */
    public java.util.List<FormPrompt> getPrompts() {
        return prompts;
    }
    /**
     * The prompt for this form
     */
    public void setPrompts(java.util.List<FormPrompt> prompts) {
        this.prompts = prompts;
    }

    /**
     * The actors that are assigned to complete the forms for the associated entities.
     */
    public FormActorAssignment getActors() {
        return actors;
    }
    /**
     * The actors that are assigned to complete the forms for the associated entities.
     */
    public void setActors(FormActorAssignment actors) {
        this.actors = actors;
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
        if (prompts != null) {
            joiner.add("prompts: " + prompts);
        }
        if (actors != null) {
            joiner.add("actors: " + actors);
        }
        return joiner.toString();
    }

    public static FormInfo.Builder builder() {
        return new FormInfo.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private FormType type;
        private java.util.List<FormPrompt> prompts;
        private FormActorAssignment actors;

        public Builder() {
        }

        /**
         * The name of this form
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * The description of this form
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The type of this form
         */
        public Builder setType(FormType type) {
            this.type = type;
            return this;
        }

        /**
         * The prompt for this form
         */
        public Builder setPrompts(java.util.List<FormPrompt> prompts) {
            this.prompts = prompts;
            return this;
        }

        /**
         * The actors that are assigned to complete the forms for the associated entities.
         */
        public Builder setActors(FormActorAssignment actors) {
            this.actors = actors;
            return this;
        }


        public FormInfo build() {
            return new FormInfo(name, description, type, prompts, actors);
        }

    }
}
