package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Update to writable schema field metadata
 */
public class EditableSchemaFieldInfoUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String fieldPath;
    private String description;
    private GlobalTagsUpdate globalTags;

    public EditableSchemaFieldInfoUpdate() {
    }

    public EditableSchemaFieldInfoUpdate(String fieldPath, String description, GlobalTagsUpdate globalTags) {
        this.fieldPath = fieldPath;
        this.description = description;
        this.globalTags = globalTags;
    }

    public String getFieldPath() {
        return fieldPath;
    }
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public GlobalTagsUpdate getGlobalTags() {
        return globalTags;
    }
    public void setGlobalTags(GlobalTagsUpdate globalTags) {
        this.globalTags = globalTags;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fieldPath != null) {
            joiner.add("fieldPath: \"" + fieldPath + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (globalTags != null) {
            joiner.add("globalTags: " + globalTags);
        }
        return joiner.toString();
    }

    public static EditableSchemaFieldInfoUpdate.Builder builder() {
        return new EditableSchemaFieldInfoUpdate.Builder();
    }

    public static class Builder {

        private String fieldPath;
        private String description;
        private GlobalTagsUpdate globalTags;

        public Builder() {
        }

        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setGlobalTags(GlobalTagsUpdate globalTags) {
            this.globalTags = globalTags;
            return this;
        }


        public EditableSchemaFieldInfoUpdate build() {
            return new EditableSchemaFieldInfoUpdate(fieldPath, description, globalTags);
        }

    }
}
