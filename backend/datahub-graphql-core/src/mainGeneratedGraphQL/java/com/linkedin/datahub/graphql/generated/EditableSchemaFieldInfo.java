package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Editable schema field metadata ie descriptions, tags, etc
 */
public class EditableSchemaFieldInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String fieldPath;
    private String description;
    @Deprecated
    private GlobalTags globalTags;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;

    public EditableSchemaFieldInfo() {
    }

    public EditableSchemaFieldInfo(String fieldPath, String description, GlobalTags globalTags, GlobalTags tags, GlossaryTerms glossaryTerms) {
        this.fieldPath = fieldPath;
        this.description = description;
        this.globalTags = globalTags;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
    }

    /**
     * Flattened name of a field identifying the field the editable info is applied to
     */
    public String getFieldPath() {
        return fieldPath;
    }
    /**
     * Flattened name of a field identifying the field the editable info is applied to
     */
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * Edited description of the field
     */
    public String getDescription() {
        return description;
    }
    /**
     * Edited description of the field
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Deprecated, use tags field instead
Tags associated with the field
     */
    @Deprecated
    public GlobalTags getGlobalTags() {
        return globalTags;
    }
    /**
     * Deprecated, use tags field instead
Tags associated with the field
     */
    @Deprecated
    public void setGlobalTags(GlobalTags globalTags) {
        this.globalTags = globalTags;
    }

    /**
     * Tags associated with the field
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * Tags associated with the field
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Glossary terms associated with the field
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * Glossary terms associated with the field
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
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
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        return joiner.toString();
    }

    public static EditableSchemaFieldInfo.Builder builder() {
        return new EditableSchemaFieldInfo.Builder();
    }

    public static class Builder {

        private String fieldPath;
        private String description;
        private GlobalTags globalTags;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;

        public Builder() {
        }

        /**
         * Flattened name of a field identifying the field the editable info is applied to
         */
        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * Edited description of the field
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Deprecated, use tags field instead
Tags associated with the field
         */
        @Deprecated
        public Builder setGlobalTags(GlobalTags globalTags) {
            this.globalTags = globalTags;
            return this;
        }

        /**
         * Tags associated with the field
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Glossary terms associated with the field
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
            return this;
        }


        public EditableSchemaFieldInfo build() {
            return new EditableSchemaFieldInfo(fieldPath, description, globalTags, tags, glossaryTerms);
        }

    }
}
