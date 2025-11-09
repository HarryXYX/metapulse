package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

/**
 * A DataHub View Filter. Note that
 */
public class DataHubViewFilter implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private LogicalOperator operator;
    @javax.annotation.Nonnull
    private java.util.List<FacetFilter> filters;

    public DataHubViewFilter() {
    }

    public DataHubViewFilter(LogicalOperator operator, java.util.List<FacetFilter> filters) {
        this.operator = operator;
        this.filters = filters;
    }

    /**
     * The operator used to combine the filters.
     */
    public LogicalOperator getOperator() {
        return operator;
    }
    /**
     * The operator used to combine the filters.
     */
    public void setOperator(LogicalOperator operator) {
        this.operator = operator;
    }

    /**
     * A set of filters combined using the operator. If left empty, then no filters will be applied.
     */
    public java.util.List<FacetFilter> getFilters() {
        return filters;
    }
    /**
     * A set of filters combined using the operator. If left empty, then no filters will be applied.
     */
    public void setFilters(java.util.List<FacetFilter> filters) {
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

    public static DataHubViewFilter.Builder builder() {
        return new DataHubViewFilter.Builder();
    }

    public static class Builder {

        private LogicalOperator operator;
        private java.util.List<FacetFilter> filters;

        public Builder() {
        }

        /**
         * The operator used to combine the filters.
         */
        public Builder setOperator(LogicalOperator operator) {
            this.operator = operator;
            return this;
        }

        /**
         * A set of filters combined using the operator. If left empty, then no filters will be applied.
         */
        public Builder setFilters(java.util.List<FacetFilter> filters) {
            this.filters = filters;
            return this;
        }


        public DataHubViewFilter build() {
            return new DataHubViewFilter(operator, filters);
        }

    }
}
