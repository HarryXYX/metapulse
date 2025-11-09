package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Update to writable Dashboard fields
 */
public class DashboardEditablePropertiesUpdate implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String description;

    public DashboardEditablePropertiesUpdate() {
    }

    public DashboardEditablePropertiesUpdate(String description) {
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

    public static DashboardEditablePropertiesUpdate.Builder builder() {
        return new DashboardEditablePropertiesUpdate.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DashboardEditablePropertiesUpdate build() {
            return new DashboardEditablePropertiesUpdate(description);
        }

    }
}
