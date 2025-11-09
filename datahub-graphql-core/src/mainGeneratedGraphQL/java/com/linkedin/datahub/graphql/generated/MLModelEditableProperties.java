package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class MLModelEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    public MLModelEditableProperties() {
    }

    public MLModelEditableProperties(String description) {
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

    public static MLModelEditableProperties.Builder builder() {
        return new MLModelEditableProperties.Builder();
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


        public MLModelEditableProperties build() {
            return new MLModelEditableProperties(description);
        }

    }
}
