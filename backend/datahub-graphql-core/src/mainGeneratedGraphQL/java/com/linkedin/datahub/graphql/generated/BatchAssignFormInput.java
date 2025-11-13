package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for batch assigning a form to different entities
 */
public class BatchAssignFormInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String formUrn;
    @javax.annotation.Nonnull
    private java.util.List<String> entityUrns;

    public BatchAssignFormInput() {
    }

    public BatchAssignFormInput(String formUrn, java.util.List<String> entityUrns) {
        this.formUrn = formUrn;
        this.entityUrns = entityUrns;
    }

    public String getFormUrn() {
        return formUrn;
    }
    public void setFormUrn(String formUrn) {
        this.formUrn = formUrn;
    }

    public java.util.List<String> getEntityUrns() {
        return entityUrns;
    }
    public void setEntityUrns(java.util.List<String> entityUrns) {
        this.entityUrns = entityUrns;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (formUrn != null) {
            joiner.add("formUrn: \"" + formUrn + "\"");
        }
        if (entityUrns != null) {
            joiner.add("entityUrns: " + entityUrns);
        }
        return joiner.toString();
    }

    public static BatchAssignFormInput.Builder builder() {
        return new BatchAssignFormInput.Builder();
    }

    public static class Builder {

        private String formUrn;
        private java.util.List<String> entityUrns;

        public Builder() {
        }

        public Builder setFormUrn(String formUrn) {
            this.formUrn = formUrn;
            return this;
        }

        public Builder setEntityUrns(java.util.List<String> entityUrns) {
            this.entityUrns = entityUrns;
            return this;
        }


        public BatchAssignFormInput build() {
            return new BatchAssignFormInput(formUrn, entityUrns);
        }

    }
}
