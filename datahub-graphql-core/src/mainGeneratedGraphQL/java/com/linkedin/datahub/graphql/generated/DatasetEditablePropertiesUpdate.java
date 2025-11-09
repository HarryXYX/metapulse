package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Update to writable Dataset fields
 */
public class DatasetEditablePropertiesUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String description;
    private String name;

    public DatasetEditablePropertiesUpdate() {
    }

    public DatasetEditablePropertiesUpdate(String description, String name) {
        this.description = description;
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
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

    public static DatasetEditablePropertiesUpdate.Builder builder() {
        return new DatasetEditablePropertiesUpdate.Builder();
    }

    public static class Builder {

        private String description;
        private String name;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }


        public DatasetEditablePropertiesUpdate build() {
            return new DatasetEditablePropertiesUpdate(description, name);
        }

    }
}
