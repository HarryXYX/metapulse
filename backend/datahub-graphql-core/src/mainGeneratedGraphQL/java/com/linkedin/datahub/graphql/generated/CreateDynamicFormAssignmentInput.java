package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for batch assigning a form to different entities
 */
public class CreateDynamicFormAssignmentInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String formUrn;
    @javax.annotation.Nonnull
    private java.util.List<AndFilterInput> orFilters;

    public CreateDynamicFormAssignmentInput() {
    }

    public CreateDynamicFormAssignmentInput(String formUrn, java.util.List<AndFilterInput> orFilters) {
        this.formUrn = formUrn;
        this.orFilters = orFilters;
    }

    public String getFormUrn() {
        return formUrn;
    }
    public void setFormUrn(String formUrn) {
        this.formUrn = formUrn;
    }

    public java.util.List<AndFilterInput> getOrFilters() {
        return orFilters;
    }
    public void setOrFilters(java.util.List<AndFilterInput> orFilters) {
        this.orFilters = orFilters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (formUrn != null) {
            joiner.add("formUrn: \"" + formUrn + "\"");
        }
        if (orFilters != null) {
            joiner.add("orFilters: " + orFilters);
        }
        return joiner.toString();
    }

    public static CreateDynamicFormAssignmentInput.Builder builder() {
        return new CreateDynamicFormAssignmentInput.Builder();
    }

    public static class Builder {

        private String formUrn;
        private java.util.List<AndFilterInput> orFilters;

        public Builder() {
        }

        public Builder setFormUrn(String formUrn) {
            this.formUrn = formUrn;
            return this;
        }

        public Builder setOrFilters(java.util.List<AndFilterInput> orFilters) {
            this.orFilters = orFilters;
            return this;
        }


        public CreateDynamicFormAssignmentInput build() {
            return new CreateDynamicFormAssignmentInput(formUrn, orFilters);
        }

    }
}
