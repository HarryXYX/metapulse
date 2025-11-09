package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Dataset properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
public class DatasetEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;
    private String name;

    public DatasetEditableProperties() {
    }

    public DatasetEditableProperties(String description, String name) {
        this.description = description;
        this.name = name;
    }

    /**
     * Description of the Dataset
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Dataset
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Editable name of the Dataset
     */
    public String getName() {
        return name;
    }
    /**
     * Editable name of the Dataset
     */
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        return joiner.toString();
    }

    public static DatasetEditableProperties.Builder builder() {
        return new DatasetEditableProperties.Builder();
    }

    public static class Builder {

        private String description;
        private String name;

        public Builder() {
        }

        /**
         * Description of the Dataset
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * Editable name of the Dataset
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public DatasetEditableProperties build() {
            return new DatasetEditableProperties(description, name);
        }

    }
}
