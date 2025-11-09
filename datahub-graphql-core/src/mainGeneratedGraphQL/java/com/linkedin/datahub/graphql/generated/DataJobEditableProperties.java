package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Data Job properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
public class DataJobEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    public DataJobEditableProperties() {
    }

    public DataJobEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Data Job
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Data Job
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

    public static DataJobEditableProperties.Builder builder() {
        return new DataJobEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Data Job
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DataJobEditableProperties build() {
            return new DataJobEditableProperties(description);
        }

    }
}
