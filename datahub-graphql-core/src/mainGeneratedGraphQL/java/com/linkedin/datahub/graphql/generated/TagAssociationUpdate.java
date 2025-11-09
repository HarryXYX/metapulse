package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Deprecated, use addTag or removeTag mutation instead
A tag update to be applied
 */
public class TagAssociationUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private TagUpdateInput tag;

    public TagAssociationUpdate() {
    }

    public TagAssociationUpdate(TagUpdateInput tag) {
        this.tag = tag;
    }

    public TagUpdateInput getTag() {
        return tag;
    }
    public void setTag(TagUpdateInput tag) {
        this.tag = tag;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (tag != null) {
            joiner.add("tag: " + tag);
        }
        return joiner.toString();
    }

    public static TagAssociationUpdate.Builder builder() {
        return new TagAssociationUpdate.Builder();
    }

    public static class Builder {

        private TagUpdateInput tag;

        public Builder() {
        }

        public Builder setTag(TagUpdateInput tag) {
            this.tag = tag;
            return this;
        }


        public TagAssociationUpdate build() {
            return new TagAssociationUpdate(tag);
        }

    }
}
