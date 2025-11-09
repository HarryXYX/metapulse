package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Standalone schema field entity. Differs from the SchemaField struct because it is not directly nested inside a
schema field
 */
public class SchemaFieldEntity implements java.io.Serializable, Entity, EntityWithRelationships, HasLogicalParent {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    @javax.annotation.Nonnull
    private EntityType type;
    @javax.annotation.Nonnull
    private String fieldPath;
    @javax.annotation.Nonnull
    private Entity parent;
    private StructuredProperties structuredProperties;
    private Forms forms;
    private EntityRelationshipsResult relationships;
    private EntityLineageResult lineage;
    private BusinessAttributes businessAttributes;
    private Documentation documentation;
    private Status status;
    private Deprecation deprecation;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private Entity logicalParent;

    public SchemaFieldEntity() {
    }

    public SchemaFieldEntity(String urn, EntityType type, String fieldPath, Entity parent, StructuredProperties structuredProperties, Forms forms, EntityRelationshipsResult relationships, EntityLineageResult lineage, BusinessAttributes businessAttributes, Documentation documentation, Status status, Deprecation deprecation, GlobalTags tags, GlossaryTerms glossaryTerms, Entity logicalParent) {
        this.urn = urn;
        this.type = type;
        this.fieldPath = fieldPath;
        this.parent = parent;
        this.structuredProperties = structuredProperties;
        this.forms = forms;
        this.relationships = relationships;
        this.lineage = lineage;
        this.businessAttributes = businessAttributes;
        this.documentation = documentation;
        this.status = status;
        this.deprecation = deprecation;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.logicalParent = logicalParent;
    }

    /**
     * Primary key of the schema field
     */
    public String getUrn() {
        return urn;
    }
    /**
     * Primary key of the schema field
     */
    public void setUrn(String urn) {
        this.urn = urn;
    }

    /**
     * A standard Entity Type
     */
    public EntityType getType() {
        return type;
    }
    /**
     * A standard Entity Type
     */
    public void setType(EntityType type) {
        this.type = type;
    }

