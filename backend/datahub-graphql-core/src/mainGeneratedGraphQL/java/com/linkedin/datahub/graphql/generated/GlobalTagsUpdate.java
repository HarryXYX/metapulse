package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Deprecated, use addTag or removeTag mutation instead
Update to the Tags associated with a Metadata Entity
 */
public class GlobalTagsUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<TagAssociationUpdate> tags;

    public GlobalTagsUpdate() {
    }

    public GlobalTagsUpdate(java.util.List<TagAssociationUpdate> tags) {
        this.tags = tags;
    }

    public java.util.List<TagAssociationUpdate> getTags() {
        return tags;
    }
    public void setTags(java.util.List<TagAssociationUpdate> tags) {
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

    public static GlobalTagsUpdate.Builder builder() {
        return new GlobalTagsUpdate.Builder();
    }

    public static class Builder {

        private java.util.List<TagAssociationUpdate> tags;

        public Builder() {
        }

        public Builder setTags(java.util.List<TagAssociationUpdate> tags) {
            this.tags = tags;
            return this;
        }


        public GlobalTagsUpdate build() {
            return new GlobalTagsUpdate(tags);
        }

    }
}
