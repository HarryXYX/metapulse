package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Data Flow properties that are editable via the UI This represents logical metadata,
as opposed to technical metadata
 */
public class DataFlowEditableProperties implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String description;

    public DataFlowEditableProperties() {
    }

    public DataFlowEditableProperties(String description) {
        this.description = description;
    }

    /**
     * Description of the Data Flow
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of the Data Flow
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

    public static DataFlowEditableProperties.Builder builder() {
        return new DataFlowEditableProperties.Builder();
    }

    public static class Builder {

        private String description;

        public Builder() {
        }

        /**
         * Description of the Data Flow
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }


        public DataFlowEditableProperties build() {
            return new DataFlowEditableProperties(description);
        }

    }
}
