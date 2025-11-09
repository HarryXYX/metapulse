package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for creating form prompts
 */
public class CreatePromptInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @javax.annotation.Nonnull
    private String title;
    private String description;
    @javax.annotation.Nonnull
    private FormPromptType type;
    private StructuredPropertyParamsInput structuredPropertyParams;
    private Boolean required;

    public CreatePromptInput() {
    }

    public CreatePromptInput(String id, String title, String description, FormPromptType type, StructuredPropertyParamsInput structuredPropertyParams, Boolean required) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.type = type;
        this.structuredPropertyParams = structuredPropertyParams;
        this.required = required;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public FormPromptType getType() {
        return type;
    }
    public void setType(FormPromptType type) {
        this.type = type;
    }

    public StructuredPropertyParamsInput getStructuredPropertyParams() {
        return structuredPropertyParams;
    }
    public void setStructuredPropertyParams(StructuredPropertyParamsInput structuredPropertyParams) {
        this.structuredPropertyParams = structuredPropertyParams;
    }

    public Boolean getRequired() {
        return required;
    }
    public void setRequired(Boolean required) {
        this.required = required;
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
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (structuredPropertyParams != null) {
            joiner.add("structuredPropertyParams: " + structuredPropertyParams);
        }
        if (required != null) {
            joiner.add("required: " + required);
        }
        return joiner.toString();
    }

    public static CreatePromptInput.Builder builder() {
        return new CreatePromptInput.Builder();
    }

    public static class Builder {

        private String id;
        private String title;
        private String description;
        private FormPromptType type;
        private StructuredPropertyParamsInput structuredPropertyParams;
        private Boolean required;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setType(FormPromptType type) {
            this.type = type;
            return this;
        }

        public Builder setStructuredPropertyParams(StructuredPropertyParamsInput structuredPropertyParams) {
            this.structuredPropertyParams = structuredPropertyParams;
            return this;
        }

        public Builder setRequired(Boolean required) {
            this.required = required;
            return this;
        }


        public CreatePromptInput build() {
            return new CreatePromptInput(id, title, description, type, structuredPropertyParams, required);
        }

    }
}
