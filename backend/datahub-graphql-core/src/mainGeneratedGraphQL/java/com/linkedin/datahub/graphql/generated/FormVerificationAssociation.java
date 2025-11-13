package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Verification object that has been applied to the entity via a completed form.
 */
public class FormVerificationAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Form form;
    private ResolvedAuditStamp lastModified;

    public FormVerificationAssociation() {
    }

    public FormVerificationAssociation(Form form, ResolvedAuditStamp lastModified) {
        this.form = form;
        this.lastModified = lastModified;
    }

    /**
     * The form related to the associated urn
     */
    public Form getForm() {
        return form;
    }
    /**
     * The form related to the associated urn
     */
    public void setForm(Form form) {
        this.form = form;
    }

    /**
     * When this verification was applied to this entity
     */
    public ResolvedAuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * When this verification was applied to this entity
     */
    public void setLastModified(ResolvedAuditStamp lastModified) {
        this.lastModified = lastModified;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (form != null) {
            joiner.add("form: " + form);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        return joiner.toString();
    }

    public static FormVerificationAssociation.Builder builder() {
        return new FormVerificationAssociation.Builder();
    }

    public static class Builder {

        private Form form;
        private ResolvedAuditStamp lastModified;

        public Builder() {
        }

        /**
         * The form related to the associated urn
         */
        public Builder setForm(Form form) {
            this.form = form;
            return this;
        }

        /**
         * When this verification was applied to this entity
         */
        public Builder setLastModified(ResolvedAuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }


        public FormVerificationAssociation build() {
            return new FormVerificationAssociation(form, lastModified);
        }

    }
}
