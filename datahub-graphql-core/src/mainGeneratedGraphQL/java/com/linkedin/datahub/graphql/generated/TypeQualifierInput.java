package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for specifying specific entity types as values
 */
public class TypeQualifierInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> allowedTypes;

    public TypeQualifierInput() {
    }

    public TypeQualifierInput(java.util.List<String> allowedTypes) {
        this.allowedTypes = allowedTypes;
    }

    public java.util.List<String> getAllowedTypes() {
        return allowedTypes;
    }
    public void setAllowedTypes(java.util.List<String> allowedTypes) {
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

    public static TypeQualifierInput.Builder builder() {
        return new TypeQualifierInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> allowedTypes;

        public Builder() {
        }

        public Builder setAllowedTypes(java.util.List<String> allowedTypes) {
            this.allowedTypes = allowedTypes;
            return this;
        }


        public TypeQualifierInput build() {
            return new TypeQualifierInput(allowedTypes);
        }

    }
}
