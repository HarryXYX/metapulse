package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Attributes defining an INCREMENTING_SEGMENT_ROW_COUNT_TOTAL volume assertion.
 */
public class IncrementingSegmentRowCountTotal implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private IncrementingSegmentSpec segment;
    @javax.annotation.Nonnull
    private AssertionStdOperator operator;
    @javax.annotation.Nonnull
    private AssertionStdParameters parameters;

    public IncrementingSegmentRowCountTotal() {
    }

    public IncrementingSegmentRowCountTotal(IncrementingSegmentSpec segment, AssertionStdOperator operator, AssertionStdParameters parameters) {
        this.segment = segment;
        this.operator = operator;
        this.parameters = parameters;
    }

    /**
     * A specification of how the 'segment' can be derived using a column and an optional transformer function.
     */
    public IncrementingSegmentSpec getSegment() {
        return segment;
    }
    /**
     * A specification of how the 'segment' can be derived using a column and an optional transformer function.
     */
    public void setSegment(IncrementingSegmentSpec segment) {
        this.segment = segment;
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
        if (segment != null) {
            joiner.add("segment: " + segment);
        }
        if (operator != null) {
            joiner.add("operator: " + operator);
        }
        if (parameters != null) {
            joiner.add("parameters: " + parameters);
        }
        return joiner.toString();
    }

    public static IncrementingSegmentRowCountTotal.Builder builder() {
        return new IncrementingSegmentRowCountTotal.Builder();
    }

    public static class Builder {

        private IncrementingSegmentSpec segment;
        private AssertionStdOperator operator;
        private AssertionStdParameters parameters;

        public Builder() {
        }

        /**
         * A specification of how the 'segment' can be derived using a column and an optional transformer function.
         */
        public Builder setSegment(IncrementingSegmentSpec segment) {
            this.segment = segment;
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


        public IncrementingSegmentRowCountTotal build() {
            return new IncrementingSegmentRowCountTotal(segment, operator, parameters);
        }

    }
}
