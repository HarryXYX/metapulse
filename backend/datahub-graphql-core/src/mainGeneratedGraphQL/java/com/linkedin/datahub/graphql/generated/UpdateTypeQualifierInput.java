package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input for updating specifying specific entity types as values
 */
public class UpdateTypeQualifierInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> newAllowedTypes;

    public UpdateTypeQualifierInput() {
    }

    public UpdateTypeQualifierInput(java.util.List<String> newAllowedTypes) {
        this.newAllowedTypes = newAllowedTypes;
    }

    public java.util.List<String> getNewAllowedTypes() {
        return newAllowedTypes;
    }
    public void setNewAllowedTypes(java.util.List<String> newAllowedTypes) {
        this.newAllowedTypes = newAllowedTypes;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (newAllowedTypes != null) {
            joiner.add("newAllowedTypes: " + newAllowedTypes);
        }
        return joiner.toString();
    }

    public static UpdateTypeQualifierInput.Builder builder() {
        return new UpdateTypeQualifierInput.Builder();
    }

    public static class Builder {

        private java.util.List<String> newAllowedTypes;

        public Builder() {
        }

        public Builder setNewAllowedTypes(java.util.List<String> newAllowedTypes) {
            this.newAllowedTypes = newAllowedTypes;
            return this;
        }


        public UpdateTypeQualifierInput build() {
            return new UpdateTypeQualifierInput(newAllowedTypes);
        }

    }
}
