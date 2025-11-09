package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Requirements forms that are assigned to an entity.
 */
public class Forms implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<FormAssociation> incompleteForms;
    @javax.annotation.Nonnull
    private java.util.List<FormAssociation> completedForms;
    @javax.annotation.Nonnull
    private java.util.List<FormVerificationAssociation> verifications;

    public Forms() {
    }

    public Forms(java.util.List<FormAssociation> incompleteForms, java.util.List<FormAssociation> completedForms, java.util.List<FormVerificationAssociation> verifications) {
        this.incompleteForms = incompleteForms;
        this.completedForms = completedForms;
        this.verifications = verifications;
    }

    /**
     * Forms that are still incomplete.
     */
    public java.util.List<FormAssociation> getIncompleteForms() {
        return incompleteForms;
    }
    /**
     * Forms that are still incomplete.
     */
    public void setIncompleteForms(java.util.List<FormAssociation> incompleteForms) {
        this.incompleteForms = incompleteForms;
    }

    /**
     * Forms that have been completed.
     */
    public java.util.List<FormAssociation> getCompletedForms() {
        return completedForms;
    }
    /**
     * Forms that have been completed.
     */
    public void setCompletedForms(java.util.List<FormAssociation> completedForms) {
        this.completedForms = completedForms;
    }

    /**
     * Verifications that have been applied to the entity via completed forms.
     */
    public java.util.List<FormVerificationAssociation> getVerifications() {
        return verifications;
    }
    /**
     * Verifications that have been applied to the entity via completed forms.
     */
    public void setVerifications(java.util.List<FormVerificationAssociation> verifications) {
        this.verifications = verifications;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (incompleteForms != null) {
            joiner.add("incompleteForms: " + incompleteForms);
        }
        if (completedForms != null) {
            joiner.add("completedForms: " + completedForms);
        }
        if (verifications != null) {
            joiner.add("verifications: " + verifications);
        }
        return joiner.toString();
    }

    public static Forms.Builder builder() {
        return new Forms.Builder();
    }

    public static class Builder {

        private java.util.List<FormAssociation> incompleteForms;
        private java.util.List<FormAssociation> completedForms;
        private java.util.List<FormVerificationAssociation> verifications;

        public Builder() {
        }

        /**
         * Forms that are still incomplete.
         */
        public Builder setIncompleteForms(java.util.List<FormAssociation> incompleteForms) {
            this.incompleteForms = incompleteForms;
            return this;
        }

        /**
         * Forms that have been completed.
         */
        public Builder setCompletedForms(java.util.List<FormAssociation> completedForms) {
            this.completedForms = completedForms;
            return this;
        }

        /**
         * Verifications that have been applied to the entity via completed forms.
         */
        public Builder setVerifications(java.util.List<FormVerificationAssociation> verifications) {
            this.verifications = verifications;
            return this;
        }


        public Forms build() {
            return new Forms(incompleteForms, completedForms, verifications);
        }

    }
}
