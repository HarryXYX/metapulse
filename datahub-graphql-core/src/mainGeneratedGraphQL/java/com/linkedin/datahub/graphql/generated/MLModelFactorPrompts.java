package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class MLModelFactorPrompts implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private java.util.List<MLModelFactors> relevantFactors;
    private java.util.List<MLModelFactors> evaluationFactors;

    public MLModelFactorPrompts() {
    }

    public MLModelFactorPrompts(java.util.List<MLModelFactors> relevantFactors, java.util.List<MLModelFactors> evaluationFactors) {
        this.relevantFactors = relevantFactors;
        this.evaluationFactors = evaluationFactors;
    }

    /**
     * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined
     */
    public java.util.List<MLModelFactors> getRelevantFactors() {
        return relevantFactors;
    }
    /**
     * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined
     */
    public void setRelevantFactors(java.util.List<MLModelFactors> relevantFactors) {
        this.relevantFactors = relevantFactors;
    }

    /**
     * Which factors are being reported, and why were these chosen
     */
    public java.util.List<MLModelFactors> getEvaluationFactors() {
        return evaluationFactors;
    }
    /**
     * Which factors are being reported, and why were these chosen
     */
    public void setEvaluationFactors(java.util.List<MLModelFactors> evaluationFactors) {
        this.evaluationFactors = evaluationFactors;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (relevantFactors != null) {
            joiner.add("relevantFactors: " + relevantFactors);
        }
        if (evaluationFactors != null) {
            joiner.add("evaluationFactors: " + evaluationFactors);
        }
        return joiner.toString();
    }

    public static MLModelFactorPrompts.Builder builder() {
        return new MLModelFactorPrompts.Builder();
    }

    public static class Builder {

        private java.util.List<MLModelFactors> relevantFactors;
        private java.util.List<MLModelFactors> evaluationFactors;

        public Builder() {
        }

        /**
         * What are foreseeable salient factors for which MLModel performance may vary, and how were these determined
         */
        public Builder setRelevantFactors(java.util.List<MLModelFactors> relevantFactors) {
            this.relevantFactors = relevantFactors;
            return this;
        }

        /**
         * Which factors are being reported, and why were these chosen
         */
        public Builder setEvaluationFactors(java.util.List<MLModelFactors> evaluationFactors) {
            this.evaluationFactors = evaluationFactors;
            return this;
        }


        public MLModelFactorPrompts build() {
            return new MLModelFactorPrompts(relevantFactors, evaluationFactors);
        }

    }
}
