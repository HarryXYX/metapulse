package com.linkedin.datahub.graphql.generated;

import java.util.StringJoiner;

public class CaveatsAndRecommendations implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private CaveatDetails caveats;
    private String recommendations;
    private java.util.List<String> idealDatasetCharacteristics;

    public CaveatsAndRecommendations() {
    }

    public CaveatsAndRecommendations(CaveatDetails caveats, String recommendations, java.util.List<String> idealDatasetCharacteristics) {
        this.caveats = caveats;
        this.recommendations = recommendations;
        this.idealDatasetCharacteristics = idealDatasetCharacteristics;
    }

    /**
     * Caveats on using this MLModel
     */
    public CaveatDetails getCaveats() {
        return caveats;
    }
    /**
     * Caveats on using this MLModel
     */
    public void setCaveats(CaveatDetails caveats) {
        this.caveats = caveats;
    }

    /**
     * Recommendations on where this MLModel should be used
     */
    public String getRecommendations() {
        return recommendations;
    }
    /**
     * Recommendations on where this MLModel should be used
     */
    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }

    /**
     * Ideal characteristics of an evaluation dataset for this MLModel
     */
    public java.util.List<String> getIdealDatasetCharacteristics() {
        return idealDatasetCharacteristics;
    }
    /**
     * Ideal characteristics of an evaluation dataset for this MLModel
     */
    public void setIdealDatasetCharacteristics(java.util.List<String> idealDatasetCharacteristics) {
        this.idealDatasetCharacteristics = idealDatasetCharacteristics;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (caveats != null) {
            joiner.add("caveats: " + caveats);
        }
        if (recommendations != null) {
            joiner.add("recommendations: \"" + recommendations + "\"");
        }
        if (idealDatasetCharacteristics != null) {
            joiner.add("idealDatasetCharacteristics: " + idealDatasetCharacteristics);
        }
        return joiner.toString();
    }

    public static CaveatsAndRecommendations.Builder builder() {
        return new CaveatsAndRecommendations.Builder();
    }

    public static class Builder {

        private CaveatDetails caveats;
        private String recommendations;
        private java.util.List<String> idealDatasetCharacteristics;

        public Builder() {
        }

        /**
         * Caveats on using this MLModel
         */
        public Builder setCaveats(CaveatDetails caveats) {
            this.caveats = caveats;
            return this;
        }

        /**
         * Recommendations on where this MLModel should be used
         */
        public Builder setRecommendations(String recommendations) {
            this.recommendations = recommendations;
            return this;
        }

        /**
         * Ideal characteristics of an evaluation dataset for this MLModel
         */
        public Builder setIdealDatasetCharacteristics(java.util.List<String> idealDatasetCharacteristics) {
            this.idealDatasetCharacteristics = idealDatasetCharacteristics;
            return this;
        }


        public CaveatsAndRecommendations build() {
            return new CaveatsAndRecommendations(caveats, recommendations, idealDatasetCharacteristics);
        }

    }
}
