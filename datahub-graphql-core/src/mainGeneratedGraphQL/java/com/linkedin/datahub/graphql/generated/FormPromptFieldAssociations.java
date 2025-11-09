package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about the field-level prompt associations.
 */
public class FormPromptFieldAssociations implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<FieldFormPromptAssociation> completedFieldPrompts;
    private java.util.List<FieldFormPromptAssociation> incompleteFieldPrompts;

    public FormPromptFieldAssociations() {
    }

    public FormPromptFieldAssociations(java.util.List<FieldFormPromptAssociation> completedFieldPrompts, java.util.List<FieldFormPromptAssociation> incompleteFieldPrompts) {
        this.completedFieldPrompts = completedFieldPrompts;
        this.incompleteFieldPrompts = incompleteFieldPrompts;
    }

    /**
     * If this form prompt is for fields, this will contain a list of completed associations per field
     */
    public java.util.List<FieldFormPromptAssociation> getCompletedFieldPrompts() {
        return completedFieldPrompts;
    }
    /**
     * If this form prompt is for fields, this will contain a list of completed associations per field
     */
    public void setCompletedFieldPrompts(java.util.List<FieldFormPromptAssociation> completedFieldPrompts) {
        this.completedFieldPrompts = completedFieldPrompts;
    }

    /**
     * If this form prompt is for fields, this will contain a list of incomlete associations per field
     */
    public java.util.List<FieldFormPromptAssociation> getIncompleteFieldPrompts() {
        return incompleteFieldPrompts;
    }
    /**
     * If this form prompt is for fields, this will contain a list of incomlete associations per field
     */
    public void setIncompleteFieldPrompts(java.util.List<FieldFormPromptAssociation> incompleteFieldPrompts) {
        this.incompleteFieldPrompts = incompleteFieldPrompts;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (completedFieldPrompts != null) {
            joiner.add("completedFieldPrompts: " + completedFieldPrompts);
        }
        if (incompleteFieldPrompts != null) {
            joiner.add("incompleteFieldPrompts: " + incompleteFieldPrompts);
        }
        return joiner.toString();
    }

    public static FormPromptFieldAssociations.Builder builder() {
        return new FormPromptFieldAssociations.Builder();
    }

    public static class Builder {

        private java.util.List<FieldFormPromptAssociation> completedFieldPrompts;
        private java.util.List<FieldFormPromptAssociation> incompleteFieldPrompts;

        public Builder() {
        }

        /**
         * If this form prompt is for fields, this will contain a list of completed associations per field
         */
        public Builder setCompletedFieldPrompts(java.util.List<FieldFormPromptAssociation> completedFieldPrompts) {
            this.completedFieldPrompts = completedFieldPrompts;
            return this;
        }

        /**
         * If this form prompt is for fields, this will contain a list of incomlete associations per field
         */
        public Builder setIncompleteFieldPrompts(java.util.List<FieldFormPromptAssociation> incompleteFieldPrompts) {
            this.incompleteFieldPrompts = incompleteFieldPrompts;
            return this;
        }


        public FormPromptFieldAssociations build() {
            return new FormPromptFieldAssociations(completedFieldPrompts, incompleteFieldPrompts);
        }

    }
}
