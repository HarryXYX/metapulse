package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for updating an existing structured property entity
 */
public class UpdateStructuredPropertyInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String urn;
    private String displayName;
    private String description;
    private Boolean immutable;
    private UpdateTypeQualifierInput typeQualifier;
    private java.util.List<AllowedValueInput> newAllowedValues;
    private Boolean setCardinalityAsMultiple;
    private java.util.List<String> newEntityTypes;
    private StructuredPropertySettingsInput settings;

    public UpdateStructuredPropertyInput() {
    }

    public UpdateStructuredPropertyInput(String urn, String displayName, String description, Boolean immutable, UpdateTypeQualifierInput typeQualifier, java.util.List<AllowedValueInput> newAllowedValues, Boolean setCardinalityAsMultiple, java.util.List<String> newEntityTypes, StructuredPropertySettingsInput settings) {
        this.urn = urn;
        this.displayName = displayName;
        this.description = description;
        this.immutable = immutable;
        this.typeQualifier = typeQualifier;
        this.newAllowedValues = newAllowedValues;
        this.setCardinalityAsMultiple = setCardinalityAsMultiple;
        this.newEntityTypes = newEntityTypes;
        this.settings = settings;
    }

    public String getUrn() {
        return urn;
    }
    public void setUrn(String urn) {
        this.urn = urn;
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

    public UpdateTypeQualifierInput getTypeQualifier() {
        return typeQualifier;
    }
    public void setTypeQualifier(UpdateTypeQualifierInput typeQualifier) {
        this.typeQualifier = typeQualifier;
    }

    public java.util.List<AllowedValueInput> getNewAllowedValues() {
        return newAllowedValues;
    }
    public void setNewAllowedValues(java.util.List<AllowedValueInput> newAllowedValues) {
        this.newAllowedValues = newAllowedValues;
    }

    public Boolean getSetCardinalityAsMultiple() {
        return setCardinalityAsMultiple;
    }
    public void setSetCardinalityAsMultiple(Boolean setCardinalityAsMultiple) {
        this.setCardinalityAsMultiple = setCardinalityAsMultiple;
    }

    public java.util.List<String> getNewEntityTypes() {
        return newEntityTypes;
    }
    public void setNewEntityTypes(java.util.List<String> newEntityTypes) {
        this.newEntityTypes = newEntityTypes;
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
        if (urn != null) {
            joiner.add("urn: \"" + urn + "\"");
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
        if (typeQualifier != null) {
            joiner.add("typeQualifier: " + typeQualifier);
        }
        if (newAllowedValues != null) {
            joiner.add("newAllowedValues: " + newAllowedValues);
        }
        if (setCardinalityAsMultiple != null) {
            joiner.add("setCardinalityAsMultiple: " + setCardinalityAsMultiple);
        }
        if (newEntityTypes != null) {
            joiner.add("newEntityTypes: " + newEntityTypes);
        }
        if (settings != null) {
            joiner.add("settings: " + settings);
        }
        return joiner.toString();
    }

    public static UpdateStructuredPropertyInput.Builder builder() {
        return new UpdateStructuredPropertyInput.Builder();
    }

    public static class Builder {

        private String urn;
        private String displayName;
        private String description;
        private Boolean immutable;
        private UpdateTypeQualifierInput typeQualifier;
        private java.util.List<AllowedValueInput> newAllowedValues;
        private Boolean setCardinalityAsMultiple;
        private java.util.List<String> newEntityTypes;
        private StructuredPropertySettingsInput settings;

        public Builder() {
        }

        public Builder setUrn(String urn) {
            this.urn = urn;
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

        public Builder setTypeQualifier(UpdateTypeQualifierInput typeQualifier) {
            this.typeQualifier = typeQualifier;
            return this;
        }

        public Builder setNewAllowedValues(java.util.List<AllowedValueInput> newAllowedValues) {
            this.newAllowedValues = newAllowedValues;
            return this;
        }

        public Builder setSetCardinalityAsMultiple(Boolean setCardinalityAsMultiple) {
            this.setCardinalityAsMultiple = setCardinalityAsMultiple;
            return this;
        }

        public Builder setNewEntityTypes(java.util.List<String> newEntityTypes) {
            this.newEntityTypes = newEntityTypes;
            return this;
        }

        public Builder setSettings(StructuredPropertySettingsInput settings) {
            this.settings = settings;
            return this;
        }


        public UpdateStructuredPropertyInput build() {
            return new UpdateStructuredPropertyInput(urn, displayName, description, immutable, typeQualifier, newAllowedValues, setCardinalityAsMultiple, newEntityTypes, settings);
        }

    }
}
