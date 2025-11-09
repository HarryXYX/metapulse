package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class Cost implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.annotation.Nonnull
    private CostType costType;
    @javax.annotation.Nonnull
    private CostValue costValue;

    public Cost() {
    }

    public Cost(CostType costType, CostValue costValue) {
        this.costType = costType;
        this.costValue = costValue;
    }

    /**
     * Type of Cost Code
     */
    public CostType getCostType() {
        return costType;
    }
    /**
     * Type of Cost Code
     */
    public void setCostType(CostType costType) {
        this.costType = costType;
    }

    /**
     * Code to which the Cost of this entity should be attributed to ie organizational cost ID
     */
    public CostValue getCostValue() {
        return costValue;
    }
    /**
     * Code to which the Cost of this entity should be attributed to ie organizational cost ID
     */
    public void setCostValue(CostValue costValue) {
        this.costValue = costValue;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (costType != null) {
            joiner.add("costType: " + costType);
        }
        if (costValue != null) {
            joiner.add("costValue: " + costValue);
        }
        return joiner.toString();
    }

    public static Cost.Builder builder() {
        return new Cost.Builder();
    }

    public static class Builder {

        private CostType costType;
        private CostValue costValue;

        public Builder() {
        }

        /**
         * Type of Cost Code
         */
        public Builder setCostType(CostType costType) {
            this.costType = costType;
            return this;
        }

        /**
         * Code to which the Cost of this entity should be attributed to ie organizational cost ID
         */
        public Builder setCostValue(CostValue costValue) {
            this.costValue = costValue;
            return this;
        }


        public Cost build() {
            return new Cost(costType, costValue);
        }

    }
}
