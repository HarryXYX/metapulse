package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class MLModelFactors implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<String> groups;
    private java.util.List<String> instrumentation;
    private java.util.List<String> environment;

    public MLModelFactors() {
    }

    public MLModelFactors(java.util.List<String> groups, java.util.List<String> instrumentation, java.util.List<String> environment) {
        this.groups = groups;
        this.instrumentation = instrumentation;
        this.environment = environment;
    }

    /**
     * Distinct categories with similar characteristics that are present in the evaluation data instances
     */
    public java.util.List<String> getGroups() {
        return groups;
    }
    /**
     * Distinct categories with similar characteristics that are present in the evaluation data instances
     */
    public void setGroups(java.util.List<String> groups) {
        this.groups = groups;
    }

    /**
     * Instrumentation used for MLModel
     */
    public java.util.List<String> getInstrumentation() {
        return instrumentation;
    }
    /**
     * Instrumentation used for MLModel
     */
    public void setInstrumentation(java.util.List<String> instrumentation) {
        this.instrumentation = instrumentation;
    }

    /**
     * Environment in which the MLModel is deployed
     */
    public java.util.List<String> getEnvironment() {
        return environment;
    }
    /**
     * Environment in which the MLModel is deployed
     */
    public void setEnvironment(java.util.List<String> environment) {
        this.environment = environment;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (groups != null) {
            joiner.add("groups: " + groups);
        }
        if (instrumentation != null) {
            joiner.add("instrumentation: " + instrumentation);
        }
        if (environment != null) {
            joiner.add("environment: " + environment);
        }
        return joiner.toString();
    }

    public static MLModelFactors.Builder builder() {
        return new MLModelFactors.Builder();
    }

    public static class Builder {

        private java.util.List<String> groups;
        private java.util.List<String> instrumentation;
        private java.util.List<String> environment;

        public Builder() {
        }

        /**
         * Distinct categories with similar characteristics that are present in the evaluation data instances
         */
        public Builder setGroups(java.util.List<String> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * Instrumentation used for MLModel
         */
        public Builder setInstrumentation(java.util.List<String> instrumentation) {
            this.instrumentation = instrumentation;
            return this;
        }

        /**
         * Environment in which the MLModel is deployed
         */
        public Builder setEnvironment(java.util.List<String> environment) {
            this.environment = environment;
            return this;
        }


        public MLModelFactors build() {
            return new MLModelFactors(groups, instrumentation, environment);
        }

    }
}
