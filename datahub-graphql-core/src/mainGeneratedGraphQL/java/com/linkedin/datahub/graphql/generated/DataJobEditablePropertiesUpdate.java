package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Update to writable Data Job fields
 */
public class DataJobEditablePropertiesUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String description;

    public DataJobEditablePropertiesUpdate() {
    }

    public DataJobEditablePropertiesUpdate(String description) {
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

    public static DataJobEditablePropertiesUpdate.Builder builder() {
        return new DataJobEditablePropertiesUpdate.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DataJobEditablePropertiesUpdate build() {
            return new DataJobEditablePropertiesUpdate(description);
        }

    }
}
