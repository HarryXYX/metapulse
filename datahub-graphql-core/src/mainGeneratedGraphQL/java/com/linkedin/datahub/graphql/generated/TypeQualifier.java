package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Allows for type specialization of the valueType to be more specific about which
entity types are allowed, for example.
 */
public class TypeQualifier implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<EntityTypeEntity> allowedTypes;

    public TypeQualifier() {
    }

    public TypeQualifier(java.util.List<EntityTypeEntity> allowedTypes) {
        this.allowedTypes = allowedTypes;
    }

    /**
     * The list of allowed entity types
     */
    public java.util.List<EntityTypeEntity> getAllowedTypes() {
        return allowedTypes;
    }
    /**
     * The list of allowed entity types
     */
    public void setAllowedTypes(java.util.List<EntityTypeEntity> allowedTypes) {
        this.allowedTypes = allowedTypes;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (allowedTypes != null) {
            joiner.add("allowedTypes: " + allowedTypes);
        }
        return joiner.toString();
    }

    public static TypeQualifier.Builder builder() {
        return new TypeQualifier.Builder();
    }

    public static class Builder {

        private java.util.List<EntityTypeEntity> allowedTypes;

        public Builder() {
        }

        /**
         * The list of allowed entity types
         */
        public Builder setAllowedTypes(java.util.List<EntityTypeEntity> allowedTypes) {
            this.allowedTypes = allowedTypes;
            return this;
        }


        public TypeQualifier build() {
            return new TypeQualifier(allowedTypes);
        }

    }
}
