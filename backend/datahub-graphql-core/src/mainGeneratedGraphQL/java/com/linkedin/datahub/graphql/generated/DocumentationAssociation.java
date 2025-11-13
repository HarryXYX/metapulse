package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Object containing the documentation aspect for an entity
 */
public class DocumentationAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String documentation;
    private MetadataAttribution attribution;

    public DocumentationAssociation() {
    }

    public DocumentationAssociation(String documentation, MetadataAttribution attribution) {
        this.documentation = documentation;
        this.attribution = attribution;
    }

    /**
     * Structured properties on this entity
     */
    public String getDocumentation() {
        return documentation;
    }
    /**
     * Structured properties on this entity
     */
    public void setDocumentation(String documentation) {
        this.documentation = documentation;
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
        if (documentation != null) {
            joiner.add("documentation: \"" + documentation + "\"");
        }
        if (attribution != null) {
            joiner.add("attribution: " + attribution);
        }
        return joiner.toString();
    }

    public static DocumentationAssociation.Builder builder() {
        return new DocumentationAssociation.Builder();
    }

    public static class Builder {

        private String documentation;
        private MetadataAttribution attribution;

        public Builder() {
        }

        /**
         * Structured properties on this entity
         */
        public Builder setDocumentation(String documentation) {
            this.documentation = documentation;
            return this;
        }

        /**
         * Information about who, why, and how this metadata was applied
         */
        public Builder setAttribution(MetadataAttribution attribution) {
            this.attribution = attribution;
            return this;
        }


        public DocumentationAssociation build() {
            return new DocumentationAssociation(documentation, attribution);
        }

    }
}
