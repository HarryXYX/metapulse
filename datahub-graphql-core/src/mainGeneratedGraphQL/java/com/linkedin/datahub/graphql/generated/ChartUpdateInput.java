package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Arguments provided to update a Chart Entity
 */
public class ChartUpdateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private OwnershipUpdate ownership;
    private GlobalTagsUpdate globalTags;
    private GlobalTagsUpdate tags;
    private ChartEditablePropertiesUpdate editableProperties;

    public ChartUpdateInput() {
    }

    public ChartUpdateInput(OwnershipUpdate ownership, GlobalTagsUpdate globalTags, GlobalTagsUpdate tags, ChartEditablePropertiesUpdate editableProperties) {
        this.ownership = ownership;
        this.globalTags = globalTags;
        this.tags = tags;
        this.editableProperties = editableProperties;
    }

    public OwnershipUpdate getOwnership() {
        return ownership;
    }
    public void setOwnership(OwnershipUpdate ownership) {
        this.ownership = ownership;
    }

    public GlobalTagsUpdate getGlobalTags() {
        return globalTags;
    }
    public void setGlobalTags(GlobalTagsUpdate globalTags) {
        this.globalTags = globalTags;
    }

    public GlobalTagsUpdate getTags() {
        return tags;
    }
    public void setTags(GlobalTagsUpdate tags) {
        this.tags = tags;
    }

    public ChartEditablePropertiesUpdate getEditableProperties() {
        return editableProperties;
    }
    public void setEditableProperties(ChartEditablePropertiesUpdate editableProperties) {
        this.editableProperties = editableProperties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (globalTags != null) {
            joiner.add("globalTags: " + globalTags);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
        }
        return joiner.toString();
    }

    public static ChartUpdateInput.Builder builder() {
        return new ChartUpdateInput.Builder();
    }

    public static class Builder {

        private OwnershipUpdate ownership;
        private GlobalTagsUpdate globalTags;
        private GlobalTagsUpdate tags;
        private ChartEditablePropertiesUpdate editableProperties;

        public Builder() {
        }

        public Builder setOwnership(OwnershipUpdate ownership) {
            this.ownership = ownership;
            return this;
        }

        public Builder setGlobalTags(GlobalTagsUpdate globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        public Builder setTags(GlobalTagsUpdate tags) {
            this.tags = tags;
            return this;
        }

        public Builder setEditableProperties(ChartEditablePropertiesUpdate editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public ChartUpdateInput build() {
            return new ChartUpdateInput(ownership, globalTags, tags, editableProperties);
        }

    }
}
