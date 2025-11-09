package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Details about the ERModelRelationship
 */
public class RelationshipFieldMappingInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String sourceField;
    private String destinationField;

    public RelationshipFieldMappingInput() {
    }

    public RelationshipFieldMappingInput(String sourceField, String destinationField) {
        this.sourceField = sourceField;
        this.destinationField = destinationField;
    }

    public String getSourceField() {
        return sourceField;
    }
    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }

    public String getDestinationField() {
        return destinationField;
    }
    public void setDestinationField(String destinationField) {
        this.destinationField = destinationField;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (sourceField != null) {
            joiner.add("sourceField: \"" + sourceField + "\"");
        }
        if (destinationField != null) {
            joiner.add("destinationField: \"" + destinationField + "\"");
        }
        return joiner.toString();
    }

    public static RelationshipFieldMappingInput.Builder builder() {
        return new RelationshipFieldMappingInput.Builder();
    }

    public static class Builder {

        private String sourceField;
        private String destinationField;

        public Builder() {
        }

        public Builder setSourceField(String sourceField) {
            this.sourceField = sourceField;
            return this;
        }

        public Builder setDestinationField(String destinationField) {
            this.destinationField = destinationField;
            return this;
        }


        public RelationshipFieldMappingInput build() {
            return new RelationshipFieldMappingInput(sourceField, destinationField);
        }

    }
}
