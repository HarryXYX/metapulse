package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about schema metadata that is editable via the UI
 */
public class EditableSchemaMetadata implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<EditableSchemaFieldInfo> editableSchemaFieldInfo;

    public EditableSchemaMetadata() {
    }

    public EditableSchemaMetadata(java.util.List<EditableSchemaFieldInfo> editableSchemaFieldInfo) {
        this.editableSchemaFieldInfo = editableSchemaFieldInfo;
    }

    /**
     * Editable schema field metadata
     */
    public java.util.List<EditableSchemaFieldInfo> getEditableSchemaFieldInfo() {
        return editableSchemaFieldInfo;
    }
    /**
     * Editable schema field metadata
     */
    public void setEditableSchemaFieldInfo(java.util.List<EditableSchemaFieldInfo> editableSchemaFieldInfo) {
        this.editableSchemaFieldInfo = editableSchemaFieldInfo;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (editableSchemaFieldInfo != null) {
            joiner.add("editableSchemaFieldInfo: " + editableSchemaFieldInfo);
        }
        return joiner.toString();
    }

    public static EditableSchemaMetadata.Builder builder() {
        return new EditableSchemaMetadata.Builder();
    }

    public static class Builder {

        private java.util.List<EditableSchemaFieldInfo> editableSchemaFieldInfo;

        public Builder() {
        }

        /**
         * Editable schema field metadata
         */
        public Builder setEditableSchemaFieldInfo(java.util.List<EditableSchemaFieldInfo> editableSchemaFieldInfo) {
            this.editableSchemaFieldInfo = editableSchemaFieldInfo;
            return this;
        }


        public EditableSchemaMetadata build() {
            return new EditableSchemaMetadata(editableSchemaFieldInfo);
        }

    }
}
