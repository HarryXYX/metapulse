package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * ERModelRelationship FieldMap
 */
public class RelationshipFieldMapping implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String sourceField;
    @javax.annotation.Nonnull
    private String destinationField;

    public RelationshipFieldMapping() {
    }

    public RelationshipFieldMapping(String sourceField, String destinationField) {
        this.sourceField = sourceField;
        this.destinationField = destinationField;
    }

    /**
     * left field
     */
    public String getSourceField() {
        return sourceField;
    }
    /**
     * left field
     */
    public void setSourceField(String sourceField) {
        this.sourceField = sourceField;
    }

    /**
     * bfield
     */
    public String getDestinationField() {
        return destinationField;
    }
    /**
     * bfield
     */
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

    public static RelationshipFieldMapping.Builder builder() {
        return new RelationshipFieldMapping.Builder();
    }

    public static class Builder {

        private String sourceField;
        private String destinationField;

        public Builder() {
        }

        /**
         * left field
         */
        public Builder setSourceField(String sourceField) {
            this.sourceField = sourceField;
            return this;
        }

        /**
         * bfield
         */
        public Builder setDestinationField(String destinationField) {
            this.destinationField = destinationField;
            return this;
        }


        public RelationshipFieldMapping build() {
            return new RelationshipFieldMapping(sourceField, destinationField);
        }

    }
}
