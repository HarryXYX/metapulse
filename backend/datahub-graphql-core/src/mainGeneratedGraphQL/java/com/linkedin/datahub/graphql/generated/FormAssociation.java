package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class FormAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Form form;
    @javax.annotation.Nonnull
    private String associatedUrn;
    private java.util.List<FormPromptAssociation> incompletePrompts;
    private java.util.List<FormPromptAssociation> completedPrompts;

    public FormAssociation() {
    }

    public FormAssociation(Form form, String associatedUrn, java.util.List<FormPromptAssociation> incompletePrompts, java.util.List<FormPromptAssociation> completedPrompts) {
        this.form = form;
        this.associatedUrn = associatedUrn;
        this.incompletePrompts = incompletePrompts;
        this.completedPrompts = completedPrompts;
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
     * Reference back to the urn with the form on it for tracking purposes e.g. when sibling nodes are merged together
     */
    public String getAssociatedUrn() {
        return associatedUrn;
    }
    /**
     * Reference back to the urn with the form on it for tracking purposes e.g. when sibling nodes are merged together
     */
    public void setAssociatedUrn(String associatedUrn) {
        this.associatedUrn = associatedUrn;
    }

    /**
     * The prompt that still need to be completed for this form
     */
    public java.util.List<FormPromptAssociation> getIncompletePrompts() {
        return incompletePrompts;
    }
    /**
     * The prompt that still need to be completed for this form
     */
    public void setIncompletePrompts(java.util.List<FormPromptAssociation> incompletePrompts) {
        this.incompletePrompts = incompletePrompts;
    }

    /**
     * The prompt that are already completed for this form
     */
    public java.util.List<FormPromptAssociation> getCompletedPrompts() {
        return completedPrompts;
    }
    /**
     * The prompt that are already completed for this form
     */
    public void setCompletedPrompts(java.util.List<FormPromptAssociation> completedPrompts) {
        this.completedPrompts = completedPrompts;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (form != null) {
            joiner.add("form: " + form);
        }
        if (associatedUrn != null) {
            joiner.add("associatedUrn: \"" + associatedUrn + "\"");
        }
        if (incompletePrompts != null) {
            joiner.add("incompletePrompts: " + incompletePrompts);
        }
        if (completedPrompts != null) {
            joiner.add("completedPrompts: " + completedPrompts);
        }
        return joiner.toString();
    }

    public static FormAssociation.Builder builder() {
        return new FormAssociation.Builder();
    }

    public static class Builder {

        private Form form;
        private String associatedUrn;
        private java.util.List<FormPromptAssociation> incompletePrompts;
        private java.util.List<FormPromptAssociation> completedPrompts;

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
         * Reference back to the urn with the form on it for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }

        /**
         * The prompt that still need to be completed for this form
         */
        public Builder setIncompletePrompts(java.util.List<FormPromptAssociation> incompletePrompts) {
            this.incompletePrompts = incompletePrompts;
            return this;
        }

        /**
         * The prompt that are already completed for this form
         */
        public Builder setCompletedPrompts(java.util.List<FormPromptAssociation> completedPrompts) {
            this.completedPrompts = completedPrompts;
            return this;
        }


        public FormAssociation build() {
            return new FormAssociation(form, associatedUrn, incompletePrompts, completedPrompts);
        }

    }
}
