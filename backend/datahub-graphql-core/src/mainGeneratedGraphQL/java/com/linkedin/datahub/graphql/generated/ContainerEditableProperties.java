package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Read-write properties that originate in DataHub
 */
public class ContainerEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    public ContainerEditableProperties() {
    }

    public ContainerEditableProperties(String description) {
        this.description = description;
    }

    /**
     * DataHub description of the Container
     */
    public String getDescription() {
        return description;
    }
    /**
     * DataHub description of the Container
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

    public static ContainerEditableProperties.Builder builder() {
        return new ContainerEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * DataHub description of the Container
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public ContainerEditableProperties build() {
            return new ContainerEditableProperties(description);
        }

    }
}
