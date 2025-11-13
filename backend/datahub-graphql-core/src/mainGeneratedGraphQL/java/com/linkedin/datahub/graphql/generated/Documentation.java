package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Object containing the documentation aspect for an entity
 */
public class Documentation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<DocumentationAssociation> documentations;

    public Documentation() {
    }

    public Documentation(java.util.List<DocumentationAssociation> documentations) {
        this.documentations = documentations;
    }

    /**
     * Structured properties on this entity
     */
    public java.util.List<DocumentationAssociation> getDocumentations() {
        return documentations;
    }
    /**
     * Structured properties on this entity
     */
    public void setDocumentations(java.util.List<DocumentationAssociation> documentations) {
        this.documentations = documentations;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (documentations != null) {
            joiner.add("documentations: " + documentations);
        }
        return joiner.toString();
    }

    public static Documentation.Builder builder() {
        return new Documentation.Builder();
    }

    public static class Builder {

        private java.util.List<DocumentationAssociation> documentations;

        public Builder() {
        }

        /**
         * Structured properties on this entity
         */
        public Builder setDocumentations(java.util.List<DocumentationAssociation> documentations) {
            this.documentations = documentations;
            return this;
        }


        public Documentation build() {
            return new Documentation(documentations);
        }

    }
}
