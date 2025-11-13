package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input provided when adding Terms to an asset
 */
public class RelatedTermsInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private java.util.List<String> termUrns;
    @javax.annotation.Nonnull
    private TermRelationshipType relationshipType;

    public RelatedTermsInput() {
    }

    public RelatedTermsInput(String urn, java.util.List<String> termUrns, TermRelationshipType relationshipType) {
        this.urn = urn;
        this.termUrns = termUrns;
        this.relationshipType = relationshipType;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
    }

    public java.util.List<String> getTermUrns() {
        return termUrns;
    }
    public void setTermUrns(java.util.List<String> termUrns) {
        this.termUrns = termUrns;
    }

    public TermRelationshipType getRelationshipType() {
        return relationshipType;
    }
    public void setRelationshipType(TermRelationshipType relationshipType) {
        this.relationshipType = relationshipType;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (termUrns != null) {
            joiner.add("termUrns: " + termUrns);
        }
        if (relationshipType != null) {
            joiner.add("relationshipType: " + relationshipType);
        }
        return joiner.toString();
    }

    public static RelatedTermsInput.Builder builder() {
        return new RelatedTermsInput.Builder();
    }

    public static class Builder {

        private String urn;
        private java.util.List<String> termUrns;
        private TermRelationshipType relationshipType;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        public Builder setTermUrns(java.util.List<String> termUrns) {
            this.termUrns = termUrns;
            return this;
        }

        public Builder setRelationshipType(TermRelationshipType relationshipType) {
            this.relationshipType = relationshipType;
            return this;
        }


        public RelatedTermsInput build() {
            return new RelatedTermsInput(urn, termUrns, relationshipType);
        }

    }
}
