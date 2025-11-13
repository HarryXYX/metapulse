package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Glossary Terms attached to a particular Metadata Entity
 */
public class GlossaryTerms implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<GlossaryTermAssociation> terms;

    public GlossaryTerms() {
    }

    public GlossaryTerms(java.util.List<GlossaryTermAssociation> terms) {
        this.terms = terms;
    }

    /**
     * The set of glossary terms attached to the Metadata Entity
     */
    public java.util.List<GlossaryTermAssociation> getTerms() {
        return terms;
    }
    /**
     * The set of glossary terms attached to the Metadata Entity
     */
    public void setTerms(java.util.List<GlossaryTermAssociation> terms) {
        this.terms = terms;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (terms != null) {
            joiner.add("terms: " + terms);
        }
        return joiner.toString();
    }

    public static GlossaryTerms.Builder builder() {
        return new GlossaryTerms.Builder();
    }

    public static class Builder {

        private java.util.List<GlossaryTermAssociation> terms;

        public Builder() {
        }

        /**
         * The set of glossary terms attached to the Metadata Entity
         */
        public Builder setTerms(java.util.List<GlossaryTermAssociation> terms) {
            this.terms = terms;
            return this;
        }


        public GlossaryTerms build() {
            return new GlossaryTerms(terms);
        }

    }
}
