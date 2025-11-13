package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Update to editable schema metadata of the dataset
 */
public class EditableSchemaMetadataUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private java.util.List<EditableSchemaFieldInfoUpdate> editableSchemaFieldInfo;

    public EditableSchemaMetadataUpdate() {
    }

    public EditableSchemaMetadataUpdate(java.util.List<EditableSchemaFieldInfoUpdate> editableSchemaFieldInfo) {
        this.editableSchemaFieldInfo = editableSchemaFieldInfo;
    }

    public java.util.List<EditableSchemaFieldInfoUpdate> getEditableSchemaFieldInfo() {
        return editableSchemaFieldInfo;
    }
    public void setEditableSchemaFieldInfo(java.util.List<EditableSchemaFieldInfoUpdate> editableSchemaFieldInfo) {
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

    public static EditableSchemaMetadataUpdate.Builder builder() {
        return new EditableSchemaMetadataUpdate.Builder();
    }

    public static class Builder {

        private java.util.List<EditableSchemaFieldInfoUpdate> editableSchemaFieldInfo;

        public Builder() {
        }

        public Builder setEditableSchemaFieldInfo(java.util.List<EditableSchemaFieldInfoUpdate> editableSchemaFieldInfo) {
            this.editableSchemaFieldInfo = editableSchemaFieldInfo;
            return this;
        }


        public EditableSchemaMetadataUpdate build() {
            return new EditableSchemaMetadataUpdate(editableSchemaFieldInfo);
        }

    }
}
