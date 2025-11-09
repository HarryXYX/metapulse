package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for verifying forms on entities
 */
public class VerifyFormInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String formUrn;
    @javax.annotation.Nonnull
    private String entityUrn;

    public VerifyFormInput() {
    }

    public VerifyFormInput(String formUrn, String entityUrn) {
        this.formUrn = formUrn;
        this.entityUrn = entityUrn;
    }

    public String getFormUrn() {
        return formUrn;
    }
    public void setFormUrn(String formUrn) {
        this.formUrn = formUrn;
    }

    public String getEntityUrn() {
        return entityUrn;
    }
    public void setEntityUrn(String entityUrn) {
        this.entityUrn = entityUrn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (formUrn != null) {
            joiner.add("formUrn: \"" + formUrn + "\"");
        }
        if (entityUrn != null) {
            joiner.add("entityUrn: \"" + entityUrn + "\"");
        }
        return joiner.toString();
    }

    public static VerifyFormInput.Builder builder() {
        return new VerifyFormInput.Builder();
    }

    public static class Builder {

        private String formUrn;
        private String entityUrn;

        public Builder() {
        }

        public Builder setFormUrn(String formUrn) {
            this.formUrn = formUrn;
            return this;
        }

        public Builder setEntityUrn(String entityUrn) {
            this.entityUrn = entityUrn;
            return this;
        }


        public VerifyFormInput build() {
            return new VerifyFormInput(formUrn, entityUrn);
        }

    }
}
