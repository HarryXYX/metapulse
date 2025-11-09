package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Tags attached to a particular Metadata Entity
 */
public class GlobalTags implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<TagAssociation> tags;

    public GlobalTags() {
    }

    public GlobalTags(java.util.List<TagAssociation> tags) {
        this.tags = tags;
    }

    /**
     * The set of tags attached to the Metadata Entity
     */
    public java.util.List<TagAssociation> getTags() {
        return tags;
    }
    /**
     * The set of tags attached to the Metadata Entity
     */
    public void setTags(java.util.List<TagAssociation> tags) {
        this.tags = tags;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        return joiner.toString();
    }

    public static GlobalTags.Builder builder() {
        return new GlobalTags.Builder();
    }

    public static class Builder {

        private java.util.List<TagAssociation> tags;

        public Builder() {
        }

        /**
         * The set of tags attached to the Metadata Entity
         */
        public Builder setTags(java.util.List<TagAssociation> tags) {
            this.tags = tags;
            return this;
        }


        public GlobalTags build() {
            return new GlobalTags(tags);
        }

    }
}
