package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A prompt shown to the user to collect metadata about an entity
 */
public class FormPrompt implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String id;
    @javax.annotation.Nonnull
    private String title;
    @javax.annotation.Nonnull
    private String formUrn;
    private String description;
    @javax.annotation.Nonnull
    private FormPromptType type;
    private boolean required;
    private StructuredPropertyParams structuredPropertyParams;

    public FormPrompt() {
    }

    public FormPrompt(String id, String title, String formUrn, String description, FormPromptType type, boolean required, StructuredPropertyParams structuredPropertyParams) {
        this.id = id;
        this.title = title;
        this.formUrn = formUrn;
        this.description = description;
        this.type = type;
        this.required = required;
        this.structuredPropertyParams = structuredPropertyParams;
    }

    /**
     * The ID of this prompt. This will be globally unique.
     */
    public String getId() {
        return id;
    }
    /**
     * The ID of this prompt. This will be globally unique.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The title of this prompt
     */
    public String getTitle() {
        return title;
    }
    /**
     * The title of this prompt
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * The urn of the parent form that this prompt is part of
     */
    public String getFormUrn() {
        return formUrn;
    }
    /**
     * The urn of the parent form that this prompt is part of
     */
    public void setFormUrn(String formUrn) {
        this.formUrn = formUrn;
    }

    /**
     * The description of this prompt
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of this prompt
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The description of this prompt
     */
    public FormPromptType getType() {
        return type;
    }
    /**
     * The description of this prompt
     */
    public void setType(FormPromptType type) {
        this.type = type;
    }

    /**
     * Whether the prompt is required for the form to be considered completed.
     */
    public boolean getRequired() {
        return required;
    }
    /**
     * Whether the prompt is required for the form to be considered completed.
     */
    public void setRequired(boolean required) {
        this.required = required;
    }

    /**
     * The params for this prompt if type is STRUCTURED_PROPERTY
     */
    public StructuredPropertyParams getStructuredPropertyParams() {
        return structuredPropertyParams;
    }
    /**
     * The params for this prompt if type is STRUCTURED_PROPERTY
     */
    public void setStructuredPropertyParams(StructuredPropertyParams structuredPropertyParams) {
        this.structuredPropertyParams = structuredPropertyParams;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (title != null) {
            joiner.add("title: \"" + title + "\"");
        }
        if (formUrn != null) {
            joiner.add("formUrn: \"" + formUrn + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        joiner.add("required: " + required);
        if (structuredPropertyParams != null) {
            joiner.add("structuredPropertyParams: " + structuredPropertyParams);
        }
        return joiner.toString();
    }

    public static FormPrompt.Builder builder() {
        return new FormPrompt.Builder();
    }

    public static class Builder {

        private String id;
        private String title;
        private String formUrn;
        private String description;
        private FormPromptType type;
        private boolean required;
        private StructuredPropertyParams structuredPropertyParams;

        public Builder() {
        }

        /**
         * The ID of this prompt. This will be globally unique.
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * The title of this prompt
         */
        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        /**
         * The urn of the parent form that this prompt is part of
         */
        public Builder setFormUrn(String formUrn) {
            this.formUrn = formUrn;
            return this;
        }

        /**
         * The description of this prompt
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The description of this prompt
         */
        public Builder setType(FormPromptType type) {
            this.type = type;
            return this;
        }

        /**
         * Whether the prompt is required for the form to be considered completed.
         */
        public Builder setRequired(boolean required) {
            this.required = required;
            return this;
        }

        /**
         * The params for this prompt if type is STRUCTURED_PROPERTY
         */
        public Builder setStructuredPropertyParams(StructuredPropertyParams structuredPropertyParams) {
            this.structuredPropertyParams = structuredPropertyParams;
            return this;
        }


        public FormPrompt build() {
            return new FormPrompt(id, title, formUrn, description, type, required, structuredPropertyParams);
        }

    }
}
