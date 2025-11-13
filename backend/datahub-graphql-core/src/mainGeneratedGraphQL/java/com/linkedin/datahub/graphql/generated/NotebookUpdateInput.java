package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Arguments provided to update a Notebook Entity
 */
public class NotebookUpdateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private OwnershipUpdate ownership;
    private GlobalTagsUpdate tags;
    private NotebookEditablePropertiesUpdate editableProperties;

    public NotebookUpdateInput() {
    }

    public NotebookUpdateInput(OwnershipUpdate ownership, GlobalTagsUpdate tags, NotebookEditablePropertiesUpdate editableProperties) {
        this.ownership = ownership;
        this.tags = tags;
        this.editableProperties = editableProperties;
    }

    public OwnershipUpdate getOwnership() {
        return ownership;
    }
    public void setOwnership(OwnershipUpdate ownership) {
        this.ownership = ownership;
    }

    public GlobalTagsUpdate getTags() {
        return tags;
    }
    public void setTags(GlobalTagsUpdate tags) {
        this.tags = tags;
    }

    public NotebookEditablePropertiesUpdate getEditableProperties() {
        return editableProperties;
    }
    public void setEditableProperties(NotebookEditablePropertiesUpdate editableProperties) {
        this.editableProperties = editableProperties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (ownership != null) {
            joiner.add("ownership: " + ownership);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
        }
        return joiner.toString();
    }

    public static NotebookUpdateInput.Builder builder() {
        return new NotebookUpdateInput.Builder();
    }

    public static class Builder {

        private OwnershipUpdate ownership;
        private GlobalTagsUpdate tags;
        private NotebookEditablePropertiesUpdate editableProperties;

        public Builder() {
        }

        public Builder setOwnership(OwnershipUpdate ownership) {
            this.ownership = ownership;
            return this;
        }

        public Builder setTags(GlobalTagsUpdate tags) {
            this.tags = tags;
            return this;
        }

        public Builder setEditableProperties(NotebookEditablePropertiesUpdate editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public NotebookUpdateInput build() {
            return new NotebookUpdateInput(ownership, tags, editableProperties);
        }

    }
}
