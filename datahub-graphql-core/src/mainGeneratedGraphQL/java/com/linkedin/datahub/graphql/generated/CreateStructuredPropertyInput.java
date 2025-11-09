package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for creating a new structured property entity
 */
public class CreateStructuredPropertyInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String qualifiedName;
    private String displayName;
    private String description;
    private Boolean immutable;
    @javax.annotation.Nonnull
    private String valueType;
    private TypeQualifierInput typeQualifier;
    private java.util.List<AllowedValueInput> allowedValues;
    private PropertyCardinality cardinality;
    @javax.annotation.Nonnull
    private java.util.List<String> entityTypes;
    private StructuredPropertySettingsInput settings;

    public CreateStructuredPropertyInput() {
    }

    public CreateStructuredPropertyInput(String id, String qualifiedName, String displayName, String description, Boolean immutable, String valueType, TypeQualifierInput typeQualifier, java.util.List<AllowedValueInput> allowedValues, PropertyCardinality cardinality, java.util.List<String> entityTypes, StructuredPropertySettingsInput settings) {
        this.id = id;
        this.qualifiedName = qualifiedName;
        this.displayName = displayName;
        this.description = description;
        this.immutable = immutable;
        this.valueType = valueType;
        this.typeQualifier = typeQualifier;
        this.allowedValues = allowedValues;
        this.cardinality = cardinality;
        this.entityTypes = entityTypes;
        this.settings = settings;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getQualifiedName() {
        return qualifiedName;
    }
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    public String getDisplayName() {
        return displayName;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getImmutable() {
        return immutable;
    }
    public void setImmutable(Boolean immutable) {
        this.immutable = immutable;
    }

    public String getValueType() {
        return valueType;
    }
    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public TypeQualifierInput getTypeQualifier() {
        return typeQualifier;
    }
    public void setTypeQualifier(TypeQualifierInput typeQualifier) {
        this.typeQualifier = typeQualifier;
    }

    public java.util.List<AllowedValueInput> getAllowedValues() {
        return allowedValues;
    }
    public void setAllowedValues(java.util.List<AllowedValueInput> allowedValues) {
        this.allowedValues = allowedValues;
    }

    public PropertyCardinality getCardinality() {
        return cardinality;
    }
    public void setCardinality(PropertyCardinality cardinality) {
        this.cardinality = cardinality;
    }

    public java.util.List<String> getEntityTypes() {
        return entityTypes;
    }
    public void setEntityTypes(java.util.List<String> entityTypes) {
        this.entityTypes = entityTypes;
    }

    public StructuredPropertySettingsInput getSettings() {
        return settings;
    }
    public void setSettings(StructuredPropertySettingsInput settings) {
        this.settings = settings;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (id != null) {
            joiner.add("id: \"" + id + "\"");
        }
        if (qualifiedName != null) {
            joiner.add("qualifiedName: \"" + qualifiedName + "\"");
        }
        if (displayName != null) {
            joiner.add("displayName: \"" + displayName + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (immutable != null) {
            joiner.add("immutable: " + immutable);
        }
        if (valueType != null) {
            joiner.add("valueType: \"" + valueType + "\"");
        }
        if (typeQualifier != null) {
            joiner.add("typeQualifier: " + typeQualifier);
        }
        if (allowedValues != null) {
            joiner.add("allowedValues: " + allowedValues);
        }
        if (cardinality != null) {
            joiner.add("cardinality: " + cardinality);
        }
        if (entityTypes != null) {
            joiner.add("entityTypes: " + entityTypes);
        }
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        return joiner.toString();
    }

    public static CreateStructuredPropertyInput.Builder builder() {
        return new CreateStructuredPropertyInput.Builder();
    }

    public static class Builder {

        private String id;
        private String qualifiedName;
        private String displayName;
        private String description;
        private Boolean immutable;
        private String valueType;
        private TypeQualifierInput typeQualifier;
        private java.util.List<AllowedValueInput> allowedValues;
        private PropertyCardinality cardinality;
        private java.util.List<String> entityTypes;
        private StructuredPropertySettingsInput settings;

        public Builder() {
        }

        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setQualifiedName(String qualifiedName) {
            this.qualifiedName = qualifiedName;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setImmutable(Boolean immutable) {
            this.immutable = immutable;
            return this;
        }

        public Builder setValueType(String valueType) {
            this.valueType = valueType;
            return this;
        }

        public Builder setTypeQualifier(TypeQualifierInput typeQualifier) {
            this.typeQualifier = typeQualifier;
            return this;
        }

        public Builder setAllowedValues(java.util.List<AllowedValueInput> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder setCardinality(PropertyCardinality cardinality) {
            this.cardinality = cardinality;
            return this;
        }

        public Builder setEntityTypes(java.util.List<String> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        public Builder setSettings(StructuredPropertySettingsInput settings) {
            this.settings = settings;
            return this;
        }


        public CreateStructuredPropertyInput build() {
            return new CreateStructuredPropertyInput(id, qualifiedName, displayName, description, immutable, valueType, typeQualifier, allowedValues, cardinality, entityTypes, settings);
        }

    }
}
