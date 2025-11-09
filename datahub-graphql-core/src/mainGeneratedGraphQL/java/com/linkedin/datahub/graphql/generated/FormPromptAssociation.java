package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A form that helps with filling out metadata on an entity
 */
public class FormPromptAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String id;
    @javax.annotation.Nonnull
    private ResolvedAuditStamp lastModified;
    private FormPromptFieldAssociations fieldAssociations;

    public FormPromptAssociation() {
    }

    public FormPromptAssociation(String id, ResolvedAuditStamp lastModified, FormPromptFieldAssociations fieldAssociations) {
        this.id = id;
        this.lastModified = lastModified;
        this.fieldAssociations = fieldAssociations;
    }

    /**
     * The unique id of the form prompt
     */
    public String getId() {
        return id;
    }
    /**
     * The unique id of the form prompt
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * When and by whom this form prompt has last been modified
     */
    public ResolvedAuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * When and by whom this form prompt has last been modified
     */
    public void setLastModified(ResolvedAuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Optional information about the field-level prompt associations.
     */
    public FormPromptFieldAssociations getFieldAssociations() {
        return fieldAssociations;
    }
    /**
     * Optional information about the field-level prompt associations.
     */
    public void setFieldAssociations(FormPromptFieldAssociations fieldAssociations) {
        this.fieldAssociations = fieldAssociations;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        if (fieldAssociations != null) {
            joiner.add("fieldAssociations: " + fieldAssociations);
        }
        return joiner.toString();
    }

    public static FormPromptAssociation.Builder builder() {
        return new FormPromptAssociation.Builder();
    }

    public static class Builder {

        private String id;
        private ResolvedAuditStamp lastModified;
        private FormPromptFieldAssociations fieldAssociations;

        public Builder() {
        }

        /**
         * The unique id of the form prompt
         */
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        /**
         * When and by whom this form prompt has last been modified
         */
        public Builder setLastModified(ResolvedAuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * Optional information about the field-level prompt associations.
         */
        public Builder setFieldAssociations(FormPromptFieldAssociations fieldAssociations) {
            this.fieldAssociations = fieldAssociations;
            return this;
        }


        public FormPromptAssociation build() {
            return new FormPromptAssociation(id, lastModified, fieldAssociations);
        }

    }
}
