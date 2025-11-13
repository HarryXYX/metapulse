package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * An edge between a Metadata Entity and a Tag Modeled as a struct to permit
additional attributes
TODO Consider whether this query should be serviced by the relationships field
 */
public class TagAssociation implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private Tag tag;
    @javax.annotation.Nonnull
    private String associatedUrn;
    private String context;
    private MetadataAttribution attribution;

    public TagAssociation() {
    }

    public TagAssociation(Tag tag, String associatedUrn, String context, MetadataAttribution attribution) {
        this.tag = tag;
        this.associatedUrn = associatedUrn;
        this.context = context;
        this.attribution = attribution;
    }

    /**
     * The tag itself
     */
    public Tag getTag() {
        return tag;
    }
    /**
     * The tag itself
     */
    public void setTag(Tag tag) {
        this.tag = tag;
    }

    /**
     * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public String getAssociatedUrn() {
        return associatedUrn;
    }
    /**
     * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
     */
    public void setAssociatedUrn(String associatedUrn) {
        this.associatedUrn = associatedUrn;
    }

    /**
     * The context of how/why this tag is associated
     */
    public String getContext() {
        return context;
    }
    /**
     * The context of how/why this tag is associated
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
        if (tag != null) {
            joiner.add("tag: " + tag);
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

    public static TagAssociation.Builder builder() {
        return new TagAssociation.Builder();
    }

    public static class Builder {

        private Tag tag;
        private String associatedUrn;
        private String context;
        private MetadataAttribution attribution;

        public Builder() {
        }

        /**
         * The tag itself
         */
        public Builder setTag(Tag tag) {
            this.tag = tag;
            return this;
        }

        /**
         * Reference back to the tagged urn for tracking purposes e.g. when sibling nodes are merged together
         */
        public Builder setAssociatedUrn(String associatedUrn) {
            this.associatedUrn = associatedUrn;
            return this;
        }

        /**
         * The context of how/why this tag is associated
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


        public TagAssociation build() {
            return new TagAssociation(tag, associatedUrn, context, attribution);
        }

    }
}
