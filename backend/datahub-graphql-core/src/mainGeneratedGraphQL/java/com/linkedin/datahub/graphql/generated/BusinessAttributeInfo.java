package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Business Attribute type
 */
public class BusinessAttributeInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String name;
    private String description;
    private GlobalTags tags;
    private GlossaryTerms glossaryTerms;
    private SchemaFieldDataType type;
    private java.util.List<CustomPropertiesEntry> customProperties;
    @javax.annotation.Nonnull
    private AuditStamp created;
    @javax.annotation.Nonnull
    private AuditStamp lastModified;
    private AuditStamp deleted;

    public BusinessAttributeInfo() {
    }

    public BusinessAttributeInfo(String name, String description, GlobalTags tags, GlossaryTerms glossaryTerms, SchemaFieldDataType type, java.util.List<CustomPropertiesEntry> customProperties, AuditStamp created, AuditStamp lastModified, AuditStamp deleted) {
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.glossaryTerms = glossaryTerms;
        this.type = type;
        this.customProperties = customProperties;
        this.created = created;
        this.lastModified = lastModified;
        this.deleted = deleted;
    }

    /**
     * name of the business attribute
     */
    public String getName() {
        return name;
    }
    /**
     * name of the business attribute
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * description of business attribute
     */
    public String getDescription() {
        return description;
    }
    /**
     * description of business attribute
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Tags associated with the business attribute
     */
    public GlobalTags getTags() {
        return tags;
    }
    /**
     * Tags associated with the business attribute
     */
    public void setTags(GlobalTags tags) {
        this.tags = tags;
    }

    /**
     * Glossary terms associated with the business attribute
     */
    public GlossaryTerms getGlossaryTerms() {
        return glossaryTerms;
    }
    /**
     * Glossary terms associated with the business attribute
     */
    public void setGlossaryTerms(GlossaryTerms glossaryTerms) {
        this.glossaryTerms = glossaryTerms;
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
     * A list of platform specific metadata tuples
     */
    public java.util.List<CustomPropertiesEntry> getCustomProperties() {
        return customProperties;
    }
    /**
     * A list of platform specific metadata tuples
     */
    public void setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
        this.customProperties = customProperties;
    }

    /**
     * An AuditStamp corresponding to the creation of this chart
     */
    public AuditStamp getCreated() {
        return created;
    }
    /**
     * An AuditStamp corresponding to the creation of this chart
     */
    public void setCreated(AuditStamp created) {
        this.created = created;
    }

    /**
     * An AuditStamp corresponding to the modification of this chart
     */
    public AuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * An AuditStamp corresponding to the modification of this chart
     */
    public void setLastModified(AuditStamp lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * An optional AuditStamp corresponding to the deletion of this chart
     */
    public AuditStamp getDeleted() {
        return deleted;
    }
    /**
     * An optional AuditStamp corresponding to the deletion of this chart
     */
    public void setDeleted(AuditStamp deleted) {
        this.deleted = deleted;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (tags != null) {
            joiner.add("tags: " + tags);
        }
        if (glossaryTerms != null) {
            joiner.add("glossaryTerms: " + glossaryTerms);
        }
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (customProperties != null) {
            joiner.add("customProperties: " + customProperties);
        }
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        if (deleted != null) {
            joiner.add("deleted: " + deleted);
        }
        return joiner.toString();
    }

    public static BusinessAttributeInfo.Builder builder() {
        return new BusinessAttributeInfo.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private GlobalTags tags;
        private GlossaryTerms glossaryTerms;
        private SchemaFieldDataType type;
        private java.util.List<CustomPropertiesEntry> customProperties;
        private AuditStamp created;
        private AuditStamp lastModified;
        private AuditStamp deleted;

        public Builder() {
        }

        /**
         * name of the business attribute
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * description of business attribute
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Tags associated with the business attribute
         */
        public Builder setTags(GlobalTags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Glossary terms associated with the business attribute
         */
        public Builder setGlossaryTerms(GlossaryTerms glossaryTerms) {
            this.glossaryTerms = glossaryTerms;
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
         * A list of platform specific metadata tuples
         */
        public Builder setCustomProperties(java.util.List<CustomPropertiesEntry> customProperties) {
            this.customProperties = customProperties;
            return this;
        }

        /**
         * An AuditStamp corresponding to the creation of this chart
         */
        public Builder setCreated(AuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * An AuditStamp corresponding to the modification of this chart
         */
        public Builder setLastModified(AuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * An optional AuditStamp corresponding to the deletion of this chart
         */
        public Builder setDeleted(AuditStamp deleted) {
            this.deleted = deleted;
            return this;
        }


        public BusinessAttributeInfo build() {
            return new BusinessAttributeInfo(name, description, tags, glossaryTerms, type, customProperties, created, lastModified, deleted);
        }

    }
}
