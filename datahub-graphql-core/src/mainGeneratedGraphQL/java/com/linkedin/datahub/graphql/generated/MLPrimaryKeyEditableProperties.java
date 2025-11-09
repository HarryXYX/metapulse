package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class MLPrimaryKeyEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    public MLPrimaryKeyEditableProperties() {
    }

    public MLPrimaryKeyEditableProperties(String description) {
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

    public static MLPrimaryKeyEditableProperties.Builder builder() {
        return new MLPrimaryKeyEditableProperties.Builder();
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


        public MLPrimaryKeyEditableProperties build() {
            return new MLPrimaryKeyEditableProperties(description);
        }

    }
}
