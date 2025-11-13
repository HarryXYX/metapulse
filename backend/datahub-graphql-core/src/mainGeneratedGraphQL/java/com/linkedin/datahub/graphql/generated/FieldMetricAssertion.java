package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A definition of a Field Metric assertion.
 */
public class FieldMetricAssertion implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private SchemaFieldSpec field;
    @javax.annotation.Nonnull
    private FieldMetricType metric;
    @javax.annotation.Nonnull
    private AssertionStdOperator operator;
    private AssertionStdParameters parameters;

    public FieldMetricAssertion() {
    }

    public FieldMetricAssertion(SchemaFieldSpec field, FieldMetricType metric, AssertionStdOperator operator, AssertionStdParameters parameters) {
        this.field = field;
        this.metric = metric;
        this.operator = operator;
        this.parameters = parameters;
    }

    /**
     * The field under evaluation
     */
    public SchemaFieldSpec getField() {
        return field;
    }
    /**
     * The field under evaluation
     */
    public void setField(SchemaFieldSpec field) {
        this.field = field;
    }

    /**
     * The specific metric to assert against.
     */
    public FieldMetricType getMetric() {
        return metric;
    }
    /**
     * The specific metric to assert against.
     */
    public void setMetric(FieldMetricType metric) {
        this.metric = metric;
    }

    /**
     * The predicate to evaluate against the metric for the field / column.
     */
    public AssertionStdOperator getOperator() {
        return operator;
    }
    /**
     * The predicate to evaluate against the metric for the field / column.
     */
    public void setOperator(AssertionStdOperator operator) {
        this.operator = operator;
    }

    /**
     * Standard parameters required for the assertion.
     */
    public AssertionStdParameters getParameters() {
        return parameters;
    }
    /**
     * Standard parameters required for the assertion.
     */
    public void setParameters(AssertionStdParameters parameters) {
        this.parameters = parameters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (field != null) {
            joiner.add("field: " + field);
        }
        if (metric != null) {
            joiner.add("metric: " + metric);
        }
        if (operator != null) {
            joiner.add("operator: " + operator);
        }
        if (parameters != null) {
            joiner.add("parameters: " + parameters);
        }
        return joiner.toString();
    }

    public static FieldMetricAssertion.Builder builder() {
        return new FieldMetricAssertion.Builder();
    }

    public static class Builder {

        private SchemaFieldSpec field;
        private FieldMetricType metric;
        private AssertionStdOperator operator;
        private AssertionStdParameters parameters;

        public Builder() {
        }

        /**
         * The field under evaluation
         */
        public Builder setField(SchemaFieldSpec field) {
            this.field = field;
            return this;
        }

        /**
         * The specific metric to assert against.
         */
        public Builder setMetric(FieldMetricType metric) {
            this.metric = metric;
            return this;
        }

        /**
         * The predicate to evaluate against the metric for the field / column.
         */
        public Builder setOperator(AssertionStdOperator operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Standard parameters required for the assertion.
         */
        public Builder setParameters(AssertionStdParameters parameters) {
            this.parameters = parameters;
            return this;
        }


        public FieldMetricAssertion build() {
            return new FieldMetricAssertion(field, metric, operator, parameters);
        }

    }
}
