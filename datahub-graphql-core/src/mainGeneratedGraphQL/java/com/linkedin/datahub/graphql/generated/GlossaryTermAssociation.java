package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An edge between a Metadata Entity and a Glossary Term Modeled as a struct to permit
additional attributes
TODO Consider whether this query should be serviced by the relationships field
 */
public class GlossaryTermAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private GlossaryTerm term;
    private CorpUser actor;
    @javax.annotation.Nonnull
    private String associatedUrn;
    private String context;
    private MetadataAttribution attribution;

    public GlossaryTermAssociation() {
    }

    public GlossaryTermAssociation(GlossaryTerm term, CorpUser actor, String associatedUrn, String context, MetadataAttribution attribution) {
        this.term = term;
        this.actor = actor;
        this.associatedUrn = associatedUrn;
        this.context = context;
        this.attribution = attribution;
    }

    /**
     * The glossary term itself
     */
    public GlossaryTerm getTerm() {
        return term;
    }
    /**
     * The glossary term itself
     */
    public void setTerm(GlossaryTerm term) {
        this.term = term;
    }

    /**
     * The actor who is responsible for the term being added"
     */
    public CorpUser getActor() {
        return actor;
    }
    /**
     * The actor who is responsible for the term being added"
     */
    public void setActor(CorpUser actor) {
        this.actor = actor;
    }

    /**
     * Reference back to the associated urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public String getAssociatedUrn() {
        return associatedUrn;
    }
    /**
     * Reference back to the associated urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public void setAssociatedUrn(String associatedUrn) {
        this.associatedUrn = associatedUrn;
    }

    /**
     * The context of how/why this term is associated
     */
    public String getContext() {
        return context;
    }
    /**
     * The context of how/why this term is associated
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * Information about who, why, and how this metadata was applied
     */
    public MetadataAttribution getAttribution() {
        return attribution;
    }
    /**
     * Information about who, why, and how this metadata was applied
     */
    public void setAttribution(MetadataAttribution attribution) {
        this.attribution = attribution;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (term != null) {
            joiner.add("term: " + term);
        }
        if (actor != null) {
            joiner.add("actor: " + actor);
        }
        if (associatedUrn != null) {
            joiner.add("associatedUrn: \"" + associatedUrn + "\"");
        }
        if (context != null) {
            joiner.add("context: \"" + context + "\"");
        }
        if (attribution != null) {
            joiner.add("attribution: " + attribution);
        }
        return joiner.toString();
    }

    public static GlossaryTermAssociation.Builder builder() {
        return new GlossaryTermAssociation.Builder();
    }

    public static class Builder {

        private GlossaryTerm term;
        private CorpUser actor;
        private String associatedUrn;
        private String context;
        private MetadataAttribution attribution;

        public Builder() {
        }

        /**
         * The glossary term itself
         */
        public Builder setTerm(GlossaryTerm term) {
            this.term = term;
            return this;
        }

        /**
         * The actor who is responsible for the term being added"
         */
        public Builder setActor(CorpUser actor) {
            this.actor = actor;
            return this;
        }

        /**
         * Reference back to the associated urn for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }

        /**
         * The context of how/why this term is associated
         */
        public Builder setContext(String context) {
            this.context = context;
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         */
        public Builder setAttribution(MetadataAttribution attribution) {
            this.attribution = attribution;
            return this;
        }


        public GlossaryTermAssociation build() {
            return new GlossaryTermAssociation(term, actor, associatedUrn, context, attribution);
        }

    }
}
