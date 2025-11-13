package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required to create/update a new ERModelRelationship
 */
public class ERModelRelationshipUpdateInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private ERModelRelationshipPropertiesInput properties;
    private ERModelRelationshipEditablePropertiesUpdate editableProperties;

    public ERModelRelationshipUpdateInput() {
    }

    public ERModelRelationshipUpdateInput(ERModelRelationshipPropertiesInput properties, ERModelRelationshipEditablePropertiesUpdate editableProperties) {
        this.properties = properties;
        this.editableProperties = editableProperties;
    }

    public ERModelRelationshipPropertiesInput getProperties() {
        return properties;
    }
    public void setProperties(ERModelRelationshipPropertiesInput properties) {
        this.properties = properties;
    }

    public ERModelRelationshipEditablePropertiesUpdate getEditableProperties() {
        return editableProperties;
    }
    public void setEditableProperties(ERModelRelationshipEditablePropertiesUpdate editableProperties) {
        this.editableProperties = editableProperties;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (properties != null) {
            joiner.add("properties: " + properties);
        }
        if (editableProperties != null) {
            joiner.add("editableProperties: " + editableProperties);
        }
        return joiner.toString();
    }

    public static ERModelRelationshipUpdateInput.Builder builder() {
        return new ERModelRelationshipUpdateInput.Builder();
    }

    public static class Builder {

        private ERModelRelationshipPropertiesInput properties;
        private ERModelRelationshipEditablePropertiesUpdate editableProperties;

        public Builder() {
        }

        public Builder setProperties(ERModelRelationshipPropertiesInput properties) {
            this.properties = properties;
            return this;
        }

        public Builder setEditableProperties(ERModelRelationshipEditablePropertiesUpdate editableProperties) {
            this.editableProperties = editableProperties;
            return this;
        }


        public ERModelRelationshipUpdateInput build() {
            return new ERModelRelationshipUpdateInput(properties, editableProperties);
        }

    }
}
