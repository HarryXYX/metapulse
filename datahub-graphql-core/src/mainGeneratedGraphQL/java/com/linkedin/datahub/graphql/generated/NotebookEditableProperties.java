package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Notebook properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
public class NotebookEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    public NotebookEditableProperties() {
    }

    public NotebookEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Notebook
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Notebook
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

    public static NotebookEditableProperties.Builder builder() {
        return new NotebookEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Notebook
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public NotebookEditableProperties build() {
            return new NotebookEditableProperties(description);
        }

    }
}
