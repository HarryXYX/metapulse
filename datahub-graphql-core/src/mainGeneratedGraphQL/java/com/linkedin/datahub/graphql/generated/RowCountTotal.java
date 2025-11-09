package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Attributes defining an ROW_COUNT_TOTAL volume assertion.
 */
public class RowCountTotal implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private AssertionStdOperator operator;
    @javax.annotation.Nonnull
    private AssertionStdParameters parameters;

    public RowCountTotal() {
    }

    public RowCountTotal(AssertionStdOperator operator, AssertionStdParameters parameters) {
        this.operator = operator;
        this.parameters = parameters;
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
        if (operator != null) {
            joiner.add("operator: " + operator);
        }
        if (parameters != null) {
            joiner.add("parameters: " + parameters);
        }
        return joiner.toString();
    }

    public static RowCountTotal.Builder builder() {
        return new RowCountTotal.Builder();
    }

    public static class Builder {

        private AssertionStdOperator operator;
        private AssertionStdParameters parameters;

        public Builder() {
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


        public RowCountTotal build() {
            return new RowCountTotal(operator, parameters);
        }

    }
}
