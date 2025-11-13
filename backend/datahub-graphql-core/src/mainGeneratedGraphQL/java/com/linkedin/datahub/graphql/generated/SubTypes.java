package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class SubTypes implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> typeNames;

    public SubTypes() {
    }

    public SubTypes(java.util.List<String> typeNames) {
        this.typeNames = typeNames;
    }

    /**
     * The sub-types that this entity implements. e.g. Datasets that are views will implement the "view" subtype
     */
    public java.util.List<String> getTypeNames() {
        return typeNames;
    }
    /**
     * The sub-types that this entity implements. e.g. Datasets that are views will implement the "view" subtype
     */
    public void setTypeNames(java.util.List<String> typeNames) {
        this.typeNames = typeNames;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (typeNames != null) {
            joiner.add("typeNames: " + typeNames);
        }
        return joiner.toString();
    }

    public static SubTypes.Builder builder() {
        return new SubTypes.Builder();
    }

    public static class Builder {

        private java.util.List<String> typeNames;

        public Builder() {
        }

        /**
         * The sub-types that this entity implements. e.g. Datasets that are views will implement the "view" subtype
         */
        public Builder setTypeNames(java.util.List<String> typeNames) {
            this.typeNames = typeNames;
            return this;
        }


        public SubTypes build() {
            return new SubTypes(typeNames);
        }

    }
}
