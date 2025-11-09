package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class MLFeatureTableEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    public MLFeatureTableEditableProperties() {
    }

    public MLFeatureTableEditableProperties(String description) {
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

    public static MLFeatureTableEditableProperties.Builder builder() {
        return new MLFeatureTableEditableProperties.Builder();
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


        public MLFeatureTableEditableProperties build() {
            return new MLFeatureTableEditableProperties(description);
        }

    }
}
