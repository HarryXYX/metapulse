package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Attributes defining an ROW_COUNT_CHANGE volume assertion.
 */
public class RowCountChange implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AssertionValueChangeType type;
    @javax.annotation.Nonnull
    private AssertionStdOperator operator;
    @javax.annotation.Nonnull
    private AssertionStdParameters parameters;

    public RowCountChange() {
    }

    public RowCountChange(AssertionValueChangeType type, AssertionStdOperator operator, AssertionStdParameters parameters) {
        this.type = type;
        this.operator = operator;
        this.parameters = parameters;
    }

    /**
     * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
     */
    public AssertionValueChangeType getType() {
        return type;
    }
    /**
     * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
     */
    public void setType(AssertionValueChangeType type) {
        this.type = type;
    }

    /**
     * The operator you'd like to apply.
Note that only numeric operators are valid inputs:
GREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,
BETWEEN.
     */
    public AssertionStdOperator getOperator() {
        return operator;
    }
    /**
     * The operator you'd like to apply.
Note that only numeric operators are valid inputs:
GREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,
BETWEEN.
     */
    public void setOperator(AssertionStdOperator operator) {
        this.operator = operator;
    }

    /**
     * The parameters you'd like to provide as input to the operator.
Note that only numeric parameter types are valid inputs: NUMBER.
     */
    public AssertionStdParameters getParameters() {
        return parameters;
    }
    /**
     * The parameters you'd like to provide as input to the operator.
Note that only numeric parameter types are valid inputs: NUMBER.
     */
    public void setParameters(AssertionStdParameters parameters) {
        this.parameters = parameters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (type != null) {
            joiner.add("type: " + type);
        }
        if (operator != null) {
            joiner.add("operator: " + operator);
        }
        if (parameters != null) {
            joiner.add("parameters: " + parameters);
        }
        return joiner.toString();
    }

    public static RowCountChange.Builder builder() {
        return new RowCountChange.Builder();
    }

    public static class Builder {

        private AssertionValueChangeType type;
        private AssertionStdOperator operator;
        private AssertionStdParameters parameters;

        public Builder() {
        }

        /**
         * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
         */
        public Builder setType(AssertionValueChangeType type) {
            this.type = type;
            return this;
        }

        /**
         * The operator you'd like to apply.
Note that only numeric operators are valid inputs:
GREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,
BETWEEN.
         */
        public Builder setOperator(AssertionStdOperator operator) {
            this.operator = operator;
            return this;
        }

        /**
         * The parameters you'd like to provide as input to the operator.
Note that only numeric parameter types are valid inputs: NUMBER.
         */
        public Builder setParameters(AssertionStdParameters parameters) {
            this.parameters = parameters;
            return this;
        }


        public RowCountChange build() {
            return new RowCountChange(type, operator, parameters);
        }

    }
}
