package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Chart properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
public class ChartEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    public ChartEditableProperties() {
    }

    public ChartEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Chart
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Chart
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

    public static ChartEditableProperties.Builder builder() {
        return new ChartEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Chart
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public ChartEditableProperties build() {
            return new ChartEditableProperties(description);
        }

    }
}
