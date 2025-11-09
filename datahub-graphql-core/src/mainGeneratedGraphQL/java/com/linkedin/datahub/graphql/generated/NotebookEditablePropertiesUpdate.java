package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Update to writable Notebook fields
 */
public class NotebookEditablePropertiesUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String description;

    public NotebookEditablePropertiesUpdate() {
    }

    public NotebookEditablePropertiesUpdate(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
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

    public static NotebookEditablePropertiesUpdate.Builder builder() {
        return new NotebookEditablePropertiesUpdate.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public NotebookEditablePropertiesUpdate build() {
            return new NotebookEditablePropertiesUpdate(description);
        }

    }
}
