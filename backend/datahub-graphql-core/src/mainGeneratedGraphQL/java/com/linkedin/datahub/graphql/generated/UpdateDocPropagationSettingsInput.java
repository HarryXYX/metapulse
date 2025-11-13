package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to update doc propagation settings.
 */
public class UpdateDocPropagationSettingsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Boolean docColumnPropagation;

    public UpdateDocPropagationSettingsInput() {
    }

    public UpdateDocPropagationSettingsInput(Boolean docColumnPropagation) {
        this.docColumnPropagation = docColumnPropagation;
    }

    public Boolean getDocColumnPropagation() {
        return docColumnPropagation;
    }
    public void setDocColumnPropagation(Boolean docColumnPropagation) {
        this.docColumnPropagation = docColumnPropagation;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (docColumnPropagation != null) {
            joiner.add("docColumnPropagation: " + docColumnPropagation);
        }
        return joiner.toString();
    }

    public static UpdateDocPropagationSettingsInput.Builder builder() {
        return new UpdateDocPropagationSettingsInput.Builder();
    }

    public static class Builder {

        private Boolean docColumnPropagation;

        public Builder() {
        }

        public Builder setDocColumnPropagation(Boolean docColumnPropagation) {
            this.docColumnPropagation = docColumnPropagation;
            return this;
        }


        public UpdateDocPropagationSettingsInput build() {
            return new UpdateDocPropagationSettingsInput(docColumnPropagation);
        }

    }
}
