package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Detailed information about a Dataset Assertion
 */
public class DatasetAssertionInfo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private String datasetUrn;
    @javax.annotation.Nonnull
    private DatasetAssertionScope scope;
    private java.util.List<SchemaFieldRef> fields;
    private AssertionStdAggregation aggregation;
    @javax.annotation.Nonnull
    private AssertionStdOperator operator;
    private AssertionStdParameters parameters;
    private String nativeType;
    private java.util.List<StringMapEntry> nativeParameters;
    private String logic;

    public DatasetAssertionInfo() {
    }

    public DatasetAssertionInfo(String datasetUrn, DatasetAssertionScope scope, java.util.List<SchemaFieldRef> fields, AssertionStdAggregation aggregation, AssertionStdOperator operator, AssertionStdParameters parameters, String nativeType, java.util.List<StringMapEntry> nativeParameters, String logic) {
        this.datasetUrn = datasetUrn;
        this.scope = scope;
        this.fields = fields;
        this.aggregation = aggregation;
        this.operator = operator;
        this.parameters = parameters;
        this.nativeType = nativeType;
        this.nativeParameters = nativeParameters;
        this.logic = logic;
    }

    /**
     * The urn of the dataset that the assertion is related to
     */
    public String getDatasetUrn() {
        return datasetUrn;
    }
    /**
     * The urn of the dataset that the assertion is related to
     */
    public void setDatasetUrn(String datasetUrn) {
        this.datasetUrn = datasetUrn;
    }

    /**
     * The scope of the Dataset assertion.
     */
    public DatasetAssertionScope getScope() {
        return scope;
    }
    /**
     * The scope of the Dataset assertion.
     */
    public void setScope(DatasetAssertionScope scope) {
        this.scope = scope;
    }

    /**
     * The fields serving as input to the assertion. Empty if there are none.
     */
    public java.util.List<SchemaFieldRef> getFields() {
        return fields;
    }
    /**
     * The fields serving as input to the assertion. Empty if there are none.
     */
    public void setFields(java.util.List<SchemaFieldRef> fields) {
        this.fields = fields;
    }

    /**
     * Standardized assertion operator
     */
    public AssertionStdAggregation getAggregation() {
        return aggregation;
    }
    /**
     * Standardized assertion operator
     */
    public void setAggregation(AssertionStdAggregation aggregation) {
        this.aggregation = aggregation;
    }

    /**
     * Standardized assertion operator
     */
    public AssertionStdOperator getOperator() {
        return operator;
    }
    /**
     * Standardized assertion operator
     */
    public void setOperator(AssertionStdOperator operator) {
        this.operator = operator;
    }

    /**
     * Standard parameters required for the assertion. e.g. min_value, max_value, value, columns
     */
    public AssertionStdParameters getParameters() {
        return parameters;
    }
    /**
     * Standard parameters required for the assertion. e.g. min_value, max_value, value, columns
     */
    public void setParameters(AssertionStdParameters parameters) {
        this.parameters = parameters;
    }

    /**
     * The native operator for the assertion. For Great Expectations, this will contain the original expectation name.
     */
    public String getNativeType() {
        return nativeType;
    }
    /**
     * The native operator for the assertion. For Great Expectations, this will contain the original expectation name.
     */
    public void setNativeType(String nativeType) {
        this.nativeType = nativeType;
    }

    /**
     * Native parameters required for the assertion.
     */
    public java.util.List<StringMapEntry> getNativeParameters() {
        return nativeParameters;
    }
    /**
     * Native parameters required for the assertion.
     */
    public void setNativeParameters(java.util.List<StringMapEntry> nativeParameters) {
        this.nativeParameters = nativeParameters;
    }

    /**
     * Logic comprising a raw, unstructured assertion.
     */
    public String getLogic() {
        return logic;
    }
    /**
     * Logic comprising a raw, unstructured assertion.
     */
    public void setLogic(String logic) {
        this.logic = logic;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (datasetUrn != null) {
            joiner.add("datasetUrn: \"" + datasetUrn + "\"");
        }
        if (scope != null) {
            joiner.add("scope: " + scope);
        }
        if (fields != null) {
            joiner.add("fields: " + fields);
        }
        if (aggregation != null) {
            joiner.add("aggregation: " + aggregation);
        }
        if (operator != null) {
            joiner.add("operator: " + operator);
        }
        if (parameters != null) {
            joiner.add("parameters: " + parameters);
        }
        if (nativeType != null) {
            joiner.add("nativeType: \"" + nativeType + "\"");
        }
        if (nativeParameters != null) {
            joiner.add("nativeParameters: " + nativeParameters);
        }
        if (logic != null) {
            joiner.add("logic: \"" + logic + "\"");
        }
        return joiner.toString();
    }

    public static DatasetAssertionInfo.Builder builder() {
        return new DatasetAssertionInfo.Builder();
    }

    public static class Builder {

        private String datasetUrn;
        private DatasetAssertionScope scope;
        private java.util.List<SchemaFieldRef> fields;
        private AssertionStdAggregation aggregation;
        private AssertionStdOperator operator;
        private AssertionStdParameters parameters;
        private String nativeType;
        private java.util.List<StringMapEntry> nativeParameters;
        private String logic;

        public Builder() {
        }

        /**
         * The urn of the dataset that the assertion is related to
         */
        public Builder setDatasetUrn(String datasetUrn) {
            this.datasetUrn = datasetUrn;
            return this;
        }

        /**
         * The scope of the Dataset assertion.
         */
        public Builder setScope(DatasetAssertionScope scope) {
            this.scope = scope;
            return this;
        }

        /**
         * The fields serving as input to the assertion. Empty if there are none.
         */
        public Builder setFields(java.util.List<SchemaFieldRef> fields) {
            this.fields = fields;
            return this;
        }

        /**
         * Standardized assertion operator
         */
        public Builder setAggregation(AssertionStdAggregation aggregation) {
            this.aggregation = aggregation;
            return this;
        }

        /**
         * Standardized assertion operator
         */
        public Builder setOperator(AssertionStdOperator operator) {
            this.operator = operator;
            return this;
        }

        /**
         * Standard parameters required for the assertion. e.g. min_value, max_value, value, columns
         */
        public Builder setParameters(AssertionStdParameters parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * The native operator for the assertion. For Great Expectations, this will contain the original expectation name.
         */
        public Builder setNativeType(String nativeType) {
            this.nativeType = nativeType;
            return this;
        }

        /**
         * Native parameters required for the assertion.
         */
        public Builder setNativeParameters(java.util.List<StringMapEntry> nativeParameters) {
            this.nativeParameters = nativeParameters;
            return this;
        }

        /**
         * Logic comprising a raw, unstructured assertion.
         */
        public Builder setLogic(String logic) {
            this.logic = logic;
            return this;
        }


        public DatasetAssertionInfo build() {
            return new DatasetAssertionInfo(datasetUrn, scope, fields, aggregation, operator, parameters, nativeType, nativeParameters, logic);
        }

    }
}
