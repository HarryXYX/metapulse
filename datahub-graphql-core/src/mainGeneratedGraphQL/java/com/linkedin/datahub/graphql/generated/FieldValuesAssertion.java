package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A definition of a Field Values assertion.
 */
public class FieldValuesAssertion implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private SchemaFieldSpec field;
    private FieldTransform transform;
    @javax.annotation.Nonnull
    private AssertionStdOperator operator;
    private AssertionStdParameters parameters;
    @javax.annotation.Nonnull
    private FieldValuesFailThreshold failThreshold;
    private boolean excludeNulls;

    public FieldValuesAssertion() {
    }

    public FieldValuesAssertion(SchemaFieldSpec field, FieldTransform transform, AssertionStdOperator operator, AssertionStdParameters parameters, FieldValuesFailThreshold failThreshold, boolean excludeNulls) {
        this.field = field;
        this.transform = transform;
        this.operator = operator;
        this.parameters = parameters;
        this.failThreshold = failThreshold;
        this.excludeNulls = excludeNulls;
    }

    /**
     * The field under evaluation.
     */
    public SchemaFieldSpec getField() {
        return field;
    }
    /**
     * The field under evaluation.
     */
    public void setField(SchemaFieldSpec field) {
        this.field = field;
    }

    /**
     * An optional transform to apply to field values before evaluating the operator.
     */
    public FieldTransform getTransform() {
        return transform;
    }
    /**
     * An optional transform to apply to field values before evaluating the operator.
     */
    public void setTransform(FieldTransform transform) {
        this.transform = transform;
    }

    /**
     * The predicate to evaluate against a single value of the field.
Depending on the operator, parameters may be required
     */
    public AssertionStdOperator getOperator() {
        return operator;
    }
    /**
     * The predicate to evaluate against a single value of the field.
Depending on the operator, parameters may be required
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

    /**
     * Additional customization about when the assertion should be officially considered failing.
     */
    public FieldValuesFailThreshold getFailThreshold() {
        return failThreshold;
    }
    /**
     * Additional customization about when the assertion should be officially considered failing.
     */
    public void setFailThreshold(FieldValuesFailThreshold failThreshold) {
        this.failThreshold = failThreshold;
    }

    /**
     * Whether to ignore or allow nulls when running the values assertion.
     */
    public boolean getExcludeNulls() {
        return excludeNulls;
    }
    /**
     * Whether to ignore or allow nulls when running the values assertion.
     */
    public void setExcludeNulls(boolean excludeNulls) {
        this.excludeNulls = excludeNulls;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (field != null) {
            joiner.add("field: " + field);
        }
        if (transform != null) {
            joiner.add("transform: " + transform);
        }
        if (operator != null) {
            joiner.add("operator: " + operator);
        }
        if (parameters != null) {
            joiner.add("parameters: " + parameters);
        }
        if (failThreshold != null) {
            joiner.add("failThreshold: " + failThreshold);
        }
        joiner.add("excludeNulls: " + excludeNulls);
        return joiner.toString();
    }

    public static FieldValuesAssertion.Builder builder() {
        return new FieldValuesAssertion.Builder();
    }

    public static class Builder {

        private SchemaFieldSpec field;
        private FieldTransform transform;
        private AssertionStdOperator operator;
        private AssertionStdParameters parameters;
        private FieldValuesFailThreshold failThreshold;
        private boolean excludeNulls;

        public Builder() {
        }

        /**
         * The field under evaluation.
         */
        public Builder setField(SchemaFieldSpec field) {
            this.field = field;
            return this;
        }

        /**
         * An optional transform to apply to field values before evaluating the operator.
         */
        public Builder setTransform(FieldTransform transform) {
            this.transform = transform;
            return this;
        }

        /**
         * The predicate to evaluate against a single value of the field.
Depending on the operator, parameters may be required
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

        /**
         * Additional customization about when the assertion should be officially considered failing.
         */
        public Builder setFailThreshold(FieldValuesFailThreshold failThreshold) {
            this.failThreshold = failThreshold;
            return this;
        }

        /**
         * Whether to ignore or allow nulls when running the values assertion.
         */
        public Builder setExcludeNulls(boolean excludeNulls) {
            this.excludeNulls = excludeNulls;
            return this;
        }


        public FieldValuesAssertion build() {
            return new FieldValuesAssertion(field, transform, operator, parameters, failThreshold, excludeNulls);
        }

    }
}
