package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Information about an individual field in a Dataset schema
 */
public class SchemaField implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String fieldPath;
    private String jsonPath;
    private String label;
    private boolean nullable;
    private String description;
    @javax.annotation.Nonnull
    private SchemaFieldDataType type;
    private String nativeDataType;
    private boolean recursive;
    @Deprecated
    private GlobalTags globalTags;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private Boolean isPartOfKey;
    private Boolean isPartitioningKey;
    private String jsonProps;
    private SchemaFieldEntity schemaFieldEntity;

    public SchemaField() {
    }

    public SchemaField(String fieldPath, String jsonPath, String label, boolean nullable, String description, SchemaFieldDataType type, String nativeDataType, boolean recursive, GlobalTags globalTags, GlobalTags tags, GlossaryTerms glossaryTerms, Boolean isPartOfKey, Boolean isPartitioningKey, String jsonProps, SchemaFieldEntity schemaFieldEntity) {
        this.fieldPath = fieldPath;
        this.jsonPath = jsonPath;
        this.label = label;
        this.nullable = nullable;
        this.description = description;
        this.type = type;
        this.nativeDataType = nativeDataType;
        this.recursive = recursive;
        this.globalTags = globalTags;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.isPartOfKey = isPartOfKey;
        this.isPartitioningKey = isPartitioningKey;
        this.jsonProps = jsonProps;
        this.schemaFieldEntity = schemaFieldEntity;
    }

    /**
     * Flattened name of the field computed from jsonPath field
     */
    public String getFieldPath() {
        return fieldPath;
    }
    /**
     * Flattened name of the field computed from jsonPath field
     */
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * Flattened name of a field in JSON Path notation
     */
    public String getJsonPath() {
        return jsonPath;
    }
    /**
     * Flattened name of a field in JSON Path notation
     */
    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    /**
     * Human readable label for the field. Not supplied by all data sources
     */
    public String getLabel() {
        return label;
    }
    /**
     * Human readable label for the field. Not supplied by all data sources
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Indicates if this field is optional or nullable
     */
    public boolean getNullable() {
        return nullable;
    }
    /**
     * Indicates if this field is optional or nullable
     */
    public void setNullable(boolean nullable) {
        this.nullable = nullable;
    }

    /**
     * Description of the field
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the field
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Platform independent field type of the field
     */
    public SchemaFieldDataType getType() {
        return type;
    }
    /**
     * Platform independent field type of the field
     */
    public void setType(SchemaFieldDataType type) {
        this.type = type;
    }

    /**
     * The native type of the field in the datasets platform as declared by platform schema
     */
    public String getNativeDataType() {
        return nativeDataType;
    }
    /**
     * The native type of the field in the datasets platform as declared by platform schema
     */
    public void setNativeDataType(String nativeDataType) {
        this.nativeDataType = nativeDataType;
    }

    /**
     * Whether the field references its own type recursively
     */
    public boolean getRecursive() {
        return recursive;
    }
    /**
     * Whether the field references its own type recursively
     */
    public void setRecursive(boolean recursive) {
        this.recursive = recursive;
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

    /**
     * Whether the field is part of a key schema
     */
    public Boolean getIsPartOfKey() {
        return isPartOfKey;
    }
    /**
     * Whether the field is part of a key schema
     */
    public void setIsPartOfKey(Boolean isPartOfKey) {
        this.isPartOfKey = isPartOfKey;
    }

    /**
     * Whether the field is part of a partitioning key schema
     */
    public Boolean getIsPartitioningKey() {
        return isPartitioningKey;
    }
    /**
     * Whether the field is part of a partitioning key schema
     */
    public void setIsPartitioningKey(Boolean isPartitioningKey) {
        this.isPartitioningKey = isPartitioningKey;
    }

    /**
     * For schema fields that have other properties that are not modeled explicitly, represented as a JSON string.
     */
    public String getJsonProps() {
        return jsonProps;
    }
    /**
     * For schema fields that have other properties that are not modeled explicitly, represented as a JSON string.
     */
    public void setJsonProps(String jsonProps) {
        this.jsonProps = jsonProps;
    }

    /**
     * Schema field entity that exist in the database for this schema field
     */
    public SchemaFieldEntity getSchemaFieldEntity() {
        return schemaFieldEntity;
    }
    /**
     * Schema field entity that exist in the database for this schema field
     */
    public void setSchemaFieldEntity(SchemaFieldEntity schemaFieldEntity) {
        this.schemaFieldEntity = schemaFieldEntity;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (fieldPath != null) {
            joiner.add("fieldPath: \"" + fieldPath + "\"");
        }
        if (jsonPath != null) {
            joiner.add("jsonPath: \"" + jsonPath + "\"");
        }
        if (label != null) {
            joiner.add("label: \"" + label + "\"");
        }
        joiner.add("nullable: " + nullable);
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (nativeDataType != null) {
            joiner.add("nativeDataType: \"" + nativeDataType + "\"");
        }
        joiner.add("recursive: " + recursive);
        if (globalTags != null) {
            joiner.add("globalTags: " + globalTags);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        if (isPartOfKey != null) {
            joiner.add("isPartOfKey: " + isPartOfKey);
        }
        if (isPartitioningKey != null) {
            joiner.add("isPartitioningKey: " + isPartitioningKey);
        }
        if (jsonProps != null) {
            joiner.add("jsonProps: \"" + jsonProps + "\"");
        }
        if (schemaFieldEntity != null) {
            joiner.add("schemaFieldEntity: " + schemaFieldEntity);
        }
        return joiner.toString();
    }

    public static SchemaField.Builder builder() {
        return new SchemaField.Builder();
    }

    public static class Builder {

        private String fieldPath;
        private String jsonPath;
        private String label;
        private boolean nullable;
        private String description;
        private SchemaFieldDataType type;
        private String nativeDataType;
        private boolean recursive;
        private GlobalTags globalTags;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private Boolean isPartOfKey;
        private Boolean isPartitioningKey;
        private String jsonProps;
        private SchemaFieldEntity schemaFieldEntity;

        public Builder() {
        }

        /**
         * Flattened name of the field computed from jsonPath field
         */
        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * Flattened name of a field in JSON Path notation
         */
        public Builder setJsonPath(String jsonPath) {
            this.jsonPath = jsonPath;
            return this;
        }

        /**
         * Human readable label for the field. Not supplied by all data sources
         */
        public Builder setLabel(String label) {
            this.label = label;
            return this;
        }

        /**
         * Indicates if this field is optional or nullable
         */
        public Builder setNullable(boolean nullable) {
            this.nullable = nullable;
            return this;
        }

        /**
         * Description of the field
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Platform independent field type of the field
         */
        public Builder setType(SchemaFieldDataType type) {
            this.type = type;
            return this;
        }

        /**
         * The native type of the field in the datasets platform as declared by platform schema
         */
        public Builder setNativeDataType(String nativeDataType) {
            this.nativeDataType = nativeDataType;
            return this;
        }

        /**
         * Whether the field references its own type recursively
         */
        public Builder setRecursive(boolean recursive) {
            this.recursive = recursive;
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

        /**
         * Whether the field is part of a key schema
         */
        public Builder setIsPartOfKey(Boolean isPartOfKey) {
            this.isPartOfKey = isPartOfKey;
            return this;
        }

        /**
         * Whether the field is part of a partitioning key schema
         */
        public Builder setIsPartitioningKey(Boolean isPartitioningKey) {
            this.isPartitioningKey = isPartitioningKey;
            return this;
        }

        /**
         * For schema fields that have other properties that are not modeled explicitly, represented as a JSON string.
         */
        public Builder setJsonProps(String jsonProps) {
            this.jsonProps = jsonProps;
            return this;
        }

        /**
         * Schema field entity that exist in the database for this schema field
         */
        public Builder setSchemaFieldEntity(SchemaFieldEntity schemaFieldEntity) {
            this.schemaFieldEntity = schemaFieldEntity;
            return this;
        }


        public SchemaField build() {
            return new SchemaField(fieldPath, jsonPath, label, nullable, description, type, nativeDataType, recursive, globalTags, tags, glossaryTerms, isPartOfKey, isPartitioningKey, jsonProps, schemaFieldEntity);
        }

    }
}
