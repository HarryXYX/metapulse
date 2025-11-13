package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class MLFeatureEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    public MLFeatureEditableProperties() {
    }

    public MLFeatureEditableProperties(String description) {
        this.description = description;
    }

    /**
     * The edited description
     */
    public String getDescription() {
        return description;
    }
    /**
     * The edited description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        return joiner.toString();
    }

    public static MLFeatureEditableProperties.Builder builder() {
        return new MLFeatureEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * The edited description
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public MLFeatureEditableProperties build() {
            return new MLFeatureEditableProperties(description);
        }

    }
}
