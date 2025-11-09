package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * Input required for creating a DataHub View Definition
 */
public class DataHubViewFilterInput implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private LogicalOperator operator;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilterInput> filters;

    public DataHubViewFilterInput() {
    }

    public DataHubViewFilterInput(LogicalOperator operator, java.util.List<FacetFilterInput> filters) {
        this.operator = operator;
        this.filters = filters;
    }

    public LogicalOperator getOperator() {
        return operator;
    }
    public void setOperator(LogicalOperator operator) {
        this.operator = operator;
    }

    public java.util.List<FacetFilterInput> getFilters() {
        return filters;
    }
    public void setFilters(java.util.List<FacetFilterInput> filters) {
        this.filters = filters;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (operator != null) {
            joiner.add("operator: " + operator);
        }
        if (filters != null) {
            joiner.add("filters: " + filters);
        }
        return joiner.toString();
    }

    public static DataHubViewFilterInput.Builder builder() {
        return new DataHubViewFilterInput.Builder();
    }

    public static class Builder {

        private LogicalOperator operator;
        private java.util.List<FacetFilterInput> filters;

        public Builder() {
        }

        public Builder setOperator(LogicalOperator operator) {
            this.operator = operator;
            return this;
        }

        public Builder setFilters(java.util.List<FacetFilterInput> filters) {
            this.filters = filters;
            return this;
        }


        public DataHubViewFilterInput build() {
            return new DataHubViewFilterInput(operator, filters);
        }

    }
}
