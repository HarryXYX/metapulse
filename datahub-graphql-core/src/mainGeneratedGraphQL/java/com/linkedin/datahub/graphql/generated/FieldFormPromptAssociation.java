package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An association for field-level form prompts
 */
public class FieldFormPromptAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String fieldPath;
    @javax.annotation.Nonnull
    private ResolvedAuditStamp lastModified;

    public FieldFormPromptAssociation() {
    }

    public FieldFormPromptAssociation(String fieldPath, ResolvedAuditStamp lastModified) {
        this.fieldPath = fieldPath;
        this.lastModified = lastModified;
    }

    /**
     * The schema field path
     */
    public String getFieldPath() {
        return fieldPath;
    }
    /**
     * The schema field path
     */
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * When and by whom this form field-level prompt has last been modified
     */
    public ResolvedAuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * When and by whom this form field-level prompt has last been modified
     */
    public void setLastModified(ResolvedAuditStamp lastModified) {
        this.lastModified = lastModified;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fieldPath != null) {
            joiner.add("fieldPath: \"" + fieldPath + "\"");
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        return joiner.toString();
    }

    public static FieldFormPromptAssociation.Builder builder() {
        return new FieldFormPromptAssociation.Builder();
    }

    public static class Builder {

        private String fieldPath;
        private ResolvedAuditStamp lastModified;

        public Builder() {
        }

        /**
         * The schema field path
         */
        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * When and by whom this form field-level prompt has last been modified
         */
        public Builder setLastModified(ResolvedAuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }


        public FieldFormPromptAssociation build() {
            return new FieldFormPromptAssociation(fieldPath, lastModified);
        }

    }
}