    /**
     * Field path identifying the field in its dataset
     */
    public String getFieldPath() {
        return fieldPath;
    }
    /**
     * Field path identifying the field in its dataset
     */
    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
    }

    /**
     * The field's parent.
     */
    public Entity getParent() {
        return parent;
    }
    /**
     * The field's parent.
     */
    public void setParent(Entity parent) {
        this.parent = parent;
    }

    /**
     * Structured properties on this schema field
     */
    public StructuredProperties getStructuredProperties() {
        return structuredProperties;
    }
    /**
     * Structured properties on this schema field
     */
    public void setStructuredProperties(StructuredProperties structuredProperties) {
        this.structuredProperties = structuredProperties;
    }

    /**
     * The forms associated with the Dataset
     */
    public Forms getForms() {
        return forms;
    }
    /**
     * The forms associated with the Dataset
     */
    public void setForms(Forms forms) {
        this.forms = forms;
    }

    /**
     * Granular API for querying edges extending from this entity
     */
    public EntityRelationshipsResult getRelationships() {
        return relationships;
    }
    /**
     * Granular API for querying edges extending from this entity
     */
    public void setRelationships(EntityRelationshipsResult relationships) {
        this.relationships = relationships;
    }

    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    public EntityLineageResult getLineage() {
        return lineage;
    }
    /**
     * Edges extending from this entity grouped by direction in the lineage graph
     */
    public void setLineage(EntityLineageResult lineage) {
        this.lineage = lineage;
    }

    /**
     * Business Attribute associated with the field
     */
    public BusinessAttributes getBusinessAttributes() {
        return businessAttributes;
    }
    /**
     * Business Attribute associated with the field
     */
    public void setBusinessAttributes(BusinessAttributes businessAttributes) {
        this.businessAttributes = businessAttributes;
    }

    /**
     * Documentation aspect for this schema field
     */
    public Documentation getDocumentation() {
        return documentation;
    }
    /**
     * Documentation aspect for this schema field
     */
    public void setDocumentation(Documentation documentation) {
        this.documentation = documentation;
    }

    /**
     * The status of the SchemaFieldEntity
     */
    public Status getStatus() {
        return status;
    }
    /**
     * The status of the SchemaFieldEntity
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * deprecation status of the schema field
     */
    public Deprecation getDeprecation() {
        return deprecation;
    }
    /**
     * deprecation status of the schema field
     */
    public void setDeprecation(Deprecation deprecation) {
        this.deprecation = deprecation;
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
     * If this entity represents a physical asset, this is its logical parent, from which metadata can propagate.
     */
    public Entity getLogicalParent() {
        return logicalParent;
    }
    /**
     * If this entity represents a physical asset, this is its logical parent, from which metadata can propagate.
     */
    public void setLogicalParent(Entity logicalParent) {
        this.logicalParent = logicalParent;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (fieldPath != null) {
            joiner.add("fieldPath: \"" + fieldPath + "\"");
        }
        if (parent != null) {
            joiner.add("parent: " + parent);
        }
        if (structuredProperties != null) {
            joiner.add("structuredProperties: " + structuredProperties);
        }
        if (forms != null) {
            joiner.add("forms: " + forms);
        }
        if (relationships != null) {
            joiner.add("relationships: " + relationships);
        }
        if (lineage != null) {
            joiner.add("lineage: " + lineage);
        }
        if (businessAttributes != null) {
            joiner.add("businessAttributes: " + businessAttributes);
        }
        if (documentation != null) {
            joiner.add("documentation: " + documentation);
        }
        if (status != null) {
            joiner.add("status: " + status);
        }
        if (deprecation != null) {
            joiner.add("deprecation: " + deprecation);
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        if (logicalParent != null) {
            joiner.add("logicalParent: " + logicalParent);
        }
        return joiner.toString();
    }

    public static SchemaFieldEntity.Builder builder() {
        return new SchemaFieldEntity.Builder();
    }

    public static class Builder {

        private String urn;
        private EntityType type;
        private String fieldPath;
        private Entity parent;
        private StructuredProperties structuredProperties;
        private Forms forms;
        private EntityRelationshipsResult relationships;
        private EntityLineageResult lineage;
        private BusinessAttributes businessAttributes;
        private Documentation documentation;
        private Status status;
        private Deprecation deprecation;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private Entity logicalParent;

        public Builder() {
        }

        /**
         * Primary key of the schema field
         */
        public Builder setUrn(String urn) {
            this.urn = urn;
            return this;
        }

        /**
         * A standard Entity Type
         */
        public Builder setType(EntityType type) {
            this.type = type;
            return this;
        }

        /**
         * Field path identifying the field in its dataset
         */
        public Builder setFieldPath(String fieldPath) {
            this.fieldPath = fieldPath;
            return this;
        }

        /**
         * The field's parent.
         */
        public Builder setParent(Entity parent) {
            this.parent = parent;
            return this;
        }

        /**
         * Structured properties on this schema field
         */
        public Builder setStructuredProperties(StructuredProperties structuredProperties) {
            this.structuredProperties = structuredProperties;
            return this;
        }

        /**
         * The forms associated with the Dataset
         */
        public Builder setForms(Forms forms) {
            this.forms = forms;
            return this;
        }

        /**
         * Granular API for querying edges extending from this entity
         */
        public Builder setRelationships(EntityRelationshipsResult relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * Edges extending from this entity grouped by direction in the lineage graph
         */
        public Builder setLineage(EntityLineageResult lineage) {
            this.lineage = lineage;
            return this;
        }

        /**
         * Business Attribute associated with the field
         */
        public Builder setBusinessAttributes(BusinessAttributes businessAttributes) {
            this.businessAttributes = businessAttributes;
            return this;
        }

        /**
         * Documentation aspect for this schema field
         */
        public Builder setDocumentation(Documentation documentation) {
            this.documentation = documentation;
            return this;
        }

        /**
         * The status of the SchemaFieldEntity
         */
        public Builder setStatus(Status status) {
            this.status = status;
            return this;
        }

        /**
         * deprecation status of the schema field
         */
        public Builder setDeprecation(Deprecation deprecation) {
            this.deprecation = deprecation;
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
         * If this entity represents a physical asset, this is its logical parent, from which metadata can propagate.
         */
        public Builder setLogicalParent(Entity logicalParent) {
            this.logicalParent = logicalParent;
            return this;
        }


        public SchemaFieldEntity build() {
            return new SchemaFieldEntity(urn, type, fieldPath, parent, structuredProperties, forms, relationships, lineage, businessAttributes, documentation, status, deprecation, tags, glossaryTerms, logicalParent);
        }

    }
}
