package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for responding to a singular prompt in a form
 */
public class SubmitFormPromptInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String promptId;
    @javax.annotation.Nonnull
    private String formUrn;
    @javax.annotation.Nonnull
    private FormPromptType type;
    private String fieldPath;
    private StructuredPropertyInputParams structuredPropertyParams;

    public SubmitFormPromptInput() {
    }

    public SubmitFormPromptInput(String promptId, String formUrn, FormPromptType type, String fieldPath, StructuredPropertyInputParams structuredPropertyParams) {
        this.promptId = promptId;
        this.formUrn = formUrn;
        this.type = type;
        this.fieldPath = fieldPath;
        this.structuredPropertyParams = structuredPropertyParams;
    }

    public String getPromptId() {
        return promptId;
    }
    public void setPromptId(String promptId) {
        this.promptId = promptId;
    }

    public String getFormUrn() {
        return formUrn;
    }
    public void setFormUrn(String formUrn) {
        this.formUrn = formUrn;
    }

    public FormPromptType getType() {
        return type;
    }
    public void setType(FormPromptType type) {
        this.type = type;
    }

    public String getFieldPath() {
        return fieldPath;
    }
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    public StructuredPropertyInputParams getStructuredPropertyParams() {
        return structuredPropertyParams;
    }
    public void setStructuredPropertyParams(StructuredPropertyInputParams structuredPropertyParams) {
        this.structuredPropertyParams = structuredPropertyParams;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (promptId != null) {
            joiner.add("promptId: \"" + promptId + "\"");
        }
        if (formUrn != null) {
            joiner.add("formUrn: \"" + formUrn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (fieldPath != null) {
            joiner.add("fieldPath: \"" + fieldPath + "\"");
        }
        if (structuredPropertyParams != null) {
            joiner.add("structuredPropertyParams: " + structuredPropertyParams);
        }
        return joiner.toString();
    }

    public static SubmitFormPromptInput.Builder builder() {
        return new SubmitFormPromptInput.Builder();
    }

    public static class Builder {

        private String promptId;
        private String formUrn;
        private FormPromptType type;
        private String fieldPath;
        private StructuredPropertyInputParams structuredPropertyParams;

        public Builder() {
        }

        public Builder setPromptId(String promptId) {
            this.promptId = promptId;
            return this;
        }

        public Builder setFormUrn(String formUrn) {
            this.formUrn = formUrn;
            return this;
        }

        public Builder setType(FormPromptType type) {
            this.type = type;
            return this;
        }

        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        public Builder setStructuredPropertyParams(StructuredPropertyInputParams structuredPropertyParams) {
            this.structuredPropertyParams = structuredPropertyParams;
            return this;
        }


        public SubmitFormPromptInput build() {
            return new SubmitFormPromptInput(promptId, formUrn, type, fieldPath, structuredPropertyParams);
        }

    }
}
