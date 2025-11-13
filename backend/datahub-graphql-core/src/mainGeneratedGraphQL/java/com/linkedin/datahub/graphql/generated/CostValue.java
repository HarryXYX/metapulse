package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class CostValue implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Float costId;
    private String costCode;

    public CostValue() {
    }

    public CostValue(Float costId, String costCode) {
        this.costId = costId;
        this.costCode = costCode;
    }

    /**
     * Organizational Cost ID
     */
    public Float getCostId() {
        return costId;
    }
    /**
     * Organizational Cost ID
     */
    public void setCostId(Float costId) {
        this.costId = costId;
    }

    /**
     * Organizational Cost Code
     */
    public String getCostCode() {
        return costCode;
    }
    /**
     * Organizational Cost Code
     */
    public void setCostCode(String costCode) {
        this.costCode = costCode;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (costId != null) {
            joiner.add("costId: " + costId);
        }
        if (costCode != null) {
            joiner.add("costCode: \"" + costCode + "\"");
        }
        return joiner.toString();
    }

    public static CostValue.Builder builder() {
        return new CostValue.Builder();
    }

    public static class Builder {

        private Float costId;
        private String costCode;

        public Builder() {
        }

        /**
         * Organizational Cost ID
         */
        public Builder setCostId(Float costId) {
            this.costId = costId;
            return this;
        }

        /**
         * Organizational Cost Code
         */
        public Builder setCostCode(String costCode) {
            this.costCode = costCode;
            return this;
        }


        public CostValue build() {
            return new CostValue(costId, costCode);
        }

    }
}
