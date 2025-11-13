package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class QuantitativeAnalyses implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private ResultsType unitaryResults;
    private ResultsType intersectionalResults;

    public QuantitativeAnalyses() {
    }

    public QuantitativeAnalyses(ResultsType unitaryResults, ResultsType intersectionalResults) {
        this.unitaryResults = unitaryResults;
        this.intersectionalResults = intersectionalResults;
    }

    /**
     * Link to a dashboard with results showing how the model performed with respect to each factor
     */
    public ResultsType getUnitaryResults() {
        return unitaryResults;
    }
    /**
     * Link to a dashboard with results showing how the model performed with respect to each factor
     */
    public void setUnitaryResults(ResultsType unitaryResults) {
        this.unitaryResults = unitaryResults;
    }

    /**
     * Link to a dashboard with results showing how the model performed with respect to the intersection of evaluated factors
     */
    public ResultsType getIntersectionalResults() {
        return intersectionalResults;
    }
    /**
     * Link to a dashboard with results showing how the model performed with respect to the intersection of evaluated factors
     */
    public void setIntersectionalResults(ResultsType intersectionalResults) {
        this.intersectionalResults = intersectionalResults;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (unitaryResults != null) {
            joiner.add("unitaryResults: " + unitaryResults);
        }
        if (intersectionalResults != null) {
            joiner.add("intersectionalResults: " + intersectionalResults);
        }
        return joiner.toString();
    }

    public static QuantitativeAnalyses.Builder builder() {
        return new QuantitativeAnalyses.Builder();
    }

    public static class Builder {

        private ResultsType unitaryResults;
        private ResultsType intersectionalResults;

        public Builder() {
        }

        /**
         * Link to a dashboard with results showing how the model performed with respect to each factor
         */
        public Builder setUnitaryResults(ResultsType unitaryResults) {
            this.unitaryResults = unitaryResults;
            return this;
        }

        /**
         * Link to a dashboard with results showing how the model performed with respect to the intersection of evaluated factors
         */
        public Builder setIntersectionalResults(ResultsType intersectionalResults) {
            this.intersectionalResults = intersectionalResults;
            return this;
        }


        public QuantitativeAnalyses build() {
            return new QuantitativeAnalyses(unitaryResults, intersectionalResults);
        }

    }
}
