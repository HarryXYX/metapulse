package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Properties about an individual Query
 */
public class StructuredPropertyDefinition implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String qualifiedName;
    private String displayName;
    private String description;
    private PropertyCardinality cardinality;
    private java.util.List<AllowedValue> allowedValues;
    @javax.annotation.Nonnull
    private DataTypeEntity valueType;
    private TypeQualifier typeQualifier;
    @javax.annotation.Nonnull
    private java.util.List<EntityTypeEntity> entityTypes;
    private boolean immutable;
    private ResolvedAuditStamp created;
    private ResolvedAuditStamp lastModified;

    public StructuredPropertyDefinition() {
    }

    public StructuredPropertyDefinition(String qualifiedName, String displayName, String description, PropertyCardinality cardinality, java.util.List<AllowedValue> allowedValues, DataTypeEntity valueType, TypeQualifier typeQualifier, java.util.List<EntityTypeEntity> entityTypes, boolean immutable, ResolvedAuditStamp created, ResolvedAuditStamp lastModified) {
        this.qualifiedName = qualifiedName;
        this.displayName = displayName;
        this.description = description;
        this.cardinality = cardinality;
        this.allowedValues = allowedValues;
        this.valueType = valueType;
        this.typeQualifier = typeQualifier;
        this.entityTypes = entityTypes;
        this.immutable = immutable;
        this.created = created;
        this.lastModified = lastModified;
    }

    /**
     * The fully qualified name of the property. This includes its namespace
     */
    public String getQualifiedName() {
        return qualifiedName;
    }
    /**
     * The fully qualified name of the property. This includes its namespace
     */
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    /**
     * The display name of this structured property
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The display name of this structured property
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * The description of this property
     */
    public String getDescription() {
        return description;
    }
    /**
     * The description of this property
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The cardinality of a Structured Property determining whether one or multiple values
can be applied to the entity from this property.
     */
    public PropertyCardinality getCardinality() {
        return cardinality;
    }
    /**
     * The cardinality of a Structured Property determining whether one or multiple values
can be applied to the entity from this property.
     */
    public void setCardinality(PropertyCardinality cardinality) {
        this.cardinality = cardinality;
    }

    /**
     * A list of allowed values that the property is allowed to take.
     */
    public java.util.List<AllowedValue> getAllowedValues() {
        return allowedValues;
    }
    /**
     * A list of allowed values that the property is allowed to take.
     */
    public void setAllowedValues(java.util.List<AllowedValue> allowedValues) {
        this.allowedValues = allowedValues;
    }

    /**
     * The type of this structured property
     */
    public DataTypeEntity getValueType() {
        return valueType;
    }
    /**
     * The type of this structured property
     */
    public void setValueType(DataTypeEntity valueType) {
        this.valueType = valueType;
    }

    /**
     * Allows for type specialization of the valueType to be more specific about which
entity types are allowed, for example.
     */
    public TypeQualifier getTypeQualifier() {
        return typeQualifier;
    }
    /**
     * Allows for type specialization of the valueType to be more specific about which
entity types are allowed, for example.
     */
    public void setTypeQualifier(TypeQualifier typeQualifier) {
        this.typeQualifier = typeQualifier;
    }

    /**
     * Entity types that this structured property can be applied to
     */
    public java.util.List<EntityTypeEntity> getEntityTypes() {
        return entityTypes;
    }
    /**
     * Entity types that this structured property can be applied to
     */
    public void setEntityTypes(java.util.List<EntityTypeEntity> entityTypes) {
        this.entityTypes = entityTypes;
    }

    /**
     * Whether or not this structured property is immutable
     */
    public boolean getImmutable() {
        return immutable;
    }
    /**
     * Whether or not this structured property is immutable
     */
    public void setImmutable(boolean immutable) {
        this.immutable = immutable;
    }

    /**
     * Audit stamp for when this structured property was created
     */
    public ResolvedAuditStamp getCreated() {
        return created;
    }
    /**
     * Audit stamp for when this structured property was created
     */
    public void setCreated(ResolvedAuditStamp created) {
        this.created = created;
    }

    /**
     * Audit stamp for when this structured property was last modified
     */
    public ResolvedAuditStamp getLastModified() {
        return lastModified;
    }
    /**
     * Audit stamp for when this structured property was last modified
     */
    public void setLastModified(ResolvedAuditStamp lastModified) {
        this.lastModified = lastModified;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (qualifiedName != null) {
            joiner.add("qualifiedName: \"" + qualifiedName + "\"");
        }
        if (displayName != null) {
            joiner.add("displayName: \"" + displayName + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (cardinality != null) {
            joiner.add("cardinality: " + cardinality);
        }
        if (allowedValues != null) {
            joiner.add("allowedValues: " + allowedValues);
        }
        if (valueType != null) {
            joiner.add("valueType: " + valueType);
        }
        if (typeQualifier != null) {
            joiner.add("typeQualifier: " + typeQualifier);
        }
        if (entityTypes != null) {
            joiner.add("entityTypes: " + entityTypes);
        }
        joiner.add("immutable: " + immutable);
        if (created != null) {
            joiner.add("created: " + created);
        }
        if (lastModified != null) {
            joiner.add("lastModified: " + lastModified);
        }
        return joiner.toString();
    }

    public static StructuredPropertyDefinition.Builder builder() {
        return new StructuredPropertyDefinition.Builder();
    }

    public static class Builder {

        private String qualifiedName;
        private String displayName;
        private String description;
        private PropertyCardinality cardinality;
        private java.util.List<AllowedValue> allowedValues;
        private DataTypeEntity valueType;
        private TypeQualifier typeQualifier;
        private java.util.List<EntityTypeEntity> entityTypes;
        private boolean immutable;
        private ResolvedAuditStamp created;
        private ResolvedAuditStamp lastModified;

        public Builder() {
        }

        /**
         * The fully qualified name of the property. This includes its namespace
         */
        public Builder setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        /**
         * The display name of this structured property
         */
        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The description of this property
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The cardinality of a Structured Property determining whether one or multiple values
can be applied to the entity from this property.
         */
        public Builder setCardinality(PropertyCardinality cardinality) {
            this.cardinality = cardinality;
            return this;
        }

        /**
         * A list of allowed values that the property is allowed to take.
         */
        public Builder setAllowedValues(java.util.List<AllowedValue> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        /**
         * The type of this structured property
         */
        public Builder setValueType(DataTypeEntity valueType) {
            this.valueType = valueType;
            return this;
        }

        /**
         * Allows for type specialization of the valueType to be more specific about which
entity types are allowed, for example.
         */
        public Builder setTypeQualifier(TypeQualifier typeQualifier) {
            this.typeQualifier = typeQualifier;
            return this;
        }

        /**
         * Entity types that this structured property can be applied to
         */
        public Builder setEntityTypes(java.util.List<EntityTypeEntity> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        /**
         * Whether or not this structured property is immutable
         */
        public Builder setImmutable(boolean immutable) {
            this.immutable = immutable;
            return this;
        }

        /**
         * Audit stamp for when this structured property was created
         */
        public Builder setCreated(ResolvedAuditStamp created) {
            this.created = created;
            return this;
        }

        /**
         * Audit stamp for when this structured property was last modified
         */
        public Builder setLastModified(ResolvedAuditStamp lastModified) {
            this.lastModified = lastModified;
            return this;
        }


        public StructuredPropertyDefinition build() {
            return new StructuredPropertyDefinition(qualifiedName, displayName, description, cardinality, allowedValues, valueType, typeQualifier, entityTypes, immutable, created, lastModified);
        }

    }
}
