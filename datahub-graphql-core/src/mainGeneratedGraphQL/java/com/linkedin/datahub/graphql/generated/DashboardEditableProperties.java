package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Dashboard properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
public class DashboardEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    public DashboardEditableProperties() {
    }

    public DashboardEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Dashboard
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Dashboard
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

    public static DashboardEditableProperties.Builder builder() {
        return new DashboardEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Dashboard
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DashboardEditableProperties build() {
            return new DashboardEditableProperties(description);
        }

    }
}
