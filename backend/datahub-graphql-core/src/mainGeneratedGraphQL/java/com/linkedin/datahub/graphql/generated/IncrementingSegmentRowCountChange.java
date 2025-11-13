package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Attributes defining an INCREMENTING_SEGMENT_ROW_COUNT_CHANGE volume assertion.
 */
public class IncrementingSegmentRowCountChange implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private IncrementingSegmentSpec segment;
    @javax.annotation.Nonnull
    private AssertionValueChangeType type;
    @javax.annotation.Nonnull
    private AssertionStdOperator operator;
    @javax.annotation.Nonnull
    private AssertionStdParameters parameters;

    public IncrementingSegmentRowCountChange() {
    }

    public IncrementingSegmentRowCountChange(IncrementingSegmentSpec segment, AssertionValueChangeType type, AssertionStdOperator operator, AssertionStdParameters parameters) {
        this.segment = segment;
        this.type = type;
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
     * The operator you'd like to apply to the row count value
Note that only numeric operators are valid inputs:
GREATER_THAN, GREATER_THAN_OR_EQUAL_TO, EQUAL_TO, LESS_THAN, LESS_THAN_OR_EQUAL_TO,
BETWEEN.
     */
    public AssertionStdOperator getOperator() {
        return operator;
    }
    /**
     * The operator you'd like to apply to the row count value
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

    public static IncrementingSegmentRowCountChange.Builder builder() {
        return new IncrementingSegmentRowCountChange.Builder();
    }

    public static class Builder {

        private IncrementingSegmentSpec segment;
        private AssertionValueChangeType type;
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
         * The type of the value used to evaluate the assertion: a fixed absolute value or a relative percentage.
         */
        public Builder setType(AssertionValueChangeType type) {
            this.type = type;
            return this;
        }

        /**
         * The operator you'd like to apply to the row count value
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


        public IncrementingSegmentRowCountChange build() {
            return new IncrementingSegmentRowCountChange(segment, type, operator, parameters);
        }

    }
}
