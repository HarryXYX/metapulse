package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class MLMetric implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private String description;
    private String value;
    private Long createdAt;

    public MLMetric() {
    }

    public MLMetric(String name, String description, String value, Long createdAt) {
        this.name = name;
        this.description = description;
        this.value = value;
        this.createdAt = createdAt;
    }

    /**
     * Name of the metric (e.g. accuracy, precision, recall)
     */
    public String getName() {
        return name;
    }
    /**
     * Name of the metric (e.g. accuracy, precision, recall)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Description of what this metric measures
     */
    public String getDescription() {
        return description;
    }
    /**
     * Description of what this metric measures
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * The computed value of the metric
     */
    public String getValue() {
        return value;
    }
    /**
     * The computed value of the metric
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Timestamp when this metric was recorded
     */
    public Long getCreatedAt() {
        return createdAt;
    }
    /**
     * Timestamp when this metric was recorded
     */
    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (name != null) {
            joiner.add("name: \"" + name + "\"");
        }
        if (description != null) {
            joiner.add("description: \"" + description + "\"");
        }
        if (value != null) {
            joiner.add("value: \"" + value + "\"");
        }
        if (createdAt != null) {
            joiner.add("createdAt: " + createdAt);
        }
        return joiner.toString();
    }

    public static MLMetric.Builder builder() {
        return new MLMetric.Builder();
    }

    public static class Builder {

        private String name;
        private String description;
        private String value;
        private Long createdAt;

        public Builder() {
        }

        /**
         * Name of the metric (e.g. accuracy, precision, recall)
         */
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Description of what this metric measures
         */
        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        /**
         * The computed value of the metric
         */
        public Builder setValue(String value) {
            this.value = value;
            return this;
        }

        /**
         * Timestamp when this metric was recorded
         */
        public Builder setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }


        public MLMetric build() {
            return new MLMetric(name, description, value, createdAt);
        }

    }
}
